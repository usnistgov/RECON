/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.*;
import NBVR.Vocabulary.Keyword;

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
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try {
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory("http:///NBVR/Grammar.ecore"); 
			if (theGrammarFactory != null) {
				return theGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
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
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrammarPackage.GROUP_PHRASE: return createGroupPhrase();
			case GrammarPackage.CONDITION: return createCondition();
			case GrammarPackage.SIMPLE_QUALIFIER: return createSimpleQualifier();
			case GrammarPackage.QUALIFIER_CHAIN: return createQualifierChain();
			case GrammarPackage.TYPE_NOUN: return createTypeNoun();
			case GrammarPackage.QUANTIFIER: return createQuantifier();
			case GrammarPackage.QUANTITY: return createQuantity();
			case GrammarPackage.DIMENSION: return createDimension();
			case GrammarPackage.MODIFIER: return createModifier();
			case GrammarPackage.PROPERTY_NOUN: return createPropertyNoun();
			case GrammarPackage.ROLE_NOUN: return createRoleNoun();
			case GrammarPackage.VERB_PHRASE: return createVerbPhrase();
			case GrammarPackage.PART_PHRASE: return createPartPhrase();
			case GrammarPackage.SIMPLE_FORM: return createSimpleForm();
			case GrammarPackage.IMPLICATION_FORM: return createImplicationForm();
			case GrammarPackage.COMPOUND_FORM: return createCompoundForm();
			case GrammarPackage.LEXICAL_INSTANCE: return createLexicalInstance();
			case GrammarPackage.STATEMENT: return createStatement();
			case GrammarPackage.QUESTION: return createQuestion();
			case GrammarPackage.QUERY_PHRASE: return createQueryPhrase();
			case GrammarPackage.PROPER_NAME: return createProperName();
			case GrammarPackage.PRONOUN: return createPronoun();
			case GrammarPackage.INTENSION: return createIntension();
			case GrammarPackage.PARSE: return createParse();
			case GrammarPackage.DOMAIN_FORM: return createDomainForm();
			case GrammarPackage.LOCAL_NAME: return createLocalName();
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
			case GrammarPackage.QUANTIFIER_KIND:
				return createQuantifierKindFromString(eDataType, initialValue);
			case GrammarPackage.INSTANCE_KIND:
				return createInstanceKindFromString(eDataType, initialValue);
			case GrammarPackage.CONNECTIVE:
				return createConnectiveFromString(eDataType, initialValue);
			case GrammarPackage.MODALITY:
				return createModalityFromString(eDataType, initialValue);
			case GrammarPackage.PHRASE_TYPE:
				return createPhraseTypeFromString(eDataType, initialValue);
			case GrammarPackage.GROUP_KIND:
				return createGroupKindFromString(eDataType, initialValue);
			case GrammarPackage.SENTENCE_TYPE:
				return createSentenceTypeFromString(eDataType, initialValue);
			case GrammarPackage.QUERY_KIND:
				return createQueryKindFromString(eDataType, initialValue);
			case GrammarPackage.ELEMENT_KIND:
				return createElementKindFromString(eDataType, initialValue);
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
			case GrammarPackage.QUANTIFIER_KIND:
				return convertQuantifierKindToString(eDataType, instanceValue);
			case GrammarPackage.INSTANCE_KIND:
				return convertInstanceKindToString(eDataType, instanceValue);
			case GrammarPackage.CONNECTIVE:
				return convertConnectiveToString(eDataType, instanceValue);
			case GrammarPackage.MODALITY:
				return convertModalityToString(eDataType, instanceValue);
			case GrammarPackage.PHRASE_TYPE:
				return convertPhraseTypeToString(eDataType, instanceValue);
			case GrammarPackage.GROUP_KIND:
				return convertGroupKindToString(eDataType, instanceValue);
			case GrammarPackage.SENTENCE_TYPE:
				return convertSentenceTypeToString(eDataType, instanceValue);
			case GrammarPackage.QUERY_KIND:
				return convertQueryKindToString(eDataType, instanceValue);
			case GrammarPackage.ELEMENT_KIND:
				return convertElementKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupPhrase createGroupPhrase() {
		GroupPhraseImpl groupPhrase = new GroupPhraseImpl();
		return groupPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parse createParse() {
		ParseImpl parse = new ParseImpl();
		return parse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNoun createTypeNoun() {
		TypeNounImpl typeNoun = new TypeNounImpl();
		return typeNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifier() {
		QuantifierImpl quantifier = new QuantifierImpl();
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * create a simple Quantifier with its kind
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Quantifier createQuantifier(QuantifierKind kind) {
		QuantifierImpl quantifier = new QuantifierImpl();
		quantifier.setKind(kind);
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQualifier createSimpleQualifier() {
		SimpleQualifierImpl simpleQualifier = new SimpleQualifierImpl();
		return simpleQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierChain createQualifierChain() {
		QualifierChainImpl qualifierChain = new QualifierChainImpl();
		return qualifierChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyNoun createPropertyNoun() {
		PropertyNounImpl propertyNoun = new PropertyNounImpl();
		return propertyNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNoun createRoleNoun() {
		RoleNounImpl roleNoun = new RoleNounImpl();
		return roleNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbPhrase createVerbPhrase() {
		VerbPhraseImpl verbPhrase = new VerbPhraseImpl();
		return verbPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleForm createSimpleForm() {
		SimpleFormImpl simpleForm = new SimpleFormImpl();
		return simpleForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationForm createImplicationForm() {
		ImplicationFormImpl implicationForm = new ImplicationFormImpl();
		return implicationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartPhrase createPartPhrase() {
		PartPhraseImpl partPhrase = new PartPhraseImpl();
		return partPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentenceType createSentenceTypeFromString(EDataType eDataType, String initialValue) {
		SentenceType result = SentenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSentenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryKind createQueryKindFromString(EDataType eDataType, String initialValue) {
		QueryKind result = QueryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementKind createElementKindFromString(EDataType eDataType, String initialValue) {
		ElementKind result = ElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundForm createCompoundForm() {
		CompoundFormImpl compoundForm = new CompoundFormImpl();
		return compoundForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public CompoundForm createCompoundForm(Connective kind) {
		CompoundFormImpl compoundForm = new CompoundFormImpl();
		compoundForm.setKind(kind);
		return compoundForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LexicalInstance createLexicalInstance() {
		LexicalInstanceImpl lexicalInstance = new LexicalInstanceImpl();
		return lexicalInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPhrase createQueryPhrase() {
		QueryPhraseImpl queryPhrase = new QueryPhraseImpl();
		return queryPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pronoun createPronoun() {
		PronounImpl pronoun = new PronounImpl();
		return pronoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intension createIntension() {
		IntensionImpl intension = new IntensionImpl();
		return intension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * create a specific Pronoun given the keyword
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Pronoun createPronoun(Keyword kind) {
		PronounImpl pronoun = new PronounImpl();
		pronoun.setKeyword(kind);
		return pronoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainForm createDomainForm() {
		DomainFormImpl domainForm = new DomainFormImpl();
		return domainForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalName createLocalName() {
		LocalNameImpl localName = new LocalNameImpl();
		return localName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceKind createInstanceKindFromString(EDataType eDataType, String initialValue) {
		InstanceKind result = InstanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connective createConnectiveFromString(EDataType eDataType, String initialValue) {
		Connective result = Connective.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProperName createProperName() {
		ProperNameImpl properName = new ProperNameImpl();
		return properName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupKind createGroupKindFromString(EDataType eDataType, String initialValue) {
		GroupKind result = GroupKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierKind createQuantifierKindFromString(EDataType eDataType, String initialValue) {
		QuantifierKind result = QuantifierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality createModalityFromString(EDataType eDataType, String initialValue) {
		Modality result = Modality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhraseType createPhraseTypeFromString(EDataType eDataType, String initialValue) {
		PhraseType result = PhraseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhraseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
