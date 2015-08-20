/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Logic.Variable;
import NBVR.Vocabulary.FormulationForm;
import NBVR.Vocabulary.VerbRole;

import java.io.PrintStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bound term is the linguistic form of a thing that plays a role in a fact type.  A BoundTerm is either a NounPhrase or a "modified anaphor".  It can only be a "modified anaphor" when the SimpleForm that owns it is a SimpleQualifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.RolePhrase#getRolePlayed <em>Role Played</em>}</li>
 *   <li>{@link NBVR.Grammar.RolePhrase#getVariable <em>Variable</em>}</li>
 *   <li>{@link NBVR.Grammar.RolePhrase#getReferent <em>Referent</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getRolePhrase()
 * @model abstract="true"
 * @generated
 */
public interface RolePhrase extends FormulationForm, ParseElement {
	
	/**
	 * Returns the value of the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Played</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Played</em>' reference.
	 * @see #setRolePlayed(VerbRole)
	 * @see NBVR.Grammar.GrammarPackage#getRolePhrase_RolePlayed()
	 * @model ordered="false"
	 * @generated
	 */
	VerbRole getRolePlayed();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.RolePhrase#getRolePlayed <em>Role Played</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Played</em>' reference.
	 * @see #getRolePlayed()
	 * @generated
	 */
	void setRolePlayed(VerbRole value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see NBVR.Grammar.GrammarPackage#getRolePhrase_Variable()
	 * @model ordered="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.RolePhrase#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getRolePhrase_Referent()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getReferent();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.RolePhrase#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(RolePhrase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	PhraseType getType();

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, PrintStream log);

} // RolePhrase
