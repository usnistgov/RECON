/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Formulation;
import NBVR.Vocabulary.FormulationForm;
import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationFormImpl#getFormulation <em>Formulation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FormulationFormImpl extends EObjectImpl implements FormulationForm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.FORMULATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulation getFormulation() {
		if (eContainerFeatureID() != VocabularyPackage.FORMULATION_FORM__FORMULATION) return null;
		return (Formulation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormulation(Formulation newFormulation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormulation, VocabularyPackage.FORMULATION_FORM__FORMULATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormulation(Formulation newFormulation) {
		if (newFormulation != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.FORMULATION_FORM__FORMULATION && newFormulation != null)) {
			if (EcoreUtil.isAncestor(this, newFormulation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormulation != null)
				msgs = ((InternalEObject)newFormulation).eInverseAdd(this, VocabularyPackage.FORMULATION__FORM, Formulation.class, msgs);
			msgs = basicSetFormulation(newFormulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION_FORM__FORMULATION, newFormulation, newFormulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * default method: each subtype returns the proper value for its kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isStructured() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormulation((Formulation)otherEnd, msgs);
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				return basicSetFormulation(null, msgs);
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.FORMULATION__FORM, Formulation.class, msgs);
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				return getFormulation();
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				setFormulation((Formulation)newValue);
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				setFormulation((Formulation)null);
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
			case VocabularyPackage.FORMULATION_FORM__FORMULATION:
				return getFormulation() != null;
		}
		return super.eIsSet(featureID);
	}

} //FormulationFormImpl
