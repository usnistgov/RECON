/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.Keyword;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pronoun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Pronoun#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getPronoun()
 * @model
 * @generated
 */
public interface Pronoun extends ModifiedTerm {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' reference.
	 * @see #setKeyword(Keyword)
	 * @see NBVR.Grammar.GrammarPackage#getPronoun_Keyword()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Keyword getKeyword();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Pronoun#getKeyword <em>Keyword</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(Keyword value);

} // Pronoun
