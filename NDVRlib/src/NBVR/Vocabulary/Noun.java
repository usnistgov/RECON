/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Noun#getPlural <em>Plural</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Noun#getAltPlural <em>Alt Plural</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getNoun()
 * @model
 * @generated
 */
public interface Noun extends Word {
	/**
	 * Returns the value of the '<em><b>Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plural</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plural</em>' reference.
	 * @see #setPlural(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getNoun_Plural()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getPlural();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Noun#getPlural <em>Plural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plural</em>' reference.
	 * @see #getPlural()
	 * @generated
	 */
	void setPlural(WordForm value);

	/**
	 * Returns the value of the '<em><b>Alt Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Plural</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Plural</em>' reference.
	 * @see #setAltPlural(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getNoun_AltPlural()
	 * @model ordered="false"
	 * @generated
	 */
	WordForm getAltPlural();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Noun#getAltPlural <em>Alt Plural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Plural</em>' reference.
	 * @see #getAltPlural()
	 * @generated
	 */
	void setAltPlural(WordForm value);

} // Noun
