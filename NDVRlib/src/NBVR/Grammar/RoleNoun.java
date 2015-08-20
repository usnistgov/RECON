/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocNoun;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Noun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.RoleNoun#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getRoleNoun()
 * @model
 * @generated
 */
public interface RoleNoun extends SimpleNounPhrase {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(VerbRole)
	 * @see NBVR.Grammar.GrammarPackage#getRoleNoun_Role()
	 * @model ordered="false"
	 * @generated
	 */
	VerbRole getRole();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.RoleNoun#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(VerbRole value);
	
	/* add-ons */
	
	/**
	 * returns the VocNoun that is the range of the associated Role
	 * @generated not
	 */
	VocNoun getRange();

} // RoleNoun
