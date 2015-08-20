/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.ModifiedTerm#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link NBVR.Grammar.ModifiedTerm#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link NBVR.Grammar.ModifiedTerm#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getModifiedTerm()
 * @model abstract="true"
 * @generated
 */
public interface ModifiedTerm extends SimpleNounPhrase {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' reference.
	 * @see #setQuantifier(Quantifier)
	 * @see NBVR.Grammar.GrammarPackage#getModifiedTerm_Quantifier()
	 * @model ordered="false"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.ModifiedTerm#getQuantifier <em>Quantifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' reference.
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.Modifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getModifiedTerm_Modifiers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier> getModifiers();
	
	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more constraints that restrict the set of referents of the TypeNoun.  The qualifiers of a TypeNoun are implicitly ORed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifiers</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getModifiedTerm_Qualifiers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Qualifier> getQualifiers();

	/**
	 * Creates the list of adjective '<em><b>Modifiers</b></em>' from a passed List
	 * @generated not
	 * @param the list of Modifiers to be added
	 */
	void setModifiers(List<Modifier> modifiers);

	/**
	 * Creates the list of '<em><b>Qualifiers</b></em>' from a passed List
	 * @generated not
	 * @param the list of Qualifiers to be added
	 */
	void setQualifiers(List<Qualifier> qualifiers);

} // ModifiedTerm
