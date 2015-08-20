/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.*;

import java.util.List;

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
public class VocabularyFactoryImpl extends EFactoryImpl implements VocabularyFactory {
		
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VocabularyFactory init() {
		try {
			VocabularyFactory theVocabularyFactory = (VocabularyFactory)EPackage.Registry.INSTANCE.getEFactory("http:///NBVR/Vocabulary.ecore"); 
			if (theVocabularyFactory != null) {
				return theVocabularyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VocabularyFactoryImpl();
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
	public VocabularyFactoryImpl() {
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
			case VocabularyPackage.ADJECTIVE: return createAdjective();
			case VocabularyPackage.WORD_FORM: return createWordForm();
			case VocabularyPackage.TERM: return createTerm();
			case VocabularyPackage.FORMULATION: return createFormulation();
			case VocabularyPackage.VERB_ROLE: return createVerbRole();
			case VocabularyPackage.VOC_NOUN: return createVocNoun();
			case VocabularyPackage.VOC_VERB: return createVocVerb();
			case VocabularyPackage.SYNTAX_FORM: return createSyntaxForm();
			case VocabularyPackage.VOC_PROPERTY: return createVocProperty();
			case VocabularyPackage.NUMBER_WORD: return createNumberWord();
			case VocabularyPackage.VOC_UNIT: return createVocUnit();
			case VocabularyPackage.VOC_NAME: return createVocName();
			case VocabularyPackage.VOC_ADJECTIVE: return createVocAdjective();
			case VocabularyPackage.PARTICLE: return createParticle();
			case VocabularyPackage.ROLE_ELEMENT: return createRoleElement();
			case VocabularyPackage.KEYWORD: return createKeyword();
			case VocabularyPackage.ITEM_ELEMENT: return createItemElement();
			case VocabularyPackage.ADJUNCT: return createAdjunct();
			case VocabularyPackage.NOUN: return createNoun();
			case VocabularyPackage.NAME: return createName();
			case VocabularyPackage.VERB: return createVerb();
			case VocabularyPackage.DICTIONARY: return createDictionary();
			case VocabularyPackage.STRING_WORD: return createStringWord();
			case VocabularyPackage.DEFINITION: return createDefinition();
			case VocabularyPackage.DATE_TIME: return createDateTime();
			case VocabularyPackage.TERMINOLOGY: return createTerminology();
			case VocabularyPackage.IS_VERB: return createIsVerb();
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
			case VocabularyPackage.FORM_ELEMENT_KIND:
				return createFormElementKindFromString(eDataType, initialValue);
			case VocabularyPackage.KEYWORD_KIND:
				return createKeywordKindFromString(eDataType, initialValue);
			case VocabularyPackage.VOC_ITEM_KIND:
				return createVocItemKindFromString(eDataType, initialValue);
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
			case VocabularyPackage.FORM_ELEMENT_KIND:
				return convertFormElementKindToString(eDataType, instanceValue);
			case VocabularyPackage.KEYWORD_KIND:
				return convertKeywordKindToString(eDataType, instanceValue);
			case VocabularyPackage.VOC_ITEM_KIND:
				return convertVocItemKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjective createAdjective() {
		AdjectiveImpl adjective = new AdjectiveImpl();
		return adjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Adjective createAdjective(WordForm w) {
		AdjectiveImpl adjective = new AdjectiveImpl();
		adjective.setBase(w);
		return adjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * create a term that is a copy of an existing term
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Term createTerm(Term term) 
	{
		Term newterm = createTerm(term.getWords());
		newterm.setText(term.getText());
		return newterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * create a term from a list of words
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Term createTerm(List<Word> words) 
	{
		TermImpl newterm = new TermImpl();
		for (int w = 0; w < words.size(); ++w) newterm.addWord(words.get(w));
		/* make the term a usage of the first word */
		words.get(0).addUsage(newterm);
		
		return newterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbRole createVerbRole() {
		VerbRoleImpl verbRole = new VerbRoleImpl();
		return verbRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocNoun createVocNoun() {
		VocNounImpl vocNoun = new VocNounImpl();
		return vocNoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocProperty createVocProperty() {
		VocPropertyImpl vocProperty = new VocPropertyImpl();
		return vocProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxForm createSyntaxForm() {
		SyntaxFormImpl syntaxForm = new SyntaxFormImpl();
		return syntaxForm;
	}
	
	/**
	 * Returns a new object of class '<em>Syntax Form</em>'.
	 * The new item is owned by the VerbItem provided
	 * @param item = the VocabularyItem that owns the Syntax Form
	 * @return a new object of class '<em>Syntax Form</em>'.
	 * @generated not
	 */
	public SyntaxForm createSyntaxForm(VocVerb item) 
	{
		SyntaxForm syntaxForm = createSyntaxForm();
		item.getForm().add(syntaxForm);
		syntaxForm.setVerb(item);
		return syntaxForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm createWordForm() {
		WordFormImpl wordForm = new WordFormImpl();
		return wordForm;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public WordForm findWordForm(char[] intext, int size) {
		return WordFormImpl.find(intext, size);
	}

	/** makeWordForm
	 *   find or make a word form for the given text (char array)
	 *   returns the one found, or creates one if not found
	 * @generated not
	 */
	public WordForm makeWordForm(char[] intext, int size)
	{
		/* return null, i.e., fail, if the input string has size 0 */
		if (size == 0) return null;
		
		/* otherwise try to find a matching entry */
		WordForm wf = WordFormImpl.find(intext, size);
		/* if no match, create one */
		if (wf == null) wf = new WordFormImpl(intext, size);
		return wf;
	}
	
	/**
	 *   find or make a word form for the given text string
	 *   returns the one found, or creates one if not found
	 * @generated not
	 */
	public WordForm makeWordForm(String intext) 
	{
		/* fail on null input */
		if (intext == null || intext.length() == 0) return null;
			
		/* otherwise try to find a matching entry */
		WordForm wf = WordFormImpl.find(intext);
		/* if no match, create one */
		if (wf == null) wf = new WordFormImpl(intext);
		return wf;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjunct createAdjunct() {
		AdjunctImpl adjunct = new AdjunctImpl();
		return adjunct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Adjunct createAdjunct(WordForm w) {
		AdjunctImpl adjunct = new AdjunctImpl();
		adjunct.setBase(w);
		return adjunct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology createTerminology() {
		TerminologyImpl terminology = new TerminologyImpl();
		return terminology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsVerb createIsVerb() {
		IsVerbImpl isVerb = new IsVerbImpl();
		return isVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocUnit createVocUnit() {
		VocUnitImpl vocUnit = new VocUnitImpl();
		return vocUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Keyword createKeyword(WordForm w, KeywordKind kk) {
		KeywordImpl keyword = new KeywordImpl();
		keyword.setBase(w);
		keyword.setKind(kk);
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noun createNoun() {
		NounImpl noun = new NounImpl();
		return noun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Noun createNoun(WordForm w) {
		NounImpl noun = new NounImpl();
		noun.setBase(w);
		return noun;
	}

	/**
	 * create the Noun word entry for a special noun
	 * @param sing = the singular (base) form
	 * @param plural = the plural form
	 * @return the Noun object
	 * @generated not
	 */
	public Noun createNoun(String sing, String plural)
	{
		Noun n = createNoun(makeWordForm(sing));
		n.setPlural(makeWordForm(plural));
		n.getPlural().setWord(n);
		return n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Name createName(WordForm wf) {
		NameImpl name = new NameImpl();
		name.setBase(wf);
		return name;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Particle createParticle() {
		ParticleImpl particle = new ParticleImpl();
		return particle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleElement createRoleElement() {
		RoleElementImpl roleElement = new RoleElementImpl();
		return roleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemElement createItemElement() {
		ItemElementImpl itemElement = new ItemElementImpl();
		return itemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verb createVerb() {
		VerbImpl verb = new VerbImpl();
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Verb createVerb(WordForm w) {
		VerbImpl verb = new VerbImpl();
		verb.setBase(w);
		return verb;
	}

	/**
	 * create the Verb word entry for a special verb
	 * @param inf = the infinitive (base) form
	 * @param sing = the 3rd person singular form
	 * @param plural = the 3rd person plural form
	 * @param present = the present/progressive participle
	 * @param past = the past/perfective participle
	 * @return the Verb object
	 * 
	 * @generated not
	 */
	public Verb createVerb(String inf, 
			String singular, String past, String prog, String perf)
	{
		/* the infinitive form is the base form
		 * the constructor automatically sets the back link on the base form
		 */
		Verb v = createVerb(makeWordForm(inf));
		/* plural is the infinitive form */
		v.setPlural(v.getBase());
		/* make the rest */
		makeVerbForms(v, singular, past, prog, perf);
		return v;
	}

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
	public IsVerb createIsVerb(String inf, String singular, String plural,
			String past, String pastPlural, String prog, String perf)
	{
		IsVerb v = createIsVerb();
		v.setBase(makeWordForm(inf));
		/* unlike other verbs, the IsVerb has a distinct present plural and past plural form */
		v.setPlural(makeWordForm(plural));
		v.getPlural().setWord(v);
		v.setAltPast(makeWordForm(pastPlural));
		v.getAltPast().setWord(v);
		makeVerbForms(v, singular, past, prog, perf);
		return v;
	}

	/**
	 * make all the verb forms except the infinitive and present plural
	 * @param v	= the Verb
	 * @param singular = the singular form string
	 * @param past	= the past form string
	 * @param prog	= the progressive participle
	 * @param perf	= the perfective participle
	 * 
	 * @generated not
	 */
	private void makeVerbForms(Verb v, String singular, String past, String prog, String perf)
	{

		/* unlike the base constructor, 
		 * the secondary forms don't automatically set the back link */
		v.setSingular(makeWordForm(singular));
		v.getSingular().setWord(v);
		v.setPast(makeWordForm(past));
		v.getPast().setWord(v);
		v.setProgressive(makeWordForm(prog));
		v.getProgressive().setWord(v);
		v.setPerfective(makeWordForm(perf));
		v.getPerfective().setWord(v);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocAdjective createVocAdjective() {
		VocAdjectiveImpl vocAdjective = new VocAdjectiveImpl();
		return vocAdjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocVerb createVocVerb() {
		VocVerbImpl vocVerb = new VocVerbImpl();
		return vocVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringWord createStringWord() {
		StringWordImpl stringWord = new StringWordImpl();
		return stringWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberWord createNumberWord() {
		NumberWordImpl numberWord = new NumberWordImpl();
		return numberWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * creates a Number Word with a base WordForm
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public NumberWord createNumberWord(WordForm wf) {
		NumberWordImpl number = new NumberWordImpl();
		number.setBase(wf);
		wf.setWord(number);
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * creates a DateTime Word with a base WordForm
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public NBVR.Vocabulary.DateTime createDateTime(WordForm wf) {
		DateTimeImpl number = new DateTimeImpl();
		number.setBase(wf);
		wf.setWord(number);
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocName createVocName() {
		VocNameImpl vocName = new VocNameImpl();
		return vocName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * creates a TextString Word with a base WordForm
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public StringWord createStringWord(WordForm wf) {
		StringWordImpl text = new StringWordImpl();
		text.setBase(wf);
		wf.setWord(text);
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulation createFormulation() {
		FormulationImpl formulation = new FormulationImpl();
		return formulation;
	}

	/** createFormulation(language, text, form)
	 *  creates a new Formulation object with the passed properties
	 * @param language = the language of the formulation form
	 * @param isStructure = true if the form is a structure, false if string
	 * @param form = the actual formulation form
	 * @return the new Formulation
	 * 
	 * @generated not
	 */
	public Formulation createFormulation(
			String language, String text, FormulationForm form)
	{
		Formulation f = createFormulation();
		f.setLanguage(language);
		f.setText(text);
		f.setForm(form);
		return f;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocItemKind createVocItemKindFromString(EDataType eDataType, String initialValue) {
		VocItemKind result = VocItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVocItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormElementKind createFormElementKindFromString(EDataType eDataType, String initialValue) {
		FormElementKind result = FormElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordKind createKeywordKindFromString(EDataType eDataType, String initialValue) {
		KeywordKind result = KeywordKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeywordKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyPackage getVocabularyPackage() {
		return (VocabularyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VocabularyPackage getPackage() {
		return VocabularyPackage.eINSTANCE;
	}

} //VocabularyFactoryImpl
