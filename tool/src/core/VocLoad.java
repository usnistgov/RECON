/* VocLoad.java
 *   routines to parse the vocabulary file and generate the internal vocabulary
 *   
 *   Author: Ed Barkmeyer, NIST, May, 2010
 *   
 *   revised Jul 2011, v0.11, to support file management
 *   revised 27 Sep 2011, v0.15, to handle duplicate Word declarations
 *   revised 7 Oct 2011, v0.17, to support alternate verb forms for properties
 *   revised Oct/Nov 2011, v0.18, to support measurement unit declarations
 *   							  further fuddling with Reader and filename
 *   revised Apr 2012, v0.19, implement importFile, improve error handling
 */
package core;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

import utilities.NamedReader;
import utilities.StreamIn;

import NBVR.Vocabulary.*;

public class VocLoad {

	/* The EMF Factory for the Vocabulary objects */
	public static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	public static final VocabularyPackage theVocPackage = VocabularyPackage.eINSTANCE;
	
	/* The Terminology object that owns all the Vocabulary objects */
	private Terminology theVocabulary;
	
	/* the nominal term length allocation */
	public static final int TERM_LENGTH = 5;
	
	/* VocLoad mode of operation */
	protected static final int VOCABULARY_MODE = 0;	/* Vocabulary mode, expect entries */
	protected static final int AXIOM_MODE = 1;		/* Axiom mode, expect sentences */
	
	/* local elements */
	private int activeMode = VOCABULARY_MODE;
	protected PrintStream logfile;
	protected PrintWriter IKLfile;
	protected StreamIn vfile;	/* the vocabulary file, lexical interface */
	protected TokenIn scan;		/* the lexical scanner associated with vfile */
	private VocabularyItem activeItem;	/* current vocabulary item */
	
	/* the size of the source buffer */
	public static final int VOC_MAXLINE = 1024;
	
	private char[] sourceline;	/* the current line from the source file */
	private int sourcecount;	/* the number of characters in sourceline */
	
	/** constructor
	 *  This routine creates a new source file object (a VocLoad)
	 *  and processes all the lines in that file.
	 *  It may cause other VocLoad objects to be constructed
	 */
	public VocLoad(Reader source, String filename, PrintWriter iklfile, int mode) 
	{
		int ltype;	/* line/entry type */
		
		/* record the active Vocabulary */
		theVocabulary = RECONManager.theVocabulary;
		
		/* record the log file */
		logfile = RECONManager.errorlog;
		
		/* record the IKL output file */
		IKLfile = iklfile;
		
	    /* process the input source */
	    if (source == null) return;
		
		/* initialize lexical input */
		vfile = new StreamIn(source, filename, logfile);
		if (! vfile.isOpen()) return;
		
	    /* test for empty file
	     * Note: the StreamIn constructor reads the first character */
	    if (vfile.atEOF()) {
	    	vfile.close();
	    	logfile.println("*** File: " + filename + " is empty.");
	    	return;
	    }
	    
	    /* initialize the sourceline buffer */
	    sourceline = new char[VOC_MAXLINE];
	    scan = new TokenIn(vfile, sourceline, VOC_MAXLINE);

	    /* record the initial processing mode (copied from the caller) */
	    activeMode = mode;

	    /* now do the parsing thing */
	    while(! vfile.atEOF() ) {
	    	
	    	sourcecount = vfile.getLine(sourceline,  VOC_MAXLINE);
	    	scan.setLine(sourceline, sourcecount);

	    	if (activeMode == AXIOM_MODE) {
	    		/* in AXIOM_MODE, we look for directives ($ at beginning of line)
	    		 * and comments (/ at beginning of line)
	    		 * and process everything else as axioms/sentences
	    		 */

		    	/* the current token is end of line 
			     * get the first character of the new line */
	    		ltype = scan.thisC();
	    		
	    		if (ltype == '$') {		/* directive */
	    			scan.nextToken();
	    			executeDirective();
	    		} else if (ltype == '/') {
	    			scan.skipToEnd();	/* ignore comments */
	    		} else if (ltype == '\n') {
	    			scan.nextToken();	/* blank line, make a newline Token */
	    		} else {
	    			loadSentence();
	    		}
	    		
	    	} else {	/* activeMode == VOCABULARY_MODE */
	    		
	    		/* in VOCABULARY_MODE, the first token is an entry type */
	    		scan.nextToken();
	    		ltype = scan.getTokenSymbol();
		
			    /* process the line according to its type */
			    switch (ltype) {
			    
			    // word elements
			    case 'W': /* dictionary word form */
			    	DicLoad.loadDictionaryWord(scan);
			    	break;
	
			    // vocabulary items
			    case 'T': /* noun/type entry */
			    	loadVocNoun(false);
			    	break;
			    case 'M': /* mass noun entry */
			    	loadVocNoun(true);
			    	break;
			    case 'P': /* property entry */
			    	loadVocProperty();
			    	break;
			    case 'A': /* modifier/adjective entry */
			    	loadVocAdjective();
			    	break;
			    case 'V': /* fact type/verb entry */
			    	loadVocVerb();
			    	break;
			    case 'U': /* measurement unit entry */
			    	loadVocUnit();
			    	break;
			    case 'N': /* proper name entry */
			    	loadVocName();
			    	break;
			    	
			    case 'S': /* synonym for current entry */
			    	loadSynonym();
			    	break;
			    case 'F': /* alternate syntax form for current entry */
			    	loadAlternateForm();
			    	break;
			    case 'D': /* text definition for current entry */
			    	loadDefinition();
			    	break;
			    case 'R': /* RECON formal definition for current entry */
			    	loadFormulation();
			    	break;
	
			    // facts, axioms, etc.
			    case '.':
			    	loadSentence();
			    	break;
			    	
			    // directives
			    case '$':
			    	executeDirective();
			    	break;
			    	
			    case '/':	/* comment */
			    	scan.skipToEnd();
			    	break;
			    case '\n': /* blank line */
			    	break;
			    	
			    default:
			    	scan.printLine(logfile);
			    	logfile.println("*** Invalid vocabulary declaration type: '" + 
			    		(ltype > 0x20 ? (char)ltype : ltype) + "'. Skipped.");
			    	scan.nextToken();
			    }
	    	}
	    	
		    /* in either mode, check for end of line */
		    if (scan.getTokenSymbol() != '\n') {
	    		logfile.println("*** Characters at end of line '" 
    				+ scan.getTokenString() + " " + scan.getRest() + "' ignored.");
		    	scan.nextToken();	/* process the end of line */
		    }

	    }
	    
	    /* wrap up */
	    vfile.close();
	    	    
	}
	
	/** executeDirective
	 *  process directive lines, beginning with a $ 
	 */
	private void executeDirective()
	{
		int dirc = scan.getTokenChar(1);
		switch (dirc) {	
	    case 'I': /* import */
	    	importFile();
	    	break;
	    case 'V': /* set vocabulary mode */
	    	activeMode = VOCABULARY_MODE;
	    	break;
	    case 'A': /* set axiom mode */
	    	activeMode = AXIOM_MODE;
	    	break;
	    default: /* ??? */
	    	scan.printLine(logfile);
	    	logfile.println("*** Unrecognized processing directive: $" 
	    			+ (dirc > 0x20 ? (char)dirc : dirc));
		}
		
		scan.nextToken();	/* should be end of line */
	}
	
	/** importFile()
	 * process the $I(mport) directive
	 *  $I [ ( "+" | "-" ) gpv ] filename
	 *   +g turns logic generation on for the imported file
	 *   -g turns logic generation off for the imported file
	 *   +p turns print parse on for the imported file
	 *   -p turns print parse off for the imported file
	 *   +v turns print vocabulary on for the imported file
	 *   -v turns print vocabulary off for the imported file
	 *
	 *  then switch to file: filename for Vocabulary input
	 */
	private void importFile()
	{
		boolean genlogic = RECONManager.genlogic;	// save external setting
		boolean printparse = RECONManager.printparse;
		boolean loclogic = genlogic;				// default local setting is same
		boolean locparse = printparse;
		String vocname;
		int options;

		/* process the $I directive */
		do {
			/* get the filename or options token */
			vocname = scan.getToken();
	
			/* check for options */
			if (vocname.charAt(0) == '-')
				options = -1;
			else if (vocname.charAt(0) == '+')
				options = 1;
			else
				options = 0;
			
			if (options != 0) {
				/* this is an options string, process the options */
				for (int i = 1; i < vocname.length(); ++i) {
					if (vocname.charAt(i) == 'g') {
						loclogic = (options == 1);
					} else if (vocname.charAt(i) == 'p') {
						locparse = (options == 1);
					} else {
						logfile.println("*** Import: invalid options string '" 
								+ vocname + "'");
					}
				}
			}
		} while (options != 0);  // stop when we have a filename
					
		/* check for a file name */
		if (vocname == null || vocname.length() == 0) {
	    	logfile.println("*** Import directive has no filename");
	    	return;
		}
		
	    /* open the file */
		NamedReader vocfile = null;
		try {
	    	vocfile = new NamedReader(vocname);
	    } catch (IOException ex) {
	    	logfile.println("*** Import could not open " + vocname);
	    	vocfile = null;
	    }
	    
	    /* process the file */
	    if (vocfile != null) {
	    	logfile.println();
	    	logfile.println("-- Importing vocabulary " + vocname);
	    	RECONManager.setActiveOptions(locparse, loclogic);	
			new VocLoad(vocfile, vocname, IKLfile, activeMode);
	    	logfile.println("-- Completed import of " + vocname);
	    	logfile.println();
	    	RECONManager.setActiveOptions(printparse, genlogic);	
	    }
	}

	
	/** getNextWord
	 * gets the next word token from the input and 
	 * returns the corresponding Word object
	 * This routine is used by the terminology constructors.
	 * @return the Word of which the token text is a form, or null
	 */
	private Word getNextWord()
	{
		WordForm wf;
		TokenKind tk;
		
		/* don't go beyond the end of line */
		if (scan.getTokenSymbol() == '\n') return null;

		/* get the word (form) token */
		tk = scan.nextToken();
		if (tk == TokenKind.NAME || tk == TokenKind.NUMBER) {
			/* if it looks like a word, find/make one */
			wf = theVocFactory.makeWordForm(scan.token, scan.tokensize);
		} else {
			/* if it is a symbol, it is only OK if it has been declared a word */
			// TODO: fix declared terms that include symbols
			// wf = theVocFactory.findWordForm(scan.token, scan.tokensize);
			return null;
		}
		
		/* if the word text doesn't match a dictionary Word,
		 * make it a proper name (no other forms)
		 */
		if (wf.getWord() == null) {
			logfile.println("*** Word '" + wf.getText() + "' is not in the Dictionary.");
			wf.setWord(theVocFactory.createName(wf));
			RECONManager.theDictionary.addWord(wf.getWord());
		}
		return wf.getWord();
	}
	
	/** loadTerm
	 * collect a new Term object -- a sequence of words
	 * @param complain = error insert if missing term is an error, else null
	 * @return the created Term object for the words collected
	 */
	private Term loadTerm(String complain)
	{
		Word w;
		
		/* get the first word of the Term */
		w = getNextWord();
		if (w == null) {
			if (complain != null) {
				scan.printLine(logfile);
				logfile.println("*** Term begins badly, " + complain
						+ " entry skipped.");
			}
			return null;
		}
		
		/* create the Term */
		Term term = theVocFactory.createTerm();
		term.addWord(w);
		w.addUsage(term);	/* w begins the term */
		
		/* collect the external form of the term */
		term.setText(scan.getTokenString());

		/* get additional words of the term */
		StringBuffer b = null;
		for (w = getNextWord(); w != null; w = getNextWord()) {
			term.addWord(w);
			/* add the word to the text form of the term */
			if (b == null) b = new StringBuffer(term.getText());
			b.append(' ');
			b.append(scan.getTokenString());
		}
		if (b != null) term.setText(b.toString());
		
		return term;
		
	}

	/** loadVocNoun (isMass)
	 * add a VocNoun (object type, classifier) to the dictionary -- 
	 * a term that classifies things
	 * a VocNoun is a sequence of Words
	 * the declaration of a type noun is: T word*
	 * the declaration of a mass noun is: M word*
	 */
	private void loadVocNoun(boolean isMass)
	{
		Term term;
		
		/* create the Term entry for the classifier */
		term = loadTerm("noun");
		if (term == null) return;

		/* now create the VocabularyItem -- a VocNoun
		 * it is the active item for subsequent additions */
		activeItem = theVocFactory.createVocNoun();
		theVocabulary.addItem(activeItem);
		activeItem.addTerm(term);
		((VocNoun)activeItem).setMassNoun(isMass);
	}

	/** loadVocUnit
	 * add a VocUnit to the dictionary -- 
	 * a VocNoun that is a unit of measure
	 * a VocUnit term is a sequence of Words
	 * the declaration is: 
	 *   U word word* [ ":" domain ]
	 * 
	 */
	private void loadVocUnit()
	{
		Term term;
		
		/* create the Term entry for the classifier */
		term = loadTerm("unit");
		if (term == null) return;

		/* now create the VocabularyItem -- a VocUnit
		 * it is the active item for subsequent additions */
		activeItem = theVocFactory.createVocUnit();
		theVocabulary.addItem(activeItem);
		activeItem.addTerm(term);

		/* assume no dimension/quantity kind is supplied */
		((VocUnit)activeItem).setQuantityKind(null);
		
		/* look for dimension/quantity kind */
		if (scan.getTokenSymbol() != ':') return;
		
		/* collect the dimension/quantity kind name */
		List<Word> dimname = getTermRef();
		if (dimname == null) {
			scan.printLine(logfile);
			logfile.println("*** Expecting dimension for unit: " 
					+ ((VocUnit)activeItem).external());
			return;
		}
		
		/* get the quantity kind property that matches the name
		 * we will assume that the property is unique, 
		 * or perhaps we should check for context 'thing'? */
		((VocUnit)activeItem).setQuantityKind(findVocProperty(dimname, null));
		if (((VocUnit)activeItem).getQuantityKind() == null) {
			scan.printLine(logfile);
			logfile.print("*** No property entry for dimension: "); 
			printTerm(dimname);
			logfile.println();
		}		
	}

	/** loadVocName
	 * add a VocName (proper name) to the dictionary -- 
	 * a term that refers to a specific individual thing
	 * a VocName is a sequence of Words
	 * the declaration is: T word*
	 */
	private void loadVocName()
	{
		Term term;
		
		/* create the Term entry for the classifier */
		term = loadTerm("proper name");
		if (term == null) return;

		/* now create the VocabularyItem -- a VocNoun
		 * it is the active item for subsequent additions */
		activeItem = theVocFactory.createVocName();
		theVocabulary.addItem(activeItem);
		activeItem.addTerm(term);
	}
	
	/** loadVocAdjective
	 * add an adjective and verb template to the dictionary -- 
	 * a term that modifies noun concepts (VocNoun, VocProperty)
	 * the declaration is:  Q (domain) is word*
	 *  where word* is the term for the adjective
	 * TODO: avoid confusing 'is defined' with 'is defining'
	 */
	private void loadVocAdjective()
	{

		/* load the Verb form from the declaration */
		VocVerb verb = theVocFactory.createVocVerb();
		theVocabulary.addItem(verb);
		activeItem = verb;
		
		/* process the fact type form in the declaration */
		verb.setArity(loadFactForm(true));
		if (verb.getArity() != 1) {
			scan.printLine(logfile);
			logfile.println("*** Unexpected adjective verb form");
			return;
		}

		/* now create the VocAdjective item */
		VocAdjective adj = theVocFactory.createVocAdjective();
		theVocabulary.addItem(adj);
		/* attach the Verb item */
		adj.setVerb(verb);
		
		/* the real active item is the Adjective item */
		activeItem = adj;
		
		/* the verb Term is "is <adjective>" 
		 * extract the adjective term */
		Term term = theVocFactory.createTerm();
		Term vterm = verb.getTerms().get(0);
		int wordcount = vterm.getWords().size();
		/* the first word is 'is' */
		if (wordcount == 0 || vterm.getWords().get(0) != VocKey.isVerb) {
			scan.printLine(logfile);
			logfile.println("*** Adjective predicate does not begin with 'is'");
			return;
		}
		/* the remaining words are the adjective term */
		for (int w = 1; w < wordcount; ++w) term.addWord(vterm.getWords().get(w));
		
		/* extract the adjective text form from the verb text form
		 * the first three characters should be 'is ' 
		 */
		term.setText(vterm.getText().substring(3, vterm.getText().length()));
		
		/* make the term refer to the adjective */
		adj.addTerm(term);
		/* the first word of the term begins the adjective */
		term.getWords().get(0).addUsage(term);

	}
	
	/** loadVocProperty
	 * add a property (attribute type) to the dictionary -- 
	 * a term that refers to a thing by its relationship to some object
	 * the declaration is:  
	 *   P (<range>) is <article> <property> () <link> (<domain>)
	 */
	private void loadVocProperty()
	{
		/* load the Verb form from the declaration */
		VocVerb verb = theVocFactory.createVocVerb();
		theVocabulary.addItem(verb);
		activeItem = verb;
		
		/* process the fact type form in the declaration */
		verb.setArity(loadFactForm(true));
		if (verb.getArity() != 2) {
			scan.printLine(logfile);
			logfile.println("*** Unexpected property verb form");
			return;
		}
		
		/* now create the VocProperty item, as the real active_item */
		activeItem = makeProperty(verb.getForm().get(0), scan, logfile);
		theVocabulary.addItem(activeItem);
	}

	/** makeProperty(SyntaxForm, scan, logfile)
	 * This routine makes a VocProperty object from a verb syntax form
	 * It creates the property object, mangles the terms and 
	 * then calls makePropertyForm to make the syntactic forms
	 * 
	 * @param form = the SyntaxForm for the verb in the form: R is the <property> () <link> D
	 * @return the completed VocProperty object linked to its syntactic forms
	 */
	public static VocProperty makeProperty(SyntaxForm form, TokenIn scan, PrintStream logfile)
	{
		/* the property construct is based on the verb term associated with the form */
		Term vterm = ((ItemElement)form.getElements().get(1)).getTerm();
		
		/* check that the term structure is: is [ the ] property */
		int wordcount = vterm.getWords().size();
		if (wordcount < 2) {
			scan.printLine(logfile);
			logfile.println("*** Expecting property term");
			return null;
		}
		/* the first word of the verb term is 'is' */
		if (vterm.getWords().get(0) != VocKey.isVerb) {
			scan.printLine(logfile);
			logfile.println("*** Expecting 'is' in property predicate");
			return null;
		}
		
		/* next, find the link word(s)
		 * they should be the Particle from the syntax form
		 * and get the property domain role from the Particle Role
		 */
		Term link;
		VerbRole domain;
		
		List<FormElement> elts = form.getElements();
		if (elts.size() > 2 && elts.get(2).getKind() == FormElementKind.PARTICLE_ELEMENT) {
			/* make the Particle Term a link term for the Property */
			Particle part = (Particle)elts.get(2);
			link = theVocFactory.createTerm(part.getTerm());
			/* the domain role is represented by the Particle Role Element */
			domain = part.getRole().getRole();
		} else {
			/* otherwise, use the last word of the verb term */
			--wordcount;
			link = theVocFactory.createTerm();
			link.addWord(vterm.getWords().get(wordcount));
			/* proceed, but complain */
			scan.printLine(logfile);
			logfile.println("*** Property declaration '" + vterm.getText()
					+ "' has no link word(s), using '"
					+ link.getWords().get(0).external() + "'");
			/* the domain role is the Object Role */
			domain = ((RoleElement)elts.get(2)).getRole(); /* get the object role */
		}
	
		/* the verb Term is (now) "is <article> <property>" 
		 * extract the property term */
		Term pterm = theVocFactory.createTerm();
		
		/* the second word may be an article */
		/* if it is not an Article, it is part of the property term */
		Word word = vterm.getWords().get(1);
		if (! word.isArticle()) pterm.addWord(word);
		
		/* the remaining words, if any, are the (rest of the) property term */
		for (int w = 2; w < wordcount; ++w) pterm.addWord(vterm.getWords().get(w));

		/* be sure we copied a term */
		if (pterm.getWords().size() == 0) {
			scan.printLine(logfile);
			logfile.println("*** Expecting property term");
			return null;
		}
		//TODO: fix the property name by processing the form text
		pterm.setText(pterm.toString());
		/* the first word of the term begins the property term */
		pterm.getWords().get(0).addUsage(pterm);
		
		/* we have all the parts -- make the property, and associate the verb */
		VocProperty property = theVocFactory.createVocProperty();
		property.setVerb(form.getVerb());
		
		/* we extracted the domain role in finding the link
		 * get the property range from the subject of the form */
		VerbRole range = ((RoleElement)elts.get(0)).getRole();
		/* now mark the roles and set the domain and range (types) of the property */
		domain.setIsRange(false);
		property.setDomain(domain.getRange());
		range.setIsRange(true);
		property.setRange(range.getRange());
		
		/* make the term refer to the property */
		property.addTerm(pterm);
		
		/* set the property term context to the domain type */
		pterm.setContext(property.getDomain());

		/* set the link term context to the property */
		link.setContext(property);
		/* make the link term a first-class term? */
		// link.getWords().get(0).addUsage(link);
		
		/* now make all the property and verb forms */
		makePropertyForms(property, pterm, link);
		
		return property;
	}

	/** makePropertyForms
	 * create the Property form and the "has" form for the property
	 * @param property = the vocabulary Property object
	 * @param term = the/a term for the Property itself
	 * @param link = the link term for the Property, e.g., "of"
	 */
	private static void makePropertyForms(VocProperty property, Term term, Term link)
	{
		SyntaxForm form;
		ItemElement formverb;
		RoleElement formrole;
		Term vterm;
		
		VocVerb verb = property.getVerb();
		
		/* sort out the roles */
		VerbRole domain;
		VerbRole range = verb.getRoles().get(0);
		if (range.isRange()) {
			domain = verb.getRoles().get(1);
		} else {
			domain = range;
			range = verb.getRoles().get(1);
		}

		/* create the property form 
		 *   property link (domain)
		 * then add this one */
		form = theVocFactory.createSyntaxForm();
		property.getPropertyForm().add(form);
		
		/* add the property term as item to the form */
		formverb = theVocFactory.createItemElement();
		formverb.setKind(FormElementKind.ITEM_ELEMENT);
		formverb.setTerm(term);
		form.addElement(formverb);

		Particle particle = theVocFactory.createParticle();
		particle.setKind(FormElementKind.PARTICLE_ELEMENT);
		particle.setTerm(link);
		form.addElement(particle);
		
		/* create the domain Role element in the form */
		formrole = theVocFactory.createRoleElement();
		formrole.setKind(FormElementKind.PARTICLE_ROLE);
		formrole.setRole(domain);
		particle.setRole(formrole);
		
		/* now create the alternate fact type form: 
		 * (domain) has [ article ] <property> (range) */
		form = theVocFactory.createSyntaxForm();
		verb.getForm().add(form);
		
		/* create the domain Role element in the form */
		formrole = theVocFactory.createRoleElement();
		formrole.setKind(FormElementKind.SUBJECT_ROLE);
		formrole.setRole(domain);
		form.addElement(formrole);

		/* create the has property term */
		vterm = theVocFactory.createTerm();
		verb.addTerm(vterm);
		vterm.addWord(VocKey.hasVerb);	/* 'has' */
		VocKey.hasVerb.addUsage(vterm);
		vterm.addWord(VocKey.fillWord);	/* '...' optional 'as', optional article */
		List<Word> words = term.getWords();	/* copy the property term */
		for (int w = 0; w < words.size(); ++w) vterm.addWord(words.get(w));
		vterm.setText("has the " + term.getText());
		
		/* add the has property verb to the form */
		formverb = theVocFactory.createItemElement();
		formverb.setKind(FormElementKind.ITEM_ELEMENT);
		formverb.setTerm(vterm);
		form.getElements().add(formverb);
		
		/* create the range Role element in the form */
		formrole = theVocFactory.createRoleElement();
		formrole.setKind(FormElementKind.OBJECT_ROLE);
		formrole.setRole(range);
		form.addElement(formrole);
	
	}
	
	/** loadVocVerb
	 * add a relation (fact type) and verb template to the dictionary -- 
	 * a term that classifies states and actions as the interactions of things
	 * Input: R <fact type form>
	 */
	private void loadVocVerb()
	{
		VocVerb verb = theVocFactory.createVocVerb();
		theVocabulary.addItem(verb);
		activeItem = verb;
		
		/* process the syntax form for the verb */
		verb.setArity(loadFactForm(true));
	}

	/** loadAlternateForm
	 * processes an alternate syntactic form for the verb entry
	 */
	private void loadAlternateForm()
	{
		int arity;
		VocabularyItem item;

		/* check for a referent */
		if (activeItem == null) {
			logfile.println("*** No current vocabulary item for Alternate Form");
			return;
		}
		
		if (activeItem.getKind() == VocItemKind.VERB_CONCEPT) {
			arity = loadFactForm(false);
			if (arity != ((VocVerb)activeItem).getArity()) {
				scan.printLine(logfile);
				logfile.println("*** Different role count in primary and alternate forms.");
			}
		} else if (activeItem.getKind() == VocItemKind.PROPERTY_CONCEPT) {
			/* if the item is a property, the alternate form is for the verb */
			item = activeItem;
			activeItem = ((VocProperty)item).getVerb();
			/* now process the alternate syntax form */
			arity = loadFactForm(false);
			if (arity != ((VocVerb)activeItem).getArity()) {
				scan.printLine(logfile);
				logfile.println("*** Different role count in primary and alternate forms.");
			}
			activeItem = item;
		} else if (activeItem.getKind() == VocItemKind.ADJECTIVE_CONCEPT) {
			/* if the item is an adjective, the alternate form is for the verb */
			item = activeItem;
			activeItem = ((VocAdjective)item).getVerb();
			/* now process the alternate syntax form */
			arity = loadFactForm(false);
			if (arity != 1) {
				scan.printLine(logfile);
				logfile.println("*** Alternate form of adjective has more than 1 role.");
			}
			activeItem = item;
		} else {
			scan.printLine(logfile);
			logfile.println("*** Improper use of Alternate Form, use Synonym.");
			return;
		}
	}
	
	/** loadFactForm
	 * add an alternate verb template for the current Item to the dictionary
	 * Input: F (subject) word* [ (object) [ word* (particle) ]* ]
	 * Or G or P or Q all same syntax
	 * 
	 * @param initial = true if this is the initial F/P/Q declaration, else false
	 *  (initial determines whether the form processor should expect role declarations)
	 * @return count of roles in the form, 0 on syntax error
	 */
	private int loadFactForm(boolean initial)
	{
		ItemElement formverb;
		RoleElement formrole;
		Particle particle;
		VerbRole role;
		Term term;
		int rolecount;
		
		if (activeItem.getKind() != VocItemKind.VERB_CONCEPT) return 0;
		
		SyntaxForm form = theVocFactory.createSyntaxForm();
		((VocVerb)activeItem).getForm().add(form);

		/* process the subject role */
		scan.nextToken();	/* should be the left paren */
		if (initial) 
			role = loadRole("subject role");
		else 
			role = getRoleRef((VocVerb)activeItem, "subject role");
		if (role == null) return 0;
		
		/* create the RoleElement for the role */
		formrole = theVocFactory.createRoleElement();
		formrole.setKind(FormElementKind.SUBJECT_ROLE);
		form.addElement(formrole);
		formrole.setRole(role);
		
		/* count roles */
		rolecount = 1;
		
		/* collect the VocVerb term */
		term = loadTerm("verb");
		if (term == null) return 0;
		
		activeItem.addTerm(term);
		term.setConcept(activeItem);
		
		/* set the context for the verb -- the subject domain */
		term.setContext(role.getRange());
		
		/* check for 'is' verbs */
		form.setIsAuxForm(term.getWords().get(0) == VocKey.isVerb);
		
		/* create the item element for the Verb */
		formverb = theVocFactory.createItemElement();
		formverb.setKind(FormElementKind.ITEM_ELEMENT);
		form.addElement(formverb);
		formverb.setTerm(term);
		
		/* process the direct object role, if any */
		if (initial) 
			role = loadRole(null);
		else 
			role = getRoleRef((VocVerb)activeItem, null);
		if (role != null) {
			/* create the RoleElement for the role */
			formrole = theVocFactory.createRoleElement();
			formrole.setKind(FormElementKind.OBJECT_ROLE);
			form.addElement(formrole);
			formrole.setRole(role);
			++rolecount;
		}
		
		/* process particles, if any */
		for (term = loadTerm(null); term != null; term = loadTerm(null)) {
			particle = theVocFactory.createParticle();
			particle.setKind(FormElementKind.PARTICLE_ELEMENT);
			form.addElement(particle);
			particle.setTerm(term);
			term.setParticle(particle);
			
			/* if there is no object role, 
			 * add the text of the particle term to the text of the verb term
			 */
			if (rolecount == 1) {
				formverb.getTerm().setText(formverb.getTerm().getText() + ' ' + term.getText());
			}
			
			/* get the adverbial role, if any
			 * (a particle does not always introduce a role) */
			if (initial) 
				role = loadRole(null);
			else 
				role = getRoleRef((VocVerb)activeItem, null);
			/* if the particle is not followed by a role, it is the end */
			if (role == null) return rolecount;
			
			/* create the RoleElement for the role */
			formrole = theVocFactory.createRoleElement();
			formrole.setKind(FormElementKind.PARTICLE_ROLE);
			formrole.setRole(role);
			particle.setRole(formrole);
			++rolecount;
		}

		return rolecount;
	}
	
	/** loadRole
	 * collect a role specification from a fact type form
	 * beginning immediately after the left paren
	 * create and return the role object
	 * @param complain = error insert if missing role term is an error, else null
	 * @return the created Role object
	 */
	private VerbRole loadRole(String complain)
	{
		Term term;
				
		/* find the left paren */
		if (scan.getTokenSymbol() != '(') {
			if (complain != null) {
				scan.printLine(logfile);
				logfile.println("*** Expecting left paren for " + complain);
			}
			return null;
		}
		
		/* collect the type name */
		List<Word> typename = getTermRef();
		if (typename == null) {
			if (complain != null) {
				scan.printLine(logfile);
				logfile.println("*** Expecting role/type name for " + complain);
			}
			return null;
		}
		
		/* get the type = the range of the role */
		VocNoun range = findVocNoun(typename);
		if (range == null) {
			logfile.print("*** No term entry for role type: ");
			printTerm(typename);
			logfile.println(", using Thing.");
			/* set the range to 'thing' */
			range = VocBase.vocThing;
		}

		/* the term collector stopped on colon or right paren */
		int marker = scan.getTokenSymbol();
		if (marker == ':') {
			/* typename is a type name only, collect the role name */
			term = loadTerm(null);
			if (term == null) {
				logfile.print("*** Missing role name after '");
				printTerm(typename);
				logfile.println(":' in " + complain + ", using type name");
				term = theVocFactory.createTerm(typename);
			}
			/* now the marker is the one following the term */
			marker = scan.getTokenSymbol();
		} else {
			/* the role name is also the range term */
			term = theVocFactory.createTerm(typename);
		}
		term.setText(term.toString());

		/* the role term is defined in the context of the VocVerb */
		term.setContext(activeItem);
		
		/* create the Role object and assign the Term to it */
		VerbRole role = theVocFactory.createVerbRole();
		((VocVerb)activeItem).getRoles().add(role);
		role.setTerm(term);
		term.setRole(role);
		
		/* set the range of the role to the type */
		role.setRange(range);
		
		/* check for right paren role terminator */
		if (marker != ')') {
			scan.printLine(logfile);
			logfile.println("*** " + complain + " specification '" 
					+ term.getText() + "' ends badly.");
		}
		
		return role;
	}
	
	/** getRoleRef
	 * collect a role specification from a fact type form
	 * beginning immediately after the left paren
	 * create and return the role object
	 * @param complain = error insert if missing role term is an error, else null
	 * @return the created Role object
	 */
	private VerbRole getRoleRef(VocVerb verb, String complain)
	{
		VerbRole role;
		List<Word> rolename;
		
		/* find the left paren */
		if (scan.getTokenSymbol() != '(') {
			if (complain != null) {
				scan.printLine(logfile);
				logfile.println("*** Expecting left paren for " + complain);
			}
			return null;
		}
		
		/* collect the role name */
		rolename = getTermRef();
		if (rolename == null) {
			if (complain != null) {
				scan.printLine(logfile);
				logfile.println("*** Missing role name in " + complain);
			}
			return null;
		}

		/* find the matching role */
		role = findVerbRole(verb, rolename);
		if (role == null) {
			scan.printLine(logfile);
			logfile.print("*** Role name: ");
			printTerm(rolename);
			logfile.println(" does not match any Role in " + complain);
			return null;
		}

		/* check for right paren role terminator */
		if (scan.getTokenSymbol() != ')') {
			vfile.printBuffer();
			logfile.print("*** " + complain + " specification '");
			printTerm(rolename);
			logfile.println("' ends badly.");
		}
		return role;
		
	}
	
	/** loadSynonym
	 * add an alternate term for the current Item to the dictionary -- 
	 */
	private void loadSynonym()
	{
		Term term;
		Term vterm;
		VocVerb verb;

		/* check for a referent */
		if (activeItem == null) {
			logfile.println("*** No current vocabulary item for Synonym");
			return;
		}
		
		/* create the Term entry for the classifier */
		term = loadTerm("synonym");
		if (term == null) return;

		/* attach it to the current VocabularyItem  */
		activeItem.addTerm(term);
		
		/* now, if it is a verb, an adjective or a property,
		 * make the verb form
		 */
		if (activeItem.getKind() == VocItemKind.VERB_CONCEPT) {
			term.setContext(((VocVerb)activeItem).getRoles().get(0).getRange());
			copyFactForm((VocVerb)activeItem, term);
			
		} else if (activeItem.getKind() == VocItemKind.ADJECTIVE_CONCEPT) {
			/* create the matching verb synonym */
			verb = ((VocAdjective)activeItem).getVerb();
			
			vterm = theVocFactory.createTerm(term);
			vterm.getWords().add(0, VocKey.isVerb);
			vterm.setText("is " + term.getText());
			VocKey.isVerb.addUsage(vterm);
			verb.addTerm(vterm);
			
			/* set the context for the verb -- the subject domain */
			VerbRole subject = verb.getRoles().get(0);
			vterm.setContext(subject.getRange());
			
			/* now create the new fact type form
			 * copy the old one and substitute the new term */
			copyFactForm(verb, vterm);
			
		} else if (activeItem.getKind() == VocItemKind.PROPERTY_CONCEPT) { 
			/* generate the "is" form of the property verb */
			verb = ((VocProperty)activeItem).getVerb();

			/* create the "is" term */
			vterm = theVocFactory.createTerm(term);
			vterm.getWords().add(0, VocKey.isVerb);
			/* if the second word of the primary verb term is an article,
			 * insert it in the new term */
			Word word = verb.getTerms().get(0).getWords().get(1);
			if (word.isArticle()) {
				vterm.getWords().add(1, word);
				vterm.setText("is " + word.getBase().getText() + ' ' + term.getText());
			} else {
				vterm.setText("is " + term.getText());
			}
			
			/* now find the link word in the primary syntax form,
			 * and add it to the new verb */
			Term pterm = findParticleTerm(verb.getForm().get(0));
			vterm.setText(vterm.getText() + ' ' + pterm.getText());
			
			VocKey.isVerb.addUsage(vterm);
			verb.addTerm(vterm);
			
			/* set the context for the verb -- the subject domain */
			VerbRole subject = verb.getRoles().get(0);
			vterm.setContext(subject.getRange());

			/* now copy the fact type form, and make the derived forms */
			copyFactForm(verb, vterm);
			makePropertyForms((VocProperty)activeItem, term, pterm);
			
		} else {
			/* if it is a VocNoun or a VocName,
			 * there is nothing more to do
			 */
			return;
		}
				
	}

	/** findParticleTerm
	 * find the first/only Particle in a SyntaxForm and return the Term for it
	 * @param form = the Syntax Form in question
	 * @return the Term for the Particle or null if none found
	 */
	private Term findParticleTerm(SyntaxForm form)
	{
		FormElement elt;
		Iterator<FormElement> eltit = form.getElements().iterator();
		while (eltit.hasNext()) {
			elt = eltit.next();
			if (elt.getKind() == FormElementKind.PARTICLE_ELEMENT)
				return ((Particle)elt).getTerm();
		}
		return null;
	}
	
	/** loadDefinition
	 * add a text Definition for the current Item to the dictionary -- 
	 */
	private void loadDefinition()
	{

		/* check for a referent */
		if (activeItem == null) {
			logfile.println("*** No current vocabulary item for Definition");
			return;
		}
		
		/* create the Definition object -- a Formulation */
		Definition d = theVocFactory.createDefinition();
		/* use the rest of the line as the definition text */
		d.setText(scan.getRest());
		d.setLanguage("en");
		activeItem.getFormulations().add(d);
		
		/* get the end-of-line token */
		scan.nextToken();
	}
	
	/** loadFormulation
	 * add a formal definition for the current Item to the dictionary -- 
	 * Formulations for Verbs, Properties, and Adjectives are sentences
	 * involving the roles
	 */
	private void loadFormulation()
	{
		VocVerb verb;
		Formulation f;

		/* check for a referent */
		if (activeItem == null) {
			logfile.println("*** No current vocabulary item for Formulation");
			return;
		}

		/* create the Formulation object for the RECON formulation */

		switch (activeItem.getKind().getValue()) {
		case VocItemKind.NOUN_CONCEPT_VALUE:
			f = ParseManager.parseNounPhrase(scan, activeItem);
			if (f != null) {
				activeItem.getFormulations().add(f);
				if (RECONManager.genlogic) 
					activeItem.getFormulations().add(
						Interpreter.makeNounFormulation(f, IKLfile));
			}
			return;
		case VocItemKind.PROPER_NAME_VALUE:
			f = ParseManager.parseNounPhrase(scan, activeItem);
			if (f != null) {
				activeItem.getFormulations().add(f);
				if (RECONManager.genlogic) 
					activeItem.getFormulations().add(
						Interpreter.makeNameFormulation(f, IKLfile));
			}
			return;
		case VocItemKind.VERB_CONCEPT_VALUE:
			verb = (VocVerb)activeItem;
			break;
		case VocItemKind.PROPERTY_CONCEPT_VALUE:
			verb = ((VocProperty)activeItem).getVerb();
			break;
		case VocItemKind.ADJECTIVE_CONCEPT_VALUE:
			verb = ((VocAdjective)activeItem).getVerb();
			break;
		default:
			logfile.println("*** Invalid vocabulary item for Formulation");
			return;
		}

		/* create the formulations that are sentences based on verbs */
		f = ParseManager.parseSentence(scan, verb);
		if (f != null) {
			activeItem.getFormulations().add(f);
			if (RECONManager.genlogic)
				activeItem.getFormulations().add(
					Interpreter.makeVerbFormulation(verb, f, IKLfile));
		}
	}

	/**
	 * parse a fact, axiom or rule
	 * TODO: What do we do with the Formulation?
	 */
	private void loadSentence()
	{
    	activeItem = null;
    	Formulation f = ParseManager.parseSentence(scan, null);
    	/* if it failed, it will have complained */
    	if (f == null) return;
    	
		if (RECONManager.genlogic)
			Interpreter.makeProposition(f, IKLfile);
	}
	
	/** copyFactForm
	 * make a copy of the primary fact type form,
	 * substituting the a new term for the verb
	 * @param newverb = the new verb term
	 */
	private void copyFactForm(VocVerb verb, Term newverb)
	{
		SyntaxForm form = verb.getForm().get(0);
		FormElement eold, enew;
		RoleElement erole;
		Term term;

		/* make the new form for the verb */
		SyntaxForm newform = theVocFactory.createSyntaxForm();
		verb.getForm().add(newform);

		/* copy the isAuxVerb value */
		newform.setIsAuxForm(form.isAuxForm());
		
		/* now copy the form elements */
		
		Iterator<FormElement> oldf = form.getElements().iterator();
		while (oldf.hasNext()) {
			eold = oldf.next();
			/* make a new element of the appropriate kind */
			/* and copy the special details */
			switch (eold.getKind().getValue()) {
			case FormElementKind.ITEM_ELEMENT_VALUE:
				enew = theVocFactory.createItemElement();
				((ItemElement)enew).setTerm(newverb);
				break;
			case FormElementKind.SUBJECT_ROLE_VALUE:
			case FormElementKind.OBJECT_ROLE_VALUE:
				erole = theVocFactory.createRoleElement();
				erole.setRole(((RoleElement)eold).getRole());
				enew = erole;
				break;
			case FormElementKind.PARTICLE_ELEMENT_VALUE:
				enew = theVocFactory.createParticle();
				term = theVocFactory.createTerm(((Particle)eold).getTerm());
				term.setContext(verb);
				((Particle)enew).setTerm(term);
				erole = theVocFactory.createRoleElement();
				erole.setKind(FormElementKind.PARTICLE_ROLE);
				erole.setRole(((Particle)eold).getRole().getRole());
				((Particle)enew).setRole(erole);
				break;
			default:
				logfile.println("*** Unknown element kind=" + eold.getKind() 
						+ " found copying Fact Type Form.");
				return;
			}				
			enew.setKind(eold.getKind());
			newform.addElement(enew);
		}
	}


	/** getTermRef
	 * collect a sequence of words that should be a match for a Term
	 */
	private List<Word> getTermRef()
	{
		Word w;
		List<Word> term;
		
		/* get the first word of the Term */
		w = getNextWord();
		if (w == null) return null;
		
		/* create the list of words for the Term */
		term = new ArrayList<Word>(TERM_LENGTH);
		while (w != null) {
			term.add(w);
			w = getNextWord();
		}
		return term;
	}
	
	/** findVocItem
	 * given a term as a List of Words, the kind of item sought,
	 *  and possibly a context of use, 
	 *  find the VocabularyItem entry the term refers to
	 * @param term = the list of words making up the term
	 * @param kind = the VocabularyItemKind (kind of item) sought
	 * @param context = the VocabularyItem that is the context, or null
	 * @return the term referred to, or null
	 */
	public static VocabularyItem findVocItem(List<Word> term, 
			VocItemKind kind, VocabularyItem context)
	{
		Term vocterm;
		VocabularyItem item;
		Word key = term.get(0);

		/* look at the list of all Terms that start with the key word */
		Iterator<Term> termit = key.getBeginsTerm().iterator();
		while (termit.hasNext()) {
			vocterm = termit.next();
			item = vocterm.getConcept();
			/* check that vocterm refers to a VocabularyItem, not a Role or Particle */
			if (item != null) {
				/* if t refers to the right kind of thing, 
				 * and t has the specified Context, if a context is given,
				 * t is eligible */
				if (item.getKind() == kind) {
					if (context == null || vocterm.getContext() == context) {
						/* if the terms match, return the noun */
						if (compareTerms(vocterm, term)) return item;
					}
				}
			}
		}
		/* no match */
		return null;
	}
	
	/** findVocNoun
	 * given a term as a List of Words
	 *  find the Voc Noun entry the term refers to
	 * @param term = the list of words making up the term
	 * @return the VocNoun referred to, or null
	 */
	public static VocNoun findVocNoun(List<Word>term)
	{
		return (VocNoun)findVocItem(term, VocItemKind.NOUN_CONCEPT, null);
	}
	
	/** findVocProperty
	 * given a term as a List of Words
	 *  find the Voc Property entry the term refers to
	 * @param term = the list of words making up the term
	 * @return the VocProperty referred to, or null
	 */
	public static VocProperty findVocProperty(List<Word>term, VocNoun context)
	{
		return (VocProperty)findVocItem(term, VocItemKind.PROPERTY_CONCEPT, context);
	}

	/** findVerbRole
	 * given a role term as a List of Words, and the Verb that is the context
	 *  find the VerbRole the term refers to
	 * @param term = the list of words making up the term
	 * @param verb = the VocVerb that is the owner of the role
	 * @return the role the term refers to, or null
	 */
	public static VerbRole findVerbRole(VocVerb verb, List<Word> term)
	{
		List<VerbRole> roles = verb.getRoles();
		
		for (int r = roles.size(); --r >= 0; ) {
			VerbRole role = roles.get(r);
			if (compareTerms(role.getTerm(), term)) return role;
		}
		/* no match */
		return null;
	}
	
	/** compare Terms (term, words)
	 * compares a term for equality with a list of words
	 * @param term = the Term
	 * @param words = the list of Words
	 * @return true if they match, else false
	 */
	private static boolean compareTerms(Term t, List<Word> words)
	{
		/* they must be the same size to match */
		if (t.getWords().size() != words.size()) return false;
		
		for (int c = 0; c < words.size(); ++c) {
			/* the Word objects must be identical, as constructed
			 * any mismatch means the terms don't match */
			if (t.getWords().get(c) != words.get(c)) return false;
		}
		
		/* if both word lists have ended, they match */
		return true;
	}
	
	/** printTerm
	 * print the provided term to the log file
	 * @param term
	 */
	private void printTerm(List<Word> term)
	{
		for (int it = 0; it < term.size(); ++it) {
			logfile.print(term.get(it).external() + ' ');
		}
	}

}
