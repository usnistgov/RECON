/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.VocProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Noun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.PropertyNoun#getProperty <em>Property</em>}</li>
 *   <li>{@link NBVR.Grammar.PropertyNoun#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Grammar.PropertyNoun#getExpansion <em>Expansion</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getPropertyNoun()
 * @model
 * @generated
 */
public interface PropertyNoun extends ModifiedTerm {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(SimpleNounPhrase)
	 * @see NBVR.Grammar.GrammarPackage#getPropertyNoun_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SimpleNounPhrase getDomain();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.PropertyNoun#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(SimpleNounPhrase value);

	/**
	 * Returns the value of the '<em><b>Expansion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expansion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expansion</em>' reference.
	 * @see #setExpansion(TypeNoun)
	 * @see NBVR.Grammar.GrammarPackage#getPropertyNoun_Expansion()
	 * @model ordered="false"
	 * @generated
	 */
	TypeNoun getExpansion();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.PropertyNoun#getExpansion <em>Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expansion</em>' reference.
	 * @see #getExpansion()
	 * @generated
	 */
	void setExpansion(TypeNoun value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(VocProperty)
	 * @see NBVR.Grammar.GrammarPackage#getPropertyNoun_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocProperty getProperty();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.PropertyNoun#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(VocProperty value);

} // PropertyNoun
