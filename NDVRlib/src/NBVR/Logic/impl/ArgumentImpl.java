/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;

import NBVR.Grammar.RolePhrase;
import NBVR.Grammar.InstanceKind;

import NBVR.Logic.Argument;
import NBVR.Logic.Constant;
import NBVR.Logic.LogicPackage;
import NBVR.Logic.Relation;
import NBVR.Logic.Variable;

import NBVR.Vocabulary.VerbRole;

import java.io.PrintWriter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getPhrase <em>Phrase</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link NBVR.Logic.impl.ArgumentImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends EObjectImpl implements Argument {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Argument next;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getPhrase() <em>Phrase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhrase()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase phrase;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected VerbRole role;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected Constant constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Argument)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.ARGUMENT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Argument newNext) {
		Argument oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.ARGUMENT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getPhrase() {
		if (phrase != null && phrase.eIsProxy()) {
			InternalEObject oldPhrase = (InternalEObject)phrase;
			phrase = (RolePhrase)eResolveProxy(oldPhrase);
			if (phrase != oldPhrase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.ARGUMENT__PHRASE, oldPhrase, phrase));
			}
		}
		return phrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetPhrase() {
		return phrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhrase(RolePhrase newPhrase) {
		RolePhrase oldPhrase = phrase;
		phrase = newPhrase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__PHRASE, oldPhrase, phrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (VerbRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicPackage.ARGUMENT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(VerbRole newRole) {
		VerbRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs) {
		Constant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__CONSTANT, oldConstant, newConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(Constant newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicPackage.ARGUMENT__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicPackage.ARGUMENT__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelation() {
		if (eContainerFeatureID() != LogicPackage.ARGUMENT__RELATION) return null;
		return (Relation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(Relation newRelation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRelation, LogicPackage.ARGUMENT__RELATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(Relation newRelation) {
		if (newRelation != eInternalContainer() || (eContainerFeatureID() != LogicPackage.ARGUMENT__RELATION && newRelation != null)) {
			if (EcoreUtil.isAncestor(this, newRelation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRelation != null)
				msgs = ((InternalEObject)newRelation).eInverseAdd(this, LogicPackage.RELATION__ARGUMENTS, Relation.class, msgs);
			msgs = basicSetRelation(newRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.ARGUMENT__RELATION, newRelation, newRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns true if there is another Argument in the list, else false
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean hasNext() {
		return (next != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.ARGUMENT__RELATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRelation((Relation)otherEnd, msgs);
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
			case LogicPackage.ARGUMENT__CONSTANT:
				return basicSetConstant(null, msgs);
			case LogicPackage.ARGUMENT__RELATION:
				return basicSetRelation(null, msgs);
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
			case LogicPackage.ARGUMENT__RELATION:
				return eInternalContainer().eInverseRemove(this, LogicPackage.RELATION__ARGUMENTS, Relation.class, msgs);
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
			case LogicPackage.ARGUMENT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case LogicPackage.ARGUMENT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case LogicPackage.ARGUMENT__PHRASE:
				if (resolve) return getPhrase();
				return basicGetPhrase();
			case LogicPackage.ARGUMENT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case LogicPackage.ARGUMENT__CONSTANT:
				return getConstant();
			case LogicPackage.ARGUMENT__RELATION:
				return getRelation();
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
			case LogicPackage.ARGUMENT__NEXT:
				setNext((Argument)newValue);
				return;
			case LogicPackage.ARGUMENT__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case LogicPackage.ARGUMENT__PHRASE:
				setPhrase((RolePhrase)newValue);
				return;
			case LogicPackage.ARGUMENT__ROLE:
				setRole((VerbRole)newValue);
				return;
			case LogicPackage.ARGUMENT__CONSTANT:
				setConstant((Constant)newValue);
				return;
			case LogicPackage.ARGUMENT__RELATION:
				setRelation((Relation)newValue);
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
			case LogicPackage.ARGUMENT__NEXT:
				setNext((Argument)null);
				return;
			case LogicPackage.ARGUMENT__VARIABLE:
				setVariable((Variable)null);
				return;
			case LogicPackage.ARGUMENT__PHRASE:
				setPhrase((RolePhrase)null);
				return;
			case LogicPackage.ARGUMENT__ROLE:
				setRole((VerbRole)null);
				return;
			case LogicPackage.ARGUMENT__CONSTANT:
				setConstant((Constant)null);
				return;
			case LogicPackage.ARGUMENT__RELATION:
				setRelation((Relation)null);
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
			case LogicPackage.ARGUMENT__NEXT:
				return next != null;
			case LogicPackage.ARGUMENT__VARIABLE:
				return variable != null;
			case LogicPackage.ARGUMENT__PHRASE:
				return phrase != null;
			case LogicPackage.ARGUMENT__ROLE:
				return role != null;
			case LogicPackage.ARGUMENT__CONSTANT:
				return constant != null;
			case LogicPackage.ARGUMENT__RELATION:
				return getRelation() != null;
		}
		return super.eIsSet(featureID);
	}
	
	/** toIKL()
	 *   print the argument in an output of the tree
	 * @generated not
	 */
	public void toIKL(PrintWriter iklout, int offset)
	{
		boolean expanded = false;
		iklout.print(' ');	//prefix each argument with a space
		if (variable != null) {
			iklout.print(variable.getName());
		} else if (constant != null) {
			constant.toIKL(iklout, offset + 2);
			/* note whether it was the kind of thing that expands */
			expanded = (constant.getKind().getValue() >= InstanceKind.STATEMENT_VALUE);
		} else if (phrase == null) {
			iklout.print("___");
		} else {
			iklout.print(phrase.getType().getName() + '?');
		}
		if (expanded) {
			iklout.print(LogicFactoryImpl.spaces(offset));
		}
	}

} //ArgumentImpl
