/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.util;

import NBVR.Vocabulary.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage
 * @generated
 */
public class VocabularyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VocabularyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VocabularyPackage.eINSTANCE;
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
	protected VocabularySwitch<Adapter> modelSwitch =
		new VocabularySwitch<Adapter>() {
			@Override
			public Adapter caseAdjective(Adjective object) {
				return createAdjectiveAdapter();
			}
			@Override
			public Adapter caseWord(Word object) {
				return createWordAdapter();
			}
			@Override
			public Adapter caseWordForm(WordForm object) {
				return createWordFormAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseVocabularyItem(VocabularyItem object) {
				return createVocabularyItemAdapter();
			}
			@Override
			public Adapter caseFormulation(Formulation object) {
				return createFormulationAdapter();
			}
			@Override
			public Adapter caseFormulationForm(FormulationForm object) {
				return createFormulationFormAdapter();
			}
			@Override
			public Adapter caseVerbRole(VerbRole object) {
				return createVerbRoleAdapter();
			}
			@Override
			public Adapter caseVocNoun(VocNoun object) {
				return createVocNounAdapter();
			}
			@Override
			public Adapter caseVocVerb(VocVerb object) {
				return createVocVerbAdapter();
			}
			@Override
			public Adapter caseSyntaxForm(SyntaxForm object) {
				return createSyntaxFormAdapter();
			}
			@Override
			public Adapter caseFormElement(FormElement object) {
				return createFormElementAdapter();
			}
			@Override
			public Adapter caseVocProperty(VocProperty object) {
				return createVocPropertyAdapter();
			}
			@Override
			public Adapter caseNumberWord(NumberWord object) {
				return createNumberWordAdapter();
			}
			@Override
			public Adapter caseVocUnit(VocUnit object) {
				return createVocUnitAdapter();
			}
			@Override
			public Adapter caseVocName(VocName object) {
				return createVocNameAdapter();
			}
			@Override
			public Adapter caseVocAdjective(VocAdjective object) {
				return createVocAdjectiveAdapter();
			}
			@Override
			public Adapter caseParticle(Particle object) {
				return createParticleAdapter();
			}
			@Override
			public Adapter caseRoleElement(RoleElement object) {
				return createRoleElementAdapter();
			}
			@Override
			public Adapter caseKeyword(Keyword object) {
				return createKeywordAdapter();
			}
			@Override
			public Adapter caseItemElement(ItemElement object) {
				return createItemElementAdapter();
			}
			@Override
			public Adapter caseAdjunct(Adjunct object) {
				return createAdjunctAdapter();
			}
			@Override
			public Adapter caseNoun(Noun object) {
				return createNounAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter caseVerb(Verb object) {
				return createVerbAdapter();
			}
			@Override
			public Adapter caseDictionary(Dictionary object) {
				return createDictionaryAdapter();
			}
			@Override
			public Adapter caseStringWord(StringWord object) {
				return createStringWordAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseTerminology(Terminology object) {
				return createTerminologyAdapter();
			}
			@Override
			public Adapter caseIsVerb(IsVerb object) {
				return createIsVerbAdapter();
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
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Adjective <em>Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Adjective
	 * @generated
	 */
	public Adapter createAdjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Word
	 * @generated
	 */
	public Adapter createWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.WordForm <em>Word Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.WordForm
	 * @generated
	 */
	public Adapter createWordFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocabularyItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocabularyItem
	 * @generated
	 */
	public Adapter createVocabularyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Formulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Formulation
	 * @generated
	 */
	public Adapter createFormulationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VerbRole <em>Verb Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VerbRole
	 * @generated
	 */
	public Adapter createVerbRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocNoun <em>Voc Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocNoun
	 * @generated
	 */
	public Adapter createVocNounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocVerb <em>Voc Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocVerb
	 * @generated
	 */
	public Adapter createVocVerbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.SyntaxForm <em>Syntax Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.SyntaxForm
	 * @generated
	 */
	public Adapter createSyntaxFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.FormElement <em>Form Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.FormElement
	 * @generated
	 */
	public Adapter createFormElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocProperty <em>Voc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocProperty
	 * @generated
	 */
	public Adapter createVocPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.NumberWord <em>Number Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.NumberWord
	 * @generated
	 */
	public Adapter createNumberWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocUnit <em>Voc Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocUnit
	 * @generated
	 */
	public Adapter createVocUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocName <em>Voc Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocName
	 * @generated
	 */
	public Adapter createVocNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.VocAdjective <em>Voc Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.VocAdjective
	 * @generated
	 */
	public Adapter createVocAdjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Particle <em>Particle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Particle
	 * @generated
	 */
	public Adapter createParticleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.RoleElement <em>Role Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.RoleElement
	 * @generated
	 */
	public Adapter createRoleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Keyword
	 * @generated
	 */
	public Adapter createKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.ItemElement <em>Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.ItemElement
	 * @generated
	 */
	public Adapter createItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Adjunct <em>Adjunct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Adjunct
	 * @generated
	 */
	public Adapter createAdjunctAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Noun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Noun
	 * @generated
	 */
	public Adapter createNounAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Verb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Verb
	 * @generated
	 */
	public Adapter createVerbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Dictionary
	 * @generated
	 */
	public Adapter createDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.StringWord <em>String Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.StringWord
	 * @generated
	 */
	public Adapter createStringWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.Terminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.Terminology
	 * @generated
	 */
	public Adapter createTerminologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link NBVR.Vocabulary.IsVerb <em>Is Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see NBVR.Vocabulary.IsVerb
	 * @generated
	 */
	public Adapter createIsVerbAdapter() {
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

} //VocabularyAdapterFactory
