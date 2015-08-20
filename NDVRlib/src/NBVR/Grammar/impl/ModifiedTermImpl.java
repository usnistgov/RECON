/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.ModifiedTerm;
import NBVR.Grammar.Modifier;
import NBVR.Grammar.Qualifier;
import NBVR.Grammar.Quantifier;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.ModifiedTermImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ModifiedTermImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ModifiedTermImpl#getQualifiers <em>Qualifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModifiedTermImpl extends SimpleNounPhraseImpl implements ModifiedTerm {
	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifiers;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualifier> qualifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.MODIFIED_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQuantifier() {
		if (quantifier != null && quantifier.eIsProxy()) {
			InternalEObject oldQuantifier = (InternalEObject)quantifier;
			quantifier = (Quantifier)eResolveProxy(oldQuantifier);
			if (quantifier != oldQuantifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.MODIFIED_TERM__QUANTIFIER, oldQuantifier, quantifier));
			}
		}
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier basicGetQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MODIFIED_TERM__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<Modifier>(Modifier.class, this, GrammarPackage.MODIFIED_TERM__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * Creates the list of adjective '<em><b>Modifiers</b></em>' from a passed List
	 * @generated not
	 * @param the list of Modifiers to be added
	 */
	public void setModifiers(List<Modifier> modifiers)
	{
		if (modifiers == null || modifiers.isEmpty()) {
			this.modifiers = null;
			return;
		}
		
		Modifier adj;
		for (int i = 0; i < modifiers.size(); ++i) {
			adj = modifiers.get(i);
			getModifiers().add(adj);
			adj.setParent(this);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualifier> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectResolvingEList<Qualifier>(Qualifier.class, this, GrammarPackage.MODIFIED_TERM__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * Creates the list of '<em><b>Qualifiers</b></em>' from a passed List
	 * @generated not
	 * @param the list of Qualifiers to be added
	 */
	public void setQualifiers(List<Qualifier> qualifiers)
	{
		if (qualifiers == null || qualifiers.isEmpty()) return;
		
		Qualifier qual;
		for (int i = 0; i < qualifiers.size(); ++i) {
			qual = qualifiers.get(i);
			getQualifiers().add(qual);
			qual.setParent(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.MODIFIED_TERM__QUANTIFIER:
				if (resolve) return getQuantifier();
				return basicGetQuantifier();
			case GrammarPackage.MODIFIED_TERM__MODIFIERS:
				return getModifiers();
			case GrammarPackage.MODIFIED_TERM__QUALIFIERS:
				return getQualifiers();
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
			case GrammarPackage.MODIFIED_TERM__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case GrammarPackage.MODIFIED_TERM__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Modifier>)newValue);
				return;
			case GrammarPackage.MODIFIED_TERM__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends Qualifier>)newValue);
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
			case GrammarPackage.MODIFIED_TERM__QUANTIFIER:
				setQuantifier((Quantifier)null);
				return;
			case GrammarPackage.MODIFIED_TERM__MODIFIERS:
				getModifiers().clear();
				return;
			case GrammarPackage.MODIFIED_TERM__QUALIFIERS:
				getQualifiers().clear();
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
			case GrammarPackage.MODIFIED_TERM__QUANTIFIER:
				return quantifier != null;
			case GrammarPackage.MODIFIED_TERM__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case GrammarPackage.MODIFIED_TERM__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModifiedTermImpl
