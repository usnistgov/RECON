/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.NumberWord;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Quantity#getFactor <em>Factor</em>}</li>
 *   <li>{@link NBVR.Grammar.Quantity#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends Instance {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference.
	 * @see #setFactor(NumberWord)
	 * @see NBVR.Grammar.GrammarPackage#getQuantity_Factor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NumberWord getFactor();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Quantity#getFactor <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(NumberWord value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getQuantity_Dimension()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimension();

} // Quantity
