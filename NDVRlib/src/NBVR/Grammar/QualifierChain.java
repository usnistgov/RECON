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
 * A representation of the model object '<em><b>Qualifier Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A QualifierChain is a set of alternatives (nominally connected by OR) in which each alternative has a condition for applicability.
 * 
 * Example:  February is a month that has duration 29 days if it occurs in a leap year, or that has duration 28 days otherwise.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.QualifierChain#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getQualifierChain()
 * @model
 * @generated
 */
public interface QualifierChain extends Qualifier {
	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.SimpleQualifier}.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.SimpleQualifier#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getQualifierChain_Qualifiers()
	 * @see NBVR.Grammar.SimpleQualifier#getChain
	 * @model opposite="chain" required="true" ordered="false"
	 * @generated
	 */
	EList<SimpleQualifier> getQualifiers();

} // QualifierChain
