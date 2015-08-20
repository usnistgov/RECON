/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Intension has one of three grammatical forms:
 * a) Question:  Why/How <sentence>
 * b) Interrogative:  What/HowMany <rolePhrase>
 * c) ReifiedClassifier: <rolePhrase>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Intension#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getIntension()
 * @model
 * @generated
 */
public interface Intension extends Instance {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getIntension_Concept()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getConcept();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Intension#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(RolePhrase value);

} // Intension
