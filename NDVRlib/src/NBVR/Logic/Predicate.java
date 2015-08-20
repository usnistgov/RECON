/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocVerb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Predicate#getVariables <em>Variables</em>}</li>
 *   <li>{@link NBVR.Logic.Predicate#getName <em>Name</em>}</li>
 *   <li>{@link NBVR.Logic.Predicate#getNoun <em>Noun</em>}</li>
 *   <li>{@link NBVR.Logic.Predicate#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NBVR.Logic.LogicPackage#getPredicate_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Predicate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Logic.RoleVariable}.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.RoleVariable#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see NBVR.Logic.LogicPackage#getPredicate_Variables()
	 * @see NBVR.Logic.RoleVariable#getPredicate
	 * @model opposite="predicate" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RoleVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Noun</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocNoun#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noun</em>' container reference.
	 * @see #setNoun(VocNoun)
	 * @see NBVR.Logic.LogicPackage#getPredicate_Noun()
	 * @see NBVR.Vocabulary.VocNoun#getPredicate
	 * @model opposite="predicate" transient="false" ordered="false"
	 * @generated
	 */
	VocNoun getNoun();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Predicate#getNoun <em>Noun</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noun</em>' container reference.
	 * @see #getNoun()
	 * @generated
	 */
	void setNoun(VocNoun value);

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocVerb#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' container reference.
	 * @see #setVerb(VocVerb)
	 * @see NBVR.Logic.LogicPackage#getPredicate_Verb()
	 * @see NBVR.Vocabulary.VocVerb#getPredicate
	 * @model opposite="predicate" transient="false" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Predicate#getVerb <em>Verb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' container reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

	/**
	 * Returns the value of the '<em>Text</em>' attribute.
	 * @return the value of the '<em>Text</em>' attribute.
	 * @generated not
	 */
	String getText();
	
	/**
	 * Sets the value of the '<em>Text</em>' attribute.
	 * @param newtext = the new value of the '<em>Text</em>' attribute.
	 * @generated not
	 */
	void setText(String newtext);
	
} // Relation
