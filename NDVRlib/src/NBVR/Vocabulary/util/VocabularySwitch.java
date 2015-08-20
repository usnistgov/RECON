/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.util;

import NBVR.Vocabulary.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage
 * @generated
 */
public class VocabularySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VocabularyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularySwitch() {
		if (modelPackage == null) {
			modelPackage = VocabularyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VocabularyPackage.ADJECTIVE: {
				Adjective adjective = (Adjective)theEObject;
				T result = caseAdjective(adjective);
				if (result == null) result = caseWord(adjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.WORD: {
				Word word = (Word)theEObject;
				T result = caseWord(word);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.WORD_FORM: {
				WordForm wordForm = (WordForm)theEObject;
				T result = caseWordForm(wordForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOCABULARY_ITEM: {
				VocabularyItem vocabularyItem = (VocabularyItem)theEObject;
				T result = caseVocabularyItem(vocabularyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.FORMULATION: {
				Formulation formulation = (Formulation)theEObject;
				T result = caseFormulation(formulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.FORMULATION_FORM: {
				FormulationForm formulationForm = (FormulationForm)theEObject;
				T result = caseFormulationForm(formulationForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VERB_ROLE: {
				VerbRole verbRole = (VerbRole)theEObject;
				T result = caseVerbRole(verbRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_NOUN: {
				VocNoun vocNoun = (VocNoun)theEObject;
				T result = caseVocNoun(vocNoun);
				if (result == null) result = caseVocabularyItem(vocNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_VERB: {
				VocVerb vocVerb = (VocVerb)theEObject;
				T result = caseVocVerb(vocVerb);
				if (result == null) result = caseVocabularyItem(vocVerb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.SYNTAX_FORM: {
				SyntaxForm syntaxForm = (SyntaxForm)theEObject;
				T result = caseSyntaxForm(syntaxForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.FORM_ELEMENT: {
				FormElement formElement = (FormElement)theEObject;
				T result = caseFormElement(formElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_PROPERTY: {
				VocProperty vocProperty = (VocProperty)theEObject;
				T result = caseVocProperty(vocProperty);
				if (result == null) result = caseVocabularyItem(vocProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.NUMBER_WORD: {
				NumberWord numberWord = (NumberWord)theEObject;
				T result = caseNumberWord(numberWord);
				if (result == null) result = caseWord(numberWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_UNIT: {
				VocUnit vocUnit = (VocUnit)theEObject;
				T result = caseVocUnit(vocUnit);
				if (result == null) result = caseVocName(vocUnit);
				if (result == null) result = caseVocabularyItem(vocUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_NAME: {
				VocName vocName = (VocName)theEObject;
				T result = caseVocName(vocName);
				if (result == null) result = caseVocabularyItem(vocName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VOC_ADJECTIVE: {
				VocAdjective vocAdjective = (VocAdjective)theEObject;
				T result = caseVocAdjective(vocAdjective);
				if (result == null) result = caseVocabularyItem(vocAdjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.PARTICLE: {
				Particle particle = (Particle)theEObject;
				T result = caseParticle(particle);
				if (result == null) result = caseFormElement(particle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.ROLE_ELEMENT: {
				RoleElement roleElement = (RoleElement)theEObject;
				T result = caseRoleElement(roleElement);
				if (result == null) result = caseFormElement(roleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.KEYWORD: {
				Keyword keyword = (Keyword)theEObject;
				T result = caseKeyword(keyword);
				if (result == null) result = caseWord(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.ITEM_ELEMENT: {
				ItemElement itemElement = (ItemElement)theEObject;
				T result = caseItemElement(itemElement);
				if (result == null) result = caseFormElement(itemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.ADJUNCT: {
				Adjunct adjunct = (Adjunct)theEObject;
				T result = caseAdjunct(adjunct);
				if (result == null) result = caseWord(adjunct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.NOUN: {
				Noun noun = (Noun)theEObject;
				T result = caseNoun(noun);
				if (result == null) result = caseWord(noun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseWord(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.VERB: {
				Verb verb = (Verb)theEObject;
				T result = caseVerb(verb);
				if (result == null) result = caseWord(verb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.DICTIONARY: {
				Dictionary dictionary = (Dictionary)theEObject;
				T result = caseDictionary(dictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.STRING_WORD: {
				StringWord stringWord = (StringWord)theEObject;
				T result = caseStringWord(stringWord);
				if (result == null) result = caseWord(stringWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseFormulation(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseWord(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.TERMINOLOGY: {
				Terminology terminology = (Terminology)theEObject;
				T result = caseTerminology(terminology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VocabularyPackage.IS_VERB: {
				IsVerb isVerb = (IsVerb)theEObject;
				T result = caseIsVerb(isVerb);
				if (result == null) result = caseVerb(isVerb);
				if (result == null) result = caseWord(isVerb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjective(Adjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWord(Word object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWordForm(WordForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyItem(VocabularyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulation(Formulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formulation Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formulation Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulationForm(FormulationForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verb Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verb Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbRole(VerbRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocNoun(VocNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocVerb(VocVerb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntaxForm(SyntaxForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormElement(FormElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocProperty(VocProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberWord(NumberWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocUnit(VocUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocName(VocName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voc Adjective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voc Adjective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocAdjective(VocAdjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Particle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Particle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticle(Particle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleElement(RoleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyword(Keyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemElement(ItemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adjunct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adjunct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdjunct(Adjunct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoun(Noun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerb(Verb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionary(Dictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringWord(StringWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminology(Terminology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Verb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Verb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsVerb(IsVerb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VocabularySwitch
