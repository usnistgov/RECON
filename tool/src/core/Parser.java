/* Parser for NIST Restricted English Grammar
 * 
 * @author Ed Barkmeyer, NIST, September, 2010
 *  revised Jul, 2011, v0.10 to add DomainForm
 *  revised Sep, 2011, v0.13 to move lexical ProperName recognition to ParseManager.makeTermTokens
 *  revised Sep, 2011, v0.15 to support ... that <subject> <verb> <particle term>.
 *  revised Sep, 2011, v0.16 to support local names
 *  revised Nov, 2011, v0.18 to support quantity values and Number changes
 *  revised Nov, 2012, v0.21 to support pronouns
 *  revised Mar, 2013, v0.22 to implement 'where' as a qualifier for "themes"
 *  revised Apr, 2013, v0.23 to support revised Implication forms, ANY for no quantifier
 *  revised May/June 2013, v0.24 to support revised DomainForm, modality, negation
 *  revised July 2013, v0.25 to repair Unit bug in Number instances
 */
package core;

import NBVR.Grammar.*;
import NBVR.Vocabulary.*;
import NBVR.Vocabulary.impl.TermUse;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class Parser {

	public static final GrammarFactory theGrammar = GrammarFactory.eINSTANCE;
	private static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	
	/* the box that contains most of the Grammar objects */
	public static Formulation theParse;
	
	private static Token current;	/* the current token in the parse */
	private static Token progress;/* the farthest token reached */
	private static LocalName localNames;	/* the active local names */

	/* complex keyword sequences */
	private static final KeywordKind iffseq[] = {
		KeywordKind.KIF, KeywordKind.KAND, KeywordKind.KONLY, KeywordKind.KIF
	};
	private static final KeywordKind onlyifseq[] = {
		KeywordKind.KONLY, KeywordKind.KIF
	};
	private static final KeywordKind morethanseq[] = {
		KeywordKind.KMORE, KeywordKind.KTHAN
	};
	private static final KeywordKind lessthanseq[] = {
		KeywordKind.KLESS, KeywordKind.KTHAN
	};
	private static final KeywordKind atleastseq[] = {
		KeywordKind.KAT, KeywordKind.KLEAST
	};
	private static final KeywordKind atmostseq[] = {
		KeywordKind.KAT, KeywordKind.KMOST
	};
	private static final KeywordKind ormoreseq[] = {
		KeywordKind.KOR, KeywordKind.KMORE
	};
	private static final KeywordKind orlessseq[] = {
		KeywordKind.KOR, KeywordKind.KLESS
	};
	private static final KeywordKind butnotseq[] = {
		KeywordKind.KBUT, KeywordKind.KNOT
	};
	private static final KeywordKind insteadofseq[] = {
		KeywordKind.KINSTEAD, KeywordKind.KOF
	};
	private static final KeywordKind howmanyseq[] = {
		KeywordKind.KHOW, KeywordKind.KMANY
	};
	
	/** init(stream, formulation)
	 * Initialize the parse process for the given stream
	 * @param stream = the Token that is the base of the stream
	 * @param formulation = the Formulation object that is to own the parse elements
	 */
	public static void init(Token stream, Formulation formulation)
	{
		current = stream.next;
		progress = current;
		/* make the formulation the box for the Parse elements */
		theParse = formulation;
		localNames = null;
	}
	
	/** parseNounPhrase()
	 * parse a noun phrase from the current Token in the token stream
	 * grammar:
	 * nounPhrase = simpleNounPhrase | groupPhrase | queryPhrase
	 * bothPhrase = "both" simpleNounPhrase 
	 * 		( "," simpleNounPhrase )* "and" simpleNounPhrase
	 * groupPhrase = "together" simpleNounPhrase
	 * 		( "," simpleNounPhrase )* "and" simpleNounPhrase
	 * simpleNounPhrase = typeNoun | propertyNoun | roleNoun | pronoun | instance
	 * typeNoun = [ modifier ] vocNoun [ qualifier ] 
	 * propertyNoun = [ modifier ] propertyPhrase
	 * propertyPhrase = vocProperty propertyLink simpleNounPhrase
	 * roleNoun = [ "the" ] ( vocNoun | role )
	 * 
	 * @return the RolePhrase root of the parse, or null
	 */
	public static RolePhrase parseNounPhrase()
	{
		RolePhrase np;
		
		/* try for a group phrase starting with a keyword */
		np = parseGroupPhrase();
		if (np != null) return np;
		
		/* try for a simple noun phrase */
		np = parseSimpleNoun();
		if (np == null) return null;
		
		/* a simple noun phrase may be the start of a 'but not' group */
		Token save = current;
		if (matchKeywords(butnotseq)|| matchKeywords(insteadofseq)) {
			RolePhrase bnp = parseSimpleNoun();
			if (bnp == null) {
				Error.queue("Expecting noun phrase after 'but not'/'instead of'");
				current = save;
				return np;
			}
			
			/* create the GroupPhrase structure */
			GroupPhrase gp = theGrammar.createGroupPhrase();
			theParse.addElement(gp);
			gp.setKind(GroupKind.INSTEAD);
			gp.getMembers().add((SimpleNounPhrase)np);
			np.setParent(gp);
			gp.getMembers().add((SimpleNounPhrase)bnp);
			bnp.setParent(gp);
			return gp;
		} else {
			return np;			
		}
	}

	/** parseGroupPhrase
	 * Parse complex noun phrases beginning Either, Both or Neither
	 * @return the GroupPhrase, or null
	 */
	private static RolePhrase parseGroupPhrase()
	{
		GroupPhrase result;
		GroupKind kind;
		SimpleNounPhrase np;
		Token save = current;
		Word word;
		boolean lastMember;

		/* find some keyword we recognize */
		word = current.getWord();
		if (word == null) return null;
		if (word.isKeyword(KeywordKind.KBOTH)) 
			kind = GroupKind.ALL;
		else if (word.isKeyword(KeywordKind.KEITHER))
			kind = GroupKind.CHOICE;
		else if (word.isKeyword(KeywordKind.KNEITHER))
			kind = GroupKind.NEITHER;
		else
			return null;

		/* create the GroupPhrase structure */
		result = theGrammar.createGroupPhrase();
		theParse.addElement(result);
		result.setKind(kind);
		
		for (lastMember = false;;) {
			/* find a member noun phrase */
			current = moveCurrent();
			np = parseSimpleNoun();
			if (np == null) {
				Error.queue("Expecting noun phrase in group phrase, found " 
						+ current.toString());
				current = save;
				return null;
			}
			
			/* add it to the list */
			result.getMembers().add(np);
			np.setParent(result);
			
			/* are we done (did we see an AND/OR/NOR before this noun)? */
			if (lastMember) {
				/* check for 'A and B together' */
				if (kind == GroupKind.ALL && current.isKeyword(KeywordKind.KTOGETHER)) {
					kind = GroupKind.JOINT;
					current = moveCurrent();
				}
				return result;
			}
			
			/* otherwise look for a list continuation
			 * if we see the appropriate AND or OR, we are looking for the last member
			 */
			if (kind == GroupKind.CHOICE && current.isKeyword(KeywordKind.KOR)) {
				lastMember = true;
			} else if (kind == GroupKind.NEITHER && current.isKeyword(KeywordKind.KNOR)) {
				lastMember = true;
			} else if (current.isKeyword(KeywordKind.KAND)) {
				lastMember = true;
			} else if (current.isSymbol(',')) {
				/* comma is intermediate member marker, just go on */
			} else {
				Error.queue("Expecting AND/OR/NOR in group phrase, found " + current.toString());
				current = save;
				return null;
			}
		}
	}

	/** parseSimpleNoun
	 * routine to recognize a "simple" noun phrase in all its glory
	 * Grammar:
	 * simpleNounPhrase = typeNoun | propertyNoun | roleNoun | pronoun | instance
	 * typeNoun = [ modifiers ] vocNoun [ ':' localName ] [ qualifier ] 
	 * propertyNoun = [ modifiers ] propertyPhrase
	 * propertyPhrase = vocProperty particle simpleNounPhrase
	 * roleNoun = [ "the" ] role
	 * modifiers = ( quantifier | adjective ) adjective*
	 * 
	 * @return the simple noun phrase found or null
	 */
	private static SimpleNounPhrase parseSimpleNoun()
	{
		Token save = current;
		TermToken ttcurrent;
		LocalName lname;

		/* check for a quantified pronoun */
		TypeNoun type = parseQPronoun();
		if (type != null) return type;
		
		/* if no quantified pronoun, parse any quantifier */
		Quantifier q = parseQuantifier();

		/* check for a pronoun 
		 * Note:  the referents of pronouns are not set at this time,
		 * because they are determined from context (by Rewrite) */
		if (current.isKeyword(KeywordKind.PRONOUN) 
		 || current.isKeyword(KeywordKind.KSELF)) {
			Pronoun pro = theGrammar.createPronoun();
			theParse.addElement(pro);
			pro.setKeyword((Keyword)current.getWord());
			pro.setQuantifier(q);
			if (q != null) q.setParent(pro);
			current = moveCurrent();
			return pro;
			
		} else if (current.isKeyword(KeywordKind.GENITIVE)) {
			/* parse possessive pronoun followed by VocProperty */
			Pronoun pro = theGrammar.createPronoun();
			theParse.addElement(pro);
			pro.setKeyword((Keyword)current.getWord());
			current = moveCurrent();
			if (current.kind == TokenKind.TERM
			 && ((TermToken)current).termkind == TermToken.PROPERTY) {
				ttcurrent = (TermToken)current;
				PropertyNoun property = theGrammar.createPropertyNoun();
				theParse.addElement(property);
				property.setProperty((VocProperty)ttcurrent.referent);
				property.setQuantifier(q);
				if (q != null) q.setParent(pro);
				property.setModifiers(parseModifiers(q));
				property.setDomain(pro);
				pro.setParent(property);
				pro.setRolePlayed(property.getProperty().getDomainRole());
				ttcurrent.parse = property;
				current = moveCurrent();
				return property;
			} else {
				Error.queue("Genitive pronoun '" + pro.getKeyword().toString()
						+ "' is not followed by Property term");
				current = save;
				return null;
			}
		}
		
		/* look for a sequence of adjectives */
		List<Modifier> modifiers = parseModifiers(q);
		
		/* now find the noun */
		if (current.kind != TokenKind.TERM) {
			/* no Term match, there should be no modifiers */
			if (modifiers != null) {
				Error.queue("Adjectives must not precede '" + current.toString() + "'");
				current = save;
				return null;
			}
			/* check for a local name */
			LocalName nameref = findLocalName(current.getWord());
			if (nameref != null) {
				lname = theGrammar.createLocalName();
				theParse.addElement(lname);
				lname.setWord(current.getWord());
				lname.setReferent(nameref.getReferent());
				current = moveCurrent();
				return lname;
			} else {
				/* try to parse an instance */
				current = save;
				return parseInstance();
			}
		}

		/* this is the interesting term */
		ttcurrent = (TermToken)current;
		current = moveCurrent();
		
		switch (ttcurrent.termkind) {
		case TermToken.PROPERTY:
			/* check for a local name declaration */
			lname = parseLocalName(ttcurrent);
			/* if it is a local name, and it is a reference, just return it */
			if (lname != null && lname.getReferent() != null) {
				ttcurrent.parse = lname;
				return lname;
			}
			/* if it is a declaration,  we will complete it below */

			/* match the property structure */
			PropertyNoun property = parseProperty(ttcurrent);
			if (property != null) {
				/* property structure matches */
				property.setQuantifier(q);
				if (q != null) q.setParent(property);
				property.setModifiers(modifiers);
				/* record the PropertyNoun as the parse of the term */
				ttcurrent.parse = property;
				/* if it has a local name, record the PropertyNoun as the referent */
				if (lname != null) lname.setReferent(property);
				return property;

			} else if (modifiers == null && q != null && q.getKind() == QuantifierKind.QTHE) {
				/* the structure is exactly 'the <property>' */
				/* if the term has a previous use, then this refers to it */
				PropertyNoun prevProp = (PropertyNoun)findPreviousUse(ttcurrent);
				if (prevProp != null) {
					property = theGrammar.createPropertyNoun();
					theParse.addElement(property);
					property.setProperty((VocProperty)ttcurrent.referent);
					property.setDomain(null);
					property.setModifiers(null);
					property.setQuantifier(q);
					/* if the previous usage was also a back reference, copy the reference */
					if (prevProp.getReferent() != null)
						prevProp = (PropertyNoun)prevProp.getReferent();
					property.setReferent(prevProp);
					ttcurrent.parse = property; /* record the propertyNoun as the parse */
					return property;
				} else {
					/* there is no previous use for this to refer to */
					current = save;
					return null;
				}
			} else {
				/* TODO: deal with property as a pseudo-noun */
				current = save;
				return null;
			}
			
		case TermToken.ROLE:
			/* it is a role name unless it has modifiers or a real quantifier */
			if (modifiers != null) {
				Error.queue("Adjectives not permitted before Role " 
						+ ttcurrent.term.toString());
			} else if (q == null || q.getKind() == QuantifierKind.QAN
						 || q.getKind() == QuantifierKind.QTHE) {
				RoleNoun role = theGrammar.createRoleNoun();
				theParse.addElement(role);
				role.setRole((VerbRole)ttcurrent.referent);
				return role;
			} else {
				Error.queue("Quantifiers not permitted on Role " 
						+ ttcurrent.term.toString());
			}
			/* try something else */
			current = save;
			return null;
			
		case TermToken.NOUN:
			/* check for a local name declaration */
			lname = parseLocalName(ttcurrent);
			/* if it is a local name, and it is a reference, just return it */
			if (lname != null && lname.getReferent() != null) {
				ttcurrent.parse = lname;
				return lname;
			}
			/* if it is a declaration,  we will complete it below */

			/* it is a vocabulary Noun, create the entry */
			type = theGrammar.createTypeNoun();
			theParse.addElement(type);
			type.setQuantifier(q);
			if (q != null) q.setParent(type);
			type.setModifiers(modifiers);
			type.setNoun((VocNoun)ttcurrent.referent);
			/* record the TypeNoun as the parse of the term */
			ttcurrent.parse = type;
			/* if it has a local name, record the TypeNoun as the referent */
			if (lname != null) lname.setReferent(type);

			/* now find any qualifiers */
			parseQualifiers(type);
			
			/* now check for a back reference */
			if (type.getQualifiers().isEmpty() && modifiers == null
			 && q != null && q.getKind() == QuantifierKind.QTHE) {
				/* the structure is exactly 'the <noun>' */
				/* if the term has a previous use, then this refers to it
				 * if the previous use refers to an earlier one, then this refers to that
				 */
				TypeNoun prevNoun = (TypeNoun)findPreviousUse(ttcurrent);
				if (prevNoun != null) {
					while (prevNoun.getReferent() != null)
						prevNoun = (TypeNoun)prevNoun.getReferent();
					type.setReferent(prevNoun);
				} else {
					Error.queue("'the " + ttcurrent.toString() 
							+ "' does not refer to a previous instance");
					current = save;
					return null;
				}
			}
			return type;
			
		case TermToken.PROPERNAME:
			/* it is a Proper Name, create the entry */
			if (modifiers != null || q != null && q.getKind() != QuantifierKind.QTHE) {
				RECONManager.errorlog.println("*** ProperName '" + ttcurrent.toString()
						+ "' should not have qualifiers");
			}
					
			ProperName name = theGrammar.createProperName();
			theParse.addElement(name);
			name.setName((VocName)ttcurrent.referent);
			return name;
			
			
		default:
			/* wrong kind of term -- try to parse an instance */
			current = save;
			return parseInstance();
		}
	}

	/** parseQPronoun
	 * find a quantified pronoun (any/every/some/no-thing), possibly followed by a qualifier
	 * at the current Token position
	 */
	private static TypeNoun parseQPronoun()
	{
		/* check for a quantified pronoun */
		QuantifierKind qk;
		if (current.isKeyword(KeywordKind.KEVERYTHING)) {
			qk = QuantifierKind.QALL;
		} else if (current.isKeyword(KeywordKind.KANYTHING)) {
			qk = QuantifierKind.QANY;			
		} else if (current.isKeyword(KeywordKind.KSOMETHING)) {
			qk = QuantifierKind.QAN;			
		} else if (current.isKeyword(KeywordKind.KNOTHING)) {
			qk = QuantifierKind.QNO;			
		} else {
			return null;
		}

		/* create the quantifier */
		Quantifier q = theGrammar.createQuantifier();
		theParse.addElement(q);
		q.setKind(qk);
		
		/* now create the quantified noun 'thing' */
		TypeNoun type = theGrammar.createTypeNoun();
		theParse.addElement(type);
		type.setQuantifier(q);
		q.setParent(type);
		type.setModifiers(null);
		type.setNoun(VocBase.vocThing);

		/* now find any qualifiers */
		current = moveCurrent();
		parseQualifiers(type);
		return type;
	}
	
	/** parseQuantifier
	 * find a quantifier at the current Token position
	 * Grammar:
	 *  quantifier = article | quantification | quantity
	 *  article = "a" | "an" | "the" 
	 *  quantification = "every" | "no" | 
	 *	  ( "any" | "some" | "each" | "all" | "none" ) [ "of" [ "the" ] ]
	 *  quantity = ( prebound | postbound ) [ "of" [ "the" ] ]
	 *  prebound = ( "at" "least" | "at" "most" | "exactly" | "only" 
	 *	  | [ "no" ] ( "more" | "less" | "fewer" ) "than" ) quantityValue
	 *  postbound = quantityValue [ "or" ( "more" | "less" | "fewer" ) ]
	 * 
	 * @return the quantifier or null
	 */
	private static Quantifier parseQuantifier()
	{
		Quantifier q;
		QuantifierKind kind;
		
		/* if this isn't a word, it is not a quantifier */
		Word word = current.getWord();
		if (word == null) return null;
		
		/* first check for an article */
		if (word.isArticle()) {
			q = theGrammar.createQuantifier();
			theParse.addElement(q);
			if (word.isKeyword(KeywordKind.KTHE)) 
				q.setKind(QuantifierKind.QTHE);
			else
				q.setKind(QuantifierKind.QAN);
			/* move on */
			current = moveCurrent();
			return q;
		}
		
		/* now check for 'another' */
		if (word.isKeyword(KeywordKind.KANOTHER)) {
			q = theGrammar.createQuantifier();
			theParse.addElement(q);
			q.setKind(QuantifierKind.QAN);
			/* do not move on, allow the modifier collector to find 'another' */
			return q;
		}
		
		/* now look for each/all, some/any, none */
		kind = null;
		if (word.isKeyword(KeywordKind.KALL)) {
			/* KALL is all, each, every */
			kind = QuantifierKind.QALL;
		} else if (word.isKeyword(KeywordKind.KNONE)) {
			kind = QuantifierKind.QNO;
		} else if (word.isKeyword(KeywordKind.KANY)) {
			/* Any is some/an in antecedent, but all otherwise */
			kind = QuantifierKind.QANY;
		}
		/* if we have found a quantifier word, return the quantifier */
		if (kind != null) {
			q = theGrammar.createQuantifier();
			theParse.addElement(q);
			q.setKind(kind);
			current = moveCurrent();
			skipOfThe();
			return q;
		}

		/* look for prebound and postbound quantity values */
		Token save = current; // recover from the start

		/* look for no, exactly, at least, at most, less than, more than */
		if (word.isKeyword(KeywordKind.KNO)) {
			/* look for extended quantifier terms */
			current = moveCurrent();
			save = current;  // recovery is to the token after "no"
			if (matchKeywords(morethanseq)) {
				/* "no more than" is at-most-n */
				kind = QuantifierKind.AT_MOST_N;
			} else if (matchKeywords(lessthanseq)) {
				/* "no less than" is at-least-n */
				kind = QuantifierKind.AT_LEAST_N;
			} else {
				/* this is just "no" [ n ] */
				kind = QuantifierKind.QNO;
			}
		} else if (word.isKeyword(KeywordKind.KEXACTLY)) {
			kind = QuantifierKind.EXACTLY_N;
			current = moveCurrent();
		} else if (word.isKeyword(KeywordKind.KONLY)) {
			kind = QuantifierKind.AT_MOST_N;
			current = moveCurrent();
		} else if (matchKeywords(atleastseq)) {
			kind = QuantifierKind.AT_LEAST_N;
		} else if (matchKeywords(atmostseq)) {
			kind = QuantifierKind.AT_MOST_N;
		} else if (matchKeywords(morethanseq)) {
			kind = QuantifierKind.MORE_THAN_N;
		} else if (matchKeywords(lessthanseq)) {
			kind = QuantifierKind.LESS_THAN_N;
		}
				
		/* look for a quantity value */
		Quantity qvalue = parseQuantityValue();
		if (qvalue == null) {
			/* no quantity value, no quantifier */
			current = save;
			if (kind == QuantifierKind.QNO) {
				/* the quantifier was just 'no' */
				q = theGrammar.createQuantifier();
				theParse.addElement(q);
				q.setKind(kind);
				return q;
			} else if (kind != null) {
				/* we have some quantifier words, so a value was required */
				Error.queue("Expecting quantity value in quantification, found "
					+ current.toString());
				return null;
			} else {
				/* there is no quantifier at all */
				return null;
			}
		}
		
		/* we have a quantifier */
		q = theGrammar.createQuantifier();
		theParse.addElement(q);
		q.setQuantity(qvalue);
		/* set the integer 'count' value, or zero */
		q.setCount(qvalue.getFactor().getValue());
		
		/* the recovery point is now past the quantity value */
		save = current;	
		
		/* if we don't have a kind, the number is a valid quantifier,
		 * but there may be 'or more' or 'or less' */
		if (kind == null) {
			if (matchKeywords(ormoreseq)) {
				kind = QuantifierKind.AT_LEAST_N;
			} else if (matchKeywords(orlessseq)) {
				kind = QuantifierKind.AT_MOST_N;
			} else { /* no further keywords, so "exactly" */
				current = save;
				kind = QuantifierKind.EXACTLY_N;
			}
		}

		/* Turn no n of x into less than n of x */
		if (kind == QuantifierKind.QNO) 
			kind = QuantifierKind.LESS_THAN_N;
		
		/* Fix quantities of 1 */
		if (kind == QuantifierKind.MORE_THAN_N) {
			/* more than 1 is always a quantity */
		} else if (kind == QuantifierKind.LESS_THAN_N) {
			/* less than n is a quantity, unless n = 1 or n = 2 */
			if (qvalue.getDimension().isEmpty()) {
				if (q.getCount() == 2) {
					/* less than 2 is 'at most 1' */
					kind = QuantifierKind.AT_MOST1;
					q.setQuantity(null);
				} else if (q.getCount() == 1) {
					/* less than 1 is 'no' */
					kind = QuantifierKind.QNO;
					q.setQuantity(null);
				}
			}
		} else if (qvalue.getDimension().isEmpty() && q.getCount() == 1) {
			/* simplify the quantifier */
			if (kind == QuantifierKind.EXACTLY_N)
				kind = QuantifierKind.EXACTLY1;
			else if (kind == QuantifierKind.AT_LEAST_N)
				kind = QuantifierKind.AT_LEAST1;
			else if (kind == QuantifierKind.AT_MOST_N)
				kind = QuantifierKind.AT_MOST1;
		}
		
		/* we finally have a kind */
		q.setKind(kind);
		skipOfThe();
		return q;
	}

	/** skipOfThe
	 *  skips any "of the" following a quantifier
	 */
	private static void skipOfThe()
	{
		/* now look for "of" [ "the" ] and skip them */
		if (current.isKeyword(KeywordKind.KOF)) {
			/* found "of", move on */
			current = moveCurrent();
			if (current.isKeyword(KeywordKind.KTHE)) {
				/* found "the", move on */
				current = moveCurrent();
			}
		}
	}

	/** parseModifiers
	 * find zero or more modifiers at the current Token position
	 * @return a List of the modifiers (adjectives) found or null
	 */
	private static List<Modifier> parseModifiers(Quantifier q)
	{
		List<Modifier> mlist = null;
		Modifier mod = null;
		TermToken tt;
		
		if (current.isKeyword(KeywordKind.KOTHER)
		 || current.isKeyword(KeywordKind.KANOTHER)) {
			mod = theGrammar.createModifier();
			theParse.addElement(mod);
			mod.setKind(KeywordKind.KOTHER);
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KSAME)) {
			if (q != null && q.getKind() == QuantifierKind.QTHE) {
				mod = theGrammar.createModifier();
				theParse.addElement(mod);
				mod.setKind(KeywordKind.KSAME);
				current = moveCurrent();
			} else {
				Error.queue("Keyword 'same' is not preceded by 'the'.");
			}
		} else if (current.isKeyword(KeywordKind.KDIFFERENT)) {
			mod = theGrammar.createModifier();
			theParse.addElement(mod);
			if (q != null && q.getKind() == QuantifierKind.QAN) {
				/* "a different" means "another" */
				mod.setKind(KeywordKind.KOTHER);
			} else {
				/* "different" means "distinct" */
				mod.setKind(KeywordKind.KDIFFERENT);
			}
			current = moveCurrent();
		}
		/* if we recognized a special modifer, add it to the list */
		if (mod != null) {
			mlist = new LinkedList<Modifier>();
			mlist.add(mod);
		}
		
		/* now collect any adjectives */
		for (;;) {
			/* if the next token is not an adjective, return */
			if (current.kind != TokenKind.TERM) return mlist;
			tt = (TermToken)current;
			if (tt.termkind != TermToken.ADJECTIVE) return mlist;
			
			/* add a modifier to the list */
			if (mlist == null) mlist = new LinkedList<Modifier>();
			mod = theGrammar.createModifier();
			theParse.addElement(mod);
			mod.setKind(null);
			mod.setAdjective((VocAdjective)tt.referent);
			mlist.add(mod);
			current = moveCurrent();
		}
	
	}
	
	/** parseProperty(match)
	 *  Given a match on the property term, parse a propertyNoun structure 
	 *    propertyPhrase = vocProperty particle simpleNounPhrase
	 * @param match = the TermToken for the property term
	 * @return the Property Noun or null
	 */
	private static PropertyNoun parseProperty(TermToken match)
	{
		Token save = current;
		
		/* match the Particle term
		 * it is the second element of the property form */
		SyntaxForm form = ((VocProperty)match.referent).findPropertyForm(match.term);
		Particle particle = (Particle)form.getElements().get(1);
		if (matchParticle(particle.getTerm()) == null) {
			Error.queue("No match on preposition '" + particle.getTerm().getText() 
					+ "' after property '" + match.term.toString() + "'");
			current = save;
			return null;
		}
		
		/* now parse the domain */
		SimpleNounPhrase domain = parseSimpleNoun();
		if (domain == null) {
			Error.queue("Cannot parse domain phrase for property '" 
					+ match.term.toString() + "'");
			current = save;
			return null;
		}
				
		/* it is a valid property structure, create the entry */
		PropertyNoun property = theGrammar.createPropertyNoun();
		theParse.addElement(property);
		property.setProperty((VocProperty)match.referent);
		property.setDomain(domain);
		domain.setRolePlayed(particle.getRole().getRole());
		domain.setParent(property);
		return property;
	}

	/** parseLocalName
	 * parse an optional local name (: name or : number) following a type or property term
	 * it denotes the same individual within the scope of the parse
	 * @param term = the type or property that is the referent of the local name
	 */
	private static LocalName parseLocalName(TermToken token)
	{
		/* local name declarations begin with : */
		if (! current.isSymbol(':')) return null;

		Token save = current;
		LocalName lname;
		
		current = moveCurrent();
		if (current.getKind() == TokenKind.NAME) {
			/* name form of local name: a single word that is the name */
			lname = findLocalName(current.getWord());
			if (lname != null) {
				Error.queue("conflicting declaration of local name: " + current.toString());
				current = save;
				return null;
			}
			lname = makeLocalName(current.getWord(), null);
			current = moveCurrent();
			return lname;
			
		} else if (current.getKind() == TokenKind.NUMBER) {
			/* number form of local name, the name is 'term : number' */
			/* construct the local name, and make a Name (Word) for it */
			StringBuffer namebuf = new StringBuffer(token.term.getText().length() 
					+ current.toString().length() + 1);
			namebuf.append(token.term.getText());
			namebuf.append(':');
			namebuf.append(current.toString());
			WordForm wf = theVocFactory.makeWordForm(namebuf.toString());
			Word nameword = wf.getWord();
			if (nameword == null) nameword = theVocFactory.createName(wf);

			/* was this name previously declared? */
			lname = findLocalName(nameword);
			current = moveCurrent();
			return makeLocalName(nameword, lname);			
			
		} else {
			Error.queue("found '" + current.toString() 
					+ "' expecting local name after colon");
			current = save;
			return null;
		}
	}

	/** findLocalName(token)
	 * 
	 * @param token = the token whose Word is to be matched to a LocalName
	 * @return the matching LocalName or null, if none
	 */
	private static LocalName findLocalName(Word word)
	{
		LocalName lname;
		for (lname = localNames; lname != null; lname = lname.getNext()) {
			if (lname.getWord() == word) return lname;
		}
		return null;
	}

	/** makeLocalName(Word)
	 *   create a new LocalName,
	 *   add it to the localNames list if it is not a reference
	 *   add it to the parse structure if it is a reference
	 *   
	 * @param word = the Word that is the name of the LocalName object
	 * @param ref = the declared LocalName it refers to
	 * @return the new LocalName 
	 */
	private static LocalName makeLocalName(Word word, LocalName ref)
	{
		LocalName lname = theGrammar.createLocalName();
		lname.setWord(word);
		if (ref == null) {
			/* no reference means this is a declaration
			 * on the localNames list, not part of the parse structure */
			lname.setReferent(null);
			lname.setNext(localNames);
			localNames = lname;
		} else {
			/* references become part of the parse structure
			 * they refer to whatever the declaration refers to */
			lname.setReferent(ref.getReferent());
			theParse.addElement(lname);
		}
		return lname;
	}
	
	/** parseQualifiers (TypeNoun)
	 * find zero or more qualifying phrases at the current Token position
	 * add them to the list for the passed TypeNoun
	 * Grammar:
	 *   qualifier = qualifierChain ( "and" qualifierChain )* 
	 *   qualifierChain = simpleQualifier ( "or" simpleQualifier )*
	 *   simpleQualifier = boundForm ("and" boundForm )* [ condition ]
	 *
	 *	Note: at the moment, the parse can only produce one Qualifier:
	 *  either a SimpleQualifier or a QualifierChain
	 *  But other activities can add Qualifiers to the list for the term
	 *  
	 * @param term the TypeNoun that is being qualified
	 */
	private static void parseQualifiers(TypeNoun term)
	{
		Qualifier q;

		/* get one qualifier */
		q = parseAnyQualifier(term);
		if (q == null) return;
		term.getQualifiers().add(q);
	}

	/** parseAnyQualifier
	 * find one qualifier, either a simple qualifier or a complex
	 * qualifier consisting of two or more ANDed simple qualifiers
	 * Grammar:
	 *   qualifier = qualifierChain ( "and" qualifierChain )* 
	 *   qualifierChain = simpleQualifier ( "or" simpleQualifier )*
	 * 
	 * @param term = the term that is being qualified
	 * @return the qualifier found (whichever kind), or null
	 */
	private static Qualifier parseAnyQualifier(TypeNoun term)
	{
		Qualifier qualifier;
		SimpleQualifier sq;
		Token save;
		
		/* get one qualifier, return null on failure */
		sq = parseSimpleQualifier(term);
		if (sq == null) return null;
		sq.setParent(term);
		qualifier = sq;
		
		/* now look for ORs */
		QualifierChain chain = null;
		while (current.isKeyword(KeywordKind.KOR)) {
			save = current;
			current = moveCurrent();
			sq = parseSimpleQualifier(term);
			if (sq == null) {	
				/* the OR is not ours 
				 * so this is end of the chain
				 */
				current = save;
				return qualifier;
			}
			/* we have another qualifier in the chain */
			if (chain == null) {
				/* we now have two ORed qualifiers, make a QualifierChain
				 * and add the first SimpleQualifier to it */
				chain = theGrammar.createQualifierChain();
				theParse.addElement(chain);
				chain.getQualifiers().add((SimpleQualifier)qualifier);
				/* now the BoundForm of the qualifier is the CompoundForm */
				qualifier = chain;
			}
			/* add the new bound form to the chain (disjunction) */
			chain.getQualifiers().add(sq);
			sq.setParent(term);
		}
		
		/* no more ORs, return what we collected */
		return qualifier;

	}
	
	/** parseSimpleQualifier
	 * find one simple qualifier or a compound qualifier 
	 * consisting of two or more ANDed simple qualifiers,
	 * possibly followed by a condition.
	 * 
	 * Grammar:
	 *   simpleQualifier = boundForm ("and" boundForm )* [ condition ]
	 * 
	 * @param term = the term that is being qualified
	 * @return the qualifier found (whichever kind), or null
	 */
	private static SimpleQualifier parseSimpleQualifier(TypeNoun term)
	{
		SimpleForm qform;
		Token save;
		
		/* get one qualifier, return null on failure */
		qform = parseBoundForm(term);
		if (qform == null) qform = parseSituationForm(term);
		if (qform == null) return null;

		/* create the Qualifier, and attach the BoundForm */
		SimpleQualifier qualifier = theGrammar.createSimpleQualifier();
		theParse.addElement(qualifier);
		qualifier.setParent(term);
		/* tentatively, assume the qualifier is simple */
		qualifier.setBoundForm(qform);
		qform.setParent(qualifier);
		
		/* now look for ANDs */
		CompoundForm cq = null;
		while (current.isKeyword(KeywordKind.KAND)) {
			save = current;
			current = moveCurrent();
			qform = parseBoundForm(term);
			if (qform == null) {	
				/* the AND is not ours */
				/* no condition begins with AND
				 * so this is end of the complex qualifier, 
				 */
				current = save;
				qualifier.setCondition(null);
				return qualifier;
			}
			/* we have another qualifier in the conjunction */
			if (cq == null) {
				/* we now have two ANDed qualifiers, make a compound form
				 * and add the first BoundForm to it */
				cq = theGrammar.createCompoundForm(Connective.AND);
				theParse.addElement(cq);
				cq.getStatements().add(qualifier.getBoundForm());
				qualifier.getBoundForm().setParent(cq);
				/* now the BoundForm of the qualifier is the CompoundForm */
				qualifier.setBoundForm(cq);
				cq.setParent(qualifier);
			}
			/* add the new bound form to the conjunction */
			cq.getStatements().add(qform);
			qform.setParent(cq);
		}
		
		/* no more ANDs, check for a conditional */
		Condition condition = parseCondition();
		qualifier.setCondition(condition);
		if (condition != null) condition.setParent(qualifier);
		return qualifier;
	}

	/** parseBoundForm (kind)
	 *  parse the sentence structure of one simple qualifier or extent question
	 *  A BoundForm is a SimpleForm in which one Anaphor or Interrogative Pronoun 
	 *  is substituted for one of the NounPhrases.  The grammatical structure
	 *  of the sentential form itself, however, is different.
	 *  
	 * Grammar:
	 *   boundSubjectForm = boundTerm verbPhrase [ object ] ( partPhrase )*
	 *   	Example:  (the person) who owns the ship
	 *   boundObjectForm = boundTerm subject verbPhrase ( partPhrase )*
	 *      Example:  (the ship) that the person owns
	 *   boundParticleForm = particle boundTerm subject verbPhrase [ object ]
	 *     ( partPhrase )*
	 * 		Example:  (the person) by whom the ship is owned
	 *   subject = nounPhrase
	 *   object = nounPhrase
	 *   partPhrase = particle nounPhrase
	 *   
	 * @param kind = QUALIFIER_FORM or QUESTION_FORM
	 * @param target = the TypeNoun that the anaphor refers to, null for query
	 * @return the SimpleForm for the Qualifier or Query parsed, or null
	 */
	private static SimpleForm parseBoundForm(TypeNoun target)
	{
		SimpleForm sentence; 
		VerbPhrase verb;
		RolePhrase subject;
		RolePhrase object;
		SyntaxForm form;
		
		Token save = current;
		String kindname = (target == null ? "query" : "qualifier");

		/* A bound subject or object form begins with a Bound or Interrogative Term */
		subject = parseBoundTerm(target);
		if (subject != null) {
			/* in a bound subject form, the verb is next */
			verb = parseVerbPhrase();
			if (verb != null) {
				/* we have a bound subject form */
				/* the referent of the current (verb) token is the syntax form used */
				/* test for proper context */
				if (! checkVerbContext(subject, (SyntaxForm)((TermToken)current).referent)) {
					current = save;
					return null;
				}
				/* create the simple form, with temporarily null object */
				sentence = makeSimpleForm(subject, verb, null);
				sentence.setParent(target);
				
				/* parse object and particles from the form at current.referent */
				if (! parseByForm(sentence)) {
					current = save;
					return null;
				}
				return sentence;

			} else {
				/* In a bound object form, the subject noun phrase is next */
				object = subject;
				subject = parseNounPhrase();
				if (subject == null) {
					/* this is not a valid sentence */
					Error.queue("Found '" + current.toString() 
							+ "' expecting subject or verb in " 
							+ kindname + " clause.");
					current = save;
					return null;
				}
				/* then the verb */
				verb = parseVerbPhrase();
				if (verb == null) {
					Error.queue("Found '" + current.toString()
							+ "' expecting verb in " + kindname + " clause.");
					current = save;
					return null;
				}
				
				/* we have a bound object form */
				/* create the simple form */
				sentence = makeSimpleForm(subject, verb, object);
				sentence.setParent(target);
				
				/* the referent of the current (verb) token is the syntax form used */
				/* parse object and particles from the form */
				if (! parseByForm(sentence)) {
					current = save;
					return null;
				}
				return sentence;
			}
		}
		
		/* we did not find a BoundTerm, look for a Particle */

		/* find all the particles that begin with the current word
		 * and match the token stream */
		Token list = ParseManager.findParticles(current);
		/* get the first/longest */
		TermToken term = (list == null ? null : list.getAlt());
		
		/* now find a particle in the list that is followed by a Bound Term
		 * in the token stream */
		do {
			if (term == null) {
				/* end of list, no match */
				current = save;
				return null;
			}
			/* set/record the current position as the end of the matched particle */
			current = moveCurrent(term.next());
			object = parseBoundTerm(target);
			if (object == null) term = term.getAlt();
		} while (object == null);
		
		/* at this point we have a Particle term followed by a Bound Term
		 * there may be more particles in the list that use the same term.
		 * We have to match one of them to the verb, which comes later.
		 */
		
		/* get the subject of the clause */
		subject = parseNounPhrase();
		if (subject == null) {
			Error.queue("Found '" + current.toString()
					+ "' expecting subject of " + kindname + " clause");
			current = save;
			return null;
		}
		
		/* get the verb for the clause */
		verb = parseVerbPhrase();
		if (verb == null) {
			Error.queue("Found '" + current.toString()
					+ "' expecting verb phrase in " + kindname + " clause");
			current = save;
			return null;
		}
		
		/* now find the match between the verb form and the particle term */
		// TODO: create Particle terms re-used by Verbs, rewrite match
		form = (SyntaxForm)((TermToken)current).referent;
		Particle particle = (Particle)term.referent;
		while (particle.getForm() != form) {
			if (term.altTerm == null || term.altTerm.termsize() != term.termsize()) {
				/* we have run out of particles that use the same term */
				Error.queue("Cannot match particle '" + term.toString()
						+ "' to verb '" + current.toString() + "'");
				current = save;
				return null;
			}
			term = term.altTerm;
			particle = (Particle)term.referent;
		}
		/* if we get here, we have the particle that is part of the verb */

		/* create the simple form, with temporarily null object */
		sentence = makeSimpleForm(subject, verb, null);
		
		/* make a partPhrase entry for the Bound Particle */
		PartPhrase part = theGrammar.createPartPhrase();
		sentence.getPartPhrases().add(part);
		part.setParticle(particle);
		part.setPartRole(object);
		object.setParent(sentence);
		/* mark the particle object as playing the corresponding role */
		assignRole(object, particle.getRole().getRole());
		
		/* the current token is the verb
		 * now process the syntax form to parse the rest of the SimpleQualifier */
		if (! parseByForm(sentence)) {
			current = save;
			return null;
		}

		return sentence;

	}

	/** parseBoundTerm(target)
	 * recognize a simple anaphor/interrogative pronoun in the stream: 
	 * 	that, who, who, whom, when, where, what, which
	 * a quantified version of one: all of whom, none of which,...
	 * or a property preceded by "whose"
	 * Grammar:
	 *   boundTerm =  anaphor |  boundProperty | boundQuantity
	 *   anaphor = ( "that" | "which" | "who" | "whom" ) [ "together" ]
	 *   
	 *   boundProperty = "whose" adjective* vocProperty
	 *   boundQuantity = quantification ( "which" | "whom" | boundProperty )
	 * 
	 * @param target = the referent of the anaphor term
	 * @return the Bound Term (anaphor or bound property)
	 */
	private static RolePhrase parseBoundTerm(TypeNoun target)
	{
		Token save = current;
		Pronoun aterm;

		/* If there is no target, the "bound" term is interrogative */
		if (target == null) return parseInterrogative();
		
		/* first test for 'that' */
		if (current.isKeyword(KeywordKind.KTHAT)) {
			aterm = makePronoun((Keyword)current.getWord(), target, null);
			current = moveCurrent();
			return aterm;
		}

		/* accept a leading quantifier */
		Quantifier q = parseQuantifier();
		
		/* Now test for anaphor pronouns: which, who, whom */
		if (current.isKeyword(KeywordKind.ANAPHOR)) {
			aterm = makePronoun((Keyword)current.getWord(), target, null);
			aterm.setQuantifier(q);
			if (q != null) q.setParent(aterm);
			current = moveCurrent();
			return aterm;
		}
		
		/* now look for a bound property, beginning whose */
		if (! current.isKeyword(KeywordKind.KWHOSE)) {
			/* no bound term */
			current = save;
			return null;
		}
		
		/* create the anaphor term for the owner */
		aterm = makePronoun((Keyword)current.getWord(), target, null);
		
		/* look for a sequence of adjectives */
		current = moveCurrent();
		List<Modifier> modifiers = parseModifiers(null);
		
		/* then a property */
		if (current.kind == TokenKind.TERM) {
			TermToken ttcurrent = (TermToken)current;
			if (ttcurrent.termkind == TermToken.PROPERTY) {
				PropertyNoun pterm = theGrammar.createPropertyNoun();
				theParse.addElement(pterm);
				pterm.setProperty((VocProperty)ttcurrent.referent);
				pterm.setQuantifier(q);
				if (q != null) q.setParent(pterm);
				pterm.setModifiers(modifiers);
				pterm.setDomain(aterm);
				aterm.setParent(pterm);
				aterm.setRolePlayed(pterm.getProperty().getDomainRole());
				ttcurrent.parse = pterm;
				current = moveCurrent();
				return pterm;
			}
		}
		
		/* the term after 'whose' is not a property */
		Error.queue("Found '" + current.toString() + "' expecting property after 'whose'");
		current = save;
		return null;
	}

	/** parseSituationForm(TypeNoun)
	 * parse a situation qualifier of the form:  where BasicForm
	 * @param term = the kind of situation being described
	 * @return a SimpleForm of the form:  term hasTheme nominalization of BasicForm 
	 */
	private static SimpleForm parseSituationForm(TypeNoun term)
	{
		Token save = current;
		Sentence sentence;
		
		/* A situationForm must begin with the keyword Where */
		if (! current.isKeyword(KeywordKind.KWHERE)) return null;
		
		/* now parse the descriptive sentence */
		current = moveCurrent();
		sentence = parseBasicForm();
		if (sentence == null) {
			Error.queue("Could not parse the sentential form after 'where')");
			current = save;
			return null;
		}
		
		/* we have where <sentence> 
		 * create a Statement to nominalize the sentence */
		Statement s = theGrammar.createStatement();
		theParse.addElement(s);
		s.setSentence(sentence);
		sentence.setParent(s);
		
		/* now we will create the qualifier 'that hasTheme <sentence> */
		return makeSimpleForm(
				makePronoun(VocKey.thatWord, term, VocBase.vocHasTheme.getRoles().get(0)), 
				makeVerbPhrase(VocBase.vocHasTheme), s);
	}
	
	/** parseInterrogative()
	 * parses the Token stream from the current token as an interrogative term
	 * grammar:
	 *   interrogative = queryTerm, [ adjectiveModifier ], ( typeQuery | propertyQuery ) ;
	 *   queryTerm =  "what" | "which of" [ "the" ] |
	 *   		"how much", [ "of" [ "the" ] ] | "how many", [ "of" [ "the" ] ] ;
	 *   typeQuery = localNoun, [ qualifier ] ;
	 *   propertyQuery = propertyPhrase | genitive, localProperty ;
	 * Note: the interrogative is just a SimpleNounPhrase in which the queryTerm 
	 * has been substituted for the Quantifier.  
	 * The parser generalizes the SimpleNounPhrase to RolePhrase, 
	 * to allow interrogatives to apply to Groups
	 *   
	 * @return the QueryPhrase
	 */
	private static QueryPhrase parseInterrogative()
	{
		QueryKind qkind;
		Token save = current;
		
		/* A QueryPhrase begins with WHAT, WHICH OF, or HOW MANY/MUCH */
		if (current.isKeyword(KeywordKind.KWHAT)) {
			qkind = QueryKind.WHAT;
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KWHICH)) {
			qkind = QueryKind.WHAT;
			current = moveCurrent();
			skipOfThe();
		} else if (matchKeywords(howmanyseq)) {
			qkind = QueryKind.HOW_MANY;
			skipOfThe();
		} else {
			current = save;
			return null;
		}

		/* found a queryTerm, look for the rolePhrase it modifies */
		RolePhrase rp = parseNounPhrase();
		if (rp == null) {
			Error.queue("Invalid noun phrase following " + save.toString());
			current = save;
			return null;
		} else if (rp.getType() == PhraseType.TYPE_NOUN || rp.getType() == PhraseType.PROPERTY) {
			if (((ModifiedTerm)rp).getQuantifier() != null) {
				Error.queue("Quantifier " + 
			      ((ModifiedTerm)rp).getQuantifier().getKind().toString() +
			      "ignored in query phrase beginning " + save.toString());
				((ModifiedTerm)rp).setQuantifier(null);
			}
		}
		
		/* make a QueryPhrase object */
		QueryPhrase qp = theGrammar.createQueryPhrase();
		theParse.addElement(qp);
		qp.setQuery(qkind);
		qp.setDomain(rp);
		rp.setParent(qp);
		
		return qp;
	}
	
	/** parseCondition()
	 *  parses a Condition on a Qualifier
	 *  Example:
	 *    a Package that is CategoryF if it is carried on a ship
	 *      or if it is carried on an international air flight
	 *      or that is FreightClass2 if it is carried by rail
	 *    Each of the 'if it is carried ...' clauses is a SimpleCondition
	 *    and the 'or if...' makes the first two a compound condition
	 * 
	 * Grammar:
	 *   condition = complexCondition ( "or" complexCondition )* | "otherwise"
	 *   complexCondition = simpleCondition ( "and" simpleCondition )*
	 *   simpleCondition = "if" simpleForm
	 *   
	 * @return the completed Condition object or null
	 */
	private static Condition parseCondition()
	{
		Condition condition;
		Sentence sub;
		CompoundForm orc;
		Token save;
		
		/* first, test for Otherwise */
		if (current.isKeyword(KeywordKind.KELSE)) {
			condition = theGrammar.createCondition();
			theParse.addElement(condition);
			condition.setOtherwise(true);
			return condition;
		}

		/* get one condition */
		sub = parseAnyCondition();
		if (sub == null) return null;
		
		/* create the condition */
		condition = theGrammar.createCondition();
		theParse.addElement(condition);
		condition.setOtherwise(false);
		condition.setAntecedent(sub);
		sub.setParent(condition);
				
		/* now look for others */
		orc = null;
		while (current.isKeyword(KeywordKind.KOR)) {
			save = current;
			current = moveCurrent();
			sub = parseAnyCondition();
			if (sub == null) {	
				/* the OR is not ours, end of list */
				current = save;
				return condition;
			}
			if (orc == null) {
				/* if we now have two conditions, create the OR */
				orc = theGrammar.createCompoundForm(Connective.OR);
				theParse.addElement(orc);
				orc.getStatements().add(condition.getAntecedent());
				condition.getAntecedent().setParent(orc);
				condition.setAntecedent(orc);
				orc.setParent(condition);
			}
			orc.getStatements().add(sub);
			sub.setParent(orc);
		}
		/* the current token is not OR, end of list */
		return condition;
	}

	/** parseAnyCondition
	 * find one condition, either a simple condition or a complex
	 * condition consisting of two or more ANDed simple conditions
	 * Grammar:
	 *   complexCondition = simpleCondition ("and" simpleCondition)* [ condition ]
	 * 
	 * @return the Sentence for the condition found (whichever kind), or null
	 */
	private static Sentence parseAnyCondition()
	{
		SimpleForm sc;
		Token save;
		
		/* get one condition */
		Sentence condition = parseSimpleCondition();
		if (condition == null) return null;
			
		/* now look for AND */
		CompoundForm cc = null;
		while (current.isKeyword(KeywordKind.KAND)) {
			save = current;
			current = moveCurrent();
			sc = parseSimpleCondition();
			if (sc == null) {	
				/* the AND is not ours */
				current = save;
				/* end of the complex condition, 
				 * any condition doesn't begin with AND
				 * return whatever we collected */
				return condition;
			}
			/* we have another condition in the conjunction */
			if (cc == null) {
				/* we now have two ANDed conditions, make a complex condition */
				cc = theGrammar.createCompoundForm(Connective.AND);
				theParse.addElement(cc);
				cc.getStatements().add(condition);
				condition.setParent(cc);
				condition = cc;
			}
			cc.getStatements().add(sc);
			sc.setParent(cc);
		}
		
		/* no more ANDs */
		return condition;
	}
	
	/** parseSimpleCondition()
	 * parses a simple condition on a qualifier
	 * Grammar:
	 *   simpleCondition = "if" simpleForm
	 *      
	 * @return the SimpleForm (antecedent) for the condition found or null
	 */
	private static SimpleForm parseSimpleCondition()
	{
		Token save = current;
		
		if (! current.isKeyword(KeywordKind.KIF)) return null;
		current = moveCurrent();
		
		SimpleForm antecedent = parseSimpleForm(null);
		if (antecedent == null) {
			Error.queue("Invalid condition statement following 'if'");
			current = save;
			return null;
		}
		
		return antecedent;
	}
	
	/** parseInstance
	 * parses a reference to a specific thing
	 * lexical instances are numbers, and strings
	 * proper names are sequences of unrecognized words
	 * nominalizations are propositions used as things
	 * extents are concepts and their extensions used as things
	 * 
	 * Grammar:
	 *  instance = lexicalInstance | properName | quantityValue 
	 *      | nominalization | intension
	 *  lexicalInstance = textString | number
	 *  properName = word*
	 *  nominalization = [ "this" ], ( statement | question )
	 *  statement = "that" sentence
	 *  question = ( "whether" | "why" | "how" ) basicForm | query
	 *  
	 * Because proper names are Terms/names, they are recognized in 
	 * parseSimpleNoun.  This routine handles the tokens that are not NAMEs.
	 *  
	 * @return the construct for the Instance object found
	 */
	private static Instance parseInstance()
	{
		TokenKind kind = current.getKind();
		/* if this is some obvious constant, make a Lexical Instance */
		if (kind == TokenKind.STRING || kind == TokenKind.DATETIME) {
			/* this is a simple lexical instance */
			LexicalInstance instance;
			instance = theGrammar.createLexicalInstance();
			theParse.addElement(instance);
			instance.setWord(current.getWord());
			current = moveCurrent();
			return instance;
		}
		
		/* look for a quantity value */
		Instance inx = parseQuantityValue();
		if (inx != null) return inx;
		
		/* look for a nominalized sentence: that ... */
		inx = parseStatement();
		if (inx != null) return inx;
		
		/* look for a question sentence: Whether, What ... */
		inx = parseQuestion();
		if (inx != null) return inx;
		
		/* no options left */
		Error.queue("Found '" + current.toString() 
				+ "' expecting a noun phrase");
		return null;			
	}

	/** parseQuantityValue()
	 * parses a quantity value consisting of a number and a unit expression
	 * 
	 * Grammar: 
	 *   quantityValue = number [ measurementUnit ]
	 *   measurementUnit = unitProduct [ ( "/" | "per" ) unitProduct ]
	 *   unitProduct = dimension ( "*" dimension )*
	 *   dimension = vocUnit [ "^" exponent ]
	 *   exponent = integer
	 *   
	 * @return the Quantity represented or null
	 */
	private static Quantity parseQuantityValue()
	{
		NumberWord number;
		
		/* every quantity value begins with a number, 
		 * or a word that represents a number, e.g. "one"
		 * TODO: support number words
		 */
		if (current.getKind() == TokenKind.NUMBER
		 || current.getKind() == TokenKind.DECIMAL) {
			number = (NumberWord)current.getWord();
		} else if (current.isKeyword(KeywordKind.KONE)) {
			number = VocKey.number1Word;
		} else {
			return null;
		}
		
		/* if we have a number, we have a Quantity */
		Quantity q = theGrammar.createQuantity();
		theParse.addElement(q);
		q.setFactor(number);
		
		/* look for a measurement unit */
		current = moveCurrent();	// move past the number
		Token save = current;
		VocUnit unit = parseUnit();
		boolean denominator = false; // the unit is in the numerator
		
		while (unit != null) {
		
			/* make a Dimension object for the unit */
			Dimension dim = theGrammar.createDimension();
			dim.setUnit(unit);
			q.getDimension().add(dim);
	
			/* look for an exponent */
			current = moveCurrent(); // move past the unit
			save = current;
			if (current.isSymbol('^')) {
				current = moveCurrent();
				if (current.getKind() != TokenKind.NUMBER
				 || ((NumberWord)current.getWord()).isDecimal()) {
					Error.queue("Found '" + current.toString() + 
							"' expecting integer after exponentiation (^)");
					current = save;
					return q;
				}
				dim.setExponent(current.getValue());
				current = moveCurrent(); // move past the exponent
			} else {
				dim.setExponent(1);
			}
			/* if this is part of the denominator, negate the exponent */
			if (denominator) dim.setExponent(- dim.getExponent());
			
			save = current; // this is a valid unit expression
		
			/* now look for a unitProduct, that is, * or / */
			if (current.isSymbol('*')) {
				current = moveCurrent();
				unit = parseUnit();
			} else if (current.isSymbol('/') || current.getWord() == VocKey.perWord) {
				if (denominator) {
					Error.queue("More than one / or per symbol in unit expression");
					unit = null;
				} else {
					denominator = true;
					current = moveCurrent();
					unit = parseUnit();
				}
			} else {
				/* end of the unit expression */
				unit = null;
			}
		}
		
		/* end of unit expression, return what we parsed */
		current = save;
		return q;
	}

	/** parseUnit()
	 * recognizes the current token as a measurement unit or not
	 * 
	 * @return the VocUnit or null
	 */
	private static VocUnit parseUnit()
	{
		/* a unit is a Term (token) */
		if (current.getKind() != TokenKind.TERM) return null;
		TermToken tt = (TermToken)current;
		/* it refers to a VocName */
		if (tt.termkind != TermToken.PROPERNAME) return null;
		/* and the VocName is a VocUnit */
		if (! ((VocName)tt.referent).isUnit()) return null;
		
		return (VocUnit)tt.referent;
	}
	
	/** parseStatement
	 * parses the Token stream from current as a Nominalization
	 * grammar:
	 *   nominalization = [ "this" ], ( statement | question )
	 *   statement = "that" sentence
	 *   question = ( "whether" | "why" | "how" ) basicForm | query
	 *   
	 * @return the Statement structure or null
	 */
	private static Instance parseStatement()
	{
		Token save = current;
		
		/* skip a leading "this" */
		if (current.isKeyword(KeywordKind.KTHIS)) current = moveCurrent();
		/* Note: 
		 * A previous noun followed by 'that' will parse it as a qualifier.
		 * 'this' serves only to force that parse to stop, so that the statement can 
		 * be recognized as a distinct role phrase.
		 */
		
		if (! current.isKeyword(KeywordKind.KTHAT)) {
			/* not a statement */
			current = save;
			return null;
		}
		
		/* now parse the nominalized sentence as the body of the Statement */
		current = moveCurrent();
		Sentence sentence = parseBasicForm();
		if (sentence == null) {
			Error.queue("Could not parse the sentential form after '" 
					+ save.toString() + ')');
			current = save;
			return null;
		}
		
		/* we have "that" <sentence> 
		 * create a Statement to be the Nominalization */
		Statement stmt = theGrammar.createStatement();
		theParse.addElement(stmt);
		stmt.setSentence(sentence);
		sentence.setParent(stmt);
		return stmt;
	}

	/** parseQuestion
	 * parses the Token stream from current as a Question
	 * grammar:
	 *   question = ( "whether" | "why" | "how" | "when" | "where" ), basicForm | query
	 *   Note: these uses of when and where are purely adverbial.
	 *   They do not fill roles in the verb form per se.
	 *   
	 * @return the Question structure or null
	 */
	private static Instance parseQuestion()
	{
		Token save = current;
		
		/* skip a leading "this" */
		if (current.isKeyword(KeywordKind.KTHIS)) current = moveCurrent();
		/* Note: 
		 * A previous noun followed by 'where' will parse as a qualifier.
		 * 'this' serves only to force that parse to stop, so that the question can 
		 * be recognized as a distinct role phrase.
		 */

		/* look for a question word */
		QueryKind qkind = null;
		if (current.isKeyword(KeywordKind.KWHETHER)) {
			qkind = QueryKind.WHETHER;
		} else if (current.isKeyword(KeywordKind.KWHY)) {
			qkind = QueryKind.WHY;
		} else if (current.isKeyword(KeywordKind.KWHEN)) {
			qkind = QueryKind.WHEN;
		} else if (current.isKeyword(KeywordKind.KWHERE)) {
			qkind = QueryKind.WHERE;
		} else if (current.isKeyword(KeywordKind.KHOW)
				&& ! moveCurrent().isKeyword(KeywordKind.KMANY)) {
			qkind = QueryKind.HOW;
		}
		
		/* if we did not recognize a question whose syntax uses a simpleForm,
		 * this still could be a Query */
		if (qkind == null) return parseQuery();

		/* now process the proposition the question is about */
		current = moveCurrent();		
		/* skip a leading doVerb */
		if (current.word == VocKey.doVerb) current = moveCurrent();

		Sentence sentence = parseBasicForm();
		if (sentence == null) {
			Error.queue("Could not parse the question after '" 
					+ save.toString() + ')');
			current = save;
			return null;
		}

		/* create the Question object */
		Question q = theGrammar.createQuestion();
		theParse.addElement(q);
		q.setQuery(qkind);
		q.setQueryPhrase(null);
		q.setSentence(sentence);
		sentence.setParent(q);
		return q;
	}

	/** parseQuery()
	 * parse an interrogative term in a BoundForm representing an Intension
	 * grammar:
	 * 	query = subjectQuery | objectQuery | partQuery ;
	 * 	subjectQuery = interrogative, verbPhrase, [ object ],{ partPhrase } ;
	 * 	objectQuery = interrogative, subject, verbPhrase, { partPhrase } ;
	 * 	partQuery = particle, interrogative, subject, verbPhrase, [ object ], { partPhrase } ;
	 * 	interrogative = queryTerm, [ adjectiveModifier ],( typeQuery | propertyQuery ) ;
	 * 	queryTerm =  "what" | "which of" | 
	 * 			"how much", [ "of" [ "the" ] ] | "how many", [ "of" [ "the" ] ] ;
	 *
	 * @return a Question or null
	 */
	private static Instance parseQuery()
	{
		Token save = current;
		
		SimpleForm qform = parseBoundForm(null);
		if (qform == null) return null;
		
		Question q = theGrammar.createQuestion();
		theParse.addElement(q);
		q.setSentence(qform);
		qform.setParent(q);
		
		/* find the interrogative term in the questionForm */
		qform.makeRolesArray();
		for (int i = 0; i < qform.getRoles().length; ++i) {
			if (qform.getRole(i).getType() == PhraseType.INTERROGATIVE) {
				q.setQueryPhrase((QueryPhrase)qform.getRole(i));
				q.setQuery(q.getQueryPhrase().getQuery());
				q.getQueryPhrase().setQuestion(q);
				return q;
			}
		}

		/* no find??? */
		Error.queue("Internal Error: QueryForm has no QueryPhrase role");
		current = save;		
		return null;
	}
	
	/** parseSentence()
	 * parses the Token stream as a NRE sentence
	 * Grammar
	 *   sentence = basicForm | impliedForm
	 *   impliedForm = equivalence | implication | reverse | converse | inverse
	 *   basicForm = andForm | disjunction
	 *   andForm = disjunction ("and" disjunction)*
	 *   disjunction = orForm | norForm | simpleForm
	 *   orForm = simpleForm ( "or" simpleForm )*
	 *   norForm = "neither" simpleForm "nor" simpleForm
	 *   
	 *   simpleForm = subject verbPhrase [ object ] partPhrase*
	 *   subject = nounPhrase
	 *   object = nounPhrase
	 *   partPhrase = particle nounPhrase
	 *   
	 *   equivalence = basicForm "if and only if" basicForm
	 *   implication = ( "if" | "when" ) basicForm [ "then" ] basicForm
	 *   	[ ( "else" | "otherwise" ) basicForm ]
	 *   reverse = basicForm "only" ( "if | "when" ) basicForm
	 *   converse = basicForm ( "if | "when" ) basicForm
	 *   inverse = basicForm ( "unless" | "until" ) basicForm
	 *   
	 * @return the parsed Sentence object or null
	 */
	public static Sentence parseSentence()
	{
		Token save = current;
		ImplicationForm implication;
		Sentence antecedent;
		Sentence consequent;
		Sentence alternative;
		Connective kind;
		
		if (current.isKeyword(KeywordKind.KIF))
			kind = Connective.IF;
		else if (current.isKeyword(KeywordKind.KUNLESS))
			kind = Connective.UNLESS;
		else 
			kind = null;
		if (kind != null) {
			/* IfForm:  
			 *   if basicForm [ then ] basicForm [ else basicForm ]
			 *   unless basicForm, sentence
			 */
			current = moveCurrent();
			antecedent = parseBasicForm();
			if (antecedent == null) {
				Error.queue("Invalid antecedent sentence structure following 'if/unless'");
				current = save;
				return null;
			}
			/* skip a comma and/or a "then" */
			if (current.isSymbol(',')) current = moveCurrent();
			if (current.isKeyword(KeywordKind.KTHEN)) current = moveCurrent();
			consequent = parseBasicForm();	
			if (consequent == null) {
				Error.queue("Invalid consequent sentence structure following 'if/unless'");
				current = save;
				return null;
			}

			/* choose the correct implication form */
			implication = theGrammar.createImplicationForm();
			implication.setKind(kind);
			theParse.addElement(implication);
			implication.setAntecedent(antecedent);
			implication.setDomain(antecedent.getDomain());
			antecedent.setParent(implication);
			implication.setConsequent(consequent);
			consequent.setParent(implication);
			
			/* If this is If/Then. Process the ELSE clause if any */
			/* skip a comma */
			if (current.isSymbol(',')) current = moveCurrent();
			if (kind == Connective.IF && current.isKeyword(KeywordKind.KELSE)) {
				/* if there is an "else" or "otherwise", parse the alternative */
				alternative = parseSentence();	
				if (alternative == null) {
					Error.queue("Invalid sentence structure following else/otherwise");
					current = save;
					return null;
				}
				implication.setAlternative(alternative);
				alternative.setParent(implication);
			} else {
				implication.setAlternative(null);
			}
			return implication;
		}
		
		/* any other statement is or begins with a BasicForm */
		antecedent = parseBasicForm();
		if (antecedent == null) {
			/* don't diagnose this, since we haven't recognized anything */
			current = save;
			return null;
		}
		
		/* skip any following comma */
		if (current.isSymbol(',')) current = moveCurrent();
		
		/* look for if and only if (before if) */
		if (matchKeywords(iffseq)) {
			/* A if and only if B [ iff C ... ] */
			CompoundForm eqv = theGrammar.createCompoundForm(Connective.EQV);
			theParse.addElement(eqv);
			eqv.getStatements().add(antecedent);
			antecedent.setParent(eqv);
			eqv.setDomain(antecedent.getDomain());
			do {
				antecedent = parseBasicForm();
				if (antecedent == null) {
					Error.queue("Invalid equivalent sentence structure following 'only if'");
					current = save;
					return null;
				}
				eqv.getStatements().add(antecedent);
				antecedent.setParent(eqv);
			} while (matchKeywords(iffseq));
			return eqv;
		}

		/* look for 'if', 'unless', and 'only if' */
		if (current.isKeyword(KeywordKind.KIF)) {
			kind = Connective.IF;
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KUNLESS)) {
			kind = Connective.UNLESS;
			current = moveCurrent();
		} else if (matchKeywords(onlyifseq)) {
			kind = Connective.ONLY_IF;
		} else {
			/* we matched a basic form, and nothing more */
			return antecedent;		
		}
		
		/* we have P if Q, interpreted: if Q, then P 
		 * or P unless Q, interpreted: unless Q,  P
		 * or P only if Q, interpreted: if P, then Q
		 * collect the Q sentence */
		consequent = parseBasicForm();
		if (consequent == null) {
			Error.queue("Invalid sentence structure following if, only if, unless");
			current = save;
			return null;
		}

		/* now create the proper implication object */
		implication = theGrammar.createImplicationForm();
		implication.setKind(kind);
		theParse.addElement(implication);
		if (kind == Connective.ONLY_IF) {
			/* P only_if Q is if P then Q */
			implication.setAntecedent(antecedent);
			implication.setConsequent(consequent);
		} else {
			/* for If and Unless, reverse the antecedent and consequent
			 * we don't negate the antecedent for Unless; that comes later */
			implication.setAntecedent(consequent);
			implication.setConsequent(antecedent);
		}
		antecedent.setParent(implication);
		consequent.setParent(implication);
		implication.setAlternative(null);
		implication.setDomain(antecedent.getDomain());
		return implication;
	}

	/** parseBasicForm()
	 * Parse an AndForm of one or more components
	 * Grammar:
	 *   basicForm = andForm | disjunction
	 *   andForm = disjunction ("and" disjunction)*
	 *   
	 * @return a SimpleForm, a CompoundForm (And/Or) or null
	 * On return, current is the token following the Basic form
	 */
	private static Sentence parseBasicForm()
	{
		Token save = current;
		Sentence s;

		/* check for DomainForm */
		s = parseDomainForm();
		if (s != null) return s;
		
		/* get first conjugend, the predecessor is null */
		s = parseOrForm(null);
		if (s == null) {
			/* no diagnostic -- we have parsed nothing */
			current = save;
			return null;
		}
		
		/* skip any following comma */
		if (current.isSymbol(',')) current = moveCurrent();

		/* if it is not followed by 'and', we are done */
		if (! current.isKeyword(KeywordKind.KAND)) return s;

		/* we have an AndForm */
		CompoundForm conjunction = theGrammar.createCompoundForm(Connective.AND);
		theParse.addElement(conjunction);
		conjunction.getStatements().add(s);
		s.setParent(conjunction);
		conjunction.setDomain(s.getDomain());
		do {
			current = moveCurrent();
			/* get another conjugend, provide the predecessor */
			s = parseOrForm(s);
			if (s == null) {
				Error.queue("Invalid sentence structure following 'and'");
				current = save;
				return null;
			}
			conjunction.getStatements().add(s);
			s.setParent(conjunction);
		} while (current.isKeyword(KeywordKind.KAND));

		/* whenever we run out of Ands, return the conjuncts */
		return conjunction;
	}

	/** parseDomainForm
	 * parses a DomainForm in the token stream
	 * Grammar:
	 *   domainForm = forForm | thereForm
	 *   
	 * @return the DomainForm or null
	 */
	private static DomainForm parseDomainForm()
	{
		DomainForm dform = parseForForm();
		if (dform != null) return dform;
		return parseThereIsForm();
	}
	
	/** parseForForm
	 * parses a DomainForm in the token stream
	 * Grammar:
	 *   forForm = "for" domainQuantifier domain [ "does" ] sentence
	 *   domain = [ modifiers ] namedNoun [ qualifier ]
	 *   domainQuantifier = "each" | "every" | "all" | "any" | "some" | "no"
	 *   namedNoun = vocNoun [ ":" localName ]
	 *   localName = name
	 *   
	 * @return the DomainForm or null
	 */
	private static DomainForm parseForForm()
	{
		Token save = current;
		
		/* look for the forForm */
		if (! current.isKeyword(KeywordKind.KFOR)) return null;
		current = moveCurrent();
		
		/* now collect the domain phrase */
		SimpleNounPhrase domain = parseSimpleNoun();
		/* if it makes no sense as a domain, this is not a ForForm */
		if (domain == null || domain.getType() == PhraseType.INSTANCE 
				|| domain.getType() == PhraseType.PRONOUN) {
			current = save;
			return null;
		}
		
		/* check for a meta-Role */
		if (domain.getType() == PhraseType.ROLE_NOUN) {
			// TODO: implement meta-roles as domains
			Error.queue("Domain forms whose domain is a meta-Role name are unimplemented");
			current = save;
			return null;
		}
		
		/* get the quantifier */
		Quantifier q = ((ModifiedTerm)domain).getQuantifier();
		if (q == null || ! isForQuantifier(q.getKind())) {
			Error.queue("Unexpected quantifier after 'for'");
			current = save;
			return null;
		}
		
		/* if the quantifier was NO, skip "does" 
		 * e.g., for no X does P(x) happen
		 * TODO: consider 'is' after 'for no': for no x is Ax <verb-residue> Bx
		 *  (this is a participial form thing)
		 */
		if (q.getKind() == QuantifierKind.QNO) {
			if (current.getWord() == VocKey.doVerb) {
				current = moveCurrent();
			}
		}
		
		/* now parse the qualified sentence */
		Sentence s = parseSentence();
		if (s == null) {
			/* Don't diagnose this; it is possible that the For is a particle, 
			 * or that parseSentence() has already diagnosed the problem */
			current = save;
			return null;
		}
		
		/* now make the DomainForm */
		DomainForm dform = theGrammar.createDomainForm();
		theParse.addElement(dform);
		dform.setDomain(domain);
		domain.setParent(dform);
		dform.setStatement(s);
		s.setParent(dform);
		return dform;
	}

	/** isForQuantifier(kind)
	 *  True if the quantifier is valid in a For statement
	 *  The valid quantifiers are:  ( each | every | all ), ( some | a ), any, no
	 * @param qkind = the quantifier to be tested
	 * @return true if qkind is one of the allowed For quantifiers, else false
	 */
	private static boolean isForQuantifier(QuantifierKind qkind)
	{
		if (qkind == QuantifierKind.QALL)return true;
		if (qkind == QuantifierKind.QANY)return true;
		if (qkind == QuantifierKind.QAN)return true;
		if (qkind == QuantifierKind.QNO)return true;
		return false;
	}

	/** parseThereIsForm
	 * parses a DomainForm in the token stream
	 * Grammar:
	 *   thereForm = "there" isPhrase [ "a" | "some" | "at least" number ] domain
	 *   	[ "such" "that" sentence ]
	 *   isPhrase = isVerb | "must" [ "not" ] "be"
	 *   domain = [ modifiers ] namedNoun [ qualifier ]
	 *   namedNoun = vocNoun [ ":" localName ]
	 *   localName = name
	 *   
	 * @return the DomainForm or null
	 */
	private static DomainForm parseThereIsForm()
	{
		Token save = current;

		/* look for the 'there is/are' form
		 *   thereForm = "there" isPhrase [ "a" | "some" | "no" | "at least" number ] domain
		 *   	[ "such" "that" sentence ]
		 *   isPhrase = ( "is" | "are") [ "not" ] | [ "must" | "may" ] [ "not" ] "be"
		 */
		if (! current.isKeyword(KeywordKind.KTHERE)) return null;
		current = moveCurrent();
		
		/* look for a verb phrase based on the 'is' verb */
		VerbPhrase vp = parseVerbPhrase();
		if (vp == null || vp.getVerb() != VocBase.vocIs) return null;
		/* move past the verb, we don't need the syntax form */
		current = moveCurrent();
		
		/* now collect the domain phrase */
		SimpleNounPhrase domain = parseSimpleNoun();
		if (domain == null || domain.getType() == PhraseType.INSTANCE 
				|| domain.getType() == PhraseType.PRONOUN) {
			current = save;
			return null;
		}
		
		/* check for a meta-Role */
		if (domain.getType() == PhraseType.ROLE_NOUN) {
			// TODO: implement meta-roles as domains
			Error.queue("Domain forms whose domain is a meta-Role name are unimplemented");
			current = save;
			return null;
		}
		
		/* get the quantifier */
		Quantifier q = ((ModifiedTerm)domain).getQuantifier();
		/* check for 'there are domains such that ... */
		if (q == null) {
			q = theGrammar.createQuantifier();
			theParse.addElement(q);
			q.setKind(QuantifierKind.QAN);				
		} else if (q.getKind() == QuantifierKind.QALL || q.getKind() == QuantifierKind.QTHE) {
			Error.queue("Unexpected quantifier expression after 'there is'");
			current = save;
			return null;
		}
		
		/* make the DomainForm */
		DomainForm dform = theGrammar.createDomainForm();
		theParse.addElement(dform);
		dform.setDomain(domain);
		domain.setParent(dform);

		/* look for 'such that' */
		save = current;
		Sentence s = null;
		if (current.toString().equals("such")
		 && moveCurrent().isKeyword(KeywordKind.KTHAT)) {
			/* now parse the qualified sentence */
			current = moveCurrent();
			s = parseSentence();
		}
		if (s == null) {
			/* the there is sentence stands on its own 
			 * i.e., there is an X (such that X exists)
			 * TODO: we may need a NoOp for There is an X with no scope */
			current = save;
			dform.setStatement(null);
		} else {
			dform.setStatement(s);
			s.setParent(dform);
		}
		
		/* finally, check whether to enclose the domain form in a modal */
		Modality m = vp.getModality();
		// if (vp.isNegated()) m = Modality.NEGATION;
		/* If there is no modality, return the domain form we have */
		if (m == Modality.NONE) return dform;
		/* If it read:  there is not a x such that,
		 *  just replace 'not a' with 'no' */
		if (m == Modality.NEGATION && q.getKind() == QuantifierKind.QAN) {
			q.setKind(QuantifierKind.QNO);
			return dform;
		}
		/* This either a real modality, or a negation of some quantitative form
		 * Insert a modal domain form to carry the modality
		 */
		DomainForm modal = theGrammar.createDomainForm();
		theParse.addElement(modal);
		modal.setModality(m);
		modal.setStatement(dform);
		dform.setParent(modal);
		return modal;
	}
	
	/** parseOrForm
	 * parses an OrForm or NorForm in the token stream
	 * Grammar:
	 *   disjunction = orForm | norForm | simpleForm
	 *   orForm = simpleForm ( "or" simpleForm )*
	 *   norForm = "neither" simpleForm "nor" simpleForm
	 *   
	 * @param base = the predecessor clause, if any
	 * @return the OrForm, SimpleForm, or null
	 * On return, current is the token following the disjunction, if any
	 */
	private static Sentence parseOrForm(Sentence base)
	{
		Token save = current;
		Sentence stmt;

		/* get first clause, provide any predecessor given */
		stmt = parseSimpleForm(base);
		if (stmt == null) {
			/* no diagnostic, we have recognized nothing */
			current = save;
			return null;
		}
		
		/* skip any following comma */
		if (current.isSymbol(',')) current = moveCurrent();

		/* look for an OR */
		CompoundForm disjunction = null;
		save = current;
		Sentence s = stmt;
		while (current.isKeyword(KeywordKind.KOR)) {
			current = moveCurrent();
			/* get the next clause, provide the predecessor */
			s = parseSimpleForm(s);
			if (s == null) {
				/* not our OR */
				current = save;
				Error.queue("Invalid sentence structure beginning 'or "
						+ moveCurrent().toString() + "'");
				return stmt;
			}
			/* we have an OR-form, if we didn't make one, make it now */
			if (disjunction == null) {
				disjunction = theGrammar.createCompoundForm(Connective.OR);
				theParse.addElement(disjunction);
				disjunction.getStatements().add(stmt);
				stmt.setParent(disjunction);
				disjunction.setDomain(stmt.getDomain());
				stmt = disjunction;
			}
			disjunction.getStatements().add(s);
			s.setParent(disjunction);
			save = current;
		} 

		/* whenever we run out of ORs, return the disjunction */
		return stmt;

	}

	/** parseSimpleForm(base)
	 * parse the basic sentential form:
	 *   simpleForm = [ subject ] verbPhrase [ object ] partPhrase*
	 *   subject = nounPhrase
	 *   object = nounPhrase
	 *   partPhrase = particle [ nounPhrase ]
	 * The subject is only optional when the simpleForm is the 2nd
	 * statement within a compound form (AndForm or OrForm)
	 *   
	 * @param base = the predecessor clause of the compound, if any
	 * @return the parsed SimpleForm structure or null
	 * On return, current is the first token after the simple form, if any
	 */
	private static SimpleForm parseSimpleForm(Sentence base)
	{
		Token save = current;
		SimpleForm sentence;
		RolePhrase noun;
		
		/* parse subject */
		noun = parseNounPhrase();
		if (noun == null && base == null) {
			/* no subject and no predecessor to use */
			current = save;
			return null;
		}

		/* parse verb */
		VerbPhrase verb = parseVerbPhrase();
		if (verb == null) {
			/* if we didn't see a subject, we have parsed nothing */
			if (noun != null) {
				/* if we parsed a subject, there must be a verb */
				Error.queue("Expecting verb at '" + current.toString() + "' ");
			}
			current = save;
			return null;
		}
		
		/* check for implicit subject, and create a subject 'they' */ 
		if (noun == null) {
			noun = makePronoun(VocKey.theyWord, base.getDomain(), verb.getVerbRole(0));
		} else if (noun.getType() == PhraseType.PRONOUN) {
			/* Check for valid pronoun subject
			 * (the referent will be determined by Rewrite */
			if ( ! ((Pronoun)noun).getKeyword().isKeyword(KeywordKind.PRONOUN)) {
				Error.queue("*** Pronoun '" + ((Pronoun)noun).getKeyword().toString()
						+ "' used as subject");
				current = save;
				return null;
			}
		}
		
		/* create the simple form, with no object yet */
		sentence = makeSimpleForm(noun, verb, null);
		
		/* the current token is the Verb
		 * the syntax form used for the verb determines the rest of the parse */
		if (! parseByForm(sentence)) {
			current = save;
			return null;
		}
		return sentence;
	}

	/** parseVerbPhrase
	 * parses all forms of verb phrase
	 * grammar:
	 *   verbPhrase = vocVerb | affirmedVerb | negatedVerb
	 *   	| mandatedVerb | prohibitedVerb
	 *   affirmedVerb = affirmation | auxAffirmation
	 *   affirmation = "always" vocVerb
	 *   auxAffirmation = ( isVerb | hasVerb ) "always" postverbs
	 *   negatedVerb = negation | auxNegation
	 *   negation = ( "never" | doVerb "not" ) verbForm
	 *   auxNegation = ( isVerb | hasVerb ) ("not" | "never") postverbs
	 *   mandatedVerb = "must" [ "always" ] vocVerb
	 *   prohibitedVerb = "must" ("not" | "never") vocVerb
	 *   
	 *   @return a VerbPhrase object matching the phrase
	 *   On return, current is the TermToken whose referent is the 
	 *   SyntaxForm for the matched verb.
	 */
	private static VerbPhrase parseVerbPhrase()
	{
		Token save = current;
		VerbPhrase vp;
		boolean negated, mandated, permitted;
		
		/* actual parse structure is:
		 *    [ does | must | may | can | should ] [ not | always ] VocVerb 
		 */
		negated = false;
		mandated = false;
		permitted = false;
		if (current.getWord() == VocKey.doVerb) {
			/* if this is 'does', ignore it */
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KMUST)) {
			mandated = true;
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KMAY)) {
			permitted = true;
			current = moveCurrent();
		}
		if (current.isKeyword(KeywordKind.KNOT)) {
			negated = true;
			current = moveCurrent();
		} else if (current.isKeyword(KeywordKind.KALWAYS)) {
			/* if this is 'always', ignore it */
			current = moveCurrent();
		}
		/* now the verb, nothing else will do */
		if (current.kind != TokenKind.TERM 
				|| ((TermToken)current).termkind != TermToken.VERB) {
			if (save != current) {
				/* this is an error if we saw must/may/do/not/always */
				Error.queue("Expecting vocabulary verb at '" + current.toString());
			}
			current = save;
			return null;
		}
		
		/* the referent of the VERB Token is a Syntax Form for the Verb */
		SyntaxForm form = (SyntaxForm)((TermToken)current).referent;
		if (form.getVerb() == null) {
			Error.queue("Syntax form '" + form.getText() + "is unlinked from verb");
			return null;
		}
		
		/* we have a VerbPhrase, what kind? */
		vp = theGrammar.createVerbPhrase();
		vp.setVerb(form.getVerb());

		if (mandated) {
			if (negated) {
				/* 'must not' is prohibited */
				vp.setModality(Modality.PROHIBITION);
			} else {
				/* 'must' is obligated */
				vp.setModality(Modality.OBLIGATION);
			}
		} else if (permitted) {
			if (negated) {
				/* 'may not p' is (permission (not p)) */
				vp.setModality(Modality.PERMITTED_NOT);
			} else {
				/* 'may p' is (permission p) */
				vp.setModality(Modality.PERMISSION);
			}

		} else if (negated) {
			/* no 'modality', but negation */
			vp.setModality(Modality.NEGATION);
			// vp.setNegated(true); /* 'not p' */
		} else {
			/* no modality */
			vp.setModality(Modality.NONE);
		}
		
		/* return the verb phrase
		 * implicitly return current, whose referent is the form 
		 * that determines the rest of the parse of the SimpleForm */
		return vp;
	}
	
	/** parseByForm(SimpleForm)
	 *  process the SyntaxForm (for the verb in the SimpleForm)
	 *  Associate the subject (in the passed SimpleForm) with the VerbRole it plays
	 *  Parse the direct object, if any, and associate it with the VerbRole it plays
	 *  Parse any part phrases in the SimpleForm, associating the embedded 
	 *  RolePhrases with VerbRoles.
	 *  
	 *  Note: this routine is used by parseSimpleForm, parseSimpleQualifier,
	 *  and parseQQuery.  The latter two pre-load some information in the SimpleForm.
	 *  
	 * @param sentence = the SimpleForm or SimpleQualifier being parsed
	 * @param form = the SyntaxForm being used in this sentence
	 * @return true if the stream matched the form, else false
	 * 
	 * On call, current is on the verb token
	 * On return, current is on the first token after the matched stream
	 */
	private static boolean parseByForm(SimpleForm sentence)
	{
		Token save;
		RolePhrase noun;
		PartPhrase part;
		FormElement elt;
		int particleCount;
		Particle skipParticle;
		
		/* current is the verb Token, the referent is the matched Syntax Form */
		Term verbterm = ((TermToken)current).term;
		SyntaxForm form = (SyntaxForm)((TermToken)current).referent;

		/* the recovery point is after the verb */
		current = moveCurrent();
		save = current;
		
		/* the syntax form determines the rest of the parse following the verb */
		ListIterator<FormElement> eltit = form.getElements().listIterator();
		/* get subject, associate with VerbRole */
		elt = eltit.next();	/* subject */
		assignRole(sentence.getSubject(), ((RoleElement)elt).getRole());

		eltit.next();	/* verb */

		/* if there is no direct object, and no particles, we are done */
		if (! eltit.hasNext()) {
			if (sentence.getObject() == null) return true;
			Error.queue("Intransitive verb '" + verbterm.toString()
					+ "' has a direct object");
			return false;
		}
		
		elt = eltit.next();
		if (elt.getKind() == FormElementKind.OBJECT_ROLE) {
			/* this is a direct object element
			 * it may already have been parsed (in a SimpleQualifier)
			 */
			if (sentence.getObject() == null) {
				/* find the matching noun phrase in the stream */
				noun = parseNounPhrase();
				if (noun == null) {
					Error.queue("Missing direct object for transitive verb '" 
							+ verbterm.toString() + "'");
					current = save;
					return false;
				}
				sentence.setObject(noun);
				noun.setParent(sentence);
				
				/* check for the object being a pronoun */
				if (noun.getType() == PhraseType.PRONOUN) { 
					if (((Pronoun)noun).getKeyword().isKeyword(KeywordKind.KSELF)) {
						noun.setReferent(sentence.getSubject());
					} else {
						// TODO: fix the magic referent case
						Error.queue("Support for pronoun antecedent unimplemented");
						current = save;
						return false;
					}
				}
			}
			/* associate the object with its VerbRole */
			assignRole(sentence.getObject(), ((RoleElement)elt).getRole());
			/* then go on to any particle phrases */
			
		} else if (sentence.getObject() != null) {
			/* we have an object without a direct object slot */
			/* this can happen in a bound form (qualifier) of the form:
			 *   ... that <subject> <verb> <particle>
			 *   e.g., the person that John gave the book to
			 */
			if (elt.getKind() != FormElementKind.PARTICLE_ELEMENT) {
				/* not a particle?  This will fail below */
				eltit.previous();
			} else if (eltit.hasNext()) {
				/* if the form has more than one particle, 
				 * we can't guess the role of the pseudo-Object */
				Error.queue("Verb '" + verbterm.toString() 
						+ "' has multiple phrases; object is ambiguous");
				current = save;
				return false;
			} else if (matchParticle(((Particle)elt).getTerm()) != null) {
				/* we have a match on the sole particle
				 * create the part phrase and put the pseudo-Object in it 
				 */
				part = theGrammar.createPartPhrase();
				part.setParticle((Particle)elt);
				part.setPartRole(sentence.getObject());
				sentence.setObject(null);
				assignRole(part.getPartRole(),((Particle)elt).getRole().getRole());
				sentence.getPartPhrases().add(part);
				return true;
			} else {
				/* we can't match the particle, so we have a redundant object */
				Error.queue("Intransitive verb '" + verbterm.toString()
						+ "' has a direct object");
				current = save;
				return false;
			}
			
		} else {
			eltit.previous();
		}
		
		/* create the Particle list
		 * these can occur in any order, so we make the list of particles
		 * before we fill it in */
		/* in the case of SimpleQualifiers, it is possible that one 
		 * particle slot has already been filled.  If so, it is the skipParticle.
		 */
		if (sentence.getPartPhrases().size() > 0) {
			part = sentence.getPartPhrases().get(0);
			skipParticle = part.getParticle();
		} else {
			skipParticle = null;
		}
		for (particleCount = 0; eltit.hasNext(); ) {
			elt = eltit.next();
			if (elt.getKind() != FormElementKind.PARTICLE_ELEMENT) {
				/* this should not happen */
				RECONManager.errorlog.println(
						"*** internal error: Unexpected Form Element, type = '" + elt.getKind()
						+ "' for verb " + verbterm.toString());
				/* hope we are done */
				return true;
			}
			/*  check for the pre-loaded particle, if any */
			if (elt != skipParticle) {
				/* create an entry for this Particle */
				part = theGrammar.createPartPhrase();
				sentence.getPartPhrases().add(part);
				part.setParticle((Particle)elt);
				++particleCount;
			}
		}

		/* now process token stream, finding and filling the particle slots */
		while (particleCount > 0) {
			part = parsePartPhrase(sentence);
			/* parsePartPhrase will fail if it doesn't match any
			 * or matches a full slot.  Assume no match. */
			if (part == null) {
				Error.queue("Missing verb part phrase for '" + verbterm.toString()
						+ "' at '" + current.toString() + "'");
				return false;
			}
			if (part.getParticle().getRole() == null) {
				/* a particle that has no role is a "free part"
				 * a syntax form can have at most one at the end
				 */
				if (particleCount > 1) {
					/* this was not the last required element */
					Error.queue("Missing verb part phrase for '" + verbterm.toString()
							+ "' at '" + current.toString() + "'");
					return false;
				}
			} else {
				/* for a particle that has a role, link the role player to it */
				
			}
			/* count one satisfied particle */
			--particleCount;
		}
		/* when we have done all the Particles in the form, we are done */
		return true;		
	}
	
	/** parsePartPhrase(sentence)
	 * parses one PartPhrase in a SimpleForm
	 * grammar:
	 *   partPhrase = particle [ nounPhrase ]
	 * where the noun phrase describes the thing that plays the particle role.
	 * When the PartPhrase is prepositional, it has an object -- the particle term --
	 * and the Particle identifies the Verb Role played by the object.
	 * Otherwise, the partPhrase has no object; it is just a separate part of the verb.  
	 * 
	 * This routine assumes that the sentence has a list of required part phrases
	 * based on the syntax form for the VocVerb.  It matches the current Token string
	 * to one of those Particles.
	 * 
	 * @param sentence = the owner of the list of required part phrases
	 * @return the part phrase that was actually matched, or null
	 * On return current is the token after the matched phrase, if any
	 */
	private static PartPhrase parsePartPhrase(SimpleForm sentence)
	{
		PartPhrase part;
		Particle particle;
		RolePhrase player;
		Token save = current;

		for (int pp = 0; pp < sentence.getPartPhrases().size(); ++pp) {
			part = sentence.getPartPhrases().get(pp);
			/* if the part does not yet have a particle term,
			 * check for a match on its particle */
			if (part.getPartRole() == null) {
				particle = part.getParticle();
				current = save;
				if (matchParticle(particle.getTerm()) != null) {
					/* we found the particle, 
					 * does it need a particle term? */
					if (particle.getRole() != null) {
						/* yes, collect the noun phrase for the particle term */
						player = parseNounPhrase();
						if (player == null) {
							Error.queue("Invalid object phrase for verb part '" 
									+ particle.getTerm().toString() + "'");
							return null;
						}
						part.setPartRole(player);
						player.setParent(sentence);
						assignRole(player, particle.getRole().getRole());
					}
					return part;
				}
			}
		}
		current = save;
		return null;
	}

	/** checkVerbContext(subject, verb)
	 * check whether the subject is consistent with the defined context of the verb
	 * 
	 * @param subject = the RolePhrase that is the subject of the verb
	 * @param verb = the SyntaxForm currently recognized
	 * @return true if the subject is an instance of the type of the subject role, else false
	 */
	private static boolean checkVerbContext(RolePhrase subject, SyntaxForm verb) 
	{
		/* get the real subject */
		while (subject.getReferent() != null) subject = subject.getReferent();
		VocNoun noun = null;
		if (subject.getType() == PhraseType.TYPE_NOUN){
			/* if the subject is a TypeNoun, the type is its VocNoun */
			noun = ((TypeNoun)subject).getNoun();
		} else if (subject.getType() == PhraseType.PROPERTY) {
			/* if it is a property, the type is the range of the VocProperty */
			noun = ((PropertyNoun)subject).getProperty().getRange();
		} else if (subject.getType() == PhraseType.INSTANCE) {
			/* if it is an Instance, we just have to assume it matches */
			return true;
		} else if (subject.getType() == PhraseType.ROLE_NOUN) {
			/* if it is a RoleNoun, the type is the range of the Role */
			noun = ((RoleNoun)subject).getRange();
		} else {
			/* have no idea what it is */
			return true;
		}
		VocNoun context = ((RoleElement)verb.getElements().get(0)).getRole().getRange();
		if (findContext(noun, context)) return true;
		Error.queue("Verb Form '" + verb.getText() 
				+ "' subject type does not match actual subject type '"
				+ noun.external());
		return false;
	}

	/** findContext(actual noun, target noun)
	 *  recursive search for a match on the target among the supertypes of the actual noun
	 * @param actual = the type of the actual thing in the role
	 * @param target = the nominal range of the role
	 * @return true if the actual type is, or is a subtype of, the target, else false
	 */
	private static boolean findContext(VocNoun actual, VocNoun target) 
	{
		if (actual.equals(target)) return true;
		if (target.equals(VocBase.vocThing))return true;  // every noun subtypes 'thing'
		for (int i = 0; i < actual.getBase().size(); ++i) {
			actual = (VocNoun)actual.getBase().get(i);
			if (findContext(actual, target)) return true;
		}
		return false;
	}
	
	/** makePronoun(keyword, referent, rolePlayed)
	 * make a Pronoun to play the role formerly played by the referent
	 * and make the referent the referent of the Pronoun
	 * 
	 * @param keyword = the word to be used for the pronoun
	 * @param referent = the RolePhrase the pronoun is to refer to
	 * @param role = the role played by the pronoun (not its referent)
	 * @return the Pronoun created
	 */
	private static Pronoun makePronoun(Keyword word, RolePhrase referent, VerbRole role)
	{
		Pronoun pro = theGrammar.createPronoun();
		theParse.addElement(pro);
		pro.setKeyword(word);
		pro.setReferent(referent);
		pro.setRolePlayed(role);
		return pro;
	}

	/** makeVerbPhrase(verb)
	 * construct a VerbPhrase object for the given VocVerb
	 * @param verb = the VocVerb used in the verb phrase
	 * @return a positive declarative verb phrase for the verb
	 */
	private static VerbPhrase makeVerbPhrase(VocVerb verb)
	{
		VerbPhrase vphrase = theGrammar.createVerbPhrase();
		vphrase.setVerb(verb);
		vphrase.setModality(Modality.NONE);
		return vphrase;		
	}
	
	/** makeSimpleForm(subject, verb, object)
	 * make a SimpleForm with the given verbPhrase, and the given subject and object
	 * 
	 * @param subject = rolePhrase that is the subject of the form
	 * @param verb = verbPhrase for the simpleForm
	 * @param object = rolePhrase that is the object of the form, or null
	 * @return the new SimpleForm 
	 */
	private static SimpleForm makeSimpleForm(
			RolePhrase subject, VerbPhrase verb, RolePhrase object)
	{
		SimpleForm sentence = theGrammar.createSimpleForm();
		theParse.addElement(sentence);
		sentence.setSubject(subject);
		if (subject != null) {
			subject.setParent(sentence);
			subject.setRolePlayed(verb.getVerb().getRoles().get(0));
		}
		sentence.setVerb(verb);
		sentence.setObject(object);
		if (object != null) {
			object.setParent(sentence);
			object.setRolePlayed(verb.getVerb().getRoles().get(1));
		}
		
		sentence.setDomain(subject); // the local domain is the subject (for pronouns)
		sentence.setDone(false);
		return sentence;
	}
	
	/** assignRole(role phrase, verb role)
	 * Assign the given verb role to the things that play the role
	 * in a given SimpleForm, i.e., simple nouns or group members
	 * @param phrase = the role phrase object representing the player(s)
	 * @param role = the verb role
	 */
	private static void assignRole(RolePhrase phrase, VerbRole role)
	{
		if (phrase == null) return;
		phrase.setRolePlayed(role);
		if (phrase.getType() != PhraseType.GROUP) return;
		for (int m = ((GroupPhrase)phrase).getMembers().size(); m > 0; ) {
			((GroupPhrase)phrase).getMembers().get(--m).setRolePlayed(role);
		}
	}
	
	/** matchParticle (term)
	 * test for a match between a Particle term and the current Token(s)
	 * @param term = the term to be matched
	 * @return the last Word token of the term if the term matches, else null
	 * On return current is the first Token after the match (or the original position)
	 */
	private static Token matchParticle(Term term)
	{
		Token save = current;

		/* compare the Term words with the Token words */
		for (int w = 0; w < term.getWords().size(); ++w) {
			if (term.getWords().get(w) != current.getWord()) {
				current = save;
				return null;
			}
			save = current;
			current = moveCurrent();
		}
		/* all the Term words were matched, return the last position */
		return save;
	}

	/** moveCurrent()
	 * records forward progress thru the token stream
	 * @return the next token after the current one
	 */
	private static Token moveCurrent()
	{
		Token p = progress;
		/* record forward progress through the stream */
		if (p == current) progress = current.next;
		/* and make progress */
		return current.next;
	}

	/** moveCurrent(Token to)
	 * records forward progress thru the token stream
	 * @return the next token after the current one
	 */
	private static Token moveCurrent(Token to)
	{
		Token p = progress;
		/* record forward progress through the stream */
		if (p == current) progress = to;
		/* and make progress */
		return to;
	}
	
	/** getProgress
	 * 
	 * @return the furthest token visited in the Parse
	 */
	public static Token getProgress()
	{
		return progress;
	}

	/** atEnd
	 * 
	 * @return true if the parse position is on the END token, else false
	 */
	public static boolean atEnd()
	{
		if (current.next == null) return true;
		return (current.next.kind == TokenKind.END);
	}
	
	/** matchKeywords(keyword list)
	 * compares a sequence of keywords to the Token string beginning at current
	 * 
	 * @param keywords = the list of keywords (KeywordKinds) to be matched
	 * @return true if the Token sequence matches, else false
	 * On return, current is the token following the matched keywords, or unchanged
	 */
	public static boolean matchKeywords(KeywordKind[] keywords)
	{
		Token save = current;
		int k;
		
		for (k = 0; k < keywords.length; ++k) {
			if (! current.isKeyword(keywords[k])) {
				current = save;
				return false;
			}
			current = moveCurrent();
		}
		return true;
	}

	/** findPreviousUse(TermToken)
	 * finds the previous reference in the active token stream
	 * to the VocabularyItem that is the referent of the passed TermToken
	 * and returns the parse object (RolePhrase) that is the parse of that token 
	 * @param tt = the TermToken that refers to the VocabularyItem of interest
	 * @return the TypeNoun or PropertyNoun that is the parse of the previous reference, if any
	 */
	private static Object findPreviousUse(TermToken tt)
	{
		TermUse tuse = TermUse.findUse((VocabularyItem)tt.referent, tt);
		if (tuse == null) {
			/* reactivate this when property back references work
			RECONManager.errorlog.println("*** Internal error: Term '" 
					+ tt.toString() + "' has no TermUse for token");
			 */
			return null;
		}
		/* if there is no previous use, fail */
		tuse = tuse.getPreviousUse();
		if (tuse == null) return null;
		/* assume that the TermToken has an associated parse only if is active */
		return ((TermToken)tuse.getUsage()).parse;
	}
	
}
