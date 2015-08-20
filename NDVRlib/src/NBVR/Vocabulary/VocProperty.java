/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voc Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VocProperty#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocProperty#getRange <em>Range</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocProperty#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocProperty#getPropertyForm <em>Property Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVocProperty()
 * @model
 * @generated
 */
public interface VocProperty extends VocabularyItem {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(VocNoun)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocProperty_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocNoun getRange();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocProperty#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(VocNoun value);

	/**
	 * Returns the value of the '<em><b>Property Form</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.SyntaxForm}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.SyntaxForm#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Form</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocProperty_PropertyForm()
	 * @see NBVR.Vocabulary.SyntaxForm#getProperty
	 * @model opposite="property" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<SyntaxForm> getPropertyForm();

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
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocProperty_Verb()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocProperty#getVerb <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

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
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocProperty_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocNoun getDomain();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocProperty#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(VocNoun value);

	/** findPropertyForm (term)
	 * find the Syntax Form for the property that uses the given term
	 * @param term = the term used for the property in the form of interest
	 * @return the Syntax Form that uses that term, or null
	 * @generated not
	 */
	SyntaxForm findPropertyForm(Term term);
	
	/** getDomainRole()
	 * find the VerbRole that is the Domain role of the Property
	 * @return the VerbRole representing the domain
	 * @generated not
	 */
	VerbRole getDomainRole();

} // VocProperty
