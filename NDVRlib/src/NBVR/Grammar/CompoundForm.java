/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.CompoundForm#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Grammar.CompoundForm#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getCompoundForm()
 * @model
 * @generated
 */
public interface CompoundForm extends Sentence {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getCompoundForm_Statements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Sentence> getStatements();

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
	 * @see NBVR.Grammar.GrammarPackage#getCompoundForm_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connective getKind();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.CompoundForm#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.Connective
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Connective value);

} // CompoundForm
