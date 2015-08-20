/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Grammar.ParseElement;
import NBVR.Vocabulary.Formulation;
import NBVR.Vocabulary.FormulationForm;
import NBVR.Vocabulary.VocabularyItem;
import NBVR.Vocabulary.VocabularyPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationImpl#getForm <em>Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationImpl#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.FormulationImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulationImpl extends EObjectImpl implements Formulation {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected FormulationForm form;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ParseElement> elements;

	protected boolean isStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulationForm getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(FormulationForm newForm, NotificationChain msgs) {
		FormulationForm oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(FormulationForm newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, VocabularyPackage.FORMULATION_FORM__FORMULATION, FormulationForm.class, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, VocabularyPackage.FORMULATION_FORM__FORMULATION, FormulationForm.class, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParseElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ParseElement>(ParseElement.class, this, VocabularyPackage.FORMULATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Formulations that don't have forms are necessarily unstructured
	 * A FormulationForm can speak for itself
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isStructured() 
	{
		if (form == null) return false;
		return form.isStructured();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addElement(ParseElement elt) 
	{
		getElements().add(elt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getConcept() {
		if (eContainerFeatureID() != VocabularyPackage.FORMULATION__CONCEPT) return null;
		return (VocabularyItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(VocabularyItem newConcept, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcept, VocabularyPackage.FORMULATION__CONCEPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(VocabularyItem newConcept) {
		if (newConcept != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.FORMULATION__CONCEPT && newConcept != null)) {
			if (EcoreUtil.isAncestor(this, newConcept))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcept != null)
				msgs = ((InternalEObject)newConcept).eInverseAdd(this, VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS, VocabularyItem.class, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.FORMULATION__CONCEPT, newConcept, newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.FORMULATION__FORM:
				if (form != null)
					msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.FORMULATION__FORM, null, msgs);
				return basicSetForm((FormulationForm)otherEnd, msgs);
			case VocabularyPackage.FORMULATION__CONCEPT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcept((VocabularyItem)otherEnd, msgs);
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
			case VocabularyPackage.FORMULATION__FORM:
				return basicSetForm(null, msgs);
			case VocabularyPackage.FORMULATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case VocabularyPackage.FORMULATION__CONCEPT:
				return basicSetConcept(null, msgs);
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
			case VocabularyPackage.FORMULATION__CONCEPT:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOCABULARY_ITEM__FORMULATIONS, VocabularyItem.class, msgs);
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
			case VocabularyPackage.FORMULATION__FORM:
				return getForm();
			case VocabularyPackage.FORMULATION__TEXT:
				return getText();
			case VocabularyPackage.FORMULATION__LANGUAGE:
				return getLanguage();
			case VocabularyPackage.FORMULATION__ELEMENTS:
				return getElements();
			case VocabularyPackage.FORMULATION__CONCEPT:
				return getConcept();
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
			case VocabularyPackage.FORMULATION__FORM:
				setForm((FormulationForm)newValue);
				return;
			case VocabularyPackage.FORMULATION__TEXT:
				setText((String)newValue);
				return;
			case VocabularyPackage.FORMULATION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case VocabularyPackage.FORMULATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ParseElement>)newValue);
				return;
			case VocabularyPackage.FORMULATION__CONCEPT:
				setConcept((VocabularyItem)newValue);
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
			case VocabularyPackage.FORMULATION__FORM:
				setForm((FormulationForm)null);
				return;
			case VocabularyPackage.FORMULATION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case VocabularyPackage.FORMULATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case VocabularyPackage.FORMULATION__ELEMENTS:
				getElements().clear();
				return;
			case VocabularyPackage.FORMULATION__CONCEPT:
				setConcept((VocabularyItem)null);
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
			case VocabularyPackage.FORMULATION__FORM:
				return form != null;
			case VocabularyPackage.FORMULATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case VocabularyPackage.FORMULATION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case VocabularyPackage.FORMULATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case VocabularyPackage.FORMULATION__CONCEPT:
				return getConcept() != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //FormulationImpl
