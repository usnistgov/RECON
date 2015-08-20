/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;


import NBVR.Grammar.CompoundForm;
import NBVR.Grammar.Condition;
import NBVR.Grammar.Connective;
import NBVR.Grammar.Dimension;
import NBVR.Grammar.DomainForm;
import NBVR.Grammar.ElementKind;
import NBVR.Grammar.GrammarFactory;
import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.GroupKind;
import NBVR.Grammar.GroupPhrase;
import NBVR.Grammar.ImplicationForm;
import NBVR.Grammar.Instance;
import NBVR.Grammar.InstanceKind;
import NBVR.Grammar.Intension;
import NBVR.Grammar.LexicalInstance;
import NBVR.Grammar.LocalName;
import NBVR.Grammar.Modality;
import NBVR.Grammar.ModifiedTerm;
import NBVR.Grammar.Modifier;
import NBVR.Grammar.Nominalization;
import NBVR.Grammar.Parse;
import NBVR.Grammar.ParseElement;
import NBVR.Grammar.PartPhrase;
import NBVR.Grammar.PhraseType;
import NBVR.Grammar.Pronoun;
import NBVR.Grammar.ProperName;
import NBVR.Grammar.PropertyNoun;
import NBVR.Grammar.Qualifier;
import NBVR.Grammar.QualifierChain;
import NBVR.Grammar.Quantifier;
import NBVR.Grammar.QuantifierKind;
import NBVR.Grammar.Quantity;
import NBVR.Grammar.QueryKind;
import NBVR.Grammar.QueryPhrase;
import NBVR.Grammar.Question;
import NBVR.Grammar.RoleNoun;
import NBVR.Grammar.RolePhrase;
import NBVR.Grammar.Sentence;
import NBVR.Grammar.SentenceType;
import NBVR.Grammar.SimpleForm;
import NBVR.Grammar.SimpleNounPhrase;
import NBVR.Grammar.SimpleQualifier;
import NBVR.Grammar.Statement;
import NBVR.Grammar.TypeNoun;
import NBVR.Grammar.VerbPhrase;

import NBVR.Logic.LogicPackage;
import NBVR.Logic.impl.LogicPackageImpl;
import NBVR.Vocabulary.VocabularyPackage;

import NBVR.Vocabulary.impl.VocabularyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarPackageImpl extends EPackageImpl implements GrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleNounPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiedTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyNounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sentenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lexicalInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPhraseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pronounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass properNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phraseTypeEEnum = null;

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
	 * @see NBVR.Grammar.GrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarPackageImpl() {
		super(eNS_URI, GrammarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarPackage init() {
		if (isInited) return (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Obtain or create and register package
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrammarPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VocabularyPackageImpl theVocabularyPackage = (VocabularyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI) instanceof VocabularyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI) : VocabularyPackage.eINSTANCE);
		LogicPackageImpl theLogicPackage = (LogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) : LogicPackage.eINSTANCE);

		// Create package meta-data objects
		theGrammarPackage.createPackageContents();
		theVocabularyPackage.createPackageContents();
		theLogicPackage.createPackageContents();

		// Initialize created meta-data
		theGrammarPackage.initializePackageContents();
		theVocabularyPackage.initializePackageContents();
		theLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarPackage.eNS_URI, theGrammarPackage);
		return theGrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePhrase() {
		return rolePhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePhrase_RolePlayed() {
		return (EReference)rolePhraseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePhrase_Variable() {
		return (EReference)rolePhraseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePhrase_Referent() {
		return (EReference)rolePhraseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleNounPhrase() {
		return simpleNounPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Otherwise() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Qualifier() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Antecedent() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupPhrase() {
		return groupPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupPhrase_Members() {
		return (EReference)groupPhraseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupPhrase_Kind() {
		return (EAttribute)groupPhraseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeNoun() {
		return typeNounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeNoun_Noun() {
		return (EReference)typeNounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedTerm() {
		return modifiedTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTerm_Quantifier() {
		return (EReference)modifiedTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTerm_Modifiers() {
		return (EReference)modifiedTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTerm_Qualifiers() {
		return (EReference)modifiedTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifier() {
		return quantifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifier_Kind() {
		return (EAttribute)quantifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifier_Count() {
		return (EAttribute)quantifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifier_Quantity() {
		return (EReference)quantifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_Adjective() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Kind() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_Relative() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifier() {
		return qualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleQualifier() {
		return simpleQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleQualifier_Condition() {
		return (EReference)simpleQualifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleQualifier_BoundForm() {
		return (EReference)simpleQualifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleQualifier_Chain() {
		return (EReference)simpleQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierChain() {
		return qualifierChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierChain_Qualifiers() {
		return (EReference)qualifierChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyNoun() {
		return propertyNounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyNoun_Domain() {
		return (EReference)propertyNounEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyNoun_Expansion() {
		return (EReference)propertyNounEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyNoun_Property() {
		return (EReference)propertyNounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNoun() {
		return roleNounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleNoun_Role() {
		return (EReference)roleNounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbPhrase() {
		return verbPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbPhrase_Verb() {
		return (EReference)verbPhraseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerbPhrase_Modality() {
		return (EAttribute)verbPhraseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerbPhrase_Negated() {
		return (EAttribute)verbPhraseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleForm() {
		return simpleFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleForm_Verb() {
		return (EReference)simpleFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleForm_PartPhrases() {
		return (EReference)simpleFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleForm_Subject() {
		return (EReference)simpleFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleForm_Object() {
		return (EReference)simpleFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Domain() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Rewrites() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParse() {
		return parseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartPhrase() {
		return partPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartPhrase_PartRole() {
		return (EReference)partPhraseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartPhrase_Particle() {
		return (EReference)partPhraseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicationForm() {
		return implicationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationForm_Antecedent() {
		return (EReference)implicationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationForm_Consequent() {
		return (EReference)implicationFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationForm_Alternative() {
		return (EReference)implicationFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicationForm_Kind() {
		return (EAttribute)implicationFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSentenceType() {
		return sentenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryKind() {
		return queryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementKind() {
		return elementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundForm() {
		return compoundFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundForm_Statements() {
		return (EReference)compoundFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundForm_Kind() {
		return (EAttribute)compoundFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLexicalInstance() {
		return lexicalInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLexicalInstance_Word() {
		return (EReference)lexicalInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNominalization() {
		return nominalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNominalization_Sentence() {
		return (EReference)nominalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Query() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_QueryPhrase() {
		return (EReference)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryPhrase() {
		return queryPhraseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryPhrase_Domain() {
		return (EReference)queryPhraseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryPhrase_Query() {
		return (EAttribute)queryPhraseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryPhrase_Question() {
		return (EReference)queryPhraseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPronoun() {
		return pronounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPronoun_Keyword() {
		return (EReference)pronounEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntension() {
		return intensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntension_Concept() {
		return (EReference)intensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainForm() {
		return domainFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainForm_Statement() {
		return (EReference)domainFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainForm_Modality() {
		return (EAttribute)domainFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalName() {
		return localNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalName_Word() {
		return (EReference)localNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalName_Next() {
		return (EReference)localNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Factor() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Dimension() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Unit() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Exponent() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParseElement() {
		return parseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParseElement_Parent() {
		return (EReference)parseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceKind() {
		return instanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnective() {
		return connectiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperName() {
		return properNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperName_Name() {
		return (EReference)properNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupKind() {
		return groupKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifierKind() {
		return quantifierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModality() {
		return modalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhraseType() {
		return phraseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactory getGrammarFactory() {
		return (GrammarFactory)getEFactoryInstance();
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
		groupPhraseEClass = createEClass(GROUP_PHRASE);
		createEReference(groupPhraseEClass, GROUP_PHRASE__MEMBERS);
		createEAttribute(groupPhraseEClass, GROUP_PHRASE__KIND);

		rolePhraseEClass = createEClass(ROLE_PHRASE);
		createEReference(rolePhraseEClass, ROLE_PHRASE__ROLE_PLAYED);
		createEReference(rolePhraseEClass, ROLE_PHRASE__VARIABLE);
		createEReference(rolePhraseEClass, ROLE_PHRASE__REFERENT);

		simpleNounPhraseEClass = createEClass(SIMPLE_NOUN_PHRASE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OTHERWISE);
		createEReference(conditionEClass, CONDITION__QUALIFIER);
		createEReference(conditionEClass, CONDITION__ANTECEDENT);

		simpleQualifierEClass = createEClass(SIMPLE_QUALIFIER);
		createEReference(simpleQualifierEClass, SIMPLE_QUALIFIER__CHAIN);
		createEReference(simpleQualifierEClass, SIMPLE_QUALIFIER__BOUND_FORM);
		createEReference(simpleQualifierEClass, SIMPLE_QUALIFIER__CONDITION);

		qualifierEClass = createEClass(QUALIFIER);

		qualifierChainEClass = createEClass(QUALIFIER_CHAIN);
		createEReference(qualifierChainEClass, QUALIFIER_CHAIN__QUALIFIERS);

		sentenceEClass = createEClass(SENTENCE);
		createEReference(sentenceEClass, SENTENCE__DOMAIN);
		createEReference(sentenceEClass, SENTENCE__REWRITES);

		typeNounEClass = createEClass(TYPE_NOUN);
		createEReference(typeNounEClass, TYPE_NOUN__NOUN);

		modifiedTermEClass = createEClass(MODIFIED_TERM);
		createEReference(modifiedTermEClass, MODIFIED_TERM__QUANTIFIER);
		createEReference(modifiedTermEClass, MODIFIED_TERM__MODIFIERS);
		createEReference(modifiedTermEClass, MODIFIED_TERM__QUALIFIERS);

		quantifierEClass = createEClass(QUANTIFIER);
		createEAttribute(quantifierEClass, QUANTIFIER__KIND);
		createEAttribute(quantifierEClass, QUANTIFIER__COUNT);
		createEReference(quantifierEClass, QUANTIFIER__QUANTITY);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__FACTOR);
		createEReference(quantityEClass, QUANTITY__DIMENSION);

		instanceEClass = createEClass(INSTANCE);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__EXPONENT);
		createEReference(dimensionEClass, DIMENSION__UNIT);

		modifierEClass = createEClass(MODIFIER);
		createEReference(modifierEClass, MODIFIER__ADJECTIVE);
		createEAttribute(modifierEClass, MODIFIER__KIND);
		createEReference(modifierEClass, MODIFIER__RELATIVE);

		propertyNounEClass = createEClass(PROPERTY_NOUN);
		createEReference(propertyNounEClass, PROPERTY_NOUN__PROPERTY);
		createEReference(propertyNounEClass, PROPERTY_NOUN__DOMAIN);
		createEReference(propertyNounEClass, PROPERTY_NOUN__EXPANSION);

		roleNounEClass = createEClass(ROLE_NOUN);
		createEReference(roleNounEClass, ROLE_NOUN__ROLE);

		verbPhraseEClass = createEClass(VERB_PHRASE);
		createEReference(verbPhraseEClass, VERB_PHRASE__VERB);
		createEAttribute(verbPhraseEClass, VERB_PHRASE__MODALITY);
		createEAttribute(verbPhraseEClass, VERB_PHRASE__NEGATED);

		partPhraseEClass = createEClass(PART_PHRASE);
		createEReference(partPhraseEClass, PART_PHRASE__PART_ROLE);
		createEReference(partPhraseEClass, PART_PHRASE__PARTICLE);

		simpleFormEClass = createEClass(SIMPLE_FORM);
		createEReference(simpleFormEClass, SIMPLE_FORM__VERB);
		createEReference(simpleFormEClass, SIMPLE_FORM__PART_PHRASES);
		createEReference(simpleFormEClass, SIMPLE_FORM__SUBJECT);
		createEReference(simpleFormEClass, SIMPLE_FORM__OBJECT);

		implicationFormEClass = createEClass(IMPLICATION_FORM);
		createEReference(implicationFormEClass, IMPLICATION_FORM__ANTECEDENT);
		createEReference(implicationFormEClass, IMPLICATION_FORM__CONSEQUENT);
		createEReference(implicationFormEClass, IMPLICATION_FORM__ALTERNATIVE);
		createEAttribute(implicationFormEClass, IMPLICATION_FORM__KIND);

		compoundFormEClass = createEClass(COMPOUND_FORM);
		createEAttribute(compoundFormEClass, COMPOUND_FORM__KIND);
		createEReference(compoundFormEClass, COMPOUND_FORM__STATEMENTS);

		lexicalInstanceEClass = createEClass(LEXICAL_INSTANCE);
		createEReference(lexicalInstanceEClass, LEXICAL_INSTANCE__WORD);

		nominalizationEClass = createEClass(NOMINALIZATION);
		createEReference(nominalizationEClass, NOMINALIZATION__SENTENCE);

		statementEClass = createEClass(STATEMENT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__QUERY);
		createEReference(questionEClass, QUESTION__QUERY_PHRASE);

		queryPhraseEClass = createEClass(QUERY_PHRASE);
		createEReference(queryPhraseEClass, QUERY_PHRASE__DOMAIN);
		createEAttribute(queryPhraseEClass, QUERY_PHRASE__QUERY);
		createEReference(queryPhraseEClass, QUERY_PHRASE__QUESTION);

		properNameEClass = createEClass(PROPER_NAME);
		createEReference(properNameEClass, PROPER_NAME__NAME);

		pronounEClass = createEClass(PRONOUN);
		createEReference(pronounEClass, PRONOUN__KEYWORD);

		intensionEClass = createEClass(INTENSION);
		createEReference(intensionEClass, INTENSION__CONCEPT);

		parseEClass = createEClass(PARSE);

		domainFormEClass = createEClass(DOMAIN_FORM);
		createEReference(domainFormEClass, DOMAIN_FORM__STATEMENT);
		createEAttribute(domainFormEClass, DOMAIN_FORM__MODALITY);

		localNameEClass = createEClass(LOCAL_NAME);
		createEReference(localNameEClass, LOCAL_NAME__WORD);
		createEReference(localNameEClass, LOCAL_NAME__NEXT);

		parseElementEClass = createEClass(PARSE_ELEMENT);
		createEReference(parseElementEClass, PARSE_ELEMENT__PARENT);

		// Create enums
		quantifierKindEEnum = createEEnum(QUANTIFIER_KIND);
		instanceKindEEnum = createEEnum(INSTANCE_KIND);
		connectiveEEnum = createEEnum(CONNECTIVE);
		modalityEEnum = createEEnum(MODALITY);
		phraseTypeEEnum = createEEnum(PHRASE_TYPE);
		groupKindEEnum = createEEnum(GROUP_KIND);
		sentenceTypeEEnum = createEEnum(SENTENCE_TYPE);
		queryKindEEnum = createEEnum(QUERY_KIND);
		elementKindEEnum = createEEnum(ELEMENT_KIND);
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
		VocabularyPackage theVocabularyPackage = (VocabularyPackage)EPackage.Registry.INSTANCE.getEPackage(VocabularyPackage.eNS_URI);
		LogicPackage theLogicPackage = (LogicPackage)EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupPhraseEClass.getESuperTypes().add(this.getRolePhrase());
		rolePhraseEClass.getESuperTypes().add(theVocabularyPackage.getFormulationForm());
		rolePhraseEClass.getESuperTypes().add(this.getParseElement());
		simpleNounPhraseEClass.getESuperTypes().add(this.getRolePhrase());
		conditionEClass.getESuperTypes().add(this.getParseElement());
		simpleQualifierEClass.getESuperTypes().add(this.getQualifier());
		qualifierEClass.getESuperTypes().add(this.getParseElement());
		qualifierChainEClass.getESuperTypes().add(this.getQualifier());
		sentenceEClass.getESuperTypes().add(theVocabularyPackage.getFormulationForm());
		sentenceEClass.getESuperTypes().add(this.getParseElement());
		typeNounEClass.getESuperTypes().add(this.getModifiedTerm());
		modifiedTermEClass.getESuperTypes().add(this.getSimpleNounPhrase());
		quantifierEClass.getESuperTypes().add(this.getParseElement());
		quantityEClass.getESuperTypes().add(this.getInstance());
		instanceEClass.getESuperTypes().add(this.getSimpleNounPhrase());
		modifierEClass.getESuperTypes().add(this.getParseElement());
		propertyNounEClass.getESuperTypes().add(this.getModifiedTerm());
		roleNounEClass.getESuperTypes().add(this.getSimpleNounPhrase());
		simpleFormEClass.getESuperTypes().add(this.getSentence());
		implicationFormEClass.getESuperTypes().add(this.getSentence());
		compoundFormEClass.getESuperTypes().add(this.getSentence());
		lexicalInstanceEClass.getESuperTypes().add(this.getInstance());
		nominalizationEClass.getESuperTypes().add(this.getInstance());
		statementEClass.getESuperTypes().add(this.getNominalization());
		questionEClass.getESuperTypes().add(this.getNominalization());
		queryPhraseEClass.getESuperTypes().add(this.getRolePhrase());
		properNameEClass.getESuperTypes().add(this.getInstance());
		pronounEClass.getESuperTypes().add(this.getModifiedTerm());
		intensionEClass.getESuperTypes().add(this.getInstance());
		domainFormEClass.getESuperTypes().add(this.getSentence());
		localNameEClass.getESuperTypes().add(this.getSimpleNounPhrase());

		// Initialize classes and features; add operations and parameters
		initEClass(groupPhraseEClass, GroupPhrase.class, "GroupPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupPhrase_Members(), this.getSimpleNounPhrase(), null, "members", null, 1, -1, GroupPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGroupPhrase_Kind(), this.getGroupKind(), "kind", null, 1, 1, GroupPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rolePhraseEClass, RolePhrase.class, "RolePhrase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolePhrase_RolePlayed(), theVocabularyPackage.getVerbRole(), null, "rolePlayed", null, 0, 1, RolePhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRolePhrase_Variable(), theLogicPackage.getVariable(), null, "variable", null, 0, 1, RolePhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRolePhrase_Referent(), this.getRolePhrase(), null, "referent", null, 0, 1, RolePhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(rolePhraseEClass, this.getPhraseType(), "getType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(simpleNounPhraseEClass, SimpleNounPhrase.class, "SimpleNounPhrase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Otherwise(), ecorePackage.getEBoolean(), "otherwise", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCondition_Qualifier(), this.getSimpleQualifier(), this.getSimpleQualifier_Condition(), "qualifier", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCondition_Antecedent(), this.getSentence(), null, "antecedent", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleQualifierEClass, SimpleQualifier.class, "SimpleQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleQualifier_Chain(), this.getQualifierChain(), this.getQualifierChain_Qualifiers(), "chain", null, 0, 1, SimpleQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleQualifier_BoundForm(), this.getSentence(), null, "boundForm", null, 1, 1, SimpleQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleQualifier_Condition(), this.getCondition(), this.getCondition_Qualifier(), "condition", null, 0, 1, SimpleQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qualifierEClass, Qualifier.class, "Qualifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(qualifierEClass, ecorePackage.getEBoolean(), "isSimple", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(qualifierChainEClass, QualifierChain.class, "QualifierChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifierChain_Qualifiers(), this.getSimpleQualifier(), this.getSimpleQualifier_Chain(), "qualifiers", null, 1, -1, QualifierChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sentenceEClass, Sentence.class, "Sentence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSentence_Domain(), this.getRolePhrase(), null, "domain", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSentence_Rewrites(), this.getSentence(), null, "rewrites", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(sentenceEClass, this.getSentenceType(), "getType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typeNounEClass, TypeNoun.class, "TypeNoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeNoun_Noun(), theVocabularyPackage.getVocNoun(), null, "noun", null, 1, 1, TypeNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modifiedTermEClass, ModifiedTerm.class, "ModifiedTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedTerm_Quantifier(), this.getQuantifier(), null, "quantifier", null, 0, 1, ModifiedTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifiedTerm_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, ModifiedTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifiedTerm_Qualifiers(), this.getQualifier(), null, "qualifiers", null, 0, -1, ModifiedTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantifierEClass, Quantifier.class, "Quantifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifier_Kind(), this.getQuantifierKind(), "kind", null, 1, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantifier_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantifier_Quantity(), this.getQuantity(), null, "quantity", null, 0, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_Factor(), theVocabularyPackage.getNumberWord(), null, "factor", null, 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantity_Dimension(), this.getDimension(), null, "dimension", null, 0, -1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(instanceEClass, this.getInstanceKind(), "getKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Exponent(), ecorePackage.getEInt(), "exponent", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_Unit(), theVocabularyPackage.getVocUnit(), null, "unit", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifier_Adjective(), theVocabularyPackage.getVocAdjective(), null, "adjective", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModifier_Kind(), theVocabularyPackage.getKeywordKind(), "kind", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModifier_Relative(), this.getRolePhrase(), null, "relative", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyNounEClass, PropertyNoun.class, "PropertyNoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyNoun_Property(), theVocabularyPackage.getVocProperty(), null, "property", null, 1, 1, PropertyNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyNoun_Domain(), this.getSimpleNounPhrase(), null, "domain", null, 1, 1, PropertyNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropertyNoun_Expansion(), this.getTypeNoun(), null, "expansion", null, 0, 1, PropertyNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleNounEClass, RoleNoun.class, "RoleNoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleNoun_Role(), theVocabularyPackage.getVerbRole(), null, "role", null, 0, 1, RoleNoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(verbPhraseEClass, VerbPhrase.class, "VerbPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerbPhrase_Verb(), theVocabularyPackage.getVocVerb(), null, "verb", null, 1, 1, VerbPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVerbPhrase_Modality(), this.getModality(), "modality", null, 1, 1, VerbPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVerbPhrase_Negated(), ecorePackage.getEBoolean(), "negated", null, 1, 1, VerbPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partPhraseEClass, PartPhrase.class, "PartPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartPhrase_PartRole(), this.getRolePhrase(), null, "partRole", null, 0, 1, PartPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPartPhrase_Particle(), theVocabularyPackage.getParticle(), null, "particle", null, 1, 1, PartPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleFormEClass, SimpleForm.class, "SimpleForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleForm_Verb(), this.getVerbPhrase(), null, "verb", null, 1, 1, SimpleForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleForm_PartPhrases(), this.getPartPhrase(), null, "partPhrases", null, 0, -1, SimpleForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleForm_Subject(), this.getRolePhrase(), null, "subject", null, 1, 1, SimpleForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimpleForm_Object(), this.getRolePhrase(), null, "object", null, 0, 1, SimpleForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(simpleFormEClass, this.getModality(), "getModality", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(simpleFormEClass, ecorePackage.getEBoolean(), "isNegated", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(implicationFormEClass, ImplicationForm.class, "ImplicationForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicationForm_Antecedent(), this.getSentence(), null, "antecedent", null, 1, 1, ImplicationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImplicationForm_Consequent(), this.getSentence(), null, "consequent", null, 1, 1, ImplicationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImplicationForm_Alternative(), this.getSentence(), null, "alternative", null, 0, 1, ImplicationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImplicationForm_Kind(), this.getConnective(), "kind", null, 1, 1, ImplicationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compoundFormEClass, CompoundForm.class, "CompoundForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundForm_Kind(), this.getConnective(), "kind", null, 1, 1, CompoundForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundForm_Statements(), this.getSentence(), null, "statements", null, 1, -1, CompoundForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lexicalInstanceEClass, LexicalInstance.class, "LexicalInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLexicalInstance_Word(), theVocabularyPackage.getWord(), null, "word", null, 1, 1, LexicalInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nominalizationEClass, Nominalization.class, "Nominalization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNominalization_Sentence(), this.getSentence(), null, "sentence", null, 1, 1, Nominalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Query(), this.getQueryKind(), "query", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuestion_QueryPhrase(), this.getQueryPhrase(), this.getQueryPhrase_Question(), "queryPhrase", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryPhraseEClass, QueryPhrase.class, "QueryPhrase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryPhrase_Domain(), this.getRolePhrase(), null, "domain", null, 1, 1, QueryPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQueryPhrase_Query(), this.getQueryKind(), "query", null, 1, 1, QueryPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQueryPhrase_Question(), this.getQuestion(), this.getQuestion_QueryPhrase(), "question", null, 1, 1, QueryPhrase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(properNameEClass, ProperName.class, "ProperName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperName_Name(), theVocabularyPackage.getVocName(), null, "name", null, 1, 1, ProperName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pronounEClass, Pronoun.class, "Pronoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPronoun_Keyword(), theVocabularyPackage.getKeyword(), null, "keyword", null, 1, 1, Pronoun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intensionEClass, Intension.class, "Intension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntension_Concept(), this.getRolePhrase(), null, "concept", null, 0, 1, Intension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parseEClass, Parse.class, "Parse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainFormEClass, DomainForm.class, "DomainForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainForm_Statement(), this.getSentence(), null, "statement", null, 0, 1, DomainForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDomainForm_Modality(), this.getModality(), "modality", null, 1, 1, DomainForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localNameEClass, LocalName.class, "LocalName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalName_Word(), theVocabularyPackage.getWord(), null, "word", null, 1, 1, LocalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalName_Next(), this.getLocalName(), null, "next", null, 0, 1, LocalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parseElementEClass, ParseElement.class, "ParseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParseElement_Parent(), this.getParseElement(), null, "parent", null, 0, 1, ParseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(parseElementEClass, this.getElementKind(), "getElementKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(parseElementEClass, ecorePackage.getEBoolean(), "isSentence", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(parseElementEClass, ecorePackage.getEBoolean(), "isInstance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(parseElementEClass, ecorePackage.getEBoolean(), "isRolePhrase", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantifierKindEEnum, QuantifierKind.class, "QuantifierKind");
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.QAN);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.QTHE);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.QALL);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.QNO);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.QANY);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.AT_LEAST1);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.AT_MOST1);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.EXACTLY1);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.AT_LEAST_N);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.AT_MOST_N);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.EXACTLY_N);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.LESS_THAN_N);
		addEEnumLiteral(quantifierKindEEnum, QuantifierKind.MORE_THAN_N);

		initEEnum(instanceKindEEnum, InstanceKind.class, "InstanceKind");
		addEEnumLiteral(instanceKindEEnum, InstanceKind.NAME);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.NUMBER);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.STRING);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.QUANTITY);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.STATEMENT);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.QUESTION);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.QUERY);
		addEEnumLiteral(instanceKindEEnum, InstanceKind.CONCEPT);

		initEEnum(connectiveEEnum, Connective.class, "Connective");
		addEEnumLiteral(connectiveEEnum, Connective.AND);
		addEEnumLiteral(connectiveEEnum, Connective.OR);
		addEEnumLiteral(connectiveEEnum, Connective.NOR);
		addEEnumLiteral(connectiveEEnum, Connective.XOR);
		addEEnumLiteral(connectiveEEnum, Connective.IF);
		addEEnumLiteral(connectiveEEnum, Connective.UNLESS);
		addEEnumLiteral(connectiveEEnum, Connective.ONLY_IF);
		addEEnumLiteral(connectiveEEnum, Connective.EQV);

		initEEnum(modalityEEnum, Modality.class, "Modality");
		addEEnumLiteral(modalityEEnum, Modality.NONE);
		addEEnumLiteral(modalityEEnum, Modality.NEGATION);
		addEEnumLiteral(modalityEEnum, Modality.OBLIGATION);
		addEEnumLiteral(modalityEEnum, Modality.PROHIBITION);
		addEEnumLiteral(modalityEEnum, Modality.PERMISSION);
		addEEnumLiteral(modalityEEnum, Modality.PERMITTED_NOT);
		addEEnumLiteral(modalityEEnum, Modality.POSSIBILITY);
		addEEnumLiteral(modalityEEnum, Modality.IMPOSSIBILITY);
		addEEnumLiteral(modalityEEnum, Modality.PREFERENCE);
		addEEnumLiteral(modalityEEnum, Modality.ANTIPREFERENCE);
		addEEnumLiteral(modalityEEnum, Modality.NONPREFERENCE);

		initEEnum(phraseTypeEEnum, PhraseType.class, "PhraseType");
		addEEnumLiteral(phraseTypeEEnum, PhraseType.INSTANCE);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.GROUP);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.QUERY);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.TYPE_NOUN);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.PROPERTY);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.ROLE_NOUN);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.PRONOUN);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.ANAPHOR);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.INTERROGATIVE);
		addEEnumLiteral(phraseTypeEEnum, PhraseType.LOCAL_NAME);

		initEEnum(groupKindEEnum, GroupKind.class, "GroupKind");
		addEEnumLiteral(groupKindEEnum, GroupKind.JOINT);
		addEEnumLiteral(groupKindEEnum, GroupKind.ALL);
		addEEnumLiteral(groupKindEEnum, GroupKind.CHOICE);
		addEEnumLiteral(groupKindEEnum, GroupKind.NEITHER);
		addEEnumLiteral(groupKindEEnum, GroupKind.INSTEAD);

		initEEnum(sentenceTypeEEnum, SentenceType.class, "SentenceType");
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.OTHER);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.SIMPLE);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.COMPOUND);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.IMPLICATION);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.EQUIVALENCE);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.DOMAIN);
		addEEnumLiteral(sentenceTypeEEnum, SentenceType.MODAL);

		initEEnum(queryKindEEnum, QueryKind.class, "QueryKind");
		addEEnumLiteral(queryKindEEnum, QueryKind.ANY);
		addEEnumLiteral(queryKindEEnum, QueryKind.WHAT);
		addEEnumLiteral(queryKindEEnum, QueryKind.WHETHER);
		addEEnumLiteral(queryKindEEnum, QueryKind.WHY);
		addEEnumLiteral(queryKindEEnum, QueryKind.HOW);
		addEEnumLiteral(queryKindEEnum, QueryKind.WHERE);
		addEEnumLiteral(queryKindEEnum, QueryKind.WHEN);
		addEEnumLiteral(queryKindEEnum, QueryKind.HOW_MANY);

		initEEnum(elementKindEEnum, ElementKind.class, "ElementKind");
		addEEnumLiteral(elementKindEEnum, ElementKind.NONE);
		addEEnumLiteral(elementKindEEnum, ElementKind.SENTENCE);
		addEEnumLiteral(elementKindEEnum, ElementKind.QUALIFIER);
		addEEnumLiteral(elementKindEEnum, ElementKind.QUANTIFIER);
		addEEnumLiteral(elementKindEEnum, ElementKind.CONDITION);
		addEEnumLiteral(elementKindEEnum, ElementKind.MODIFIER);
		addEEnumLiteral(elementKindEEnum, ElementKind.NOUN);
		addEEnumLiteral(elementKindEEnum, ElementKind.GROUP);
		addEEnumLiteral(elementKindEEnum, ElementKind.QUERY);
		addEEnumLiteral(elementKindEEnum, ElementKind.INSTANCE);
		addEEnumLiteral(elementKindEEnum, ElementKind.PROPERTY);
		addEEnumLiteral(elementKindEEnum, ElementKind.PRONOUN);
		addEEnumLiteral(elementKindEEnum, ElementKind.ROLE);

		// Create resource
		createResource(eNS_URI);
	}

} //GrammarPackageImpl
