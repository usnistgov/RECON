/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.Predicate;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Noun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocNounImpl#getIsAVerb <em>Is AVerb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocNounImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocNounImpl#isMassNoun <em>Mass Noun</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocNounImpl extends VocabularyItemImpl implements VocNoun {
	/**
	 * The cached value of the '{@link #getIsAVerb() <em>Is AVerb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAVerb()
	 * @generated
	 * @ordered
	 */
	protected VocVerb isAVerb;
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Predicate predicate;
	/**
	 * The default value of the '{@link #isMassNoun() <em>Mass Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMassNoun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASS_NOUN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMassNoun() <em>Mass Noun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMassNoun()
	 * @generated
	 * @ordered
	 */
	protected boolean massNoun = MASS_NOUN_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocNounImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_NOUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Overrides default to return the VocNoun kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public VocItemKind getKind() {
		return VocItemKind.NOUN_CONCEPT; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getIsAVerb() {
		if (isAVerb != null && isAVerb.eIsProxy()) {
			InternalEObject oldIsAVerb = (InternalEObject)isAVerb;
			isAVerb = (VocVerb)eResolveProxy(oldIsAVerb);
			if (isAVerb != oldIsAVerb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_NOUN__IS_AVERB, oldIsAVerb, isAVerb));
			}
		}
		return isAVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb basicGetIsAVerb() {
		return isAVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAVerb(VocVerb newIsAVerb) {
		VocVerb oldIsAVerb = isAVerb;
		isAVerb = newIsAVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_NOUN__IS_AVERB, oldIsAVerb, isAVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(Predicate newPredicate, NotificationChain msgs) {
		Predicate oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_NOUN__PREDICATE, oldPredicate, newPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, LogicPackage.PREDICATE__NOUN, Predicate.class, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, LogicPackage.PREDICATE__NOUN, Predicate.class, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_NOUN__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMassNoun() {
		return massNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassNoun(boolean newMassNoun) {
		boolean oldMassNoun = massNoun;
		massNoun = newMassNoun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_NOUN__MASS_NOUN, oldMassNoun, massNoun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				if (predicate != null)
					msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOC_NOUN__PREDICATE, null, msgs);
				return basicSetPredicate((Predicate)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case VocabularyPackage.VOC_NOUN__IS_AVERB:
				if (resolve) return getIsAVerb();
				return basicGetIsAVerb();
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				return getPredicate();
			case VocabularyPackage.VOC_NOUN__MASS_NOUN:
				return isMassNoun();
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
			case VocabularyPackage.VOC_NOUN__IS_AVERB:
				setIsAVerb((VocVerb)newValue);
				return;
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case VocabularyPackage.VOC_NOUN__MASS_NOUN:
				setMassNoun((Boolean)newValue);
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
			case VocabularyPackage.VOC_NOUN__IS_AVERB:
				setIsAVerb((VocVerb)null);
				return;
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case VocabularyPackage.VOC_NOUN__MASS_NOUN:
				setMassNoun(MASS_NOUN_EDEFAULT);
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
			case VocabularyPackage.VOC_NOUN__IS_AVERB:
				return isAVerb != null;
			case VocabularyPackage.VOC_NOUN__PREDICATE:
				return predicate != null;
			case VocabularyPackage.VOC_NOUN__MASS_NOUN:
				return massNoun != MASS_NOUN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (massNoun: ");
		result.append(massNoun);
		result.append(')');
		return result.toString();
	}

} //VocNounImpl
