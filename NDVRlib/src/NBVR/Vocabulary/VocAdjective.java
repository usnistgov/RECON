/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voc Adjective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VocAdjective#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocAdjective#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVocAdjective()
 * @model
 * @generated
 */
public interface VocAdjective extends VocabularyItem {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(VocNoun)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocAdjective_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	VocNoun getDomain();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocAdjective#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(VocNoun value);

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' reference.
	 * @see #setVerb(VocVerb)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocAdjective_Verb()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocAdjective#getVerb <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

} // VocAdjective
