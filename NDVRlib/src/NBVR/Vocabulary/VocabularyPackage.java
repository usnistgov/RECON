/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

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
 * @see NBVR.Vocabulary.VocabularyFactory
 * @model kind="package"
 * @generated
 */
public interface VocabularyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Vocabulary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///NBVR/Vocabulary.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NBVR.Vocabulary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VocabularyPackage eINSTANCE = NBVR.Vocabulary.impl.VocabularyPackageImpl.init();

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.WordImpl <em>Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.WordImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__BASE = 0;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__BEGINS_TERM = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.AdjectiveImpl <em>Adjective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.AdjectiveImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getAdjective()
	 * @generated
	 */
	int ADJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE__NEXT = WORD__NEXT;

	/**
	 * The number of structural features of the '<em>Adjective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.TermImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 3;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocabularyItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocabularyItemImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocabularyItem()
	 * @generated
	 */
	int VOCABULARY_ITEM = 4;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.FormulationImpl <em>Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.FormulationImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormulation()
	 * @generated
	 */
	int FORMULATION = 5;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.FormulationFormImpl <em>Formulation Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.FormulationFormImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormulationForm()
	 * @generated
	 */
	int FORMULATION_FORM = 6;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VerbRoleImpl <em>Verb Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VerbRoleImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVerbRole()
	 * @generated
	 */
	int VERB_ROLE = 7;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocNounImpl <em>Voc Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocNounImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocNoun()
	 * @generated
	 */
	int VOC_NOUN = 8;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocPropertyImpl <em>Voc Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocPropertyImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocProperty()
	 * @generated
	 */
	int VOC_PROPERTY = 12;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.SyntaxFormImpl <em>Syntax Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.SyntaxFormImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getSyntaxForm()
	 * @generated
	 */
	int SYNTAX_FORM = 10;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.FormElementImpl <em>Form Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.FormElementImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormElement()
	 * @generated
	 */
	int FORM_ELEMENT = 11;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.WordFormImpl <em>Word Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.WordFormImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getWordForm()
	 * @generated
	 */
	int WORD_FORM = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FORM__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FORM__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FORM__WORD = 2;

	/**
	 * The feature id for the '<em><b>Alt Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FORM__ALT_WORD = 3;

	/**
	 * The number of structural features of the '<em>Word Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FORM_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONCEPT = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Particle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PARTICLE = 2;

	/**
	 * The feature id for the '<em><b>Words</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__WORDS = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TEXT = 6;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ITEM__FORMULATIONS = 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ITEM__BASE = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ITEM__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ITEM__TERMS = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ITEM_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__FORM = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__CONCEPT = 4;

	/**
	 * The number of structural features of the '<em>Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_FORM__FORMULATION = 0;

	/**
	 * The number of structural features of the '<em>Formulation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_FORM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.AdjunctImpl <em>Adjunct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.AdjunctImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getAdjunct()
	 * @generated
	 */
	int ADJUNCT = 21;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.KeywordImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 19;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.NounImpl <em>Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.NounImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getNoun()
	 * @generated
	 */
	int NOUN = 22;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.NameImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 23;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.ParticleImpl <em>Particle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.ParticleImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getParticle()
	 * @generated
	 */
	int PARTICLE = 17;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.RoleElementImpl <em>Role Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.RoleElementImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getRoleElement()
	 * @generated
	 */
	int ROLE_ELEMENT = 18;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VerbImpl <em>Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VerbImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVerb()
	 * @generated
	 */
	int VERB = 24;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocAdjectiveImpl <em>Voc Adjective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocAdjectiveImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocAdjective()
	 * @generated
	 */
	int VOC_ADJECTIVE = 16;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocVerbImpl <em>Voc Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocVerbImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocVerb()
	 * @generated
	 */
	int VOC_VERB = 9;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.DictionaryImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 25;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_ROLE__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_ROLE__VERB = 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_ROLE__TERM = 2;

	/**
	 * The feature id for the '<em><b>Is Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_ROLE__IS_RANGE = 3;

	/**
	 * The number of structural features of the '<em>Verb Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_ROLE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__FORMULATIONS = VOCABULARY_ITEM__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__BASE = VOCABULARY_ITEM__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__NEXT = VOCABULARY_ITEM__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__TERMS = VOCABULARY_ITEM__TERMS;

	/**
	 * The feature id for the '<em><b>Is AVerb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__IS_AVERB = VOCABULARY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__PREDICATE = VOCABULARY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mass Noun</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN__MASS_NOUN = VOCABULARY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Voc Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NOUN_FEATURE_COUNT = VOCABULARY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__FORMULATIONS = VOCABULARY_ITEM__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__BASE = VOCABULARY_ITEM__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__NEXT = VOCABULARY_ITEM__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__TERMS = VOCABULARY_ITEM__TERMS;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__ARITY = VOCABULARY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__ROLES = VOCABULARY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__FORM = VOCABULARY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB__PREDICATE = VOCABULARY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Voc Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_VERB_FEATURE_COUNT = VOCABULARY_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Is Aux Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM__IS_AUX_FORM = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM__VERB = 4;

	/**
	 * The number of structural features of the '<em>Syntax Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FORM_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__KIND = 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT__FORM = 1;

	/**
	 * The number of structural features of the '<em>Form Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__FORMULATIONS = VOCABULARY_ITEM__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__BASE = VOCABULARY_ITEM__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__NEXT = VOCABULARY_ITEM__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__TERMS = VOCABULARY_ITEM__TERMS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__DOMAIN = VOCABULARY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__RANGE = VOCABULARY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__VERB = VOCABULARY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Form</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY__PROPERTY_FORM = VOCABULARY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Voc Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_PROPERTY_FEATURE_COUNT = VOCABULARY_ITEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.NumberWordImpl <em>Number Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.NumberWordImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getNumberWord()
	 * @generated
	 */
	int NUMBER_WORD = 13;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD__NEXT = WORD__NEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD__VALUE = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD__DECIMAL = WORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_WORD_FEATURE_COUNT = WORD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.ItemElementImpl <em>Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.ItemElementImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getItemElement()
	 * @generated
	 */
	int ITEM_ELEMENT = 20;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.TerminologyImpl <em>Terminology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.TerminologyImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getTerminology()
	 * @generated
	 */
	int TERMINOLOGY = 29;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.DateTimeImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 28;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.DefinitionImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 27;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocNameImpl <em>Voc Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocNameImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocName()
	 * @generated
	 */
	int VOC_NAME = 15;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NAME__FORMULATIONS = VOCABULARY_ITEM__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NAME__BASE = VOCABULARY_ITEM__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NAME__NEXT = VOCABULARY_ITEM__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NAME__TERMS = VOCABULARY_ITEM__TERMS;

	/**
	 * The number of structural features of the '<em>Voc Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_NAME_FEATURE_COUNT = VOCABULARY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.StringWordImpl <em>String Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.StringWordImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getStringWord()
	 * @generated
	 */
	int STRING_WORD = 26;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.VocUnitImpl <em>Voc Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.VocUnitImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocUnit()
	 * @generated
	 */
	int VOC_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT__FORMULATIONS = VOC_NAME__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT__BASE = VOC_NAME__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT__NEXT = VOC_NAME__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT__TERMS = VOC_NAME__TERMS;

	/**
	 * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT__QUANTITY_KIND = VOC_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voc Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_UNIT_FEATURE_COUNT = VOC_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__FORMULATIONS = VOCABULARY_ITEM__FORMULATIONS;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__BASE = VOCABULARY_ITEM__BASE;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__NEXT = VOCABULARY_ITEM__NEXT;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__TERMS = VOCABULARY_ITEM__TERMS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__DOMAIN = VOCABULARY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE__VERB = VOCABULARY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Voc Adjective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOC_ADJECTIVE_FEATURE_COUNT = VOCABULARY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__KIND = FORM_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__FORM = FORM_ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__ROLE = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE__TERM = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Particle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICLE_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ELEMENT__KIND = FORM_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ELEMENT__FORM = FORM_ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ELEMENT__ROLE = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ELEMENT__SLOT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ELEMENT_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__NEXT = WORD__NEXT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__KIND = WORD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = WORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT__KIND = FORM_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Form</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT__FORM = FORM_ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT__TERM = FORM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ELEMENT_FEATURE_COUNT = FORM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT__NEXT = WORD__NEXT;

	/**
	 * The number of structural features of the '<em>Adjunct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUNCT_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__NEXT = WORD__NEXT;

	/**
	 * The feature id for the '<em><b>Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__PLURAL = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__ALT_PLURAL = WORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FEATURE_COUNT = WORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NEXT = WORD__NEXT;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__NEXT = WORD__NEXT;

	/**
	 * The feature id for the '<em><b>Singular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__SINGULAR = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__PLURAL = WORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__PAST = WORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Progressive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__PROGRESSIVE = WORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perfective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__PERFECTIVE = WORD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alt Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__ALT_PAST = WORD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_FEATURE_COUNT = WORD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>First Word</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__FIRST_WORD = 0;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WORD__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WORD__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WORD__NEXT = WORD__NEXT;

	/**
	 * The number of structural features of the '<em>String Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WORD_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__FORM = FORMULATION__FORM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__TEXT = FORMULATION__TEXT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LANGUAGE = FORMULATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ELEMENTS = FORMULATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CONCEPT = FORMULATION__CONCEPT;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = FORMULATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__BASE = WORD__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__BEGINS_TERM = WORD__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__NEXT = WORD__NEXT;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY__FIRST_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Last Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY__LAST_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Terminology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.impl.IsVerbImpl <em>Is Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.impl.IsVerbImpl
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getIsVerb()
	 * @generated
	 */
	int IS_VERB = 30;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__BASE = VERB__BASE;

	/**
	 * The feature id for the '<em><b>Begins Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__BEGINS_TERM = VERB__BEGINS_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__NEXT = VERB__NEXT;

	/**
	 * The feature id for the '<em><b>Singular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__SINGULAR = VERB__SINGULAR;

	/**
	 * The feature id for the '<em><b>Plural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__PLURAL = VERB__PLURAL;

	/**
	 * The feature id for the '<em><b>Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__PAST = VERB__PAST;

	/**
	 * The feature id for the '<em><b>Progressive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__PROGRESSIVE = VERB__PROGRESSIVE;

	/**
	 * The feature id for the '<em><b>Perfective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__PERFECTIVE = VERB__PERFECTIVE;

	/**
	 * The feature id for the '<em><b>Alt Past</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB__ALT_PAST = VERB__ALT_PAST;

	/**
	 * The number of structural features of the '<em>Is Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VERB_FEATURE_COUNT = VERB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.VocItemKind <em>Voc Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.VocItemKind
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocItemKind()
	 * @generated
	 */
	int VOC_ITEM_KIND = 33;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.FormElementKind <em>Form Element Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.FormElementKind
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormElementKind()
	 * @generated
	 */
	int FORM_ELEMENT_KIND = 31;

	/**
	 * The meta object id for the '{@link NBVR.Vocabulary.KeywordKind <em>Keyword Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NBVR.Vocabulary.KeywordKind
	 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getKeywordKind()
	 * @generated
	 */
	int KEYWORD_KIND = 32;


	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Adjective <em>Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjective</em>'.
	 * @see NBVR.Vocabulary.Adjective
	 * @generated
	 */
	EClass getAdjective();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word</em>'.
	 * @see NBVR.Vocabulary.Word
	 * @generated
	 */
	EClass getWord();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Word#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see NBVR.Vocabulary.Word#getBase()
	 * @see #getWord()
	 * @generated
	 */
	EReference getWord_Base();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Vocabulary.Word#getBeginsTerm <em>Begins Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Begins Term</em>'.
	 * @see NBVR.Vocabulary.Word#getBeginsTerm()
	 * @see #getWord()
	 * @generated
	 */
	EReference getWord_BeginsTerm();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Word#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see NBVR.Vocabulary.Word#getNext()
	 * @see #getWord()
	 * @generated
	 */
	EReference getWord_Next();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see NBVR.Vocabulary.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.Term#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concept</em>'.
	 * @see NBVR.Vocabulary.Term#getConcept()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Concept();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Vocabulary.Term#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Words</em>'.
	 * @see NBVR.Vocabulary.Term#getWords()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Words();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Term#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see NBVR.Vocabulary.Term#getContext()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Context();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.Term#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Role</em>'.
	 * @see NBVR.Vocabulary.Term#getRole()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Role();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Vocabulary.Term#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see NBVR.Vocabulary.Term#getElement()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Element();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.Term#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see NBVR.Vocabulary.Term#getText()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Text();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.Term#getParticle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Particle</em>'.
	 * @see NBVR.Vocabulary.Term#getParticle()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Particle();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocabularyItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see NBVR.Vocabulary.VocabularyItem
	 * @generated
	 */
	EClass getVocabularyItem();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.VocabularyItem#getFormulations <em>Formulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulations</em>'.
	 * @see NBVR.Vocabulary.VocabularyItem#getFormulations()
	 * @see #getVocabularyItem()
	 * @generated
	 */
	EReference getVocabularyItem_Formulations();

	/**
	 * Returns the meta object for the reference list '{@link NBVR.Vocabulary.VocabularyItem#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base</em>'.
	 * @see NBVR.Vocabulary.VocabularyItem#getBase()
	 * @see #getVocabularyItem()
	 * @generated
	 */
	EReference getVocabularyItem_Base();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.VocabularyItem#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see NBVR.Vocabulary.VocabularyItem#getNext()
	 * @see #getVocabularyItem()
	 * @generated
	 */
	EReference getVocabularyItem_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.VocabularyItem#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see NBVR.Vocabulary.VocabularyItem#getTerms()
	 * @see #getVocabularyItem()
	 * @generated
	 */
	EReference getVocabularyItem_Terms();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Formulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulation</em>'.
	 * @see NBVR.Vocabulary.Formulation
	 * @generated
	 */
	EClass getFormulation();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Formulation#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see NBVR.Vocabulary.Formulation#getForm()
	 * @see #getFormulation()
	 * @generated
	 */
	EReference getFormulation_Form();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.Formulation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see NBVR.Vocabulary.Formulation#getLanguage()
	 * @see #getFormulation()
	 * @generated
	 */
	EAttribute getFormulation_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.Formulation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see NBVR.Vocabulary.Formulation#getElements()
	 * @see #getFormulation()
	 * @generated
	 */
	EReference getFormulation_Elements();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.Formulation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see NBVR.Vocabulary.Formulation#getText()
	 * @see #getFormulation()
	 * @generated
	 */
	EAttribute getFormulation_Text();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.Formulation#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concept</em>'.
	 * @see NBVR.Vocabulary.Formulation#getConcept()
	 * @see #getFormulation()
	 * @generated
	 */
	EReference getFormulation_Concept();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.FormulationForm <em>Formulation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulation Form</em>'.
	 * @see NBVR.Vocabulary.FormulationForm
	 * @generated
	 */
	EClass getFormulationForm();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.FormulationForm#getFormulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formulation</em>'.
	 * @see NBVR.Vocabulary.FormulationForm#getFormulation()
	 * @see #getFormulationForm()
	 * @generated
	 */
	EReference getFormulationForm_Formulation();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VerbRole <em>Verb Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb Role</em>'.
	 * @see NBVR.Vocabulary.VerbRole
	 * @generated
	 */
	EClass getVerbRole();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VerbRole#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see NBVR.Vocabulary.VerbRole#getRange()
	 * @see #getVerbRole()
	 * @generated
	 */
	EReference getVerbRole_Range();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.VerbRole#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Verb</em>'.
	 * @see NBVR.Vocabulary.VerbRole#getVerb()
	 * @see #getVerbRole()
	 * @generated
	 */
	EReference getVerbRole_Verb();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.VerbRole#isRange <em>Is Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Range</em>'.
	 * @see NBVR.Vocabulary.VerbRole#isRange()
	 * @see #getVerbRole()
	 * @generated
	 */
	EAttribute getVerbRole_IsRange();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.VerbRole#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see NBVR.Vocabulary.VerbRole#getTerm()
	 * @see #getVerbRole()
	 * @generated
	 */
	EReference getVerbRole_Term();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocNoun <em>Voc Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Noun</em>'.
	 * @see NBVR.Vocabulary.VocNoun
	 * @generated
	 */
	EClass getVocNoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocNoun#getIsAVerb <em>Is AVerb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is AVerb</em>'.
	 * @see NBVR.Vocabulary.VocNoun#getIsAVerb()
	 * @see #getVocNoun()
	 * @generated
	 */
	EReference getVocNoun_IsAVerb();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.VocNoun#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see NBVR.Vocabulary.VocNoun#getPredicate()
	 * @see #getVocNoun()
	 * @generated
	 */
	EReference getVocNoun_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.VocNoun#isMassNoun <em>Mass Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass Noun</em>'.
	 * @see NBVR.Vocabulary.VocNoun#isMassNoun()
	 * @see #getVocNoun()
	 * @generated
	 */
	EAttribute getVocNoun_MassNoun();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocProperty <em>Voc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Property</em>'.
	 * @see NBVR.Vocabulary.VocProperty
	 * @generated
	 */
	EClass getVocProperty();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocProperty#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see NBVR.Vocabulary.VocProperty#getRange()
	 * @see #getVocProperty()
	 * @generated
	 */
	EReference getVocProperty_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.VocProperty#getPropertyForm <em>Property Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Form</em>'.
	 * @see NBVR.Vocabulary.VocProperty#getPropertyForm()
	 * @see #getVocProperty()
	 * @generated
	 */
	EReference getVocProperty_PropertyForm();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.NumberWord <em>Number Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Word</em>'.
	 * @see NBVR.Vocabulary.NumberWord
	 * @generated
	 */
	EClass getNumberWord();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.NumberWord#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see NBVR.Vocabulary.NumberWord#getValue()
	 * @see #getNumberWord()
	 * @generated
	 */
	EAttribute getNumberWord_Value();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.NumberWord#isDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see NBVR.Vocabulary.NumberWord#isDecimal()
	 * @see #getNumberWord()
	 * @generated
	 */
	EAttribute getNumberWord_Decimal();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocProperty#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verb</em>'.
	 * @see NBVR.Vocabulary.VocProperty#getVerb()
	 * @see #getVocProperty()
	 * @generated
	 */
	EReference getVocProperty_Verb();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see NBVR.Vocabulary.VocProperty#getDomain()
	 * @see #getVocProperty()
	 * @generated
	 */
	EReference getVocProperty_Domain();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.SyntaxForm <em>Syntax Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Form</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm
	 * @generated
	 */
	EClass getSyntaxForm();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.SyntaxForm#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm#getElements()
	 * @see #getSyntaxForm()
	 * @generated
	 */
	EReference getSyntaxForm_Elements();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.SyntaxForm#isAuxForm <em>Is Aux Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Aux Form</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm#isAuxForm()
	 * @see #getSyntaxForm()
	 * @generated
	 */
	EAttribute getSyntaxForm_IsAuxForm();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.SyntaxForm#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Verb</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm#getVerb()
	 * @see #getSyntaxForm()
	 * @generated
	 */
	EReference getSyntaxForm_Verb();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.SyntaxForm#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Property</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm#getProperty()
	 * @see #getSyntaxForm()
	 * @generated
	 */
	EReference getSyntaxForm_Property();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.SyntaxForm#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see NBVR.Vocabulary.SyntaxForm#getText()
	 * @see #getSyntaxForm()
	 * @generated
	 */
	EAttribute getSyntaxForm_Text();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Element</em>'.
	 * @see NBVR.Vocabulary.FormElement
	 * @generated
	 */
	EClass getFormElement();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.FormElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Vocabulary.FormElement#getKind()
	 * @see #getFormElement()
	 * @generated
	 */
	EAttribute getFormElement_Kind();

	/**
	 * Returns the meta object for the container reference '{@link NBVR.Vocabulary.FormElement#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Form</em>'.
	 * @see NBVR.Vocabulary.FormElement#getForm()
	 * @see #getFormElement()
	 * @generated
	 */
	EReference getFormElement_Form();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.WordForm <em>Word Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word Form</em>'.
	 * @see NBVR.Vocabulary.WordForm
	 * @generated
	 */
	EClass getWordForm();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.WordForm#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see NBVR.Vocabulary.WordForm#getText()
	 * @see #getWordForm()
	 * @generated
	 */
	EAttribute getWordForm_Text();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.WordForm#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see NBVR.Vocabulary.WordForm#getNext()
	 * @see #getWordForm()
	 * @generated
	 */
	EReference getWordForm_Next();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.WordForm#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Word</em>'.
	 * @see NBVR.Vocabulary.WordForm#getWord()
	 * @see #getWordForm()
	 * @generated
	 */
	EReference getWordForm_Word();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.WordForm#getAltWord <em>Alt Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alt Word</em>'.
	 * @see NBVR.Vocabulary.WordForm#getAltWord()
	 * @see #getWordForm()
	 * @generated
	 */
	EReference getWordForm_AltWord();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Adjunct <em>Adjunct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjunct</em>'.
	 * @see NBVR.Vocabulary.Adjunct
	 * @generated
	 */
	EClass getAdjunct();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see NBVR.Vocabulary.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.Keyword#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see NBVR.Vocabulary.Keyword#getKind()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Kind();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Terminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology</em>'.
	 * @see NBVR.Vocabulary.Terminology
	 * @generated
	 */
	EClass getTerminology();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Terminology#getFirstItem <em>First Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Item</em>'.
	 * @see NBVR.Vocabulary.Terminology#getFirstItem()
	 * @see #getTerminology()
	 * @generated
	 */
	EReference getTerminology_FirstItem();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Terminology#getLastItem <em>Last Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Item</em>'.
	 * @see NBVR.Vocabulary.Terminology#getLastItem()
	 * @see #getTerminology()
	 * @generated
	 */
	EReference getTerminology_LastItem();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.IsVerb <em>Is Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Verb</em>'.
	 * @see NBVR.Vocabulary.IsVerb
	 * @generated
	 */
	EClass getIsVerb();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocUnit <em>Voc Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Unit</em>'.
	 * @see NBVR.Vocabulary.VocUnit
	 * @generated
	 */
	EClass getVocUnit();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocUnit#getQuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Kind</em>'.
	 * @see NBVR.Vocabulary.VocUnit#getQuantityKind()
	 * @see #getVocUnit()
	 * @generated
	 */
	EReference getVocUnit_QuantityKind();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Noun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun</em>'.
	 * @see NBVR.Vocabulary.Noun
	 * @generated
	 */
	EClass getNoun();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Noun#getPlural <em>Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plural</em>'.
	 * @see NBVR.Vocabulary.Noun#getPlural()
	 * @see #getNoun()
	 * @generated
	 */
	EReference getNoun_Plural();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Noun#getAltPlural <em>Alt Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alt Plural</em>'.
	 * @see NBVR.Vocabulary.Noun#getAltPlural()
	 * @see #getNoun()
	 * @generated
	 */
	EReference getNoun_AltPlural();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see NBVR.Vocabulary.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Particle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Particle</em>'.
	 * @see NBVR.Vocabulary.Particle
	 * @generated
	 */
	EClass getParticle();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Particle#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see NBVR.Vocabulary.Particle#getRole()
	 * @see #getParticle()
	 * @generated
	 */
	EReference getParticle_Role();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Particle#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see NBVR.Vocabulary.Particle#getTerm()
	 * @see #getParticle()
	 * @generated
	 */
	EReference getParticle_Term();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.RoleElement <em>Role Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Element</em>'.
	 * @see NBVR.Vocabulary.RoleElement
	 * @generated
	 */
	EClass getRoleElement();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.RoleElement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see NBVR.Vocabulary.RoleElement#getRole()
	 * @see #getRoleElement()
	 * @generated
	 */
	EReference getRoleElement_Role();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.RoleElement#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot</em>'.
	 * @see NBVR.Vocabulary.RoleElement#getSlot()
	 * @see #getRoleElement()
	 * @generated
	 */
	EAttribute getRoleElement_Slot();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.ItemElement <em>Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Element</em>'.
	 * @see NBVR.Vocabulary.ItemElement
	 * @generated
	 */
	EClass getItemElement();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.ItemElement#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term</em>'.
	 * @see NBVR.Vocabulary.ItemElement#getTerm()
	 * @see #getItemElement()
	 * @generated
	 */
	EReference getItemElement_Term();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Verb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb</em>'.
	 * @see NBVR.Vocabulary.Verb
	 * @generated
	 */
	EClass getVerb();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getSingular <em>Singular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Singular</em>'.
	 * @see NBVR.Vocabulary.Verb#getSingular()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_Singular();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getPlural <em>Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plural</em>'.
	 * @see NBVR.Vocabulary.Verb#getPlural()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_Plural();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getPast <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Past</em>'.
	 * @see NBVR.Vocabulary.Verb#getPast()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_Past();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getProgressive <em>Progressive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Progressive</em>'.
	 * @see NBVR.Vocabulary.Verb#getProgressive()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_Progressive();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getPerfective <em>Perfective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Perfective</em>'.
	 * @see NBVR.Vocabulary.Verb#getPerfective()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_Perfective();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.Verb#getAltPast <em>Alt Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alt Past</em>'.
	 * @see NBVR.Vocabulary.Verb#getAltPast()
	 * @see #getVerb()
	 * @generated
	 */
	EReference getVerb_AltPast();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocAdjective <em>Voc Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Adjective</em>'.
	 * @see NBVR.Vocabulary.VocAdjective
	 * @generated
	 */
	EClass getVocAdjective();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocAdjective#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see NBVR.Vocabulary.VocAdjective#getDomain()
	 * @see #getVocAdjective()
	 * @generated
	 */
	EReference getVocAdjective_Domain();

	/**
	 * Returns the meta object for the reference '{@link NBVR.Vocabulary.VocAdjective#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verb</em>'.
	 * @see NBVR.Vocabulary.VocAdjective#getVerb()
	 * @see #getVocAdjective()
	 * @generated
	 */
	EReference getVocAdjective_Verb();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocVerb <em>Voc Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Verb</em>'.
	 * @see NBVR.Vocabulary.VocVerb
	 * @generated
	 */
	EClass getVocVerb();

	/**
	 * Returns the meta object for the attribute '{@link NBVR.Vocabulary.VocVerb#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arity</em>'.
	 * @see NBVR.Vocabulary.VocVerb#getArity()
	 * @see #getVocVerb()
	 * @generated
	 */
	EAttribute getVocVerb_Arity();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.VocVerb#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see NBVR.Vocabulary.VocVerb#getRoles()
	 * @see #getVocVerb()
	 * @generated
	 */
	EReference getVocVerb_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link NBVR.Vocabulary.VocVerb#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Form</em>'.
	 * @see NBVR.Vocabulary.VocVerb#getForm()
	 * @see #getVocVerb()
	 * @generated
	 */
	EReference getVocVerb_Form();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.VocVerb#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see NBVR.Vocabulary.VocVerb#getPredicate()
	 * @see #getVocVerb()
	 * @generated
	 */
	EReference getVocVerb_Predicate();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see NBVR.Vocabulary.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference '{@link NBVR.Vocabulary.Dictionary#getFirstWord <em>First Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Word</em>'.
	 * @see NBVR.Vocabulary.Dictionary#getFirstWord()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_FirstWord();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.StringWord <em>String Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Word</em>'.
	 * @see NBVR.Vocabulary.StringWord
	 * @generated
	 */
	EClass getStringWord();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see NBVR.Vocabulary.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.VocName <em>Voc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voc Name</em>'.
	 * @see NBVR.Vocabulary.VocName
	 * @generated
	 */
	EClass getVocName();

	/**
	 * Returns the meta object for class '{@link NBVR.Vocabulary.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see NBVR.Vocabulary.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for enum '{@link NBVR.Vocabulary.VocItemKind <em>Voc Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voc Item Kind</em>'.
	 * @see NBVR.Vocabulary.VocItemKind
	 * @generated
	 */
	EEnum getVocItemKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Vocabulary.FormElementKind <em>Form Element Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Form Element Kind</em>'.
	 * @see NBVR.Vocabulary.FormElementKind
	 * @generated
	 */
	EEnum getFormElementKind();

	/**
	 * Returns the meta object for enum '{@link NBVR.Vocabulary.KeywordKind <em>Keyword Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keyword Kind</em>'.
	 * @see NBVR.Vocabulary.KeywordKind
	 * @generated
	 */
	EEnum getKeywordKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VocabularyFactory getVocabularyFactory();

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
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.AdjectiveImpl <em>Adjective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.AdjectiveImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getAdjective()
		 * @generated
		 */
		EClass ADJECTIVE = eINSTANCE.getAdjective();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.WordImpl <em>Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.WordImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getWord()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD__BASE = eINSTANCE.getWord_Base();

		/**
		 * The meta object literal for the '<em><b>Begins Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD__BEGINS_TERM = eINSTANCE.getWord_BeginsTerm();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD__NEXT = eINSTANCE.getWord_Next();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.TermImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONCEPT = eINSTANCE.getTerm_Concept();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__WORDS = eINSTANCE.getTerm_Words();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONTEXT = eINSTANCE.getTerm_Context();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__ROLE = eINSTANCE.getTerm_Role();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__ELEMENT = eINSTANCE.getTerm_Element();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__TEXT = eINSTANCE.getTerm_Text();

		/**
		 * The meta object literal for the '<em><b>Particle</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__PARTICLE = eINSTANCE.getTerm_Particle();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocabularyItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocabularyItemImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocabularyItem()
		 * @generated
		 */
		EClass VOCABULARY_ITEM = eINSTANCE.getVocabularyItem();

		/**
		 * The meta object literal for the '<em><b>Formulations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_ITEM__FORMULATIONS = eINSTANCE.getVocabularyItem_Formulations();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_ITEM__BASE = eINSTANCE.getVocabularyItem_Base();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_ITEM__NEXT = eINSTANCE.getVocabularyItem_Next();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_ITEM__TERMS = eINSTANCE.getVocabularyItem_Terms();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.FormulationImpl <em>Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.FormulationImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormulation()
		 * @generated
		 */
		EClass FORMULATION = eINSTANCE.getFormulation();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION__FORM = eINSTANCE.getFormulation_Form();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULATION__LANGUAGE = eINSTANCE.getFormulation_Language();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION__ELEMENTS = eINSTANCE.getFormulation_Elements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULATION__TEXT = eINSTANCE.getFormulation_Text();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION__CONCEPT = eINSTANCE.getFormulation_Concept();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.FormulationFormImpl <em>Formulation Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.FormulationFormImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormulationForm()
		 * @generated
		 */
		EClass FORMULATION_FORM = eINSTANCE.getFormulationForm();

		/**
		 * The meta object literal for the '<em><b>Formulation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION_FORM__FORMULATION = eINSTANCE.getFormulationForm_Formulation();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VerbRoleImpl <em>Verb Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VerbRoleImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVerbRole()
		 * @generated
		 */
		EClass VERB_ROLE = eINSTANCE.getVerbRole();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB_ROLE__RANGE = eINSTANCE.getVerbRole_Range();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB_ROLE__VERB = eINSTANCE.getVerbRole_Verb();

		/**
		 * The meta object literal for the '<em><b>Is Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERB_ROLE__IS_RANGE = eINSTANCE.getVerbRole_IsRange();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB_ROLE__TERM = eINSTANCE.getVerbRole_Term();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocNounImpl <em>Voc Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocNounImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocNoun()
		 * @generated
		 */
		EClass VOC_NOUN = eINSTANCE.getVocNoun();

		/**
		 * The meta object literal for the '<em><b>Is AVerb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_NOUN__IS_AVERB = eINSTANCE.getVocNoun_IsAVerb();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_NOUN__PREDICATE = eINSTANCE.getVocNoun_Predicate();

		/**
		 * The meta object literal for the '<em><b>Mass Noun</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOC_NOUN__MASS_NOUN = eINSTANCE.getVocNoun_MassNoun();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocPropertyImpl <em>Voc Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocPropertyImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocProperty()
		 * @generated
		 */
		EClass VOC_PROPERTY = eINSTANCE.getVocProperty();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_PROPERTY__RANGE = eINSTANCE.getVocProperty_Range();

		/**
		 * The meta object literal for the '<em><b>Property Form</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_PROPERTY__PROPERTY_FORM = eINSTANCE.getVocProperty_PropertyForm();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.NumberWordImpl <em>Number Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.NumberWordImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getNumberWord()
		 * @generated
		 */
		EClass NUMBER_WORD = eINSTANCE.getNumberWord();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_WORD__VALUE = eINSTANCE.getNumberWord_Value();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_WORD__DECIMAL = eINSTANCE.getNumberWord_Decimal();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_PROPERTY__VERB = eINSTANCE.getVocProperty_Verb();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_PROPERTY__DOMAIN = eINSTANCE.getVocProperty_Domain();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.SyntaxFormImpl <em>Syntax Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.SyntaxFormImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getSyntaxForm()
		 * @generated
		 */
		EClass SYNTAX_FORM = eINSTANCE.getSyntaxForm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_FORM__ELEMENTS = eINSTANCE.getSyntaxForm_Elements();

		/**
		 * The meta object literal for the '<em><b>Is Aux Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_FORM__IS_AUX_FORM = eINSTANCE.getSyntaxForm_IsAuxForm();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_FORM__VERB = eINSTANCE.getSyntaxForm_Verb();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_FORM__PROPERTY = eINSTANCE.getSyntaxForm_Property();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_FORM__TEXT = eINSTANCE.getSyntaxForm_Text();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.FormElementImpl <em>Form Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.FormElementImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormElement()
		 * @generated
		 */
		EClass FORM_ELEMENT = eINSTANCE.getFormElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_ELEMENT__KIND = eINSTANCE.getFormElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_ELEMENT__FORM = eINSTANCE.getFormElement_Form();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.WordFormImpl <em>Word Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.WordFormImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getWordForm()
		 * @generated
		 */
		EClass WORD_FORM = eINSTANCE.getWordForm();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD_FORM__TEXT = eINSTANCE.getWordForm_Text();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD_FORM__NEXT = eINSTANCE.getWordForm_Next();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD_FORM__WORD = eINSTANCE.getWordForm_Word();

		/**
		 * The meta object literal for the '<em><b>Alt Word</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD_FORM__ALT_WORD = eINSTANCE.getWordForm_AltWord();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.AdjunctImpl <em>Adjunct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.AdjunctImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getAdjunct()
		 * @generated
		 */
		EClass ADJUNCT = eINSTANCE.getAdjunct();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.KeywordImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__KIND = eINSTANCE.getKeyword_Kind();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.TerminologyImpl <em>Terminology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.TerminologyImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getTerminology()
		 * @generated
		 */
		EClass TERMINOLOGY = eINSTANCE.getTerminology();

		/**
		 * The meta object literal for the '<em><b>First Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY__FIRST_ITEM = eINSTANCE.getTerminology_FirstItem();

		/**
		 * The meta object literal for the '<em><b>Last Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY__LAST_ITEM = eINSTANCE.getTerminology_LastItem();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.IsVerbImpl <em>Is Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.IsVerbImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getIsVerb()
		 * @generated
		 */
		EClass IS_VERB = eINSTANCE.getIsVerb();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocUnitImpl <em>Voc Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocUnitImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocUnit()
		 * @generated
		 */
		EClass VOC_UNIT = eINSTANCE.getVocUnit();

		/**
		 * The meta object literal for the '<em><b>Quantity Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_UNIT__QUANTITY_KIND = eINSTANCE.getVocUnit_QuantityKind();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.NounImpl <em>Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.NounImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getNoun()
		 * @generated
		 */
		EClass NOUN = eINSTANCE.getNoun();

		/**
		 * The meta object literal for the '<em><b>Plural</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOUN__PLURAL = eINSTANCE.getNoun_Plural();

		/**
		 * The meta object literal for the '<em><b>Alt Plural</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOUN__ALT_PLURAL = eINSTANCE.getNoun_AltPlural();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.NameImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.ParticleImpl <em>Particle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.ParticleImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getParticle()
		 * @generated
		 */
		EClass PARTICLE = eINSTANCE.getParticle();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICLE__ROLE = eINSTANCE.getParticle_Role();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICLE__TERM = eINSTANCE.getParticle_Term();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.RoleElementImpl <em>Role Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.RoleElementImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getRoleElement()
		 * @generated
		 */
		EClass ROLE_ELEMENT = eINSTANCE.getRoleElement();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ELEMENT__ROLE = eINSTANCE.getRoleElement_Role();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ELEMENT__SLOT = eINSTANCE.getRoleElement_Slot();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.ItemElementImpl <em>Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.ItemElementImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getItemElement()
		 * @generated
		 */
		EClass ITEM_ELEMENT = eINSTANCE.getItemElement();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ELEMENT__TERM = eINSTANCE.getItemElement_Term();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VerbImpl <em>Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VerbImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVerb()
		 * @generated
		 */
		EClass VERB = eINSTANCE.getVerb();

		/**
		 * The meta object literal for the '<em><b>Singular</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__SINGULAR = eINSTANCE.getVerb_Singular();

		/**
		 * The meta object literal for the '<em><b>Plural</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__PLURAL = eINSTANCE.getVerb_Plural();

		/**
		 * The meta object literal for the '<em><b>Past</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__PAST = eINSTANCE.getVerb_Past();

		/**
		 * The meta object literal for the '<em><b>Progressive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__PROGRESSIVE = eINSTANCE.getVerb_Progressive();

		/**
		 * The meta object literal for the '<em><b>Perfective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__PERFECTIVE = eINSTANCE.getVerb_Perfective();

		/**
		 * The meta object literal for the '<em><b>Alt Past</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERB__ALT_PAST = eINSTANCE.getVerb_AltPast();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocAdjectiveImpl <em>Voc Adjective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocAdjectiveImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocAdjective()
		 * @generated
		 */
		EClass VOC_ADJECTIVE = eINSTANCE.getVocAdjective();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_ADJECTIVE__DOMAIN = eINSTANCE.getVocAdjective_Domain();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_ADJECTIVE__VERB = eINSTANCE.getVocAdjective_Verb();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocVerbImpl <em>Voc Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocVerbImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocVerb()
		 * @generated
		 */
		EClass VOC_VERB = eINSTANCE.getVocVerb();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOC_VERB__ARITY = eINSTANCE.getVocVerb_Arity();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_VERB__ROLES = eINSTANCE.getVocVerb_Roles();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_VERB__FORM = eINSTANCE.getVocVerb_Form();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOC_VERB__PREDICATE = eINSTANCE.getVocVerb_Predicate();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.DictionaryImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>First Word</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__FIRST_WORD = eINSTANCE.getDictionary_FirstWord();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.StringWordImpl <em>String Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.StringWordImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getStringWord()
		 * @generated
		 */
		EClass STRING_WORD = eINSTANCE.getStringWord();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.DateTimeImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.VocNameImpl <em>Voc Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.VocNameImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocName()
		 * @generated
		 */
		EClass VOC_NAME = eINSTANCE.getVocName();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.impl.DefinitionImpl
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.VocItemKind <em>Voc Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.VocItemKind
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getVocItemKind()
		 * @generated
		 */
		EEnum VOC_ITEM_KIND = eINSTANCE.getVocItemKind();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.FormElementKind <em>Form Element Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.FormElementKind
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getFormElementKind()
		 * @generated
		 */
		EEnum FORM_ELEMENT_KIND = eINSTANCE.getFormElementKind();

		/**
		 * The meta object literal for the '{@link NBVR.Vocabulary.KeywordKind <em>Keyword Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NBVR.Vocabulary.KeywordKind
		 * @see NBVR.Vocabulary.impl.VocabularyPackageImpl#getKeywordKind()
		 * @generated
		 */
		EEnum KEYWORD_KIND = eINSTANCE.getKeywordKind();

	}

} //VocabularyPackage
