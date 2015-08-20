/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.NominalConstant;
import NBVR.Logic.Proposition;

import NBVR.Grammar.InstanceKind;

import java.io.PrintWriter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nominal Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Logic.impl.NominalConstantImpl#getProposition <em>Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NominalConstantImpl extends ConstantImpl implements NominalConstant {
	/**
	 * The cached value of the '{@link #getProposition() <em>Proposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposition()
	 * @generated
	 * @ordered
	 */
	protected Proposition proposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NominalConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.NOMINAL_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition getProposition() {
		if (proposition != null && proposition.eIsProxy()) {
			InternalEObject oldProposition = (InternalEObject)proposition;
			proposition = (Proposition)eResolveProxy(oldProposition);
			if (proposition != oldProposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.NOMINAL_CONSTANT__PROPOSITION, oldProposition, proposition));
			}
		}
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetProposition() {
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposition(Proposition newProposition) {
		Proposition oldProposition = proposition;
		proposition = newProposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.NOMINAL_CONSTANT__PROPOSITION, oldProposition, proposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.NOMINAL_CONSTANT__PROPOSITION:
				if (resolve) return getProposition();
				return basicGetProposition();
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
			case LogicPackage.NOMINAL_CONSTANT__PROPOSITION:
				setProposition((Proposition)newValue);
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
			case LogicPackage.NOMINAL_CONSTANT__PROPOSITION:
				setProposition((Proposition)null);
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
			case LogicPackage.NOMINAL_CONSTANT__PROPOSITION:
				return proposition != null;
		}
		return super.eIsSet(featureID);
	}
	
	/** toIKL()
	 *   print the argument in an output of the tree
	 * @generated not
	 */
	public void toIKL(PrintWriter iklout, int offset)
	{
		String predicate;
		
		switch(kind.getValue()) {
		case InstanceKind.STATEMENT_VALUE:
			predicate = "";
			break;
		case InstanceKind.QUESTION_VALUE:
			predicate = "(whether ";
			break;
		default:
			predicate = '(' + kind.toString();
		}
		if (proposition == null) {
			iklout.print(predicate + "(that (___ ))");
			if (! predicate.equals("")) iklout.print(")");
		} else {
			String sp = LogicFactoryImpl.spaces(offset);
			iklout.println();
			iklout.println(sp + predicate + " (that");
			proposition.toIKL(iklout, offset + 2);
			iklout.println(sp + ')' + 
				(predicate.equals("") ? "" : ')'));
		}

	}	

} //NominalConstantImpl
