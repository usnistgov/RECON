/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Noun Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see NBVR.Grammar.GrammarPackage#getSimpleNounPhrase()
 * @model abstract="true"
 * @generated
 */
public interface SimpleNounPhrase extends RolePhrase {
	
	// add-ons

	/** setAttribute(newproperty)
	 * sets the link back to the PropertyNoun of which this is the domain
	 * @generated not
	 *
	 */
	void setAttribute(PropertyNoun newattr);
	

	/** getAttribute()
	 * @return the link back to the PropertyNoun of which this is the domain
	 * @generated not
	 *
	 */
	PropertyNoun getAttribute();

	
} // SimpleNounPhrase
