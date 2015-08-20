/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Nominalization#getSentence <em>Sentence</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getNominalization()
 * @model abstract="true"
 * @generated
 */
public interface Nominalization extends Instance {
	/**
	 * Returns the value of the '<em><b>Sentence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence</em>' reference.
	 * @see #setSentence(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getNominalization_Sentence()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Sentence getSentence();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Nominalization#getSentence <em>Sentence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence</em>' reference.
	 * @see #getSentence()
	 * @generated
	 */
	void setSentence(Sentence value);

} // Nominalization
