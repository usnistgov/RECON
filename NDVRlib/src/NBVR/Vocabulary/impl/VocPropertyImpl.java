/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.FormElement;
import NBVR.Vocabulary.FormElementKind;
import NBVR.Vocabulary.ItemElement;
import NBVR.Vocabulary.SyntaxForm;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocProperty;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voc Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocPropertyImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocPropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocPropertyImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocPropertyImpl#getPropertyForm <em>Property Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocPropertyImpl extends VocabularyItemImpl implements VocProperty {
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
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected VocNoun range;

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
	 * The cached value of the '{@link #getPropertyForm() <em>Property Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyForm()
	 * @generated
	 * @ordered
	 */
	protected EList<SyntaxForm> propertyForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Overrides default to return the VocProperty kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public VocItemKind getKind() {
		return VocItemKind.PROPERTY_CONCEPT; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (VocNoun)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_PROPERTY__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(VocNoun newRange) {
		VocNoun oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_PROPERTY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SyntaxForm> getPropertyForm() {
		if (propertyForm == null) {
			propertyForm = new EObjectContainmentWithInverseEList<SyntaxForm>(SyntaxForm.class, this, VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM, VocabularyPackage.SYNTAX_FORM__PROPERTY);
		}
		return propertyForm;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_PROPERTY__VERB, oldVerb, verb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_PROPERTY__VERB, oldVerb, verb));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VOC_PROPERTY__DOMAIN, oldDomain, domain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_PROPERTY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyForm()).basicAdd(otherEnd, msgs);
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
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				return ((InternalEList<?>)getPropertyForm()).basicRemove(otherEnd, msgs);
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
			case VocabularyPackage.VOC_PROPERTY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case VocabularyPackage.VOC_PROPERTY__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case VocabularyPackage.VOC_PROPERTY__VERB:
				if (resolve) return getVerb();
				return basicGetVerb();
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				return getPropertyForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VocabularyPackage.VOC_PROPERTY__DOMAIN:
				setDomain((VocNoun)newValue);
				return;
			case VocabularyPackage.VOC_PROPERTY__RANGE:
				setRange((VocNoun)newValue);
				return;
			case VocabularyPackage.VOC_PROPERTY__VERB:
				setVerb((VocVerb)newValue);
				return;
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				getPropertyForm().clear();
				getPropertyForm().addAll((Collection<? extends SyntaxForm>)newValue);
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
			case VocabularyPackage.VOC_PROPERTY__DOMAIN:
				setDomain((VocNoun)null);
				return;
			case VocabularyPackage.VOC_PROPERTY__RANGE:
				setRange((VocNoun)null);
				return;
			case VocabularyPackage.VOC_PROPERTY__VERB:
				setVerb((VocVerb)null);
				return;
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				getPropertyForm().clear();
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
			case VocabularyPackage.VOC_PROPERTY__DOMAIN:
				return domain != null;
			case VocabularyPackage.VOC_PROPERTY__RANGE:
				return range != null;
			case VocabularyPackage.VOC_PROPERTY__VERB:
				return verb != null;
			case VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM:
				return propertyForm != null && !propertyForm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* add-ons */
	
	/** findPropertyForm (term)
	 * find the Syntax Form for the property that uses the given term
	 * @param term = the term used for the property in the form of interest
	 * @return the Syntax Form that uses that term, or null
	 * @generated not
	 */
	public SyntaxForm findPropertyForm(Term term)
	{
		SyntaxForm form;
		FormElement elt;

		/* if there is only one form, return it */
		if (getPropertyForm().size() == 1) 
			return getPropertyForm().get(0);

		/* find a form in which the ItemElement matches the term */
		Iterator<SyntaxForm> fit = getPropertyForm().iterator();
		while (fit.hasNext()) {
			form = fit.next();
			elt = form.getElements().get(0);
			if (elt != null && elt.getKind() == FormElementKind.ITEM_ELEMENT) {
				if (((ItemElement)elt).getTerm() == term) return form;
			}
		}
		return null;
	}
	
	/** getDomainRole()
	 * find the VerbRole that is the Domain role of the Property
	 * @return the VerbRole representing the domain
	 * @generated not
	 */
	public VerbRole getDomainRole()
	{
		VocVerb verb = getVerb();
		VerbRole role;
		
		role = verb.getRoles().get(0);
		if (role.isRange()) return verb.getRoles().get(1);
		return role;
	}

} //VocPropertyImpl
