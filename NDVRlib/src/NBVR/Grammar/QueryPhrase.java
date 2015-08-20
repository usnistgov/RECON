/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Grammar.QueryPhrase#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Grammar.QueryPhrase#getQuery <em>Query</em>}</li>
 *   <li>{@link NBVR.Grammar.QueryPhrase#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Grammar.GrammarPackage#getQueryPhrase()
 * @model
 * @generated
 */
public interface QueryPhrase extends RolePhrase {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain of the Interrogative (pronoun) is the TypeNoun or PropertyNoun that it modifies.  (which X) (whose X)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(RolePhrase)
	 * @see NBVR.Grammar.GrammarPackage#getQueryPhrase_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RolePhrase getDomain();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.QueryPhrase#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RolePhrase value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Grammar.QueryKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see NBVR.Grammar.QueryKind
	 * @see #setQuery(QueryKind)
	 * @see NBVR.Grammar.GrammarPackage#getQueryPhrase_Query()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QueryKind getQuery();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.QueryPhrase#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see NBVR.Grammar.QueryKind
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryKind value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Grammar.Question#getQueryPhrase <em>Query Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see NBVR.Grammar.GrammarPackage#getQueryPhrase_Question()
	 * @see NBVR.Grammar.Question#getQueryPhrase
	 * @model opposite="queryPhrase" required="true" ordered="false"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link NBVR.Grammar.QueryPhrase#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

} // QueryPhrase
