/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.GroupKind;
import NBVR.Grammar.GroupPhrase;
import NBVR.Grammar.PhraseType;
import NBVR.Grammar.SimpleNounPhrase;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.GroupPhraseImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.GroupPhraseImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupPhraseImpl extends RolePhraseImpl implements GroupPhrase {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleNounPhrase> members;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final GroupKind KIND_EDEFAULT = GroupKind.JOINT;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GroupKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupPhraseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.GROUP_PHRASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleNounPhrase> getMembers() {
		if (members == null) {
			members = new EObjectResolvingEList<SimpleNounPhrase>(SimpleNounPhrase.class, this, GrammarPackage.GROUP_PHRASE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(GroupKind newKind) {
		GroupKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GROUP_PHRASE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.GROUP_PHRASE__MEMBERS:
				return getMembers();
			case GrammarPackage.GROUP_PHRASE__KIND:
				return getKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrammarPackage.GROUP_PHRASE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends SimpleNounPhrase>)newValue);
				return;
			case GrammarPackage.GROUP_PHRASE__KIND:
				setKind((GroupKind)newValue);
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
			case GrammarPackage.GROUP_PHRASE__MEMBERS:
				getMembers().clear();
				return;
			case GrammarPackage.GROUP_PHRASE__KIND:
				setKind(KIND_EDEFAULT);
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
			case GrammarPackage.GROUP_PHRASE__MEMBERS:
				return members != null && !members.isEmpty();
			case GrammarPackage.GROUP_PHRASE__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

	/* Add-ons */
	
	/**
	 * <!-- begin-user-doc -->
	 * return the category of ParseElement: GroupPhrase
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ElementKind getElementKind() {
		return ElementKind.GROUP;
	}
	
	/**
	 * return the grammatical type of the RolePhrase
	 * overrides the failure response from RolePrase
	 * @generated not
	 */
	@Override
	public PhraseType getType() 	{
		return PhraseType.GROUP;
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
		log.print(sp + "  (GroupPhrase ");
		log.println((kind == null ? "___" : '"' + kind.toString() + '"'));
		log.println(sp + "    (members");
		if (members != null) {
		  Iterator<SimpleNounPhrase> it = members.iterator();
		  while (it.hasNext()) it.next().print(offset + 6, log);
		}
		log.println(sp + "    )");
		log.println(sp + "))");
	}

} //GroupPhraseImpl
