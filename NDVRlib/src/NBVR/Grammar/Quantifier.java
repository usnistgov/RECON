/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Quantifier#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Grammar.Quantifier#getCount <em>Count</em>}</li>
 *   <li>{@link NBVR.Grammar.Quantifier#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getQuantifier()
 * @model
 * @generated
 */
public interface Quantifier extends ParseElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.QuantifierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.QuantifierKind
	 * @see #setKind(QuantifierKind)
	 * @see NBVR.Grammar.GrammarPackage#getQuantifier_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QuantifierKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Quantifier#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.QuantifierKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(QuantifierKind value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see NBVR.Grammar.GrammarPackage#getQuantifier_Count()
	 * @model ordered="false"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Quantifier#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);
	
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(Quantity)
	 * @see NBVR.Grammar.GrammarPackage#getQuantifier_Quantity()
	 * @model ordered="false"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Quantifier#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // Quantifier
