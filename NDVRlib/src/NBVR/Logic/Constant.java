/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Grammar.InstanceKind;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Constant#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getConstant()
 * @model abstract="true"
 * @generated
 */
public interface Constant extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.InstanceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.InstanceKind
	 * @see #setKind(InstanceKind)
	 * @see NBVR.Logic.LogicPackage#getConstant_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Constant#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.InstanceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(InstanceKind value);

	/** toIKL()
	 *   print the argument in an output of the tree
	 * @generated not
	 */
	void toIKL(PrintWriter iklout, int offset);

} // Constant
