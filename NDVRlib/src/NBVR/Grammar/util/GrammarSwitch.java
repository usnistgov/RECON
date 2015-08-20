/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.util;

import NBVR.Grammar.*;

import NBVR.Vocabulary.FormulationForm;

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
 * @see NBVR.Grammar.GrammarPackage
 * @generated
 */
public class GrammarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrammarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarSwitch() {
		if (modelPackage == null) {
			modelPackage = GrammarPackage.eINSTANCE;
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
			case GrammarPackage.GROUP_PHRASE: {
				GroupPhrase groupPhrase = (GroupPhrase)theEObject;
				T result = caseGroupPhrase(groupPhrase);
				if (result == null) result = caseRolePhrase(groupPhrase);
				if (result == null) result = caseFormulationForm(groupPhrase);
				if (result == null) result = caseParseElement(groupPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.ROLE_PHRASE: {
				RolePhrase rolePhrase = (RolePhrase)theEObject;
				T result = caseRolePhrase(rolePhrase);
				if (result == null) result = caseFormulationForm(rolePhrase);
				if (result == null) result = caseParseElement(rolePhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SIMPLE_NOUN_PHRASE: {
				SimpleNounPhrase simpleNounPhrase = (SimpleNounPhrase)theEObject;
				T result = caseSimpleNounPhrase(simpleNounPhrase);
				if (result == null) result = caseRolePhrase(simpleNounPhrase);
				if (result == null) result = caseFormulationForm(simpleNounPhrase);
				if (result == null) result = caseParseElement(simpleNounPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseParseElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SIMPLE_QUALIFIER: {
				SimpleQualifier simpleQualifier = (SimpleQualifier)theEObject;
				T result = caseSimpleQualifier(simpleQualifier);
				if (result == null) result = caseQualifier(simpleQualifier);
				if (result == null) result = caseParseElement(simpleQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUALIFIER: {
				Qualifier qualifier = (Qualifier)theEObject;
				T result = caseQualifier(qualifier);
				if (result == null) result = caseParseElement(qualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUALIFIER_CHAIN: {
				QualifierChain qualifierChain = (QualifierChain)theEObject;
				T result = caseQualifierChain(qualifierChain);
				if (result == null) result = caseQualifier(qualifierChain);
				if (result == null) result = caseParseElement(qualifierChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SENTENCE: {
				Sentence sentence = (Sentence)theEObject;
				T result = caseSentence(sentence);
				if (result == null) result = caseFormulationForm(sentence);
				if (result == null) result = caseParseElement(sentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.TYPE_NOUN: {
				TypeNoun typeNoun = (TypeNoun)theEObject;
				T result = caseTypeNoun(typeNoun);
				if (result == null) result = caseModifiedTerm(typeNoun);
				if (result == null) result = caseSimpleNounPhrase(typeNoun);
				if (result == null) result = caseRolePhrase(typeNoun);
				if (result == null) result = caseFormulationForm(typeNoun);
				if (result == null) result = caseParseElement(typeNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.MODIFIED_TERM: {
				ModifiedTerm modifiedTerm = (ModifiedTerm)theEObject;
				T result = caseModifiedTerm(modifiedTerm);
				if (result == null) result = caseSimpleNounPhrase(modifiedTerm);
				if (result == null) result = caseRolePhrase(modifiedTerm);
				if (result == null) result = caseFormulationForm(modifiedTerm);
				if (result == null) result = caseParseElement(modifiedTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUANTIFIER: {
				Quantifier quantifier = (Quantifier)theEObject;
				T result = caseQuantifier(quantifier);
				if (result == null) result = caseParseElement(quantifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseInstance(quantity);
				if (result == null) result = caseSimpleNounPhrase(quantity);
				if (result == null) result = caseRolePhrase(quantity);
				if (result == null) result = caseFormulationForm(quantity);
				if (result == null) result = caseParseElement(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseSimpleNounPhrase(instance);
				if (result == null) result = caseRolePhrase(instance);
				if (result == null) result = caseFormulationForm(instance);
				if (result == null) result = caseParseElement(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = caseParseElement(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PROPERTY_NOUN: {
				PropertyNoun propertyNoun = (PropertyNoun)theEObject;
				T result = casePropertyNoun(propertyNoun);
				if (result == null) result = caseModifiedTerm(propertyNoun);
				if (result == null) result = caseSimpleNounPhrase(propertyNoun);
				if (result == null) result = caseRolePhrase(propertyNoun);
				if (result == null) result = caseFormulationForm(propertyNoun);
				if (result == null) result = caseParseElement(propertyNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.ROLE_NOUN: {
				RoleNoun roleNoun = (RoleNoun)theEObject;
				T result = caseRoleNoun(roleNoun);
				if (result == null) result = caseSimpleNounPhrase(roleNoun);
				if (result == null) result = caseRolePhrase(roleNoun);
				if (result == null) result = caseFormulationForm(roleNoun);
				if (result == null) result = caseParseElement(roleNoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.VERB_PHRASE: {
				VerbPhrase verbPhrase = (VerbPhrase)theEObject;
				T result = caseVerbPhrase(verbPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PART_PHRASE: {
				PartPhrase partPhrase = (PartPhrase)theEObject;
				T result = casePartPhrase(partPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.SIMPLE_FORM: {
				SimpleForm simpleForm = (SimpleForm)theEObject;
				T result = caseSimpleForm(simpleForm);
				if (result == null) result = caseSentence(simpleForm);
				if (result == null) result = caseFormulationForm(simpleForm);
				if (result == null) result = caseParseElement(simpleForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.IMPLICATION_FORM: {
				ImplicationForm implicationForm = (ImplicationForm)theEObject;
				T result = caseImplicationForm(implicationForm);
				if (result == null) result = caseSentence(implicationForm);
				if (result == null) result = caseFormulationForm(implicationForm);
				if (result == null) result = caseParseElement(implicationForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.COMPOUND_FORM: {
				CompoundForm compoundForm = (CompoundForm)theEObject;
				T result = caseCompoundForm(compoundForm);
				if (result == null) result = caseSentence(compoundForm);
				if (result == null) result = caseFormulationForm(compoundForm);
				if (result == null) result = caseParseElement(compoundForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.LEXICAL_INSTANCE: {
				LexicalInstance lexicalInstance = (LexicalInstance)theEObject;
				T result = caseLexicalInstance(lexicalInstance);
				if (result == null) result = caseInstance(lexicalInstance);
				if (result == null) result = caseSimpleNounPhrase(lexicalInstance);
				if (result == null) result = caseRolePhrase(lexicalInstance);
				if (result == null) result = caseFormulationForm(lexicalInstance);
				if (result == null) result = caseParseElement(lexicalInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.NOMINALIZATION: {
				Nominalization nominalization = (Nominalization)theEObject;
				T result = caseNominalization(nominalization);
				if (result == null) result = caseInstance(nominalization);
				if (result == null) result = caseSimpleNounPhrase(nominalization);
				if (result == null) result = caseRolePhrase(nominalization);
				if (result == null) result = caseFormulationForm(nominalization);
				if (result == null) result = caseParseElement(nominalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseNominalization(statement);
				if (result == null) result = caseInstance(statement);
				if (result == null) result = caseSimpleNounPhrase(statement);
				if (result == null) result = caseRolePhrase(statement);
				if (result == null) result = caseFormulationForm(statement);
				if (result == null) result = caseParseElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseNominalization(question);
				if (result == null) result = caseInstance(question);
				if (result == null) result = caseSimpleNounPhrase(question);
				if (result == null) result = caseRolePhrase(question);
				if (result == null) result = caseFormulationForm(question);
				if (result == null) result = caseParseElement(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.QUERY_PHRASE: {
				QueryPhrase queryPhrase = (QueryPhrase)theEObject;
				T result = caseQueryPhrase(queryPhrase);
				if (result == null) result = caseRolePhrase(queryPhrase);
				if (result == null) result = caseFormulationForm(queryPhrase);
				if (result == null) result = caseParseElement(queryPhrase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PROPER_NAME: {
				ProperName properName = (ProperName)theEObject;
				T result = caseProperName(properName);
				if (result == null) result = caseInstance(properName);
				if (result == null) result = caseSimpleNounPhrase(properName);
				if (result == null) result = caseRolePhrase(properName);
				if (result == null) result = caseFormulationForm(properName);
				if (result == null) result = caseParseElement(properName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PRONOUN: {
				Pronoun pronoun = (Pronoun)theEObject;
				T result = casePronoun(pronoun);
				if (result == null) result = caseModifiedTerm(pronoun);
				if (result == null) result = caseSimpleNounPhrase(pronoun);
				if (result == null) result = caseRolePhrase(pronoun);
				if (result == null) result = caseFormulationForm(pronoun);
				if (result == null) result = caseParseElement(pronoun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.INTENSION: {
				Intension intension = (Intension)theEObject;
				T result = caseIntension(intension);
				if (result == null) result = caseInstance(intension);
				if (result == null) result = caseSimpleNounPhrase(intension);
				if (result == null) result = caseRolePhrase(intension);
				if (result == null) result = caseFormulationForm(intension);
				if (result == null) result = caseParseElement(intension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PARSE: {
				Parse parse = (Parse)theEObject;
				T result = caseParse(parse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.DOMAIN_FORM: {
				DomainForm domainForm = (DomainForm)theEObject;
				T result = caseDomainForm(domainForm);
				if (result == null) result = caseSentence(domainForm);
				if (result == null) result = caseFormulationForm(domainForm);
				if (result == null) result = caseParseElement(domainForm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.LOCAL_NAME: {
				LocalName localName = (LocalName)theEObject;
				T result = caseLocalName(localName);
				if (result == null) result = caseSimpleNounPhrase(localName);
				if (result == null) result = caseRolePhrase(localName);
				if (result == null) result = caseFormulationForm(localName);
				if (result == null) result = caseParseElement(localName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GrammarPackage.PARSE_ELEMENT: {
				ParseElement parseElement = (ParseElement)theEObject;
				T result = caseParseElement(parseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupPhrase(GroupPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePhrase(RolePhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Noun Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Noun Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleNounPhrase(SimpleNounPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQualifier(SimpleQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifier(Qualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierChain(QualifierChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentence(Sentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNoun(TypeNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modified Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedTerm(ModifiedTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifier(Quantifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyNoun(PropertyNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Noun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Noun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNoun(RoleNoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verb Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verb Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbPhrase(VerbPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartPhrase(PartPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleForm(SimpleForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicationForm(ImplicationForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundForm(CompoundForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lexical Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lexical Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLexicalInstance(LexicalInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalization(Nominalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Phrase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPhrase(QueryPhrase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proper Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proper Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperName(ProperName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pronoun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pronoun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePronoun(Pronoun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntension(Intension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParse(Parse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainForm(DomainForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalName(LocalName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parse Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parse Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParseElement(ParseElement object) {
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

} //GrammarSwitch
