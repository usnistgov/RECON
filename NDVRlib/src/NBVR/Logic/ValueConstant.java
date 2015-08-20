/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.ValueConstant#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getValueConstant()
 * @model
 * @generated
 */
public interface ValueConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NBVR.Logic.LogicPackage#getValueConstant_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NBVR.Logic.ValueConstant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ValueConstant
