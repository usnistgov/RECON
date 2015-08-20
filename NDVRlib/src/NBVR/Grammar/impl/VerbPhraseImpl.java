/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Modality;
import NBVR.Grammar.VerbPhrase;

import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocVerb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.VerbPhraseImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.VerbPhraseImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.VerbPhraseImpl#isNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerbPhraseImpl extends EObjectImpl implements VerbPhrase {
	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected VocVerb verb;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected static final Modality MODALITY_EDEFAULT = Modality.NONE;
	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Modality modality = MODALITY_EDEFAULT;
	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbPhraseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.VERB_PHRASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb getVerb() {
		if (verb != null && verb.eIsProxy()) {
			InternalEObject oldVerb = (InternalEObject)verb;
			verb = (VocVerb)eResolveProxy(oldVerb);
			if (verb != oldVerb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.VERB_PHRASE__VERB, oldVerb, verb));
			}
		}
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb basicGetVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VocVerb newVerb) {
		VocVerb oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.VERB_PHRASE__VERB, oldVerb, verb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Modality newModality) {
		Modality oldModality = modality;
		modality = newModality == null ? MODALITY_EDEFAULT : newModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.VERB_PHRASE__MODALITY, oldModality, modality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return (modality == Modality.NEGATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.VERB_PHRASE__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.VERB_PHRASE__VERB:
				if (resolve) return getVerb();
				return basicGetVerb();
			case GrammarPackage.VERB_PHRASE__MODALITY:
				return getModality();
			case GrammarPackage.VERB_PHRASE__NEGATED:
				return isNegated();
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
			case GrammarPackage.VERB_PHRASE__VERB:
				setVerb((VocVerb)newValue);
				return;
			case GrammarPackage.VERB_PHRASE__MODALITY:
				setModality((Modality)newValue);
				return;
			case GrammarPackage.VERB_PHRASE__NEGATED:
				setNegated((Boolean)newValue);
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
			case GrammarPackage.VERB_PHRASE__VERB:
				setVerb((VocVerb)null);
				return;
			case GrammarPackage.VERB_PHRASE__MODALITY:
				setModality(MODALITY_EDEFAULT);
				return;
			case GrammarPackage.VERB_PHRASE__NEGATED:
				setNegated(NEGATED_EDEFAULT);
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
			case GrammarPackage.VERB_PHRASE__VERB:
				return verb != null;
			case GrammarPackage.VERB_PHRASE__MODALITY:
				return modality != MODALITY_EDEFAULT;
			case GrammarPackage.VERB_PHRASE__NEGATED:
				return negated != NEGATED_EDEFAULT;
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
		result.append(" (modality: ");
		result.append(modality);
		result.append(", negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}


	/**
	 * @param position = the position of the role: 0 = subject, 1 = object
	 * @return the VerbRole that is in the given position for the canonical verb
	 * @generated not
	 */
	public VerbRole getVerbRole(int position)
	{
		return verb.getRoles().get(position);
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		log.println(sp + "(VerbPhrase "
				+ (verb == null ? "___" : verb.external())
				+ ' ' + modality.toString() + " )");
	}


} //VerbPhraseImpl
