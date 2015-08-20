/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.VocAdjective;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Adjective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocAdjectiveImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocAdjectiveImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocAdjectiveImpl extends VocabularyItemImpl implements VocAdjective {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected VocNoun domain;

	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected VocVerb verb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocAdjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_ADJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Overrides default to return the Adjective kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public VocItemKind getKind() {
		return VocItemKind.ADJECTIVE_CONCEPT; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (VocNoun)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_ADJECTIVE__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(VocNoun newDomain) {
		VocNoun oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_ADJECTIVE__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getVerb() {
		if (verb != null && verb.eIsProxy()) {
			InternalEObject oldVerb = (InternalEObject)verb;
			verb = (VocVerb)eResolveProxy(oldVerb);
			if (verb != oldVerb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_ADJECTIVE__VERB, oldVerb, verb));
			}
		}
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb basicGetVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VocVerb newVerb) {
		VocVerb oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_ADJECTIVE__VERB, oldVerb, verb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.VOC_ADJECTIVE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case VocabularyPackage.VOC_ADJECTIVE__VERB:
				if (resolve) return getVerb();
				return basicGetVerb();
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
			case VocabularyPackage.VOC_ADJECTIVE__DOMAIN:
				setDomain((VocNoun)newValue);
				return;
			case VocabularyPackage.VOC_ADJECTIVE__VERB:
				setVerb((VocVerb)newValue);
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
			case VocabularyPackage.VOC_ADJECTIVE__DOMAIN:
				setDomain((VocNoun)null);
				return;
			case VocabularyPackage.VOC_ADJECTIVE__VERB:
				setVerb((VocVerb)null);
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
			case VocabularyPackage.VOC_ADJECTIVE__DOMAIN:
				return domain != null;
			case VocabularyPackage.VOC_ADJECTIVE__VERB:
				return verb != null;
		}
		return super.eIsSet(featureID);
	}

} //VocAdjectiveImpl
