/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.ImplicationForm#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link NBVR.Grammar.ImplicationForm#getConsequent <em>Consequent</em>}</li>
 *   <li>{@link NBVR.Grammar.ImplicationForm#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link NBVR.Grammar.ImplicationForm#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getImplicationForm()
 * @model
 * @generated
 */
public interface ImplicationForm extends Sentence {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getImplicationForm_Antecedent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Sentence getAntecedent();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ImplicationForm#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(Sentence value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' reference.
	 * @see #setConsequent(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getImplicationForm_Consequent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Sentence getConsequent();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ImplicationForm#getConsequent <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(Sentence value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' reference.
	 * @see #setAlternative(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getImplicationForm_Alternative()
	 * @model ordered="false"
	 * @generated
	 */
	Sentence getAlternative();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ImplicationForm#getAlternative <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Sentence value);

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
	 * @see NBVR.Grammar.GrammarPackage#getImplicationForm_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connective getKind();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ImplicationForm#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Connective
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Connective value);

} // ImplicationForm
