/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.Particle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.PartPhrase#getPartRole <em>Part Role</em>}</li>
 *   <li>{@link NBVR.Grammar.PartPhrase#getParticle <em>Particle</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getPartPhrase()
 * @model
 * @generated
 */
public interface PartPhrase extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Role</em>' reference.
	 * @see #setPartRole(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getPartPhrase_PartRole()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getPartRole();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.PartPhrase#getPartRole <em>Part Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Role</em>' reference.
	 * @see #getPartRole()
	 * @generated
	 */
	void setPartRole(RolePhrase value);

	/**
	 * Returns the value of the '<em><b>Particle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Particle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particle</em>' reference.
	 * @see #setParticle(Particle)
	 * @see NBVR.Grammar.GrammarPackage#getPartPhrase_Particle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Particle getParticle();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.PartPhrase#getParticle <em>Particle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Particle</em>' reference.
	 * @see #getParticle()
	 * @generated
	 */
	void setParticle(Particle value);
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // PartPhrase
