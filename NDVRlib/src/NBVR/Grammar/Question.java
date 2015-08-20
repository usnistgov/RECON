/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.Question#getQuery <em>Query</em>}</li>
 *   <li>{@link NBVR.Grammar.Question#getQueryPhrase <em>Query Phrase</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends Nominalization {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.QueryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see NBVR.Grammar.QueryKind
	 * @see #setQuery(QueryKind)
	 * @see NBVR.Grammar.GrammarPackage#getQuestion_Query()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QueryKind getQuery();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Question#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see NBVR.Grammar.QueryKind
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryKind value);

	/**
	 * Returns the value of the '<em><b>Query Phrase</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.QueryPhrase#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Phrase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Phrase</em>' reference.
	 * @see #setQueryPhrase(QueryPhrase)
	 * @see NBVR.Grammar.GrammarPackage#getQuestion_QueryPhrase()
	 * @see NBVR.Grammar.QueryPhrase#getQuestion
	 * @model opposite="question" ordered="false"
	 * @generated
	 */
	QueryPhrase getQueryPhrase();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.Question#getQueryPhrase <em>Query Phrase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Phrase</em>' reference.
	 * @see #getQueryPhrase()
	 * @generated
	 */
	void setQueryPhrase(QueryPhrase value);

} // Question
