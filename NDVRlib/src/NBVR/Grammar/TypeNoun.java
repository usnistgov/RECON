/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.VocNoun;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Noun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.TypeNoun#getNoun <em>Noun</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getTypeNoun()
 * @model
 * @generated
 */
public interface TypeNoun extends ModifiedTerm {
	/**
	 * Returns the value of the '<em><b>Noun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noun</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noun</em>' reference.
	 * @see #setNoun(VocNoun)
	 * @see NBVR.Grammar.GrammarPackage#getTypeNoun_Noun()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocNoun getNoun();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.TypeNoun#getNoun <em>Noun</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noun</em>' reference.
	 * @see #getNoun()
	 * @generated
	 */
	void setNoun(VocNoun value);

} // TypeNoun
