/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.FormElement;
import NBVR.Vocabulary.FormElementKind;
import NBVR.Vocabulary.ItemElement;
import NBVR.Vocabulary.Particle;
import NBVR.Vocabulary.RoleElement;
import NBVR.Vocabulary.SyntaxForm;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocProperty;
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
 * An implementation of the model object '<em><b>Syntax Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.SyntaxFormImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.SyntaxFormImpl#isAuxForm <em>Is Aux Form</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.SyntaxFormImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.SyntaxFormImpl#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.SyntaxFormImpl#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyntaxFormImpl extends EObjectImpl implements SyntaxForm {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FormElement> elements;

	/**
	 * The default value of the '{@link #isAuxForm() <em>Is Aux Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuxForm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUX_FORM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuxForm() <em>Is Aux Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuxForm()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuxForm = IS_AUX_FORM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.SYNTAX_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<FormElement>(FormElement.class, this, VocabularyPackage.SYNTAX_FORM__ELEMENTS, VocabularyPackage.FORM_ELEMENT__FORM);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuxForm() {
		return isAuxForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuxForm(boolean newIsAuxForm) {
		boolean oldIsAuxForm = isAuxForm;
		isAuxForm = newIsAuxForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.SYNTAX_FORM__IS_AUX_FORM, oldIsAuxForm, isAuxForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getVerb() {
		if (eContainerFeatureID() != VocabularyPackage.SYNTAX_FORM__VERB) return null;
		return (VocVerb)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerb(VocVerb newVerb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVerb, VocabularyPackage.SYNTAX_FORM__VERB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VocVerb newVerb) {
		if (newVerb != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.SYNTAX_FORM__VERB && newVerb != null)) {
			if (EcoreUtil.isAncestor(this, newVerb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVerb != null)
				msgs = ((InternalEObject)newVerb).eInverseAdd(this, VocabularyPackage.VOC_VERB__FORM, VocVerb.class, msgs);
			msgs = basicSetVerb(newVerb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.SYNTAX_FORM__VERB, newVerb, newVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty getProperty() {
		if (eContainerFeatureID() != VocabularyPackage.SYNTAX_FORM__PROPERTY) return null;
		return (VocProperty)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(VocProperty newProperty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProperty, VocabularyPackage.SYNTAX_FORM__PROPERTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(VocProperty newProperty) {
		if (newProperty != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.SYNTAX_FORM__PROPERTY && newProperty != null)) {
			if (EcoreUtil.isAncestor(this, newProperty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM, VocProperty.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.SYNTAX_FORM__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getText() {
		if (text == null) makeText();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.SYNTAX_FORM__TEXT, oldText, text));
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProperty((VocProperty)otherEnd, msgs);
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				return basicSetProperty(null, msgs);
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOC_PROPERTY__PROPERTY_FORM, VocProperty.class, msgs);
			case VocabularyPackage.SYNTAX_FORM__VERB:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOC_VERB__FORM, VocVerb.class, msgs);
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				return getElements();
			case VocabularyPackage.SYNTAX_FORM__IS_AUX_FORM:
				return isAuxForm();
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				return getProperty();
			case VocabularyPackage.SYNTAX_FORM__TEXT:
				return getText();
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FormElement>)newValue);
				return;
			case VocabularyPackage.SYNTAX_FORM__IS_AUX_FORM:
				setIsAuxForm((Boolean)newValue);
				return;
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				setProperty((VocProperty)newValue);
				return;
			case VocabularyPackage.SYNTAX_FORM__TEXT:
				setText((String)newValue);
				return;
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				getElements().clear();
				return;
			case VocabularyPackage.SYNTAX_FORM__IS_AUX_FORM:
				setIsAuxForm(IS_AUX_FORM_EDEFAULT);
				return;
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				setProperty((VocProperty)null);
				return;
			case VocabularyPackage.SYNTAX_FORM__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
			case VocabularyPackage.SYNTAX_FORM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case VocabularyPackage.SYNTAX_FORM__IS_AUX_FORM:
				return isAuxForm != IS_AUX_FORM_EDEFAULT;
			case VocabularyPackage.SYNTAX_FORM__PROPERTY:
				return getProperty() != null;
			case VocabularyPackage.SYNTAX_FORM__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case VocabularyPackage.SYNTAX_FORM__VERB:
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
		result.append(" (isAuxForm: ");
		result.append(isAuxForm);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}
	
	/* add-ons */

	/** addElement
	 * add a FormElement to the Elements list
	 * @param elt = the element to be added
	 * @generated not
	 */
	public void addElement(FormElement elt)
	{
		getElements().add(elt);
		elt.setForm(this);
	}

	/** 
	 *  string buffer for creating the external text forms for SyntaxForms
	 *  @generated NOT 
	 */
	protected static StringBuffer textbuf = new StringBuffer(256);
	
	/** getText()
	 * routine to produce a text form from the SyntaxForm, 
	 * including the parenthesized roles
	 * 
	 * @return the text form
	 * @generated NOT
	 */
	private void makeText()
	{
		textbuf.setLength(0);
		for (int fe = 0; fe < getElements().size(); ++fe) {
			FormElement elt = getElements().get(fe);
			switch(elt.getKind().getValue()) {
			case FormElementKind.ITEM_ELEMENT_VALUE:
				textbuf.append(' ');
				textbuf.append(((ItemElement)elt).getTerm().getText());
				break;
			case FormElementKind.PARTICLE_ELEMENT_VALUE:
				/* if this is not the first "object", insert the particle in the name
				 * the first particle was added to the verb text if there was no direct object */
				if (fe > 2) {
					textbuf.append(' ');
					textbuf.append(((Particle)elt).getTerm().getText());
				}
				/* get Particle Role */
				elt = ((Particle)elt).getRole();
				/* fall thru */
			default: /* it is a Role */
				if (elt != null) {
					VerbRole role = ((RoleElement)elt).getRole();
					Term rangeterm = role.getRange().getTerms().get(0);
					textbuf.append(" (");
					textbuf.append(rangeterm.getText());
					if (! role.getTerm().toString().equals(rangeterm.getText())) {
						textbuf.append(':');
						textbuf.append(role.getTerm().getText());
					}
					textbuf.append(')');
				}
			}
		}
		text = textbuf.toString();

	}


} //SyntaxFormImpl
