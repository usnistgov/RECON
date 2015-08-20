/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.QueryKind;
import NBVR.Grammar.QueryPhrase;
import NBVR.Grammar.InstanceKind;
import NBVR.Grammar.Question;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Grammar.impl.QuestionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link NBVR.Grammar.impl.QuestionImpl#getQueryPhrase <em>Query Phrase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends NominalizationImpl implements Question {
	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final QueryKind QUERY_EDEFAULT = QueryKind.ANY;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected QueryKind query = QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueryPhrase() <em>Query Phrase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryPhrase()
	 * @generated
	 * @ordered
	 */
	protected QueryPhrase queryPhrase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryKind getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(QueryKind newQuery) {
		QueryKind oldQuery = query;
		query = newQuery == null ? QUERY_EDEFAULT : newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.QUESTION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPhrase getQueryPhrase() {
		if (queryPhrase != null && queryPhrase.eIsProxy()) {
			InternalEObject oldQueryPhrase = (InternalEObject)queryPhrase;
			queryPhrase = (QueryPhrase)eResolveProxy(oldQueryPhrase);
			if (queryPhrase != oldQueryPhrase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrammarPackage.QUESTION__QUERY_PHRASE, oldQueryPhrase, queryPhrase));
			}
		}
		return queryPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPhrase basicGetQueryPhrase() {
		return queryPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryPhrase(QueryPhrase newQueryPhrase, NotificationChain msgs) {
		QueryPhrase oldQueryPhrase = queryPhrase;
		queryPhrase = newQueryPhrase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GrammarPackage.QUESTION__QUERY_PHRASE, oldQueryPhrase, newQueryPhrase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryPhrase(QueryPhrase newQueryPhrase) {
		if (newQueryPhrase != queryPhrase) {
			NotificationChain msgs = null;
			if (queryPhrase != null)
				msgs = ((InternalEObject)queryPhrase).eInverseRemove(this, GrammarPackage.QUERY_PHRASE__QUESTION, QueryPhrase.class, msgs);
			if (newQueryPhrase != null)
				msgs = ((InternalEObject)newQueryPhrase).eInverseAdd(this, GrammarPackage.QUERY_PHRASE__QUESTION, QueryPhrase.class, msgs);
			msgs = basicSetQueryPhrase(newQueryPhrase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.QUESTION__QUERY_PHRASE, newQueryPhrase, newQueryPhrase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				if (queryPhrase != null)
					msgs = ((InternalEObject)queryPhrase).eInverseRemove(this, GrammarPackage.QUERY_PHRASE__QUESTION, QueryPhrase.class, msgs);
				return basicSetQueryPhrase((QueryPhrase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				return basicSetQueryPhrase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * return the nature of this Instance, i.e. Question
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public InstanceKind getKind()
	{
		return InstanceKind.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.QUESTION__QUERY:
				return getQuery();
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				if (resolve) return getQueryPhrase();
				return basicGetQueryPhrase();
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
			case GrammarPackage.QUESTION__QUERY:
				setQuery((QueryKind)newValue);
				return;
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				setQueryPhrase((QueryPhrase)newValue);
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
			case GrammarPackage.QUESTION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				setQueryPhrase((QueryPhrase)null);
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
			case GrammarPackage.QUESTION__QUERY:
				return query != QUERY_EDEFAULT;
			case GrammarPackage.QUESTION__QUERY_PHRASE:
				return queryPhrase != null;
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
		result.append(" (query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		if (sentence == null) {
			log.print("(Question " + query.toString() + " ___");
		} else {
			String sp = GrammarFactoryImpl.spaces(offset);
			log.println(sp + "(Question " + query.toString());
			getSentence().print(offset + 2, log);
			log.println(sp + ")");
		}
	}

} //QuestionImpl
