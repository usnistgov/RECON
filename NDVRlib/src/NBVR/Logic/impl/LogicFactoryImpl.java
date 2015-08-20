/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Logic.impl;

import NBVR.Logic.*;

import NBVR.Vocabulary.VerbRole;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicFactoryImpl extends EFactoryImpl implements LogicFactory {
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicFactory init() {
		try {
			LogicFactory theLogicFactory = (LogicFactory)EPackage.Registry.INSTANCE.getEFactory("http:///NBVR/Logic.ecore"); 
			if (theLogicFactory != null) {
				return theLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFactoryImpl() {
		super();
	}

	/**
	 * a string of many spaces for indenting output
	 * @generated not
	 */
	public static final String spaces = "                                                ";

	/**
	 * return a string of exactly n spaces
	 * @param count = the number of spaces to return
	 * @return the string of 'count' spaces
	 * @generated not
	 */
	public static String spaces(int count) 
	{
		return spaces.substring(0, count);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicPackage.VARIABLE: return createVariable();
			case LogicPackage.QUANTIFICATION: return createQuantification();
			case LogicPackage.RELATION: return createRelation();
			case LogicPackage.ARGUMENT: return createArgument();
			case LogicPackage.SET: return createSet();
			case LogicPackage.EXTENT_CONSTANT: return createExtentConstant();
			case LogicPackage.CONNECTION: return createConnection();
			case LogicPackage.IMPLICATION: return createImplication();
			case LogicPackage.MODAL: return createModal();
			case LogicPackage.NEGATION: return createNegation();
			case LogicPackage.ROLE_VARIABLE: return createRoleVariable();
			case LogicPackage.VALUE_CONSTANT: return createValueConstant();
			case LogicPackage.NOMINAL_CONSTANT: return createNominalConstant();
			case LogicPackage.QUANTITY_VALUE: return createQuantityValue();
			case LogicPackage.PREDICATE: return createPredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LogicPackage.PROPOSITION_KIND:
				return createPropositionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LogicPackage.PROPOSITION_KIND:
				return convertPropositionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantification createQuantification() {
		QuantificationImpl quantification = new QuantificationImpl();
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * create an Argument slot in a Relation
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Argument createArgument(VerbRole role)
	{
		ArgumentImpl argument = new ArgumentImpl();
		argument.setRole(role);
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleVariable createRoleVariable() {
		RoleVariableImpl roleVariable = new RoleVariableImpl();
		return roleVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modal createModal() {
		ModalImpl modal = new ModalImpl();
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstant createValueConstant() {
		ValueConstantImpl valueConstant = new ValueConstantImpl();
		return valueConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityValue createQuantityValue() {
		QuantityValueImpl quantityValue = new QuantityValueImpl();
		return quantityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalConstant createNominalConstant() {
		NominalConstantImpl nominalConstant = new NominalConstantImpl();
		return nominalConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentConstant createExtentConstant() {
		ExtentConstantImpl extentConstant = new ExtentConstantImpl();
		return extentConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropositionKind createPropositionKindFromString(EDataType eDataType, String initialValue) {
		PropositionKind result = PropositionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropositionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicPackage getLogicPackage() {
		return (LogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicPackage getPackage() {
		return LogicPackage.eINSTANCE;
	}

} //LogicFactoryImpl
