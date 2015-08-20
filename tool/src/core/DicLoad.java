/* DicLoad.java
 *  routines to process Dictionary Word entries in a RECON script
 *  
 *  extracted from VocLoad and greatly enhanced to deal with the
 *  revised Dictionary structure, September, 2013
 */
package core;

import NBVR.Vocabulary.*;

/**
 * This class has no constructor.  It is a package of static methods
 * that create Dictionary Word and WordForm entries.
 * Properly, it should be absorbed into the Dictionary class itself.
 * 
 * @author Ed Barkmeyer, September, 2013
 *
 */
public class DicLoad {
	
	public static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	
	private static TokenIn vfile;
	
	/** loadDictWord
	 *  load dictionary word forms
	 *  declaration form is:
	 *    WN noun singular [noun plural]
	 *    WA adjective [comparative superlative]
	 *    WV verb infinitive present singular past progressive perfective
	 *    W adjunct 
	 * 
	 *  loadDictionaryWord is called from VocLoad when the entry-type token
	 *  begins with a W.  The second character of the token is the Word type.
	 */
	public static void loadDictionaryWord(TokenIn source)
	{
		vfile = source;
		
		/* current file position is 2nd character of line */
		switch (vfile.getTokenChar(1)) {
	    case 'N': /* noun */
	    	loadNoun();
	    	return;
	    case 'V': /* verb */
	    	loadVerb();
	    	return;
	    case 'A': /* adjective */
	    	loadAdjective();
	    	return;
	    default: /* adjunct word */
	    	loadAdjunct();
		}
	}

	/** loadNoun
	 *   routine to load a Noun Word into the base Vocabulary
	 */
	private static void loadNoun()
	{
		WordForm form;

		/* get the base/singular form */
		form = loadWord("singular noun", null);
		if (form == null) return;

		/* check for redeclaration of the base form */
		if (form.getWord() != null) {
			if (form.getWord().getBase() == form) {
				/* the collision is base to base */
				if (form.getWord().isVerb() || form.getWord().isNoun()) {
					/* don't replace an existing noun or verb */
					RECONManager.errorlog.println("**+ Skipping noun declaration.");
					vfile.skipToEnd();
					return;
				}
				/* we do want to override an 'adjunct' or adjective */
				RECONManager.errorlog.println("**+ New Noun overrides previous entry.");
			} else {
				/* the collision is base to secondary form,
				 * make the existing Word the alternate for the WordForm
				 * and override the primary
				 */
				RECONManager.errorlog.println("**+ Making new noun the primary word.");
				form.setAltWord(form.getWord());
			}
		}
		
		/* create the new Word and associate the form as base */
		Noun noun = theVocFactory.createNoun(form);
		RECONManager.theDictionary.addWord(noun);
	
		/* get the plural form */
		WordForm altPlural = null;
		form = loadWord(null, noun);	/* allow missing */
		if (form == null) {
			/* if the plural form is missing, create it */
			form = pluralize(noun.getBase());
		} else {
			/* look for a third form: the alternate plural */
			altPlural = loadWord(null, noun);
		}

		/* in all cases form is the plural form */
		noun.setPlural(form);
		/* link the word form back to the noun, deal with collisions */
		resolveCollisions(noun, form);
		
		/* if there was an alternate plural, do the same for it */
		if (altPlural != null) {
			/* move the cursor to the end-of-line token */
			vfile.nextToken();
			noun.setAltPlural(altPlural);
			resolveCollisions(noun, altPlural);
		} else {
			noun.setAltPlural(null);
		}
		
	}

	/** pluralize
	 *   stupid routine to pluralize a noun by adding 's'
	 * @param w = the WordForm for the singular noun
	 * @return the WordForm for the plural
	 */
	private static WordForm pluralize(WordForm w)
	{
		String t = w.getText();
		int size = t.length();
		char[] letters = new char[size + 1];
		t.getChars(0, size, letters, 0);
		letters[size] = 's';
		return theVocFactory.makeWordForm(letters, size + 1);
	}
	
	/** loadVerb
	 *  add a verb to the Dictionary, including its forms:
	 *  infinitive (base), present singular, past, progressive, perfective
	 */
	private static void loadVerb()
	{
		WordForm form;
		Verb verb;
		Noun dupNoun = null;
		
		/* get the base/infinitive form */
		form = loadWord("infinitive", null);
		if (form == null) return;

		/* check for redeclaration of the infinitive form */
		if (form.getWord() != null) {
			if (form.getWord().getBase() == form) {
				/* the collision is base to base */
				if (form.getWord().isVerb() || form.getWord().isKeyword()) {
					/* don't replace an existing verb or keyword */
					RECONManager.errorlog.println("**+ Skipping verb declaration.");
					vfile.skipToEnd();
					return;
				} else if (form.getWord().isNoun()) {
					/* the Verb overrides the noun as primary form */
					dupNoun = (Noun)form.getWord();
					form.setAltWord(dupNoun);
					RECONManager.errorlog.println("**+ Making new verb the primary word.");
				} else {
					/* any other word will just be replaced by the Verb */
					RECONManager.errorlog.println("**+ Verb overrides previous declaration.");
				}
			} else {
				/* the collision is base to secondary form,
				 * make the existing Word the alternate for the WordForm
				 * and override the primary noun/verb entry
				 */
				form.setAltWord(form.getWord());
				RECONManager.errorlog.println("**+ Making new verb the primary word.");
			}
		}

		/* create the new Word and associate the form with it */
		verb = theVocFactory.createVerb(form);
		
		/* the present plural is always the same as the infinitive */
		verb.setPlural(form);
		
		/* get the present singular form */
		form = loadWord("singular verb", verb);
		if (form == null) return;
		verb.setSingular(form);
		if (dupNoun != null && form.getWord() == dupNoun) {
			/* if we are replacing both forms of a Noun, lose it */
			form.setWord(verb);
			form.setAltWord(dupNoun);
			RECONManager.errorlog.println("**+ Making new verb the primary word.");
		} else {
			/* in any other case, use the secondary form rules */
			resolveCollisions(verb, form);
		}
		
		/* get the past form */
		form = loadWord("past verb", verb);
		if (form == null) return;
		verb.setPast(form);
		resolveCollisions(verb, form);
		
		/* get the progressive form */
		form = loadWord("progressive verb", verb);
		if (form == null) return;
		verb.setProgressive(form);
		resolveCollisions(verb, form);
		
		/* get the perfective form */
		form = loadWord("perfective verb", verb);
		if (form == null) return;
		verb.setPerfective(form);
		resolveCollisions(verb, form);
		
		/* check for an alternative perfective form
		 * really a different verb, but all the other forms are the same
		 */
		form = loadWord(null, verb);
		if (form != null) {
			verb.setAltPast(form);
			resolveCollisions(verb, form);
			/* now get the end-of-line */
			vfile.nextToken();
		} else {
			verb.setAltPast(null);
		}
		
		/* add the Verb to the Dictionary only if we have all the forms */
		RECONManager.theDictionary.addWord(verb);
	}
	
	/** loadAdjective
	 * add an adjective word to the dictionary
	 */
	private static void loadAdjective()
	{
		WordForm form;

		/* get the base (only) form */
		form = loadWord("adjective", null);
		if (form == null) return;

		/* don't replace an existing entry */
		if (form.getWord() == null) {
			/* create the adjective and add it to the Dictionary */
			RECONManager.theDictionary.addWord(theVocFactory.createAdjective(form));
		}
		
		/* now get the end-of-line */
		vfile.nextToken();
	}
	
	
	/** loadAdjunct
	 * add an "adjunct" word to the dictionary
	 * some word that is not a noun, verb or adjective
	 * and not a grammar keyword.
	 */
	private static void loadAdjunct()
	{
		WordForm form;

		/* get the base (only) form */
		form = loadWord("adjunct word", null);
		if (form == null) return;

		/* don't replace an existing entry */
		if (form.getWord() == null) {
			/* create the word and add it to the Dictionary */
			RECONManager.theDictionary.addWord(theVocFactory.createAdjunct(form));
		}
		
		/* now get the end-of-line */
		vfile.nextToken();
	}
	
	/** loadWord
	 *   general routine for getting the next word from the line
	 *   and making a WordForm from it
	 *   This routine is used by the "dictionary" (parts of speech)
	 *   constructors.
	 *   
	 *   @param missing = null if missing is OK, else text of error
	 *   @param base = the Word for which this is an additional form, if any
	 *   @return the WordForm, if created, or null if not
	 */
	static private WordForm loadWord(String missing, Word base)
	{
		/* get the word token */
		TokenKind tk = vfile.nextToken();
		if (tk != TokenKind.NAME) {
			if (missing != null) {
				vfile.printLine(RECONManager.errorlog);
				RECONManager.errorlog.println("*** Missing " + missing + " form ");
			}
			return null;
		}
		
		/* make a Dictionary entry for the word form */
		WordForm wf = theVocFactory.makeWordForm(vfile.token, vfile.tokensize);

		/* if the new entry conflicts with a previous entry (for a different word), always complain */
		if (wf.getWord() != null && wf.getWord() != base) {
			RECONManager.errorlog.println("*** Word '" + wf.getText()
					+ "' was previously declared.");
			/* never override a keyword */
			if (wf.getWord().isKeyword()) wf = null;
			/* leave any other resolution to the caller */
		}
		return wf;
	}
	
	/**
	 * Check for collision between a secondary form of an entry
	 * and existing Words in the Dictionary.  
	 * Set the Word or AltWord of the form accordingly.
	 * @param entry = the Word entry being constructed (a noun or a verb)
	 * @param form = the proposed secondary form of the entry
	 */
	static private void resolveCollisions(Word entry, WordForm form)
	{
		/* get the existing Word that has the form, if any */
		Word word = form.getWord();
		
		if (word == null) {
			/* the secondary form is new */
			form.setWord(entry);
		} else if (word == entry) {
			/* the secondary form is already a form of the entry,
			 * do nothing */
		} else if (word.getBase() == form) {
			/* the secondary form collides with a base form */
			if (word.isNoun() || word.isVerb() || word.isKeyword()) {
				/* the base is more important, 
				 * the entry is the alternate use of the form */
				form.setAltWord(entry);
				RECONManager.errorlog.println("**+ Making new entry the alternate.");
			} else {
				/* the base is a 1-form word, the entry absorbs it */
				RECONManager.errorlog.println("**+ New entry overrides previous entry.");
				form.setWord(entry);
			}
		} else {
			/* the form collides with another secondary form
			 * it got there first, the entry is the alternate word */
			form.setAltWord(entry);
			RECONManager.errorlog.println("**+ Making new entry the alternate.");
		}
	}

}
