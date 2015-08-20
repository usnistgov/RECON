/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.SimpleQualifier#getChain <em>Chain</em>}</li>
 *   <li>{@link NBVR.Grammar.SimpleQualifier#getBoundForm <em>Bound Form</em>}</li>
 *   <li>{@link NBVR.Grammar.SimpleQualifier#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getSimpleQualifier()
 * @model
 * @generated
 */
public interface SimpleQualifier extends Qualifier {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.Condition#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The conditions attached to a Qualifier are implicitly alternatives (OR).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleQualifier_Condition()
	 * @see NBVR.Grammar.Condition#getQualifier
	 * @model opposite="qualifier" ordered="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleQualifier#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Bound Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Form</em>' reference.
	 * @see #setBoundForm(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleQualifier_BoundForm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Sentence getBoundForm();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleQualifier#getBoundForm <em>Bound Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Form</em>' reference.
	 * @see #getBoundForm()
	 * @generated
	 */
	void setBoundForm(Sentence value);

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.QualifierChain#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' reference.
	 * @see #setChain(QualifierChain)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleQualifier_Chain()
	 * @see NBVR.Grammar.QualifierChain#getQualifiers
	 * @model opposite="qualifiers" ordered="false"
	 * @generated
	 */
	QualifierChain getChain();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleQualifier#getChain <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain</em>' reference.
	 * @see #getChain()
	 * @generated
	 */
	void setChain(QualifierChain value);

} // SimpleQualifier
