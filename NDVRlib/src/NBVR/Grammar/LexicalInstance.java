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
 * A representation of the model object '<em><b>Lexical Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.LexicalInstance#getWord <em>Word</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getLexicalInstance()
 * @model
 * @generated
 */
public interface LexicalInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word</em>' reference.
	 * @see #setWord(Word)
	 * @see NBVR.Grammar.GrammarPackage#getLexicalInstance_Word()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Word getWord();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.LexicalInstance#getWord <em>Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word</em>' reference.
	 * @see #getWord()
	 * @generated
	 */
	void setWord(Word value);

} // LexicalInstance
