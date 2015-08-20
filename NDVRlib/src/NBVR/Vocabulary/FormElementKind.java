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
 * A representation of the literals of the enumeration '<em><b>Form Element Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage#getFormElementKind()
 * @model
 * @generated
 */
public enum FormElementKind implements Enumerator {
	/**
	 * The '<em><b>Subject Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT_ROLE(0, "SubjectRole", "SubjectRole"),

	/**
	 * The '<em><b>Object Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_ROLE(1, "ObjectRole", "ObjectRole"),

	/**
	 * The '<em><b>Particle Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICLE_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PARTICLE_ROLE(2, "ParticleRole", "ParticleRole"),

	/**
	 * The '<em><b>Particle Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICLE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARTICLE_ELEMENT(3, "ParticleElement", "ParticleElement"),

	/**
	 * The '<em><b>Item Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_ELEMENT(4, "ItemElement", "ItemElement");

	/**
	 * The '<em><b>Subject Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subject Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_ROLE
	 * @model name="SubjectRole"
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_ROLE_VALUE = 0;

	/**
	 * The '<em><b>Object Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_ROLE
	 * @model name="ObjectRole"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_ROLE_VALUE = 1;

	/**
	 * The '<em><b>Particle Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Particle Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTICLE_ROLE
	 * @model name="ParticleRole"
	 * @generated
	 * @ordered
	 */
	public static final int PARTICLE_ROLE_VALUE = 2;

	/**
	 * The '<em><b>Particle Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Particle Element</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTICLE_ELEMENT
	 * @model name="ParticleElement"
	 * @generated
	 * @ordered
	 */
	public static final int PARTICLE_ELEMENT_VALUE = 3;

	/**
	 * The '<em><b>Item Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Item Element</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM_ELEMENT
	 * @model name="ItemElement"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_ELEMENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Form Element Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormElementKind[] VALUES_ARRAY =
		new FormElementKind[] {
			SUBJECT_ROLE,
			OBJECT_ROLE,
			PARTICLE_ROLE,
			PARTICLE_ELEMENT,
			ITEM_ELEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Form Element Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormElementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Form Element Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormElementKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormElementKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form Element Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormElementKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormElementKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Form Element Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormElementKind get(int value) {
		switch (value) {
			case SUBJECT_ROLE_VALUE: return SUBJECT_ROLE;
			case OBJECT_ROLE_VALUE: return OBJECT_ROLE;
			case PARTICLE_ROLE_VALUE: return PARTICLE_ROLE;
			case PARTICLE_ELEMENT_VALUE: return PARTICLE_ELEMENT;
			case ITEM_ELEMENT_VALUE: return ITEM_ELEMENT;
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
	private FormElementKind(int value, String name, String literal) {
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
	
} //FormElementKind
