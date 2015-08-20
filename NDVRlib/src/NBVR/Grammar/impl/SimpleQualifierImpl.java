/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.Condition;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.QualifierChain;
import NBVR.Grammar.Sentence;
import NBVR.Grammar.SimpleQualifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.SimpleQualifierImpl#getChain <em>Chain</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SimpleQualifierImpl#getBoundForm <em>Bound Form</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SimpleQualifierImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleQualifierImpl extends QualifierImpl implements SimpleQualifier {
	/**
	 * The cached value of the '{@link #getChain() <em>Chain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChain()
	 * @generated
	 * @ordered
	 */
	protected QualifierChain chain;

	/**
	 * The cached value of the '{@link #getBoundForm() <em>Bound Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundForm()
	 * @generated
	 * @ordered
	 */
	protected Sentence boundForm;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.SIMPLE_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, GrammarPackage.CONDITION__QUALIFIER, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, GrammarPackage.CONDITION__QUALIFIER, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_QUALIFIER__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getBoundForm() {
		if (boundForm != null && boundForm.eIsProxy()) {
			InternalEObject oldBoundForm = (InternalEObject)boundForm;
			boundForm = (Sentence)eResolveProxy(oldBoundForm);
			if (boundForm != oldBoundForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM, oldBoundForm, boundForm));
			}
		}
		return boundForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetBoundForm() {
		return boundForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundForm(Sentence newBoundForm) {
		Sentence oldBoundForm = boundForm;
		boundForm = newBoundForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM, oldBoundForm, boundForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierChain getChain() {
		if (chain != null && chain.eIsProxy()) {
			InternalEObject oldChain = (InternalEObject)chain;
			chain = (QualifierChain)eResolveProxy(oldChain);
			if (chain != oldChain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SIMPLE_QUALIFIER__CHAIN, oldChain, chain));
			}
		}
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierChain basicGetChain() {
		return chain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChain(QualifierChain newChain, NotificationChain msgs) {
		QualifierChain oldChain = chain;
		chain = newChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_QUALIFIER__CHAIN, oldChain, newChain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChain(QualifierChain newChain) {
		if (newChain != chain) {
			NotificationChain msgs = null;
			if (chain != null)
				msgs = ((InternalEObject)chain).eInverseRemove(this, GrammarPackage.QUALIFIER_CHAIN__QUALIFIERS, QualifierChain.class, msgs);
			if (newChain != null)
				msgs = ((InternalEObject)newChain).eInverseAdd(this, GrammarPackage.QUALIFIER_CHAIN__QUALIFIERS, QualifierChain.class, msgs);
			msgs = basicSetChain(newChain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_QUALIFIER__CHAIN, newChain, newChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				if (chain != null)
					msgs = ((InternalEObject)chain).eInverseRemove(this, GrammarPackage.QUALIFIER_CHAIN__QUALIFIERS, QualifierChain.class, msgs);
				return basicSetChain((QualifierChain)otherEnd, msgs);
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, GrammarPackage.CONDITION__QUALIFIER, Condition.class, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
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
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				return basicSetChain(null, msgs);
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				return basicSetCondition(null, msgs);
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
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				if (resolve) return getChain();
				return basicGetChain();
			case GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM:
				if (resolve) return getBoundForm();
				return basicGetBoundForm();
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				setChain((QualifierChain)newValue);
				return;
			case GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM:
				setBoundForm((Sentence)newValue);
				return;
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				setCondition((Condition)newValue);
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
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				setChain((QualifierChain)null);
				return;
			case GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM:
				setBoundForm((Sentence)null);
				return;
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				setCondition((Condition)null);
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
			case GrammarPackage.SIMPLE_QUALIFIER__CHAIN:
				return chain != null;
			case GrammarPackage.SIMPLE_QUALIFIER__BOUND_FORM:
				return boundForm != null;
			case GrammarPackage.SIMPLE_QUALIFIER__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isSimple() 
	{
		return true;
	}

	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		
		log.println(sp + "(Qualifier");
		if (condition == null) log.println(sp + "  (Condition )");
		else condition.print(offset + 2, log);
		if (boundForm == null) log.println(sp + "  (BoundForm ___ )");
		else boundForm.print(offset + 2, log);
		log.println(sp + ')');
	}

} //SimpleQualifierImpl
