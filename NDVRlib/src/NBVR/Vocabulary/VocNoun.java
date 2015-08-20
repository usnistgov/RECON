/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import NBVR.Logic.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voc Noun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VocNoun#getIsAVerb <em>Is AVerb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocNoun#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocNoun#isMassNoun <em>Mass Noun</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVocNoun()
 * @model
 * @generated
 */
public interface VocNoun extends VocabularyItem {
	/**
	 * Returns the value of the '<em><b>Is AVerb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is AVerb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is AVerb</em>' reference.
	 * @see #setIsAVerb(VocVerb)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocNoun_IsAVerb()
	 * @model ordered="false"
	 * @generated
	 */
	VocVerb getIsAVerb();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocNoun#getIsAVerb <em>Is AVerb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is AVerb</em>' reference.
	 * @see #getIsAVerb()
	 * @generated
	 */
	void setIsAVerb(VocVerb value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Predicate#getNoun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Predicate)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocNoun_Predicate()
	 * @see NBVR.Logic.Predicate#getNoun
	 * @model opposite="noun" containment="true" ordered="false"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocNoun#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/**
	 * Returns the value of the '<em><b>Mass Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Noun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Noun</em>' attribute.
	 * @see #setMassNoun(boolean)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocNoun_MassNoun()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMassNoun();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocNoun#isMassNoun <em>Mass Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Noun</em>' attribute.
	 * @see #isMassNoun()
	 * @generated
	 */
	void setMassNoun(boolean value);

} // VocNoun
