/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Dictionary;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.Word;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.DictionaryImpl#getFirstWord <em>First Word</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryImpl extends EObjectImpl implements Dictionary {
	/** the real implementation of the list of words
	 * linked directly off the Dictionary object as a stack
	 * firstWord is the top, and each Word has a 'next' that points to the one below it
	 * @generated not
	 */
	protected Word firstWord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.DICTIONARY;
	}

	/**
	 * add a Word to the words list
	 * @generated not
	 */
	public void addWord(Word w) {
		w.setNext(firstWord);
		firstWord = w;
	}
	
	/** 
	 * return the first word in the Dictionary
	 * @return the first Word in the dictionary
	 * 
	 * @generated not
	 */
	public Word getFirstWord()
	{
		return firstWord;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstWord(Word newFirstWord, NotificationChain msgs) {
		Word oldFirstWord = firstWord;
		firstWord = newFirstWord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VocabularyPackage.DICTIONARY__FIRST_WORD, oldFirstWord, newFirstWord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstWord(Word newFirstWord) {
		if (newFirstWord != firstWord) {
			NotificationChain msgs = null;
			if (firstWord != null)
				msgs = ((InternalEObject)firstWord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.DICTIONARY__FIRST_WORD, null, msgs);
			if (newFirstWord != null)
				msgs = ((InternalEObject)newFirstWord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VocabularyPackage.DICTIONARY__FIRST_WORD, null, msgs);
			msgs = basicSetFirstWord(newFirstWord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.DICTIONARY__FIRST_WORD, newFirstWord, newFirstWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VocabularyPackage.DICTIONARY__FIRST_WORD:
				return basicSetFirstWord(null, msgs);
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
			case VocabularyPackage.DICTIONARY__FIRST_WORD:
				return getFirstWord();
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
			case VocabularyPackage.DICTIONARY__FIRST_WORD:
				setFirstWord((Word)newValue);
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
			case VocabularyPackage.DICTIONARY__FIRST_WORD:
				setFirstWord((Word)null);
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
			case VocabularyPackage.DICTIONARY__FIRST_WORD:
				return firstWord != null;
		}
		return super.eIsSet(featureID);
	}

} //DictionaryImpl
