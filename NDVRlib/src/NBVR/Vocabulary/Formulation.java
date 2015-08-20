/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import NBVR.Grammar.ParseElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Formulation#getForm <em>Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Formulation#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Formulation#getLanguage <em>Language</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Formulation#getElements <em>Elements</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Formulation#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation()
 * @model
 * @generated
 */
public interface Formulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.FormulationForm#getFormulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(FormulationForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation_Form()
	 * @see NBVR.Vocabulary.FormulationForm#getFormulation
	 * @model opposite="formulation" containment="true" ordered="false"
	 * @generated
	 */
	FormulationForm getForm();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Formulation#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(FormulationForm value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * the value is really a code:
	 *   for natural languages, use ISO 639 2-character ('en')
	 *   for formal languages, use the language acronym: CL, OWL, SBVR, NRE
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the value is really a code:
	 * - for natural languages, use ISO 639 2-character ('en')
	 * - for formal languages, use the language acronym: CL, OWL, SBVR, NRE
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Formulation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Grammar.ParseElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParseElement> getElements();

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
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation_Text()
	 * @model ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Formulation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isStructured();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eltRequired="true" eltOrdered="false"
	 * @generated
	 */
	void addElement(ParseElement elt);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocabularyItem#getFormulations <em>Formulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' container reference.
	 * @see #setConcept(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getFormulation_Concept()
	 * @see NBVR.Vocabulary.VocabularyItem#getFormulations
	 * @model opposite="formulations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	VocabularyItem getConcept();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Formulation#getConcept <em>Concept</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' container reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(VocabularyItem value);
	

} // Formulation
