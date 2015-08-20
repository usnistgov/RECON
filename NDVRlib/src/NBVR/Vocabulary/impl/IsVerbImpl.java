/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.IsVerb;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Verb</b></em>'.
 * Add-on class that supports the verb 'to be' as a special case of Verb
 * No other English verb has 7 orthographic forms
 * and the verb to be is special for several other reasons.
 * 
 * @author Ed Barkmeyer, NIST, Oct, 2010
 * 	revised Nov, 2011, v0.18 to add the isPast override
 *  incorporated formally into the UML model, Sept, 2013, v0.26
 *   and revised to use the altPast form added to Verb
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IsVerbImpl extends VerbImpl implements IsVerb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsVerbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.IS_VERB;
	}
	
	/**
	 * Overrides the generic isIs() to return true
	 * This is the 'to be' verb
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isIs() {
		return true;
	}
	
} //IsVerbImpl
