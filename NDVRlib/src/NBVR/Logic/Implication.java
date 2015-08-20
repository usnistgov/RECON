/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Implication#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link NBVR.Logic.Implication#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getImplication()
 * @model
 * @generated
 */
public interface Implication extends Proposition {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(Proposition)
	 * @see NBVR.Logic.LogicPackage#getImplication_Antecedent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proposition getAntecedent();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Implication#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(Proposition value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' reference.
	 * @see #setConsequent(Proposition)
	 * @see NBVR.Logic.LogicPackage#getImplication_Consequent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Proposition getConsequent();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Implication#getConsequent <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(Proposition value);

} // Implication
