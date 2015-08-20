/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VerbRoleImpl#getRange <em>Range</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbRoleImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbRoleImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbRoleImpl#isRange <em>Is Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerbRoleImpl extends EObjectImpl implements VerbRole {
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
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Term term;

	/**
	 * The default value of the '{@link #isRange() <em>Is Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRange() <em>Is Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRange()
	 * @generated
	 * @ordered
	 */
	protected boolean isRange = IS_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VERB_ROLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB_ROLE__RANGE, oldRange, range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB_ROLE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getVerb() {
		if (eContainerFeatureID() != VocabularyPackage.VERB_ROLE__VERB) return null;
		return (VocVerb)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerb(VocVerb newVerb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVerb, VocabularyPackage.VERB_ROLE__VERB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VocVerb newVerb) {
		if (newVerb != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.VERB_ROLE__VERB && newVerb != null)) {
			if (EcoreUtil.isAncestor(this, newVerb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVerb != null)
				msgs = ((InternalEObject)newVerb).eInverseAdd(this, VocabularyPackage.VOC_VERB__ROLES, VocVerb.class, msgs);
			msgs = basicSetVerb(newVerb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB_ROLE__VERB, newVerb, newVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRange(boolean newIsRange) {
		boolean oldIsRange = isRange;
		isRange = newIsRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB_ROLE__IS_RANGE, oldIsRange, isRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs) {
		Term oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB_ROLE__TERM, oldTerm, newTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Term newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject)term).eInverseRemove(this, VocabularyPackage.TERM__ROLE, Term.class, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject)newTerm).eInverseAdd(this, VocabularyPackage.TERM__ROLE, Term.class, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB_ROLE__TERM, newTerm, newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRange() {
		return isRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.VERB_ROLE__VERB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVerb((VocVerb)otherEnd, msgs);
			case VocabularyPackage.VERB_ROLE__TERM:
				if (term != null)
					msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VERB_ROLE__TERM, null, msgs);
				return basicSetTerm((Term)otherEnd, msgs);
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
			case VocabularyPackage.VERB_ROLE__VERB:
				return basicSetVerb(null, msgs);
			case VocabularyPackage.VERB_ROLE__TERM:
				return basicSetTerm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VocabularyPackage.VERB_ROLE__VERB:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOC_VERB__ROLES, VocVerb.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.VERB_ROLE__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case VocabularyPackage.VERB_ROLE__VERB:
				return getVerb();
			case VocabularyPackage.VERB_ROLE__TERM:
				return getTerm();
			case VocabularyPackage.VERB_ROLE__IS_RANGE:
				return isRange();
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
			case VocabularyPackage.VERB_ROLE__RANGE:
				setRange((VocNoun)newValue);
				return;
			case VocabularyPackage.VERB_ROLE__VERB:
				setVerb((VocVerb)newValue);
				return;
			case VocabularyPackage.VERB_ROLE__TERM:
				setTerm((Term)newValue);
				return;
			case VocabularyPackage.VERB_ROLE__IS_RANGE:
				setIsRange((Boolean)newValue);
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
			case VocabularyPackage.VERB_ROLE__RANGE:
				setRange((VocNoun)null);
				return;
			case VocabularyPackage.VERB_ROLE__VERB:
				setVerb((VocVerb)null);
				return;
			case VocabularyPackage.VERB_ROLE__TERM:
				setTerm((Term)null);
				return;
			case VocabularyPackage.VERB_ROLE__IS_RANGE:
				setIsRange(IS_RANGE_EDEFAULT);
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
			case VocabularyPackage.VERB_ROLE__RANGE:
				return range != null;
			case VocabularyPackage.VERB_ROLE__VERB:
				return getVerb() != null;
			case VocabularyPackage.VERB_ROLE__TERM:
				return term != null;
			case VocabularyPackage.VERB_ROLE__IS_RANGE:
				return isRange != IS_RANGE_EDEFAULT;
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
		result.append(" (isRange: ");
		result.append(isRange);
		result.append(')');
		return result.toString();
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset)
	{
		String sp = VocabularyFactoryImpl.spaces(offset);
		System.out.println("VerbRole");
		System.out.print(sp + " -term: ");
		if (term == null) System.out.println("(none)");
		else System.out.println(term.toString());
	}
	
	/** external()
	 *   return the externalized term for the item
	 * @generated not
	 */
	public String external()
	{
		return '"' + term.toString() + '"';
	}
	
} //VerbRoleImpl
