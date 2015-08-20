/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocName;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VocNameImpl extends VocabularyItemImpl implements VocName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Overrides default to return the Proper Name kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public VocItemKind getKind() {
		return VocItemKind.PROPER_NAME; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * default implementation, returns false
	 * overridden by VocUnit
	 * @generated not
	 */
	public boolean isUnit() {
		return false;
	}

} //VocNameImpl
