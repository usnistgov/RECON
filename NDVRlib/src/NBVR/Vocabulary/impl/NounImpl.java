/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Noun;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.WordForm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.NounImpl#getPlural <em>Plural</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.NounImpl#getAltPlural <em>Alt Plural</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NounImpl extends WordImpl implements Noun {
	/**
	 * The cached value of the '{@link #getPlural() <em>Plural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlural()
	 * @generated
	 * @ordered
	 */
	protected WordForm plural;

	/**
	 * The cached value of the '{@link #getAltPlural() <em>Alt Plural</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPlural()
	 * @generated
	 * @ordered
	 */
	protected WordForm altPlural;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NounImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.NOUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getPlural() {
		if (plural != null && plural.eIsProxy()) {
			InternalEObject oldPlural = (InternalEObject)plural;
			plural = (WordForm)eResolveProxy(oldPlural);
			if (plural != oldPlural) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.NOUN__PLURAL, oldPlural, plural));
			}
		}
		return plural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetPlural() {
		return plural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlural(WordForm newPlural) {
		WordForm oldPlural = plural;
		plural = newPlural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.NOUN__PLURAL, oldPlural, plural));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getAltPlural() {
		if (altPlural != null && altPlural.eIsProxy()) {
			InternalEObject oldAltPlural = (InternalEObject)altPlural;
			altPlural = (WordForm)eResolveProxy(oldAltPlural);
			if (altPlural != oldAltPlural) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.NOUN__ALT_PLURAL, oldAltPlural, altPlural));
			}
		}
		return altPlural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetAltPlural() {
		return altPlural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltPlural(WordForm newAltPlural) {
		WordForm oldAltPlural = altPlural;
		altPlural = newAltPlural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.NOUN__ALT_PLURAL, oldAltPlural, altPlural));
	}

	/** isNoun()
	 * returns true, overriding the default method for Words
	 * @return true if the Word is a Noun, else false
	 * @generated not
	 */
	@Override
	public boolean isNoun()
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.NOUN__PLURAL:
				if (resolve) return getPlural();
				return basicGetPlural();
			case VocabularyPackage.NOUN__ALT_PLURAL:
				if (resolve) return getAltPlural();
				return basicGetAltPlural();
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
			case VocabularyPackage.NOUN__PLURAL:
				setPlural((WordForm)newValue);
				return;
			case VocabularyPackage.NOUN__ALT_PLURAL:
				setAltPlural((WordForm)newValue);
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
			case VocabularyPackage.NOUN__PLURAL:
				setPlural((WordForm)null);
				return;
			case VocabularyPackage.NOUN__ALT_PLURAL:
				setAltPlural((WordForm)null);
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
			case VocabularyPackage.NOUN__PLURAL:
				return plural != null;
			case VocabularyPackage.NOUN__ALT_PLURAL:
				return altPlural != null;
		}
		return super.eIsSet(featureID);
	}

} //NounImpl
