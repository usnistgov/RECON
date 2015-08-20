/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.util;

import NBVR.Grammar.*;

import NBVR.Vocabulary.FormulationForm;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NBVR.Grammar.GrammarPackage
 * @generated
 */
public class GrammarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrammarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarSwitch<Adapter> modelSwitch =
		new GrammarSwitch<Adapter>() {
			@Override
			public Adapter caseGroupPhrase(GroupPhrase object) {
				return createGroupPhraseAdapter();
			}
			@Override
			public Adapter caseRolePhrase(RolePhrase object) {
				return createRolePhraseAdapter();
			}
			@Override
			public Adapter caseSimpleNounPhrase(SimpleNounPhrase object) {
				return createSimpleNounPhraseAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseSimpleQualifier(SimpleQualifier object) {
				return createSimpleQualifierAdapter();
			}
			@Override
			public Adapter caseQualifier(Qualifier object) {
				return createQualifierAdapter();
			}
			@Override
			public Adapter caseQualifierChain(QualifierChain object) {
				return createQualifierChainAdapter();
			}
			@Override
			public Adapter caseSentence(Sentence object) {
				return createSentenceAdapter();
			}
			@Override
			public Adapter caseTypeNoun(TypeNoun object) {
				return createTypeNounAdapter();
			}
			@Override
			public Adapter caseModifiedTerm(ModifiedTerm object) {
				return createModifiedTermAdapter();
			}
			@Override
			public Adapter caseQuantifier(Quantifier object) {
				return createQuantifierAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseModifier(Modifier object) {
				return createModifierAdapter();
			}
			@Override
			public Adapter casePropertyNoun(PropertyNoun object) {
				return createPropertyNounAdapter();
			}
			@Override
			public Adapter caseRoleNoun(RoleNoun object) {
				return createRoleNounAdapter();
			}
			@Override
			public Adapter caseVerbPhrase(VerbPhrase object) {
				return createVerbPhraseAdapter();
			}
			@Override
			public Adapter casePartPhrase(PartPhrase object) {
				return createPartPhraseAdapter();
			}
			@Override
			public Adapter caseSimpleForm(SimpleForm object) {
				return createSimpleFormAdapter();
			}
			@Override
			public Adapter caseImplicationForm(ImplicationForm object) {
				return createImplicationFormAdapter();
			}
			@Override
			public Adapter caseCompoundForm(CompoundForm object) {
				return createCompoundFormAdapter();
			}
			@Override
			public Adapter caseLexicalInstance(LexicalInstance object) {
				return createLexicalInstanceAdapter();
			}
			@Override
			public Adapter caseNominalization(Nominalization object) {
				return createNominalizationAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseQueryPhrase(QueryPhrase object) {
				return createQueryPhraseAdapter();
			}
			@Override
			public Adapter caseProperName(ProperName object) {
				return createProperNameAdapter();
			}
			@Override
			public Adapter casePronoun(Pronoun object) {
				return createPronounAdapter();
			}
			@Override
			public Adapter caseIntension(Intension object) {
				return createIntensionAdapter();
			}
			@Override
			public Adapter caseParse(Parse object) {
				return createParseAdapter();
			}
			@Override
			public Adapter caseDomainForm(DomainForm object) {
				return createDomainFormAdapter();
			}
			@Override
			public Adapter caseLocalName(LocalName object) {
				return createLocalNameAdapter();
			}
			@Override
			public Adapter caseParseElement(ParseElement object) {
				return createParseElementAdapter();
			}
			@Override
			public Adapter caseFormulationForm(FormulationForm object) {
				return createFormulationFormAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.GroupPhrase <em>Group Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.GroupPhrase
	 * @generated
	 */
	public Adapter createGroupPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.RolePhrase <em>Role Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.RolePhrase
	 * @generated
	 */
	public Adapter createRolePhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.SimpleNounPhrase <em>Simple Noun Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.SimpleNounPhrase
	 * @generated
	 */
	public Adapter createSimpleNounPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.SimpleQualifier <em>Simple Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.SimpleQualifier
	 * @generated
	 */
	public Adapter createSimpleQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Qualifier
	 * @generated
	 */
	public Adapter createQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.QualifierChain <em>Qualifier Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.QualifierChain
	 * @generated
	 */
	public Adapter createQualifierChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Sentence
	 * @generated
	 */
	public Adapter createSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.TypeNoun <em>Type Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.TypeNoun
	 * @generated
	 */
	public Adapter createTypeNounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.ModifiedTerm <em>Modified Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.ModifiedTerm
	 * @generated
	 */
	public Adapter createModifiedTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Quantifier
	 * @generated
	 */
	public Adapter createQuantifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Modifier
	 * @generated
	 */
	public Adapter createModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.PropertyNoun <em>Property Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.PropertyNoun
	 * @generated
	 */
	public Adapter createPropertyNounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.RoleNoun <em>Role Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.RoleNoun
	 * @generated
	 */
	public Adapter createRoleNounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.VerbPhrase <em>Verb Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.VerbPhrase
	 * @generated
	 */
	public Adapter createVerbPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.PartPhrase <em>Part Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.PartPhrase
	 * @generated
	 */
	public Adapter createPartPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.SimpleForm <em>Simple Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.SimpleForm
	 * @generated
	 */
	public Adapter createSimpleFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.ImplicationForm <em>Implication Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.ImplicationForm
	 * @generated
	 */
	public Adapter createImplicationFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.CompoundForm <em>Compound Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.CompoundForm
	 * @generated
	 */
	public Adapter createCompoundFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.LexicalInstance <em>Lexical Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.LexicalInstance
	 * @generated
	 */
	public Adapter createLexicalInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Nominalization <em>Nominalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Nominalization
	 * @generated
	 */
	public Adapter createNominalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.QueryPhrase <em>Query Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.QueryPhrase
	 * @generated
	 */
	public Adapter createQueryPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.ProperName <em>Proper Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.ProperName
	 * @generated
	 */
	public Adapter createProperNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Pronoun <em>Pronoun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Pronoun
	 * @generated
	 */
	public Adapter createPronounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Intension <em>Intension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Intension
	 * @generated
	 */
	public Adapter createIntensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.Parse <em>Parse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.Parse
	 * @generated
	 */
	public Adapter createParseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.DomainForm <em>Domain Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.DomainForm
	 * @generated
	 */
	public Adapter createDomainFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.LocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.LocalName
	 * @generated
	 */
	public Adapter createLocalNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Grammar.ParseElement <em>Parse Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Grammar.ParseElement
	 * @generated
	 */
	public Adapter createParseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.FormulationForm <em>Formulation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.FormulationForm
	 * @generated
	 */
	public Adapter createFormulationFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GrammarAdapterFactory
