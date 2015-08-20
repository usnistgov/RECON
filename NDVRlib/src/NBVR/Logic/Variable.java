/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Vocabulary.VocNoun;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link NBVR.Logic.Variable#getName <em>Name</em>}</li>
 *   <li>{@link NBVR.Logic.Variable#getSource <em>Source</em>}</li>
 *   <li>{@link NBVR.Logic.Variable#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link NBVR.Logic.Variable#getUses <em>Uses</em>}</li>
 *   <li>{@link NBVR.Logic.Variable#getRange <em>Range</em>}</li>
 *   <li>{@link NBVR.Logic.Variable#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see NBVR.Logic.LogicPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Quantification#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Quantification)
	 * @see NBVR.Logic.LogicPackage#getVariable_Source()
	 * @see NBVR.Logic.Quantification#getVariable
	 * @model opposite="variable" ordered="false"
	 * @generated
	 */
	Quantification getSource();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Variable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Quantification value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link NBVR.Logic.Set#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(Set)
	 * @see NBVR.Logic.LogicPackage#getVariable_Set()
	 * @see NBVR.Logic.Set#getVariable
	 * @model opposite="variable" ordered="false"
	 * @generated
	 */
	Set getSet();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Variable#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(Set value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link NBVR.Logic.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Technically the uses should be the Relations that contain the Argument
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see NBVR.Logic.LogicPackage#getVariable_Uses()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Relation> getUses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see NBVR.Logic.LogicPackage#getVariable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Proposition)
	 * @see NBVR.Logic.LogicPackage#getVariable_Constraint()
	 * @model ordered="false"
	 * @generated
	 */
	Proposition getConstraint();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Variable#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Proposition value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(VocNoun)
	 * @see NBVR.Logic.LogicPackage#getVariable_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VocNoun getRange();

	/**
	 * Sets the value of the '{@link NBVR.Logic.Variable#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(VocNoun value);

} // Variable
