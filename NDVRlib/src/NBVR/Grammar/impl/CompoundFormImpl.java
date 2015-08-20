/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.CompoundForm;
import NBVR.Grammar.Connective;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Sentence;
import NBVR.Grammar.SentenceType;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.CompoundFormImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.CompoundFormImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundFormImpl extends SentenceImpl implements CompoundForm {
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
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentence> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.COMPOUND_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentence> getStatements() {
		if (statements == null) {
			statements = new EObjectResolvingEList<Sentence>(Sentence.class, this, GrammarPackage.COMPOUND_FORM__STATEMENTS);
		}
		return statements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.COMPOUND_FORM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.COMPOUND_FORM__KIND:
				return getKind();
			case GrammarPackage.COMPOUND_FORM__STATEMENTS:
				return getStatements();
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
			case GrammarPackage.COMPOUND_FORM__KIND:
				setKind((Connective)newValue);
				return;
			case GrammarPackage.COMPOUND_FORM__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Sentence>)newValue);
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
			case GrammarPackage.COMPOUND_FORM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GrammarPackage.COMPOUND_FORM__STATEMENTS:
				getStatements().clear();
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
			case GrammarPackage.COMPOUND_FORM__KIND:
				return kind != KIND_EDEFAULT;
			case GrammarPackage.COMPOUND_FORM__STATEMENTS:
				return statements != null && !statements.isEmpty();
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
	 * return the type of Sentence this is: Compound or Equivalence
	 * overrides the default return in Sentence
	 * @generated not
	 */
	@Override
	public SentenceType getType()
	{
		return (kind == Connective.EQV ? SentenceType.EQUIVALENCE : SentenceType.COMPOUND);
	}

	/** print()
	 * display the CompoundForm entry
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		log.println(GrammarFactoryImpl.spaces(offset)
				+ "(CompoundForm " + kind.getName());
		Iterator<Sentence> sit = getStatements().iterator();
		while (sit.hasNext()) sit.next().print(offset + 2, log);
		log.println(GrammarFactoryImpl.spaces(offset) + ")");
	}

} //CompoundFormImpl
