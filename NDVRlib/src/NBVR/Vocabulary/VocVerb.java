/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import NBVR.Logic.Predicate;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voc Verb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VocVerb#getArity <em>Arity</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocVerb#getRoles <em>Roles</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocVerb#getForm <em>Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocVerb#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVocVerb()
 * @model
 * @generated
 */
public interface VocVerb extends VocabularyItem {
	/**
	 * Returns the value of the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute.
	 * @see #setArity(int)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocVerb_Arity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getArity();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocVerb#getArity <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arity</em>' attribute.
	 * @see #getArity()
	 * @generated
	 */
	void setArity(int value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.VerbRole}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VerbRole#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocVerb_Roles()
	 * @see NBVR.Vocabulary.VerbRole#getVerb
	 * @model opposite="verb" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<VerbRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.SyntaxForm}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.SyntaxForm#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocVerb_Form()
	 * @see NBVR.Vocabulary.SyntaxForm#getVerb
	 * @model opposite="verb" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<SyntaxForm> getForm();

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Predicate#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(Predicate)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocVerb_Predicate()
	 * @see NBVR.Logic.Predicate#getVerb
	 * @model opposite="verb" containment="true" ordered="false"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocVerb#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/* add-ons */

	/**
	 * routine to find a VerbRole by name
	 * @param term = the text of the term for the VerbRole
	 * @return the VerbRole with that term, or null
	 * 
	 * @generated not
	 */
	VerbRole find_named_role(String term);

} // VocVerb
