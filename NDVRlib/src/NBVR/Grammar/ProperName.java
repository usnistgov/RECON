/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.VocName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proper Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.ProperName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getProperName()
 * @model
 * @generated
 */
public interface ProperName extends Instance {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The word used in the lexical instance.  It must be a proper name, a number, or a string delimited by quotation marks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(VocName)
	 * @see NBVR.Grammar.GrammarPackage#getProperName_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocName getName();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ProperName#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(VocName value);

} // ProperName
