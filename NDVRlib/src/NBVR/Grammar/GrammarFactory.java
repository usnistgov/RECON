/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import org.eclipse.emf.ecore.EFactory;

import NBVR.Vocabulary.Keyword;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage
 * @generated
 */
public interface GrammarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarFactory eINSTANCE = NBVR.Grammar.impl.GrammarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Phrase</em>'.
	 * @generated
	 */
	GroupPhrase createGroupPhrase();

	/**
	 * Returns a new object of class '<em>Parse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parse</em>'.
	 * @generated
	 */
	Parse createParse();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Type Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Noun</em>'.
	 * @generated
	 */
	TypeNoun createTypeNoun();

	/**
	 * Returns a new object of class '<em>Quantifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantifier</em>'.
	 * @generated
	 */
	Quantifier createQuantifier();

	/**
	 * <!-- begin-user-doc -->
	 * create a simple Quantifier with its kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	Quantifier createQuantifier(QuantifierKind kind);

	/**
	 * Returns a new object of class '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier</em>'.
	 * @generated
	 */
	Modifier createModifier();

	/**
	 * Returns a new object of class '<em>Simple Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Qualifier</em>'.
	 * @generated
	 */
	SimpleQualifier createSimpleQualifier();

	/**
	 * Returns a new object of class '<em>Qualifier Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier Chain</em>'.
	 * @generated
	 */
	QualifierChain createQualifierChain();

	/**
	 * Returns a new object of class '<em>Property Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Noun</em>'.
	 * @generated
	 */
	PropertyNoun createPropertyNoun();

	/**
	 * Returns a new object of class '<em>Role Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Noun</em>'.
	 * @generated
	 */
	RoleNoun createRoleNoun();

	/**
	 * Returns a new object of class '<em>Verb Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb Phrase</em>'.
	 * @generated
	 */
	VerbPhrase createVerbPhrase();

	/**
	 * Returns a new object of class '<em>Simple Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Form</em>'.
	 * @generated
	 */
	SimpleForm createSimpleForm();

	/**
	 * Returns a new object of class '<em>Implication Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication Form</em>'.
	 * @generated
	 */
	ImplicationForm createImplicationForm();

	/**
	 * Returns a new object of class '<em>Part Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Phrase</em>'.
	 * @generated
	 */
	PartPhrase createPartPhrase();

	/**
	 * Returns a new object of class '<em>Compound Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Form</em>'.
	 * @generated
	 */
	CompoundForm createCompoundForm();

	/**
	 * Returns a new object of class '<em>Compound Form</em>'
	 * with the 'Kind' property set (AND, OR, NOR, etc.).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Form</em>'.
	 * @generated not
	 */
	CompoundForm createCompoundForm(Connective kind);
	
	/**
	 * Returns a new object of class '<em>Lexical Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexical Instance</em>'.
	 * @generated
	 */
	LexicalInstance createLexicalInstance();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Query Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Phrase</em>'.
	 * @generated
	 */
	QueryPhrase createQueryPhrase();

	/**
	 * Returns a new object of class '<em>Pronoun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pronoun</em>'.
	 * @generated
	 */
	Pronoun createPronoun();

	/**
	 * Returns a new object of class '<em>Intension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intension</em>'.
	 * @generated
	 */
	Intension createIntension();

	/**
	 * <!-- begin-user-doc -->
	 * create a specific Pronoun given the keyword
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	Pronoun createPronoun(Keyword kind);

	/**
	 * Returns a new object of class '<em>Domain Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Form</em>'.
	 * @generated
	 */
	DomainForm createDomainForm();

	/**
	 * Returns a new object of class '<em>Local Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Name</em>'.
	 * @generated
	 */
	LocalName createLocalName();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension</em>'.
	 * @generated
	 */
	Dimension createDimension();

	/**
	 * Returns a new object of class '<em>Proper Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proper Name</em>'.
	 * @generated
	 */
	ProperName createProperName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrammarPackage getGrammarPackage();

} //GrammarFactory
