/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a sentence structure of the form:
 *   For each x, sentence
 *   There exists an x such that sentence
 * Used specifically in expanding properties, to introduce the domain (variable) before the property variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.DomainForm#getStatement <em>Statement</em>}</li>
 *   <li>{@link NBVR.Grammar.DomainForm#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getDomainForm()
 * @model
 * @generated
 */
public interface DomainForm extends Sentence {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getDomainForm_Statement()
	 * @model ordered="false"
	 * @generated
	 */
	Sentence getStatement();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.DomainForm#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Sentence value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.Modality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #setModality(Modality)
	 * @see NBVR.Grammar.GrammarPackage#getDomainForm_Modality()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Modality getModality();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.DomainForm#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Modality value);

} // DomainForm
