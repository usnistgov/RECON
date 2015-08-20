/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Voc Item Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage#getVocItemKind()
 * @model
 * @generated
 */
public enum VocItemKind implements Enumerator {
	/**
	 * The '<em><b>Noun Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOUN_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	NOUN_CONCEPT(0, "NounConcept", "NounConcept"),

	/**
	 * The '<em><b>Verb Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERB_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	VERB_CONCEPT(1, "VerbConcept", "VerbConcept"),

	/**
	 * The '<em><b>Adjective Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ADJECTIVE_CONCEPT(2, "AdjectiveConcept", "AdjectiveConcept"),

	/**
	 * The '<em><b>Property Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_CONCEPT(3, "PropertyConcept", "PropertyConcept"), /**
	 * The '<em><b>Proper Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPER_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	PROPER_NAME(4, "ProperName", "ProperName");

	/**
	 * The '<em><b>Noun Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Noun Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOUN_CONCEPT
	 * @model name="NounConcept"
	 * @generated
	 * @ordered
	 */
	public static final int NOUN_CONCEPT_VALUE = 0;

	/**
	 * The '<em><b>Verb Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verb Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERB_CONCEPT
	 * @model name="VerbConcept"
	 * @generated
	 * @ordered
	 */
	public static final int VERB_CONCEPT_VALUE = 1;

	/**
	 * The '<em><b>Adjective Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjective Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJECTIVE_CONCEPT
	 * @model name="AdjectiveConcept"
	 * @generated
	 * @ordered
	 */
	public static final int ADJECTIVE_CONCEPT_VALUE = 2;

	/**
	 * The '<em><b>Property Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property Concept</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_CONCEPT
	 * @model name="PropertyConcept"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_CONCEPT_VALUE = 3;

	/**
	 * The '<em><b>Proper Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proper Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPER_NAME
	 * @model name="ProperName"
	 * @generated
	 * @ordered
	 */
	public static final int PROPER_NAME_VALUE = 4;

	/**
	 * An array of all the '<em><b>Voc Item Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VocItemKind[] VALUES_ARRAY =
		new VocItemKind[] {
			NOUN_CONCEPT,
			VERB_CONCEPT,
			ADJECTIVE_CONCEPT,
			PROPERTY_CONCEPT,
			PROPER_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Voc Item Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VocItemKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Voc Item Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocItemKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VocItemKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voc Item Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocItemKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VocItemKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voc Item Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocItemKind get(int value) {
		switch (value) {
			case NOUN_CONCEPT_VALUE: return NOUN_CONCEPT;
			case VERB_CONCEPT_VALUE: return VERB_CONCEPT;
			case ADJECTIVE_CONCEPT_VALUE: return ADJECTIVE_CONCEPT;
			case PROPERTY_CONCEPT_VALUE: return PROPERTY_CONCEPT;
			case PROPER_NAME_VALUE: return PROPER_NAME;
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
	private VocItemKind(int value, String name, String literal) {
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
	
} //VocItemKind
