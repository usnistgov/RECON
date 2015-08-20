/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Verb#getSingular <em>Singular</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Verb#getPlural <em>Plural</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Verb#getPast <em>Past</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Verb#getProgressive <em>Progressive</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Verb#getPerfective <em>Perfective</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Verb#getAltPast <em>Alt Past</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVerb()
 * @model
 * @generated
 */
public interface Verb extends Word {
	/**
	 * Returns the value of the '<em><b>Singular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singular</em>' reference.
	 * @see #setSingular(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_Singular()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getSingular();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getSingular <em>Singular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singular</em>' reference.
	 * @see #getSingular()
	 * @generated
	 */
	void setSingular(WordForm value);

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
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_Plural()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getPlural();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getPlural <em>Plural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plural</em>' reference.
	 * @see #getPlural()
	 * @generated
	 */
	void setPlural(WordForm value);

	/**
	 * Returns the value of the '<em><b>Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past</em>' reference.
	 * @see #setPast(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_Past()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getPast();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getPast <em>Past</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past</em>' reference.
	 * @see #getPast()
	 * @generated
	 */
	void setPast(WordForm value);

	/**
	 * Returns the value of the '<em><b>Progressive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progressive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progressive</em>' reference.
	 * @see #setProgressive(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_Progressive()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getProgressive();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getProgressive <em>Progressive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progressive</em>' reference.
	 * @see #getProgressive()
	 * @generated
	 */
	void setProgressive(WordForm value);

	/**
	 * Returns the value of the '<em><b>Perfective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perfective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfective</em>' reference.
	 * @see #setPerfective(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_Perfective()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getPerfective();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getPerfective <em>Perfective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perfective</em>' reference.
	 * @see #getPerfective()
	 * @generated
	 */
	void setPerfective(WordForm value);

	/**
	 * Returns the value of the '<em><b>Alt Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Past</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Past</em>' reference.
	 * @see #setAltPast(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerb_AltPast()
	 * @model ordered="false"
	 * @generated
	 */
	WordForm getAltPast();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Verb#getAltPast <em>Alt Past</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Past</em>' reference.
	 * @see #getAltPast()
	 * @generated
	 */
	void setAltPast(WordForm value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" wfRequired="true" wfOrdered="false"
	 * @generated
	 */
	boolean isProgressive(String wf);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" wfRequired="true" wfOrdered="false"
	 * @generated
	 */
	boolean isPast(String wf);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" wfRequired="true" wfOrdered="false"
	 * @generated
	 */
	boolean isPerfective(String wf);

} // Verb
