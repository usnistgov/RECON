/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Particle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Particle#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Particle#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getParticle()
 * @model
 * @generated
 */
public interface Particle extends FormElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleElement)
	 * @see NBVR.Vocabulary.VocabularyPackage#getParticle_Role()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	RoleElement getRole();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Particle#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleElement value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Term#getParticle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see NBVR.Vocabulary.VocabularyPackage#getParticle_Term()
	 * @see NBVR.Vocabulary.Term#getParticle
	 * @model opposite="particle" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Particle#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset);

} // Particle
