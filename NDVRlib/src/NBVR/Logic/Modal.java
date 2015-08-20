/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Grammar.Modality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Modal#getScope <em>Scope</em>}</li>
 *   <li>{@link NBVR.Logic.Modal#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getModal()
 * @model
 * @generated
 */
public interface Modal extends Proposition {
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
	 * @see NBVR.Logic.LogicPackage#getModal_Scope()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proposition getScope();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Modal#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Proposition value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.Modality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #setKind(Modality)
	 * @see NBVR.Logic.LogicPackage#getModal_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Modality getKind();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Modal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Modality value);

} // Modal
