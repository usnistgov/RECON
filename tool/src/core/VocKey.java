/* VocKey.java
 *   routines to manage the keywords and predefined terms for the parser
 *  
 * @author Ed Barkmeyer, NIST, October, 2010
 *   (extracted from the erstwhile VocMain, now RECONManager)
 *   
 * revisions
 *   22 Jul 2011 v0.12, revised to support RECONManager interface changes
 *    7 Sep 2011 v0.13, add comma and colon as Adjuncts
 *   16 Sep 2011 v0.14, revised ownership of Dictionary and Terminology
 *   27 Sep 2011 v0.15, put Keywords in the Dictionary properly
 *   Nov-Dec 2011 v0.18, add quantity terms, remove comma
 *   					rewrite vocabulary initializer to use VocLoad script
 *   17 May 2012 v0.20, replace command codes in initializer script, revise VocLoad call
 *   13 Mar 2013 v0.22, add hasTheme, eliminate unused vocabulary (for events, etc.)
 *   16 Sep 2013 v0.25, split the Vocabulary building off to VocBase 
 */
package core;

import NBVR.Vocabulary.*;

/** VocKey
 *  VocKey constructs the Dictionary elements for grammar keywords
 *  and predefined terms.
 *  
 *  The class has no instances.  It is merely a collector for static methods.
 */
public class VocKey {

	/* the Vocabulary factory class */
	private static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	
	/* The Terminology object that owns all the Vocabulary objects */
	private static Dictionary theDictionary;

	/* grammar keyword entries that are referenced as specific words
	 * (as well as by KeywordKind) */
	public static Keyword ofWord;	/* the word 'of' */
	public static Keyword asWord;	/* the word 'as' */
	public static Keyword theWord;	/* the word 'the' */
	public static Keyword thatWord;	/* the word 'that' */
	public static Keyword theyWord;	/* the utility pronoun 'they' */
	
	public static Keyword everyWord; /* the word 'every' */
	public static Keyword anyWord;	/* the word 'any' */
	public static Keyword someWord;	/* the word 'some' */
	public static Keyword noWord;	/* the word 'no' */

	public static Adjunct byWord;		/* the word 'by' */
	public static Adjunct perWord;		/* the word 'per' */
	public static Adjunct colonWord;	/* the symbol colon */
	public static Adjunct fillWord;		/* the symbol ellipsis, used internally */
	public static NumberWord number1Word;	/* the number "1" */

	/* grammar words that are ordinary nouns and verbs */
	public static Noun thingNoun;
	public static Noun quantityNoun;
	public static Noun collectionNoun;
	public static Verb countNoun;	// used as a noun, but the verb has more forms
	public static Verb numberNoun;	// used as a noun, but the verb has more forms
	
	public static Verb isVerb;
	public static Verb doVerb;
	public static Verb hasVerb;
	public static Verb equalsVerb;
	
	/* grammar "words" that are special symbols */
	public static String operator[] = { "+", "-", "*", "/", "^", "<", ">", "=" };
	public static final int OPERATORS = operator.length;
	public static Adjunct operatorWord[] = new Adjunct[OPERATORS];

	
	/** initDictionary()
	 *   this is the public entry point
	 *  loads the grammar keywords into the Dictionary as Keywords
	 *  (see KeywordKind)
	 *  remember as named variables the entries for keywords 
	 *  that the parse or rewrite generates
	 *  should not be called until after the Word and WordForm
	 *    lists are initialized
	 *  @return the Dictionary object
	 */
	static public void initDictionary(Dictionary dic)
	{
		/* record the dictionary */
		theDictionary = dic;

		/*  create entries for the keywords used in the grammar
		 *  each entry is the keyword text string and the enumeration value
		 */
		createKeyword("a",		KeywordKind.KAN);
		createKeyword("an",		KeywordKind.KAN);
		theWord = createKeyword("the", KeywordKind.KTHE);
		createKeyword("all",	KeywordKind.KALL);
		createKeyword("each",	KeywordKind.KALL);
		everyWord = createKeyword("every",	KeywordKind.KALL);
		noWord = 	createKeyword("no",		KeywordKind.KNO);
		anyWord = 	createKeyword("any",	KeywordKind.KANY);
		someWord = 	createKeyword("some",	KeywordKind.KAN);
		createKeyword("none",	KeywordKind.KNONE);
		createKeyword("one",	KeywordKind.KONE);
		createKeyword("least",	KeywordKind.KLEAST);
		createKeyword("most",	KeywordKind.KMOST);	
		createKeyword("less",	KeywordKind.KLESS);
		createKeyword("fewer",	KeywordKind.KLESS);
		createKeyword("more",	KeywordKind.KMORE);
		createKeyword("greater", KeywordKind.KMORE);
		createKeyword("at",		KeywordKind.KAT);
		createKeyword("than",	KeywordKind.KTHAN);
		createKeyword("exactly",KeywordKind.KEXACTLY);
		createKeyword("not",	KeywordKind.KNOT);
		createKeyword("never",	KeywordKind.KNOT);
		createKeyword("and",	KeywordKind.KAND);
		createKeyword("or",		KeywordKind.KOR);
		createKeyword("nor",	KeywordKind.KNOR);
		createKeyword("both",	KeywordKind.KBOTH);
		createKeyword("either", KeywordKind.KEITHER);
		createKeyword("neither",KeywordKind.KNEITHER);
		createKeyword("together", KeywordKind.KTOGETHER);
		createKeyword("if",		KeywordKind.KIF);
		createKeyword("whenever", KeywordKind.KIF);
		createKeyword("then",	KeywordKind.KTHEN);
		createKeyword("else",	KeywordKind.KELSE);
		createKeyword("otherwise", KeywordKind.KELSE);
		createKeyword("only",	KeywordKind.KONLY);
		createKeyword("unless", KeywordKind.KUNLESS);
		createKeyword("until",	KeywordKind.KUNLESS);
		thatWord = createKeyword("that",	KeywordKind.KTHAT);
		createKeyword("which",	KeywordKind.ANAPHOR);
		createKeyword("who",	KeywordKind.ANAPHOR);
		createKeyword("whom",	KeywordKind.ANAPHOR);
		createKeyword("when",	KeywordKind.KWHEN);
		createKeyword("where",	KeywordKind.KWHERE);
		createKeyword("whose",	KeywordKind.KWHOSE);
		createKeyword("whether",KeywordKind.KWHETHER);
		createKeyword("why",	KeywordKind.KWHY);
		createKeyword("how",	KeywordKind.KHOW);
		createKeyword("many",	KeywordKind.KMANY);
		createKeyword("much",	KeywordKind.KMANY);
		createKeyword("what",	KeywordKind.KWHAT);
		createKeyword("this",	KeywordKind.KTHIS);
		createKeyword("there",	KeywordKind.KTHERE);
		createKeyword("for",	KeywordKind.KFOR);
		ofWord = createKeyword("of", KeywordKind.KOF);
		asWord = createKeyword("as", KeywordKind.KAS);
		createKeyword("must",	KeywordKind.KMUST);
		createKeyword("may",	KeywordKind.KMAY);
		createKeyword("shall",	KeywordKind.KMUST);
		createKeyword("always", KeywordKind.KALWAYS);
		createKeyword("it",		KeywordKind.PRONOUN);
		createKeyword("he",		KeywordKind.PRONOUN);
		createKeyword("she",	KeywordKind.PRONOUN);
		createKeyword("him",	KeywordKind.PRONOUN);
		createKeyword("her",	KeywordKind.PRONOUN);
		theyWord = createKeyword("they",	KeywordKind.PRONOUN);
		createKeyword("them",	KeywordKind.PRONOUN);
		createKeyword("his",	KeywordKind.GENITIVE);
		createKeyword("its",	KeywordKind.GENITIVE);
		createKeyword("their",	KeywordKind.GENITIVE);
		createKeyword("itself",		KeywordKind.KSELF);
		createKeyword("himself",	KeywordKind.KSELF);
		createKeyword("herself",	KeywordKind.KSELF);
		createKeyword("themselves",	KeywordKind.KSELF);
		createKeyword("same",	KeywordKind.KSAME);
		createKeyword("other",	KeywordKind.KOTHER);
		createKeyword("another",	KeywordKind.KANOTHER);
		createKeyword("different",	KeywordKind.KDIFFERENT);
		createKeyword("everyone",	KeywordKind.KEVERYTHING);
		createKeyword("everybody",	KeywordKind.KEVERYTHING);
		createKeyword("everything",	KeywordKind.KEVERYTHING);
		createKeyword("noone",		KeywordKind.KNOTHING);
		createKeyword("nobody",		KeywordKind.KNOTHING);
		createKeyword("nothing",	KeywordKind.KNOTHING);
		createKeyword("someone",	KeywordKind.KSOMETHING);
		createKeyword("somebody",	KeywordKind.KSOMETHING);
		createKeyword("something",	KeywordKind.KSOMETHING);
		createKeyword("anyone",		KeywordKind.KANYTHING);
		createKeyword("anybody",	KeywordKind.KANYTHING);
		createKeyword("anything",	KeywordKind.KANYTHING);

		/* other words used in the grammar */
		theVocFactory.createAdjunct(theVocFactory.makeWordForm("in"));
		theVocFactory.createAdjunct(theVocFactory.makeWordForm("from"));
		theVocFactory.createAdjunct(theVocFactory.makeWordForm("to"));
		perWord = theVocFactory.createAdjunct(theVocFactory.makeWordForm("per"));
		byWord = theVocFactory.createAdjunct(theVocFactory.makeWordForm("by"));
		
		/* the verbs used in the grammar */
		/* 'be' is the only word in English whose present plural is not the infinitive,
		 * and whose past plural is not the past singular
		 */
		isVerb = theVocFactory.createIsVerb("be", "is", "are", "was", "were", "being", "been");
		doVerb = theVocFactory.createVerb("do", "does", "did", "doing", "done");
		hasVerb = theVocFactory.createVerb("have", "has", "had", "having", "had");
		equalsVerb = theVocFactory.createVerb("equal", "equals", "equalled", "equalling", "equalled");

		/* the known nouns */
		thingNoun = theVocFactory.createNoun("thing", "things");
		quantityNoun = theVocFactory.createNoun("quantity", "quantities");
		collectionNoun = theVocFactory.createNoun("collection", "collections");
		countNoun = theVocFactory.createVerb("count", "counts", "count", "counting", "counted");
		numberNoun = theVocFactory.createVerb("number", "numbers", "number", "numbering", "numbered");
		
		/* the punctuation marks we use */
		colonWord = theVocFactory.createAdjunct(theVocFactory.makeWordForm(":"));
		for (int op = 0; op < OPERATORS; ++op) {
			operatorWord[op] = theVocFactory.createAdjunct(theVocFactory.makeWordForm(operator[op]));
		}
		
		/* the magic fill word, used in terms to denote optional words */
		fillWord = theVocFactory.createAdjunct(theVocFactory.makeWordForm("..."));
		
		/* the number 1 to go with the keyword "one" */
		number1Word = theVocFactory.createNumberWord(theVocFactory.makeWordForm("1"));
		number1Word.setValue(1);

	}

	/** createKeyword(string, KeywordKind)
	 *  creates a Keyword whose base is the given string
	 *  and whose KeywordKind is the given KeywordKind
	 *  More than one Keyword can have the same KeywordKind
	 *  and thus be alternative spellings of the keyword
	 *  but different words when they are used in user-defined terms
	 *   
	 * @param s = the string that is the keyword itself
	 * @param kind = the KeywordKind that the keyword represents
	 * @return
	 */
	static private Keyword createKeyword(String s, KeywordKind kind)
	{
		WordForm wf = theVocFactory.makeWordForm(s);
		Keyword key = theVocFactory.createKeyword(wf, kind);
		theDictionary.addWord(key);
		return key;
	}

	/** getOperator(symbol)
	 *  returns the operator "Word" object that is the symbol, or null
	 *  
	 * @param symbol = the symbol for the operator in question
	 * @return the operator "Word" object that is the symbol, or null
	 */
	static public Adjunct getOperator(int symbol)
	{
		for (int op = 0; op < OPERATORS; ++op) {
			if (operator[op].charAt(0) == symbol) return operatorWord[op];
		}
		return null;
	}
}
