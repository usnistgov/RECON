/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Grammar.GrammarPackage;

import NBVR.Grammar.impl.GrammarPackageImpl;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.impl.LogicPackageImpl;
import NBVR.Vocabulary.Adjective;
import NBVR.Vocabulary.Adjunct;
import NBVR.Vocabulary.DateTime;
import NBVR.Vocabulary.Definition;
import NBVR.Vocabulary.Dictionary;
import NBVR.Vocabulary.FormElement;
import NBVR.Vocabulary.FormElementKind;
import NBVR.Vocabulary.Formulation;
import NBVR.Vocabulary.FormulationForm;
import NBVR.Vocabulary.IsVerb;
import NBVR.Vocabulary.ItemElement;
import NBVR.Vocabulary.Keyword;
import NBVR.Vocabulary.KeywordKind;
import NBVR.Vocabulary.Name;
import NBVR.Vocabulary.Noun;
import NBVR.Vocabulary.NumberWord;
import NBVR.Vocabulary.Particle;
import NBVR.Vocabulary.RoleElement;
import NBVR.Vocabulary.StringWord;
import NBVR.Vocabulary.SyntaxForm;
import NBVR.Vocabulary.Term;
import NBVR.Vocabulary.Terminology;
import NBVR.Vocabulary.Verb;
import NBVR.Vocabulary.VerbRole;
import NBVR.Vocabulary.VocAdjective;
import NBVR.Vocabulary.VocItemKind;
import NBVR.Vocabulary.VocName;
import NBVR.Vocabulary.VocNoun;
import NBVR.Vocabulary.VocProperty;
import NBVR.Vocabulary.VocUnit;
import NBVR.Vocabulary.VocVerb;
import NBVR.Vocabulary.VocabularyFactory;
import NBVR.Vocabulary.VocabularyItem;
import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.Word;
import NBVR.Vocabulary.WordForm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyPackageImpl extends EPackageImpl implements VocabularyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocNounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjunctEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isVerbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass particleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocAdjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocVerbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vocItemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formElementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keywordKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see NBVR.Vocabulary.VocabularyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VocabularyPackageImpl() {
		super(eNS_URI, VocabularyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VocabularyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VocabularyPackage init() {
		if (isInited) return (VocabularyPackage)EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI);

		// Obtain or create and register package
		VocabularyPackageImpl theVocabularyPackage = (VocabularyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VocabularyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VocabularyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		LogicPackageImpl theLogicPackage = (LogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) : LogicPackage.eINSTANCE);

		// Create package meta-data objects
		theVocabularyPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theLogicPackage.createPackageContents();

		// Initialize created meta-data
		theVocabularyPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVocabularyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VocabularyPackage.eNS_URI, theVocabularyPackage);
		return theVocabularyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjective() {
		return adjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWord() {
		return wordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWord_Base() {
		return (EReference)wordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWord_BeginsTerm() {
		return (EReference)wordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWord_Next() {
		return (EReference)wordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Concept() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Words() {
		return (EReference)termEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Context() {
		return (EReference)termEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Role() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Element() {
		return (EReference)termEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_Text() {
		return (EAttribute)termEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Particle() {
		return (EReference)termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyItem() {
		return vocabularyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyItem_Formulations() {
		return (EReference)vocabularyItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyItem_Base() {
		return (EReference)vocabularyItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyItem_Next() {
		return (EReference)vocabularyItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyItem_Terms() {
		return (EReference)vocabularyItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulation() {
		return formulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulation_Form() {
		return (EReference)formulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulation_Language() {
		return (EAttribute)formulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulation_Elements() {
		return (EReference)formulationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulation_Text() {
		return (EAttribute)formulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulation_Concept() {
		return (EReference)formulationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulationForm() {
		return formulationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulationForm_Formulation() {
		return (EReference)formulationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbRole() {
		return verbRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbRole_Range() {
		return (EReference)verbRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbRole_Verb() {
		return (EReference)verbRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerbRole_IsRange() {
		return (EAttribute)verbRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbRole_Term() {
		return (EReference)verbRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocNoun() {
		return vocNounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocNoun_IsAVerb() {
		return (EReference)vocNounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocNoun_Predicate() {
		return (EReference)vocNounEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocNoun_MassNoun() {
		return (EAttribute)vocNounEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocProperty() {
		return vocPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocProperty_Range() {
		return (EReference)vocPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocProperty_PropertyForm() {
		return (EReference)vocPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberWord() {
		return numberWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberWord_Value() {
		return (EAttribute)numberWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberWord_Decimal() {
		return (EAttribute)numberWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocProperty_Verb() {
		return (EReference)vocPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocProperty_Domain() {
		return (EReference)vocPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxForm() {
		return syntaxFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxForm_Elements() {
		return (EReference)syntaxFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxForm_IsAuxForm() {
		return (EAttribute)syntaxFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxForm_Verb() {
		return (EReference)syntaxFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxForm_Property() {
		return (EReference)syntaxFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxForm_Text() {
		return (EAttribute)syntaxFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormElement() {
		return formElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormElement_Kind() {
		return (EAttribute)formElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormElement_Form() {
		return (EReference)formElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWordForm() {
		return wordFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWordForm_Text() {
		return (EAttribute)wordFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWordForm_Next() {
		return (EReference)wordFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWordForm_Word() {
		return (EReference)wordFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWordForm_AltWord() {
		return (EReference)wordFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdjunct() {
		return adjunctEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyword() {
		return keywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_Kind() {
		return (EAttribute)keywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminology() {
		return terminologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminology_FirstItem() {
		return (EReference)terminologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminology_LastItem() {
		return (EReference)terminologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsVerb() {
		return isVerbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocUnit() {
		return vocUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocUnit_QuantityKind() {
		return (EReference)vocUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoun() {
		return nounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoun_Plural() {
		return (EReference)nounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoun_AltPlural() {
		return (EReference)nounEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticle() {
		return particleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticle_Role() {
		return (EReference)particleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticle_Term() {
		return (EReference)particleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleElement() {
		return roleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleElement_Role() {
		return (EReference)roleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleElement_Slot() {
		return (EAttribute)roleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemElement() {
		return itemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemElement_Term() {
		return (EReference)itemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerb() {
		return verbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_Singular() {
		return (EReference)verbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_Plural() {
		return (EReference)verbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_Past() {
		return (EReference)verbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_Progressive() {
		return (EReference)verbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_Perfective() {
		return (EReference)verbEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerb_AltPast() {
		return (EReference)verbEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocAdjective() {
		return vocAdjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocAdjective_Domain() {
		return (EReference)vocAdjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocAdjective_Verb() {
		return (EReference)vocAdjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocVerb() {
		return vocVerbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocVerb_Arity() {
		return (EAttribute)vocVerbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocVerb_Roles() {
		return (EReference)vocVerbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocVerb_Form() {
		return (EReference)vocVerbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocVerb_Predicate() {
		return (EReference)vocVerbEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionary() {
		return dictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionary_FirstWord() {
		return (EReference)dictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringWord() {
		return stringWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocName() {
		return vocNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVocItemKind() {
		return vocItemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormElementKind() {
		return formElementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeywordKind() {
		return keywordKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyFactory getVocabularyFactory() {
		return (VocabularyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adjectiveEClass = createEClass(ADJECTIVE);

		wordEClass = createEClass(WORD);
		createEReference(wordEClass, WORD__BASE);
		createEReference(wordEClass, WORD__BEGINS_TERM);
		createEReference(wordEClass, WORD__NEXT);

		wordFormEClass = createEClass(WORD_FORM);
		createEAttribute(wordFormEClass, WORD_FORM__TEXT);
		createEReference(wordFormEClass, WORD_FORM__NEXT);
		createEReference(wordFormEClass, WORD_FORM__WORD);
		createEReference(wordFormEClass, WORD_FORM__ALT_WORD);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__CONCEPT);
		createEReference(termEClass, TERM__ROLE);
		createEReference(termEClass, TERM__PARTICLE);
		createEReference(termEClass, TERM__WORDS);
		createEReference(termEClass, TERM__CONTEXT);
		createEReference(termEClass, TERM__ELEMENT);
		createEAttribute(termEClass, TERM__TEXT);

		vocabularyItemEClass = createEClass(VOCABULARY_ITEM);
		createEReference(vocabularyItemEClass, VOCABULARY_ITEM__FORMULATIONS);
		createEReference(vocabularyItemEClass, VOCABULARY_ITEM__BASE);
		createEReference(vocabularyItemEClass, VOCABULARY_ITEM__NEXT);
		createEReference(vocabularyItemEClass, VOCABULARY_ITEM__TERMS);

		formulationEClass = createEClass(FORMULATION);
		createEReference(formulationEClass, FORMULATION__FORM);
		createEAttribute(formulationEClass, FORMULATION__TEXT);
		createEAttribute(formulationEClass, FORMULATION__LANGUAGE);
		createEReference(formulationEClass, FORMULATION__ELEMENTS);
		createEReference(formulationEClass, FORMULATION__CONCEPT);

		formulationFormEClass = createEClass(FORMULATION_FORM);
		createEReference(formulationFormEClass, FORMULATION_FORM__FORMULATION);

		verbRoleEClass = createEClass(VERB_ROLE);
		createEReference(verbRoleEClass, VERB_ROLE__RANGE);
		createEReference(verbRoleEClass, VERB_ROLE__VERB);
		createEReference(verbRoleEClass, VERB_ROLE__TERM);
		createEAttribute(verbRoleEClass, VERB_ROLE__IS_RANGE);

		vocNounEClass = createEClass(VOC_NOUN);
		createEReference(vocNounEClass, VOC_NOUN__IS_AVERB);
		createEReference(vocNounEClass, VOC_NOUN__PREDICATE);
		createEAttribute(vocNounEClass, VOC_NOUN__MASS_NOUN);

		vocVerbEClass = createEClass(VOC_VERB);
		createEAttribute(vocVerbEClass, VOC_VERB__ARITY);
		createEReference(vocVerbEClass, VOC_VERB__ROLES);
		createEReference(vocVerbEClass, VOC_VERB__FORM);
		createEReference(vocVerbEClass, VOC_VERB__PREDICATE);

		syntaxFormEClass = createEClass(SYNTAX_FORM);
		createEReference(syntaxFormEClass, SYNTAX_FORM__ELEMENTS);
		createEAttribute(syntaxFormEClass, SYNTAX_FORM__IS_AUX_FORM);
		createEReference(syntaxFormEClass, SYNTAX_FORM__PROPERTY);
		createEAttribute(syntaxFormEClass, SYNTAX_FORM__TEXT);
		createEReference(syntaxFormEClass, SYNTAX_FORM__VERB);

		formElementEClass = createEClass(FORM_ELEMENT);
		createEAttribute(formElementEClass, FORM_ELEMENT__KIND);
		createEReference(formElementEClass, FORM_ELEMENT__FORM);

		vocPropertyEClass = createEClass(VOC_PROPERTY);
		createEReference(vocPropertyEClass, VOC_PROPERTY__DOMAIN);
		createEReference(vocPropertyEClass, VOC_PROPERTY__RANGE);
		createEReference(vocPropertyEClass, VOC_PROPERTY__VERB);
		createEReference(vocPropertyEClass, VOC_PROPERTY__PROPERTY_FORM);

		numberWordEClass = createEClass(NUMBER_WORD);
		createEAttribute(numberWordEClass, NUMBER_WORD__VALUE);
		createEAttribute(numberWordEClass, NUMBER_WORD__DECIMAL);

		vocUnitEClass = createEClass(VOC_UNIT);
		createEReference(vocUnitEClass, VOC_UNIT__QUANTITY_KIND);

		vocNameEClass = createEClass(VOC_NAME);

		vocAdjectiveEClass = createEClass(VOC_ADJECTIVE);
		createEReference(vocAdjectiveEClass, VOC_ADJECTIVE__DOMAIN);
		createEReference(vocAdjectiveEClass, VOC_ADJECTIVE__VERB);

		particleEClass = createEClass(PARTICLE);
		createEReference(particleEClass, PARTICLE__ROLE);
		createEReference(particleEClass, PARTICLE__TERM);

		roleElementEClass = createEClass(ROLE_ELEMENT);
		createEReference(roleElementEClass, ROLE_ELEMENT__ROLE);
		createEAttribute(roleElementEClass, ROLE_ELEMENT__SLOT);

		keywordEClass = createEClass(KEYWORD);
		createEAttribute(keywordEClass, KEYWORD__KIND);

		itemElementEClass = createEClass(ITEM_ELEMENT);
		createEReference(itemElementEClass, ITEM_ELEMENT__TERM);

		adjunctEClass = createEClass(ADJUNCT);

		nounEClass = createEClass(NOUN);
		createEReference(nounEClass, NOUN__PLURAL);
		createEReference(nounEClass, NOUN__ALT_PLURAL);

		nameEClass = createEClass(NAME);

		verbEClass = createEClass(VERB);
		createEReference(verbEClass, VERB__SINGULAR);
		createEReference(verbEClass, VERB__PLURAL);
		createEReference(verbEClass, VERB__PAST);
		createEReference(verbEClass, VERB__PROGRESSIVE);
		createEReference(verbEClass, VERB__PERFECTIVE);
		createEReference(verbEClass, VERB__ALT_PAST);

		dictionaryEClass = createEClass(DICTIONARY);
		createEReference(dictionaryEClass, DICTIONARY__FIRST_WORD);

		stringWordEClass = createEClass(STRING_WORD);

		definitionEClass = createEClass(DEFINITION);

		dateTimeEClass = createEClass(DATE_TIME);

		terminologyEClass = createEClass(TERMINOLOGY);
		createEReference(terminologyEClass, TERMINOLOGY__FIRST_ITEM);
		createEReference(terminologyEClass, TERMINOLOGY__LAST_ITEM);

		isVerbEClass = createEClass(IS_VERB);

		// Create enums
		formElementKindEEnum = createEEnum(FORM_ELEMENT_KIND);
		keywordKindEEnum = createEEnum(KEYWORD_KIND);
		vocItemKindEEnum = createEEnum(VOC_ITEM_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GrammarPackage theGrammarPackage = (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);
		LogicPackage theLogicPackage = (LogicPackage)EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adjectiveEClass.getESuperTypes().add(this.getWord());
		vocNounEClass.getESuperTypes().add(this.getVocabularyItem());
		vocVerbEClass.getESuperTypes().add(this.getVocabularyItem());
		vocPropertyEClass.getESuperTypes().add(this.getVocabularyItem());
		numberWordEClass.getESuperTypes().add(this.getWord());
		vocUnitEClass.getESuperTypes().add(this.getVocName());
		vocNameEClass.getESuperTypes().add(this.getVocabularyItem());
		vocAdjectiveEClass.getESuperTypes().add(this.getVocabularyItem());
		particleEClass.getESuperTypes().add(this.getFormElement());
		roleElementEClass.getESuperTypes().add(this.getFormElement());
		keywordEClass.getESuperTypes().add(this.getWord());
		itemElementEClass.getESuperTypes().add(this.getFormElement());
		adjunctEClass.getESuperTypes().add(this.getWord());
		nounEClass.getESuperTypes().add(this.getWord());
		nameEClass.getESuperTypes().add(this.getWord());
		verbEClass.getESuperTypes().add(this.getWord());
		stringWordEClass.getESuperTypes().add(this.getWord());
		definitionEClass.getESuperTypes().add(this.getFormulation());
		dateTimeEClass.getESuperTypes().add(this.getWord());
		isVerbEClass.getESuperTypes().add(this.getVerb());

		// Initialize classes and features; add operations and parameters
		initEClass(adjectiveEClass, Adjective.class, "Adjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wordEClass, Word.class, "Word", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWord_Base(), this.getWordForm(), null, "base", null, 1, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWord_BeginsTerm(), this.getTerm(), null, "beginsTerm", null, 0, -1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWord_Next(), this.getWord(), null, "next", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(wordEClass, ecorePackage.getEBoolean(), "isArticle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(wordEClass, ecorePackage.getEBoolean(), "isNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(wordEClass, ecorePackage.getEBoolean(), "isText", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(wordEClass, ecorePackage.getEBoolean(), "isKeyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getKeywordKind(), "kind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(wordEClass, ecorePackage.getEBoolean(), "isKeyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(wordEClass, ecorePackage.getEBoolean(), "isIs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(wordFormEClass, WordForm.class, "WordForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWordForm_Text(), ecorePackage.getEString(), "text", null, 1, 1, WordForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWordForm_Next(), this.getWordForm(), null, "next", null, 0, 1, WordForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWordForm_Word(), this.getWord(), null, "word", null, 1, 1, WordForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWordForm_AltWord(), this.getWord(), null, "altWord", null, 0, 1, WordForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Concept(), this.getVocabularyItem(), this.getVocabularyItem_Terms(), "concept", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Role(), this.getVerbRole(), this.getVerbRole_Term(), "role", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Particle(), this.getParticle(), this.getParticle_Term(), "particle", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Words(), this.getWord(), null, "words", null, 1, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Context(), this.getVocabularyItem(), null, "context", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Element(), this.getItemElement(), this.getItemElement_Term(), "element", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTerm_Text(), ecorePackage.getEString(), "text", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocabularyItemEClass, VocabularyItem.class, "VocabularyItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocabularyItem_Formulations(), this.getFormulation(), this.getFormulation_Concept(), "formulations", null, 0, -1, VocabularyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabularyItem_Base(), this.getVocabularyItem(), null, "base", null, 0, -1, VocabularyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabularyItem_Next(), this.getVocabularyItem(), null, "next", null, 0, 1, VocabularyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocabularyItem_Terms(), this.getTerm(), this.getTerm_Concept(), "terms", null, 1, -1, VocabularyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(vocabularyItemEClass, ecorePackage.getEBoolean(), "isPrimitive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(vocabularyItemEClass, this.getVocItemKind(), "getKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(formulationEClass, Formulation.class, "Formulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulation_Form(), this.getFormulationForm(), this.getFormulationForm_Formulation(), "form", null, 0, 1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulation_Language(), ecorePackage.getEString(), "language", null, 1, 1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFormulation_Elements(), theGrammarPackage.getParseElement(), null, "elements", null, 0, -1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFormulation_Concept(), this.getVocabularyItem(), this.getVocabularyItem_Formulations(), "concept", null, 1, 1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(formulationEClass, ecorePackage.getEBoolean(), "isStructured", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(formulationEClass, null, "addElement", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theGrammarPackage.getParseElement(), "elt", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(formulationFormEClass, FormulationForm.class, "FormulationForm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulationForm_Formulation(), this.getFormulation(), this.getFormulation_Form(), "formulation", null, 0, 1, FormulationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(formulationFormEClass, ecorePackage.getEBoolean(), "isStructured", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(verbRoleEClass, VerbRole.class, "VerbRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerbRole_Range(), this.getVocNoun(), null, "range", null, 1, 1, VerbRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerbRole_Verb(), this.getVocVerb(), this.getVocVerb_Roles(), "verb", null, 1, 1, VerbRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerbRole_Term(), this.getTerm(), this.getTerm_Role(), "term", null, 0, 1, VerbRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVerbRole_IsRange(), ecorePackage.getEBoolean(), "isRange", null, 1, 1, VerbRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocNounEClass, VocNoun.class, "VocNoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocNoun_IsAVerb(), this.getVocVerb(), null, "isAVerb", null, 0, 1, VocNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocNoun_Predicate(), theLogicPackage.getPredicate(), theLogicPackage.getPredicate_Noun(), "predicate", null, 0, 1, VocNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVocNoun_MassNoun(), ecorePackage.getEBoolean(), "massNoun", null, 1, 1, VocNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocVerbEClass, VocVerb.class, "VocVerb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVocVerb_Arity(), ecorePackage.getEInt(), "arity", null, 1, 1, VocVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocVerb_Roles(), this.getVerbRole(), this.getVerbRole_Verb(), "roles", null, 1, -1, VocVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocVerb_Form(), this.getSyntaxForm(), this.getSyntaxForm_Verb(), "form", null, 1, -1, VocVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocVerb_Predicate(), theLogicPackage.getPredicate(), theLogicPackage.getPredicate_Verb(), "predicate", null, 0, 1, VocVerb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(syntaxFormEClass, SyntaxForm.class, "SyntaxForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSyntaxForm_Elements(), this.getFormElement(), this.getFormElement_Form(), "elements", null, 1, -1, SyntaxForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxForm_IsAuxForm(), ecorePackage.getEBoolean(), "isAuxForm", null, 1, 1, SyntaxForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSyntaxForm_Property(), this.getVocProperty(), this.getVocProperty_PropertyForm(), "property", null, 0, 1, SyntaxForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSyntaxForm_Text(), ecorePackage.getEString(), "text", null, 0, 1, SyntaxForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSyntaxForm_Verb(), this.getVocVerb(), this.getVocVerb_Form(), "verb", null, 0, 1, SyntaxForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(formElementEClass, FormElement.class, "FormElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormElement_Kind(), this.getFormElementKind(), "kind", null, 1, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFormElement_Form(), this.getSyntaxForm(), this.getSyntaxForm_Elements(), "form", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocPropertyEClass, VocProperty.class, "VocProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocProperty_Domain(), this.getVocNoun(), null, "domain", null, 1, 1, VocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocProperty_Range(), this.getVocNoun(), null, "range", null, 1, 1, VocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocProperty_Verb(), this.getVocVerb(), null, "verb", null, 1, 1, VocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocProperty_PropertyForm(), this.getSyntaxForm(), this.getSyntaxForm_Property(), "propertyForm", null, 1, -1, VocProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberWordEClass, NumberWord.class, "NumberWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberWord_Value(), ecorePackage.getEInt(), "value", null, 1, 1, NumberWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumberWord_Decimal(), ecorePackage.getEBoolean(), "decimal", null, 1, 1, NumberWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocUnitEClass, VocUnit.class, "VocUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocUnit_QuantityKind(), this.getVocProperty(), null, "quantityKind", null, 0, 1, VocUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vocNameEClass, VocName.class, "VocName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(vocNameEClass, ecorePackage.getEBoolean(), "isUnit", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(vocAdjectiveEClass, VocAdjective.class, "VocAdjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVocAdjective_Domain(), this.getVocNoun(), null, "domain", null, 0, 1, VocAdjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVocAdjective_Verb(), this.getVocVerb(), null, "verb", null, 1, 1, VocAdjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(particleEClass, Particle.class, "Particle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticle_Role(), this.getRoleElement(), null, "role", null, 0, 1, Particle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticle_Term(), this.getTerm(), this.getTerm_Particle(), "term", null, 1, 1, Particle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleElementEClass, RoleElement.class, "RoleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleElement_Role(), this.getVerbRole(), null, "role", null, 1, 1, RoleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoleElement_Slot(), ecorePackage.getEInt(), "slot", null, 0, 1, RoleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyword_Kind(), this.getKeywordKind(), "kind", null, 1, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(itemElementEClass, ItemElement.class, "ItemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemElement_Term(), this.getTerm(), this.getTerm_Element(), "term", null, 1, 1, ItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(adjunctEClass, Adjunct.class, "Adjunct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nounEClass, Noun.class, "Noun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoun_Plural(), this.getWordForm(), null, "plural", null, 1, 1, Noun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNoun_AltPlural(), this.getWordForm(), null, "altPlural", null, 0, 1, Noun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verbEClass, Verb.class, "Verb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerb_Singular(), this.getWordForm(), null, "singular", null, 1, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerb_Plural(), this.getWordForm(), null, "plural", null, 1, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerb_Past(), this.getWordForm(), null, "past", null, 1, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerb_Progressive(), this.getWordForm(), null, "progressive", null, 1, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerb_Perfective(), this.getWordForm(), null, "perfective", null, 1, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVerb_AltPast(), this.getWordForm(), null, "altPast", null, 0, 1, Verb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(verbEClass, ecorePackage.getEBoolean(), "isProgressive", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "wf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(verbEClass, ecorePackage.getEBoolean(), "isPast", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "wf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(verbEClass, ecorePackage.getEBoolean(), "isPerfective", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "wf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictionary_FirstWord(), this.getWord(), null, "firstWord", null, 0, 1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringWordEClass, StringWord.class, "StringWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminologyEClass, Terminology.class, "Terminology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminology_FirstItem(), this.getVocabularyItem(), null, "firstItem", null, 0, 1, Terminology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerminology_LastItem(), this.getVocabularyItem(), null, "lastItem", null, 0, 1, Terminology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isVerbEClass, IsVerb.class, "IsVerb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(formElementKindEEnum, FormElementKind.class, "FormElementKind");
		addEEnumLiteral(formElementKindEEnum, FormElementKind.SUBJECT_ROLE);
		addEEnumLiteral(formElementKindEEnum, FormElementKind.OBJECT_ROLE);
		addEEnumLiteral(formElementKindEEnum, FormElementKind.PARTICLE_ROLE);
		addEEnumLiteral(formElementKindEEnum, FormElementKind.PARTICLE_ELEMENT);
		addEEnumLiteral(formElementKindEEnum, FormElementKind.ITEM_ELEMENT);

		initEEnum(keywordKindEEnum, KeywordKind.class, "KeywordKind");
		addEEnumLiteral(keywordKindEEnum, KeywordKind.ADJUNCT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KAN);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KALL);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNONE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNO);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KANY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KONE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KAT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KLEAST);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KLESS);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KMOST);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KMORE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHAN);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KEXACTLY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KMANY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNOT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KAND);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KOR);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KIF);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHEN);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KELSE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KONLY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KUNLESS);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KSAME);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KDIFFERENT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KOTHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KANOTHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KMUST);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KMAY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KALWAYS);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHAT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHOSE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.ANAPHOR);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.PRONOUN);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.GENITIVE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KSELF);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KEVERYTHING);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KSOMETHING);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KANYTHING);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNOTHING);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHETHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHAT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHICH);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHERE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHEN);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KWHY);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KHOW);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHIS);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KBOTH);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KEITHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNEITHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KNOR);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTOGETHER);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KBUT);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KINSTEAD);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KTHERE);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KFOR);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KAS);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.KOF);
		addEEnumLiteral(keywordKindEEnum, KeywordKind.FUNCTION);

		initEEnum(vocItemKindEEnum, VocItemKind.class, "VocItemKind");
		addEEnumLiteral(vocItemKindEEnum, VocItemKind.NOUN_CONCEPT);
		addEEnumLiteral(vocItemKindEEnum, VocItemKind.VERB_CONCEPT);
		addEEnumLiteral(vocItemKindEEnum, VocItemKind.ADJECTIVE_CONCEPT);
		addEEnumLiteral(vocItemKindEEnum, VocItemKind.PROPERTY_CONCEPT);
		addEEnumLiteral(vocItemKindEEnum, VocItemKind.PROPER_NAME);

		// Create resource
		createResource(eNS_URI);
	}

} //VocabularyPackageImpl
