/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.RoleElement#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Vocabulary.RoleElement#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getRoleElement()
 * @model
 * @generated
 */
public interface RoleElement extends FormElement {
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
	 * @see NBVR.Vocabulary.VocabularyPackage#getRoleElement_Role()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VerbRole getRole();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.RoleElement#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(VerbRole value);

	/**
	 * to be 
	 * @generated
	 * @return
	 */
	int getSlot();

	/**
	 * to be 
	 * @generated
	 * @param value
	 */
	void setSlot(int value);

} // RoleElement
