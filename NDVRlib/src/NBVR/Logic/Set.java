/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Set#getExtent <em>Extent</em>}</li>
 *   <li>{@link NBVR.Logic.Set#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Variable#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see NBVR.Logic.LogicPackage#getSet_Variable()
	 * @see NBVR.Logic.Variable#getSet
	 * @model opposite="set" required="true" ordered="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Set#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.ExtentConstant#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(ExtentConstant)
	 * @see NBVR.Logic.LogicPackage#getSet_Extent()
	 * @see NBVR.Logic.ExtentConstant#getSet
	 * @model opposite="set" ordered="false"
	 * @generated
	 */
	ExtentConstant getExtent();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Set#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(ExtentConstant value);

} // Set
