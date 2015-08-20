/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.KeywordKind;
import NBVR.Vocabulary.VocAdjective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Modifier#getAdjective <em>Adjective</em>}</li>
 *   <li>{@link NBVR.Grammar.Modifier#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Grammar.Modifier#getRelative <em>Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ParseElement {
	/**
	 * Returns the value of the '<em><b>Adjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjective</em>' reference.
	 * @see #setAdjective(VocAdjective)
	 * @see NBVR.Grammar.GrammarPackage#getModifier_Adjective()
	 * @model ordered="false"
	 * @generated
	 */
	VocAdjective getAdjective();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Modifier#getAdjective <em>Adjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjective</em>' reference.
	 * @see #getAdjective()
	 * @generated
	 */
	void setAdjective(VocAdjective value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Vocabulary.KeywordKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.KeywordKind
	 * @see #setKind(KeywordKind)
	 * @see NBVR.Grammar.GrammarPackage#getModifier_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeywordKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Modifier#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.KeywordKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KeywordKind value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' reference.
	 * @see #setRelative(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getModifier_Relative()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getRelative();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Modifier#getRelative <em>Relative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' reference.
	 * @see #getRelative()
	 * @generated
	 */
	void setRelative(RolePhrase value);
	
	/** print()
	 *   print the node in an output of the parse tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // Modifier
