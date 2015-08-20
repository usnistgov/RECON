/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import java.util.List;

import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage
 * @generated
 */
public interface VocabularyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VocabularyFactory eINSTANCE = NBVR.Vocabulary.impl.VocabularyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adjective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjective</em>'.
	 * @generated
	 */
	Adjective createAdjective();

	/**
	 * Returns a new object of class '<em>Adjective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjective</em>'.
	 * @generated not
	 */
	Adjective createAdjective(WordForm w);

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * <!-- begin-user-doc -->
	 * create a term that is a copy of an existing term
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	Term createTerm(Term term); 

	/**
	 * <!-- begin-user-doc -->
	 * create a term from a list of words
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	Term createTerm(List<Word> words);
	
	/**
	 * Returns a new object of class '<em>Verb Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb Role</em>'.
	 * @generated
	 */
	VerbRole createVerbRole();

	/**
	 * Returns a new object of class '<em>Voc Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Noun</em>'.
	 * @generated
	 */
	VocNoun createVocNoun();

	/**
	 * Returns a new object of class '<em>Voc Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Property</em>'.
	 * @generated
	 */
	VocProperty createVocProperty();

	/**
	 * Returns a new object of class '<em>Syntax Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syntax Form</em>'.
	 * @generated
	 */
	SyntaxForm createSyntaxForm();
	
	/**
	 * Returns a new object of class '<em>Syntax Form</em>'.
	 * The new item is owned by the VerbItem provided
	 * @param item = the VocabularyItem that owns the Syntax Form
	 * @return a new object of class '<em>Syntax Form</em>'.
	 * @generated not
	 */
	SyntaxForm createSyntaxForm(VocVerb item);

	/**
	 * Returns a new object of class '<em>Word Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Word Form</em>'.
	 * @generated
	 */
	WordForm createWordForm();
	
	/**
	 * Returns an existing object of class '<em>Word Form</em>'.
	 * <!-- begin-user-doc -->
	 *  finds the matching WordForm in the stored Dictionary
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	WordForm findWordForm(char[] intext, int size);

	/** makeWordForm
	 * Returns a new object of class '<em>Word Form</em>'.
	 *   find or make a word form for the given text (char array)
	 *   returns the one found, or creates one if not found
	 * @generated not
	 */
	WordForm makeWordForm(char[] intext, int size);
	WordForm makeWordForm(String intext); 

	/**
	 * Returns a new object of class '<em>Adjunct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjunct</em>'.
	 * @generated
	 */
	Adjunct createAdjunct();

	/**
	 * Returns a new object of class '<em>Adjunct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjunct</em>'.
	 * @generated not
	 */
	Adjunct createAdjunct(WordForm w);

	/**
	 * Returns a new object of class '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword</em>'.
	 * @generated
	 */
	Keyword createKeyword();

	/**
	 * Returns a new object of class '<em>Terminology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology</em>'.
	 * @generated
	 */
	Terminology createTerminology();

	/**
	 * Returns a new object of class '<em>Is Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Verb</em>'.
	 * @generated
	 */
	IsVerb createIsVerb();

	/**
	 * Returns a new object of class '<em>Voc Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Unit</em>'.
	 * @generated
	 */
	VocUnit createVocUnit();

	/**
	 * Returns a new object of class '<em>Keyword</em>'.
	 * <!-- begin-user-doc -->
	 *  real keyword constructor -- sets base and kind
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword</em>'.
	 * @generated not
	 */
	Keyword createKeyword(WordForm w, KeywordKind kk);

	/**
	 * Returns a new object of class '<em>Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noun</em>'.
	 * @generated
	 */
	Noun createNoun();

	/**
	 * Returns a new object of class '<em>Noun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noun</em>'.
	 * @generated not
	 */
	Noun createNoun(WordForm w);

	/**
	 * create the Noun word entry for a special noun
	 * @param sing = the singular (base) form
	 * @param plural = the plural form
	 * @return the Noun object
	 * @generated not
	 */
	Noun createNoun(String sing, String plural);

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
	Name createName();

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated not
	 */
	Name createName(WordForm wf);

	/**
	 * Returns a new object of class '<em>Particle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Particle</em>'.
	 * @generated
	 */
	Particle createParticle();

	/**
	 * Returns a new object of class '<em>Role Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Element</em>'.
	 * @generated
	 */
	RoleElement createRoleElement();

	/**
	 * Returns a new object of class '<em>Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Element</em>'.
	 * @generated
	 */
	ItemElement createItemElement();

	/**
	 * Returns a new object of class '<em>Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb</em>'.
	 * @generated
	 */
	Verb createVerb();

	/**
	 * Returns a new object of class '<em>Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verb</em>'.
	 * @generated not
	 */
	Verb createVerb(WordForm w);

	/**
	 * create the Verb word entry for a special verb
	 * @param inf = the infinitive (base) form
	 * @param sing = the 3rd person singular form
	 * @param past = the 3rd person past form
	 * @param present = the present/progressive participle
	 * @param past = the past/perfective participle
	 * @return the Verb object
	 */
	Verb createVerb(String inf, 
			String singular, String past, String prog, String perf);

	/**
	 * create the Verb word entry for the verb 'to be'
	 * @param inf = the infinitive (base) form
	 * @param sing = the 3rd person singular form
	 * @param plural = the 3rd person plural form
	 * @param past = the past singular form
	 * @param pastPlural = the past plural form
	 * @param prog = the present/progressive participle
	 * @param perf = the past/perfective participle
	 * @return the Verb object
	 * 
	 * @generated not
	 */
	IsVerb createIsVerb(String inf, String singular, String plural,
			String past, String pastPlural, String prog, String perf);

	/**
	 * Returns a new object of class '<em>Voc Adjective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Adjective</em>'.
	 * @generated
	 */
	VocAdjective createVocAdjective();

	/**
	 * Returns a new object of class '<em>Voc Verb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Verb</em>'.
	 * @generated
	 */
	VocVerb createVocVerb();

	/**
	 * Returns a new object of class '<em>Formulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formulation</em>'.
	 * @generated
	 */
	Formulation createFormulation();

	/** createFormulation(language, text, form)
	 *  creates a new Formulation object with the passed properties
	 * @param language = the language of the formulation form
	 * @param isStructure = true if the form is a structure, false if string
	 * @param form = the actual formulation form
	 * @return the new Formulation
	 * 
	 * @generated not
	 */
	Formulation createFormulation(String language, String text, FormulationForm form);

	/**
	 * Returns a new object of class '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary</em>'.
	 * @generated
	 */
	Dictionary createDictionary();

	/**
	 * Returns a new object of class '<em>String Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Word</em>'.
	 * @generated
	 */
	StringWord createStringWord();

	/**
	 * Returns a new object of class '<em>Number Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Word</em>'.
	 * @generated
	 */
	NumberWord createNumberWord();

	/**
	 * <!-- begin-user-doc -->
	 * creates a Number Word with a base WordForm
	 * <!-- end-user-doc -->
	 * @param wf = the WordForm that is the representation of the Number
	 * @return a new object of class '<em>Number</em>'.
	 * @generated not
	 */
	NumberWord createNumberWord(WordForm wf);

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Voc Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voc Name</em>'.
	 * @generated
	 */
	VocName createVocName();

	/**
	 * <!-- begin-user-doc -->
	 * creates a DateTime Word with a base WordForm
	 * <!-- end-user-doc -->
	 * @param wf = the WordForm that is the representation of the DateTime
	 * @return a new object of class '<em>DateTime</em>'.
	 * @generated not
	 */
	DateTime createDateTime(WordForm wf);

	/**
	 * <!-- begin-user-doc -->
	 * creates a StringWord with a base WordForm
	 * <!-- end-user-doc -->
	 * @param wf = the WordForm that is the representation of the StringWord
	 * @return a new object of class '<em>StringWord</em>'.
	 * @generated not
	 */
	StringWord createStringWord(WordForm wf);

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VocabularyPackage getVocabularyPackage();

} //VocabularyFactory
