/* interpreter.java
 *  Routines to generate extended First-Order Logic (IKL)
 *  interpretations of the Parse tree.
 *  
 *  @author Ed Barkmeyer
 *  @date  January, 2011
 *  
 *  revised May, 2011, v0.7, rewrote quantifier placement
 *  revised Sep, 2011, v0.16, to correct quantifier placement
 *  revised Nov, 2011, v0.18, support Quantity, definition of a proper name
 *  revised Apr, 2012, v0.19, complete definition of term and proper name
 *  revised May, 2012, v0.20, repair (cl:comment ...) for definition formulations
 */
package core;

import NBVR.Grammar.*;
import NBVR.Vocabulary.*;
import NBVR.Logic.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.io.PrintWriter;

import org.eclipse.emf.common.util.EList;

public class Interpreter {
	
	public static final String LOGIC_LANGUAGE = "IKL";

	/* all the factories */
	public static final LogicFactory theFactory = LogicFactory.eINSTANCE;
	public static final GrammarFactory theGrammar = GrammarFactory.eINSTANCE;	
	public static final VocabularyFactory theVocabulary = VocabularyFactory.eINSTANCE;

	/* the IKL output file, provided by LogicManager */
	public static PrintWriter iklout;

	/* management of generated variables */
	public static LinkedList<Variable> varlist;
	public static int variableNumber;

	/* String Buffer for constructing complex unit names */
	static StringBuffer dimexp = new StringBuffer(128);

	/* special predicates */
	public static Predicate exactlyNPredicate;
	public static Predicate atLeastNPredicate;
	public static Predicate atMostNPredicate;
	public static Predicate lessThanNPredicate;
	public static Predicate moreThanNPredicate;
	public static Predicate collectionPredicate;
	public static Predicate memberPredicate;
	
	public static Predicate identityPredicate;
	public static Predicate statementPredicate;
	public static Predicate situationPredicate;
	public static Predicate questionPredicate;

	/** setup()
	 * initializer for logic generation
	 */
	public static void setup()
	{
		/* find the Identity and change the name of 'thing.is.thing' to '=' */
		identityPredicate = Interpreter.makePredicate(VocBase.vocIs);
		identityPredicate.setName("=");

		/* make special quantity relationship predicates */
		exactlyNPredicate = makeSpecialPredicate("=", 2);
		atLeastNPredicate = makeSpecialPredicate("less_or_equal", 2);
		atMostNPredicate = makeSpecialPredicate("greater_or_equal", 2);
		lessThanNPredicate = makeSpecialPredicate("less_than", 2);
		moreThanNPredicate = makeSpecialPredicate("more_than", 2);
		
		/* the Collection predicates */
		collectionPredicate = makeSpecialPredicate("collection", 1);
		memberPredicate = makeSpecialPredicate("collection_member", 2);
		
		/* the Instance definition predicates */
		statementPredicate = makeSpecialPredicate("isStatement", 2);
		situationPredicate = makeSpecialPredicate("isSituation", 2);
		questionPredicate = makeSpecialPredicate("isQuestion", 2);
	}

	/** makeProposition(sentence)
	 * convert a Grammar Sentence into a formal logic Proposition
	 * (this is the public routine)
	 * 
	 * @param gform = the Formulation containing the grammatical parse structure
	 * @return the corresponding logical Proposition
	 */
	public static Proposition makeProposition(Formulation gform, PrintWriter IKLfile)
	{
		/* save the IKL output file */
		iklout = IKLfile;
		
		/* get and restructure the grammatical parse */
		Sentence sentence = Rewrite.sentence((Sentence)gform.getForm());

		/* first generate the basic proposition structure */
		initVarList();
		Proposition p = interpretSentence(sentence);

		/* now, all the needed variables have been created
		 * and have attached constraint structures
		 * locate the quantifications in the proposition structure
		 */
		ListIterator<Variable> varit = varlist.listIterator(varlist.size());
		while (varit.hasPrevious()) {
			p = placeQuantification(p, varit.previous());
		}
		
		/* now produce the external form */
		iklout.println();
		iklout.println("(cl:comment '" + toIKLstring(gform.getText()) + "'");
		p.toIKL(iklout, 0);
		iklout.println(')');

		return p;
	}

	/** makeNounFormulation(noun phrase, IKL file)
	 * create the formal logic Formulation for a noun
	 * based on a definition that has the form of a NounPhrase
	 * The form of the formulation is a proposition that is a quantified equivalence
	 *  (forall role1)
	 *    (iff (noun-predicate role1) (<formulation of noun-phrase>) )
	 * The formulation of the NounPhrase must be a TypeNoun, a PropertyNoun, a
	 * GroupPhrase (based on 'or') or an Instance.
	 * If it is an instance that is simple, the formulation is (= role1 <instance>)
	 * If it is an instance that is a nominalization, the formulation is:
	 *   (Situation/Statement/Question role1 <nominalization>)
	 * @param gform = the Formulation containing the grammatical parse structure
	 * @return the Formal Logic Formulation
	 */
	public static Formulation makeNounFormulation(Formulation gform, PrintWriter IKLfile)
	{
		Proposition def;	/* the formal definition */
		
		/* save the IKL output file */
		iklout = IKLfile;
		
		/* get the subject of the formulation */
		VocNoun noun = (VocNoun)gform.getConcept();

		/* initialize the logical variable list */
		initVarList();

		/* first, make the Relation structure for the defined predicate
		 * it is a predicate with one argument
		 * we determine what the argument is a bit later */
		Relation rel = theFactory.createRelation();
		rel.setPredicate(makePredicate(noun));
		makeArgument(rel, 0);
		
		/* Now make the definition structure -- a quantified equivalence 
		 * the left operand is the relation for the predicate 
		 * the right operand is the definition */
		Connection eqv = makeConnection(Connective.EQV);
		eqv.addOperand(rel);
		/* don't fill the definition operand yet */
		
		/* get and restructure the grammatical parse structure */
		RolePhrase np = Rewrite.nounPhrase((RolePhrase)gform.getForm());
		
		/* What is the NounPhrase after the rewrite? */
		if (np.getType() == PhraseType.TYPE_NOUN) {
			/* if the original was a TypeNoun, a PropertyNoun or an Or Group,
			 * as rewritten, the defining NounPhrase must be a TypeNoun */
			def = makeFormulationFromNoun((TypeNoun)np, eqv);

		} else if (np.getType() == PhraseType.INSTANCE) {
			/* if the original was an Instance, the formulation is different */
			def = makeFormulationFromInstance((Instance)np, eqv);			

		} else {
			/* whatever the original was, it makes no sense as a definition */
			def = null;
		}
		
		/* check that we actually produced a noun formulation */
		if (def == null) {
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Definition of " + noun.external() 
					+ " has unexpected form");
			return null;
		}
		
		/* now, all the needed variables have been created
		 * and have attached constraint structures
		 * re-locate the quantifications in the proposition structure
		 */
		ListIterator<Variable> varit = varlist.listIterator(varlist.size());
		while (varit.hasPrevious()) {
			def = (Quantification)placeQuantification(def, varit.previous());
		}
		
		/* finally, create the IKL external form */
		iklout.println();
		iklout.println("(cl:comment '" + noun.getTerms().get(0).getText());
		iklout.println("  Definition: " + toIKLstring(gform.getText()) + "'");
		def.toIKL(iklout, 0);
		iklout.println(')');

		/* return the Formulation for the quantified proposition */
		return theVocabulary.createFormulation(LOGIC_LANGUAGE, null, def);
	}

	/** makeFormulationFromNoun(TypeNoun, equivalence)
	 *  creates the logical formulation of the definition from the TypeNoun
	 *  and completes the equivalence structure
	 * @param np  = the TypeNoun grammar structure of the definition
	 * @param eqv = the iff definition form, missing the definition
	 * @return the final logical structure for the definition
	 */
	private static Proposition makeFormulationFromNoun(TypeNoun np, Connection eqv)
	{
		/* Convert the TypeNoun to a Proposition
		 * the result will be a quantification of some base noun
		 */
		Quantification def = (Quantification)interpretTypeNoun(np);
		
		/* there should be no "scope" to the Quantification */
		if (def.getScope() != null) {
			ParseManager.printLine();
			RECONManager.errorlog.println(
				"*** Internal error: Defining quantification has unexpected scope");
			def.setScope(null);
		}
		
		/* extract the quantified variable -- it refers to the noun being defined */
		Variable nounv = def.getVariable();

		/* make it the argument of the defined predicate  */
		Relation rel = (Relation)eqv.getOperands().get(0);
		rel.getArguments().get(0).setVariable(nounv);
		nounv.getUses().add(rel);
		
		/* the definition (right) operand of the equivalence 
		 * is the constraint on the quantified variable */
		eqv.addOperand(nounv.getConstraint());
		/* remove the constraint on the formerly quantified Variable */
		nounv.setConstraint(null);

		/* replace the scope of the quantification with the equivalence */
		def.setKind(QuantifierKind.QALL);
		def.setScope(eqv);

		/* return the quantified iff structure */
		return def;
	}

	/** makeFormulationFromInstance(instance phrase, equivalence)
	 * Convert the defining Instance to a Quantification of the form:
	 *   (forall (x) (iff (<noun> x) (p x <instance>)))
	 * or
	 *   (forall (x) (iff (= x <name>) (p x <instance>)))
	 * The iff is passed as 'eqv' and the first operand of eqv is (<noun> ?)
	 * The predicate p depends on the kind of instance
	 * 
	 * @param np = the NounPhrase that is the instance
	 * @param eqv = the Equivalence that represents the definition (iff)
	 * @return the Quantification that is the definition
	 */
	private static Proposition makeFormulationFromInstance
		(Instance np, Connection eqv)
	{
		/* get the appropriate predicate for the kind of instance */
		Predicate p = getPredicateForInstance(np);
		
		/* get the role variable for the noun role */
		RoleVariable rolev = p.getVariables().get(0);
		rolev.getUses().clear();	// clear any use list from a previous formulation
		varlist.add(rolev);			// add the RoleVariable to the active list

		/* make it the (first) argument of the predicate being defined  */
		Relation rel = (Relation)eqv.getOperands().get(0);
		rel.getArguments().get(0).setVariable(rolev);
		rolev.getUses().add(rel);
		
		/* make a Quantification for the role variable
		 * and make its scope the iff (eqv) */
		Quantification def = theFactory.createQuantification();
		def.setKind(QuantifierKind.QALL);
		def.setVariable(rolev);
		def.setScope(eqv);
		
		/* Now make the Relation for the definition
		 * it is a predicate (p) with two arguments */
		rel = theFactory.createRelation();
		rel.setPredicate(p);
		
		/* make an argument for the 'role variable' for the noun */
		Argument arg = makeArgument(rel, 0);
		arg.setVariable(rolev);
		rolev.getUses().add(rel);
		
		/* create an argument for the Instance 
		 * and fill it with the Instance */
		arg.setNext(makeArgument(rel, 1));
		interpretInstance(arg.getNext(), np);
		
		/* make the relation the second operand of the iff -- the definition */
		eqv.addOperand(rel);

		/* return the quantified iff structure */
		return def;
	}

	/** makeNameFormulation(formulation, IKLfile)
	 * create the formal logic Formulation for a proper name
	 *   based on a definition that has the form of a NounPhrase
	 * The form of the formulation depends on the noun phrase
	 * If the noun phrase is a simple instance, the definition is an equality relation
	 *   (= name <instance>)
	 * If the noun phrase is anything else, the definition is an equivalence
	 *   (forall (x) (iff (= x name) (definition x)))
 	 *
	 * @param gform = the Formulation containing the grammatical parse structure
	 * @return the Formal Logic Formulation
	 */
	public static Formulation makeNameFormulation(Formulation gform, PrintWriter IKLfile)
	{
		Proposition def;
		
		/* save the IKL output file */
		iklout = IKLfile;
		
		/* get the subject of the formulation */
		VocName name = (VocName)gform.getConcept();
		
		/* initialize the logical variables list */
		initVarList();
		
		/* first, make the Relation structure for (= name <instance>)
		 * it is an equality/identity predicate with two arguments */
		Relation rel = theFactory.createRelation();
		rel.setPredicate(identityPredicate);
		Argument arg1 = makeArgument(rel, 0);
		Argument arg2 = makeArgument(rel, 1);
		arg1.setNext(arg2);
		
		/* one argument is the proper name itself
		 * but which argument depends on the definition */
		ValueConstant con = theFactory.createValueConstant();
		con.setName(transformName(name.getTerms().get(0)));

		/* get and restructure the grammatical parse structure */
		RolePhrase np = Rewrite.nounPhrase((RolePhrase)gform.getForm());

		/* the second argument depends on the definition structure */
		if (np.getType() == PhraseType.INSTANCE) {
			/* get the appropriate predicate for the kind of instance */
			Predicate p = getPredicateForInstance((Instance)np);
			if (p == identityPredicate) {
				/* the instance is simple, just make the identity */
				arg1.setConstant(con);
				interpretInstance(arg2, (Instance)np);
				def = rel;
			} else {
				/* the instance has structure */
				/* Make the definition structure -- the iff 
				 * the left operand is the identity relation 
				 * the right operand is the definition */
				Connection eqv = makeConnection(Connective.EQV);
				eqv.addOperand(rel);
				/* makeFormulationFromInstance assumes that the first
				 * relation is (P x), we need (= x name) */
				arg2.setConstant(con);
				def = makeFormulationFromInstance((Instance)np, eqv);
			}
			
			
		} else if (np.getType() == PhraseType.TYPE_NOUN) {
			/* the formulation should be an assertion
			 *   (forall (x) (iff (= x name) (definition x))) */
			/* First make the definition structure -- the iff */
			Connection eqv = makeConnection(Connective.EQV);
			eqv.addOperand(rel);
			/* makeFormulationFromNoun assumes that the first
			 * relation is (P x), we need (= x name) */
			arg2.setConstant(con);
			def = makeFormulationFromNoun((TypeNoun)np, eqv);

		} else {
			/* strange formulation */
			def = null;
		}
		
		/* check that we actually produced a noun formulation */
		if (def == null) {
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Definition of " + name.external() 
					+ " has unexpected form");
			return null;
		}
		
		/* now, all the needed variables have been created
		 * and have attached constraint structures
		 * locate the quantifications in the proposition structure
		 */
		ListIterator<Variable> varit = varlist.listIterator(varlist.size());
		while (varit.hasPrevious()) {
			def = (Quantification)placeQuantification(def, varit.previous());
		}
		
		/* finally, create the IKL external form */
		iklout.println();
		iklout.println("(cl:comment '" + name.getTerms().get(0).getText());
		iklout.println("  Definition: " + toIKLstring(gform.getText()) + "'");
		def.toIKL(iklout, 0);
		iklout.println(')');

		/* return the Formulation for the quantified proposition */
		return theVocabulary.createFormulation(LOGIC_LANGUAGE, null, def);
	}
	
	/** getPredicateForInstance(instance)
	 *  returns the predicate for definition formulations involving the instance
	 *  it is based on the InstanceKind
	 *  
	 * @param np = the grammatical Instance formulation
	 * @return the appropriate Predicate (a special predicate) or null
	 */
	private static Predicate getPredicateForInstance(Instance np)
	{
		/* The exact predicate for a definition using the instance 
		 * depends on the InstanceKind of the instance */
		switch (np.getKind().getValue()) {
		case InstanceKind.NAME_VALUE: 
		case InstanceKind.NUMBER_VALUE: 
		case InstanceKind.STRING_VALUE: 
		case InstanceKind.QUANTITY_VALUE: 
			return identityPredicate;
		case InstanceKind.STATEMENT_VALUE:
			return statementPredicate;
		case InstanceKind.QUESTION_VALUE: 
			return questionPredicate;
			// TODO: Create proper Question predicates
	
		case InstanceKind.QUERY_VALUE:
		case InstanceKind.CONCEPT_VALUE:
		default:
			/* doesn't make sense as a noun formulation */
			return null;
		}
	}
	
	/** makeVerbFormulation(verb, sentence)
	 * create the formal logic Formulation for a verb, property, or adjective
	 * based on a definition that has the form of a sentence
	 * The form of the formulation is a proposition that is a quantified equivalence
	 *  (forall role1)...(forall roleN)
	 *    (if (and (range1 role1) ... (rangeN roleN))
	 *        (iff (predicate role1 ... roleN) (<definition>))
	 * TODO: put in the range constraints?
	 * 
	 * @param gform = the Formulation containing the grammatical parse structure
	 * @return the Formal Logic Formulation
	 */
	static public Formulation makeVerbFormulation(
			VocVerb verb, Formulation gform, PrintWriter IKLfile)
	
	{
		/* save the IKL output file */
		iklout = IKLfile;
		
		/* get and restructure the grammatical parse */
		Sentence s = Rewrite.sentence((Sentence)gform.getForm());

		/* initialize Proposition generation */
		initVarList();

		/* The final structure is a quantified equivalence 
		 * generate the definition equivalence structure,
		 * and make it the base of the quantification chain */
		Connection eqv = makeConnection(Connective.EQV);
		Proposition def = eqv;
		
		/* next, make the Relation structure for the defined predicate */
		Predicate predicate = makePredicate(verb);
		Relation rel = theFactory.createRelation();
		rel.setPredicate(predicate);

		/* now, for each role variable in the predicate,
		 * make a Quantification for it, and 
		 * make it an argument of the Relation
		 * and create a constraint for it to match its range
		 */
		int arity = predicate.getVariables().size();
		Argument lastarg = null;
		for (int rvno = 0; rvno < arity; ++rvno) {
			RoleVariable rolev = predicate.getVariables().get(rvno);
			rolev.getUses().clear();	// clear any use list from a previous formulation
			
			/* add the RoleVariable to the list */
			varlist.add(rolev);
			
			/* make a Quantification for the role variable
			 * and add it to the chain */
			Quantification q = theFactory.createQuantification();
			q.setKind(QuantifierKind.QALL);
			q.setVariable(rolev);
			q.setScope(def);
			def = q;
			
			/* make a Range constraint for the Variable */
			makeRangeConstraint(rolev);
			rolev.getConstraint().setOwner(q);
			
			/* create the argument */
			Argument arg = makeArgument(rel, 0);
			if (lastarg != null) lastarg.setNext(arg);
			lastarg = arg;
			
			/* assign the RoleVariable to the Argument */
			arg.setVariable(rolev);
			rolev.getUses().add(rel);
		}
				
		/* now complete the definition equivalence structure,
		 * the left operand is the relation for the predicate 
		 * the right operand is the passed sentence */
		eqv.addOperand(rel);
		eqv.addOperand(interpretSentence(s));
		
		/* now, all the needed variables have been created
		 * and have attached constraint structures
		 * locate the quantifications in the proposition structure
		 */
		ListIterator<Variable> varit = varlist.listIterator(varlist.size());
		while (varit.hasPrevious()) {
			def = placeQuantification(def, varit.previous());
		}
		
		/* now create the IKL external form */
		iklout.println();
		iklout.println("(cl:comment '" + predicate.getText());
		iklout.println("  Definition: " + toIKLstring(gform.getText()) + "'");
		def.toIKL(iklout, 0);
		iklout.println(')');

		/* return the Formulation for the quantified proposition */
		return theVocabulary.createFormulation(LOGIC_LANGUAGE, null, def);

	}

	/** makeRangeConstraint()
	 * create a Relation of the form (<range> rolev)
	 * for the given role variable
	 * 
	 * @param rolev = the role variable to be constrained
	 */
	private static void makeRangeConstraint(RoleVariable rolev)
	{
		/* make the Relation structure for the range predicate */
		Predicate predicate = makePredicate(rolev.getRange());
		Relation rel = theFactory.createRelation();
		rel.setPredicate(predicate);
		
		/* create the argument */
		Argument arg = makeArgument(rel, 0);
		rel.getArguments().add(arg);
		
		/* assign the RoleVariable to the Argument */
		arg.setVariable(rolev);
		rolev.getUses().add(rel);
		
		/* attach the constraint to the Variable */
		rolev.setConstraint(rel);
	}

	/** initVarList()
	 * initialize the local variables list 
	 */
	private static void initVarList()
	{
		/* create or clear the local variables list  */
		if (varlist == null) {
			varlist = new LinkedList<Variable>();
		} else {
			varlist.clear();
		}
		variableNumber = 0;
	}

	/** placeQuantification
	 * locate the quantification for the variable in the proposition structure
	 * and integrate the constraint with the scope of the quantification
	 * Note: a variable can occur in three structures
	 *  - its own constraint
	 *  - the constraint on another variable (initially, only one)
	 *  - the master proposition
	 * Occurrences of the variable in its own constraint do not affect placement.
	 * The constraint on a variable is owned by the Quantification for the Variable.
	 * Initially, a variable is created and used either within the constraint on  
	 * one variable or in the master, but not both.
	 * 
	 * The variables are placed last-in-first-out, so that the ones in the master 
	 * proposition cannot be processed until all their dependencies have been 
	 * integrated into their constraints.  
	 * All the variables in the master proposition are initially independent of one
	 * another, so they will only occur in their own constraint and in the master.
	 * 
	 * @param root = the root of the Proposition structure
	 * @param var = the variable whose Quantification is to be integrated
	 * @return the resulting Proposition
	 */
	private static Proposition placeQuantification(Proposition root, Variable var)
	{
		Quantification q = var.getSource();

		/* find the common ancestor over all uses of the variable,
		 * the base usage is its Quantification */
		Proposition ancestor = q;
		Iterator<Relation> useit = var.getUses().iterator();
		while (useit.hasNext()) {
			Proposition use = useit.next();
			/* if the use is within the constraint, it is covered */
			if (! hasAncestor(use, ancestor)) {
				/* otherwise find the common ancestor */
				ancestor = findCommonAncestor(ancestor, use);
				if (ancestor == null) {
					ParseManager.printLine();
					RECONManager.errorlog.println("*** Internal error: Variable " + var.getName()
							+ " has two uses with no common ancestor");
					ancestor = use;
				}
			}
		}
		
		/* if the common ancestor is not the Quantification for the Variable,
		 * then the Quantification must be moved above it
		 */
		if (ancestor != q) {
			/* don't insert a quantification between a negation and its scope */
			while (ancestor.getOwner() != null 
				&& ancestor.getOwner().getType() == PropositionKind.NEGATION)
					ancestor = ancestor.getOwner();
			/* move the quantification to contain the common ancestor */
			Quantification qhead = moveQuantification(q, ancestor);
			/* if the ancestor was the root, the head of the moved
			 * quantification chain is the new root */
			if (qhead.getOwner() == null) root = qhead;
		} else {
			ancestor = q.getScope();
		}

		/* now integrate the quantification constraint with its scope */
		if (var.getConstraint() != null) {
			if (q.getKind() == QuantifierKind.QANY){
				if (inAntecedent(q)) 
					q.setKind(QuantifierKind.QAN);
				else
					q.setKind(QuantifierKind.QALL);
			}
			if (q.getKind() == QuantifierKind.QALL) {
				/* for all x that constraint(x), ancestor(x) becomes:
				 * for all x, constraint(x) implies ancestor(x)
				 */
				Implication ifscope = theFactory.createImplication();
				ifscope.setAntecedent(var.getConstraint());
				ifscope.setConsequent(ancestor);
				q.setScope(ifscope);
	
			} else {
				/* (not) exists x that constraint(x), ancestor(x) becomes:
				 * (not) exists x, constraint(x) and ancestor(x)
				 * Note: Q-No is treated as a kind of quantification
				 * the expression of the negation is in the toIKL routine
				 */
				Connection andscope = makeConnection(Connective.AND);
				andscope.addOperand(var.getConstraint());
				andscope.addOperand(ancestor);
				q.setScope(andscope);
			}
			var.setConstraint(null);	// the constraint is now integrated
		}
		return root;
	}

	/** hasAncestor(proposition, ancestor)
	 * Returns true the given proposition has the given ancestor
	 * @param p = the given proposition
	 * @param ancestor = the expected ancestor
	 * @return true if ancestor is an ancestor of p, else false
	 */
	private static boolean hasAncestor(Proposition p, Proposition ancestor)
	{
		while (p != null) {
			if (p == ancestor) return true;
			p = p.getOwner();
		}
		return false;
	}

	/** findCommonAncestor(left, right)
	 * find the common ancestor of two nodes in the proposition tree
	 * Note: there can be two different proposition structures involved
	 *  - the constraint on a variable
	 *  - the target final proposition
	 *  The algorithm presumes that all uses of a given variable
	 *  are within the final proposition structure.
	 * 
	 * @param left = the left/first node
	 * @param right = the right/other node
	 * @return the common ancestor node
	 */
	private static Proposition findCommonAncestor(Proposition left, Proposition right)
	{
		/* if either is initially null, there is no comparison
		 * just return the other
		 */
		if (left == null) return right;
		if (right == null) return left;
		

		Proposition aleft = left;
		Proposition aright = right;
		
		for(;;) {
			if (aleft != null) {
				if (aleft.testAndSet(1) != 0) {
					clearAncestors(left);
					clearAncestors(right);
					return aleft;
				}
				aleft = aleft.getOwner();
			} else if (aright != null) {
				if (aright.testAndSet(1) != 0) {
					clearAncestors(left);
					clearAncestors(right);
					return aright;
				}
				aright = aright.getOwner();
			} else { /* both have topped out */
				return null;
			}
		}
	}

	/** clearAncestors(p)
	 * clear the marks on all the ancestors of p
	 * @param p = the proposition to start from
	 */
	private static void clearAncestors(Proposition p)
	{
		for (; p != null; p = p.getOwner()) p.testAndSet(0);
	}

	/** moveQuantification(Quantification q, Proposition p)
	 * p is an ancestor of q
	 * move the Quantification chain between q and p to contain p
	 * @param q = the quantification to be moved
	 * @param p = the new scope for q
	 * @return the head of the quantification chain that was moved
	 */
	private static Quantification moveQuantification(Quantification q, Proposition p)
	{
		Proposition qowner, nextup;
		Quantification qhead = q;
		for(qowner = qhead.getOwner(); qowner != null; qowner = nextup) {
			nextup = qowner.getOwner();
			if (qowner.getType() == PropositionKind.QUANTIFICATION) {
				/* make the Quantification part of the moving quantification */
				qhead = (Quantification)qowner;
			} else {
				/* substitute q.scope for the operand of qowner that is qhead */
				substituteScope(qhead, q.getScope());
				/* substitute qhead for the operand of nextup that is qowner */
				substituteScope(qowner, qhead);
				/* make qowner the scope of q */
				q.setScope(qowner);
			}
			/* if we have moved the target proposition into the scope of q, stop */
			if (qowner == p) return qhead;
		}
		ParseManager.printLine();
		RECONManager.errorlog.println("*** Internal error: Failed to find reported ancestor");
		return qhead;
	}

	/** substituteScope(child, changeling)
	 * substitute the changeling proposition for the child proposition 
	 * among the operands of the child's parent proposition
	 * The caller must save the prior links
	 * 
	 * @param child = an existing child of its owner
	 * @param changeling = the proposition to be substituted for the child
	 */
	private static void substituteScope(Proposition child, Proposition changeling)
	{
		Proposition owner = child.getOwner();
		
		/* if the child was the root proposition, there is nothing to move
		 * make the changeling the root */
		if (owner == null) {
			changeling.setOwner(null);
			return;
		}

		/* find and replace the child according to the type of the parent
		 * Note: except for Connections, setting a specific operand to the changeling
		 * 	causes the changeling owner to be set accordingly
		 *  For connections, the subsitution is into a list object, which 
		 *  knows nothing about owners.
		 */
		switch (owner.getType().getValue()) {
		case PropositionKind.NEGATION_VALUE:
			((Negation)owner).setScope(changeling);
			return;
		case PropositionKind.CONNECTION_VALUE:
			List<Proposition> operands = ((Connection)owner).getOperands();
			for (int s = 0; s < operands.size(); s++) {
				if (operands.get(s) == child) {
					operands.set(s, changeling);
					changeling.setOwner(owner);
				}
			}
			return;
		case PropositionKind.IMPLICATION_VALUE:
			if (((Implication)owner).getAntecedent() == child)
				((Implication)owner).setAntecedent(changeling);
			if (((Implication)owner).getConsequent() == child)
				((Implication)owner).setConsequent(changeling);
			return;
		case PropositionKind.QUANTIFICATION_VALUE:
			((Quantification)owner).setScope(changeling);
			return;
		case PropositionKind.MODAL_VALUE:
			((Modal)owner).setScope(changeling);
			return;
		default:	/* RELATION */
			/* a relation cannot have a child */
			//TODO: a nominalization can be a child of a relation
			return;
		}
	}
	
	/** inAntecedent
	 * routine to determine whether a Proposition occurs in the context of
	 * the antecedent of some implication form (if, only if, unless)
	 * or in a constraint on a variable (which is effectively an implication)
	 * @param s = the Proposition 
	 * @return true if s occurs in the antecedent of an implication, else false
	 */
	private static Boolean inAntecedent(Proposition s)
	{
		/* no environment, clearly not an antecedent */
		if (s == null) return false;

		Proposition parent = s.getOwner();
		while (parent != null) {
			/* the decision depends on what the parent is, and where s is relative to it */
			switch (parent.getType().getValue()) {
			case PropositionKind.RELATION_VALUE:
				/* the parent is a relation, this is a nominalization */ 
				return false;
				
			case PropositionKind.QUANTIFICATION_VALUE:
				if (((Quantification)parent).getScope() != s) {
					/* if s is not in the scope of the parent, 
					 * it is in the constraint on the variable
					 * treat that as an antecedent */
					return true;
				}
				/* s is the scope, go up one parent */
				break;

			case PropositionKind.NEGATION_VALUE:
				/* s can only be in the scope, go up one parent */
				break;

			case PropositionKind.MODAL_VALUE:
				/* s can only be in the scope, go up one parent */
				break;

			case PropositionKind.IMPLICATION_VALUE:
				/* parent is an implication, is s the antecedent? */
				return  ((Implication)parent).getAntecedent() == s;

			case PropositionKind.CONNECTION_VALUE:
				/* if parent is an Equivalence, the first member is the 'antecedent' */
				if (((Connection)parent).getKind() == Connective.EQV) {
					return ((Connection)parent).getOperands().get(0) == s;
				}
				/* the parent is not an Equivalence, go up one parent */
				break;
			}
			
			s = parent;
			parent = s.getOwner();

		}
		/* if we reach a proposition that has no parent, it is the main clause */
		return false;
	}

	/** interpretSentence(sentence)
	 * convert a Grammar Sentence into a formal logic Proposition
	 * (this is the internal routine that deals with embedded propositions)
	 * 
	 * @param sentence = the Sentence to be converted
	 * @return the corresponding logical Proposition
	 */
	private static Proposition interpretSentence(Sentence sentence)
	{
		Proposition p;
		
		if (sentence == null) return null;
		
		switch (sentence.getType().getValue()) {
		case SentenceType.SIMPLE_VALUE:
			p = interpretSimpleForm((SimpleForm)sentence);
			break;
		case SentenceType.DOMAIN_VALUE:
			p = interpretDomainForm((DomainForm)sentence);
			break;
		case SentenceType.MODAL_VALUE:
			p = interpretModalForm((DomainForm)sentence);
			break;
		case SentenceType.COMPOUND_VALUE:
			p = interpretCompoundForm((CompoundForm)sentence);
			break;
		case SentenceType.IMPLICATION_VALUE:
			p = interpretImplication((ImplicationForm)sentence);
			break;
		case SentenceType.EQUIVALENCE_VALUE:
			p = interpretEquivalence((CompoundForm)sentence);
			break;
		default:
			p = null;
		}

		return p;
	}
	
	/** interpretModalForm (DomainForm)
	 * converts the modal DomainForm to a Modal logic object
	 * if the modal DomainForm has modality NONE, it just returns the interpreted scope
	 * @param stmt = the modal form from Parser/Rewrite
	 * @return the corresponding Modal logic object
	 */
	private static Proposition interpretModalForm(DomainForm stmt)
	{
		if (stmt.getModality() == Modality.NONE) {
			/* fake modality; just return its content statement */
			return interpretSentence(stmt.getStatement());
		} else if (stmt.getModality() == Modality.NEGATION) {
			/* simple negation, generate a Negation for the content */
			Negation neg = theFactory.createNegation();
			neg.setScope(interpretSentence(stmt.getStatement()));
			return neg;
		} else {
			Modal modal = theFactory.createModal();
			modal.setKind(stmt.getModality());
			modal.setScope(interpretSentence(stmt.getStatement()));
			return modal;
		}
	}
	
	/** interpretDomainForm(sentence)
	 * converts a DomainForm statement into a Quantification proposition
	 * @param sentence = the DomainForm from the parse
	 * @return the Quantification proposition
	 */
	private static Quantification interpretDomainForm(DomainForm sentence)
	{
		/* construct the Quantification from the TypeNoun */
		Quantification q = interpretTypeNoun((TypeNoun)sentence.getDomain());
		/* set the owner of the constraint on the variable to the Quantification */
		q.getVariable().getConstraint().setOwner(q);
		/* now process the scope of the Domain/Quantification */
		q.setScope(interpretSentence(sentence.getStatement()));
		return q;
	}

	/** interpretCompoundForm(sentence)
	 * converts a CompoundForm statement into a Connection proposition
	 * linked by AND or OR depending on the source connective
	 * @param sentence = the CompoundForm from the parse
	 * @return the Connection proposition
	 */
	private static Connection interpretCompoundForm(CompoundForm sentence)
	{
		Connection c = makeConnection(sentence.getKind());
		Iterator<Sentence> sit = sentence.getStatements().iterator();
		while (sit.hasNext()) {
			c.addOperand(interpretSentence(sit.next()));
		}
		return c;
	}

	/** interpretImplication(ImplicationForm)
	 * converts an ImplicationForm statement into an Implication proposition
	 * The general ImplicationForm is if P then Q else R
	 * This is interpreted:  (and (if P Q) (if (not P) R))
	 * @param stmt = the ImplicationForm from the parse
	 * @return the Connection proposition that ANDs the implications
	 */
	private static Proposition interpretImplication(ImplicationForm stmt)
	{
		Implication imp = theFactory.createImplication();
		
		/* Rewrite has turned the following into IF forms:
		 * - IF form: If P then Q [else R]
		 * - ONLY IF form: P only if Q, which is:  If P then Q
		 * - UNLESS form: Unless P then Q, which is: If (not P) then Q
		 */
		imp.setAntecedent(interpretSentence(stmt.getAntecedent()));
		imp.setConsequent(interpretSentence(stmt.getConsequent()));
		/* if there is no alternative (no else), we are done */
		if (stmt.getAlternative() == null) return imp;
		
		/* there is an else, we need the Connection */
		Connection c = makeConnection(Connective.AND);
		c.addOperand(imp);
		Negation neg = theFactory.createNegation();
		neg.setScope(imp.getAntecedent());
		imp = theFactory.createImplication();
		imp.setAntecedent(neg);
		imp.setConsequent(interpretSentence(stmt.getAlternative()));
		c.addOperand(imp);

		return c;
	}

	/** interpretEquivalence(equivalence)
	 * converts an Equivalence statement into a Connection linked by EQV
	 * @param stmt = the Equivalence from the parse
	 * @return the Connection proposition
	 */
	private static Connection interpretEquivalence(CompoundForm stmt)
	{
		Connection c = makeConnection(Connective.EQV);
		Iterator<Sentence> sit = stmt.getStatements().iterator();
		while (sit.hasNext()) {
			c.addOperand(interpretSentence(sit.next()));
		}
		return c;
	}

	/** interpretSimpleForm(SimpleForm)
	 * converts a SimpleForm statement into a Relation or a Negation
	 * depending on the Negated and Modality properties of the Verb
	 * (Rewrite has moved other modalities to DomainForms)
	 * @param stmt = the SimpleForm from the parse
	 * @return the Connection proposition
	 */
	private static Proposition interpretSimpleForm(SimpleForm stmt)
	{
		if (stmt.isNegated() || stmt.getModality() == Modality.NEGATION) {
			Negation neg = theFactory.createNegation();
			neg.setScope(makeRelation(stmt));
			return neg;
		} else {
			return makeRelation(stmt);
		}
	}

	/** makeRelation(SimpleForm)
	 * routine to convert a SimpleForm structure into a Relation
	 * In the process, it may causes variables to be created and 
	 * associated with their constraints, but it only uses them 
	 * @param stmt = the input SimpleForm structure
	 * @return the resulting Relation or null
	 */
	private static Proposition makeRelation(SimpleForm stmt)
	{
		Argument arg;
		int r;
		
		/* find/create the predicate */
		VocVerb verb = stmt.getVerb().getVerb();
		Predicate p = makePredicate(verb);
		
		/* make the Relation structure */		
		Relation rel = theFactory.createRelation();
		rel.setPredicate(p);

		Argument lastarg = null;
		for (r = 0; r < p.getVariables().size(); ++r) {
			arg = makeArgument(rel, r);
			if (lastarg != null) lastarg.setNext(arg);
			lastarg = arg;
		}
		
		/* associate RolePhrases with Arguments */
		stmt.makeRolesArray();
		for (r = 0; r < stmt.getRoles().length; ++r) {
			/* check for the @#$%$% empty particle */
			if (stmt.getRole(r) != null)
				rel.setRole(stmt.getRole(r));
		}

		/* now create all the pieces for the arguments */
		for (arg = rel.getArgument(); arg != null; arg = arg.getNext()) {
			interpretRolePhrase(arg);
		}
		
		return rel;
	}
	
	/** interpretRolePhrase(argument)
	 * transform one argument of the relation from 
	 * the Grammar form of the role player -- the RolePhrase
	 * the routine binds the Argument to the
	 * corresponding variable or constant
	 * if the RolePhrase involves quantifiers, qualifiers or modifiers,
	 * the routine will create a quantification for the Variable
	 * and add constraints to the Variable as needed
	 * The placement of the quantification and the constraining proposition
	 * in the logical structure is left to a later process that sees
	 * all uses of the Variables
	 * @param arg = the Argument whose content is to be transformed
	 */
	private static void interpretRolePhrase(Argument arg)
	{
		RolePhrase phrase = arg.getPhrase();
		if (phrase == null) return;
		
		/* if the phrase is a reference, use the referent */
		while (phrase.getReferent() != null)
			phrase = phrase.getReferent();
		
		/* if the phrase has an expansion, use the expansion */
		if (phrase.getType() == PhraseType.PROPERTY) {
			phrase = ((PropertyNoun)phrase).getExpansion();
			if (phrase == null || phrase.getVariable() == null) {
				ParseManager.printLine();
				RECONManager.errorlog.println("*** Internal error: unexpanded property: ");
				arg.getPhrase().print(2, RECONManager.errorlog);
				return;
			}
		}
		
		/* if the phrase has an assigned variable
		 * the role is played by the variable 
		 * use the variable and record the reference
		 */
		if (phrase.getVariable() != null) {
			arg.setVariable(phrase.getVariable());
			phrase.getVariable().getUses().add(arg.getRelation());
			return;
		}

		/* what is the argument? */
		switch (phrase.getType().getValue()) {
		case PhraseType.INSTANCE_VALUE:
			interpretInstance(arg, (Instance)phrase);
			return;

		case PhraseType.TYPE_NOUN_VALUE:
			/* create a Quantification
			 * make the variable the value of the relation argument,
			 * and add the relation to the uses of the Variable */
			Quantification q = (Quantification)interpretTypeNoun((TypeNoun)phrase);
			arg.setVariable(q.getVariable()); 
			q.getVariable().getUses().add(arg.getRelation());
			return;
			
		case PhraseType.PROPERTY_VALUE:
			/* create a Quantification
			 * make the variable the value of the relation argument,
			 * and add the relation to the uses of the Variable */
			q = (Quantification)interpretTypeNoun(((PropertyNoun)phrase).getExpansion());
			arg.setVariable(q.getVariable()); 
			q.getVariable().getUses().add(arg.getRelation());
			return;

		case PhraseType.GROUP_VALUE:
			/* TODO: create the interpretation of the Group, and a Variable for it
			 * and assign the variable to the arg */
			return;

		case PhraseType.ROLE_NOUN_VALUE:
			/* find the RoleVariable that corresponds to the RoleNoun
			 * RoleNoun to VerbRole to Verb to Predicate to RoleVariable */
			VerbRole role = ((RoleNoun)phrase).getRole();
			List<RoleVariable> rvlist = role.getVerb().getPredicate().getVariables();
			for (int r = rvlist.size(); r > 0; ) {
				RoleVariable rv = rvlist.get(--r);
				if (rv.getRole() == role) {
					arg.setVariable(rv);
					rv.getUses().add(arg.getRelation());
					return;
				}
			}
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Internal error: No RoleVariable for role " 
					+ role.external());
			return;
			
		case PhraseType.ANAPHOR_VALUE:
		case PhraseType.PRONOUN_VALUE:
		case PhraseType.LOCAL_NAME_VALUE:
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Internal error: Pronoun or LocalName without a reference");
			return;

		case PhraseType.INTERROGATIVE_VALUE:
			/* create a variable to refer to the Interrogative */
			phrase.setVariable(makeVariable("Query_" + variableNumber++));
			arg.setVariable(phrase.getVariable());
			phrase.getVariable().getUses().add(arg.getRelation());
			return;
			
		default:
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Internal error: Unexpected RolePhrase type");
			return;
		}
		
	}

	/** interpretTypeNoun(noun)
	 * transforms a TypeNoun to a Variable,
	 *  with an associated quantifier, if it is new
	 *  and with any qualifying propositions it may have
	 * @param noun = the TypeNoun in the role
	 * @return the proposition that quantifies or qualifies the variable
	 *  or null
	 */
	private static Quantification interpretTypeNoun(TypeNoun noun)
	{
		/* check for an existing Variable, produced by an inadvertent forward reference */
		Variable var = noun.getVariable();
		if (var != null) return var.getSource();
		
		/* no existing Variable, assign a new variable to this occurrence */
		var = makeVariable(noun.getNoun().getTerms().get(0));
		noun.setVariable(var);
		var.setRange(noun.getNoun());
		
		/* create a Quantification for it, based on the Quantifier */
		Quantification q = theFactory.createQuantification();
		q.setVariable(var);
		q.setUnique(false); //default
		
		/* what kind of Quantifier is it */
		if (noun.getQuantifier() == null)
			q.setKind(QuantifierKind.QALL);
		else
			q.setKind(noun.getQuantifier().getKind());
		
		switch (q.getKind().getValue()) {
		case QuantifierKind.QALL_VALUE:
		case QuantifierKind.QAN_VALUE:
			/* quantifier is correct */
			break;
		case QuantifierKind.QTHE_VALUE:
			q.setKind(QuantifierKind.QALL);
			q.setUnique(true);
			break;

		case QuantifierKind.QNO_VALUE:
			/* leave the NO and expand it to a negation of an
			 * existential quantification when inserting the quantification
			 */
			break;
		case QuantifierKind.QANY_VALUE:	/* the Any case */
			/* leave the ANY and revisit it after reorganizing quantifications */
			// TODO: fix ANY in interpreter
			break;
		case QuantifierKind.EXACTLY1_VALUE:
			q.setUnique(true);
			/* now do atleast1 */
		case QuantifierKind.AT_LEAST1_VALUE:
			q.setKind(QuantifierKind.QAN);
			break;
			
		case QuantifierKind.AT_MOST1_VALUE:
			/* there is a uniqueness constraint but no quantifier
			 * leave the atmost1 quantifier.  at most 1 x becomes: 
			 *  (if (exists x1 x2)(and (x x1) (x x2)) (= x2 x1))
			 */
			q.setUnique(true);
			break;
			
		case QuantifierKind.AT_LEAST_N_VALUE:
		case QuantifierKind.AT_MOST_N_VALUE:
		case QuantifierKind.EXACTLY_N_VALUE:
		case QuantifierKind.MORE_THAN_N_VALUE:
		case QuantifierKind.LESS_THAN_N_VALUE:
			/* Rewrite should have rewritten this to a collection form */
		default:
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Internal Error: unexpected quantifier kind "
					+ q.getKind());
		}
		
		/* convert the VocNoun of the TypeNoun to a constraint on the Variable */
		Relation rel = theFactory.createRelation();
		rel.setPredicate(makePredicate(noun.getNoun()));
		Argument arg = makeArgument(rel, 0);
		arg.setVariable(var);
		var.getUses().add(rel);
				
		if (noun.getQualifiers().isEmpty()) {
			/* no qualifiers, the classifier is the only constraint */
			var.setConstraint(rel);
		} else {
			/* generate an And connection for all the qualifiers */
			Connection andc = makeConnection(Connective.AND);
			andc.addOperand(rel);
			Iterator<Qualifier> qit = noun.getQualifiers().iterator();
			while (qit.hasNext()) {
				andc.addOperand(interpretQualifier(noun, qit.next()));
			}
			var.setConstraint(andc);
		}

		return q;
		
	}

	
	/** interpretQualifier(TypeNoun, Qualifier)
	 * transforms one Qualifier into a proposition that represents the qualifier
	 * 
	 * @param noun = the TypeNoun that is being qualified
	 * @param qual = the Qualifier to be transformed
	 * @return the proposition that is the transformation of the qualifier
	 */
	private static Proposition interpretQualifier(TypeNoun noun, Qualifier qual)
	{
		SimpleQualifier sq;
		Condition cond;
		Implication imp;
		Connection orc;
		Negation neg;
	
		/* if the Qualifier is simple, just convert the bound form */
		if (qual.isSimple()) {
			return interpretSentence(((SimpleQualifier)qual).getBoundForm());
		}

		
		/* the Qualifier is a chain */
		EList<SimpleQualifier> qlist = ((QualifierChain)qual).getQualifiers();
		
		/* check for a simple OR chain without conditions */
		if (qlist.get(0).getCondition() == null) {
			orc = makeConnection(Connective.OR);
			for (int q = 0; q < qlist.size(); ++q) {
				sq = qlist.get(q);
				orc.addOperand(interpretSentence(sq.getBoundForm()));
			}
			return orc;
		}

		 /* how long is it? */
		switch (qlist.size()) {
		case 0:	/* no entries? */
			return null;
		case 1: /* a chain with one conditional entry */
			sq = qlist.get(0);
			cond = sq.getCondition();
			if (cond == null || cond.isOtherwise()) 
				return interpretSentence(sq.getBoundForm());
			imp = theFactory.createImplication();
			imp.setAntecedent(interpretSentence(cond.getAntecedent()));			
			imp.setConsequent(interpretSentence(sq.getBoundForm()));			
			return imp;
		case 2:	/* a chain with two entries, look for otherwise */
			cond = qlist.get(1).getCondition();
			if (cond == null || cond.isOtherwise()) {
				/* we have Q1 if condition or Q2 [ otherwise ] */
				orc = makeConnection(Connective.OR);
				/* create and add the Q1 if condition term */
				sq = qlist.get(0);
				imp = theFactory.createImplication();
				imp.setConsequent(interpretSentence(sq.getBoundForm()));			
				imp.setAntecedent(interpretSentence(sq.getCondition().getAntecedent()));			
				orc.addOperand(imp);

				/* now create and add the Q2 if not condition term */
				neg = theFactory.createNegation();
				neg.setScope(imp.getAntecedent());
				imp = theFactory.createImplication();
				imp.setAntecedent(neg);			
				imp.setConsequent(interpretSentence(qlist.get(1).getBoundForm()));
				orc.addOperand(imp);
				return orc;
			}
			/* otherwise fall thru into the default n > 2 case */
		default: /* a chain with two or more real entries */
			/* set up the OR-chain */
			orc = makeConnection(Connective.OR);
			/* set up the antecedent for the otherwise */
			Connection condor = makeConnection(Connective.OR);
			for (int q = 0; q < qlist.size(); ++q) {
				sq = qlist.get(q);
				cond = sq.getCondition();
				imp = theFactory.createImplication();
				imp.setConsequent(interpretSentence(sq.getBoundForm()));			
				if (cond == null || cond.isOtherwise()) {
					/* the otherwise slot */
					neg = theFactory.createNegation();
					neg.setScope(condor);
					imp.setAntecedent(neg);
				} else {
					imp.setAntecedent(interpretSentence(cond.getAntecedent()));
					condor.addOperand(imp.getAntecedent());
				}
				orc.addOperand(imp);
			}
			return orc;
		}
	}
		

	/** interpretInstance(argument, instance)
	 * links the argument to the structure representing the instance
	 * that plays the role.  This includes constants, nominalized
	 * propositions, sets and nominalized concepts
	 * 
	 * @param arg = the Argument slot to hold the instance
	 * @param instance = the Grammar Instance of the role player
	 */
	private static void interpretInstance(Argument arg, Instance instance) 
	{
		ValueConstant con;
		
		switch(instance.getKind().getValue()) {
		case InstanceKind.NAME_VALUE:
			con = theFactory.createValueConstant();
			con.setName(transformName(((ProperName)instance).getName().getTerms().get(0)));
			con.setKind(InstanceKind.NAME);
			arg.setConstant(con);
			return;
		case InstanceKind.NUMBER_VALUE:
		case InstanceKind.STRING_VALUE:
			con = theFactory.createValueConstant();
			con.setName(((LexicalInstance)instance).getWord().external());
			con.setKind(instance.getKind());
			arg.setConstant(con);
			return;
		case InstanceKind.QUANTITY_VALUE:
			Quantity q = (Quantity)instance;
			if (q.getDimension().isEmpty()) {
				/* the Quantity is just a number */
				con = theFactory.createValueConstant();
				con.setName(q.getFactor().external());
				con.setKind(InstanceKind.NUMBER);
				arg.setConstant(con);
			} else {
				/* the Quantity has a unit, make a QuantityValue */
				arg.setConstant(makeQuantityValue(q));
			}
			return;
		case InstanceKind.STATEMENT_VALUE:
			/* the instance is a nominalization
			 * convert the statement to a proposition
			 * and make it a child of the relation for scoping variables
			 */
			NominalConstant nom = theFactory.createNominalConstant();
			nom.setKind(instance.getKind());
			nom.setProposition(interpretSentence(((Nominalization)instance).getSentence()));
			nom.getProposition().setOwner(arg.getRelation());
			arg.setConstant(nom);
			return;
			
		case InstanceKind.QUESTION_VALUE:
			// TODO: interpret question
		case InstanceKind.QUERY_VALUE:
		case InstanceKind.CONCEPT_VALUE:
			/* construct a group/set object and assign a Variable to it */
			// TODO: interpret Intension
			/* for now, put in a fake constant */
			con = theFactory.createValueConstant();
			con.setName("__Query__");
			con.setKind(InstanceKind.NAME);
			arg.setConstant(con);
		default:
			/* what the h... is this? */
			ParseManager.printLine();
			RECONManager.errorlog.println("*** Unimplemented instance kind '"
					+ instance.getKind().toString() + "'");
			return;
		}

	}

	/** makeQuantityValue(Quantity)
	 *  creates a QuantityValue (Constant) for the given Quantity
	 * @param q = the Quantity object for which the QuantityValue is to be made
	 * @return the resulting QuantityValue
	 */
	private static QuantityValue makeQuantityValue(Quantity q)
	{
		Dimension dim;
		
		/* create the QuantityValue */
		QuantityValue qvalue = theFactory.createQuantityValue();
		qvalue.setKind(InstanceKind.QUANTITY);
		qvalue.setFactor(q.getFactor().external());
		
		/* if the dimension expression consists of a single unit,
		 * produce (Qvalue <factor> <unit>)
		 */
		int dimensions = q.getDimension().size();
		if (dimensions == 1) {
			dim = q.getDimension().get(0);
			if (dim.getExponent() == 1) {
				qvalue.setUnit(dim.getUnit().external());
				return qvalue;
			}
		}

		/* complex dimension expression
		 * temporarily make one expression string as the name
		 * (PrIKL doesn't know anything about dimension expressions)
		 */
		dimexp.setLength(0);
		for (int d = 0; d < dimensions; ) {
			dim = q.getDimension().get(d);
			dimexp.append(dim.getUnit().external());
			if (dim.getExponent() != 1) {
				dimexp.append("^");
				dimexp.append(dim.getExponent());
			}
			if (++d < dimensions) dimexp.append("*");
		}
		qvalue.setUnit(dimexp.toString());
		return qvalue;
	}
	
	/** makeConnection
	 * creates a Connection object and assigns the kind (AND, OR, etc.)
	 * @param conn
	 * @return
	 */
	private static Connection makeConnection(Connective conn)
	{
		Connection c = theFactory.createConnection();
		c.setKind(conn);
		return c;
	}

	/** makeVariable(string)
	 * create a new Variable whose name is the string
	 * put the variable on the working list, 
	 * and give it a parent context if there is one.
	 * 
	 * @param term = a Term used as the basis for a meaningful name
	 */
	static public Variable makeVariable(String name)
	{
		Variable variable = theFactory.createVariable();
		variable.setName(name);
		varlist.add(variable);
		return variable;
	}

	/** makeVariable(term)
	 * create a new Variable with a name based on the term passed
	 * put the variable on the working list, 
	 * and give it a parent context if there is one.
	 * 
	 * @param term = a Term used as the basis for a meaningful name
	 */
	static public Variable makeVariable(Term term)
	{
		return makeVariable(makeVariableName(term, ++variableNumber));
	}

	/** makeVariableName(term, index)
	 * creates a unique name for a Variable, based on the term supplied
	 * 
	 * @param term = a term for the range or role of the Variable
	 * @param index = a (locally) unique integer
	 * @return a unique name for the Variable
	 */
	static public String makeVariableName(Term term, int index)
	{
		EList<Word> words = term.getWords();
		StringBuffer name = new StringBuffer();
		name.append('?');
		if (words.size() == 1) {
			name.append(words.get(0).getBase().getText());
		} else {
			for (int w = 0; w < words.size(); ++w) {
				name.append(words.get(w).getBase().getText().charAt(0));
			}
		}
		name.append(index);
		return name.toString();
	}

	/** makeArgument(relation)
	 *  make a new argument object and add it to the relation
	 * @param rel = the relation that is to own the argument
	 * @return the new Argument
	 */
	static private Argument makeArgument(Relation rel, int role)
	{
		Argument arg = theFactory.createArgument();
		rel.getArguments().add(arg);
		arg.setRelation(rel);
		arg.setRole(rel.getPredicate().getVariables().get(role).getRole());
		return arg;
	}
	
	/** makePredicate(VocNoun)
	 * find or create a Predicate that corresponds to a given Vocabulary Noun
	 * 
	 * @param item = the vocabulary item
	 * @return the corresponding Predicate
	 */
	static public Predicate makePredicate(VocNoun item)
	{
		/* first, try to find an existing predicate entry */
		if (item.getPredicate() != null) return item.getPredicate();
		
		/* if there is no entry, create one */
		Predicate p = theFactory.createPredicate();
		item.setPredicate(p);
		p.setNoun(item);
		
		/* now give the thing a name */
		p.setName(transformName(item.getTerms().get(0)));
		
		/* we may need a RoleVariable for definitions, 
		 * and every use has one Argument */
		RoleVariable rv = theFactory.createRoleVariable();
		rv.setRole(null);
		/* the role name is based on the Noun term */
		rv.setName(makeVariableName(item.getTerms().get(0), 0));
		p.getVariables().add(rv);
		return p;
	}

	/** makePredicate(VocVerb)
	 * find or create a Predicate that corresponds to a given Vocabulary Verb
	 * 
	 * @param item = the vocabulary item
	 * @return the corresponding Predicate
	 */
	static public Predicate makePredicate(VocVerb item)
	{
		/* first, try to find an existing predicate entry */
		if (item.getPredicate() != null) return item.getPredicate();
		
		/* if there is no entry, create one */
		Predicate p = theFactory.createPredicate();
		item.setPredicate(p);
		p.setVerb(item);
		
		/* the text of the Predicate is the first syntax form for the verb */
		p.setText(item.getForm().get(0).getText());
		
		/* now give the thing a name */
		p.setName(transformVerbName(p.getText()));
		
		/* A Verb can have multiple Roles
		 * create the RoleVariables to match
		 * Technically, we only need to do this if it will have a Definition
		 */
		int arity = item.getRoles().size();
		for (int index = 0; index < arity; ++index) {
			/* create the RoleVariable */
			VerbRole vrole = item.getRoles().get(index);
			RoleVariable rv = theFactory.createRoleVariable();
			rv.setRole(vrole);
			rv.setName(makeVariableName(vrole.getTerm(), -(index+1)));
			p.getVariables().add(rv);
		}
		
		return p;
	}

	/* common static buffer for term conversions */
	private static StringBuffer identifier = new StringBuffer(256);
	
	/** transformName(term)
	 * routine to convert a Vocabulary Term to a CLIF identifier
	 * @param term = the term to be converted
	 * @return the identifier
	 */
	public static String transformName(Term term)
	{
		int pos;

		/* copy the term to the identifier buffer */
		identifier.setLength(0);
		identifier.append(term.toString());
		for (pos = 0; pos < identifier.length(); ++pos) {
			if (identifier.charAt(pos) == ' ') 
				identifier.setCharAt(pos, '_');
		}
		return identifier.toString();
	}

	/** transformVerbName(verb form)
	 * routine to convert the first form of a Vocabulary Verb to a CLIF identifier
	 * the CLIF id is constructed from the SyntaxForm, including the roles
	 * @param form = the declaration form of the verb whose name is to be converted
	 * @return the identifier
	 */
	static private String transformVerbName(String form)
	{
		/* the basis for the Predicate name is the declaration form of the verb */
		/* now, convert the text form to an identifier */
		boolean inRole = false;
		boolean inTerm = false;
		int start = -1;		// place in text where the word started
		int rolemark = 0;	// place in identifier where the rolename started

		/* in the identifier, we transform the role structures */
		identifier.setLength(0);
		for (int c = 0; c < form.length(); ++c) {
			if (form.charAt(c) == ' ') {
				if (inRole || inTerm) {
					/* if we are in a word, add the word */
					if (start != c) {
						identifier.append(form.substring(start, c));
						identifier.append('_');
					}
					start = c + 1; // start of next word
				}
				/* if this is just a space after a marker, ignore it */

			} else if (form.charAt(c) == '(') {
				/* beginning of role */
				if (inTerm) {
					if (start == c) {
						/* the last character was a space at the end of a term word */
						identifier.setCharAt(identifier.length() - 1, '.');
					} else {
						/* copy the last term word */
						identifier.append(form.substring(start, c));
						identifier.append('.');
					}
					inTerm = false;
				}
				inRole = true;
				start = c + 1;
				rolemark = identifier.length(); // role insertion point
			
			} else if (form.charAt(c) == ')') {
				/* be sure this is not () and add the role word */
				if (start != c) {
					identifier.append(form.substring(start, c));
				}
				identifier.append('.');
				inRole = false;
			} else if (form.charAt(c) == ':') {
				if (inRole) {
					/* begin a role name after a type name,
					 * remove the type name from the identifier */
					identifier.setLength(rolemark);
					start = c + 1;
				} else {
					if (inTerm && c > start) {
						identifier.append(form.substring(start, c));
					} else {
						inTerm = true;
					}
					/* convert the colon to .. */
					identifier.append("..");
					start = c + 1;
				}
			} else if (inRole || inTerm) {
				/* continuation of a word -- do nothing */
			} else {
				/* start a term word */
				inTerm = true;
				start = c;
			}
		}
		
		/* end of form: check for final particle */
		if (inTerm) {
			/* there was a final particle 
			/* add the last word of the particle term to the name */
			identifier.append(form.substring(start, form.length()));
		} else {
			/* we just finished the final role with a period */
			identifier.setLength(identifier.length() - 1);
		}
		return identifier.toString();
	}

	/** makeSpecialPredicate(name, arity)
	 * make a predicate that is automatically generated for some construct
	 * 
	 * @param name = the IKL predicate
	 * @param arity = the number of arguments
	 * @return the new predicate
	 */
	private static Predicate makeSpecialPredicate(String name, int arity)
	{
		Predicate p = theFactory.createPredicate();
		p.setName(name);
		for (int role = 0; role < arity; ++role) {
			RoleVariable rv = theFactory.createRoleVariable();
			rv.setRole(null);
			/* the role name is based on the Noun term */
			rv.setName("?" + name + role);
			p.getVariables().add(rv);
		}
		return p;
	}

	/** toIKLstring(string)
	 * convert the given string to an IKL quote-able string
	 * @param s = the string to be converted
	 * @return the IKL representation of the string
	 */
	static private String toIKLstring(String s)
	{
		int escapes = 0;

		/* count the characters in the string that must be escaped in the IKL string
		 */
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '\'' ||s.charAt(i) == '\\') 
				++escapes;
		}
		/* if no escapes are needed return the original */
		if (escapes == 0) return s;
	
		/* otherwise prefix each escaped character with the reverse solidus (\) */
		StringBuffer result = new StringBuffer(s.length() + escapes);
		int bpos = 0;
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == '\'' ||c == '\\') result.setCharAt(bpos++, '\\');
			result.setCharAt(bpos++, c);
		}
		return result.toString();
	}

	
}


