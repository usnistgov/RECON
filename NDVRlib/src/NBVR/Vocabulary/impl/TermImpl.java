/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;


import NBVR.Vocabulary.ItemElement;
import NBVR.Vocabulary.Particle;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocabularyItem;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.Word;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getRole <em>Role</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getParticle <em>Particle</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getWords <em>Words</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getContext <em>Context</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getElement <em>Element</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.TermImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */


public class TermImpl extends EObjectImpl implements Term {
	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<Word> words;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected VocabularyItem context;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemElement> element;

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
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getConcept() {
		if (eContainerFeatureID() != VocabularyPackage.TERM__CONCEPT) return null;
		return (VocabularyItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(VocabularyItem newConcept, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcept, VocabularyPackage.TERM__CONCEPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(VocabularyItem newConcept) {
		if (newConcept != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.TERM__CONCEPT && newConcept != null)) {
			if (EcoreUtil.isAncestor(this, newConcept))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcept != null)
				msgs = ((InternalEObject)newConcept).eInverseAdd(this, VocabularyPackage.VOCABULARY_ITEM__TERMS, VocabularyItem.class, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERM__CONCEPT, newConcept, newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Word> getWords() {
		if (words == null) {
			words = new EObjectResolvingEList<Word>(Word.class, this, VocabularyPackage.TERM__WORDS);
		}
		return words;
	}

	/** addWord
	 * add a Word to the Term
	 * @generated not
	 */
	public void addWord(Word word)
	{
		getWords().add(word);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (VocabularyItem)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.TERM__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyItem basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(VocabularyItem newContext) {
		VocabularyItem oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERM__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole getRole() {
		if (eContainerFeatureID() != VocabularyPackage.TERM__ROLE) return null;
		return (VerbRole)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(VerbRole newRole, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRole, VocabularyPackage.TERM__ROLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(VerbRole newRole) {
		if (newRole != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.TERM__ROLE && newRole != null)) {
			if (EcoreUtil.isAncestor(this, newRole))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, VocabularyPackage.VERB_ROLE__TERM, VerbRole.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERM__ROLE, newRole, newRole));
	}
	
	/**
	 * @return the FormElement that owns this Term
	 * @generated
	 */
	public EList<ItemElement> getElement()
	{
		if (element == null) {
			element = new EObjectWithInverseResolvingEList<ItemElement>(ItemElement.class, this, VocabularyPackage.TERM__ELEMENT, VocabularyPackage.ITEM_ELEMENT__TERM);
		}
		return element;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Particle getParticle() {
		if (eContainerFeatureID() != VocabularyPackage.TERM__PARTICLE) return null;
		return (Particle)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticle(Particle newParticle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParticle, VocabularyPackage.TERM__PARTICLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticle(Particle newParticle) {
		if (newParticle != eInternalContainer() || (eContainerFeatureID() != VocabularyPackage.TERM__PARTICLE && newParticle != null)) {
			if (EcoreUtil.isAncestor(this, newParticle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParticle != null)
				msgs = ((InternalEObject)newParticle).eInverseAdd(this, VocabularyPackage.PARTICLE__TERM, Particle.class, msgs);
			msgs = basicSetParticle(newParticle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.TERM__PARTICLE, newParticle, newParticle));
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
			case VocabularyPackage.TERM__CONCEPT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcept((VocabularyItem)otherEnd, msgs);
			case VocabularyPackage.TERM__ROLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRole((VerbRole)otherEnd, msgs);
			case VocabularyPackage.TERM__PARTICLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParticle((Particle)otherEnd, msgs);
			case VocabularyPackage.TERM__ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElement()).basicAdd(otherEnd, msgs);
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
			case VocabularyPackage.TERM__CONCEPT:
				return basicSetConcept(null, msgs);
			case VocabularyPackage.TERM__ROLE:
				return basicSetRole(null, msgs);
			case VocabularyPackage.TERM__PARTICLE:
				return basicSetParticle(null, msgs);
			case VocabularyPackage.TERM__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case VocabularyPackage.TERM__CONCEPT:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VOCABULARY_ITEM__TERMS, VocabularyItem.class, msgs);
			case VocabularyPackage.TERM__ROLE:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.VERB_ROLE__TERM, VerbRole.class, msgs);
			case VocabularyPackage.TERM__PARTICLE:
				return eInternalContainer().eInverseRemove(this, VocabularyPackage.PARTICLE__TERM, Particle.class, msgs);
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
			case VocabularyPackage.TERM__CONCEPT:
				return getConcept();
			case VocabularyPackage.TERM__ROLE:
				return getRole();
			case VocabularyPackage.TERM__PARTICLE:
				return getParticle();
			case VocabularyPackage.TERM__WORDS:
				return getWords();
			case VocabularyPackage.TERM__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case VocabularyPackage.TERM__ELEMENT:
				return getElement();
			case VocabularyPackage.TERM__TEXT:
				return getText();
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
			case VocabularyPackage.TERM__CONCEPT:
				setConcept((VocabularyItem)newValue);
				return;
			case VocabularyPackage.TERM__ROLE:
				setRole((VerbRole)newValue);
				return;
			case VocabularyPackage.TERM__PARTICLE:
				setParticle((Particle)newValue);
				return;
			case VocabularyPackage.TERM__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends Word>)newValue);
				return;
			case VocabularyPackage.TERM__CONTEXT:
				setContext((VocabularyItem)newValue);
				return;
			case VocabularyPackage.TERM__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ItemElement>)newValue);
				return;
			case VocabularyPackage.TERM__TEXT:
				setText((String)newValue);
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
			case VocabularyPackage.TERM__CONCEPT:
				setConcept((VocabularyItem)null);
				return;
			case VocabularyPackage.TERM__ROLE:
				setRole((VerbRole)null);
				return;
			case VocabularyPackage.TERM__PARTICLE:
				setParticle((Particle)null);
				return;
			case VocabularyPackage.TERM__WORDS:
				getWords().clear();
				return;
			case VocabularyPackage.TERM__CONTEXT:
				setContext((VocabularyItem)null);
				return;
			case VocabularyPackage.TERM__ELEMENT:
				getElement().clear();
				return;
			case VocabularyPackage.TERM__TEXT:
				setText(TEXT_EDEFAULT);
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
			case VocabularyPackage.TERM__CONCEPT:
				return getConcept() != null;
			case VocabularyPackage.TERM__ROLE:
				return getRole() != null;
			case VocabularyPackage.TERM__PARTICLE:
				return getParticle() != null;
			case VocabularyPackage.TERM__WORDS:
				return words != null && !words.isEmpty();
			case VocabularyPackage.TERM__CONTEXT:
				return context != null;
			case VocabularyPackage.TERM__ELEMENT:
				return element != null && !element.isEmpty();
			case VocabularyPackage.TERM__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}
	
	/* local methods */
	
	/** toString
	 * creates a string of the words in the term
	 * saves it in stringForm for later reuse
	 * @return the string of the words in the term
	 * @generated not
	 */
	public String toString()
	{
		/* if we have already done this, return the result */
		if (text != null) return text;

		/* if we have nothing to work from (error!), return the null string */
		if (words == null) return "";
		
		/* create the string from the word elements */
		int wordcount = getWords().size();
		if (wordcount == 0) return ""; // no words, return the null string
		
		/* the term is, or begins with, the first word */
		text = getWords().get(0).getBase().getText();
		/* if there is only one word, we are done */
		if (wordcount == 1) return text;

		// term is multiple words, that was just the first
		StringBuffer b = new StringBuffer(text);
		for (int w = 1; w < wordcount; ++w) {
			b.append(' ');
			b.append(getWords().get(w).getBase().getText());
		}
		text = b.toString();
		return text;
	}

} //TermImpl
