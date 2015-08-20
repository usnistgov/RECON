/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Condition#isOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link NBVR.Grammar.Condition#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link NBVR.Grammar.Condition#getAntecedent <em>Antecedent</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends ParseElement {
	
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
	 * @see NBVR.Grammar.GrammarPackage#getCondition_Antecedent()
	 * @model ordered="false"
	 * @generated
	 */
	Sentence getAntecedent();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Condition#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(Sentence value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' attribute.
	 * @see #setOtherwise(boolean)
	 * @see NBVR.Grammar.GrammarPackage#getCondition_Otherwise()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOtherwise();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Condition#isOtherwise <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' attribute.
	 * @see #isOtherwise()
	 * @generated
	 */
	void setOtherwise(boolean value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.SimpleQualifier#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(SimpleQualifier)
	 * @see NBVR.Grammar.GrammarPackage#getCondition_Qualifier()
	 * @see NBVR.Grammar.SimpleQualifier#getCondition
	 * @model opposite="condition" required="true" ordered="false"
	 * @generated
	 */
	SimpleQualifier getQualifier();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Condition#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(SimpleQualifier value);

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // Condition
