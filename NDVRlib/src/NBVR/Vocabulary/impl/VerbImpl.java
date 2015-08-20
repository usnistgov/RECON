/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.Verb;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.WordForm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getSingular <em>Singular</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getPlural <em>Plural</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getPast <em>Past</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getProgressive <em>Progressive</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getPerfective <em>Perfective</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.VerbImpl#getAltPast <em>Alt Past</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerbImpl extends WordImpl implements Verb {
	/**
	 * The cached value of the '{@link #getSingular() <em>Singular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingular()
	 * @generated
	 * @ordered
	 */
	protected WordForm singular;

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
	 * The cached value of the '{@link #getPast() <em>Past</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPast()
	 * @generated
	 * @ordered
	 */
	protected WordForm past;

	/**
	 * The cached value of the '{@link #getProgressive() <em>Progressive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressive()
	 * @generated
	 * @ordered
	 */
	protected WordForm progressive;

	/**
	 * The cached value of the '{@link #getPerfective() <em>Perfective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfective()
	 * @generated
	 * @ordered
	 */
	protected WordForm perfective;

	/**
	 * The cached value of the '{@link #getAltPast() <em>Alt Past</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltPast()
	 * @generated
	 * @ordered
	 */
	protected WordForm altPast;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.VERB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getSingular() {
		if (singular != null && singular.eIsProxy()) {
			InternalEObject oldSingular = (InternalEObject)singular;
			singular = (WordForm)eResolveProxy(oldSingular);
			if (singular != oldSingular) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__SINGULAR, oldSingular, singular));
			}
		}
		return singular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetSingular() {
		return singular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingular(WordForm newSingular) {
		WordForm oldSingular = singular;
		singular = newSingular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__SINGULAR, oldSingular, singular));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__PLURAL, oldPlural, plural));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__PLURAL, oldPlural, plural));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getPast() {
		if (past != null && past.eIsProxy()) {
			InternalEObject oldPast = (InternalEObject)past;
			past = (WordForm)eResolveProxy(oldPast);
			if (past != oldPast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__PAST, oldPast, past));
			}
		}
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetPast() {
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPast(WordForm newPast) {
		WordForm oldPast = past;
		past = newPast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__PAST, oldPast, past));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getProgressive() {
		if (progressive != null && progressive.eIsProxy()) {
			InternalEObject oldProgressive = (InternalEObject)progressive;
			progressive = (WordForm)eResolveProxy(oldProgressive);
			if (progressive != oldProgressive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__PROGRESSIVE, oldProgressive, progressive));
			}
		}
		return progressive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetProgressive() {
		return progressive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressive(WordForm newProgressive) {
		WordForm oldProgressive = progressive;
		progressive = newProgressive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__PROGRESSIVE, oldProgressive, progressive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getPerfective() {
		if (perfective != null && perfective.eIsProxy()) {
			InternalEObject oldPerfective = (InternalEObject)perfective;
			perfective = (WordForm)eResolveProxy(oldPerfective);
			if (perfective != oldPerfective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__PERFECTIVE, oldPerfective, perfective));
			}
		}
		return perfective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetPerfective() {
		return perfective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerfective(WordForm newPerfective) {
		WordForm oldPerfective = perfective;
		perfective = newPerfective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__PERFECTIVE, oldPerfective, perfective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getAltPast() {
		if (altPast != null && altPast.eIsProxy()) {
			InternalEObject oldAltPast = (InternalEObject)altPast;
			altPast = (WordForm)eResolveProxy(oldAltPast);
			if (altPast != oldAltPast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.VERB__ALT_PAST, oldAltPast, altPast));
			}
		}
		return altPast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetAltPast() {
		return altPast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltPast(WordForm newAltPast) {
		WordForm oldAltPast = altPast;
		altPast = newAltPast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.VERB__ALT_PAST, oldAltPast, altPast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns true if the passed string is the progrssive form of the Verb
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isProgressive(String wf) {
		return progressive.getText().equals(wf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns true if the passed string is the/a past form of the Verb
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPast(String wf) {
		if (past.getText().equals(wf))
			return true;
		else if (altPast == null)
			return false;
		else
			return altPast.getText().equals(wf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns true if the passed string is the/a perfective form of the Verb
	 * the alternate past form is (always?) also an alternate perfective form
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isPerfective(String wf) {
		if (perfective.getText().equals(wf))
			return true;
		else if (altPast == null)
			return false;
		else
			return altPast.getText().equals(wf);
	}

	/** isVerb()
	 * returns true, overriding the method in WordImpl
	 * @return true if the Word is a Verb, else false
	 * @generated not
	 */
	@Override
	public boolean isVerb()
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
			case VocabularyPackage.VERB__SINGULAR:
				if (resolve) return getSingular();
				return basicGetSingular();
			case VocabularyPackage.VERB__PLURAL:
				if (resolve) return getPlural();
				return basicGetPlural();
			case VocabularyPackage.VERB__PAST:
				if (resolve) return getPast();
				return basicGetPast();
			case VocabularyPackage.VERB__PROGRESSIVE:
				if (resolve) return getProgressive();
				return basicGetProgressive();
			case VocabularyPackage.VERB__PERFECTIVE:
				if (resolve) return getPerfective();
				return basicGetPerfective();
			case VocabularyPackage.VERB__ALT_PAST:
				if (resolve) return getAltPast();
				return basicGetAltPast();
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
			case VocabularyPackage.VERB__SINGULAR:
				setSingular((WordForm)newValue);
				return;
			case VocabularyPackage.VERB__PLURAL:
				setPlural((WordForm)newValue);
				return;
			case VocabularyPackage.VERB__PAST:
				setPast((WordForm)newValue);
				return;
			case VocabularyPackage.VERB__PROGRESSIVE:
				setProgressive((WordForm)newValue);
				return;
			case VocabularyPackage.VERB__PERFECTIVE:
				setPerfective((WordForm)newValue);
				return;
			case VocabularyPackage.VERB__ALT_PAST:
				setAltPast((WordForm)newValue);
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
			case VocabularyPackage.VERB__SINGULAR:
				setSingular((WordForm)null);
				return;
			case VocabularyPackage.VERB__PLURAL:
				setPlural((WordForm)null);
				return;
			case VocabularyPackage.VERB__PAST:
				setPast((WordForm)null);
				return;
			case VocabularyPackage.VERB__PROGRESSIVE:
				setProgressive((WordForm)null);
				return;
			case VocabularyPackage.VERB__PERFECTIVE:
				setPerfective((WordForm)null);
				return;
			case VocabularyPackage.VERB__ALT_PAST:
				setAltPast((WordForm)null);
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
			case VocabularyPackage.VERB__SINGULAR:
				return singular != null;
			case VocabularyPackage.VERB__PLURAL:
				return plural != null;
			case VocabularyPackage.VERB__PAST:
				return past != null;
			case VocabularyPackage.VERB__PROGRESSIVE:
				return progressive != null;
			case VocabularyPackage.VERB__PERFECTIVE:
				return perfective != null;
			case VocabularyPackage.VERB__ALT_PAST:
				return altPast != null;
		}
		return super.eIsSet(featureID);
	}

} //VerbImpl
