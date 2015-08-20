/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Grammar.RolePhrase;

import NBVR.Vocabulary.VerbRole;

import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Argument#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Logic.Argument#getVariable <em>Variable</em>}</li>
 *   <li>{@link NBVR.Logic.Argument#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link NBVR.Logic.Argument#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Logic.Argument#getConstant <em>Constant</em>}</li>
 *   <li>{@link NBVR.Logic.Argument#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Argument)
	 * @see NBVR.Logic.LogicPackage#getArgument_Next()
	 * @model ordered="false"
	 * @generated
	 */
	Argument getNext();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Argument value);

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
	 * @see NBVR.Logic.LogicPackage#getArgument_Variable()
	 * @model ordered="false"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Phrase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phrase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phrase</em>' reference.
	 * @see #setPhrase(RolePhrase)
	 * @see NBVR.Logic.LogicPackage#getArgument_Phrase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RolePhrase getPhrase();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getPhrase <em>Phrase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phrase</em>' reference.
	 * @see #getPhrase()
	 * @generated
	 */
	void setPhrase(RolePhrase value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(VerbRole)
	 * @see NBVR.Logic.LogicPackage#getArgument_Role()
	 * @model ordered="false"
	 * @generated
	 */
	VerbRole getRole();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(VerbRole value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(Constant)
	 * @see NBVR.Logic.LogicPackage#getArgument_Constant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constant getConstant();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Relation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' container reference.
	 * @see #setRelation(Relation)
	 * @see NBVR.Logic.LogicPackage#getArgument_Relation()
	 * @see NBVR.Logic.Relation#getArguments
	 * @model opposite="arguments" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Argument#getRelation <em>Relation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' container reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean hasNext();
	
	/** toIKL()
	 *   print the argument in an output of the tree
	 * @generated not
	 */
	void toIKL(PrintWriter iklout, int offset);

} // Argument
