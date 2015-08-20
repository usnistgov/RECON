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
 * A representation of the model object '<em><b>Terminology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Terminology#getFirstItem <em>First Item</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Terminology#getLastItem <em>Last Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getTerminology()
 * @model
 * @generated
 */
public interface Terminology extends EObject {
	/**
	 * Returns the value of the '<em><b>First Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Item</em>' containment reference.
	 * @see #setFirstItem(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerminology_FirstItem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	VocabularyItem getFirstItem();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Terminology#getFirstItem <em>First Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Item</em>' containment reference.
	 * @see #getFirstItem()
	 * @generated
	 */
	void setFirstItem(VocabularyItem value);

	/**
	 * Returns the value of the '<em><b>Last Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Item</em>' reference.
	 * @see #setLastItem(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerminology_LastItem()
	 * @model ordered="false"
	 * @generated
	 */
	VocabularyItem getLastItem();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Terminology#getLastItem <em>Last Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Item</em>' reference.
	 * @see #getLastItem()
	 * @generated
	 */
	void setLastItem(VocabularyItem value);

	/** 
	 * Adds a new Item to the Items list
	 * @generated not
	 */
	void addItem(VocabularyItem item);

} // Terminology
