/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.NominalConstant#getProposition <em>Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getNominalConstant()
 * @model
 * @generated
 */
public interface NominalConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposition</em>' reference.
	 * @see #setProposition(Proposition)
	 * @see NBVR.Logic.LogicPackage#getNominalConstant_Proposition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proposition getProposition();

	/**
	 * Sets the value of the '{@link NBVR.Logic.NominalConstant#getProposition <em>Proposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposition</em>' reference.
	 * @see #getProposition()
	 * @generated
	 */
	void setProposition(Proposition value);

} // NominalConstant
