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
import NBVR.Grammar.PhraseType;
import NBVR.Grammar.RolePhrase;

import NBVR.Logic.Variable;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.impl.FormulationFormImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.RolePhraseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.RolePhraseImpl#getRolePlayed <em>Role Played</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.RolePhraseImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.RolePhraseImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RolePhraseImpl extends FormulationFormImpl implements RolePhrase {
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
	 * The cached value of the '{@link #getRolePlayed() <em>Role Played</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePlayed()
	 * @generated
	 * @ordered
	 */
	protected VerbRole rolePlayed;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase referent;
	
	/**
	 * A local identifier for the role phrase, generated on construction
	 * @generated not
	 */
	protected int local_id;
	
	/** 
	 * The last used value for a local identifier
	 * @generated not
	 */
	protected static int local_id_base = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected RolePhraseImpl() {
		super();
		local_id = ++local_id_base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.ROLE_PHRASE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.ROLE_PHRASE__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ROLE_PHRASE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole getRolePlayed() {
		if (rolePlayed != null && rolePlayed.eIsProxy()) {
			InternalEObject oldRolePlayed = (InternalEObject)rolePlayed;
			rolePlayed = (VerbRole)eResolveProxy(oldRolePlayed);
			if (rolePlayed != oldRolePlayed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.ROLE_PHRASE__ROLE_PLAYED, oldRolePlayed, rolePlayed));
			}
		}
		return rolePlayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole basicGetRolePlayed() {
		return rolePlayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePlayed(VerbRole newRolePlayed) {
		VerbRole oldRolePlayed = rolePlayed;
		rolePlayed = newRolePlayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ROLE_PHRASE__ROLE_PLAYED, oldRolePlayed, rolePlayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.ROLE_PHRASE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ROLE_PHRASE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getReferent() {
		if (referent != null && referent.eIsProxy()) {
			InternalEObject oldReferent = (InternalEObject)referent;
			referent = (RolePhrase)eResolveProxy(oldReferent);
			if (referent != oldReferent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.ROLE_PHRASE__REFERENT, oldReferent, referent));
			}
		}
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetReferent() {
		return referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferent(RolePhrase newReferent) {
		RolePhrase oldReferent = referent;
		referent = newReferent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.ROLE_PHRASE__REFERENT, oldReferent, referent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: RolePhrase
	 * Note: most RolePhrase subclasses override this
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ElementKind getElementKind() {
		return ElementKind.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * method returns True if the Element is a kind of Sentence, else false
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isSentence() {
		return false;
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
		return true;
	}


	/**
	 * <!-- begin-user-doc -->
	 * method returns the kind of RolePhrase
	 * this is a dummy: every subclass of RolePhrase overrides it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public PhraseType getType() {
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
			case GrammarPackage.ROLE_PHRASE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case GrammarPackage.ROLE_PHRASE__ROLE_PLAYED:
				if (resolve) return getRolePlayed();
				return basicGetRolePlayed();
			case GrammarPackage.ROLE_PHRASE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case GrammarPackage.ROLE_PHRASE__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
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
			case GrammarPackage.ROLE_PHRASE__PARENT:
				setParent((ParseElement)newValue);
				return;
			case GrammarPackage.ROLE_PHRASE__ROLE_PLAYED:
				setRolePlayed((VerbRole)newValue);
				return;
			case GrammarPackage.ROLE_PHRASE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case GrammarPackage.ROLE_PHRASE__REFERENT:
				setReferent((RolePhrase)newValue);
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
			case GrammarPackage.ROLE_PHRASE__PARENT:
				setParent((ParseElement)null);
				return;
			case GrammarPackage.ROLE_PHRASE__ROLE_PLAYED:
				setRolePlayed((VerbRole)null);
				return;
			case GrammarPackage.ROLE_PHRASE__VARIABLE:
				setVariable((Variable)null);
				return;
			case GrammarPackage.ROLE_PHRASE__REFERENT:
				setReferent((RolePhrase)null);
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
			case GrammarPackage.ROLE_PHRASE__PARENT:
				return parent != null;
			case GrammarPackage.ROLE_PHRASE__ROLE_PLAYED:
				return rolePlayed != null;
			case GrammarPackage.ROLE_PHRASE__VARIABLE:
				return variable != null;
			case GrammarPackage.ROLE_PHRASE__REFERENT:
				return referent != null;
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
				case GrammarPackage.ROLE_PHRASE__PARENT: return GrammarPackage.PARSE_ELEMENT__PARENT;
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
				case GrammarPackage.PARSE_ELEMENT__PARENT: return GrammarPackage.ROLE_PHRASE__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RolePhraseImpl
