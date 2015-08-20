/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.VocProperty;
import NBVR.Vocabulary.VocUnit;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocUnitImpl#getQuantityKind <em>Quantity Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocUnitImpl extends VocNameImpl implements VocUnit {
	/**
	 * The cached value of the '{@link #getQuantityKind() <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityKind()
	 * @generated
	 * @ordered
	 */
	protected VocProperty quantityKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * VocUnit implementation, returns true
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public boolean isUnit() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty getQuantityKind() {
		if (quantityKind != null && quantityKind.eIsProxy()) {
			InternalEObject oldQuantityKind = (InternalEObject)quantityKind;
			quantityKind = (VocProperty)eResolveProxy(oldQuantityKind);
			if (quantityKind != oldQuantityKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_UNIT__QUANTITY_KIND, oldQuantityKind, quantityKind));
			}
		}
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty basicGetQuantityKind() {
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityKind(VocProperty newQuantityKind) {
		VocProperty oldQuantityKind = quantityKind;
		quantityKind = newQuantityKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_UNIT__QUANTITY_KIND, oldQuantityKind, quantityKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.VOC_UNIT__QUANTITY_KIND:
				if (resolve) return getQuantityKind();
				return basicGetQuantityKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VocabularyPackage.VOC_UNIT__QUANTITY_KIND:
				setQuantityKind((VocProperty)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VocabularyPackage.VOC_UNIT__QUANTITY_KIND:
				setQuantityKind((VocProperty)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VocabularyPackage.VOC_UNIT__QUANTITY_KIND:
				return quantityKind != null;
		}
		return super.eIsSet(featureID);
	}

} //VocUnitImpl
