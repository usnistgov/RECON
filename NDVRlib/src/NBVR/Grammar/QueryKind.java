/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage#getQueryKind()
 * @model
 * @generated
 */
public enum QueryKind implements Enumerator {
	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "Any", "Any"), /**
	 * The '<em><b>What</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHAT_VALUE
	 * @generated
	 * @ordered
	 */
	WHAT(1, "What", "What"), /**
	 * The '<em><b>Whether</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHETHER_VALUE
	 * @generated
	 * @ordered
	 */
	WHETHER(2, "Whether", "Whether"), /**
	 * The '<em><b>Why</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHY_VALUE
	 * @generated
	 * @ordered
	 */
	WHY(3, "Why", "Why"), /**
	 * The '<em><b>How</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOW_VALUE
	 * @generated
	 * @ordered
	 */
	HOW(4, "How", "How"), /**
	 * The '<em><b>Where</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHERE_VALUE
	 * @generated
	 * @ordered
	 */
	WHERE(5, "Where", "Where"), /**
	 * The '<em><b>When</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN(6, "When", "When"), /**
	 * The '<em><b>How Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOW_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	HOW_MANY(7, "HowMany", "HowMany");

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QueryKind.Any is used only when the Intension is a reference to a classifier itself, without use of an interrogative.
	 * <!-- end-model-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>What</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>What</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHAT
	 * @model name="What"
	 * @generated
	 * @ordered
	 */
	public static final int WHAT_VALUE = 1;

	/**
	 * The '<em><b>Whether</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Whether</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHETHER
	 * @model name="Whether"
	 * @generated
	 * @ordered
	 */
	public static final int WHETHER_VALUE = 2;

	/**
	 * The '<em><b>Why</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why refers to an event or situation that is the cause of the event/situation identified by the EventConcept.
	 * <!-- end-model-doc -->
	 * @see #WHY
	 * @model name="Why"
	 * @generated
	 * @ordered
	 */
	public static final int WHY_VALUE = 3;

	/**
	 * The '<em><b>How</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How refers to a set of events or actions that detail the event or result in the situation identified by the EventConcept.
	 * <!-- end-model-doc -->
	 * @see #HOW
	 * @model name="How"
	 * @generated
	 * @ordered
	 */
	public static final int HOW_VALUE = 4;

	/**
	 * The '<em><b>Where</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Where</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHERE
	 * @model name="Where"
	 * @generated
	 * @ordered
	 */
	public static final int WHERE_VALUE = 5;

	/**
	 * The '<em><b>When</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>When</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEN
	 * @model name="When"
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_VALUE = 6;

	/**
	 * The '<em><b>How Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>How Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOW_MANY
	 * @model name="HowMany"
	 * @generated
	 * @ordered
	 */
	public static final int HOW_MANY_VALUE = 7;

	/**
	 * An array of all the '<em><b>Query Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueryKind[] VALUES_ARRAY =
		new QueryKind[] {
			ANY,
			WHAT,
			WHETHER,
			WHY,
			HOW,
			WHERE,
			WHEN,
			HOW_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Query Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueryKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Query Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryKind get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case WHAT_VALUE: return WHAT;
			case WHETHER_VALUE: return WHETHER;
			case WHY_VALUE: return WHY;
			case HOW_VALUE: return HOW;
			case WHERE_VALUE: return WHERE;
			case WHEN_VALUE: return WHEN;
			case HOW_MANY_VALUE: return HOW_MANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QueryKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //QueryKind
