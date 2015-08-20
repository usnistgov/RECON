/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import org.eclipse.emf.common.util.EList;
import NBVR.Grammar.GroupKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.GroupPhrase#getMembers <em>Members</em>}</li>
 *   <li>{@link NBVR.Grammar.GroupPhrase#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getGroupPhrase()
 * @model
 * @generated
 */
public interface GroupPhrase extends RolePhrase {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Grammar.SimpleNounPhrase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see NBVR.Grammar.GrammarPackage#getGroupPhrase_Members()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SimpleNounPhrase> getMembers();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.GroupKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.GroupKind
	 * @see #setKind(GroupKind)
	 * @see NBVR.Grammar.GrammarPackage#getGroupPhrase_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GroupKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.GroupPhrase#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Grammar.GroupKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(GroupKind value);

} // GroupPhrase
