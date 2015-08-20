/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Proposition Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Logic.LogicPackage#getPropositionKind()
 * @model
 * @generated
 */
public enum PropositionKind implements Enumerator {
	/**
	 * The '<em><b>Relation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATION_VALUE
	 * @generated
	 * @ordered
	 */
	RELATION(0, "Relation", "Relation"),

	/**
	 * The '<em><b>Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION(1, "Connection", "Connection"),

	/**
	 * The '<em><b>Implication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLICATION(2, "Implication", "Implication"),

	/**
	 * The '<em><b>Negation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATION_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATION(3, "Negation", "Negation"),

	/**
	 * The '<em><b>Quantification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTIFICATION(4, "Quantification", "Quantification"),

	/**
	 * The '<em><b>Modal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODAL_VALUE
	 * @generated
	 * @ordered
	 */
	MODAL(5, "Modal", "Modal");

	/**
	 * The '<em><b>Relation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATION
	 * @model name="Relation"
	 * @generated
	 * @ordered
	 */
	public static final int RELATION_VALUE = 0;

	/**
	 * The '<em><b>Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTION
	 * @model name="Connection"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_VALUE = 1;

	/**
	 * The '<em><b>Implication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLICATION
	 * @model name="Implication"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLICATION_VALUE = 2;

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
	public static final int NEGATION_VALUE = 3;

	/**
	 * The '<em><b>Quantification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTIFICATION
	 * @model name="Quantification"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTIFICATION_VALUE = 4;

	/**
	 * The '<em><b>Modal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODAL
	 * @model name="Modal"
	 * @generated
	 * @ordered
	 */
	public static final int MODAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Proposition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropositionKind[] VALUES_ARRAY =
		new PropositionKind[] {
			RELATION,
			CONNECTION,
			IMPLICATION,
			NEGATION,
			QUANTIFICATION,
			MODAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Proposition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropositionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Proposition Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropositionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropositionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposition Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropositionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropositionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposition Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropositionKind get(int value) {
		switch (value) {
			case RELATION_VALUE: return RELATION;
			case CONNECTION_VALUE: return CONNECTION;
			case IMPLICATION_VALUE: return IMPLICATION;
			case NEGATION_VALUE: return NEGATION;
			case QUANTIFICATION_VALUE: return QUANTIFICATION;
			case MODAL_VALUE: return MODAL;
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
	private PropositionKind(int value, String name, String literal) {
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
	
} //PropositionKind
