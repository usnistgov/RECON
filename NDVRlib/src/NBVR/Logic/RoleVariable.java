/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Vocabulary.VerbRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.RoleVariable#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link NBVR.Logic.RoleVariable#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getRoleVariable()
 * @model
 * @generated
 */
public interface RoleVariable extends Variable {
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
	 * @see NBVR.Logic.LogicPackage#getRoleVariable_Role()
	 * @model ordered="false"
	 * @generated
	 */
	VerbRole getRole();

	/**
	 * Sets the value of the '{@link NBVR.Logic.RoleVariable#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(VerbRole value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Predicate#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' container reference.
	 * @see #setPredicate(Predicate)
	 * @see NBVR.Logic.LogicPackage#getRoleVariable_Predicate()
	 * @see NBVR.Logic.Predicate#getVariables
	 * @model opposite="variables" transient="false" ordered="false"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link NBVR.Logic.RoleVariable#getPredicate <em>Predicate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' container reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

} // RoleVariable
