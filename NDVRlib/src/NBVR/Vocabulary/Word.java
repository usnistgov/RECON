/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Word#getBase <em>Base</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Word#getBeginsTerm <em>Begins Term</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Word#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getWord()
 * @model abstract="true"
 * @generated
 */
public interface Word extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(WordForm)
	 * @see NBVR.Vocabulary.VocabularyPackage#getWord_Base()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WordForm getBase();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Word#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(WordForm value);

	/**
	 * Returns the value of the '<em><b>Begins Term</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begins Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begins Term</em>' reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getWord_BeginsTerm()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Term> getBeginsTerm();
	
	/** addUsage
	 * adds a Term to the BeginsTerm list
	 * @generated not
	 */
	void addUsage(Term t);

	/** isNumber()
	 * @return true if the Word is a Number, false otherwise 
	 * @generated not
	 */
	boolean isNumber();

	/** isText()
	 * @return true if the Word is a TextString, false otherwise 
	 * @generated not
	 */
	boolean isText();

	/** isArticle()
	 * @return true if a, an or the, false otherwise 
	 * @generated not
	 */
	boolean isArticle();

	/** isKeyword()
	 * @return true if the Word is a Keyword, else false
	 * @generated not
	 */
	boolean isKeyword();

	/** isKeyword(kind)
	 * @param kind = the KeywordKind to match
	 * @return true if the Word is a Keyword of the given kind, else false
	 * @generated not
	 */
	boolean isKeyword(KeywordKind kind);

	/** isVerb()
	 * @return true if the Word is a Verb, else false
	 * @generated not
	 */
	boolean isVerb();

	/** isIs()
	 * @return true if the Word is a form of the verb 'to be', else false
	 * @generated not
	 */
	boolean isIs();

	/** isNoun()
	 * @return true if the Word is a Keyword, else false
	 * @generated not
	 */
	boolean isNoun();

	/**
	 * real implementation of the Dictionary word list
	 * @return the next word in the Dictionary
	 * 
	 * @generated not
	 */
	Word getNext();

	/**
	 * set the next word in the dictionary, used only by Dictionary.addWord
	 * @param w = the Word to follow this one
	 * 
	 * @generated not
	 */
	void setNext(Word w);

	/** toString()
	 * @return the string form of the word
	 * @generated not
	 */
	public String external();
	
} // Word
