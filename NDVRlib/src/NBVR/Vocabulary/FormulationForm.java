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
 * A representation of the model object '<em><b>Formulation Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.FormulationForm#getFormulation <em>Formulation</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getFormulationForm()
 * @model abstract="true"
 * @generated
 */
public interface FormulationForm extends EObject {

	/**
	 * Returns the value of the '<em><b>Formulation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Formulation#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulation</em>' container reference.
	 * @see #setFormulation(Formulation)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulationForm_Formulation()
	 * @see NBVR.Vocabulary.Formulation#getForm
	 * @model opposite="form" transient="false" ordered="false"
	 * @generated
	 */
	Formulation getFormulation();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.FormulationForm#getFormulation <em>Formulation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formulation</em>' container reference.
	 * @see #getFormulation()
	 * @generated
	 */
	void setFormulation(Formulation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isStructured();
} // FormulationForm
