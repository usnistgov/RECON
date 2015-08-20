/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Modifier;
import NBVR.Grammar.RolePhrase;

import NBVR.Vocabulary.KeywordKind;
import NBVR.Vocabulary.VocAdjective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.ModifierImpl#getAdjective <em>Adjective</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ModifierImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ModifierImpl#getRelative <em>Relative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierImpl extends ParseElementImpl implements Modifier {
	/**
	 * The cached value of the '{@link #getAdjective() <em>Adjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjective()
	 * @generated
	 * @ordered
	 */
	protected VocAdjective adjective;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KeywordKind KIND_EDEFAULT = KeywordKind.ADJUNCT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KeywordKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelative() <em>Relative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase relative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocAdjective getAdjective() {
		if (adjective != null && adjective.eIsProxy()) {
			InternalEObject oldAdjective = (InternalEObject)adjective;
			adjective = (VocAdjective)eResolveProxy(oldAdjective);
			if (adjective != oldAdjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.MODIFIER__ADJECTIVE, oldAdjective, adjective));
			}
		}
		return adjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocAdjective basicGetAdjective() {
		return adjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjective(VocAdjective newAdjective) {
		VocAdjective oldAdjective = adjective;
		adjective = newAdjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MODIFIER__ADJECTIVE, oldAdjective, adjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KeywordKind newKind) {
		KeywordKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MODIFIER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getRelative() {
		if (relative != null && relative.eIsProxy()) {
			InternalEObject oldRelative = (InternalEObject)relative;
			relative = (RolePhrase)eResolveProxy(oldRelative);
			if (relative != oldRelative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.MODIFIER__RELATIVE, oldRelative, relative));
			}
		}
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetRelative() {
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelative(RolePhrase newRelative) {
		RolePhrase oldRelative = relative;
		relative = newRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.MODIFIER__RELATIVE, oldRelative, relative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.MODIFIER__ADJECTIVE:
				if (resolve) return getAdjective();
				return basicGetAdjective();
			case GrammarPackage.MODIFIER__KIND:
				return getKind();
			case GrammarPackage.MODIFIER__RELATIVE:
				if (resolve) return getRelative();
				return basicGetRelative();
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
			case GrammarPackage.MODIFIER__ADJECTIVE:
				setAdjective((VocAdjective)newValue);
				return;
			case GrammarPackage.MODIFIER__KIND:
				setKind((KeywordKind)newValue);
				return;
			case GrammarPackage.MODIFIER__RELATIVE:
				setRelative((RolePhrase)newValue);
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
			case GrammarPackage.MODIFIER__ADJECTIVE:
				setAdjective((VocAdjective)null);
				return;
			case GrammarPackage.MODIFIER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GrammarPackage.MODIFIER__RELATIVE:
				setRelative((RolePhrase)null);
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
			case GrammarPackage.MODIFIER__ADJECTIVE:
				return adjective != null;
			case GrammarPackage.MODIFIER__KIND:
				return kind != KIND_EDEFAULT;
			case GrammarPackage.MODIFIER__RELATIVE:
				return relative != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: Modifier
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.MODIFIER;
	}
	
	/** print()
	 *   print the node in an output of the parse tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		if (adjective != null) {
			log.print(adjective.external() + ' ');
		} else {
			log.print("(" + kind.toString() + " ");
			if (relative == null)
				log.print("___ )");
			else
				log.print(relative.getRolePlayed().getTerm().toString() + ") ");	
		}
	}

} //ModifierImpl
