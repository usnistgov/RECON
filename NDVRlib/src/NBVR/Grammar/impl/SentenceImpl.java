/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.ParseElement;
import NBVR.Grammar.RolePhrase;
import NBVR.Grammar.Sentence;

import NBVR.Grammar.SentenceType;
import NBVR.Vocabulary.impl.FormulationFormImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.SentenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SentenceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SentenceImpl#getRewrites <em>Rewrites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SentenceImpl extends FormulationFormImpl implements Sentence {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ParseElement parent;
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase domain;

	/**
	 * The cached value of the '{@link #getRewrites() <em>Rewrites</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewrites()
	 * @generated
	 * @ordered
	 */
	protected Sentence rewrites;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseElement getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ParseElement)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SENTENCE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParseElement basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ParseElement newParent) {
		ParseElement oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SENTENCE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (RolePhrase)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SENTENCE__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(RolePhrase newDomain) {
		RolePhrase oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SENTENCE__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence getRewrites() {
		if (rewrites != null && rewrites.eIsProxy()) {
			InternalEObject oldRewrites = (InternalEObject)rewrites;
			rewrites = (Sentence)eResolveProxy(oldRewrites);
			if (rewrites != oldRewrites) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SENTENCE__REWRITES, oldRewrites, rewrites));
			}
		}
		return rewrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence basicGetRewrites() {
		return rewrites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewrites(Sentence newRewrites) {
		Sentence oldRewrites = rewrites;
		rewrites = newRewrites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SENTENCE__REWRITES, oldRewrites, rewrites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: Sentence
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ElementKind getElementKind() {
		return ElementKind.SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * method returns True if the Element is a kind of Sentence, else false
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isSentence() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * method returns True if the Element is a kind of Instance, else false
	 * general method returns False, Instance classes override it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isInstance() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * method returns True if the Element is a kind of RolePhrase, else false
	 * general method returns False, RolePhrase classes override it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isRolePhrase() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * dummy routine to return the kind of Sentence
	 * each subtype of Sentence overrides it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public SentenceType getType() {
		return null;	// default
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.SENTENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GrammarPackage.SENTENCE__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case GrammarPackage.SENTENCE__REWRITES:
				if (resolve) return getRewrites();
				return basicGetRewrites();
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
			case GrammarPackage.SENTENCE__PARENT:
				setParent((ParseElement)newValue);
				return;
			case GrammarPackage.SENTENCE__DOMAIN:
				setDomain((RolePhrase)newValue);
				return;
			case GrammarPackage.SENTENCE__REWRITES:
				setRewrites((Sentence)newValue);
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
			case GrammarPackage.SENTENCE__PARENT:
				setParent((ParseElement)null);
				return;
			case GrammarPackage.SENTENCE__DOMAIN:
				setDomain((RolePhrase)null);
				return;
			case GrammarPackage.SENTENCE__REWRITES:
				setRewrites((Sentence)null);
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
			case GrammarPackage.SENTENCE__PARENT:
				return parent != null;
			case GrammarPackage.SENTENCE__DOMAIN:
				return domain != null;
			case GrammarPackage.SENTENCE__REWRITES:
				return rewrites != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParseElement.class) {
			switch (derivedFeatureID) {
				case GrammarPackage.SENTENCE__PARENT: return GrammarPackage.PARSE_ELEMENT__PARENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParseElement.class) {
			switch (baseFeatureID) {
				case GrammarPackage.PARSE_ELEMENT__PARENT: return GrammarPackage.SENTENCE__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * As a FormulationForm, a Sentence is always Structured
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isStructured() 
	{
		return true;
	}

} //SentenceImpl
