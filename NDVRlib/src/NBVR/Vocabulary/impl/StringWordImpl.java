/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.StringWord;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StringWordImpl extends WordImpl implements StringWord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringWordImpl() {
		super();
	}

	/** isText()
	 * @return true if the Word is a TextString, false otherwise 
	 * overrides the default return of 'false' for Words
	 * @generated not
	 */
	@Override
	public boolean isText() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.STRING_WORD;
	}

} //StringWordImpl
