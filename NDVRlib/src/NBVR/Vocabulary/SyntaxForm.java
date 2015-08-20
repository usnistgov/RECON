/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.SyntaxForm#getElements <em>Elements</em>}</li>
 *   <li>{@link NBVR.Vocabulary.SyntaxForm#isAuxForm <em>Is Aux Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.SyntaxForm#getProperty <em>Property</em>}</li>
 *   <li>{@link NBVR.Vocabulary.SyntaxForm#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.SyntaxForm#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getSyntaxForm()
 * @model
 * @generated
 */
public interface SyntaxForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.FormElement}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.FormElement#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getSyntaxForm_Elements()
	 * @see NBVR.Vocabulary.FormElement#getForm
	 * @model opposite="form" containment="true" required="true"
	 * @generated
	 */
	EList<FormElement> getElements();

	/**
	 * Returns the value of the '<em><b>Is Aux Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Aux Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aux Form</em>' attribute.
	 * @see #setIsAuxForm(boolean)
	 * @see NBVR.Vocabulary.VocabularyPackage#getSyntaxForm_IsAuxForm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAuxForm();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.SyntaxForm#isAuxForm <em>Is Aux Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aux Form</em>' attribute.
	 * @see #isAuxForm()
	 * @generated
	 */
	void setIsAuxForm(boolean value);


	/**
	 * Returns the value of the '<em><b>Verb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocVerb#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' container reference.
	 * @see #setVerb(VocVerb)
	 * @see NBVR.Vocabulary.VocabularyPackage#getSyntaxForm_Verb()
	 * @see NBVR.Vocabulary.VocVerb#getForm
	 * @model opposite="form" transient="false" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.SyntaxForm#getVerb <em>Verb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' container reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocProperty#getPropertyForm <em>Property Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' container reference.
	 * @see #setProperty(VocProperty)
	 * @see NBVR.Vocabulary.VocabularyPackage#getSyntaxForm_Property()
	 * @see NBVR.Vocabulary.VocProperty#getPropertyForm
	 * @model opposite="propertyForm" transient="false" ordered="false"
	 * @generated
	 */
	VocProperty getProperty();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.SyntaxForm#getProperty <em>Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' container reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(VocProperty value);

	/* add-ons */

	/**
	 * add a FormElement to the SyntaxForm
	 * @param elt
	 * @generated NOT
	 */
	void addElement(FormElement elt);
	
	/** getText()
	 * routine to produce a text form from the SyntaxForm, 
	 * including the parenthesized roles
	 * 
	 * @return the text form
	 * @generated NOT
	 */
	String getText();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.SyntaxForm#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // SyntaxForm
