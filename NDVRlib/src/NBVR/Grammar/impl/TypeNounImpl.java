/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Modifier;
import NBVR.Grammar.Qualifier;
import NBVR.Grammar.PhraseType;
import NBVR.Grammar.TypeNoun;

import NBVR.Vocabulary.VocNoun;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Noun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.TypeNounImpl#getNoun <em>Noun</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeNounImpl extends ModifiedTermImpl implements TypeNoun {
	/**
	 * The cached value of the '{@link #getNoun() <em>Noun</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoun()
	 * @generated
	 * @ordered
	 */
	protected VocNoun noun;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeNounImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.TYPE_NOUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun getNoun() {
		if (noun != null && noun.eIsProxy()) {
			InternalEObject oldNoun = (InternalEObject)noun;
			noun = (VocNoun)eResolveProxy(oldNoun);
			if (noun != oldNoun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.TYPE_NOUN__NOUN, oldNoun, noun));
			}
		}
		return noun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun basicGetNoun() {
		return noun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoun(VocNoun newNoun) {
		VocNoun oldNoun = noun;
		noun = newNoun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TYPE_NOUN__NOUN, oldNoun, noun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.TYPE_NOUN__NOUN:
				if (resolve) return getNoun();
				return basicGetNoun();
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
			case GrammarPackage.TYPE_NOUN__NOUN:
				setNoun((VocNoun)newValue);
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
			case GrammarPackage.TYPE_NOUN__NOUN:
				setNoun((VocNoun)null);
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
			case GrammarPackage.TYPE_NOUN__NOUN:
				return noun != null;
		}
		return super.eIsSet(featureID);
	}

	/* Add-ons */
	
	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: TypeNoun
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.NOUN;
	}
	
	/**
	 * return the grammatical type of the RolePhrase
	 * overrides the failure response from RolePrase
	 * @generated not
	 */
	@Override
	public PhraseType getType() {
		return PhraseType.TYPE_NOUN;
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
		log.println(sp + "  (TypeNoun " + 
				(noun == null ? "___" : noun.external()) );
		if (referent != null) {
			log.println(sp + "   (referent " + 
					((RolePhraseImpl)referent).local_id + ")");
		} else {
			if (quantifier == null) log.println(sp + "    (Quantifier )");
			else quantifier.print(offset + 4, log);
			
			log.print(sp + "    (modifiers ");
			if (modifiers != null) {
				Iterator<Modifier> it = modifiers.iterator();
				while (it.hasNext()) it.next().print(offset + 6, log);
			}
			log.println(')');
	
			log.print(sp + "    (qualifiers ");
			if (qualifiers != null && ! qualifiers.isEmpty()) {
				log.println();
				Iterator<Qualifier> it = qualifiers.iterator();
				while (it.hasNext()) it.next().print(offset + 6, log);
				log.print(sp + "    ");
			}
			log.println(')');
		}		
		log.println(sp + "))");
	}


} //TypeNounImpl
