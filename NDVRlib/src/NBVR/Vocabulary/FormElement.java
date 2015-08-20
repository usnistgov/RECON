/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.FormElement#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Vocabulary.FormElement#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getFormElement()
 * @model abstract="true"
 * @generated
 */
public interface FormElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Vocabulary.FormElementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.FormElementKind
	 * @see #setKind(FormElementKind)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormElement_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FormElementKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.FormElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.FormElementKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FormElementKind value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.SyntaxForm#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' container reference.
	 * @see #setForm(SyntaxForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormElement_Form()
	 * @see NBVR.Vocabulary.SyntaxForm#getElements
	 * @model opposite="elements" transient="false" ordered="false"
	 * @generated
	 */
	SyntaxForm getForm();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.FormElement#getForm <em>Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' container reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(SyntaxForm value);

} // FormElement
