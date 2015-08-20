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
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Term#getConcept <em>Concept</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getParticle <em>Particle</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getWords <em>Words</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getContext <em>Context</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getElement <em>Element</em>}</li>
 *   <li>{@link NBVR.Vocabulary.Term#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VocabularyItem#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' container reference.
	 * @see #setConcept(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Concept()
	 * @see NBVR.Vocabulary.VocabularyItem#getTerms
	 * @model opposite="terms" transient="false" ordered="false"
	 * @generated
	 */
	VocabularyItem getConcept();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Term#getConcept <em>Concept</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' container reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(VocabularyItem value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Vocabulary.Word}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' reference list.
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Words()
	 * @model required="true"
	 * @generated
	 */
	EList<Word> getWords();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(VocabularyItem)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Context()
	 * @model ordered="false"
	 * @generated
	 */
	VocabularyItem getContext();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Term#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(VocabularyItem value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.VerbRole#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' container reference.
	 * @see #setRole(VerbRole)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Role()
	 * @see NBVR.Vocabulary.VerbRole#getTerm
	 * @model opposite="term" transient="false" ordered="false"
	 * @generated
	 */
	VerbRole getRole();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Term#getRole <em>Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' container reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(VerbRole value);

	/**
	 * Adds a Word to the sequence of Words that make up the Term
	 * @generated not
	 */
	void addWord(Word word);

	/**
	 * @return the Particle that owns this Term
	 * @generated
	 */
	EList<ItemElement> getElement();

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
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Text()
	 * @model ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Term#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Particle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Vocabulary.Particle#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Particle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Particle</em>' container reference.
	 * @see #setParticle(Particle)
	 * @see NBVR.Vocabulary.VocabularyPackage#getTerm_Particle()
	 * @see NBVR.Vocabulary.Particle#getTerm
	 * @model opposite="term" transient="false" ordered="false"
	 * @generated
	 */
	Particle getParticle();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Term#getParticle <em>Particle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Particle</em>' container reference.
	 * @see #getParticle()
	 * @generated
	 */
	void setParticle(Particle value);

	/* add-on methods */
	
	/** toString
	 * creates a string of the words in the term
	 * @return the string of the words in the term
	 * @generated not
	 */
	String toString();

} // Term
