/* ParseManager.java
 *  
 * @author Ed Barkmeyer, NIST, October, 2010
 * revisions:
 *  2011 Sep, v0.13, add getTokenList, accept colon in createStream,
 *  				 move/improve ProperName recognition (from Parser)
 *  2011 Oct, v0.17, support the fillWord in verb Term matching
 *  2011 Oct, v0.18, support the revised form of Number (for quantities)
 *  				 support operator tokens
 *  2012 May, v0.20, fix crash on bad line start in createStream
 */
package core;

import NBVR.Grammar.*;
import NBVR.Vocabulary.*;
import NBVR.Vocabulary.impl.TermUse;

import org.eclipse.emf.ecore.EObject;

import java.util.Iterator;

/** ParseManager
 *  the Parse Manager constructs and maintains the token stream for the Parser
 *  it also manages alternative term matches in the stream, and recovery from
 *  failed parses when optional term matches are available.
 *  
 *  The class has no instances.  It is merely a collector for static methods.
 *  
 *  The public entry points are:
 *  	parseNounPhrase, which interprets the token stream as a RolePhrase (a type definition)
 *  	parseSentence, which interprets the token stream as a Sentence (a verb definition or axiom)
 *  	matchTerm, which determines whether a given stream of base tokens matches a given Term
 *  	findParticles, which creates a set of alternative TermTokens for Particles separated from the verb
 *  		(separated particles can be identified only when the verb context is chosen)
 *  	getTokenList, which returns the current TermToken stream as an array of Tokens (for diagnosis)
 *  	printLine, which prints the buffered "line" of input text that is being parsed
 *  parseNounPhrase and parseSentence both call parseLine to do the parse
 *		parseLine calls createStream to create the base token stream,
 *			then it calls createTermTokens to create the TermToken stream with alternatives
 *			then it executes the parse and retry loop, calling the Parser for each trial token stream
 *		createStream creates the base Token stream, 
 *			it inputs tokens one at a time from FileIn, buffering the input line in a StringBuffer
 *			it associates input token text with word forms and then words, 
 *			it creates new "Words" for symbols, numbers, quoted strings, and capitalized names
 *		createTermTokens creates TermTokens as sequences of word tokens that makeup Terms
 *			where a (sub)sequence of word tokens makes up more than one Term, 
 *			it links the alternative Terms, creating alternative Term sequences
 */
public class ParseManager {
	
	private static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	
	/* local implicitly shared objects */
	protected static TokenIn source;	/* the Token stream source */
	protected static Token stream;		/* the token stream object */
	protected static Token[] tokenlist;
	protected static VocabularyItem parse_context;
	
	/* a buffer to hold the actual text line 
	protected static final int LINESIZE = 1024;
	protected static StringBuffer line = new StringBuffer(LINESIZE);
	*/
	protected static boolean linePrinted;
	
	/** parseNounPhrase(file, context)
	 * creates a token stream from lines of the input file provided and 
	 * attempts to parse the stream as a RolePhrase 
	 * @param file = the source text for the RolePhrase stream
	 * @param context = the VocItem that is the context for role names in the parse
	 * @return the Formulation whose FormulationForm is the Noun Phrase
	 */
	public static Formulation parseNounPhrase(TokenIn file, VocabularyItem context)
	{
		/* record the interpretation context
		 * in definitions of properties, roles are significant */
		parse_context = context;

		/* parse the definition */
		Formulation np = parseLine(file, true);
		
		/* if it failed, it will have printed diagnostics, just fail */
		if (np == null) return null;
		
		/* it worked, print the formulation */
		if (RECONManager.printparse) 
			((RolePhrase)np.getForm()).print(0, RECONManager.errorlog);
		return np;
	}
	
	/** parseSentence(file, context)
	 * creates a token stream from lines of the input file provided and 
	 * attempts to parse the stream as a Sentence 
	 * @param file = the source text for the Sentence stream
	 * @param context = the VocItem that is the context for role names in the parse
	 * @return the Formulation whose FormulationForm is the Sentence
	 */
	public static Formulation parseSentence(TokenIn file, VocVerb context)
	{
		/* record the interpretation context
		 * in definitions of verbs, roles are significant */
		parse_context = context;
		
		/* now parse the sentence in the stream */
		Formulation s = parseLine(file, false);
		
		/* if it failed, it will have printed diagnostics, just fail */
		if (s == null) return null;
		
		/* it worked, print the formulation and return it */
		if (RECONManager.printparse) 
			((Sentence)s.getForm()).print(0, RECONManager.errorlog);
		return s;
	}
	
	/** parseLine(file, isPhrase)
	 * creates a token stream from lines of the input file provided and 
	 * attempts to parse the stream as a RolePhrase or Sentence according to isPhrase
	 * 
	 * @param file = the source text for the stream 
	 * @param isPhrase = true if what is to be parsed is a phrase, false if a sentence
	 * @return the parse result: an Object that is a RolePhrase or a Sentence
	 */
	private static Formulation parseLine(TokenIn file, boolean isPhrase)
	{
		Formulation formulation;
		FormulationForm result;

		/* stash the parsed line as a String */
		source = file;
		linePrinted = false;
		int mark = file.getPosition();
		
		/* create the Token stream from the source file
		 * Note: parse_context is set externally and controls role name recognition */
		createStream(source);
		
		/* display the text line */
		if (RECONManager.printparse) {
			RECONManager.errorlog.println();
			if (isPhrase) RECONManager.errorlog.print("Formulation: ");
			printLine();
		}
		
		if (stream.next.kind == TokenKind.END) {
			printLine();
			RECONManager.errorlog.println("*** Empty formulation.");
			return null;
		}
		/* find the Terms in the stream */
		createTermTokens();
		
		/* now parse the token stream */
		Error.init();
		for (;;) {
			/* try parsing the stream with the current Term assignments */
			tokenlist = null; /* no errors yet - no stream context */
			formulation = theVocFactory.createFormulation("RECON", file.getLine(mark), null);
			Parser.init(stream, formulation);
			if (isPhrase)
				result = Parser.parseNounPhrase();
			else
				result = Parser.parseSentence();
			
			
			if (result != null && Parser.atEnd()) {
				/* success, return the result */
				TermUse.releaseAll();
				Error.releaseErrors();
				formulation.setForm(result);
				return formulation;
			}

			/* it failed at the 'parseStop' token. */
			Token parseStop = Parser.getProgress();
			/* if we were at the end, choose the last token */
			if (parseStop == null) parseStop = stream.prev;

			/* check for stopping short
			 * it is possible that no error was diagnosed */
			if (result != null) {
				Error.queue("Unable to interpret text after '" + parseStop.toString() + "'");
			}

			/* The parseStop token or some prior token prevented the parse
			 * find the decision token */
			TermToken decision = findDecisionToken(parseStop);
		
			if (decision == null) {
				/* no decision worked, fail and dump the error queue */
				/* first print the defined item term, if any, and the failed text */
				if (parse_context != null) {
					RECONManager.errorlog.println();
					RECONManager.errorlog.println("Context: " + 
						parse_context.getTerms().get(0).getText());
				}
				printLine();
				Error.printErrors(RECONManager.errorlog);
				TermUse.releaseAll();
				return null;
			} else {
				/* choose the next alternative for that decision, 
				 * reset any choices beyond it, and try again.
				 */
				resetDecisions(decision);
			}
		}
	}

	/** createStream (file)
	 * create a Token stream from the next line(s) of the specified file
	 * change 'is/has not' to 'does not be/have' for uniformity of verb matches
	 * @param file the lexical scanner for the file
	 */
	private static void createStream(TokenIn file)
	{
		TokenKind tk;
		Token current;
		WordForm wf;

		/* initialize the stream and the line collector */
		stream = Token.createStream();
		
		for (;;) {
			tk = file.nextToken();
			if (tk == TokenKind.NAME) {
				/* this is a Word or a Name */
				/* make or find the WordForm for the token string */
				if (stream.prev == null && Character.isUpperCase(file.token[0])) {
					/* this is the first word of a sentence, try the lower case form first */
					file.token[0] = Character.toLowerCase(file.token[0]);
					wf = theVocFactory.findWordForm(file.token, file.tokensize);
					if (wf == null || wf.getWord() == null) {
						/* the lower case form is not a known word, use the upper case form
						 * it may be a proper name */
						file.token[0] = Character.toUpperCase(file.token[0]);
						wf = theVocFactory.makeWordForm(file.token, file.tokensize);
					}
				} else {
					/* for any other word, find or create the word form */
					wf = theVocFactory.makeWordForm(file.token, file.tokensize);
				}

				/* if there is no associated Word, create one */
				if (wf.getWord() == null) {
					/* assume it is a proper name */
					wf.setWord(theVocFactory.createName(wf));
					RECONManager.theDictionary.addWord(wf.getWord());
					if (stream.prev == null || stream.prev.getWord() != VocKey.colonWord) {
						/* this is not a local name, report the assumption */
						RECONManager.errorlog.println("*** Word '" + wf.getText() 
								+ "' is not in the Dictionary.");
					}
				}
				
			} else if (tk == TokenKind.SYMBOL) {
				/* punctuation */
				if (file.getTokenSymbol() == '\n') {
					/* create an End token for the final new line */
					current = stream.add();
					current.setKind(TokenKind.END);
					return;
				} else if (file.getTokenSymbol() == ':') {
					/* create a token for a colon */
					wf = VocKey.colonWord.getBase();
				} else {
					/* look for operator symbols that are important */
					Adjunct w = VocKey.getOperator(file.getTokenSymbol());
					if (w != null)
						wf = w.getBase();
					else /* ignore other symbols */
						wf = null;
				}
				
			} else {
				/* some kind of constant, find/make the word form and the word */
				wf = theVocFactory.makeWordForm(file.token, file.tokensize);
				if (wf.getWord() == null) {
					if (tk == TokenKind.NUMBER) {
						wf.setWord(theVocFactory.createNumberWord(wf));
						((NumberWord)wf.getWord()).setDecimal(false);
						((NumberWord)wf.getWord()).setValue(file.getTokenValue());
				} else if (tk == TokenKind.DECIMAL) {
						wf.setWord(theVocFactory.createNumberWord(wf));
						((NumberWord)wf.getWord()).setDecimal(true);
					} else if (tk == TokenKind.DATETIME) {
						wf.setWord(theVocFactory.createDateTime(wf));
					} else if (tk == TokenKind.STRING) {
						wf.setWord(theVocFactory.createStringWord(wf));
					}
				}
			}
			
			if (wf != null) {
				/* make a token for it */
				current = stream.add();
				current.setKind(tk);
				current.setWord(wf.getWord());
				
				/* change 'is/has not/always' to 'does not/always be/have' */
				if (current.isKeyword(KeywordKind.KNOT)
				 || current.isKeyword(KeywordKind.KALWAYS)) {
					if (current.prev().getWord() == VocKey.isVerb) {
						current.prev.setWord(VocKey.doVerb);
						current = stream.add();
						current.setKind(TokenKind.NAME);
						current.setWord(VocKey.isVerb);
					}
					if (current.prev().getWord() == VocKey.hasVerb) {
						current.prev.setWord(VocKey.doVerb);
						current = stream.add();
						current.setKind(TokenKind.NAME);
						current.setWord(VocKey.hasVerb);
					}
				}
			}
		}
	
	}

	/** createTermTokens()
	 * find all the Terms that appear in the token Stream
	 * annotate the first Word Token of each Term
	 */
	private static void createTermTokens()
	{
		Token token;
		Word word;

		/* first find all the matched terms in the stream */
		for (token = stream; token.hasNext(); ) {
			token = token.next;
			
			/* create the TermTokens for this token */
			findMatches(token);

			if (token.altTerm == null) {
				/* split quantified pronouns:
				 *  everything, nothing, something, anything
				 */
				word = getQuantifiedPronoun(token);
				if (word != null) {
					token.setWord(word);
					Token thingtoken = new Token();
					thingtoken.setWord(VocKey.thingNoun);
					thingtoken.next = token.next;
					if (token.next == null)
						stream.prev = thingtoken;
					else
						token.next.prev = thingtoken;
					thingtoken.prev = token;
					token.next = thingtoken;
					/* note that 'token' itself doesn't move,
					 * so 'thing' will be recognized next */
				}
			}
		}

		/* assume the first Term is what was intended,
		 * unless it is a particle (which could easily be a keyword)
		 * substitute it for the Word Token in the stream 
		 * Note: this cannot be done in the matching loop,
		 * since multiple terms can end with the same token,
		 * which causes weird things to happen to the prev links */
		for (token = stream; token.hasNext();) {
			token = token.next();
			
			/* check for an undeclared ProperName
			 * this doesn't work on the first pass */
			if (tokenIsProper(token)) {
				makeProperNameToken(token);
			}
			
			/* if the token is a Term, substitute the term */
			if (token.hasAlt()) {
				if (token.altTerm.termkind != TermToken.PARTICLE) 
					token = useAlternateToken(token);
				/* note: this modifies .next to follow the Term */
			}
			
			/* check for local name (declaration) */
			if (token.isSymbol(':')) {
				
			}
		}
	}
	
	/** getQuantifiedPronoun(token)
	 * if the token is a quantified pronoun:
	 * 	 everything/body/one, nothing/..., something/..., anything/...
	 * return the quantifier word
	 * @param token = the token to be examined
	 * @return the quantifier word or null
	 */
	private static Word getQuantifiedPronoun(Token token)
	{
		if (token.isKeyword(KeywordKind.KEVERYTHING)) {
			return VocKey.everyWord;
		} else if (token.isKeyword(KeywordKind.KSOMETHING)) {
			return VocKey.someWord;
		} else if (token.isKeyword(KeywordKind.KANYTHING)) {
			return VocKey.anyWord;
		} else if (token.isKeyword(KeywordKind.KNOTHING)) {
			return VocKey.noWord;
		} else {
			return null;
		}
	}
	
	/** findMatches ()
	 * attaches to the Token (altTerm) a sequence of TermTokens for each term 
	 * that begins with the Word that is the passed token in the stream.
	 * If parse_context is not null, role designations for that verb are permitted.
	 * Particle terms are ignored.
	 *  
	 * @param start = the token for the first word of whatever Terms may match
	 */
	private static void findMatches(Token start)
	{
		TermToken match;
		Term term;
		Token end;
		VocabularyItem item;
		EObject referent;
		int tkind;
	
		/* get the current Word */
		Word w = start.getWord();
		if (w == null) return;
		/* if it begins no terms, there is nothing to do */
		if (w.getBeginsTerm().size() == 0) return;
		
		/* it begins one or more terms, make some tokens */
		Iterator<Term> tit = w.getBeginsTerm().iterator();
		
		while (tit.hasNext()) {
			term = tit.next();

			/* initialize to failure values */
			tkind = 0;
			referent = null;
			
			/* What does this term refer to? */
			item = term.getConcept();
			if (item != null) {
				/* if it refers to a vocabulary item,
				 * the item is the referent, the term type is the item type */
				referent = item;
				switch (item.getKind().getValue()) {
				case VocItemKind.NOUN_CONCEPT_VALUE: 
					tkind = TermToken.NOUN;
					break;
				case VocItemKind.PROPERTY_CONCEPT_VALUE:
					tkind = TermToken.PROPERTY;
					break;
				case VocItemKind.VERB_CONCEPT_VALUE:
					tkind = TermToken.VERB;
					break;
				case VocItemKind.ADJECTIVE_CONCEPT_VALUE:
					tkind = TermToken.ADJECTIVE;
					break;
				case VocItemKind.PROPER_NAME_VALUE:
					tkind = TermToken.PROPERNAME;
					break;
				}
				

			} else if (parse_context != null && term.getContext() == parse_context) {
				/* if roles are permitted, and this term has the right context,
				 * check for a match as a role name
				 */
				if (term.getRole() != null) {
					tkind = TermToken.ROLE;
					referent = term.getRole();
				}
				
			} else if (term.getParticle() != null) {
				/* the term is a Particle -- an adverb phrase attached to a verb form */
				/* ** ignore Particles in this phase
				tkind = TermToken.PARTICLE;
				referent = term.getParticle();
				 */
			}

			/* if this is a verb, we must make entries for each of the
			 * syntax forms that use this term, usually only one
			 */
			if (tkind == TermToken.VERB) {
				end = matchTerm(term, start, true);
				if (end != null) {
					for (int f = 0; f < term.getElement().size(); ++f) {
						/* get the Syntax Form that contains the item element */
						SyntaxForm form = term.getElement().get(f).getForm();
						match = new TermToken(term, tkind, form, start, end);
						start.addTerm(match);
					}
				}

			/* otherwise, we will make an entry if we know the kind of referent */
			} else if (tkind != 0) {
				/* does it match the token stream? */
				end = matchTerm(term, start, false);
				if (end != null) {
					match = new TermToken(term, tkind, referent, start, end);
					start.addTerm(match);
					if (tkind == TermToken.NOUN || tkind == TermToken.PROPERTY) {
						/* make a TermUse linked to the token */
						TermUse.create((VocabularyItem)referent, match);
					}
				}
			}
		}
		
		/* Now resolve collisions */
		resolveMatches(start);

	}

	/** findParticles ()
	 * attaches to the Token (altTerm) a sequence of TermTokens for each term 
	 * that begins with the Word that is the passed token in the stream
	 * and corresponds to a Particle (of any form of any VocVerb)
	 * This is called only when a qualifier begins with a particle.
	 *  
	 * @param start = the token for the first word of whatever Terms may match
	 * @result a fake Token that is the head of the list of Particle Tokens
	 * 
	 * Note:  originally this was attached directly to the start token,
	 * but that is dangerous if some other Term begins with the same word.
	 * When that word is recognizeable as a Particle, none of those terms
	 * was recognized, but only with the set of term associations for this pass.
	 */
	public static Token findParticles(Token start)
	{
		Token result = null;
		TermToken match;
		Term term;
		Token end;
		Particle particle;

		/* get the current Word */
		Word w = start.getWord();
		/* a Term, or a symbol, is not a particle */
		if (w == null) return null;
		/* if it begins no terms, there is nothing to do */
		if (w.getBeginsTerm().size() == 0) return null;
		
		/* it begins one or more terms, make some tokens */
		Iterator<Term> tit = w.getBeginsTerm().iterator();
		
		while (tit.hasNext()) {
			term = tit.next();
			
			particle = term.getParticle();
			if (particle != null) {
				/* the term is a Particle -- an adverb phrase attached to a verb form */
				/* does it match the token stream? */
				end = matchTerm(term, start, false);
				if (end != null) {
					match = new TermToken(term, TermToken.PARTICLE, particle, start, end);
					if (result == null) {
						result = new Token();
						result.kind = TokenKind.USER;
					}
					result.addTerm(match);
				}
			}
		}
		
		/* Now resolve collisions */
		resolveMatches(result);
		return result;
	}
	
	/** matchTerm (term)
	 * test for a match between this term and a given point in the Token stream
	 * @param term = the term to be matched
	 * @param token = the first token of the term (known to match)
	 * @param verb = true if the term refers to a VocVerb, else false
	 * @return the last Word token of the term if the term matches, else null
	 */
	public static Token matchTerm(Term term, Token token, boolean verb)
	{
		Token last;
		Word word;
		
		/* if the term has only one word, it matches
		 * (we are only looking at Terms that begin with the Token word) */
		int size = term.getWords().size();
		if (size == 1) return token;

		/* otherwise compare the Term words with the Token words */
		last = token;
		for (int w = 0; w < size; ++w) {
			if (token == null) return null;
			word = term.getWords().get(w);
			if (word == token.getWord()) {
				/* match, continue */
				last = token;
				token = token.next;
			} else if (verb) {
				if (word.isArticle()) {
					/* in a verb, an article is matched by any article,
					 * or by nothing */
					if (token.getWord().isArticle())
						token = token.next;
				} else if (word == VocKey.fillWord) {
					/* the fillWord allows 
					 *   'as' [ genitive | article ] | article
					 * or nothing */
					if (token.getWord().isKeyword(KeywordKind.KAS)) {
						token = token.next;
						if (token.getWord().isArticle() 
						 || token.getWord().isKeyword(KeywordKind.GENITIVE)) {
							token = token.next;
						}
					} else if (token.getWord().isArticle()) {
						token = token.next;
					}
				} else {
					/* word must match, and it didn't, fail */
					return null;
				}
			} else {
				/* no match, fail */
				return null;
			}
		}
		/* all the Term words were matched, return the last position */
		return last;
	}


	/** resolveMatches()
	 *  routine to sort matches by size and organize duplicates,
	 * The following multiple match situations can arise:
	 *  - multiple distinct noun/verb/adjective phrases that begin with the same word(s)
	 *    these can be distinguished by the length of the match
	 *    the maximal match is preferred, but all are recorded
	 *  - type nouns that are used as role nouns
	 *    these are distinguished by context
	 *    roles may or may not be eligible to match (see matchNoun)
	 *    roles override type nouns if matched, 
	 *    exception: the property range role
	 *  - property nouns that are identical to type nouns
	 *    these can be distinguished by the property link word(s)
	 *    except when the property noun is used as a pseudo type noun
	 *    TODO: Noun before Property?
	 *  - noun phrase followed by a verb phrase that looks like the 
	 *    continuation of another noun phrase
	 *    resolved by substitute and retry
	 * 
	 * @param base = the Word token that owns all the matching Term tokens
	 */
	private static void resolveMatches(Token base)
	{
		boolean swap;
		TermToken t, tnext;
		Token tlast;
		
		/* if the list is empty, or has only one entry, return it */
		if (base == null || ! base.hasAlt()) return;
		
		for (swap = true; swap; ) {
			swap = false;
			tlast = base;
			for (t = base.getAlt(); t.hasAlt(); t = tnext) {
				tnext = t.getAlt();
				if (t.termsize() < tnext.termsize()) {
					/* if the shorter term precedes the longer term, swap them */
					tlast.altTerm = tnext;
					t.altTerm = tnext.altTerm;
					tnext.altTerm = t;
					swap = true;
					tlast = tnext;
					tnext = t;	/* compare this one to the new next */
				} else if (t.termsize() == tnext.termsize()) {
					/* if the terms are equal in size, they are identical 
					 * if a Noun and a Role have the same name, use only the Role */
					if (t.termkind == TermToken.NOUN && tnext.termkind == TermToken.ROLE) {
						/* remove the Noun token */
						tlast.altTerm = tnext;
						// delete(t);
						/* tlast does not change, tnext is next */
						swap = true;
						
					} else if (t.termkind == TermToken.NOUN && tnext.termkind == TermToken.PROPERTY) {
						/* if the noun precedes the property, swap them
						 * property parses will fail if the particle is missing
						 */
						tlast.altTerm = tnext;
						t.altTerm = tnext.altTerm;
						tnext.altTerm = t;
						swap = true;
						tlast = tnext;
						tnext = t;	/* compare this one to the new next */
					
						
					/* if a Particle precedes anything else, swap it 
					 * ** there won't be any Particles on the list (see findMatches)
					} else if (t.termkind == TermToken.PARTICLE 
							&& tnext.termkind != TermToken.PARTICLE) {
						tlast.altTerm = tnext;
						t.altTerm = tnext.altTerm;
						tnext.altTerm = t;
						swap = true;
						tlast = tnext;
						tnext = t;
					 */
						
					} else if (t.termkind == tnext.termkind) {
						if (t.termkind == TermToken.NOUN || t.termkind == TermToken.ADJECTIVE) {
							RECONManager.errorlog.println("*** Unresolvable Term " + t.term.getText());
							/* just return both */
						}
						tlast = t;
					}
				} else {
					/* the terms are in order, longer then shorter */
					tlast = t;
				}
			}
		}
	}

	/** tokenIsProper(token)
	 * 
	 * @param token = the token to be examined
	 * @return true if the token may be a proper name element, else false
	 */
	private static boolean tokenIsProper(Token token)
	{
		/* it is not a proper name if it is not a 'name' (word) token */
		if (token.getKind() != TokenKind.NAME) return false;
		
		/* it is not a proper name if it is a term */
		if (token.getAlt() != null) return false;

		/* it is not a proper name if it is a keyword */
		if (token.isAnyKeyword()) return false;
		
		/* if the token word begins with a capital letter, 
		 * it may be (part of) a proper name; if not, reject it */
		return Character.isUpperCase(token.getWord().external().charAt(0));
	}
	
	/** makeProperNameToken(start token)
	 * collect a sequence of capitalized words and make a new proper name
	 * and a corresponding alternate term for the current (start) token
	 * 
	 * @param start = the first token of the proper name
	 * @return the proper name or null
	 */
	private static void makeProperNameToken(Token start)
	{
		/* try again to match this token with a ProperName term
		 * if we find one, return */
		findMatches(start);
		if (start.getAlt() != null) return;
		
		/* this is a new ProperName, collect the term */
		Term term = theVocFactory.createTerm();
		String text = null;

		/* the Term may be multiple such words */
		Token end = start;
		for (Token token = start; tokenIsProper(token); token = token.next) {
			term.addWord(token.getWord());
			if (text == null)
				text = token.getWord().external();
			else
				text += ' ' + token.getWord().external();
			end = token;
		}
		term.setText(text);
		start.getWord().addUsage(term);
		
		/* now create the Proper Name entry in the Vocabulary */
		RECONManager.errorlog.println("*** Assuming '" + text + "' is a proper name.");
		VocName vname = theVocFactory.createVocName();
		RECONManager.theVocabulary.addItem(vname);
		vname.addTerm(term);
		
		/* now make the matching TermToken */
		start.addTerm(new TermToken(term, TermToken.PROPERNAME, vname, start, end));
	}

	/** useAlternateToken(Token)
	 * replace the given Token with its next alternate, 
	 * or the base token, if no remaining alternates
	 * @param token = the current token in the stream
	 * @return the token substituted
	 */
	private static Token useAlternateToken(Token token)
	{
		Token tt;	/* the replacement token */

		/* first, clear the parse of the token to be replaced */
		if (token.kind == TokenKind.TERM) ((TermToken)token).parse = null;
		
		/* if the passed token has an alternate,
		 * the alternate becomes the replacement
		 * otherwise the base (non-TERM) token becomes the replacement
		 */
		tt = token.altTerm;
		if (tt == null) {
			/* no alternate. If 'token' is a Word token, just return it */
			if (token.kind != TokenKind.TERM) return token;
			/* if token is a TERM token, the last alternate is the base */
			tt = ((TermToken)token).base;
		}
		
		/* now splice the replacement into the stream,
		 * first the head */
		if (token.prev == null) {
			/* first token, follows the stream head */
			stream.next = tt;
			tt.prev = null;
		} else {
			token.prev.next = tt;
			tt.prev = token.prev;
		}
		
		/* remove the old tail (it is probably different) */
		if (token.next == null) {
			if (token.kind == TokenKind.TERM)
				stream.prev = ((TermToken)token).endtoken;
			else
				stream.prev = token;
		} else if (token.kind == TokenKind.TERM) {
			token.next.prev = ((TermToken)token).endtoken;
		} else {
			token.next.prev = token;
		}
		/* link in the new one */
		if (tt.next == null) {
			stream.prev = tt; /* end of stream */
		} else {
			tt.next.prev = tt;
		}
		return tt;
	}
	
	/** findDecisionToken(end)
	 * find the last Token at which a Term was substituted
	 * @param end = the last token used in the parse attempt
	 * @return the last token that was substituted
	 */
	private static TermToken findDecisionToken(Token end)
	{
		/* find a term token going backwards 
		 * Note: this test ignores base terms that have Term alternates,
		 * because the base is in line only when the alternates have failed */
		while (end.kind != TokenKind.TERM) {
			end = end.prev;
			if (end == null) return null; /* no find */
		}
		return (TermToken)end;
	}
	
	/** resetDecisions(from token)
	 * change this decision to the next alternate
	 * and reset all later decisions to base.altTerm
	 * @param decpt = the alternative to be replaced
	 */
	private static void resetDecisions(TermToken decpt)
	{
		Token token;
		
		/* replace this TermToken with the next alternate or the base Word */
		token = useAlternateToken(decpt);

		/* now reset all decision points further down the stream
		 * anything beyond the parseStop will not change, but the
		 * parseStop itself may, or may be subsumed in another replacement
		 */
		for (token = token.next; token != null; token = token.next) {
			if (token.kind == TokenKind.TERM) {
				((TermToken)token).parse = null;
				/* if this is not the first alternate, use the first one */
				if (token != ((TermToken)token).base.altTerm)
					token = useAlternateToken(((TermToken)token).base);
			} else if (token.altTerm != null) {
				/* if this is a base term, use the first alternate */
				token = useAlternateToken(token);
			}
		}	

	}

	/** getTokenList()
	 *  return an array of Tokens for the active Token Stream
	 *  this list is attached to Errors and used by diagnostic code
	 */
	public static Token[] getTokenList()
	{
		Token t;

		/* if we already made a list for this version of the stream,
		 * return the one we made */
		if (tokenlist != null) return tokenlist;

		/* otherwise, make a list */
		int size = 0;
		for (t = stream; t != null; t = t.next()) ++size;
		tokenlist = new Token[size];
		size = 0;
		for (t = stream; t != null; t = t.next()) {
			tokenlist[size++] = t;
		}
		return tokenlist;
		
	}

	/** printLine(source)
	 * print the text line being parsed
	 */
	public static void printLine()
	{
		if (linePrinted) return;
		RECONManager.errorlog.println();
		source.printLine(RECONManager.errorlog);
		linePrinted = true;
	}
}
