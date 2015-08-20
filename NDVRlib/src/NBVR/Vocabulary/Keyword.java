/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.Keyword#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Vocabulary.VocabularyPackage#getKeyword()
 * @model
 * @generated
 */
public interface Keyword extends Word {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link NBVR.Vocabulary.KeywordKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.KeywordKind
	 * @see #setKind(KeywordKind)
	 * @see NBVR.Vocabulary.VocabularyPackage#getKeyword_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeywordKind getKind();

	/**
	 * Sets the value of the '{@link NBVR.Vocabulary.Keyword#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see NBVR.Vocabulary.KeywordKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KeywordKind value);

} // Keyword
