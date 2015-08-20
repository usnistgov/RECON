/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.Predicate;
import NBVR.Vocabulary.SyntaxForm;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import java.util.Collection;
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
 * An implementation of the model object '<em><b>Voc Verb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocVerbImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocVerbImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocVerbImpl#getForm <em>Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocVerbImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocVerbImpl extends VocabularyItemImpl implements VocVerb {
	/**
	 * The default value of the '{@link #getArity() <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected static final int ARITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArity() <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected int arity = ARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<VerbRole> roles;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected EList<SyntaxForm> form;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocVerbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOC_VERB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Overrides default to return the VocVerb kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public VocItemKind getKind() {
		return VocItemKind.VERB_CONCEPT; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArity() {
		return arity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArity(int newArity) {
		int oldArity = arity;
		arity = newArity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_VERB__ARITY, oldArity, arity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerbRole> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<VerbRole>(VerbRole.class, this, VocabularyPackage.VOC_VERB__ROLES, VocabularyPackage.VERB_ROLE__VERB);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SyntaxForm> getForm() {
		if (form == null) {
			form = new EObjectContainmentWithInverseEList<SyntaxForm>(SyntaxForm.class, this, VocabularyPackage.VOC_VERB__FORM, VocabularyPackage.SYNTAX_FORM__VERB);
		}
		return form;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_VERB__PREDICATE, oldPredicate, newPredicate);
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
				msgs = ((InternalEObject)predicate).eInverseRemove(this, LogicPackage.PREDICATE__VERB, Predicate.class, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, LogicPackage.PREDICATE__VERB, Predicate.class, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOC_VERB__PREDICATE, newPredicate, newPredicate));
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
			case VocabularyPackage.VOC_VERB__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case VocabularyPackage.VOC_VERB__FORM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForm()).basicAdd(otherEnd, msgs);
			case VocabularyPackage.VOC_VERB__PREDICATE:
				if (predicate != null)
					msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOC_VERB__PREDICATE, null, msgs);
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
			case VocabularyPackage.VOC_VERB__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case VocabularyPackage.VOC_VERB__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case VocabularyPackage.VOC_VERB__PREDICATE:
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
			case VocabularyPackage.VOC_VERB__ARITY:
				return getArity();
			case VocabularyPackage.VOC_VERB__ROLES:
				return getRoles();
			case VocabularyPackage.VOC_VERB__FORM:
				return getForm();
			case VocabularyPackage.VOC_VERB__PREDICATE:
				return getPredicate();
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
			case VocabularyPackage.VOC_VERB__ARITY:
				setArity((Integer)newValue);
				return;
			case VocabularyPackage.VOC_VERB__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends VerbRole>)newValue);
				return;
			case VocabularyPackage.VOC_VERB__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends SyntaxForm>)newValue);
				return;
			case VocabularyPackage.VOC_VERB__PREDICATE:
				setPredicate((Predicate)newValue);
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
			case VocabularyPackage.VOC_VERB__ARITY:
				setArity(ARITY_EDEFAULT);
				return;
			case VocabularyPackage.VOC_VERB__ROLES:
				getRoles().clear();
				return;
			case VocabularyPackage.VOC_VERB__FORM:
				getForm().clear();
				return;
			case VocabularyPackage.VOC_VERB__PREDICATE:
				setPredicate((Predicate)null);
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
			case VocabularyPackage.VOC_VERB__ARITY:
				return arity != ARITY_EDEFAULT;
			case VocabularyPackage.VOC_VERB__ROLES:
				return roles != null && !roles.isEmpty();
			case VocabularyPackage.VOC_VERB__FORM:
				return form != null && !form.isEmpty();
			case VocabularyPackage.VOC_VERB__PREDICATE:
				return predicate != null;
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
		result.append(" (arity: ");
		result.append(arity);
		result.append(')');
		return result.toString();
	}

	/* add-ons */
	

	/**
	 * routine to find a VerbRole by name
	 * @param term = the text of the term for the VerbRole
	 * @return the VerbRole with that term, or null
	 * 
	 * @generated not
	 */
	public VerbRole find_named_role(String term)
	{
		for (int r = 0; r < arity; ++r) {
			VerbRole role = getRoles().get(r);
			if (role.getTerm().getText().equals(term)) return role;
		}
		return null;
	}

} //VocVerbImpl
