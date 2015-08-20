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
 * A representation of the literals of the enumeration '<em><b>Question Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage#getQuestionKind()
 * @model
 * @generated
 */
public enum QuestionKind implements Enumerator {
	/**
	 * The '<em><b>Whether</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHETHER_VALUE
	 * @generated
	 * @ordered
	 */
	WHETHER(0, "Whether", "Whether"),

	/**
	 * The '<em><b>Why</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHY_VALUE
	 * @generated
	 * @ordered
	 */
	WHY(1, "Why", "Why"),

	/**
	 * The '<em><b>How</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOW_VALUE
	 * @generated
	 * @ordered
	 */
	HOW(2, "How", "How");

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
	public static final int WHETHER_VALUE = 0;

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
	public static final int WHY_VALUE = 1;

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
	public static final int HOW_VALUE = 2;

	/**
	 * An array of all the '<em><b>Question Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionKind[] VALUES_ARRAY =
		new QuestionKind[] {
			WHETHER,
			WHY,
			HOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Question Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuestionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Question Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionKind get(int value) {
		switch (value) {
			case WHETHER_VALUE: return WHETHER;
			case WHY_VALUE: return WHY;
			case HOW_VALUE: return HOW;
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
	private QuestionKind(int value, String name, String literal) {
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
	
} //QuestionKind
