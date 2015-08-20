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
 * A representation of the literals of the enumeration '<em><b>Phrase Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage#getPhraseType()
 * @model
 * @generated
 */
public enum PhraseType implements Enumerator {
	/**
	 * The '<em><b>Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(0, "Instance", "Instance"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(1, "Group", "Group"), /**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(2, "Query", "Query"), /**
	 * The '<em><b>Type Noun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_NOUN_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE_NOUN(3, "TypeNoun", "TypeNoun"), /**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(4, "Property", "Property"), /**
	 * The '<em><b>Role Noun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_NOUN_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_NOUN(5, "RoleNoun", "RoleNoun"), /**
	 * The '<em><b>Pronoun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRONOUN_VALUE
	 * @generated
	 * @ordered
	 */
	PRONOUN(6, "Pronoun", "Pronoun"), /**
	 * The '<em><b>Anaphor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAPHOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANAPHOR(7, "Anaphor", "Anaphor"), /**
	 * The '<em><b>Interrogative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERROGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERROGATIVE(8, "Interrogative", "Interrogative"), /**
	 * The '<em><b>Local Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_NAME(9, "LocalName", "LocalName");

	/**
	 * The '<em><b>Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANCE
	 * @model name="Instance"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 0;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @model name="Group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 1;

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model name="Query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 2;

	/**
	 * The '<em><b>Type Noun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Type Noun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE_NOUN
	 * @model name="TypeNoun"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_NOUN_VALUE = 3;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 4;

	/**
	 * The '<em><b>Role Noun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Role Noun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE_NOUN
	 * @model name="RoleNoun"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_NOUN_VALUE = 5;

	/**
	 * The '<em><b>Pronoun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pronoun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRONOUN
	 * @model name="Pronoun"
	 * @generated
	 * @ordered
	 */
	public static final int PRONOUN_VALUE = 6;

	/**
	 * The '<em><b>Anaphor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anaphor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANAPHOR
	 * @model name="Anaphor"
	 * @generated
	 * @ordered
	 */
	public static final int ANAPHOR_VALUE = 7;

	/**
	 * The '<em><b>Interrogative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interrogative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERROGATIVE
	 * @model name="Interrogative"
	 * @generated
	 * @ordered
	 */
	public static final int INTERROGATIVE_VALUE = 8;

	/**
	 * The '<em><b>Local Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_NAME
	 * @model name="LocalName"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_NAME_VALUE = 9;

	/**
	 * An array of all the '<em><b>Phrase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhraseType[] VALUES_ARRAY =
		new PhraseType[] {
			INSTANCE,
			GROUP,
			QUERY,
			TYPE_NOUN,
			PROPERTY,
			ROLE_NOUN,
			PRONOUN,
			ANAPHOR,
			INTERROGATIVE,
			LOCAL_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Phrase Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhraseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phrase Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhraseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhraseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phrase Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhraseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhraseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phrase Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhraseType get(int value) {
		switch (value) {
			case INSTANCE_VALUE: return INSTANCE;
			case GROUP_VALUE: return GROUP;
			case QUERY_VALUE: return QUERY;
			case TYPE_NOUN_VALUE: return TYPE_NOUN;
			case PROPERTY_VALUE: return PROPERTY;
			case ROLE_NOUN_VALUE: return ROLE_NOUN;
			case PRONOUN_VALUE: return PRONOUN;
			case ANAPHOR_VALUE: return ANAPHOR;
			case INTERROGATIVE_VALUE: return INTERROGATIVE;
			case LOCAL_NAME_VALUE: return LOCAL_NAME;
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
	private PhraseType(int value, String name, String literal) {
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
	
} //PhraseType
