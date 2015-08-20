/* Rewrite.java
 *  methods for rewriting parse structures 
 *  to simplify their conversion to formal models
 *  @author Ed Barkmeyer, February, 2011
 *		revised Sep, 2011, v0.15 to note group expansion problem
 *		revised Nov, 2011, v0.18 to rewrite ...N quantifiers (makeCollection)
 *		revised Nov, 2012, v0.21 to support pronoun reference and simplify inAntecedent
 *
 */
package core;

import NBVR.Grammar.*;
import NBVR.Vocabulary.*;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class Rewrite {

	/* the GrammarFactory -- used to construct all the syntactic objects */
	public static final GrammarFactory theGrammar = GrammarFactory.eINSTANCE;

	/** Rewrite.sentence(sentence)
	 * rewrites the sentence and all its subclauses for logical rendering
	 * it may do nothing
	 * @param s = the original Sentence (as parsed)
	 * @return the rewritten Sentence (or the original)
	 */
	public static Sentence sentence(Sentence s)
	{
		return rewriteSentence(s);
	}
	
	/** Rewrite.nounPhrase(np)
	 * rewrites a noun phrase (definition), expanding properties and groups
	 * @param np = the Noun Phrase to be rewritten
	 * @return the rewritten Noun Phrase
	 */
	public static RolePhrase nounPhrase(RolePhrase np)
	{
		RolePhrase rp = (RolePhrase)rewriteRolePhrase(np, null);
		/* if the definition is a group, it must be a CHOICE construct */
		if (rp.getType() == PhraseType.GROUP) {
			if (((GroupPhrase)rp).getKind() == GroupKind.CHOICE) {
				np = makeChoiceNoun((GroupPhrase)rp, QuantifierKind.QAN);
				if (np != null) return np;
			}
		}
		return rp;
	}
	

	/** rewriteSentence(sentence)
	 * rewrites the sentence and all its subclauses for logical rendering
	 * it may do nothing
	 * @param s = the original Sentence (as parsed)
	 * @return the rewritten Sentence (or the original)
	 */
	private static Sentence rewriteSentence(Sentence s)
	{
		if (s == null) return null;
		
		switch (s.getType().getValue()) {
		case SentenceType.SIMPLE_VALUE:
			s = rewriteSimpleForm((SimpleForm)s);
			break;
		case SentenceType.COMPOUND_VALUE:
			s = rewriteCompoundForm((CompoundForm)s);
			break;
		case SentenceType.DOMAIN_VALUE:
			s = rewriteDomainForm((DomainForm)s);
			break;
		case SentenceType.MODAL_VALUE:
			s = rewriteModal((DomainForm)s);
			break;
		case SentenceType.IMPLICATION_VALUE:
			s = rewriteImplicationForm((ImplicationForm)s);
			break;
		case SentenceType.EQUIVALENCE_VALUE:
			s = rewriteEquivalence((CompoundForm)s);
			break;
		default:
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Internal error: Rewriting unknown sentence type: "
					+ s.getType().toString());
			return s;
		}

		return s;
	}

	/** rewriteCompoundForm(sentence)
	 * rewrites as needed all component sentences involved
	 * @param s = the sentence to be rewritten, or returned
	 * @return the original Sentence, with some statements rewritten
	 */
	private static Sentence rewriteCompoundForm(CompoundForm s)
	{
		ListIterator<Sentence> list = s.getStatements().listIterator();
		while (list.hasNext()) {
			Sentence stmt = list.next();
			Sentence newstmt = rewriteSentence(stmt);
			if (newstmt != stmt) list.set(newstmt);
		}
		return s;
	}

	/** rewriteSimpleForm(sentence)
	 * rewrites as needed the VerbPhrase and all RolePhrases involved
	 * @param s = the sentence to be rewritten, or returned
	 * @param inAnte = true if this is part of an antecedent, else false
	 * @return a SimpleForm or CompoundForm resulting from expanding the RolePhrases
	 */
	private static Sentence rewriteSimpleForm(SimpleForm s)
	{
		RolePhrase role;
		int r;

		/* don't process the SimpleForm more than once */
		if (s.isDone()) return s;
		
		/* convert the grammatical role phrases structure to an array */
		s.makeRolesArray();
		
		/* first, expand any GroupPhrase in the SimpleForm
		 * and resolve any unresolved Pronouns */
		for (r = 0; r < s.getRoles().length; ++r) {
			role = s.getRole(r);
			if (role != null) {
				if (role.getType() == PhraseType.GROUP) {
					/* group is both A and B, either A or B, neither A nor B
					 * AndForm and NorForm rewrite to compound sentences
					 * If that happens, process the compound form */
					Sentence base = expandGroup(s, r);
					if (base != s) 
						return rewriteCompoundForm((CompoundForm)base); 
				}
				/* now process pronouns */
				if (role.getType() == PhraseType.PRONOUN) {
					/* Resolve unknown references */
					if (role.getReferent() == null) {
						if (((Pronoun)role).getKeyword().isKeyword(KeywordKind.KSELF)) {
							/* A selfPronoun always refers to the subject of the clause in 
							 * which it appears, i.e., the domain of the SimpleForm s */
							role.setReferent(s.getDomain());
						} else {
							// TODO: complete Pronoun rewrite (or disable it)
							/* If a basePronoun appears in a qualifier in a nounPhrase that is not 
							 * the subject of the clause in which the pronoun occurs, 
							 * the pronoun refers to the subject of the clause that contains the nounPhrase. */
							if (s.getParent().getElementKind() == ElementKind.QUALIFIER) {
								/* s is a qualifier, what does it qualify */
								
							}
							/* Otherwise, the basePronoun should only appear in the subject of a
							 * clause, and it refers to the subject of the preceding clause.
							*/
						}
					}
				}
			}
		}

		/* the form really is a SimpleForm */
		
		/* extract modality from the SimpleForm before creating DomainForms */
		DomainForm modal = null;
		if (s.getModality() != Modality.NONE) {
			modal = theGrammar.createDomainForm();
			modal.setDomain(null);
			/* MOVE the modality from s to the modal DomainForm */
			modal.setModality(s.getModality());
			s.getVerb().setModality(Modality.NONE);
		}
		
		/* Extract the quantified property and type nouns into DomainForms
		 * and rewrite the PropertyNoun roles into qualified TypeNouns
		 */
		DomainForm chain = null;
		for (r = 0; r < s.getRoles().length; ++r) {
			role = s.getRole(r);
			if (role != null) {
				/* introduce a DomainForm for a quantified Term,
				 * and for all terms in a composition of properties */
				DomainForm dform = makeDomainChain(role);
				if (dform != null) {
					/* substitute a pronoun for the use of the quantified Term in s */
					Pronoun them = makePronoun(VocKey.theyWord, role);
					them.setRolePlayed(role.getRolePlayed());
					s.setRole(r, them);
					/* add this domain chain to the chain for the whole SimpleForm */
					if (chain == null) {
						/* if this is the first, it is the head of the chain */
						chain = dform;
					} else {
						addToDomainChain(chain, dform);
					}
				} else {
					s.setRole(r, rewriteRolePhrase(role, s));
				}
			}
			/* if we just completed the subject role, and there is a modality,
			 * add the modality to the chain */
			if (r == 0 && modal != null) {
				if (chain == null) {
					/* if the subject was not quantified, the modality is the head of the chain */
					chain = modal;
				} else {
					addToDomainChain(chain, modal);
				}
			}
		}
		
		/* all of the quantifiable role players in the SimpleForm 
		 * (TypeNouns and PropertyNouns) have become domains on the chain
		 * The Roles in the SimpleForm s are instances, pronouns, and back references
		 */
		s.setDone(true);	// don't do it again
		
		/* if there is no chain, just return the SimpleForm */
		if (chain == null) return s;
		
		/* we created a domain chain, 
		 * it rewrites the SimpleForm, and inherits its ancestry
		 * and the SimpleForm goes on the end of the chain */
		chain.setRewrites(s);
		chain.setParent(s.getParent());
		addToDomainChain(chain, s);
		
		/* now rewrite the domains on the chain */
		chain = rewriteDomainForm(chain);

		return chain;
	}

	/** expandGroup(stmt, index)
	 * rewrites "both A and B", " "either A or B", "neither A nor B" and "A but not B"
	 * This is complex:
	 *   in the And ... Together case, the group phrase becomes a Set
	 *   in the simple And case, expanding the group produces a compoundForm
	 *   in the special case Or or Nor of instances and existentials, 
	 *   	the GroupPhrase becomes a qualified Thing
	 *   in the remaining Or and Nor cases, the expansion is a compoundForm
	 *   	in those Nor cases, the result is an And-form with the quantifiers negated
	 *   in the but not case, the result is an And-form with the second operand modified
	 * @param stmt = the SimpleForm sentence in which the GroupPhrase plays a role
	 * @return the corresponding sentence
	 * 
	 * TODO: Correct Group expansion for quantifications:
	 */
	private static Sentence expandGroup(SimpleForm stmt, int index)
	{
		GroupPhrase group = (GroupPhrase)stmt.getRole(index);
		RolePhrase rp;

		switch (group.getKind().getValue()) {
		case GroupKind.JOINT_VALUE:
			/* replace 'both A and B together' with 'the set of thing that is A or that is B' */
			stmt.setRole(index, makeJointNoun(group));
			return stmt;
		case GroupKind.ALL_VALUE:
			/* Simple AND case, make a compound form using the and'ed role phrases */
			return makeCompoundNoun(stmt, index, Connective.AND);
		case GroupKind.CHOICE_VALUE:
			/* try to replace the Group A or B with 'any thing that is A or that is B */
			rp = makeChoiceNoun(group, QuantifierKind.QANY);
			if (rp != null) {
				stmt.setRole(index, rp);
				return stmt;
			}
			/* otherwise make a compound form using the or'ed role phrases */
			return makeCompoundNoun(stmt, index, Connective.OR);
		case GroupKind.NEITHER_VALUE:
			/* try to replace the Group A or B with 'no thing that is A or that is B */
			rp = makeChoiceNoun(group, QuantifierKind.QNO);
			if (rp != null) {
				stmt.setRole(index, rp);
				return stmt;
			}
			/* otherwise make a compound form by negating the original statement 
			 * and use the member roles in an AndForm
			 * xxx 'neither A nor B' yyy becomes: not xxx A yyy and not xxx B yyy */
			negate(stmt);
			return makeCompoundNoun(stmt, index, Connective.AND);
		case GroupKind.INSTEAD_VALUE:
			/* A but not B does X = A does X and B does not X */
			CompoundForm exp = theGrammar.createCompoundForm(Connective.AND);
			Parser.theParse.addElement(exp);
			exp.getStatements().add(stmt);
			stmt.setRole(index, group.getMembers().get(0));
			SimpleForm dup = copySimpleForm(stmt, index);
			dup.setRole(index, group.getMembers().get(1));
			negate(dup);
			exp.getStatements().add(dup);
			return exp;

		default: /* impossible */
			return null;
		}
	}

	/** makeCompoundNoun(SimpleForm, index, connective)
	 * From a SimpleForm with a group role phrase, make a CompoundForm
	 * with one version of the original SimpleForm for each member of the group in that role
	 * @param stmt = the original SimpleForm sentence
	 * @param index = the position of the group role
	 * @param c = the connective (And or Or) for the CompoundForm
	 * @return the resulting CompoundForm
	 */
	private static Sentence makeCompoundNoun(SimpleForm stmt, int index, Connective c)
	{
		SimpleForm dup;
		
		/* create the CompoundForm object, with the given connective */
		CompoundForm exp = theGrammar.createCompoundForm(c);
		Parser.theParse.addElement(exp);

		/* use the original sentence as the first element of the compound.
		 * changing the target role to the first element of the group */
		exp.getStatements().add(stmt);
		GroupPhrase group = (GroupPhrase)stmt.getRole(index);
		stmt.setRole(index, group.getMembers().get(0));
		
		/* now for each other member of the group,
		 * make a copy of the original SimpleForm and replace the Group role with that member
		 */
		for (int m = 1; m < group.getMembers().size(); ++m) {
			/* add to the compound a copy of the sentence,
			 * changing its subject to the mth member of the group */
			dup = copySimpleForm(stmt, index);
			dup.setRole(index, group.getMembers().get(m));
			exp.getStatements().add(dup);
		}
			
		return exp;
	}

	/** makeCompoundNoun(group, quantifier)
	 *  Convert a GroupPhrase of the form 'A or B' or 'A and B together'
	 *   to 'thing that is A or B' with the appropriate quantifier (any or all)
	 * @param group = the GroupPhrase that is to be converted
	 * @return the qualified noun phrase
	 */
	private static RolePhrase makeChoiceNoun(GroupPhrase group, QuantifierKind q)
	{
		int mem;

		/* first check that the group has a Choice form
		 * that is, consists only of instances and existentials
		 */
		for (mem = 0; mem < group.getMembers().size(); ++mem) {
			RolePhrase rp = group.getMembers().get(mem); 
			if (rp.getType() == PhraseType.TYPE_NOUN || rp.getType() == PhraseType.PROPERTY) {
				/* A type noun or property noun must have an existential quantifier */
				QuantifierKind kind = ((ModifiedTerm)rp).getQuantifier().getKind();
				if (kind == QuantifierKind.QANY) {
					/* if it is 'any', make it existential */
					kind = QuantifierKind.QAN;
					((ModifiedTerm)rp).getQuantifier().setKind(kind);
				}
				if (kind != QuantifierKind.QAN) {
					/* some other quantifier, too complex for a choice */
					return null;
				}
			} else if (rp.getType() != PhraseType.INSTANCE) {
				/* not an existential or an instance, ergo, not a Choice */
				return null;
			}
		}
		
		/* create the base TypeNoun */
		TypeNoun noun = makeTypeNoun(VocBase.vocThing, q);
		
		/* now create a compound qualifier */
		QualifierChain 	chain = theGrammar.createQualifierChain();
		Parser.theParse.addElement(chain);
		
		/* for each group member, make one Qualifier and add it to the chain */
		for (mem = 0; mem < group.getMembers().size(); ++mem) {
			SimpleForm thatismem = makeSimpleForm(VocBase.vocIs, 
					makePronoun(VocKey.thatWord, noun), group.getMembers().get(mem));
			SimpleQualifier qual = makeQualifier(thatismem);
			chain.getQualifiers().add(qual);
			qual.setParent(chain);
		}
		noun.getQualifiers().add(chain);
		chain.setParent(noun);
		return noun;
	}

	/** makeJointNoun
	 * convert both all/some X and all/some Y and instance Z together to some set S such that 
	 *  all/some X are members of S and all/some Y are members, and Z is a member, and
	 *  nothing that 'is not an' X and 'is not a' Y and is not Z is a member.
	 * 
	 * @param group = the joint group phrase to be rewritten
	 * @return
	 */
	private static RolePhrase makeJointNoun(GroupPhrase group)
	{
		// TODO: complete the Rewrite of Joint groups
		return group;
	}
	
	/** makeDomainChain(role, slot)
	 * create a chain of DomainForms to introduce the domains of properties
	 * with their quantifiers and qualifiers
	 * if the input form is:  the X of some Y of every Z
	 * the output will be:  for every Z, for some Y of the Z, the X of the Y
	 *  
	 * @param role = the phrase that plays some verb role
	 * @return the base of the DomainForm chain, or null
	 */
	private static DomainForm makeDomainChain(RolePhrase role)
	{
		/* make a domain form for Type or Property noun in the role */
		DomainForm base = makeDomainForm(role);
		/* not a Type or Property noun, nothing to do */
		if (base == null) return null;
		
		/* descend the chain until we find a domain that is not a property,
		 * recording the owner PropertyNoun of each domain phrase */
		while (role.getType() == PhraseType.PROPERTY) {
			SimpleNounPhrase pdomain = ((PropertyNoun)role).getDomain();
			/* create the DomainForm for the Property domain */
			DomainForm dform = makeDomainForm(pdomain);
			/* if it was a back reference, we are done */
			if (dform == null) return base; 
			
			/* the DomainForm chain is inverted (a stack)
			 * outermost domain is innermost DomainForm */
			dform.setStatement(base);
			base.setParent(dform);
			base = dform;
			
			/* make a pronoun and substitute it for the domain as the Property domain */
			((PropertyNoun)role).setDomain(makePronoun(VocKey.theyWord, pdomain));

			/* now move down the property chain if any */
			role = pdomain;
		}
		
		/* return the outermost DomainForm */
		return base;
	}

	/** makeDomainForm(RolePhrase)
	 * make a DomainForm for the RolePhrase object, if it is eligible,
	 * i.e., a TypeNoun or PropertyNoun that is not a back reference
	 * 
	 * @param role = the object that is to have the quantified domain form
	 * @return the domain form, or null, if the object is ineligible
	 */
	private static DomainForm makeDomainForm(RolePhrase role)
	{
		/* don't process a term that is a back reference */
		if (role.getReferent() != null) return null;
		
		/* if the role is not a PropertyNoun or a TypeNoun, nothing to do */
		if (role.getType() != PhraseType.PROPERTY
		 && role.getType() != PhraseType.TYPE_NOUN) return null;

		/* create the domain form for the TypeNoun or PropertyNoun */
		DomainForm dform = theGrammar.createDomainForm();
		Parser.theParse.addElement(dform);
		dform.setDomain(role);
		return dform;
	}
	
	/** addToDomainChain(chain, sentence)
	 * adds one item at the end of a DomainForm chain
	 * @param head = the outermost DomainForm
	 * @param sentence = the Sentence to be added at the end
	 */
	private static void addToDomainChain(DomainForm chain, Sentence sentence)
	{
		while (chain.getStatement() != null) chain = (DomainForm)chain.getStatement();
		chain.setStatement(sentence);
		sentence.setParent(chain);
	}

	/** rewriteModal(DomainForm)
	 * rewrite the Statement operand of a Modal DomainForm
	 * @param s = the Modal form
	 * @return s, with a possible substitution for its scope statement
	 */
	private static DomainForm rewriteModal(DomainForm s)
	{
		if (s.getStatement() == null) return s;
		s.setStatement(rewriteSentence(s.getStatement()));
		return s;
	}
	
	/** rewriteDomainForm(sentence)
	 * rewrite the domain operand of a DomainForm 
	 *   there is an X that ... or for each X of Y, ...
	 *   
	 * @param dform = the DomainForm whose operand is to be rewritten
	 * @return the DomainForm, as modified
	 */
	private static DomainForm rewriteDomainForm(DomainForm dform)
	{
		if (dform == null) return null;
		ModifiedTerm term = (ModifiedTerm)dform.getDomain();
		/* distinguish real domains from modals */
		if (term != null) {
			/* If the domain quantifier is AtLeastN, AtMostN, etc.
			 * and the noun or property range is not a mass noun,
			 * restructure the clause */
			if (! hasSimpleQuantifier(term) && ! isMassNoun(term))
				makeCollectionForm(dform);
			dform.setDomain(rewriteRolePhrase(dform.getDomain(), dform));
		}
		/* always rewrite the scope */
		dform.setStatement(rewriteSentence(dform.getStatement()));
		return dform;
	}
	
	/** makeCollectionForm(DomainForm)
	 * rewrite 
	 *   for Quantifier Term, Statement 
	 * as
	 *   for the collection c that hasMember every Term
	 *   the quantity that is the quantified property of c is quantifier
	 *   
	 * where the quantified property of c is:
	 *   quantifier.quantity.dimension.unit.property 
	 *   or a suitable substitute
	 * 
	 * @param term = the term with the xxx_N quantification
	 * @param sentence = the SimpleForm sentence being rewritten, if any
	 */
	private static void makeCollectionForm(DomainForm baseform)
	{
		/* The baseform is: for quantifier term, statement */
		/* Get the term we are actually qualifying */
		ModifiedTerm term = (ModifiedTerm)baseform.getDomain();
		
		/* save its quantifier for collection quantity comparison */
		Quantifier termq = term.getQuantifier();

		/* change the term quantifier to All
		 * all term that meet the requirements are collection members */
		term.setQuantifier(makeQuantifier(QuantifierKind.QALL));
		
		/* make the collection */
		TypeNoun collection = makeTypeNoun(VocBase.vocCollection, QuantifierKind.QTHE);
		
		/* create the membership statement: the collection contains all term */
		SimpleForm qsentence = makeSimpleForm(VocBase.vocHasMember, 
				makePronoun(VocKey.thatWord, collection), term);
		
		/* create the collection qualifier: 
		 * (collection) hasMember (term) iff (term) satisfies the statement of baseform
		 */
		CompoundForm eqv = theGrammar.createCompoundForm(Connective.EQV);
		Parser.theParse.addElement(eqv);
		eqv.getStatements().add(qsentence);
		eqv.getStatements().add(baseform.getStatement());
		collection.getQualifiers().add(makeQualifier(eqv));
		
		/* Replace the baseform DomainForm with:
		 * for the collection c ..., the quantified property of c is quantifier
		 */
		baseform.setDomain(collection);
		
		/* Make the quantity comparison sentence that is the scope of the DomainForm */
		baseform.setStatement(makeQuantityComparison(collection, termq));
	}

	/** rewriteImplicationForm(sentence)
	 * rewrites as needed the antecedent, consequent and alternative sentences
	 * @param s = the sentence to be rewritten, or returned
	 * @return
	 */
	private static Sentence rewriteImplicationForm(ImplicationForm s)
	{
		switch (s.getKind().getValue()) {
		case Connective.ONLY_IF_VALUE:
			/* ONLY IF: rewrites as an IF form 
			 * Parser interprets P only if Q as If P then Q */
			s.setKind(Connective.IF);
			/* fall thru */
		case Connective.IF_VALUE:
			/* IF: rewrites as needed the antecedent, consequent and alternative sentences */
			s.setAntecedent(rewriteSentence(s.getAntecedent()));
			s.setConsequent(rewriteSentence(s.getConsequent()));
			s.setAlternative(rewriteSentence(s.getAlternative()));
			return s;
		case Connective.UNLESS_VALUE:
			/* UNLESS: rewrites as an IF form
			 * Parser interprets P unless Q as unless Q, P
			 * we convert to if not Q, then P */
			s.setKind(Connective.IF);
			s.setAntecedent(rewriteSentence(negate(s.getAntecedent())));
			s.setConsequent(rewriteSentence(s.getConsequent()));
			return s;
		default: 
			/* nothing else should be possible */
			RECONManager.errorlog.println(
				"*** Internal error: Rewriting unknown Implication kind: " 
				+ s.getKind().getName());
			return s;
		}		
	}

	/** rewriteEquivalence(sentence)
	 * rewrites as needed the equivalent sentences
	 * @param s = the sentence to be rewritten, or returned
	 * @return
	 */
	private static Sentence rewriteEquivalence(CompoundForm s)
	{
		ListIterator<Sentence> list = s.getStatements().listIterator();
		while (list.hasNext()) {
			Sentence stmt = list.next();
			Sentence newstmt = rewriteSentence(stmt);
			if (newstmt != stmt) list.set(newstmt);
		}
		return s;
	}

	/** negate(Sentence)
	 * rewrites the sentence by negating the verbs and reversing the ANDs and ORs
	 * Note: the interpretation of Must Not is Prohibited
	 *   and the interpretation of May Not is Permitted that not
	 * @param s = the sentence to be negated
	 * @return the negated form
	 */
	private static Sentence negate(Sentence s)
	{
		if (s == null) return null;
		switch (s.getType().getValue()) {
		case SentenceType.SIMPLE_VALUE:
		case SentenceType.DOMAIN_VALUE:
			/* for SimpleForms and DomainForms, just negate the form
			 * we will optimize later */
			return makeNegation(s);
		case SentenceType.MODAL_VALUE:
			((DomainForm)s).setModality(negateModality(((DomainForm)s).getModality()));
			return s;
		case SentenceType.COMPOUND_VALUE:
			return negateCompoundForm((CompoundForm)s);
		case SentenceType.EQUIVALENCE_VALUE:
			return makeNegation(s);
		default:
			ParseManager.printLine();
			RECONManager.errorlog.println(
					"*** Internal Error -- invalid operand of Negate.");
			return s;
		}
	}		

	/** negateModality()
	 * returns the logical negation of the given modality
	 * @param m = the modality to be negated
	 * @return the logical negation of m
	 */
	private static Modality negateModality(Modality m)
	{
		switch (m.getValue()) {
		case Modality.NONE_VALUE:
			/* not P is (not P) */
			return Modality.NEGATION;
		case Modality.NEGATION_VALUE:
			/* not (not P) is P */
			return Modality.NONE;
		case Modality.OBLIGATION_VALUE:
			/* not (obligated p) = permitted (not p) */
			return Modality.PERMITTED_NOT;
		case Modality.PROHIBITION_VALUE:
			/* not (prohibited p) = permitted p */
			return Modality.PERMISSION;
		case Modality.PERMISSION_VALUE:
			/* not (permitted p) = prohibited p */
			return Modality.PROHIBITION;
		case Modality.POSSIBILITY_VALUE:
			return Modality.IMPOSSIBILITY;
		case Modality.IMPOSSIBILITY_VALUE:
			return Modality.POSSIBILITY;
		default: 
			/* TODO: PREFERENCE (should), ANTIPREFERENCE */
			ParseManager.printLine();
			RECONManager.errorlog.println(
				"*** Internal Error -- invalid Modality in Negate -- '" + m.getName() +"'");
			return Modality.NONE;
		}
	}

	/** negateCompundForm(CompoundForm)
	 * rewrites the sentence by negating the verbs and reversing the ANDs and ORs
	 * @param s = the compound form to be negated
	 * @return the original form with Connectives and verbs reversed
	 */
	private static CompoundForm negateCompoundForm(CompoundForm s)
	{
		if (s.getKind() == Connective.AND)
			s.setKind(Connective.OR);
		else if (s.getKind() == Connective.OR)
			s.setKind(Connective.AND);
		else {
			ParseManager.printLine();
			RECONManager.errorlog.println(
				"*** Internal Error -- invalid Connective in Negate -- '" 
				+ s.getKind().getName() + "'");
			return s;
		}
		for (int elt = 0; elt < s.getStatements().size(); ++ elt) {
			negate(s.getStatements().get(elt));
		}
		return s;

	}

	/** makeNegation(sentence)
	 * create a Negation -- a DomainForm whose modality is Negation 
	 *   and whose scope is the passed sentence
	 * @param s = the sentence to be negated
	 * @return the "negation" DomainForm
	 */
	private static DomainForm makeNegation(Sentence s)
	{
		DomainForm neg = theGrammar.createDomainForm();
		Parser.theParse.addElement(neg);
		neg.setModality(Modality.NEGATION);
		neg.setParent(s.getParent());
		neg.setStatement(s);
		s.setParent(neg);
		return neg;
	}

	/** rewriteRolePhrase(phrase, sentence)
	 * adjusts Quantifiers, rewrites Modifiers as Qualifiers
	 * and rewrites PropertyNouns as TypeNouns with Qualifiers
	 * @param phrase = the RolePhrase object to be rewritten 
	 * @param s = the sentence in which the RolePhrase occurs
	 */
	private static RolePhrase rewriteRolePhrase(RolePhrase phrase, Sentence s)
	{
		/* if the phrase is nil or has a referent, nothing to do */
		if (phrase == null || phrase.getReferent() != null) return phrase;
		
		switch(phrase.getType().getValue()) {
		case PhraseType.TYPE_NOUN_VALUE:
			/* Convert the modifiers to qualifiers on the TypeNoun */
			rewriteQuantifier((TypeNoun)phrase, s);
			rewriteModifiers((TypeNoun)phrase);
			rewriteQualifiers((TypeNoun)phrase, s);
			return phrase;

		case PhraseType.PROPERTY_VALUE:
			/* if the property is already expanded, nothing needs to be done */
			TypeNoun exp = ((PropertyNoun)phrase).getExpansion();
			if (exp == null) {
				/* otherwise, rewrite the PropertyNoun as a TypeNoun and 
				 * then convert the modifiers to qualifiers on the TypeNoun
				 */
				rewriteQuantifier((PropertyNoun)phrase, s);
				exp = rewriteProperty((PropertyNoun)phrase);
				rewriteModifiers(exp);
				rewriteQualifiers(exp, s);
			}
			return exp;
			
		case PhraseType.GROUP_VALUE:
			/* rewrite the elements of a GroupPhrase */
			List<SimpleNounPhrase> group = ((GroupPhrase)phrase).getMembers();
			for (int m = 0; m < group.size(); ++m) {
				group.set(m, (SimpleNounPhrase)rewriteRolePhrase(group.get(m), s));
			}
			return phrase;
		
		case PhraseType.PRONOUN_VALUE:
			return phrase;
			
		case PhraseType.INTERROGATIVE_VALUE:
			/* rewrite the underlying role phrase */
			RolePhrase rp = rewriteRolePhrase(((QueryPhrase)phrase).getDomain(), s);
			if (rp.getType() == PhraseType.TYPE_NOUN) {
				((TypeNoun)rp).getQuantifier().setKind(QuantifierKind.QALL);
			}
			((QueryPhrase)phrase).setDomain(rp);
			return phrase;
			
		case PhraseType.INSTANCE_VALUE:
			/* instance has more special cases */
			return rewriteInstance((Instance)phrase, s);
			
		default:	/* pronouns, local names, and RoleNouns */
			return phrase;
		}

	}
	
	/** isMassNoun(ModifiedTerm)
	 * 
	 * @param term = a RolePhrase that is the domain of some DomainForm
	 * @return true if the term is or evaluates to a mass noun, else false
	 */
	private static boolean isMassNoun(ModifiedTerm term) 
	{
		if (term.getType() == PhraseType.TYPE_NOUN) {
			return ((TypeNoun)term).getNoun().isMassNoun();
		} else {
			return ((PropertyNoun)term).getProperty().getRange().isMassNoun();
		}
	}

	/** hasSimpleQuantifier(RolePhrase)
	 *  returns true if any of the following is true:
	 *    - the RolePhrase is not a TypeNoun or PropertyNoun
	 *    - the RolePhrase has no Quantifier
	 *    - the Quantifier is not ExactlyN, AtLeastN, AtMostN, MoreThanN or LessThanN
	 *  returns false only when the RolePhrase is a TypeNoun with a ...N Quantifier
	 * @param r = the RolePhrase to be tested
	 * @return = true unless r is a TypeNoun with a ...N Quantifier
	 */
	private static boolean hasSimpleQuantifier(RolePhrase r) 
	{
		if (r.getType() != PhraseType.TYPE_NOUN	&& r.getType() != PhraseType.PROPERTY) 
			return true;
		Quantifier q = ((ModifiedTerm)r).getQuantifier();
		if (q == null || q.getKind() == null) return true;
		
		switch (q.getKind().getValue()) {

		case QuantifierKind.AT_MOST1_VALUE:
		case QuantifierKind.EXACTLY1_VALUE:
			/* should create uniqueness rules, but currently treated as quantity */

		case QuantifierKind.EXACTLY_N_VALUE:
		case QuantifierKind.AT_LEAST_N_VALUE:
		case QuantifierKind.AT_MOST_N_VALUE:
		case QuantifierKind.MORE_THAN_N_VALUE:
		case QuantifierKind.LESS_THAN_N_VALUE:
			return false;
		default:
			return true;
		}
	}

	/** rewriteQuantifier(ModifiedTerm, Sentence)
	 * default missing quantifier to Any
	 * correct the Any quantifier to Some/An in antecedent, otherwise to All
	 * convert quantifications of mass nouns to quantity comparisons
	 * 
	 * @param term = the ModifiedTerm that is quantified
	 * @param s = the sentence in which the term occurs
	 */
	private static void rewriteQuantifier(ModifiedTerm term, Sentence s)
	{
		Quantifier q = term.getQuantifier();
		/* if there was no quantifier, use Any */
		if (q == null) {
			q = theGrammar.createQuantifier();
			if (isSubject(term, s))
				q.setKind(QuantifierKind.QANY);
			else
				q.setKind(QuantifierKind.QAN);
			term.setQuantifier(q);
		}
		
		QuantifierKind qkind = q.getKind();
		switch (qkind.getValue()) {
		case QuantifierKind.QAN_VALUE:
		case QuantifierKind.QTHE_VALUE:
		case QuantifierKind.QALL_VALUE:
		case QuantifierKind.QNO_VALUE:
			/* nothing to do */
			return;
		case QuantifierKind.QANY_VALUE:
			/* the meaning of Any is up to the Interpreter */
			return;
		case QuantifierKind.AT_LEAST1_VALUE:
			q.setKind(QuantifierKind.QAN);
			return;

		case QuantifierKind.AT_MOST1_VALUE:
		case QuantifierKind.EXACTLY1_VALUE:
			/* TODO: should create uniqueness rules, currently treated as quantity */
			
		case QuantifierKind.AT_LEAST_N_VALUE:
		case QuantifierKind.AT_MOST_N_VALUE:
		case QuantifierKind.EXACTLY_N_VALUE:
		case QuantifierKind.MORE_THAN_N_VALUE:
		case QuantifierKind.LESS_THAN_N_VALUE:
			/* rewrite  At most quantity of mass-noun 
			 *  to:  (a) mass-noun whose quantityKind is at most quantity
			 */
			if (isMassNoun(term)) {
				term.getQualifiers().add(makeQualifier(
					makeQuantityComparison(term, term.getQuantifier()) ));
				term.getQuantifier().setKind(QuantifierKind.QAN);
			}
		}
	}


	/** makeQuantityComparison(ModifiedTerm, Quantifier)
	 *  create a SimpleForm sentence that compares the property of the term
	 *  that corresponds to the unit of the Quantifier Quantity to the Quantity value
	 *  according to the QuantityKind
	 *  E.g., at least 50 kg of term becomes: 
	 *   (50 kg) is less than or equal to the mass that is the mass of term
	 *   
	 * @param term = the thing whose property is to be compared
	 * @param termq = the quantifier that defines the comparison
	 * @return the comparison sentence
	 */
	private static SimpleForm makeQuantityComparison(ModifiedTerm term, Quantifier q)
	{
		/* find the quantity kind property for the term
		 * from the term qualifier it is: 
		 *   q.quantity.dimension[0].unit.quantityKind
		 * with assorted caveats
		 */
		Quantity quantity = q.getQuantity();
		/* default kind of quantity is "quantity of" */
		VocProperty kindOfQuantity = VocBase.vocHasQuantity;
		if (quantity != null) {
			if (quantity.getDimension().isEmpty()) {
				/* the quantity has no unit, it is a 'count' */
				kindOfQuantity = VocBase.vocHasCount;
			} else	if (quantity.getDimension().size() == 1) {
				/* the quantity has exactly one unit,
				 * it may be associated with a property */
				Dimension dim = quantity.getDimension().get(0);
				if (dim.getExponent() == 1) {
					kindOfQuantity = dim.getUnit().getQuantityKind();
					if (kindOfQuantity == null) kindOfQuantity = VocBase.vocHasQuantity;
				}
			}
		} else {
			ParseManager.printLine();
			RECONManager.errorlog.println(
				"Internal error: Quantifier " + q.getKind().toString() 
				+ " without Quantity in makeQuantityComparison");
			return null;
		}

		/* create a SimpleForm sentence based on the verb from quantifier kind */
		
		/* if the term quantifier is Exactly N,
		 *   construct quantity 'is the property of' term
		 *   E.g. 50 kg is the mass of term
		 *   where kindOfQuantity is the property */
		if (q.getKind() == QuantifierKind.EXACTLY_N
				|| q.getKind() == QuantifierKind.EXACTLY1) {
			return makeSimpleForm(kindOfQuantity.getVerb(), quantity, 
					makePronoun(VocKey.theyWord, term));
		}
		
		/* if the quantifier is At least/most N or More/Less than N
		 *   construct the quantity that is the property of term
		 *   'is less than' (or 'is less or equal') quantity
		 *   E.g., the mass that is the mass of term is less than 50 kg
		 */
		TypeNoun qtype = makeTypeNoun(kindOfQuantity.getRange(), QuantifierKind.QALL);
		SimpleForm qsentence = makeSimpleForm(kindOfQuantity.getVerb(), 
				makePronoun(VocKey.thatWord, qtype), 
				makePronoun(VocKey.theyWord, term));
		qtype.getQualifiers().add(makeQualifier(qsentence));
		
		/* now make the comparison sentence */
		switch (q.getKind().getValue()) {
		case QuantifierKind.AT_LEAST1_VALUE:
		case QuantifierKind.AT_LEAST_N_VALUE:
			return makeSimpleForm(VocBase.vocLE, quantity, qtype);
		case QuantifierKind.AT_MOST1_VALUE:
		case QuantifierKind.AT_MOST_N_VALUE:
			return makeSimpleForm(VocBase.vocLE, qtype, quantity);
		case QuantifierKind.MORE_THAN_N_VALUE:
			return makeSimpleForm(VocBase.vocLT, quantity, qtype);
		case QuantifierKind.LESS_THAN_N_VALUE:
			return makeSimpleForm(VocBase.vocLT, qtype, quantity);

		default:
			ParseManager.printLine();
			RECONManager.errorlog.println(
				"Internal error: unexpected QuantifierKind "
				+ q.getKind().toString() + " in makeCollectionForm");
			return null;
		}
	}

	/** isSubject(role, sentence)
	 * returns true if the role is the subject of the sentence, else false
	 * 
	 * @param role = the candidate role phrase, usually a pronoun
	 * @param s = the sentence it appears in (somewhere)
	 * @return true if role is the subject of s, else false
	 */
	private static boolean isSubject(RolePhrase role, Sentence stmt)
	{
		/* check for Definitions, they exist as RolePhrases without sentences */
		if (stmt == null) return true;
		
		/* if stmt is a DomainForm, which it usually is,
		 * find the ancestor DomainForm that rewrites a SimpleForm
		 * and use the SimpleForm 
		 */
		while (stmt.getType() == SentenceType.DOMAIN
				&& ((DomainForm)stmt).getRewrites() == null) {
			/* the domain form is embedded */
			ParseElement elt = stmt.getParent();
			/* if it is not embedded, or embedded in something strange, stop */
			if (elt == null || elt.getElementKind() != ElementKind.SENTENCE) 
				return false;
			stmt = (Sentence)elt;
		}
		/* if stmt is a DomainForm, substitute the original */
		if (stmt.getType() == SentenceType.DOMAIN)
			stmt = ((DomainForm)stmt).getRewrites();
		
		//TODO: Can Modals screw up the subject recognition?
		
		/* if stmt is not a SimpleForm, the idea 'subject' does not apply */
		if (stmt.getType() != SentenceType.SIMPLE)
			return false;
		
		/* SimpleForm sentence, get the subject */
		RolePhrase rp = ((SimpleForm)stmt).getSubject();
		/* if role is the subject, q.e.d */
		if (rp == role) return true;
		/* if the subject is a pronoun, and it refers to role,
		 * role was the original subject */
		if (rp.getType() == PhraseType.PRONOUN) 
			return (rp.getReferent() == role);
		/* Otherwise, role is not the subject */
		return false;
	}
	
	/** rewriteModifiers(rolePhrase)
	 * rewrites each 'Modifier' (adjectival) as a Qualifier
	 * 
	 * Example:
	 *   "the damaged vehicle" to "the vehicle that is damaged"
	 */
	private static void rewriteModifiers(ModifiedTerm base)
	{
		int modcount = base.getModifiers().size();
		/* if the term has no modifiers, nothing to do */
		if (modcount == 0) return;
		
		SimpleForm thatisadj;
		
		for (int m = 0; m < modcount; ++m) {
			Modifier mod = base.getModifiers().get(m);
			
			/* rewrite <adjective> base as base that is <adjective> */
			Pronoun anaphor = makePronoun(VocKey.thatWord, base);
					
			/* the verb depends on the modifier */
			if (mod.getAdjective() == null) {
				/* rewrite "same base" as "base that is <relative>"
				 * and "other base" as "base that is not <relative>"
				 * where is relative is the implicit referent of same/other
				 */
				thatisadj = makeSimpleForm(VocBase.vocIs, anaphor, 
						makePronoun(VocKey.theyWord, mod.getRelative()));
				// note: insert the 'them' to protect the original rolePlayed
				if (mod.getKind() != KeywordKind.KSAME)
					thatisadj.getVerb().setModality(Modality.NEGATION);

			} else {
				/* rewrite <adjective> base as base that "is adjective" */
				thatisadj = makeSimpleForm(mod.getAdjective().getVerb(), anaphor, null);
			}
			
			/* add the qualifier to the list for the base term */
			base.getQualifiers().add(makeQualifier(thatisadj));
		}
	}
	
	/** rewriteProperty(propnoun)
	 * rewrites "<property> of <domain>" as
	 *   "<range> that 'is <property> of' <domain>
	 * that is, as a TypeNoun of the <range> type, with the qualifier
	 *   "that is <property> of domain"
	 * The TypeNoun acquires the Quantifier and Modifiers of the PropertyNoun as well
	 * TODO: can a defective Property have Qualifiers?
	 * 
	 * @param propnoun = the PropertyNoun to be rewritten
	 * @return the resulting TypeNoun
	 */
	private static TypeNoun rewriteProperty(PropertyNoun propnoun)
	{
		/* the expansion is based on the defined property */
		VocProperty property = propnoun.getProperty();
		
		/* create the replacement TypeNoun from the property range */
		TypeNoun typenoun = makeTypeNoun(property.getRange(), null);
		typenoun.setRolePlayed(propnoun.getRolePlayed());
		
		/* copy the Quantifier and the Modifiers to the TypeNoun */
		typenoun.setQuantifier(propnoun.getQuantifier());
		typenoun.setModifiers(propnoun.getModifiers());
		
		/* create the qualifier: that is <property> of <domain> */
		SimpleForm qual = makeSimpleForm(property.getVerb(), 
				makePronoun(VocKey.thatWord, typenoun), propnoun.getDomain());
		/* note: the <domain> is the domain RolePhrase of the PropertyNoun
		 * we assume here that the logic converter won't care whether
		 * the role is the direct object or some particle role */
		
		/* add the qualifier to the list for the TypeNoun */
		typenoun.getQualifiers().add(makeQualifier(qual));
		
		/* make the PropertyNoun refer to the TypeNoun */
		propnoun.setExpansion(typenoun);
		return typenoun;
	}

	/** rewriteQualifiers(noun)
	 * rewrite the subclauses of Qualifiers
	 * @param noun the ModifiedTerm that has the Qualifiers
	 * @param s = the clause in which the term occurs
	 * (the ones on PropertyNouns have been moved)
	 */
	private static void rewriteQualifiers(TypeNoun noun, Sentence s)
	{
		if (noun.getQualifiers().isEmpty()) return;
		Iterator<Qualifier> qit = noun.getQualifiers().iterator();
		while (qit.hasNext()) {
			Qualifier q = qit.next();
			if (q.isSimple()) {
				/* make the containing clause the parent of the bound form */
				((SimpleQualifier)q).getBoundForm().setParent(s);
				((SimpleQualifier)q).setBoundForm(
						rewriteSentence(((SimpleQualifier)q).getBoundForm()));
			} else {
				rewriteQualifierChain((QualifierChain)q, s);
			}
		}
	}
	
	/** rewriteQualifierChain(chain)
	 * rewrites the BasicForms of the SimpleQualifiers in a QualifierChain
	 * including both the bound form and the condition
	 * @param chain = the Qualifier Chain to be rewritten
	 * @param s = the clause in which the chain occurs
	 */
	private static void rewriteQualifierChain(QualifierChain chain, Sentence s)
	{
		if (chain.getQualifiers().isEmpty()) return;
		Iterator<SimpleQualifier> sqit = chain.getQualifiers().iterator();
		while (sqit.hasNext()) {
			/* rewrite the bound form and the condition */
			SimpleQualifier sq = sqit.next();
			sq.getBoundForm().setParent(s);
			sq.setBoundForm(rewriteSentence(sq.getBoundForm()));
			Condition cond = sq.getCondition();
			if (cond != null && ! cond.isOtherwise())
				cond.setAntecedent(rewriteSentence(cond.getAntecedent()));
		}
	}

	/** rewriteInstance(instance)
	 * rewrite the interior structures of Nominalizations and Extents
	 * @param inst = the instance to be reworked
	 * @param s = the clause in which the instance occurs
	 * @return the instance as rewritten (which may be unchanged)
	 */
	private static Instance rewriteInstance(Instance inst, Sentence s)
	{
		switch (((Instance)inst).getKind().getValue()) {
		case InstanceKind.NAME_VALUE:
		case InstanceKind.NUMBER_VALUE:
		case InstanceKind.STRING_VALUE:
			/* nothing to do */
			break;
		case InstanceKind.QUANTITY_VALUE:
			/* nothing to do? */
			break;
		case InstanceKind.STATEMENT_VALUE:
		case InstanceKind.QUESTION_VALUE:
			/* nominalization: rewrite the embedded sentence */
			((Nominalization)inst).getSentence().setParent(s);
			((Nominalization)inst).setSentence(
					rewriteSentence(((Nominalization)inst).getSentence()));
			break;
		case InstanceKind.QUERY_VALUE:
		case InstanceKind.CONCEPT_VALUE:
			((Intension)inst).setConcept(
					rewriteRolePhrase(((Intension)inst).getConcept(), s));
		}
		return inst;
	}
	
	// utilities
	
	/** copySimpleForm(stmt, slot)
	 * copies a SimpleForm, except for the designated slot
	 * @param stmt = the SimpleForm sentence to be copied (except for GroupPhrases)
	 * @return the corresponding compound sentence
	 */
	private static SimpleForm copySimpleForm(SimpleForm stmt, int slot)
	{
		SimpleForm dupstmt = theGrammar.createSimpleForm();
		Parser.theParse.addElement(dupstmt);
		
		/* copy the VerbPhrase, because we have to get negation right
		 * if the Group contains a 'no' or 'none' quantifier
		 */
		VerbPhrase dupverb = theGrammar.createVerbPhrase();
		dupverb.setVerb(stmt.getVerb().getVerb());
		dupverb.setModality(stmt.getModality());
		dupstmt.setVerb(dupverb);

		/* copy the RolePhrase pointers */
		dupstmt.copyRolesArray(stmt);
		return dupstmt;
	}

	/** makeSimpleForm(verb, subject, object)
	 * creates a new SimpleForm and fills in the verb, subject and object
	 * @param verb = the verb for the simple form clause
	 * @param subject = the subject (first role) of the verb, or null
	 * @param object = the object (second role) of the verb, if any, else null
	 * @return the new SimpleForm
	 */
	private static SimpleForm makeSimpleForm(
			VocVerb verb, RolePhrase subject, RolePhrase object)
	{
		SimpleForm clause = theGrammar.createSimpleForm();
		Parser.theParse.addElement(clause);
		VerbPhrase vp = makeVerbPhrase(verb);
		clause.setVerb(vp);
		clause.setSubject(subject);
		if (subject != null) subject.setRolePlayed(vp.getVerbRole(0));
		clause.setObject(object);
		if (object != null) object.setRolePlayed(vp.getVerbRole(1));
		clause.setDone(false);
		return clause;
	}
	
	/** makeVerbPhrase(VocVerb)
	 *  creates a declarative verbPhrase using the passed verb
	 * @param verb = the verb on which the phrase is based
	 * @return the VerbPhrase created
	 */
	private static VerbPhrase makeVerbPhrase(VocVerb verb)
	{
		VerbPhrase vphrase = theGrammar.createVerbPhrase();
		vphrase.setModality(Modality.NONE);
		// vphrase.setNegated(false);
		vphrase.setVerb(verb);
		return vphrase;

	}

	/** makeQuantifier(QuantifierKind)
	 * creates a (simple) Quantifier object of the passed kind
	 * and puts it in the Parse bucket.
	 * @param qkind = the QuantifierKind for the new Quantifier
	 * @return the constructed Quantifier
	 */
	private static Quantifier makeQuantifier(QuantifierKind qkind)
	{
		if (qkind == null) return null;
		Quantifier q = theGrammar.createQuantifier();
		Parser.theParse.addElement(q);
		q.setKind(qkind);
		return q;
	}

	/** makeQualifier(BoundForm clause)
	 * creates a SimpleQualifier object whose body is the passed clause
	 * and puts it in the Parse bucket.
	 * @param clause = the parsed qualification
	 * @return the constructed Qualifier
	 */
	private static SimpleQualifier makeQualifier(Sentence clause)
	{
		SimpleQualifier q = theGrammar.createSimpleQualifier();
		Parser.theParse.addElement(q);
		q.setBoundForm(clause);
		clause.setParent(q);
		q.setCondition(null);
		return q;
	}

	/** makeTypeNoun(noun, QuantifierKind)
	 * creates a new TypeNoun in the parse bucket
	 *  the TypeNoun instantiates the VocNoun noun 
	 *  and has a quantifier of the given QuantifierKind
	 * @param noun = the VocNoun that is the basis for the TypeNoun
	 * @param qkind = the QuantifierKind for the generated Quantifier
	 * @return the constructed TypeNoun
	 */
	private static TypeNoun makeTypeNoun(VocNoun noun, QuantifierKind qkind)
	{
		TypeNoun type = theGrammar.createTypeNoun();
		Parser.theParse.addElement(type);
		type.setNoun(noun);
		type.setQuantifier(makeQuantifier(qkind));
		if (type.getQuantifier() != null) type.getQuantifier().setParent(type);
		type.setModifiers(null);
		return type;
	}
	
	/** makePronoun(keyword, referent)
	 * creates a new Pronoun object in the Parse bucket
	 *  whose keyword is the passed word 
	 *  and whose referent is the passed RolePhrase object
	 * @param word = the keyword that is the pronoun term
	 * @param referent = the thing the pronoun refers to, or null
	 * @return the created Pronoun
	 */
	private static Pronoun makePronoun(Keyword word, RolePhrase referent)
	{
		Pronoun pronoun = theGrammar.createPronoun();
		Parser.theParse.addElement(pronoun);
		pronoun.setKeyword(word);
		pronoun.setReferent(referent);
		return pronoun;
	}

}
