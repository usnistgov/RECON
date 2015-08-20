/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.PartPhrase;
import NBVR.Grammar.RolePhrase;

import NBVR.Vocabulary.Particle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.PartPhraseImpl#getPartRole <em>Part Role</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.PartPhraseImpl#getParticle <em>Particle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartPhraseImpl extends EObjectImpl implements PartPhrase {
	/**
	 * The cached value of the '{@link #getPartRole() <em>Part Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartRole()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase partRole;

	/**
	 * The cached value of the '{@link #getParticle() <em>Particle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticle()
	 * @generated
	 * @ordered
	 */
	protected Particle particle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartPhraseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.PART_PHRASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getPartRole() {
		if (partRole != null && partRole.eIsProxy()) {
			InternalEObject oldPartRole = (InternalEObject)partRole;
			partRole = (RolePhrase)eResolveProxy(oldPartRole);
			if (partRole != oldPartRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PART_PHRASE__PART_ROLE, oldPartRole, partRole));
			}
		}
		return partRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetPartRole() {
		return partRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartRole(RolePhrase newPartRole) {
		RolePhrase oldPartRole = partRole;
		partRole = newPartRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PART_PHRASE__PART_ROLE, oldPartRole, partRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Particle getParticle() {
		if (particle != null && particle.eIsProxy()) {
			InternalEObject oldParticle = (InternalEObject)particle;
			particle = (Particle)eResolveProxy(oldParticle);
			if (particle != oldParticle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.PART_PHRASE__PARTICLE, oldParticle, particle));
			}
		}
		return particle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Particle basicGetParticle() {
		return particle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticle(Particle newParticle) {
		Particle oldParticle = particle;
		particle = newParticle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.PART_PHRASE__PARTICLE, oldParticle, particle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.PART_PHRASE__PART_ROLE:
				if (resolve) return getPartRole();
				return basicGetPartRole();
			case GrammarPackage.PART_PHRASE__PARTICLE:
				if (resolve) return getParticle();
				return basicGetParticle();
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
			case GrammarPackage.PART_PHRASE__PART_ROLE:
				setPartRole((RolePhrase)newValue);
				return;
			case GrammarPackage.PART_PHRASE__PARTICLE:
				setParticle((Particle)newValue);
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
			case GrammarPackage.PART_PHRASE__PART_ROLE:
				setPartRole((RolePhrase)null);
				return;
			case GrammarPackage.PART_PHRASE__PARTICLE:
				setParticle((Particle)null);
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
			case GrammarPackage.PART_PHRASE__PART_ROLE:
				return partRole != null;
			case GrammarPackage.PART_PHRASE__PARTICLE:
				return particle != null;
		}
		return super.eIsSet(featureID);
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		if (partRole == null) {
			String sp = GrammarFactoryImpl.spaces(offset);
			log.println(sp + "(PartPhrase "
					+ (particle == null ? "___" : '"' + particle.getTerm().toString() + '"')
					+ ')');
			
		} else {
			partRole.print(offset, log);
		}
	}
	
} //PartPhraseImpl
