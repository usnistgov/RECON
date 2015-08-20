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
 * A representation of the literals of the enumeration '<em><b>Quantifier Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage#getQuantifierKind()
 * @model
 * @generated
 */
public enum QuantifierKind implements Enumerator {
	/**
	 * The '<em><b>QAn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QAN_VALUE
	 * @generated
	 * @ordered
	 */
	QAN(0, "Q_An", "Q_An"),

	/**
	 * The '<em><b>QThe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QTHE_VALUE
	 * @generated
	 * @ordered
	 */
	QTHE(1, "Q_The", "Q_The"),

	/**
	 * The '<em><b>QAll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QALL_VALUE
	 * @generated
	 * @ordered
	 */
	QALL(2, "Q_All", "Q_All"), /**
	 * The '<em><b>QNo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNO_VALUE
	 * @generated
	 * @ordered
	 */
	QNO(3, "Q_No", "Q_No"),

	/**
	 * The '<em><b>QAny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QANY_VALUE
	 * @generated
	 * @ordered
	 */
	QANY(4, "Q_Any", "Q_Any"), /**
	 * The '<em><b>At Least1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST1_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST1(5, "AtLeast1", "AtLeast1"), /**
	 * The '<em><b>At Most1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST1_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST1(6, "AtMost1", "AtMost1"), /**
	 * The '<em><b>Exactly1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY1_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY1(7, "Exactly1", "Exactly1"), /**
	 * The '<em><b>At Least N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_N_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST_N(8, "AtLeastN", "AtLeastN"), /**
	 * The '<em><b>At Most N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_N_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_N(9, "AtMostN", "AtMostN"), /**
	 * The '<em><b>Exactly N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_N_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_N(10, "ExactlyN", "ExactlyN"), /**
	 * The '<em><b>Less Than N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_N_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_N(11, "LessThanN", "LessThanN"), /**
	 * The '<em><b>More Than N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_THAN_N_VALUE
	 * @generated
	 * @ordered
	 */
	MORE_THAN_N(12, "MoreThanN", "MoreThanN");

	/**
	 * The '<em><b>QAn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represents: a or an, some or any meaning there exists one
	 * 
	 * <!-- end-model-doc -->
	 * @see #QAN
	 * @model name="Q_An"
	 * @generated
	 * @ordered
	 */
	public static final int QAN_VALUE = 0;

	/**
	 * The '<em><b>QThe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represents the
	 * <!-- end-model-doc -->
	 * @see #QTHE
	 * @model name="Q_The"
	 * @generated
	 * @ordered
	 */
	public static final int QTHE_VALUE = 1;

	/**
	 * The '<em><b>QAll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represents each, every, all and some uses of 'any'
	 * <!-- end-model-doc -->
	 * @see #QALL
	 * @model name="Q_All"
	 * @generated
	 * @ordered
	 */
	public static final int QALL_VALUE = 2;

	/**
	 * The '<em><b>QNo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represents no, none
	 * <!-- end-model-doc -->
	 * @see #QNO
	 * @model name="Q_No"
	 * @generated
	 * @ordered
	 */
	public static final int QNO_VALUE = 3;

	/**
	 * The '<em><b>QAny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * represents some as in some specific, a given
	 * <!-- end-model-doc -->
	 * @see #QANY
	 * @model name="Q_Any"
	 * @generated
	 * @ordered
	 */
	public static final int QANY_VALUE = 4;

	/**
	 * The '<em><b>At Least1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At Least1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST1
	 * @model name="AtLeast1"
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST1_VALUE = 5;

	/**
	 * The '<em><b>At Most1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At Most1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_MOST1
	 * @model name="AtMost1"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST1_VALUE = 6;

	/**
	 * The '<em><b>Exactly1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exactly1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTLY1
	 * @model name="Exactly1"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY1_VALUE = 7;

	/**
	 * The '<em><b>At Least N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At Least N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_N
	 * @model name="AtLeastN"
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_N_VALUE = 8;

	/**
	 * The '<em><b>At Most N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>At Most N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_N
	 * @model name="AtMostN"
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_N_VALUE = 9;

	/**
	 * The '<em><b>Exactly N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exactly N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_N
	 * @model name="ExactlyN"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_N_VALUE = 10;

	/**
	 * The '<em><b>Less Than N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_N
	 * @model name="LessThanN"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_N_VALUE = 11;

	/**
	 * The '<em><b>More Than N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>More Than N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORE_THAN_N
	 * @model name="MoreThanN"
	 * @generated
	 * @ordered
	 */
	public static final int MORE_THAN_N_VALUE = 12;

	/**
	 * An array of all the '<em><b>Quantifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuantifierKind[] VALUES_ARRAY =
		new QuantifierKind[] {
			QAN,
			QTHE,
			QALL,
			QNO,
			QANY,
			AT_LEAST1,
			AT_MOST1,
			EXACTLY1,
			AT_LEAST_N,
			AT_MOST_N,
			EXACTLY_N,
			LESS_THAN_N,
			MORE_THAN_N,
		};

	/**
	 * A public read-only list of all the '<em><b>Quantifier Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QuantifierKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quantifier Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantifierKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuantifierKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantifier Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantifierKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuantifierKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quantifier Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantifierKind get(int value) {
		switch (value) {
			case QAN_VALUE: return QAN;
			case QTHE_VALUE: return QTHE;
			case QALL_VALUE: return QALL;
			case QNO_VALUE: return QNO;
			case QANY_VALUE: return QANY;
			case AT_LEAST1_VALUE: return AT_LEAST1;
			case AT_MOST1_VALUE: return AT_MOST1;
			case EXACTLY1_VALUE: return EXACTLY1;
			case AT_LEAST_N_VALUE: return AT_LEAST_N;
			case AT_MOST_N_VALUE: return AT_MOST_N;
			case EXACTLY_N_VALUE: return EXACTLY_N;
			case LESS_THAN_N_VALUE: return LESS_THAN_N;
			case MORE_THAN_N_VALUE: return MORE_THAN_N;
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
	private QuantifierKind(int value, String name, String literal) {
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
	
} //QuantifierKind
