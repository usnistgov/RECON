/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

// import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Dictionary#getFirstWord <em>First Word</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.Word}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getDictionary_Words()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
//	EList<Word> getWords();
	
	/** 
	 * Adds a new Word to the Words list
	 * @generated not
	 */
	void addWord(Word w);
	
	/** 
	 * return the first word in the Dictionary
	 * @return the first Word in the dictionary
	 * 
	 * @generated not
	 */
	Word getFirstWord();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Dictionary#getFirstWord <em>First Word</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Word</em>' containment reference.
	 * @see #getFirstWord()
	 * @generated
	 */
	void setFirstWord(Word value);

} // Dictionary
