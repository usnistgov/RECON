/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import java.io.PrintWriter;
import NBVR.Vocabulary.FormulationForm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Proposition#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Logic.Proposition#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getProposition()
 * @model abstract="true"
 * @generated
 */
public interface Proposition extends FormulationForm {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see NBVR.Logic.LogicPackage#getProposition_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Proposition#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Proposition)
	 * @see NBVR.Logic.LogicPackage#getProposition_Owner()
	 * @model ordered="false"
	 * @generated
	 */
	Proposition getOwner();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Proposition#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Proposition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	PropositionKind getType();
	
	// add-ons
	
	/** toIKL(offset)
	 * produces IKL for the Proposition
	 * @generated not
	 */
	void toIKL(PrintWriter iklout, int offset);
	
	/** testAndSet(mark)
	 * interrogate and change the value of the traversal mark
	 * @generated not
	 */
	int testAndSet(int newmark);

} // Proposition
