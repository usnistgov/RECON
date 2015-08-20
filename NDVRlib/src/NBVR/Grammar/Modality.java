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
 * A representation of the literals of the enumeration '<em><b>Modality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage#getModality()
 * @model
 * @generated
 */
public enum Modality implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Negation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATION_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATION(1, "Negation", "Negation"), /**
	 * The '<em><b>Obligation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGATION(2, "Obligation", "Obligation"),

	/**
	 * The '<em><b>Prohibition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROHIBITION_VALUE
	 * @generated
	 * @ordered
	 */
	PROHIBITION(3, "Prohibition", "Prohibition"),

	/**
	 * The '<em><b>Permission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	PERMISSION(4, "Permission", "Permission"), /**
	 * The '<em><b>Permitted Not</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMITTED_NOT_VALUE
	 * @generated
	 * @ordered
	 */
	PERMITTED_NOT(5, "PermittedNot", "PermittedNot"), /**
	 * The '<em><b>Possibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	POSSIBILITY(6, "Possibility", "Possibility"), /**
	 * The '<em><b>Impossibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPOSSIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	IMPOSSIBILITY(7, "Impossibility", "Impossibility"), /**
	 * The '<em><b>Preference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCE(8, "Preference", "Preference"), /**
	 * The '<em><b>Antipreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIPREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTIPREFERENCE(9, "Antipreference", "Antipreference"), /**
	 * The '<em><b>Nonpreference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONPREFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	NONPREFERENCE(10, "Nonpreference", "Nonpreference");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Negation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATION
	 * @model name="Negation"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATION_VALUE = 1;

	/**
	 * The '<em><b>Obligation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obligation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is required that P is true.
	 * Not (Obligation (that p)) is (Permission (that (not p)))
	 * <!-- end-model-doc -->
	 * @see #OBLIGATION
	 * @model name="Obligation"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATION_VALUE = 2;

	/**
	 * The '<em><b>Prohibition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prohibition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is required that p is false.  Or: that (not p) is true.
	 * 
	 * Not (Prohibition (that p)) is (Permission (that p))
	 * <!-- end-model-doc -->
	 * @see #PROHIBITION
	 * @model name="Prohibition"
	 * @generated
	 * @ordered
	 */
	public static final int PROHIBITION_VALUE = 3;

	/**
	 * The '<em><b>Permission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permission</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is permitted that p is true.
	 * 
	 * Not (Permission (that p)) is (Prohibition (that p))
	 * <!-- end-model-doc -->
	 * @see #PERMISSION
	 * @model name="Permission"
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_VALUE = 4;

	/**
	 * The '<em><b>Permitted Not</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Permitted Not</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is permitted that p is false.  Or: that (not p) is true.
	 * 
	 * Not (Permission (that (not p)) is (Obligation  (that p))
	 * <!-- end-model-doc -->
	 * @see #PERMITTED_NOT
	 * @model name="PermittedNot"
	 * @generated
	 * @ordered
	 */
	public static final int PERMITTED_NOT_VALUE = 5;

	/**
	 * The '<em><b>Possibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Possibility</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSSIBILITY
	 * @model name="Possibility"
	 * @generated
	 * @ordered
	 */
	public static final int POSSIBILITY_VALUE = 6;

	/**
	 * The '<em><b>Impossibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impossibility</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPOSSIBILITY
	 * @model name="Impossibility"
	 * @generated
	 * @ordered
	 */
	public static final int IMPOSSIBILITY_VALUE = 7;

	/**
	 * The '<em><b>Preference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is preferred that p is true.
	 * <!-- end-model-doc -->
	 * @see #PREFERENCE
	 * @model name="Preference"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_VALUE = 8;

	/**
	 * The '<em><b>Antipreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Antipreference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is preferred that p is false.  Or: that (not p) is true.
	 * <!-- end-model-doc -->
	 * @see #ANTIPREFERENCE
	 * @model name="Antipreference"
	 * @generated
	 * @ordered
	 */
	public static final int ANTIPREFERENCE_VALUE = 9;

	/**
	 * The '<em><b>Nonpreference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nonpreference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONPREFERENCE
	 * @model name="Nonpreference"
	 * @generated
	 * @ordered
	 */
	public static final int NONPREFERENCE_VALUE = 10;

	/**
	 * An array of all the '<em><b>Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Modality[] VALUES_ARRAY =
		new Modality[] {
			NONE,
			NEGATION,
			OBLIGATION,
			PROHIBITION,
			PERMISSION,
			PERMITTED_NOT,
			POSSIBILITY,
			IMPOSSIBILITY,
			PREFERENCE,
			ANTIPREFERENCE,
			NONPREFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Modality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Modality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Modality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Modality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modality get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case NEGATION_VALUE: return NEGATION;
			case OBLIGATION_VALUE: return OBLIGATION;
			case PROHIBITION_VALUE: return PROHIBITION;
			case PERMISSION_VALUE: return PERMISSION;
			case PERMITTED_NOT_VALUE: return PERMITTED_NOT;
			case POSSIBILITY_VALUE: return POSSIBILITY;
			case IMPOSSIBILITY_VALUE: return IMPOSSIBILITY;
			case PREFERENCE_VALUE: return PREFERENCE;
			case ANTIPREFERENCE_VALUE: return ANTIPREFERENCE;
			case NONPREFERENCE_VALUE: return NONPREFERENCE;
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
	private Modality(int value, String name, String literal) {
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
	
} //Modality
