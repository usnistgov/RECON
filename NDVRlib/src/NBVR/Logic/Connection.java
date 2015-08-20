/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Grammar.Connective;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Connection#getOperands <em>Operands</em>}</li>
 *   <li>{@link NBVR.Logic.Connection#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Proposition {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Logic.Proposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' reference list.
	 * @see NBVR.Logic.LogicPackage#getConnection_Operands()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Proposition> getOperands();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.Connective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Connective
	 * @see #setKind(Connective)
	 * @see NBVR.Logic.LogicPackage#getConnection_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connective getKind();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Connection#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Connective
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Connective value);
	
	/** addOperand(proposition)
	 * adds the passed proposition to the operands of the Connection
	 * @param p = the proposition to be added
	 * @generated not
	 */
	void addOperand(Proposition p);
} // Connection
