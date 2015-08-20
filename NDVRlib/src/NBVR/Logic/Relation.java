/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import org.eclipse.emf.common.util.EList;
import NBVR.Grammar.RolePhrase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Relation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link NBVR.Logic.Relation#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends Proposition {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Logic.Argument}.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Argument#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see NBVR.Logic.LogicPackage#getRelation_Arguments()
	 * @see NBVR.Logic.Argument#getRelation
	 * @model opposite="relation" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(Predicate)
	 * @see NBVR.Logic.LogicPackage#getRelation_Predicate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Relation#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/** setRole(role phrase)
	 * sets the 'phrase' value of the argument that corresponds to the verb role
	 * associated with the given role phrase, to that RolePhrase
	 * and returns the matching argument
	 * @param parse = the RolePhrase that implements the role in the instance
	 * @return the Argument that represents the corresponding VerbRole, or null
	 * @generated not
	 */
	Argument setRole(RolePhrase phrase);

} // Relational
