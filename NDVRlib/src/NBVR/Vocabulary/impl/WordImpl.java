/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.KeywordKind;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.Word;
import NBVR.Vocabulary.WordForm;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.WordImpl#getBase <em>Base</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.WordImpl#getBeginsTerm <em>Begins Term</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.WordImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WordImpl extends EObjectImpl implements Word {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * the base form of the Word, perhaps the only form
	 * nouns and verbs have additional forms
	 * for nouns, the base is the singular form
	 * for verbs, the base is the infinitive form
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected WordForm base;

	/**
	 * The cached value of the '{@link #getBeginsTerm() <em>Begins Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginsTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> beginsTerm;

	/**
	 * The real implementation of the Dictionary list of Words
	 * 'next' is the next word after this one
	 * @generated not
	 */
	protected Word next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.WORD;
	}

	/** addUsage
	 * adds a Term to the BeginsTerm list
	 * @generated not
	 */
	public void addUsage(Term t)
	{
		getBeginsTerm().add(t);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (WordForm)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.WORD__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * when setting the base word form, link the form to the Word
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setBase(WordForm newBase) {
		WordForm oldBase = base;
		base = newBase;
		newBase.setWord(this);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.WORD__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getBeginsTerm() {
		if (beginsTerm == null) {
			beginsTerm = new EObjectResolvingEList<Term>(Term.class, this, VocabularyPackage.WORD__BEGINS_TERM);
		}
		return beginsTerm;
	}

	/** isNumber()
	 * @return true if the Word is a Number, false otherwise 
	 * default method for Words
	 * returns false except for Numbers
	 * @generated not
	 */
	public boolean isNumber() {
		return false;
	}

	/** isText()
	 * @return true if the Word is a TextString, false otherwise 
	 * default method for Words
	 * returns false except for TextStrings
	 * @generated not
	 */
	public boolean isText() {
		return false;
	}

	/** isArticle()
	 * default method for Words
	 * returns false except for Keywords
	 * @return true if a, an or the, false otherwise 
	 * @generated not
	 */
	public boolean isArticle() {
		return false;
	}

	/** isKeyword(kind)
	 * default method for Words
	 * returns false except for Keywords (override in KeywordImpl)
	 * @param kind = the KeywordKind to match
	 * @return true if the Word is a Keyword of the given kind, else false
	 * @generated not
	 */
	public boolean isKeyword(KeywordKind kind)
	{
		return false;
	}

	/** isKeyword()
	 * default method for Words
	 * returns false except for Keywords (override in KeywordImpl)
	 * @return true if the Word is a Keyword, else false
	 * @generated not
	 */
	public boolean isKeyword()
	{
		return false;
	}

	/** isVerb()
	 * default method for Words
	 * returns false except for Verbs (override in VerbImpl)
	 * @return true if the Word is a Verb, else false
	 * @generated not
	 */
	public boolean isVerb()
	{
		return false;
	}

	/** isIs()
	 * default method for Words
	 * returns false except for the verb 'to be' (override in IsVerb)
	 * @return true if the Word is a form of the verb 'to be', else false
	 * @generated not
	 */
	public boolean isIs()
	{
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.WORD__NEXT:
				return basicSetNext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/** isNoun()
	 * default method for Words
	 * returns false except for Nouns (override in NounImpl)
	 * @return true if the Word is a Noun, else false
	 * @generated not
	 */
	public boolean isNoun()
	{
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.WORD__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case VocabularyPackage.WORD__BEGINS_TERM:
				return getBeginsTerm();
			case VocabularyPackage.WORD__NEXT:
				return getNext();
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
			case VocabularyPackage.WORD__BASE:
				setBase((WordForm)newValue);
				return;
			case VocabularyPackage.WORD__BEGINS_TERM:
				getBeginsTerm().clear();
				getBeginsTerm().addAll((Collection<? extends Term>)newValue);
				return;
			case VocabularyPackage.WORD__NEXT:
				setNext((Word)newValue);
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
			case VocabularyPackage.WORD__BASE:
				setBase((WordForm)null);
				return;
			case VocabularyPackage.WORD__BEGINS_TERM:
				getBeginsTerm().clear();
				return;
			case VocabularyPackage.WORD__NEXT:
				setNext((Word)null);
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
			case VocabularyPackage.WORD__BASE:
				return base != null;
			case VocabularyPackage.WORD__BEGINS_TERM:
				return beginsTerm != null && !beginsTerm.isEmpty();
			case VocabularyPackage.WORD__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/* add-ons */

	/**
	 * real implementation of the Dictionary word list
	 * @return the next word in the Dictionary
	 * 
	 * @generated not
	 */
	public Word getNext()
	{
		return next;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Word newNext, NotificationChain msgs) {
		Word oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.WORD__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * set the next word in the dictionary, used only by Dictionary.addWord
	 * @param w = the Word to follow this one
	 * 
	 * @generated not
	 */
	public void setNext(Word w)
	{
		next = w;
	}
	
	/** toString()
	 * return the string form of the word
	 * @generated not
	 */
	public String external()
	{
		return base.getText();
	}

} //WordImpl
