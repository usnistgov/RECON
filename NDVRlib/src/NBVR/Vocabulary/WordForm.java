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
 * A representation of the model object '<em><b>Word Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.WordForm#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.WordForm#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Vocabulary.WordForm#getWord <em>Word</em>}</li>
 *   <li>{@link NBVR.Vocabulary.WordForm#getAltWord <em>Alt Word</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getWordForm()
 * @model
 * @generated
 */
public interface WordForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see NBVR.Vocabulary.VocabularyPackage#getWordForm_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.WordForm#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getWordForm_Next()
	 * @model ordered="false"
	 * @generated
	 */
	WordForm getNext();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.WordForm#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(WordForm value);

	/**
	 * Returns the value of the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The word, or the primary verb, of which this is a form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Word</em>' reference.
	 * @see #setWord(Word)
	 * @see NBVR.Vocabulary.VocabularyPackage#getWordForm_Word()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Word getWord();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.WordForm#getWord <em>Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word</em>' reference.
	 * @see #getWord()
	 * @generated
	 */
	void setWord(Word value);
	
	
	/**
	 * Returns the value of the '<em><b>Alt Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A word of which this is a form, but is different from the primary word/verb.  Usually, a noun of which this is the plural, in addition to the verb of which this is present singular.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Word</em>' reference.
	 * @see #setAltWord(Word)
	 * @see NBVR.Vocabulary.VocabularyPackage#getWordForm_AltWord()
	 * @model ordered="false"
	 * @generated
	 */
	Word getAltWord();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.WordForm#getAltWord <em>Alt Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Word</em>' reference.
	 * @see #getAltWord()
	 * @generated
	 */
	void setAltWord(Word value);

	/** 
	 *   returns true if the word form text matches the passed char array
	 *   false otherwise
	 * @generated not
	 */
	boolean match(char[] intext, int size);
	

} // WordForm
