/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The actual sentence/clause structure that matches a fact type form.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.SimpleForm#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Grammar.SimpleForm#getPartPhrases <em>Part Phrases</em>}</li>
 *   <li>{@link NBVR.Grammar.SimpleForm#getSubject <em>Subject</em>}</li>
 *   <li>{@link NBVR.Grammar.SimpleForm#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getSimpleForm()
 * @model
 * @generated
 */
public interface SimpleForm extends Sentence {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' containment reference.
	 * @see #setVerb(VerbPhrase)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleForm_Verb()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	VerbPhrase getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleForm#getVerb <em>Verb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' containment reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VerbPhrase value);

	/**
	 * Returns the value of the '<em><b>Part Phrases</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Grammar.PartPhrase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Phrases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Phrases</em>' containment reference list.
	 * @see NBVR.Grammar.GrammarPackage#getSimpleForm_PartPhrases()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PartPhrase> getPartPhrases();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleForm_Subject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RolePhrase getSubject();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleForm#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(RolePhrase value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getSimpleForm_Object()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getObject();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.SimpleForm#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(RolePhrase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Modality getModality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isNegated();

	/* add-ons */

	/** isDone()
	 * false until the SimpleForm has been processed in this phase, then true
	 * @generated not
	 */
	boolean isDone();

	/** setDone(isdone)
	 * 
	 * @param isdone = true if the SimpleForm has been processed, else false
	 * @generated not
	 */
	void setDone(boolean isdone);

	/** makeRolesArray()
	 * make an array of all the RolePhrases
	 * the Subject, Object and Particle Roles
	 * @generated not
	 */
	RolePhrase[] makeRolesArray();

	/** copyRolesArray(SimpleForm)
	 * make a new roles array by copying the array of another SimpleForm
	 * @param source = the SimpleForm to be copied
	 * @return the roles array for this SimpleForm
	 * @generated not
	 */
	RolePhrase[] copyRolesArray(SimpleForm source);

	/** getRoles()
	 * @return the role phrase array
	 * @generated not
	 */	
	RolePhrase[] getRoles();

	/** getRole(index)
	 * @param index = the index of the role phrase to be returned
	 * @return the index-th role
	 * @generated not
	 */
	RolePhrase getRole(int index);

	/** setRole(index)
	 * @param index = the index of the role phrase to be replaced
	 * @return the index-th role
	 * @generated not
	 */
	void setRole(int index, RolePhrase phrase);

	
} // SimpleForm
