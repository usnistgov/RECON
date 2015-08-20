/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Negation#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends Proposition {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Proposition)
	 * @see NBVR.Logic.LogicPackage#getNegation_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proposition getScope();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Negation#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Proposition value);

} // Negation
