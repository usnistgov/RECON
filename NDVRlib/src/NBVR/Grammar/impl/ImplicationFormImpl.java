/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.Connective;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.ImplicationForm;
import NBVR.Grammar.Sentence;
import NBVR.Grammar.SentenceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.ImplicationFormImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ImplicationFormImpl#getConsequent <em>Consequent</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ImplicationFormImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ImplicationFormImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicationFormImpl extends SentenceImpl implements ImplicationForm {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected Sentence antecedent;

	/**
	 * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequent()
	 * @generated
	 * @ordered
	 */
	protected Sentence consequent;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected Sentence alternative;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final Connective KIND_EDEFAULT = Connective.AND;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Connective kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.IMPLICATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getAntecedent() {
		if (antecedent != null && antecedent.eIsProxy()) {
			InternalEObject oldAntecedent = (InternalEObject)antecedent;
			antecedent = (Sentence)eResolveProxy(oldAntecedent);
			if (antecedent != oldAntecedent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.IMPLICATION_FORM__ANTECEDENT, oldAntecedent, antecedent));
			}
		}
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedent(Sentence newAntecedent) {
		Sentence oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.IMPLICATION_FORM__ANTECEDENT, oldAntecedent, antecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getConsequent() {
		if (consequent != null && consequent.eIsProxy()) {
			InternalEObject oldConsequent = (InternalEObject)consequent;
			consequent = (Sentence)eResolveProxy(oldConsequent);
			if (consequent != oldConsequent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.IMPLICATION_FORM__CONSEQUENT, oldConsequent, consequent));
			}
		}
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetConsequent() {
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequent(Sentence newConsequent) {
		Sentence oldConsequent = consequent;
		consequent = newConsequent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.IMPLICATION_FORM__CONSEQUENT, oldConsequent, consequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getAlternative() {
		if (alternative != null && alternative.eIsProxy()) {
			InternalEObject oldAlternative = (InternalEObject)alternative;
			alternative = (Sentence)eResolveProxy(oldAlternative);
			if (alternative != oldAlternative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.IMPLICATION_FORM__ALTERNATIVE, oldAlternative, alternative));
			}
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(Sentence newAlternative) {
		Sentence oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.IMPLICATION_FORM__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connective getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Connective newKind) {
		Connective oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.IMPLICATION_FORM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.IMPLICATION_FORM__ANTECEDENT:
				if (resolve) return getAntecedent();
				return basicGetAntecedent();
			case GrammarPackage.IMPLICATION_FORM__CONSEQUENT:
				if (resolve) return getConsequent();
				return basicGetConsequent();
			case GrammarPackage.IMPLICATION_FORM__ALTERNATIVE:
				if (resolve) return getAlternative();
				return basicGetAlternative();
			case GrammarPackage.IMPLICATION_FORM__KIND:
				return getKind();
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
			case GrammarPackage.IMPLICATION_FORM__ANTECEDENT:
				setAntecedent((Sentence)newValue);
				return;
			case GrammarPackage.IMPLICATION_FORM__CONSEQUENT:
				setConsequent((Sentence)newValue);
				return;
			case GrammarPackage.IMPLICATION_FORM__ALTERNATIVE:
				setAlternative((Sentence)newValue);
				return;
			case GrammarPackage.IMPLICATION_FORM__KIND:
				setKind((Connective)newValue);
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
			case GrammarPackage.IMPLICATION_FORM__ANTECEDENT:
				setAntecedent((Sentence)null);
				return;
			case GrammarPackage.IMPLICATION_FORM__CONSEQUENT:
				setConsequent((Sentence)null);
				return;
			case GrammarPackage.IMPLICATION_FORM__ALTERNATIVE:
				setAlternative((Sentence)null);
				return;
			case GrammarPackage.IMPLICATION_FORM__KIND:
				setKind(KIND_EDEFAULT);
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
			case GrammarPackage.IMPLICATION_FORM__ANTECEDENT:
				return antecedent != null;
			case GrammarPackage.IMPLICATION_FORM__CONSEQUENT:
				return consequent != null;
			case GrammarPackage.IMPLICATION_FORM__ALTERNATIVE:
				return alternative != null;
			case GrammarPackage.IMPLICATION_FORM__KIND:
				return kind != KIND_EDEFAULT;
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

	/* add-ons */
	
	/** getType()
	 * return the type of Sentence this is: Implication
	 * overrides the default return of class Sentence
	 * @generated not
	 */
	@Override
	public SentenceType getType()
	{
		return SentenceType.IMPLICATION;
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		log.println(sp + "(Implication " + kind.getName());
			if (antecedent == null) log.println("  ___");
		else antecedent.print(offset + 2, log);
		if (consequent == null) log.println("  ___");
		else consequent.print(offset + 2, log);
		if (alternative != null) {
			log.println(sp + "  (Otherwise ");
			alternative.print(offset + 4, log);
			log.println(sp + "  )");
		}
		log.println(sp + ")");
	}


} //ImplicationFormImpl
