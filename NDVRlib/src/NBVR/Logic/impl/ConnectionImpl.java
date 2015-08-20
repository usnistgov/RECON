/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;

import NBVR.Grammar.Connective;

import NBVR.Logic.Connection;
import NBVR.Logic.LogicPackage;
import NBVR.Logic.Proposition;
import NBVR.Logic.PropositionKind;

import java.util.Collection;
import java.util.Iterator;
import java.io.PrintWriter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Logic.impl.ConnectionImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ConnectionImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends PropositionImpl implements Connection {
	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposition> operands;

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
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Proposition> getOperands() {
		if (operands == null) {
			operands = new EObjectResolvingEList<Proposition>(Proposition.class, this, LogicPackage.CONNECTION__OPERANDS);
		}
		return operands;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.CONNECTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicPackage.CONNECTION__OPERANDS:
				return getOperands();
			case LogicPackage.CONNECTION__KIND:
				return getKind();
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
			case LogicPackage.CONNECTION__OPERANDS:
				getOperands().clear();
				getOperands().addAll((Collection<? extends Proposition>)newValue);
				return;
			case LogicPackage.CONNECTION__KIND:
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
			case LogicPackage.CONNECTION__OPERANDS:
				getOperands().clear();
				return;
			case LogicPackage.CONNECTION__KIND:
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
			case LogicPackage.CONNECTION__OPERANDS:
				return operands != null && !operands.isEmpty();
			case LogicPackage.CONNECTION__KIND:
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public PropositionKind getType() {
		return PropositionKind.CONNECTION;
	}
	
	/** addOperand(proposition)
	 * adds the passed proposition to the operands of the Connection
	 * @param p = the proposition to be added
	 * @generated not
	 */
	public void addOperand(Proposition p)
	{
		if (p == null) return;
		getOperands().add(p);
		p.setOwner(this);
	}
	
	/** toIKL()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void toIKL(PrintWriter iklout, int offset)
	{
		String sp = LogicFactoryImpl.spaces(offset);
		
		if (kind == Connective.AND)
			iklout.println(sp + "(and");
		else if (kind == Connective.OR)
			iklout.println(sp + "(or");
		else if (kind == Connective.EQV)
			iklout.println(sp + "(iff");
		else
			iklout.println(sp + "(" + kind.toString());

		if (operands != null && !operands.isEmpty()) {
			Iterator<Proposition> pit = operands.iterator();
			while (pit.hasNext()) pit.next().toIKL(iklout, offset + 2);
		}
		
		iklout.println(sp + ')');
		
	}
	

} //ConnectionImpl
