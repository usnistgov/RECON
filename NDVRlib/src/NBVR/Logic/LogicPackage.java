/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic;

import NBVR.Vocabulary.VocabularyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see NBVR.Logic.LogicFactory
 * @model kind="package"
 * @generated
 */
public interface LogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NBVR/Logic.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NBVR.Logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicPackage eINSTANCE = NBVR.Logic.impl.LogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.PropositionImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getProposition()
	 * @generated
	 */
	int PROPOSITION = 2;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.QuantificationImpl <em>Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.QuantificationImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getQuantification()
	 * @generated
	 */
	int QUANTIFICATION = 1;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ArgumentImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.PredicateImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 16;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.RelationImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ConnectionImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ImplicationImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 9;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ModalImpl <em>Modal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ModalImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getModal()
	 * @generated
	 */
	int MODAL = 10;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.NegationImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 11;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.VariableImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.RoleVariableImpl <em>Role Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.RoleVariableImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getRoleVariable()
	 * @generated
	 */
	int ROLE_VARIABLE = 12;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ConstantImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__USES = 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RANGE = 4;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SET = 5;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__FORMULATION = VocabularyPackage.FORMULATION_FORM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__TEXT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__OWNER = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_FEATURE_COUNT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__SCOPE = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__KIND = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__UNIQUE = PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__VARIABLE = PROPOSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ARGUMENTS = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PREDICATE = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PHRASE = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ROLE = 3;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__RELATION = 5;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__KIND = 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ValueConstantImpl <em>Value Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ValueConstantImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getValueConstant()
	 * @generated
	 */
	int VALUE_CONSTANT = 13;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.NominalConstantImpl <em>Nominal Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.NominalConstantImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getNominalConstant()
	 * @generated
	 */
	int NOMINAL_CONSTANT = 14;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.QuantityValueImpl <em>Quantity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.QuantityValueImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getQuantityValue()
	 * @generated
	 */
	int QUANTITY_VALUE = 15;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.ExtentConstantImpl <em>Extent Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.ExtentConstantImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getExtentConstant()
	 * @generated
	 */
	int EXTENT_CONSTANT = 7;

	/**
	 * The meta object id for the '{@link NBVR.Logic.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.impl.SetImpl
	 * @see NBVR.Logic.impl.LogicPackageImpl#getSet()
	 * @generated
	 */
	int SET = 6;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__EXTENT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_CONSTANT__KIND = CONSTANT__KIND;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_CONSTANT__SET = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extent Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENT_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OPERANDS = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__KIND = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ANTECEDENT = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__CONSEQUENT = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__SCOPE = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL__KIND = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__FORMULATION = PROPOSITION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__TEXT = PROPOSITION__TEXT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__OWNER = PROPOSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__SCOPE = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__SOURCE = VARIABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__CONSTRAINT = VARIABLE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__USES = VARIABLE__USES;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__RANGE = VARIABLE__RANGE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__SET = VARIABLE__SET;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__PREDICATE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE__ROLE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTANT__KIND = CONSTANT__KIND;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTANT__NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_CONSTANT__KIND = CONSTANT__KIND;

	/**
	 * The feature id for the '<em><b>Proposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_CONSTANT__PROPOSITION = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nominal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_VALUE__KIND = CONSTANT__KIND;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_VALUE__FACTOR = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_VALUE__UNIT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_VALUE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Noun</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NOUN = 2;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__VERB = 3;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link NBVR.Logic.PropositionKind <em>Proposition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Logic.PropositionKind
	 * @see NBVR.Logic.impl.LogicPackageImpl#getPropositionKind()
	 * @generated
	 */
	int PROPOSITION_KIND = 17;

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see NBVR.Logic.Proposition
	 * @generated
	 */
	EClass getProposition();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Proposition#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see NBVR.Logic.Proposition#getText()
	 * @see #getProposition()
	 * @generated
	 */
	EAttribute getProposition_Text();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Proposition#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see NBVR.Logic.Proposition#getOwner()
	 * @see #getProposition()
	 * @generated
	 */
	EReference getProposition_Owner();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantification</em>'.
	 * @see NBVR.Logic.Quantification
	 * @generated
	 */
	EClass getQuantification();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Quantification#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see NBVR.Logic.Quantification#getVariable()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Variable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Quantification#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see NBVR.Logic.Quantification#getScope()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Scope();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Quantification#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Logic.Quantification#getKind()
	 * @see #getQuantification()
	 * @generated
	 */
	EAttribute getQuantification_Kind();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Quantification#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see NBVR.Logic.Quantification#isUnique()
	 * @see #getQuantification()
	 * @generated
	 */
	EAttribute getQuantification_Unique();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see NBVR.Logic.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Argument#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see NBVR.Logic.Argument#getNext()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Next();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Argument#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see NBVR.Logic.Argument#getVariable()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Variable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Argument#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phrase</em>'.
	 * @see NBVR.Logic.Argument#getPhrase()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Phrase();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Argument#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see NBVR.Logic.Argument#getRole()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Role();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Logic.Argument#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see NBVR.Logic.Argument#getConstant()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Constant();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Logic.Argument#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relation</em>'.
	 * @see NBVR.Logic.Argument#getRelation()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Relation();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see NBVR.Logic.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Predicate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NBVR.Logic.Predicate#getName()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Name();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Logic.Predicate#getNoun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Noun</em>'.
	 * @see NBVR.Logic.Predicate#getNoun()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Noun();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Logic.Predicate#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Verb</em>'.
	 * @see NBVR.Logic.Predicate#getVerb()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Verb();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Logic.Predicate#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see NBVR.Logic.Predicate#getVariables()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Variables();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.RoleVariable <em>Role Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Variable</em>'.
	 * @see NBVR.Logic.RoleVariable
	 * @generated
	 */
	EClass getRoleVariable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.RoleVariable#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see NBVR.Logic.RoleVariable#getRole()
	 * @see #getRoleVariable()
	 * @generated
	 */
	EReference getRoleVariable_Role();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Logic.RoleVariable#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Predicate</em>'.
	 * @see NBVR.Logic.RoleVariable#getPredicate()
	 * @see #getRoleVariable()
	 * @generated
	 */
	EReference getRoleVariable_Predicate();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see NBVR.Logic.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Logic.Relation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see NBVR.Logic.Relation#getArguments()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Arguments();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Relation#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see NBVR.Logic.Relation#getPredicate()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Predicate();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see NBVR.Logic.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Logic.Connection#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operands</em>'.
	 * @see NBVR.Logic.Connection#getOperands()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Operands();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Connection#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Logic.Connection#getKind()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see NBVR.Logic.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Implication#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent</em>'.
	 * @see NBVR.Logic.Implication#getAntecedent()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Antecedent();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Implication#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent</em>'.
	 * @see NBVR.Logic.Implication#getConsequent()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Consequent();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Modal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal</em>'.
	 * @see NBVR.Logic.Modal
	 * @generated
	 */
	EClass getModal();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Modal#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see NBVR.Logic.Modal#getScope()
	 * @see #getModal()
	 * @generated
	 */
	EReference getModal_Scope();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Modal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Logic.Modal#getKind()
	 * @see #getModal()
	 * @generated
	 */
	EAttribute getModal_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see NBVR.Logic.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Negation#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see NBVR.Logic.Negation#getScope()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Scope();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.ValueConstant <em>Value Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constant</em>'.
	 * @see NBVR.Logic.ValueConstant
	 * @generated
	 */
	EClass getValueConstant();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.ValueConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NBVR.Logic.ValueConstant#getName()
	 * @see #getValueConstant()
	 * @generated
	 */
	EAttribute getValueConstant_Name();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.NominalConstant <em>Nominal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominal Constant</em>'.
	 * @see NBVR.Logic.NominalConstant
	 * @generated
	 */
	EClass getNominalConstant();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.NominalConstant#getProposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Proposition</em>'.
	 * @see NBVR.Logic.NominalConstant#getProposition()
	 * @see #getNominalConstant()
	 * @generated
	 */
	EReference getNominalConstant_Proposition();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.QuantityValue <em>Quantity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Value</em>'.
	 * @see NBVR.Logic.QuantityValue
	 * @generated
	 */
	EClass getQuantityValue();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.QuantityValue#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see NBVR.Logic.QuantityValue#getFactor()
	 * @see #getQuantityValue()
	 * @generated
	 */
	EAttribute getQuantityValue_Factor();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.QuantityValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see NBVR.Logic.QuantityValue#getUnit()
	 * @see #getQuantityValue()
	 * @generated
	 */
	EAttribute getQuantityValue_Unit();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.ExtentConstant <em>Extent Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extent Constant</em>'.
	 * @see NBVR.Logic.ExtentConstant
	 * @generated
	 */
	EClass getExtentConstant();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.ExtentConstant#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see NBVR.Logic.ExtentConstant#getSet()
	 * @see #getExtentConstant()
	 * @generated
	 */
	EReference getExtentConstant_Set();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see NBVR.Logic.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Set#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see NBVR.Logic.Set#getVariable()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Variable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Set#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see NBVR.Logic.Set#getExtent()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Extent();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see NBVR.Logic.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Constant#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Logic.Constant#getKind()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Logic.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see NBVR.Logic.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Variable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see NBVR.Logic.Variable#getSource()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Source();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Variable#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see NBVR.Logic.Variable#getSet()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Set();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Logic.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see NBVR.Logic.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Variable#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see NBVR.Logic.Variable#getConstraint()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Logic.Variable#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see NBVR.Logic.Variable#getUses()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Uses();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Logic.Variable#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see NBVR.Logic.Variable#getRange()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Range();

	/**
	 * Returns the meta object for enum '{@link NBVR.Logic.PropositionKind <em>Proposition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proposition Kind</em>'.
	 * @see NBVR.Logic.PropositionKind
	 * @generated
	 */
	EEnum getPropositionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicFactory getLogicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.PropositionImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getProposition()
		 * @generated
		 */
		EClass PROPOSITION = eINSTANCE.getProposition();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPOSITION__TEXT = eINSTANCE.getProposition_Text();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSITION__OWNER = eINSTANCE.getProposition_Owner();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.QuantificationImpl <em>Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.QuantificationImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getQuantification()
		 * @generated
		 */
		EClass QUANTIFICATION = eINSTANCE.getQuantification();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__VARIABLE = eINSTANCE.getQuantification_Variable();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__SCOPE = eINSTANCE.getQuantification_Scope();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFICATION__KIND = eINSTANCE.getQuantification_Kind();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFICATION__UNIQUE = eINSTANCE.getQuantification_Unique();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ArgumentImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__NEXT = eINSTANCE.getArgument_Next();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__VARIABLE = eINSTANCE.getArgument_Variable();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__PHRASE = eINSTANCE.getArgument_Phrase();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ROLE = eINSTANCE.getArgument_Role();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTANT = eINSTANCE.getArgument_Constant();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__RELATION = eINSTANCE.getArgument_Relation();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.PredicateImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NAME = eINSTANCE.getPredicate_Name();

		/**
		 * The meta object literal for the '<em><b>Noun</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__NOUN = eINSTANCE.getPredicate_Noun();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__VERB = eINSTANCE.getPredicate_Verb();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__VARIABLES = eINSTANCE.getPredicate_Variables();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.RoleVariableImpl <em>Role Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.RoleVariableImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getRoleVariable()
		 * @generated
		 */
		EClass ROLE_VARIABLE = eINSTANCE.getRoleVariable();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_VARIABLE__ROLE = eINSTANCE.getRoleVariable_Role();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_VARIABLE__PREDICATE = eINSTANCE.getRoleVariable_Predicate();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.RelationImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ARGUMENTS = eINSTANCE.getRelation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__PREDICATE = eINSTANCE.getRelation_Predicate();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ConnectionImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__OPERANDS = eINSTANCE.getConnection_Operands();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__KIND = eINSTANCE.getConnection_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ImplicationImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__ANTECEDENT = eINSTANCE.getImplication_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__CONSEQUENT = eINSTANCE.getImplication_Consequent();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ModalImpl <em>Modal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ModalImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getModal()
		 * @generated
		 */
		EClass MODAL = eINSTANCE.getModal();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODAL__SCOPE = eINSTANCE.getModal_Scope();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODAL__KIND = eINSTANCE.getModal_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.NegationImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__SCOPE = eINSTANCE.getNegation_Scope();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ValueConstantImpl <em>Value Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ValueConstantImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getValueConstant()
		 * @generated
		 */
		EClass VALUE_CONSTANT = eINSTANCE.getValueConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONSTANT__NAME = eINSTANCE.getValueConstant_Name();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.NominalConstantImpl <em>Nominal Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.NominalConstantImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getNominalConstant()
		 * @generated
		 */
		EClass NOMINAL_CONSTANT = eINSTANCE.getNominalConstant();

		/**
		 * The meta object literal for the '<em><b>Proposition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMINAL_CONSTANT__PROPOSITION = eINSTANCE.getNominalConstant_Proposition();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.QuantityValueImpl <em>Quantity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.QuantityValueImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getQuantityValue()
		 * @generated
		 */
		EClass QUANTITY_VALUE = eINSTANCE.getQuantityValue();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_VALUE__FACTOR = eINSTANCE.getQuantityValue_Factor();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_VALUE__UNIT = eINSTANCE.getQuantityValue_Unit();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ExtentConstantImpl <em>Extent Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ExtentConstantImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getExtentConstant()
		 * @generated
		 */
		EClass EXTENT_CONSTANT = eINSTANCE.getExtentConstant();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENT_CONSTANT__SET = eINSTANCE.getExtentConstant_Set();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.SetImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__VARIABLE = eINSTANCE.getSet_Variable();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__EXTENT = eINSTANCE.getSet_Extent();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.ConstantImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__KIND = eINSTANCE.getConstant_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.impl.VariableImpl
		 * @see NBVR.Logic.impl.LogicPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SOURCE = eINSTANCE.getVariable_Source();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SET = eINSTANCE.getVariable_Set();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CONSTRAINT = eINSTANCE.getVariable_Constraint();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__USES = eINSTANCE.getVariable_Uses();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RANGE = eINSTANCE.getVariable_Range();

		/**
		 * The meta object literal for the '{@link NBVR.Logic.PropositionKind <em>Proposition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Logic.PropositionKind
		 * @see NBVR.Logic.impl.LogicPackageImpl#getPropositionKind()
		 * @generated
		 */
		EEnum PROPOSITION_KIND = eINSTANCE.getPropositionKind();

	}

} //LogicPackage
