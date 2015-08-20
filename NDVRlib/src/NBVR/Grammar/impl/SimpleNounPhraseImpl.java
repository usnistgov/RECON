/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.PropertyNoun;
import NBVR.Grammar.SimpleNounPhrase;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Noun Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SimpleNounPhraseImpl extends RolePhraseImpl implements SimpleNounPhrase {

	/**
	 * the cached value of the PropertyNoun of which this is the domain
	 * @generated not
	 */
	protected PropertyNoun attribute;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNounPhraseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.SIMPLE_NOUN_PHRASE;
	}
	
	// add-ons

	/** setAttribute(newproperty)
	 * sets the link back to the PropertyNoun of which this is the domain
	 * @generated not
	 *
	 */
	public void setAttribute(PropertyNoun newattr)
	{
		attribute = newattr;
	}
	

	/** getAttribute()
	 * @return the link back to the PropertyNoun of which this is the domain
	 * @generated not
	 *
	 */
	public PropertyNoun getAttribute()
	{
		return attribute;
	}

} //SimpleNounPhraseImpl
