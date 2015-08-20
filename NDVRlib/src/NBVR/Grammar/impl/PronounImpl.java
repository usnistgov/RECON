/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Pronoun;
import NBVR.Grammar.PhraseType;
import NBVR.Vocabulary.Keyword;
import NBVR.Vocabulary.KeywordKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pronoun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.PronounImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PronounImpl extends ModifiedTermImpl implements Pronoun {
	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected Keyword keyword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PronounImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.PRONOUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword getKeyword() {
		if (keyword != null && keyword.eIsProxy()) {
			InternalEObject oldKeyword = (InternalEObject)keyword;
			keyword = (Keyword)eResolveProxy(oldKeyword);
			if (keyword != oldKeyword) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PRONOUN__KEYWORD, oldKeyword, keyword));
			}
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword basicGetKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(Keyword newKeyword) {
		Keyword oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PRONOUN__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.PRONOUN__KEYWORD:
				if (resolve) return getKeyword();
				return basicGetKeyword();
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
			case GrammarPackage.PRONOUN__KEYWORD:
				setKeyword((Keyword)newValue);
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
			case GrammarPackage.PRONOUN__KEYWORD:
				setKeyword((Keyword)null);
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
			case GrammarPackage.PRONOUN__KEYWORD:
				return keyword != null;
		}
		return super.eIsSet(featureID);
	}

	/* Add-ons */
	
	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: Pronoun
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.PRONOUN;
	}
	
	/**
	 * return the grammatical type of the RolePhrase
	 * overrides the failure response from RolePrase
	 * @return ANAPHOR for anaphor keywords, and PRONOUN otherwise
	 * @generated not
	 */
	@Override
	public PhraseType getType()
	{
		if (keyword != null) {
			KeywordKind k = keyword.getKind();
			if (k == KeywordKind.ANAPHOR || k == KeywordKind.KTHAT 
			 || k == KeywordKind.KWHOSE)
				return PhraseType.ANAPHOR;
		}
		return PhraseType.PRONOUN;
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		log.println(sp + "(rolePlayed " + local_id + " " +
				(rolePlayed == null ? "___" : rolePlayed.external()));
		log.print(sp + "  (Pronoun " + 
				(keyword == null ? "___" : keyword.external()) );
		if (referent == null) {
			log.println(" (referent ___) )");
		} else {
			log.println(" (referent " + 
					((RolePhraseImpl)referent).local_id + ") )");
		}
		log.println(sp + ')');
	}


} //PronounImpl
