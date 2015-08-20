/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.Modality;
import NBVR.Grammar.PartPhrase;
import NBVR.Grammar.RolePhrase;
import NBVR.Grammar.SentenceType;
import NBVR.Grammar.SimpleForm;
import NBVR.Grammar.VerbPhrase;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.SimpleFormImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SimpleFormImpl#getPartPhrases <em>Part Phrases</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SimpleFormImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.SimpleFormImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleFormImpl extends SentenceImpl implements SimpleForm {
	/**
	 * The cached value of the '{@link #getVerb() <em>Verb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerb()
	 * @generated
	 * @ordered
	 */
	protected VerbPhrase verb;

	/**
	 * The cached value of the '{@link #getPartPhrases() <em>Part Phrases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartPhrases()
	 * @generated
	 * @ordered
	 */
	protected EList<PartPhrase> partPhrases;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase subject;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected RolePhrase object;
	
	/**
	 * the derived list of attached RolePhrases
	 * @generated not
	 */
	protected RolePhrase[] roles;
	
	/**
	 * the already processed marker
	 * @generated not
	 */
	protected boolean done;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.SIMPLE_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbPhrase getVerb() {
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerb(VerbPhrase newVerb, NotificationChain msgs) {
		VerbPhrase oldVerb = verb;
		verb = newVerb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_FORM__VERB, oldVerb, newVerb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerb(VerbPhrase newVerb) {
		if (newVerb != verb) {
			NotificationChain msgs = null;
			if (verb != null)
				msgs = ((InternalEObject)verb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GrammarPackage.SIMPLE_FORM__VERB, null, msgs);
			if (newVerb != null)
				msgs = ((InternalEObject)newVerb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GrammarPackage.SIMPLE_FORM__VERB, null, msgs);
			msgs = basicSetVerb(newVerb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_FORM__VERB, newVerb, newVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartPhrase> getPartPhrases() {
		if (partPhrases == null) {
			partPhrases = new EObjectContainmentEList<PartPhrase>(PartPhrase.class, this, GrammarPackage.SIMPLE_FORM__PART_PHRASES);
		}
		return partPhrases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (RolePhrase)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SIMPLE_FORM__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(RolePhrase newSubject) {
		RolePhrase oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_FORM__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (RolePhrase)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.SIMPLE_FORM__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePhrase basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(RolePhrase newObject) {
		RolePhrase oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.SIMPLE_FORM__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * proxy method, returns the modality property of the VerbPhrase
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Modality getModality() 
	{
		if (verb == null) return null;
		return verb.getModality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * proxy method, returns the negated property of the VerbPhrase
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isNegated() 
	{
		if (verb == null) return false;
		return verb.isNegated();
	}

	/** getType()
	 * return the type of Sentence this is
	 * @generated not
	 */
	public SentenceType getType()
	{
		return SentenceType.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.SIMPLE_FORM__VERB:
				return basicSetVerb(null, msgs);
			case GrammarPackage.SIMPLE_FORM__PART_PHRASES:
				return ((InternalEList<?>)getPartPhrases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.SIMPLE_FORM__VERB:
				return getVerb();
			case GrammarPackage.SIMPLE_FORM__PART_PHRASES:
				return getPartPhrases();
			case GrammarPackage.SIMPLE_FORM__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case GrammarPackage.SIMPLE_FORM__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
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
			case GrammarPackage.SIMPLE_FORM__VERB:
				setVerb((VerbPhrase)newValue);
				return;
			case GrammarPackage.SIMPLE_FORM__PART_PHRASES:
				getPartPhrases().clear();
				getPartPhrases().addAll((Collection<? extends PartPhrase>)newValue);
				return;
			case GrammarPackage.SIMPLE_FORM__SUBJECT:
				setSubject((RolePhrase)newValue);
				return;
			case GrammarPackage.SIMPLE_FORM__OBJECT:
				setObject((RolePhrase)newValue);
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
			case GrammarPackage.SIMPLE_FORM__VERB:
				setVerb((VerbPhrase)null);
				return;
			case GrammarPackage.SIMPLE_FORM__PART_PHRASES:
				getPartPhrases().clear();
				return;
			case GrammarPackage.SIMPLE_FORM__SUBJECT:
				setSubject((RolePhrase)null);
				return;
			case GrammarPackage.SIMPLE_FORM__OBJECT:
				setObject((RolePhrase)null);
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
			case GrammarPackage.SIMPLE_FORM__VERB:
				return verb != null;
			case GrammarPackage.SIMPLE_FORM__PART_PHRASES:
				return partPhrases != null && !partPhrases.isEmpty();
			case GrammarPackage.SIMPLE_FORM__SUBJECT:
				return subject != null;
			case GrammarPackage.SIMPLE_FORM__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}
	
	/* add-ons */
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		String sp = GrammarFactoryImpl.spaces(offset);
		String nesting = "";

		/* print the verb */
		if (verb == null) {
			log.println(sp + "(___ ");
		} else if (getModality() == Modality.NEGATION) {
			log.println(sp + "(NOT");
			nesting = "  "; offset += 2;
		} else if (getModality() != Modality.NONE) {
			log.println(sp + '(' + getModality().toString());
			nesting = "  "; offset += 2;
		}
		log.println(sp + nesting + "(" + verb.getVerb().external());

		/* print the roles */
		if (roles != null) {
			for (int r = 0; r < roles.length; ++r) {
				if (roles[r] == null) 
					log.println(sp + nesting + "  (rolePlayed (role " + r + ") ___)");
				else
					roles[r].print(offset + 2, log);
			}
		} else {
			if (subject == null) 
				log.println(sp + nesting + "(rolePlayed subject ___)");
			else 
				subject.print(offset + 2, log);
			if (object != null) object.print(offset + 2, log);
			if (partPhrases != null) {
				  Iterator<PartPhrase> it = partPhrases.iterator();
				  while (it.hasNext()) it.next().print(offset + 2, log);
			}
		}
		if (nesting != "")
			log.println(sp + "))");
		else
			log.println(sp + ')');
	}

	/** isDone()
	 * false until the SimpleForm has been processed in this phase, then true
	 * @generated not
	 */
	public boolean isDone()
	{
		return done;
	}

	/** setDone(isdone)
	 * 
	 * @param isdone = true if the SimpleForm has been processed, else false
	 * @generated not
	 */
	public void setDone(boolean isdone)
	{
		done = isdone;
	}

	/** makeRolesArray()
	 * make an array of all the RolePhrases
	 * the Subject, Object and Particle Roles
	 * @generated not
	 */
	public RolePhrase[] makeRolesArray()
	{
		/* if the array has been constructed, just return it */
		if (roles != null) return roles;
		
		/* otherwise, determine the size and create it */
		int partoffset = 1 + (object == null ? 0 : 1);
		roles = new RolePhrase[partoffset + getPartPhrases().size()];
		roles[0] = subject;
		if (object != null) roles[1] = object;
		if (getPartPhrases().isEmpty()) return roles;
		for (int p = 0; p < getPartPhrases().size(); ++p) {
			roles[p + partoffset] = getPartPhrases().get(p).getPartRole();
		}
		return roles;
	}

	/** copyRolesArray(SimpleForm)
	 * make a new roles array by copying the array of another SimpleForm
	 * @param source = the SimpleForm to be copied
	 * @return the roles array for this SimpleForm
	 * @generated not
	 */
	public RolePhrase[] copyRolesArray(SimpleForm source)
	{
		roles = new RolePhrase[source.getRoles().length];
		for (int index = 0; index < roles.length; ++index)
			roles[index] = source.getRole(index);

		return roles;
	}

	/** getRoles()
	 * @return the role phrase array
	 * @generated not
	 */	
	public RolePhrase[] getRoles()
	{
		if (roles == null) makeRolesArray();
		return roles;
	}

	/** getRole(index)
	 * @param index = the index of the role phrase to be returned
	 * @return the index-th role
	 * @generated not
	 */
	public RolePhrase getRole(int index)
	{
		if (roles == null) makeRolesArray();
		return roles[index];
	}

	/** setRole(index, role phrase)
	 * @param index = the index of the role phrase to be replaced
	 * @generated not
	 */
	public void setRole(int index, RolePhrase phrase)
	{
		roles[index] = phrase;
	}

} //SimpleFormImpl
