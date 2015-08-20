/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Formulation;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocabularyItem;
import NBVR.Vocabulary.VocabularyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VocabularyItemImpl#getFormulations <em>Formulations</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocabularyItemImpl#getBase <em>Base</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocabularyItemImpl#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VocabularyItemImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VocabularyItemImpl extends EObjectImpl implements VocabularyItem {
	/**
	 * The cached value of the '{@link #getFormulations() <em>Formulations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formulation> formulations;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyItem> base;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected VocabularyItem next;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> terms;

	/**
	 * The most recent use of the Term in the current Parse structure
	 * 
	 * @generated not
	 */
	protected TermUse lastUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VOCABULARY_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formulation> getFormulations() {
		if (formulations == null) {
			formulations = new EObjectContainmentWithInverseEList<Formulation>(Formulation.class, this, VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS, VocabularyPackage.FORMULATION__CONCEPT);
		}
		return formulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * default method -- each subclass will override it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public VocItemKind getKind() {
		return null; // default return
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyItem> getBase() {
		if (base == null) {
			base = new EObjectResolvingEList<VocabularyItem>(VocabularyItem.class, this, VocabularyPackage.VOCABULARY_ITEM__BASE);
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(VocabularyItem newNext, NotificationChain msgs) {
		VocabularyItem oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY_ITEM__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(VocabularyItem newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY_ITEM__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.VOCABULARY_ITEM__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VOCABULARY_ITEM__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentWithInverseEList<Term>(Term.class, this, VocabularyPackage.VOCABULARY_ITEM__TERMS, VocabularyPackage.TERM__CONCEPT);
		}
		return terms;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * returns true if the Item has no formal (structured) formulations, else false
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPrimitive() 
	{
		for (int f = 0; f < formulations.size(); ++f) {
			if (formulations.get(f).isStructured()) return false;
		}
		return true;
	}

	/** addTerm
	 * adds a Term for the VocabularyItem to the terms list
	 * @generated not
	 */
	public void addTerm(Term term)
	{
		getTerms().add(term);
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormulations()).basicAdd(otherEnd, msgs);
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerms()).basicAdd(otherEnd, msgs);
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				return ((InternalEList<?>)getFormulations()).basicRemove(otherEnd, msgs);
			case VocabularyPackage.VOCABULARY_ITEM__NEXT:
				return basicSetNext(null, msgs);
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				return getFormulations();
			case VocabularyPackage.VOCABULARY_ITEM__BASE:
				return getBase();
			case VocabularyPackage.VOCABULARY_ITEM__NEXT:
				return getNext();
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				return getTerms();
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				getFormulations().clear();
				getFormulations().addAll((Collection<? extends Formulation>)newValue);
				return;
			case VocabularyPackage.VOCABULARY_ITEM__BASE:
				getBase().clear();
				getBase().addAll((Collection<? extends VocabularyItem>)newValue);
				return;
			case VocabularyPackage.VOCABULARY_ITEM__NEXT:
				setNext((VocabularyItem)newValue);
				return;
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends Term>)newValue);
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				getFormulations().clear();
				return;
			case VocabularyPackage.VOCABULARY_ITEM__BASE:
				getBase().clear();
				return;
			case VocabularyPackage.VOCABULARY_ITEM__NEXT:
				setNext((VocabularyItem)null);
				return;
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				getTerms().clear();
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
			case VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS:
				return formulations != null && !formulations.isEmpty();
			case VocabularyPackage.VOCABULARY_ITEM__BASE:
				return base != null && !base.isEmpty();
			case VocabularyPackage.VOCABULARY_ITEM__NEXT:
				return next != null;
			case VocabularyPackage.VOCABULARY_ITEM__TERMS:
				return terms != null && !terms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* add-ons */

	/** getLastUse()
	 * @return the most recent TermUse object for the VocabularyItem
	 * @generated not
	 */
	public TermUse getLastUse()
	{
		return lastUse;
	}

	/** setLastUse(TermUse)
	 * set the most recent TermUse object for the VocabularyItem
	 * @generated not
	 */
	public void setLastUse(TermUse tuse)
	{
		lastUse = tuse;
	}
	
	/** external()
	 *   return the externalized term for the item
	 * @generated not
	 */
	public String external()
	{
		if (terms == null) return "___";
		return '"' + terms.get(0).toString() + '"';
	}

	
	/** getFormulationIn(language)
	 *   return the formulation for the item in the given language or null
	 * @generated not
	 */
	public Formulation findFormulationIn(String language) 
	{
		if (formulations == null) return null;
		for (int f = 0; f < getFormulations().size(); ++f) {
			if (getFormulations().get(f).getLanguage().equals(language))
				return getFormulations().get(f);
		}
		return null;
	}

} //VocabularyItemImpl
