/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VerbRole;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verb Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.VerbPhrase#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Grammar.VerbPhrase#getModality <em>Modality</em>}</li>
 *   <li>{@link NBVR.Grammar.VerbPhrase#isNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getVerbPhrase()
 * @model
 * @generated
 */
public interface VerbPhrase extends EObject {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' reference.
	 * @see #setVerb(VocVerb)
	 * @see NBVR.Grammar.GrammarPackage#getVerbPhrase_Verb()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocVerb getVerb();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.VerbPhrase#getVerb <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' reference.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(VocVerb value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.Modality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #setModality(Modality)
	 * @see NBVR.Grammar.GrammarPackage#getVerbPhrase_Modality()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Modality getModality();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.VerbPhrase#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see NBVR.Grammar.Modality
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Modality value);

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see NBVR.Grammar.GrammarPackage#getVerbPhrase_Negated()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.VerbPhrase#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/*
	 * Sets the value of the '{@link NBVR.Grammar.VerbPhrase#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	//void setNegated(boolean value);

	/**
	 * @param position = the position of the role: 0 = subject, 1 = object
	 * @return the VerbRole that is in the specified position in the canonical verb form
	 * @generated not
	 */
	VerbRole getVerbRole(int position);
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // VerbPhrase
