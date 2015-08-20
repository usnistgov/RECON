/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;


import NBVR.Logic.Implication;
import NBVR.Logic.LogicPackage;
import NBVR.Logic.Proposition;
import NBVR.Logic.PropositionKind;

import java.io.PrintWriter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Logic.impl.ImplicationImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ImplicationImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl extends PropositionImpl implements Implication {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected Proposition antecedent;

	/**
	 * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequent()
	 * @generated
	 * @ordered
	 */
	protected Proposition consequent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition getAntecedent() {
		if (antecedent != null && antecedent.eIsProxy()) {
			InternalEObject oldAntecedent = (InternalEObject)antecedent;
			antecedent = (Proposition)eResolveProxy(oldAntecedent);
			if (antecedent != oldAntecedent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.IMPLICATION__ANTECEDENT, oldAntecedent, antecedent));
			}
		}
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public NotificationChain basicSetAntecedent(Proposition newAntecedent, NotificationChain msgs) {
		Proposition oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.IMPLICATION__ANTECEDENT, oldAntecedent, newAntecedent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		/* add-on: record the owner of the antecedent proposition */
		if (antecedent != null) antecedent.setOwner(this);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setAntecedent(Proposition newAntecedent) {
		Proposition oldAntecedent = antecedent;
		antecedent = newAntecedent;

		/* add-on: record the owner of the antecedent proposition */
		if (antecedent != null) antecedent.setOwner(this);

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.IMPLICATION__ANTECEDENT, oldAntecedent, antecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition getConsequent() {
		if (consequent != null && consequent.eIsProxy()) {
			InternalEObject oldConsequent = (InternalEObject)consequent;
			consequent = (Proposition)eResolveProxy(oldConsequent);
			if (consequent != oldConsequent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.IMPLICATION__CONSEQUENT, oldConsequent, consequent));
			}
		}
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetConsequent() {
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public NotificationChain basicSetConsequent(Proposition newConsequent, NotificationChain msgs) {
		Proposition oldConsequent = consequent;
		consequent = newConsequent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.IMPLICATION__CONSEQUENT, oldConsequent, newConsequent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		/* add-on: record the owner of the antecedent proposition */
		if (consequent != null) consequent.setOwner(this);
		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setConsequent(Proposition newConsequent) {
		Proposition oldConsequent = consequent;
		consequent = newConsequent;

		/* add-on: record the owner of the antecedent proposition */
		if (consequent != null) consequent.setOwner(this);
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.IMPLICATION__CONSEQUENT, oldConsequent, consequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public PropositionKind getType() {
		return PropositionKind.IMPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.IMPLICATION__ANTECEDENT:
				if (resolve) return getAntecedent();
				return basicGetAntecedent();
			case LogicPackage.IMPLICATION__CONSEQUENT:
				if (resolve) return getConsequent();
				return basicGetConsequent();
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
			case LogicPackage.IMPLICATION__ANTECEDENT:
				setAntecedent((Proposition)newValue);
				return;
			case LogicPackage.IMPLICATION__CONSEQUENT:
				setConsequent((Proposition)newValue);
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
			case LogicPackage.IMPLICATION__ANTECEDENT:
				setAntecedent((Proposition)null);
				return;
			case LogicPackage.IMPLICATION__CONSEQUENT:
				setConsequent((Proposition)null);
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
			case LogicPackage.IMPLICATION__ANTECEDENT:
				return antecedent != null;
			case LogicPackage.IMPLICATION__CONSEQUENT:
				return consequent != null;
		}
		return super.eIsSet(featureID);
	}
	
	/** toIKL()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void toIKL(PrintWriter iklout, int offset)
	{
		String sp = LogicFactoryImpl.spaces(offset);
		
		iklout.println(sp + "(if");
		if (antecedent != null)
			antecedent.toIKL(iklout, offset + 2);
		else
			iklout.println(sp + "  (___ )");
		if (consequent != null)
			consequent.toIKL(iklout, offset + 2);
		else
			iklout.println(sp + "  (___ )");
		
		iklout.println(sp + ')');
		
	}

} //ImplicationImpl
