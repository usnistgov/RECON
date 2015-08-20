/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.ExtentConstant#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getExtentConstant()
 * @model
 * @generated
 */
public interface ExtentConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Set#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(Set)
	 * @see NBVR.Logic.LogicPackage#getExtentConstant_Set()
	 * @see NBVR.Logic.Set#getExtent
	 * @model opposite="extent" required="true" ordered="false"
	 * @generated
	 */
	Set getSet();

	/**
	 * Sets the value of the '{@link NBVR.Logic.ExtentConstant#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(Set value);

} // ExtentConstant
