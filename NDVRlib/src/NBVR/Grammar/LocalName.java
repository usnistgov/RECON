/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.Word;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.LocalName#getWord <em>Word</em>}</li>
 *   <li>{@link NBVR.Grammar.LocalName#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getLocalName()
 * @model
 * @generated
 */
public interface LocalName extends SimpleNounPhrase {
	/**
	 * Returns the value of the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word</em>' reference.
	 * @see #setWord(Word)
	 * @see NBVR.Grammar.GrammarPackage#getLocalName_Word()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Word getWord();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.LocalName#getWord <em>Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word</em>' reference.
	 * @see #getWord()
	 * @generated
	 */
	void setWord(Word value);
	
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(LocalName)
	 * @see NBVR.Grammar.GrammarPackage#getLocalName_Next()
	 * @model ordered="false"
	 * @generated
	 */
	LocalName getNext();
	

	/**
	 * Sets the value of the '{@link NBVR.Grammar.LocalName#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(LocalName value);

} // LocalName
