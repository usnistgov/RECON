/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Terminology;
import NBVR.Vocabulary.VocabularyItem;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.TerminologyImpl#getFirstItem <em>First Item</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TerminologyImpl#getLastItem <em>Last Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminologyImpl extends EObjectImpl implements Terminology {
	/**
	 * The cached value of the '{@link #getFirstItem() <em>First Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstItem()
	 * @generated
	 * @ordered
	 */
	protected VocabularyItem firstItem;
	/**
	 * The cached value of the '{@link #getLastItem() <em>Last Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastItem()
	 * @generated
	 * @ordered
	 */
	protected VocabularyItem lastItem;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.TERMINOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getFirstItem() {
		return firstItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstItem(VocabularyItem newFirstItem, NotificationChain msgs) {
		VocabularyItem oldFirstItem = firstItem;
		firstItem = newFirstItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERMINOLOGY__FIRST_ITEM, oldFirstItem, newFirstItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstItem(VocabularyItem newFirstItem) {
		if (newFirstItem != firstItem) {
			NotificationChain msgs = null;
			if (firstItem != null)
				msgs = ((InternalEObject)firstItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.TERMINOLOGY__FIRST_ITEM, null, msgs);
			if (newFirstItem != null)
				msgs = ((InternalEObject)newFirstItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.TERMINOLOGY__FIRST_ITEM, null, msgs);
			msgs = basicSetFirstItem(newFirstItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERMINOLOGY__FIRST_ITEM, newFirstItem, newFirstItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getLastItem() {
		if (lastItem != null && lastItem.eIsProxy()) {
			InternalEObject oldLastItem = (InternalEObject)lastItem;
			lastItem = (VocabularyItem)eResolveProxy(oldLastItem);
			if (lastItem != oldLastItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.TERMINOLOGY__LAST_ITEM, oldLastItem, lastItem));
			}
		}
		return lastItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem basicGetLastItem() {
		return lastItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastItem(VocabularyItem newLastItem) {
		VocabularyItem oldLastItem = lastItem;
		lastItem = newLastItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERMINOLOGY__LAST_ITEM, oldLastItem, lastItem));
	}

	/**
	 * add a VocabularyItem to the items list
	 * the list is queue, maintained thru the items as 'next'
	 * and controlled at the Terminology as firstItem, lastItem
	 * The vocabulary is FIFO, just in case the order of declarations matters
	 * 
	 * @generated not
	 */
	public void addItem(VocabularyItem item) 
	{
		if (getFirstItem() == null)
			setFirstItem(item);
		else
			getLastItem().setNext(item);
		setLastItem(item);
		item.setNext(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.TERMINOLOGY__FIRST_ITEM:
				return basicSetFirstItem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.TERMINOLOGY__FIRST_ITEM:
				return getFirstItem();
			case VocabularyPackage.TERMINOLOGY__LAST_ITEM:
				if (resolve) return getLastItem();
				return basicGetLastItem();
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
			case VocabularyPackage.TERMINOLOGY__FIRST_ITEM:
				setFirstItem((VocabularyItem)newValue);
				return;
			case VocabularyPackage.TERMINOLOGY__LAST_ITEM:
				setLastItem((VocabularyItem)newValue);
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
			case VocabularyPackage.TERMINOLOGY__FIRST_ITEM:
				setFirstItem((VocabularyItem)null);
				return;
			case VocabularyPackage.TERMINOLOGY__LAST_ITEM:
				setLastItem((VocabularyItem)null);
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
			case VocabularyPackage.TERMINOLOGY__FIRST_ITEM:
				return firstItem != null;
			case VocabularyPackage.TERMINOLOGY__LAST_ITEM:
				return lastItem != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyImpl
