/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import NBVR.Vocabulary.impl.TermUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.VocabularyItem#getFormulations <em>Formulations</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocabularyItem#getBase <em>Base</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocabularyItem#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Vocabulary.VocabularyItem#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getVocabularyItem()
 * @model abstract="true"
 * @generated
 */
public interface VocabularyItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Formulations</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.Formulation}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Formulation#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulations</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocabularyItem_Formulations()
	 * @see NBVR.Vocabulary.Formulation#getConcept
	 * @model opposite="concept" containment="true" ordered="false"
	 * @generated
	 */
	EList<Formulation> getFormulations();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	VocItemKind getKind();

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.VocabularyItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocabularyItem_Base()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VocabularyItem> getBase();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocabularyItem_Next()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	VocabularyItem getNext();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.VocabularyItem#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(VocabularyItem value);

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.Term}.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Term#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getVocabularyItem_Terms()
	 * @see NBVR.Vocabulary.Term#getConcept
	 * @model opposite="concept" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Term> getTerms();

	/**
	 * <!-- begin-user-doc -->
	 * returns true if the Item has no formal (structured) formulations, else false
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isPrimitive();

	/* add-ons */

	/** addTerm
	 * adds a Term for the VocabularyItem to the '<em><b>Terms</b></em>' reference list
	 * @generated not
	 */
	void addTerm(Term term);

	/** getLastUse()
	 * @return the most recent TermUse object for the VocabularyItem
	 * @generated not
	 */
	TermUse getLastUse();

	/** setLastUse()
	 * @return the most recent TermUse object for the VocabularyItem
	 * @generated not
	 */
	void setLastUse(TermUse tuse);

	/** external()
	 *   return the externalized term for the item
	 * @generated not
	 */
	String external();
	
	/** findFormulationIn(language)
	 *   return the formulation for the item in the given language or null
	 * @generated not
	 */
	Formulation findFormulationIn(String language);
	
} // VocabularyItem
