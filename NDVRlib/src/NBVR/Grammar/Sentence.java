/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.FormulationForm;
import java.io.PrintStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Sentence#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Grammar.Sentence#getRewrites <em>Rewrites</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getSentence()
 * @model abstract="true"
 * @generated
 */
public interface Sentence extends FormulationForm, ParseElement {
	
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "domain" of a sentence is the object to which pronouns used in dependent clauses will refer.
	 * 
	 * In the specific case of the DomainForm (for all, there is), the domain is the operand of the logical quantification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getSentence_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	RolePhrase getDomain();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Sentence#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RolePhrase value);

	/**
	 * Returns the value of the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrites</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrites</em>' reference.
	 * @see #setRewrites(Sentence)
	 * @see NBVR.Grammar.GrammarPackage#getSentence_Rewrites()
	 * @model ordered="false"
	 * @generated
	 */
	Sentence getRewrites();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Sentence#getRewrites <em>Rewrites</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrites</em>' reference.
	 * @see #getRewrites()
	 * @generated
	 */
	void setRewrites(Sentence value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	SentenceType getType();

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, PrintStream log);

} // Sentence
