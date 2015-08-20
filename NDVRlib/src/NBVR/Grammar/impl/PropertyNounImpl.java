/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import java.util.Iterator;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Modifier;
import NBVR.Grammar.PropertyNoun;
import NBVR.Grammar.PhraseType;

import NBVR.Grammar.SimpleNounPhrase;
import NBVR.Grammar.TypeNoun;
import NBVR.Vocabulary.VocProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Noun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.PropertyNounImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.PropertyNounImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.PropertyNounImpl#getExpansion <em>Expansion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyNounImpl extends ModifiedTermImpl implements PropertyNoun {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected VocProperty property;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected SimpleNounPhrase domain;

	/**
	 * The cached value of the '{@link #getExpansion() <em>Expansion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansion()
	 * @generated
	 * @ordered
	 */
	protected TypeNoun expansion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyNounImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.PROPERTY_NOUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNounPhrase getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (SimpleNounPhrase)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PROPERTY_NOUN__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNounPhrase basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(SimpleNounPhrase newDomain) {
		SimpleNounPhrase oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PROPERTY_NOUN__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNoun getExpansion() {
		if (expansion != null && expansion.eIsProxy()) {
			InternalEObject oldExpansion = (InternalEObject)expansion;
			expansion = (TypeNoun)eResolveProxy(oldExpansion);
			if (expansion != oldExpansion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PROPERTY_NOUN__EXPANSION, oldExpansion, expansion));
			}
		}
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNoun basicGetExpansion() {
		return expansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpansion(TypeNoun newExpansion) {
		TypeNoun oldExpansion = expansion;
		expansion = newExpansion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PROPERTY_NOUN__EXPANSION, oldExpansion, expansion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (VocProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PROPERTY_NOUN__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(VocProperty newProperty) {
		VocProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PROPERTY_NOUN__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.PROPERTY_NOUN__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case GrammarPackage.PROPERTY_NOUN__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case GrammarPackage.PROPERTY_NOUN__EXPANSION:
				if (resolve) return getExpansion();
				return basicGetExpansion();
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
			case GrammarPackage.PROPERTY_NOUN__PROPERTY:
				setProperty((VocProperty)newValue);
				return;
			case GrammarPackage.PROPERTY_NOUN__DOMAIN:
				setDomain((SimpleNounPhrase)newValue);
				return;
			case GrammarPackage.PROPERTY_NOUN__EXPANSION:
				setExpansion((TypeNoun)newValue);
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
			case GrammarPackage.PROPERTY_NOUN__PROPERTY:
				setProperty((VocProperty)null);
				return;
			case GrammarPackage.PROPERTY_NOUN__DOMAIN:
				setDomain((SimpleNounPhrase)null);
				return;
			case GrammarPackage.PROPERTY_NOUN__EXPANSION:
				setExpansion((TypeNoun)null);
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
			case GrammarPackage.PROPERTY_NOUN__PROPERTY:
				return property != null;
			case GrammarPackage.PROPERTY_NOUN__DOMAIN:
				return domain != null;
			case GrammarPackage.PROPERTY_NOUN__EXPANSION:
				return expansion != null;
		}
		return super.eIsSet(featureID);
	}

	/* Add-ons */
	
	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: PropertyNoun
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() 
	{
		/* if the Property is just a reference,
		 * return the type of the referent */
		if (referent != null) return referent.getElementKind();

		return ElementKind.PROPERTY;
	}
	
	/**
	 * return the grammatical type of the RolePhrase
	 * overrides the failure response from RolePrase
	 * @generated not
	 */
	@Override
	public PhraseType getType()
	{
		/* if the Property is just a reference,
		 * return the type of the referent */
		if (referent != null) return referent.getType();
		
		/* otherwise, return PROPERTY */
		return PhraseType.PROPERTY;
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
		log.println(sp + "  (PropertyNoun " + 
				(property == null ? "___" : property.external()));
		if (referent != null) {
			log.println(sp + "   (referent " + 
					((RolePhraseImpl)referent).local_id + ")");
		} else if (expansion != null) {
			log.println(sp + "   (expansion");
			expansion.print(offset + 6, log);
			log.println(sp + "    )");
		} else {
			if (quantifier == null) log.println(sp + "    (Quantifier )");
			else quantifier.print(offset + 4, log);
			log.print(sp + "    (modifiers ");
			if (modifiers != null) {
				Iterator<Modifier> it = modifiers.iterator();
				while (it.hasNext()) it.next().print(offset + 6, log);
			}
			log.println(')');
			if (domain == null) log.println(sp + "    ___");
			else domain.print(offset + 4, log);
		}
		log.println(sp + "))");
	}

} //PropertyNounImpl
