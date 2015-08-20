/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Instance;
import NBVR.Grammar.InstanceKind;
import NBVR.Grammar.PhraseType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class InstanceImpl extends SimpleNounPhraseImpl implements Instance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}
	
	/**
	 * return the grammatical type of the RolePhrase
	 * overrides the failure response from RolePrase
	 * @generated not
	 */
	@Override
	public PhraseType getType()
	{
		return PhraseType.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: Instance
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * method returns True if the Element is a kind of Instance, else false
	 * general method returns False, Instance classes override it
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public boolean isInstance() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public InstanceKind getKind() {
		return null; //fake, every subtype overrides
	}

} //InstanceImpl
