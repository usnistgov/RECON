/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;

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
 * @see NBVR.Grammar.GrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NBVR/Grammar.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NBVR.Grammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = NBVR.Grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ParseElementImpl <em>Parse Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ParseElementImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getParseElement()
	 * @generated
	 */
	int PARSE_ELEMENT = 33;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.RolePhraseImpl <em>Role Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.RolePhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getRolePhrase()
	 * @generated
	 */
	int ROLE_PHRASE = 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE__FORMULATION = VocabularyPackage.FORMULATION_FORM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE__PARENT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.SimpleNounPhraseImpl <em>Simple Noun Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.SimpleNounPhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleNounPhrase()
	 * @generated
	 */
	int SIMPLE_NOUN_PHRASE = 2;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ConditionImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.GroupPhraseImpl <em>Group Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.GroupPhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getGroupPhrase()
	 * @generated
	 */
	int GROUP_PHRASE = 0;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE__ROLE_PLAYED = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE__VARIABLE = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE__REFERENT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PHRASE_FEATURE_COUNT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__FORMULATION = ROLE_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__PARENT = ROLE_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__ROLE_PLAYED = ROLE_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__VARIABLE = ROLE_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__REFERENT = ROLE_PHRASE__REFERENT;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__MEMBERS = ROLE_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE__KIND = ROLE_PHRASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_PHRASE_FEATURE_COUNT = ROLE_PHRASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ModifiedTermImpl <em>Modified Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ModifiedTermImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModifiedTerm()
	 * @generated
	 */
	int MODIFIED_TERM = 9;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.TypeNounImpl <em>Type Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.TypeNounImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getTypeNoun()
	 * @generated
	 */
	int TYPE_NOUN = 8;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QuantifierImpl <em>Quantifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QuantifierImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 10;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ModifierImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 14;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QualifierImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 5;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.InstanceImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 12;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.PropertyNounImpl <em>Property Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.PropertyNounImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPropertyNoun()
	 * @generated
	 */
	int PROPERTY_NOUN = 15;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.RoleNounImpl <em>Role Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.RoleNounImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getRoleNoun()
	 * @generated
	 */
	int ROLE_NOUN = 16;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.VerbPhraseImpl <em>Verb Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.VerbPhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getVerbPhrase()
	 * @generated
	 */
	int VERB_PHRASE = 17;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.SentenceImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 7;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ParseImpl <em>Parse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ParseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getParse()
	 * @generated
	 */
	int PARSE = 30;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.SimpleFormImpl <em>Simple Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.SimpleFormImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleForm()
	 * @generated
	 */
	int SIMPLE_FORM = 19;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.PartPhraseImpl <em>Part Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.PartPhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPartPhrase()
	 * @generated
	 */
	int PART_PHRASE = 18;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ImplicationFormImpl <em>Implication Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ImplicationFormImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getImplicationForm()
	 * @generated
	 */
	int IMPLICATION_FORM = 20;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.SentenceType <em>Sentence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.SentenceType
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSentenceType()
	 * @generated
	 */
	int SENTENCE_TYPE = 40;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.QueryKind <em>Query Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.QueryKind
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQueryKind()
	 * @generated
	 */
	int QUERY_KIND = 41;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.ElementKind <em>Element Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.ElementKind
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getElementKind()
	 * @generated
	 */
	int ELEMENT_KIND = 42;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.CompoundFormImpl <em>Compound Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.CompoundFormImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getCompoundForm()
	 * @generated
	 */
	int COMPOUND_FORM = 21;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.LexicalInstanceImpl <em>Lexical Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.LexicalInstanceImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getLexicalInstance()
	 * @generated
	 */
	int LEXICAL_INSTANCE = 22;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.NominalizationImpl <em>Nominalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.NominalizationImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getNominalization()
	 * @generated
	 */
	int NOMINALIZATION = 23;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.StatementImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 24;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QuestionImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 25;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.ProperNameImpl <em>Proper Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.ProperNameImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getProperName()
	 * @generated
	 */
	int PROPER_NAME = 27;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.SimpleQualifierImpl <em>Simple Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.SimpleQualifierImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleQualifier()
	 * @generated
	 */
	int SIMPLE_QUALIFIER = 4;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QualifierChainImpl <em>Qualifier Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QualifierChainImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQualifierChain()
	 * @generated
	 */
	int QUALIFIER_CHAIN = 6;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE__FORMULATION = ROLE_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE__PARENT = ROLE_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE__ROLE_PLAYED = ROLE_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE__VARIABLE = ROLE_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE__REFERENT = ROLE_PHRASE__REFERENT;

	/**
	 * The number of structural features of the '<em>Simple Noun Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NOUN_PHRASE_FEATURE_COUNT = ROLE_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ELEMENT__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Parse Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PARENT = PARSE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OTHERWISE = PARSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__QUALIFIER = PARSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ANTECEDENT = PARSE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PARSE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__PARENT = PARSE_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = PARSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER__PARENT = QUALIFIER__PARENT;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER__CHAIN = QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER__BOUND_FORM = QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER__CONDITION = QUALIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUALIFIER_FEATURE_COUNT = QUALIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_CHAIN__PARENT = QUALIFIER__PARENT;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_CHAIN__QUALIFIERS = QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualifier Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_CHAIN_FEATURE_COUNT = QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__FORMULATION = VocabularyPackage.FORMULATION_FORM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__PARENT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__DOMAIN = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__REWRITES = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = VocabularyPackage.FORMULATION_FORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__FORMULATION = SIMPLE_NOUN_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__PARENT = SIMPLE_NOUN_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__ROLE_PLAYED = SIMPLE_NOUN_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__VARIABLE = SIMPLE_NOUN_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__REFERENT = SIMPLE_NOUN_PHRASE__REFERENT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__QUANTIFIER = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__MODIFIERS = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM__QUALIFIERS = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modified Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIED_TERM_FEATURE_COUNT = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__FORMULATION = MODIFIED_TERM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__PARENT = MODIFIED_TERM__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__ROLE_PLAYED = MODIFIED_TERM__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__VARIABLE = MODIFIED_TERM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__REFERENT = MODIFIED_TERM__REFERENT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__QUANTIFIER = MODIFIED_TERM__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__MODIFIERS = MODIFIED_TERM__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__QUALIFIERS = MODIFIED_TERM__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Noun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN__NOUN = MODIFIED_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NOUN_FEATURE_COUNT = MODIFIED_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER__PARENT = PARSE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER__KIND = PARSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER__COUNT = PARSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER__QUANTITY = PARSE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIER_FEATURE_COUNT = PARSE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__FORMULATION = SIMPLE_NOUN_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARENT = SIMPLE_NOUN_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ROLE_PLAYED = SIMPLE_NOUN_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__VARIABLE = SIMPLE_NOUN_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__REFERENT = SIMPLE_NOUN_PHRASE__REFERENT;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.PronounImpl <em>Pronoun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.PronounImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPronoun()
	 * @generated
	 */
	int PRONOUN = 28;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.InstanceKind <em>Instance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.InstanceKind
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getInstanceKind()
	 * @generated
	 */
	int INSTANCE_KIND = 35;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.Connective <em>Connective</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.Connective
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getConnective()
	 * @generated
	 */
	int CONNECTIVE = 36;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.DomainFormImpl <em>Domain Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.DomainFormImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getDomainForm()
	 * @generated
	 */
	int DOMAIN_FORM = 31;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.LocalNameImpl <em>Local Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.LocalNameImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getLocalName()
	 * @generated
	 */
	int LOCAL_NAME = 32;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QuantityImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 11;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__FORMULATION = INSTANCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ROLE_PLAYED = INSTANCE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__VARIABLE = INSTANCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REFERENT = INSTANCE__REFERENT;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__FACTOR = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DIMENSION = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.DimensionImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 13;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXPONENT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__PARENT = PARSE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Adjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ADJECTIVE = PARSE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__KIND = PARSE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__RELATIVE = PARSE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = PARSE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__FORMULATION = MODIFIED_TERM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__PARENT = MODIFIED_TERM__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__ROLE_PLAYED = MODIFIED_TERM__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__VARIABLE = MODIFIED_TERM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__REFERENT = MODIFIED_TERM__REFERENT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__QUANTIFIER = MODIFIED_TERM__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__MODIFIERS = MODIFIED_TERM__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__QUALIFIERS = MODIFIED_TERM__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__PROPERTY = MODIFIED_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__DOMAIN = MODIFIED_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expansion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN__EXPANSION = MODIFIED_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NOUN_FEATURE_COUNT = MODIFIED_TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__FORMULATION = SIMPLE_NOUN_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__PARENT = SIMPLE_NOUN_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__ROLE_PLAYED = SIMPLE_NOUN_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__VARIABLE = SIMPLE_NOUN_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__REFERENT = SIMPLE_NOUN_PHRASE__REFERENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN__ROLE = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NOUN_FEATURE_COUNT = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PHRASE__VERB = 0;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PHRASE__MODALITY = 1;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PHRASE__NEGATED = 2;

	/**
	 * The number of structural features of the '<em>Verb Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_PHRASE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Part Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_PHRASE__PART_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_PHRASE__PARTICLE = 1;

	/**
	 * The number of structural features of the '<em>Part Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_PHRASE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__FORMULATION = SENTENCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__PARENT = SENTENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__DOMAIN = SENTENCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__REWRITES = SENTENCE__REWRITES;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__VERB = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Phrases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__PART_PHRASES = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__SUBJECT = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM__OBJECT = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FORM_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__FORMULATION = SENTENCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__PARENT = SENTENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__DOMAIN = SENTENCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__REWRITES = SENTENCE__REWRITES;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__ANTECEDENT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__CONSEQUENT = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__ALTERNATIVE = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM__KIND = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implication Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FORM_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__FORMULATION = SENTENCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__PARENT = SENTENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__DOMAIN = SENTENCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__REWRITES = SENTENCE__REWRITES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__KIND = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM__STATEMENTS = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FORM_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__FORMULATION = INSTANCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__ROLE_PLAYED = INSTANCE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__VARIABLE = INSTANCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__REFERENT = INSTANCE__REFERENT;

	/**
	 * The feature id for the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE__WORD = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lexical Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICAL_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__FORMULATION = INSTANCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__ROLE_PLAYED = INSTANCE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__VARIABLE = INSTANCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__REFERENT = INSTANCE__REFERENT;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION__SENTENCE = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nominalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINALIZATION_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__FORMULATION = NOMINALIZATION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PARENT = NOMINALIZATION__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ROLE_PLAYED = NOMINALIZATION__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__VARIABLE = NOMINALIZATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__REFERENT = NOMINALIZATION__REFERENT;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SENTENCE = NOMINALIZATION__SENTENCE;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = NOMINALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__FORMULATION = NOMINALIZATION__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__PARENT = NOMINALIZATION__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ROLE_PLAYED = NOMINALIZATION__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VARIABLE = NOMINALIZATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REFERENT = NOMINALIZATION__REFERENT;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SENTENCE = NOMINALIZATION__SENTENCE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUERY = NOMINALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Phrase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUERY_PHRASE = NOMINALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = NOMINALIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.QueryPhraseImpl <em>Query Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.QueryPhraseImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQueryPhrase()
	 * @generated
	 */
	int QUERY_PHRASE = 26;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__FORMULATION = ROLE_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__PARENT = ROLE_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__ROLE_PLAYED = ROLE_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__VARIABLE = ROLE_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__REFERENT = ROLE_PHRASE__REFERENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__DOMAIN = ROLE_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__QUERY = ROLE_PHRASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE__QUESTION = ROLE_PHRASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PHRASE_FEATURE_COUNT = ROLE_PHRASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.impl.IntensionImpl <em>Intension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.impl.IntensionImpl
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getIntension()
	 * @generated
	 */
	int INTENSION = 29;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__FORMULATION = INSTANCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__ROLE_PLAYED = INSTANCE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__VARIABLE = INSTANCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__REFERENT = INSTANCE__REFERENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME__NAME = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proper Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPER_NAME_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__FORMULATION = MODIFIED_TERM__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__PARENT = MODIFIED_TERM__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__ROLE_PLAYED = MODIFIED_TERM__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__VARIABLE = MODIFIED_TERM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__REFERENT = MODIFIED_TERM__REFERENT;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__QUANTIFIER = MODIFIED_TERM__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__MODIFIERS = MODIFIED_TERM__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__QUALIFIERS = MODIFIED_TERM__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__KEYWORD = MODIFIED_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pronoun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_FEATURE_COUNT = MODIFIED_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__FORMULATION = INSTANCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__ROLE_PLAYED = INSTANCE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__VARIABLE = INSTANCE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__REFERENT = INSTANCE__REFERENT;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION__CONCEPT = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSION_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__FORMULATION = SENTENCE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__PARENT = SENTENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__DOMAIN = SENTENCE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Rewrites</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__REWRITES = SENTENCE__REWRITES;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__STATEMENT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM__MODALITY = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FORM_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__FORMULATION = SIMPLE_NOUN_PHRASE__FORMULATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__PARENT = SIMPLE_NOUN_PHRASE__PARENT;

	/**
	 * The feature id for the '<em><b>Role Played</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__ROLE_PLAYED = SIMPLE_NOUN_PHRASE__ROLE_PLAYED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__VARIABLE = SIMPLE_NOUN_PHRASE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__REFERENT = SIMPLE_NOUN_PHRASE__REFERENT;

	/**
	 * The feature id for the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__WORD = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME__NEXT = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_FEATURE_COUNT = SIMPLE_NOUN_PHRASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.GroupKind <em>Group Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.GroupKind
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getGroupKind()
	 * @generated
	 */
	int GROUP_KIND = 39;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.QuantifierKind <em>Quantifier Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.QuantifierKind
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantifierKind()
	 * @generated
	 */
	int QUANTIFIER_KIND = 34;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.Modality <em>Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.Modality
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModality()
	 * @generated
	 */
	int MODALITY = 37;

	/**
	 * The meta object id for the '{@link NBVR.Grammar.PhraseType <em>Phrase Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Grammar.PhraseType
	 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPhraseType()
	 * @generated
	 */
	int PHRASE_TYPE = 38;

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.RolePhrase <em>Role Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Phrase</em>'.
	 * @see NBVR.Grammar.RolePhrase
	 * @generated
	 */
	EClass getRolePhrase();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.RolePhrase#getRolePlayed <em>Role Played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Played</em>'.
	 * @see NBVR.Grammar.RolePhrase#getRolePlayed()
	 * @see #getRolePhrase()
	 * @generated
	 */
	EReference getRolePhrase_RolePlayed();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.RolePhrase#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see NBVR.Grammar.RolePhrase#getVariable()
	 * @see #getRolePhrase()
	 * @generated
	 */
	EReference getRolePhrase_Variable();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.RolePhrase#getReferent <em>Referent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see NBVR.Grammar.RolePhrase#getReferent()
	 * @see #getRolePhrase()
	 * @generated
	 */
	EReference getRolePhrase_Referent();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.SimpleNounPhrase <em>Simple Noun Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Noun Phrase</em>'.
	 * @see NBVR.Grammar.SimpleNounPhrase
	 * @generated
	 */
	EClass getSimpleNounPhrase();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see NBVR.Grammar.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Condition#isOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otherwise</em>'.
	 * @see NBVR.Grammar.Condition#isOtherwise()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Otherwise();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Condition#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see NBVR.Grammar.Condition#getQualifier()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Condition#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent</em>'.
	 * @see NBVR.Grammar.Condition#getAntecedent()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Antecedent();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.GroupPhrase <em>Group Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Phrase</em>'.
	 * @see NBVR.Grammar.GroupPhrase
	 * @generated
	 */
	EClass getGroupPhrase();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.GroupPhrase#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see NBVR.Grammar.GroupPhrase#getMembers()
	 * @see #getGroupPhrase()
	 * @generated
	 */
	EReference getGroupPhrase_Members();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.GroupPhrase#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Grammar.GroupPhrase#getKind()
	 * @see #getGroupPhrase()
	 * @generated
	 */
	EAttribute getGroupPhrase_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.TypeNoun <em>Type Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Noun</em>'.
	 * @see NBVR.Grammar.TypeNoun
	 * @generated
	 */
	EClass getTypeNoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.TypeNoun#getNoun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Noun</em>'.
	 * @see NBVR.Grammar.TypeNoun#getNoun()
	 * @see #getTypeNoun()
	 * @generated
	 */
	EReference getTypeNoun_Noun();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.ModifiedTerm <em>Modified Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modified Term</em>'.
	 * @see NBVR.Grammar.ModifiedTerm
	 * @generated
	 */
	EClass getModifiedTerm();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ModifiedTerm#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantifier</em>'.
	 * @see NBVR.Grammar.ModifiedTerm#getQuantifier()
	 * @see #getModifiedTerm()
	 * @generated
	 */
	EReference getModifiedTerm_Quantifier();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.ModifiedTerm#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifiers</em>'.
	 * @see NBVR.Grammar.ModifiedTerm#getModifiers()
	 * @see #getModifiedTerm()
	 * @generated
	 */
	EReference getModifiedTerm_Modifiers();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.ModifiedTerm#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifiers</em>'.
	 * @see NBVR.Grammar.ModifiedTerm#getQualifiers()
	 * @see #getModifiedTerm()
	 * @generated
	 */
	EReference getModifiedTerm_Qualifiers();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantifier</em>'.
	 * @see NBVR.Grammar.Quantifier
	 * @generated
	 */
	EClass getQuantifier();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Quantifier#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Grammar.Quantifier#getKind()
	 * @see #getQuantifier()
	 * @generated
	 */
	EAttribute getQuantifier_Kind();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Quantifier#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see NBVR.Grammar.Quantifier#getCount()
	 * @see #getQuantifier()
	 * @generated
	 */
	EAttribute getQuantifier_Count();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Quantifier#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity</em>'.
	 * @see NBVR.Grammar.Quantifier#getQuantity()
	 * @see #getQuantifier()
	 * @generated
	 */
	EReference getQuantifier_Quantity();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see NBVR.Grammar.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Modifier#getAdjective <em>Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adjective</em>'.
	 * @see NBVR.Grammar.Modifier#getAdjective()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_Adjective();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Modifier#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Grammar.Modifier#getKind()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Kind();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Modifier#getRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relative</em>'.
	 * @see NBVR.Grammar.Modifier#getRelative()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_Relative();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see NBVR.Grammar.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.SimpleQualifier <em>Simple Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Qualifier</em>'.
	 * @see NBVR.Grammar.SimpleQualifier
	 * @generated
	 */
	EClass getSimpleQualifier();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.SimpleQualifier#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see NBVR.Grammar.SimpleQualifier#getCondition()
	 * @see #getSimpleQualifier()
	 * @generated
	 */
	EReference getSimpleQualifier_Condition();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.SimpleQualifier#getBoundForm <em>Bound Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Form</em>'.
	 * @see NBVR.Grammar.SimpleQualifier#getBoundForm()
	 * @see #getSimpleQualifier()
	 * @generated
	 */
	EReference getSimpleQualifier_BoundForm();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.SimpleQualifier#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain</em>'.
	 * @see NBVR.Grammar.SimpleQualifier#getChain()
	 * @see #getSimpleQualifier()
	 * @generated
	 */
	EReference getSimpleQualifier_Chain();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.QualifierChain <em>Qualifier Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier Chain</em>'.
	 * @see NBVR.Grammar.QualifierChain
	 * @generated
	 */
	EClass getQualifierChain();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.QualifierChain#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifiers</em>'.
	 * @see NBVR.Grammar.QualifierChain#getQualifiers()
	 * @see #getQualifierChain()
	 * @generated
	 */
	EReference getQualifierChain_Qualifiers();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see NBVR.Grammar.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.PropertyNoun <em>Property Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Noun</em>'.
	 * @see NBVR.Grammar.PropertyNoun
	 * @generated
	 */
	EClass getPropertyNoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.PropertyNoun#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see NBVR.Grammar.PropertyNoun#getDomain()
	 * @see #getPropertyNoun()
	 * @generated
	 */
	EReference getPropertyNoun_Domain();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.PropertyNoun#getExpansion <em>Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expansion</em>'.
	 * @see NBVR.Grammar.PropertyNoun#getExpansion()
	 * @see #getPropertyNoun()
	 * @generated
	 */
	EReference getPropertyNoun_Expansion();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.PropertyNoun#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see NBVR.Grammar.PropertyNoun#getProperty()
	 * @see #getPropertyNoun()
	 * @generated
	 */
	EReference getPropertyNoun_Property();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.RoleNoun <em>Role Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Noun</em>'.
	 * @see NBVR.Grammar.RoleNoun
	 * @generated
	 */
	EClass getRoleNoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.RoleNoun#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see NBVR.Grammar.RoleNoun#getRole()
	 * @see #getRoleNoun()
	 * @generated
	 */
	EReference getRoleNoun_Role();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.VerbPhrase <em>Verb Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb Phrase</em>'.
	 * @see NBVR.Grammar.VerbPhrase
	 * @generated
	 */
	EClass getVerbPhrase();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.VerbPhrase#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verb</em>'.
	 * @see NBVR.Grammar.VerbPhrase#getVerb()
	 * @see #getVerbPhrase()
	 * @generated
	 */
	EReference getVerbPhrase_Verb();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.VerbPhrase#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see NBVR.Grammar.VerbPhrase#getModality()
	 * @see #getVerbPhrase()
	 * @generated
	 */
	EAttribute getVerbPhrase_Modality();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.VerbPhrase#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see NBVR.Grammar.VerbPhrase#isNegated()
	 * @see #getVerbPhrase()
	 * @generated
	 */
	EAttribute getVerbPhrase_Negated();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.SimpleForm <em>Simple Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Form</em>'.
	 * @see NBVR.Grammar.SimpleForm
	 * @generated
	 */
	EClass getSimpleForm();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Grammar.SimpleForm#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verb</em>'.
	 * @see NBVR.Grammar.SimpleForm#getVerb()
	 * @see #getSimpleForm()
	 * @generated
	 */
	EReference getSimpleForm_Verb();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Grammar.SimpleForm#getPartPhrases <em>Part Phrases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part Phrases</em>'.
	 * @see NBVR.Grammar.SimpleForm#getPartPhrases()
	 * @see #getSimpleForm()
	 * @generated
	 */
	EReference getSimpleForm_PartPhrases();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.SimpleForm#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see NBVR.Grammar.SimpleForm#getSubject()
	 * @see #getSimpleForm()
	 * @generated
	 */
	EReference getSimpleForm_Subject();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.SimpleForm#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see NBVR.Grammar.SimpleForm#getObject()
	 * @see #getSimpleForm()
	 * @generated
	 */
	EReference getSimpleForm_Object();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see NBVR.Grammar.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Sentence#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see NBVR.Grammar.Sentence#getDomain()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Domain();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Sentence#getRewrites <em>Rewrites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rewrites</em>'.
	 * @see NBVR.Grammar.Sentence#getRewrites()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Rewrites();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Parse <em>Parse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parse</em>'.
	 * @see NBVR.Grammar.Parse
	 * @generated
	 */
	EClass getParse();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.PartPhrase <em>Part Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Phrase</em>'.
	 * @see NBVR.Grammar.PartPhrase
	 * @generated
	 */
	EClass getPartPhrase();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.PartPhrase#getPartRole <em>Part Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Role</em>'.
	 * @see NBVR.Grammar.PartPhrase#getPartRole()
	 * @see #getPartPhrase()
	 * @generated
	 */
	EReference getPartPhrase_PartRole();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.PartPhrase#getParticle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Particle</em>'.
	 * @see NBVR.Grammar.PartPhrase#getParticle()
	 * @see #getPartPhrase()
	 * @generated
	 */
	EReference getPartPhrase_Particle();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.ImplicationForm <em>Implication Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Form</em>'.
	 * @see NBVR.Grammar.ImplicationForm
	 * @generated
	 */
	EClass getImplicationForm();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ImplicationForm#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent</em>'.
	 * @see NBVR.Grammar.ImplicationForm#getAntecedent()
	 * @see #getImplicationForm()
	 * @generated
	 */
	EReference getImplicationForm_Antecedent();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ImplicationForm#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequent</em>'.
	 * @see NBVR.Grammar.ImplicationForm#getConsequent()
	 * @see #getImplicationForm()
	 * @generated
	 */
	EReference getImplicationForm_Consequent();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ImplicationForm#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternative</em>'.
	 * @see NBVR.Grammar.ImplicationForm#getAlternative()
	 * @see #getImplicationForm()
	 * @generated
	 */
	EReference getImplicationForm_Alternative();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.ImplicationForm#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Grammar.ImplicationForm#getKind()
	 * @see #getImplicationForm()
	 * @generated
	 */
	EAttribute getImplicationForm_Kind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.SentenceType <em>Sentence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sentence Type</em>'.
	 * @see NBVR.Grammar.SentenceType
	 * @generated
	 */
	EEnum getSentenceType();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.QueryKind <em>Query Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Kind</em>'.
	 * @see NBVR.Grammar.QueryKind
	 * @generated
	 */
	EEnum getQueryKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.ElementKind <em>Element Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Kind</em>'.
	 * @see NBVR.Grammar.ElementKind
	 * @generated
	 */
	EEnum getElementKind();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.CompoundForm <em>Compound Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Form</em>'.
	 * @see NBVR.Grammar.CompoundForm
	 * @generated
	 */
	EClass getCompoundForm();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.CompoundForm#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see NBVR.Grammar.CompoundForm#getStatements()
	 * @see #getCompoundForm()
	 * @generated
	 */
	EReference getCompoundForm_Statements();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.CompoundForm#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Grammar.CompoundForm#getKind()
	 * @see #getCompoundForm()
	 * @generated
	 */
	EAttribute getCompoundForm_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.LexicalInstance <em>Lexical Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexical Instance</em>'.
	 * @see NBVR.Grammar.LexicalInstance
	 * @generated
	 */
	EClass getLexicalInstance();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.LexicalInstance#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Word</em>'.
	 * @see NBVR.Grammar.LexicalInstance#getWord()
	 * @see #getLexicalInstance()
	 * @generated
	 */
	EReference getLexicalInstance_Word();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Nominalization <em>Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominalization</em>'.
	 * @see NBVR.Grammar.Nominalization
	 * @generated
	 */
	EClass getNominalization();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Nominalization#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sentence</em>'.
	 * @see NBVR.Grammar.Nominalization#getSentence()
	 * @see #getNominalization()
	 * @generated
	 */
	EReference getNominalization_Sentence();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see NBVR.Grammar.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see NBVR.Grammar.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Question#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see NBVR.Grammar.Question#getQuery()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Query();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Question#getQueryPhrase <em>Query Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Phrase</em>'.
	 * @see NBVR.Grammar.Question#getQueryPhrase()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_QueryPhrase();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.QueryPhrase <em>Query Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Phrase</em>'.
	 * @see NBVR.Grammar.QueryPhrase
	 * @generated
	 */
	EClass getQueryPhrase();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.QueryPhrase#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see NBVR.Grammar.QueryPhrase#getDomain()
	 * @see #getQueryPhrase()
	 * @generated
	 */
	EReference getQueryPhrase_Domain();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.QueryPhrase#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see NBVR.Grammar.QueryPhrase#getQuery()
	 * @see #getQueryPhrase()
	 * @generated
	 */
	EAttribute getQueryPhrase_Query();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.QueryPhrase#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see NBVR.Grammar.QueryPhrase#getQuestion()
	 * @see #getQueryPhrase()
	 * @generated
	 */
	EReference getQueryPhrase_Question();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Pronoun <em>Pronoun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pronoun</em>'.
	 * @see NBVR.Grammar.Pronoun
	 * @generated
	 */
	EClass getPronoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Pronoun#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keyword</em>'.
	 * @see NBVR.Grammar.Pronoun#getKeyword()
	 * @see #getPronoun()
	 * @generated
	 */
	EReference getPronoun_Keyword();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Intension <em>Intension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intension</em>'.
	 * @see NBVR.Grammar.Intension
	 * @generated
	 */
	EClass getIntension();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Intension#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see NBVR.Grammar.Intension#getConcept()
	 * @see #getIntension()
	 * @generated
	 */
	EReference getIntension_Concept();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.DomainForm <em>Domain Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Form</em>'.
	 * @see NBVR.Grammar.DomainForm
	 * @generated
	 */
	EClass getDomainForm();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.DomainForm#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see NBVR.Grammar.DomainForm#getStatement()
	 * @see #getDomainForm()
	 * @generated
	 */
	EReference getDomainForm_Statement();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.DomainForm#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see NBVR.Grammar.DomainForm#getModality()
	 * @see #getDomainForm()
	 * @generated
	 */
	EAttribute getDomainForm_Modality();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.LocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Name</em>'.
	 * @see NBVR.Grammar.LocalName
	 * @generated
	 */
	EClass getLocalName();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.LocalName#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Word</em>'.
	 * @see NBVR.Grammar.LocalName#getWord()
	 * @see #getLocalName()
	 * @generated
	 */
	EReference getLocalName_Word();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.LocalName#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see NBVR.Grammar.LocalName#getNext()
	 * @see #getLocalName()
	 * @generated
	 */
	EReference getLocalName_Next();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see NBVR.Grammar.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Quantity#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Factor</em>'.
	 * @see NBVR.Grammar.Quantity#getFactor()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Factor();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Grammar.Quantity#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension</em>'.
	 * @see NBVR.Grammar.Quantity#getDimension()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Dimension();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see NBVR.Grammar.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.Dimension#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see NBVR.Grammar.Dimension#getUnit()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Unit();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Grammar.Dimension#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see NBVR.Grammar.Dimension#getExponent()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Exponent();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.ParseElement <em>Parse Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parse Element</em>'.
	 * @see NBVR.Grammar.ParseElement
	 * @generated
	 */
	EClass getParseElement();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ParseElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see NBVR.Grammar.ParseElement#getParent()
	 * @see #getParseElement()
	 * @generated
	 */
	EReference getParseElement_Parent();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.InstanceKind <em>Instance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Kind</em>'.
	 * @see NBVR.Grammar.InstanceKind
	 * @generated
	 */
	EEnum getInstanceKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.Connective <em>Connective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connective</em>'.
	 * @see NBVR.Grammar.Connective
	 * @generated
	 */
	EEnum getConnective();

	/**
	 * Returns the meta object for class '{@link NBVR.Grammar.ProperName <em>Proper Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proper Name</em>'.
	 * @see NBVR.Grammar.ProperName
	 * @generated
	 */
	EClass getProperName();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Grammar.ProperName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see NBVR.Grammar.ProperName#getName()
	 * @see #getProperName()
	 * @generated
	 */
	EReference getProperName_Name();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.GroupKind <em>Group Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Kind</em>'.
	 * @see NBVR.Grammar.GroupKind
	 * @generated
	 */
	EEnum getGroupKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.QuantifierKind <em>Quantifier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier Kind</em>'.
	 * @see NBVR.Grammar.QuantifierKind
	 * @generated
	 */
	EEnum getQuantifierKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.Modality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality</em>'.
	 * @see NBVR.Grammar.Modality
	 * @generated
	 */
	EEnum getModality();

	/**
	 * Returns the meta object for enum '{@link NBVR.Grammar.PhraseType <em>Phrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phrase Type</em>'.
	 * @see NBVR.Grammar.PhraseType
	 * @generated
	 */
	EEnum getPhraseType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

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
		 * The meta object literal for the '{@link NBVR.Grammar.impl.RolePhraseImpl <em>Role Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.RolePhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getRolePhrase()
		 * @generated
		 */
		EClass ROLE_PHRASE = eINSTANCE.getRolePhrase();

		/**
		 * The meta object literal for the '<em><b>Role Played</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PHRASE__ROLE_PLAYED = eINSTANCE.getRolePhrase_RolePlayed();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PHRASE__VARIABLE = eINSTANCE.getRolePhrase_Variable();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PHRASE__REFERENT = eINSTANCE.getRolePhrase_Referent();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.SimpleNounPhraseImpl <em>Simple Noun Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.SimpleNounPhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleNounPhrase()
		 * @generated
		 */
		EClass SIMPLE_NOUN_PHRASE = eINSTANCE.getSimpleNounPhrase();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ConditionImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OTHERWISE = eINSTANCE.getCondition_Otherwise();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__QUALIFIER = eINSTANCE.getCondition_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ANTECEDENT = eINSTANCE.getCondition_Antecedent();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.GroupPhraseImpl <em>Group Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.GroupPhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getGroupPhrase()
		 * @generated
		 */
		EClass GROUP_PHRASE = eINSTANCE.getGroupPhrase();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_PHRASE__MEMBERS = eINSTANCE.getGroupPhrase_Members();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_PHRASE__KIND = eINSTANCE.getGroupPhrase_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.TypeNounImpl <em>Type Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.TypeNounImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getTypeNoun()
		 * @generated
		 */
		EClass TYPE_NOUN = eINSTANCE.getTypeNoun();

		/**
		 * The meta object literal for the '<em><b>Noun</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NOUN__NOUN = eINSTANCE.getTypeNoun_Noun();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ModifiedTermImpl <em>Modified Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ModifiedTermImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModifiedTerm()
		 * @generated
		 */
		EClass MODIFIED_TERM = eINSTANCE.getModifiedTerm();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TERM__QUANTIFIER = eINSTANCE.getModifiedTerm_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TERM__MODIFIERS = eINSTANCE.getModifiedTerm_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIED_TERM__QUALIFIERS = eINSTANCE.getModifiedTerm_Qualifiers();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QuantifierImpl <em>Quantifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QuantifierImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantifier()
		 * @generated
		 */
		EClass QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIER__KIND = eINSTANCE.getQuantifier_Kind();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIER__COUNT = eINSTANCE.getQuantifier_Count();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIER__QUANTITY = eINSTANCE.getQuantifier_Quantity();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ModifierImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Adjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__ADJECTIVE = eINSTANCE.getModifier_Adjective();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__KIND = eINSTANCE.getModifier_Kind();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__RELATIVE = eINSTANCE.getModifier_Relative();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QualifierImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.SimpleQualifierImpl <em>Simple Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.SimpleQualifierImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleQualifier()
		 * @generated
		 */
		EClass SIMPLE_QUALIFIER = eINSTANCE.getSimpleQualifier();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QUALIFIER__CONDITION = eINSTANCE.getSimpleQualifier_Condition();

		/**
		 * The meta object literal for the '<em><b>Bound Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QUALIFIER__BOUND_FORM = eINSTANCE.getSimpleQualifier_BoundForm();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_QUALIFIER__CHAIN = eINSTANCE.getSimpleQualifier_Chain();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QualifierChainImpl <em>Qualifier Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QualifierChainImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQualifierChain()
		 * @generated
		 */
		EClass QUALIFIER_CHAIN = eINSTANCE.getQualifierChain();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_CHAIN__QUALIFIERS = eINSTANCE.getQualifierChain_Qualifiers();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.InstanceImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.PropertyNounImpl <em>Property Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.PropertyNounImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPropertyNoun()
		 * @generated
		 */
		EClass PROPERTY_NOUN = eINSTANCE.getPropertyNoun();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_NOUN__DOMAIN = eINSTANCE.getPropertyNoun_Domain();

		/**
		 * The meta object literal for the '<em><b>Expansion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_NOUN__EXPANSION = eINSTANCE.getPropertyNoun_Expansion();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_NOUN__PROPERTY = eINSTANCE.getPropertyNoun_Property();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.RoleNounImpl <em>Role Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.RoleNounImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getRoleNoun()
		 * @generated
		 */
		EClass ROLE_NOUN = eINSTANCE.getRoleNoun();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NOUN__ROLE = eINSTANCE.getRoleNoun_Role();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.VerbPhraseImpl <em>Verb Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.VerbPhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getVerbPhrase()
		 * @generated
		 */
		EClass VERB_PHRASE = eINSTANCE.getVerbPhrase();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB_PHRASE__VERB = eINSTANCE.getVerbPhrase_Verb();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERB_PHRASE__MODALITY = eINSTANCE.getVerbPhrase_Modality();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERB_PHRASE__NEGATED = eINSTANCE.getVerbPhrase_Negated();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.SimpleFormImpl <em>Simple Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.SimpleFormImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSimpleForm()
		 * @generated
		 */
		EClass SIMPLE_FORM = eINSTANCE.getSimpleForm();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FORM__VERB = eINSTANCE.getSimpleForm_Verb();

		/**
		 * The meta object literal for the '<em><b>Part Phrases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FORM__PART_PHRASES = eINSTANCE.getSimpleForm_PartPhrases();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FORM__SUBJECT = eINSTANCE.getSimpleForm_Subject();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FORM__OBJECT = eINSTANCE.getSimpleForm_Object();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.SentenceImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__DOMAIN = eINSTANCE.getSentence_Domain();

		/**
		 * The meta object literal for the '<em><b>Rewrites</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__REWRITES = eINSTANCE.getSentence_Rewrites();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ParseImpl <em>Parse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ParseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getParse()
		 * @generated
		 */
		EClass PARSE = eINSTANCE.getParse();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.PartPhraseImpl <em>Part Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.PartPhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPartPhrase()
		 * @generated
		 */
		EClass PART_PHRASE = eINSTANCE.getPartPhrase();

		/**
		 * The meta object literal for the '<em><b>Part Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_PHRASE__PART_ROLE = eINSTANCE.getPartPhrase_PartRole();

		/**
		 * The meta object literal for the '<em><b>Particle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART_PHRASE__PARTICLE = eINSTANCE.getPartPhrase_Particle();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ImplicationFormImpl <em>Implication Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ImplicationFormImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getImplicationForm()
		 * @generated
		 */
		EClass IMPLICATION_FORM = eINSTANCE.getImplicationForm();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_FORM__ANTECEDENT = eINSTANCE.getImplicationForm_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_FORM__CONSEQUENT = eINSTANCE.getImplicationForm_Consequent();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_FORM__ALTERNATIVE = eINSTANCE.getImplicationForm_Alternative();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICATION_FORM__KIND = eINSTANCE.getImplicationForm_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.SentenceType <em>Sentence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.SentenceType
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getSentenceType()
		 * @generated
		 */
		EEnum SENTENCE_TYPE = eINSTANCE.getSentenceType();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.QueryKind <em>Query Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.QueryKind
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQueryKind()
		 * @generated
		 */
		EEnum QUERY_KIND = eINSTANCE.getQueryKind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.ElementKind <em>Element Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.ElementKind
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getElementKind()
		 * @generated
		 */
		EEnum ELEMENT_KIND = eINSTANCE.getElementKind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.CompoundFormImpl <em>Compound Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.CompoundFormImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getCompoundForm()
		 * @generated
		 */
		EClass COMPOUND_FORM = eINSTANCE.getCompoundForm();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FORM__STATEMENTS = eINSTANCE.getCompoundForm_Statements();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_FORM__KIND = eINSTANCE.getCompoundForm_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.LexicalInstanceImpl <em>Lexical Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.LexicalInstanceImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getLexicalInstance()
		 * @generated
		 */
		EClass LEXICAL_INSTANCE = eINSTANCE.getLexicalInstance();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEXICAL_INSTANCE__WORD = eINSTANCE.getLexicalInstance_Word();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.NominalizationImpl <em>Nominalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.NominalizationImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getNominalization()
		 * @generated
		 */
		EClass NOMINALIZATION = eINSTANCE.getNominalization();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMINALIZATION__SENTENCE = eINSTANCE.getNominalization_Sentence();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.StatementImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QuestionImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUERY = eINSTANCE.getQuestion_Query();

		/**
		 * The meta object literal for the '<em><b>Query Phrase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUERY_PHRASE = eINSTANCE.getQuestion_QueryPhrase();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QueryPhraseImpl <em>Query Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QueryPhraseImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQueryPhrase()
		 * @generated
		 */
		EClass QUERY_PHRASE = eINSTANCE.getQueryPhrase();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PHRASE__DOMAIN = eINSTANCE.getQueryPhrase_Domain();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PHRASE__QUERY = eINSTANCE.getQueryPhrase_Query();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_PHRASE__QUESTION = eINSTANCE.getQueryPhrase_Question();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.PronounImpl <em>Pronoun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.PronounImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPronoun()
		 * @generated
		 */
		EClass PRONOUN = eINSTANCE.getPronoun();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRONOUN__KEYWORD = eINSTANCE.getPronoun_Keyword();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.IntensionImpl <em>Intension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.IntensionImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getIntension()
		 * @generated
		 */
		EClass INTENSION = eINSTANCE.getIntension();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENSION__CONCEPT = eINSTANCE.getIntension_Concept();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.DomainFormImpl <em>Domain Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.DomainFormImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getDomainForm()
		 * @generated
		 */
		EClass DOMAIN_FORM = eINSTANCE.getDomainForm();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_FORM__STATEMENT = eINSTANCE.getDomainForm_Statement();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FORM__MODALITY = eINSTANCE.getDomainForm_Modality();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.LocalNameImpl <em>Local Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.LocalNameImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getLocalName()
		 * @generated
		 */
		EClass LOCAL_NAME = eINSTANCE.getLocalName();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NAME__WORD = eINSTANCE.getLocalName_Word();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NAME__NEXT = eINSTANCE.getLocalName_Next();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.QuantityImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__FACTOR = eINSTANCE.getQuantity_Factor();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__DIMENSION = eINSTANCE.getQuantity_Dimension();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.DimensionImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__UNIT = eINSTANCE.getDimension_Unit();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXPONENT = eINSTANCE.getDimension_Exponent();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ParseElementImpl <em>Parse Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ParseElementImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getParseElement()
		 * @generated
		 */
		EClass PARSE_ELEMENT = eINSTANCE.getParseElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSE_ELEMENT__PARENT = eINSTANCE.getParseElement_Parent();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.InstanceKind <em>Instance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.InstanceKind
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getInstanceKind()
		 * @generated
		 */
		EEnum INSTANCE_KIND = eINSTANCE.getInstanceKind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.Connective <em>Connective</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.Connective
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getConnective()
		 * @generated
		 */
		EEnum CONNECTIVE = eINSTANCE.getConnective();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.impl.ProperNameImpl <em>Proper Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.impl.ProperNameImpl
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getProperName()
		 * @generated
		 */
		EClass PROPER_NAME = eINSTANCE.getProperName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPER_NAME__NAME = eINSTANCE.getProperName_Name();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.GroupKind <em>Group Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.GroupKind
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getGroupKind()
		 * @generated
		 */
		EEnum GROUP_KIND = eINSTANCE.getGroupKind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.QuantifierKind <em>Quantifier Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.QuantifierKind
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getQuantifierKind()
		 * @generated
		 */
		EEnum QUANTIFIER_KIND = eINSTANCE.getQuantifierKind();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.Modality <em>Modality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.Modality
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getModality()
		 * @generated
		 */
		EEnum MODALITY = eINSTANCE.getModality();

		/**
		 * The meta object literal for the '{@link NBVR.Grammar.PhraseType <em>Phrase Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Grammar.PhraseType
		 * @see NBVR.Grammar.impl.GrammarPackageImpl#getPhraseType()
		 * @generated
		 */
		EEnum PHRASE_TYPE = eINSTANCE.getPhraseType();

	}

} //GrammarPackage
