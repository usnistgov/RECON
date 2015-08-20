/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.Predicate;
import NBVR.Logic.RoleVariable;

import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Logic.impl.PredicateImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link NBVR.Logic.impl.PredicateImpl#getName <em>Name</em>}</li>
 *   <li>{@link NBVR.Logic.impl.PredicateImpl#getNoun <em>Noun</em>}</li>
 *   <li>{@link NBVR.Logic.impl.PredicateImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PredicateImpl extends EObjectImpl implements Predicate {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleVariable> variables;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated not
	 * @ordered
	 */
	protected String text = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.PREDICATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<RoleVariable>(RoleVariable.class, this, LogicPackage.PREDICATE__VARIABLES, LogicPackage.ROLE_VARIABLE__PREDICATE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Return the Vocabulary Noun for which this is a 'Formulation'
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun getNoun() {
		if (eContainerFeatureID() != LogicPackage.PREDICATE__NOUN) return null;
		return (VocNoun)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoun(VocNoun newNoun, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNoun, LogicPackage.PREDICATE__NOUN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoun(VocNoun newNoun) {
		if (newNoun != eInternalContainer() || (eContainerFeatureID() != LogicPackage.PREDICATE__NOUN && newNoun != null)) {
			if (EcoreUtil.isAncestor(this, newNoun))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNoun != null)
				msgs = ((InternalEObject)newNoun).eInverseAdd(this, VocabularyPackage.VOC_NOUN__PREDICATE, VocNoun.class, msgs);
			msgs = basicSetNoun(newNoun, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.PREDICATE__NOUN, newNoun, newNoun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Return the Vocabulary Verb for which this is a 'Formulation'
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getVerb() {
		if (eContainerFeatureID() != LogicPackage.PREDICATE__VERB) return null;
		return (VocVerb)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerb(VocVerb newVerb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVerb, LogicPackage.PREDICATE__VERB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VocVerb newVerb) {
		if (newVerb != eInternalContainer() || (eContainerFeatureID() != LogicPackage.PREDICATE__VERB && newVerb != null)) {
			if (EcoreUtil.isAncestor(this, newVerb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVerb != null)
				msgs = ((InternalEObject)newVerb).eInverseAdd(this, VocabularyPackage.VOC_VERB__PREDICATE, VocVerb.class, msgs);
			msgs = basicSetVerb(newVerb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicPackage.PREDICATE__VERB, newVerb, newVerb));
	}

	/**
	 * Returns the value of the '<em>Text</em>' attribute.
	 * @return the value of the '<em>Text</em>' attribute.
	 * @generated not
	 */
	public String getText()
	{
		return text;
	}
	
	/**
	 * Sets the value of the '<em>Text</em>' attribute.
	 * @param newtext = the new value of the '<em>Text</em>' attribute.
	 * @generated not
	 */
	public void setText(String newtext)
	{
		text = newtext;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicPackage.PREDICATE__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
			case LogicPackage.PREDICATE__NOUN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNoun((VocNoun)otherEnd, msgs);
			case LogicPackage.PREDICATE__VERB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVerb((VocVerb)otherEnd, msgs);
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
			case LogicPackage.PREDICATE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case LogicPackage.PREDICATE__NOUN:
				return basicSetNoun(null, msgs);
			case LogicPackage.PREDICATE__VERB:
				return basicSetVerb(null, msgs);
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
			case LogicPackage.PREDICATE__NOUN:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOC_NOUN__PREDICATE, VocNoun.class, msgs);
			case LogicPackage.PREDICATE__VERB:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOC_VERB__PREDICATE, VocVerb.class, msgs);
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
			case LogicPackage.PREDICATE__VARIABLES:
				return getVariables();
			case LogicPackage.PREDICATE__NAME:
				return getName();
			case LogicPackage.PREDICATE__NOUN:
				return getNoun();
			case LogicPackage.PREDICATE__VERB:
				return getVerb();
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
			case LogicPackage.PREDICATE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends RoleVariable>)newValue);
				return;
			case LogicPackage.PREDICATE__NAME:
				setName((String)newValue);
				return;
			case LogicPackage.PREDICATE__NOUN:
				setNoun((VocNoun)newValue);
				return;
			case LogicPackage.PREDICATE__VERB:
				setVerb((VocVerb)newValue);
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
			case LogicPackage.PREDICATE__VARIABLES:
				getVariables().clear();
				return;
			case LogicPackage.PREDICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogicPackage.PREDICATE__NOUN:
				setNoun((VocNoun)null);
				return;
			case LogicPackage.PREDICATE__VERB:
				setVerb((VocVerb)null);
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
			case LogicPackage.PREDICATE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case LogicPackage.PREDICATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogicPackage.PREDICATE__NOUN:
				return getNoun() != null;
			case LogicPackage.PREDICATE__VERB:
				return getVerb() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
