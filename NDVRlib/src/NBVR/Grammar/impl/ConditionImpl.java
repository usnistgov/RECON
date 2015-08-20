/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.Sentence;
import NBVR.Grammar.Condition;
import NBVR.Grammar.GrammarPackage;

import NBVR.Grammar.SimpleQualifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.ConditionImpl#isOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ConditionImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.ConditionImpl#getAntecedent <em>Antecedent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends ParseElementImpl implements Condition {
	/**
	 * The default value of the '{@link #isOtherwise() <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtherwise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OTHERWISE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOtherwise() <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtherwise()
	 * @generated
	 * @ordered
	 */
	protected boolean otherwise = OTHERWISE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected SimpleQualifier qualifier;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.CONDITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.CONDITION__ANTECEDENT, oldAntecedent, antecedent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONDITION__ANTECEDENT, oldAntecedent, antecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOtherwise() {
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(boolean newOtherwise) {
		boolean oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONDITION__OTHERWISE, oldOtherwise, otherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier getQualifier() {
		if (qualifier != null && qualifier.eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject)qualifier;
			qualifier = (SimpleQualifier)eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.CONDITION__QUALIFIER, oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier basicGetQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(SimpleQualifier newQualifier, NotificationChain msgs) {
		SimpleQualifier oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.CONDITION__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(SimpleQualifier newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, SimpleQualifier.class, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, SimpleQualifier.class, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.CONDITION__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.CONDITION__QUALIFIER:
				if (qualifier != null)
					msgs = ((InternalEObject)qualifier).eInverseRemove(this, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, SimpleQualifier.class, msgs);
				return basicSetQualifier((SimpleQualifier)otherEnd, msgs);
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
			case GrammarPackage.CONDITION__QUALIFIER:
				return basicSetQualifier(null, msgs);
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
			case GrammarPackage.CONDITION__OTHERWISE:
				return isOtherwise();
			case GrammarPackage.CONDITION__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
			case GrammarPackage.CONDITION__ANTECEDENT:
				if (resolve) return getAntecedent();
				return basicGetAntecedent();
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
			case GrammarPackage.CONDITION__OTHERWISE:
				setOtherwise((Boolean)newValue);
				return;
			case GrammarPackage.CONDITION__QUALIFIER:
				setQualifier((SimpleQualifier)newValue);
				return;
			case GrammarPackage.CONDITION__ANTECEDENT:
				setAntecedent((Sentence)newValue);
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
			case GrammarPackage.CONDITION__OTHERWISE:
				setOtherwise(OTHERWISE_EDEFAULT);
				return;
			case GrammarPackage.CONDITION__QUALIFIER:
				setQualifier((SimpleQualifier)null);
				return;
			case GrammarPackage.CONDITION__ANTECEDENT:
				setAntecedent((Sentence)null);
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
			case GrammarPackage.CONDITION__OTHERWISE:
				return otherwise != OTHERWISE_EDEFAULT;
			case GrammarPackage.CONDITION__QUALIFIER:
				return qualifier != null;
			case GrammarPackage.CONDITION__ANTECEDENT:
				return antecedent != null;
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
		result.append(" (otherwise: ");
		result.append(otherwise);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: Condition
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.CONDITION;
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		log.println(sp + "(Condition " + otherwise + " ");
		if (antecedent != null) antecedent.print(offset + 2, log);
		log.println(sp + ')');
	}

} //ConditionImpl
