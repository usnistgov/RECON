/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verb Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VerbRole#getRange <em>Range</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VerbRole#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VerbRole#getTerm <em>Term</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VerbRole#isRange <em>Is Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVerbRole()
 * @model
 * @generated
 */
public interface VerbRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(VocNoun)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerbRole_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocNoun getRange();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VerbRole#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(VocNoun value);

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocVerb#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' container reference.
	 * @see #setVerb(VocVerb)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerbRole_Verb()
	 * @see NBVR.Vocabulary.VocVerb#getRoles
	 * @model opposite="roles" required="true" transient="false" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VerbRole#getVerb <em>Verb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' container reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VerbRole#isRange <em>Is Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Range</em>' attribute.
	 * @see #isRange()
	 * @generated
	 */
	void setIsRange(boolean value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Term#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference.
	 * @see #setTerm(Term)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerbRole_Term()
	 * @see NBVR.Vocabulary.Term#getRole
	 * @model opposite="role" containment="true" ordered="false"
	 * @generated
	 */
	Term getTerm();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VerbRole#getTerm <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' containment reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(Term value);
	
	/**
	 * Returns the value of the '<em><b>Is Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VerbRole is the "range" role of the property.  Its range is the type of the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Range</em>' attribute.
	 * @see #setIsRange(boolean)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVerbRole_IsRange()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isRange();

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset);
	
	/** external()
	 *   return the externalized term for the item
	 * @generated not
	 */
	String external();

} // VerbRole
