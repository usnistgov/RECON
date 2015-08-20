/* RECONManager.java
 *  routines to manage the Dictionary and the Vocabulary files
 *  
 * @author Ed Barkmeyer, NIST, October, 2010
 *   (formerly VocMain, after VocKey was extracted)
 * Revisions:
 *     2011 Jul (v0.11) to support the RECON app interface (as RECONManager)
 *     2011 Sep (v0.13) to print the sign-on line
 *     2011 Sep (v0.15) to correct error logging in vocabulary load
 *     2011 Nov (v0.18) removed all the vocabulary print stuff to a new class
 *                      moved makeFormulation to the VocabularyFactory
 *     2012 Apr (v0.19) change print forms
 *     2012 May (v0.20) modify VocLoad interface to support modes
 *     2013 May (v0.23) cleaned up errorlog management
 *     2013 Jun (v0.24) modified options management, add UML XMI generation
 *     2013 Sep (v0.25) split Dictionary/Vocabulary loading
 */
package core;

import sbvr.SBVRxml;
import utilities.NamedReader;

import NBVR.Vocabulary.Dictionary;
import NBVR.Vocabulary.Terminology;
import NBVR.Vocabulary.VocabularyFactory;

import java.io.*;

/** RECONManager
 *  the RECON Manager is the base of the loadable app
 *  It constructs the Dictionary
 *  and manages alternative sources for the Dictionary content:
 *   Words and Terms (and Formulations)
 *  It uses its companion VocKey to construct the Keyword Dictionary elements
 *  that control the parse
 *  
 *  The class has one instance. 
 */
public class RECONManager implements RECON {

	/* default dictionary filenames */
	public static final String RECON_DICTIONARY_FILE = "RECON.dic";
	public static final String RECON_DICTIONARY_LOG = "RECONdic.log";

	/* The EMF Factory for the Vocabulary objects */
	public static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;
	public static Dictionary theDictionary;
	public static Terminology theVocabulary;
	
	public static boolean printparse;/* switch to print the parse tree */
	public static boolean genlogic;	 /* switch to generate IKL */

	protected VocFileIn vfile;	/* the vocabulary file */
	protected VocLoad voc;	/* the vocabulary object */
	protected PrintWriter IKLfile;
	
	protected static PrintStream errorlog;	/* the log file to which error messages go */
	
	public RECONManager(String logfile)
	{
		/* set option defaults */
		printparse = false;
		genlogic = true;
		
		/* open the errors log file */
		if (logfile == null) {
			errorlog = System.err;
		} else {
			try {
				errorlog = new PrintStream(logfile);
		    } catch (IOException ex) {
		    	System.out.println("*** Could not open error log: " + logfile);
		    	errorlog = System.err;
		    }
		}
	    
	    /* print the signon line */
	    errorlog.println(RECONversion.name + 
	    		" v" + RECONversion.major + "." + RECONversion.minor +
	    		" (" + RECONversion.date + ")");
	    
	}
	
	/** setOptions(parse, logic)
	 * this entry point sets the processing and display options for RECON
	 * 
	 * @param printParse = true if the parse tree is to be displayed for each definition/axiom
	 * @param genLogic = true if the tool is to generate IKL for the modules loaded
	 */
	public void setOptions(boolean printParse, boolean genLogic)
	{
		setActiveOptions(printParse, genLogic);
	}

	/** setActiveOptions
	 *  This method controls the currently active options
	 * @param printParse = true if the parse tree is to be displayed for each definition/axiom
	 * @param genLogic = true if the tool is to generate IKL for the modules loaded
	 */
	protected static void setActiveOptions(boolean printParse, boolean genLogic)
	{
		printparse = printParse;
		genlogic = genLogic;
	}
	
	/** setDictionary(dicname)
	 * this entry point initializes the RECON plug-in
	 * 
	 * creates the Dictionary object and links it to the actual Dictionary source
	 * creates the Vocabulary object (the Terminology) and initializes it to contain
	 *   all the grammar Keywords and other Terms known to the RECON tool
	 * calls the Logic initializer 
	 */
	public void setDictionary(String dicname)
	{
		/* create the root Dictionary object for all Words used in Vocabulary objects 
		 * unlike the source streams, the Dictionary is always created partly
		 * from a set of canned keywords and partly from a file
		 */
		theDictionary = theVocFactory.createDictionary();
		VocKey.initDictionary(theDictionary);

	    /* if no Dictionary file is given, use the RECON default */
		boolean stddic = (dicname == null);
		if (stddic) dicname = RECON_DICTIONARY_FILE;
		
		/* open the dictionary file */
		NamedReader dicfile = null;
		try {
	    	dicfile = new NamedReader(dicname);
	    } catch (IOException ex) {
	    	errorlog.println("*** Dictionary Loader could not open word dictionary " + dicname);
	    	return;
	    }

		/* if this is the RECON default dictionary, save the active log file and
		 * set up an alternate log file to catch Dictionary complaints */
		PrintStream reallog = errorlog;
		if (stddic) {
			try {
		    	errorlog = new PrintStream(RECON_DICTIONARY_LOG);
		    } catch (IOException ex) {
		    	errorlog = reallog;
		    	errorlog.println("*** Dictionary Loader could not open log file " + RECON_DICTIONARY_LOG);
		    }
		}
		
		/* process the dictionary file contents */
		new VocLoad(dicfile, dicname, null, VocLoad.VOCABULARY_MODE);
		
		/* if we created a separate log file, close it */
		if (stddic) errorlog.close();
		errorlog = reallog;
		
		/* create the (sole) Terminology (Vocabulary) object */
		theVocabulary = theVocFactory.createTerminology();
		
		/* make all the Keyword entries for the grammar */
		VocBase.initVocabulary(theVocabulary);
		
		/* initialize the Logic equivalents */
		LogicManager.initLogic();
		
	}

	/** loadVocabulary
	 * This entry point reads a vocabulary file and adds its content to the 
	 * sole active Vocabulary (Terminology) object
	 * 
	 * @param source = a previously created Reader for the vocabulary source file
	 * @param IKLname = the filename for IKL output, or null
	 */
	public RECONstatus loadVocabulary(NamedReader source, String IKLname)
	{

		errorlog.println();
		errorlog.println("-- RECON processing Vocabulary " + source.getFilename());
		
		if (! createIKLFile(IKLname))
			return new RECONstatus(RECONstatus.FAILED, 0, 0);

		/* load and process the vocabulary */
		voc = new VocLoad(source, source.getFilename(), IKLfile, VocLoad.VOCABULARY_MODE);
		if (IKLfile != null) IKLfile.close();

		errorlog.println("-- RECON completed processing Vocabulary " + source.getFilename());
		
		return new RECONstatus(RECONstatus.ALLOK, 0, 0);
	}

	/** loadSBVR
	 * This entry point reads a vocabulary file and adds its content to the 
	 * sole active Vocabulary (Terminology) object
	 * 
	 * @param source = a previously created Reader for the vocabulary source file
	 * @param IKLname = the filename for IKL output, or null
	 */
	public RECONstatus loadSBVR(String SBVRname, String IKLname)
	{

		errorlog.println();
		errorlog.println("-- RECON processing SBVR Vocabulary " + SBVRname);
		
		if (! createIKLFile(IKLname))
			return new RECONstatus(RECONstatus.FAILED, 0, 0);

		/* load and process the vocabulary */
		SBVRxml.loadSBVR(theVocabulary, SBVRname, IKLfile, errorlog);
		if (IKLfile != null) IKLfile.close();

		errorlog.println("-- RECON completed processing Vocabulary " + SBVRname);
		
		return new RECONstatus(RECONstatus.ALLOK, 0, 0);
	}

	/** loadAxioms
	 * This entry point reads a file of axioms (and possibly additional vocabulary elements)
	 * and generates the IKL form of them in a file with the given file name
	 * 
	 * @param source = a previously created Reader for the axiom source file
	 * @param IKLname = the filename for IKL output, or null
	 */
	public RECONstatus loadAxioms(NamedReader source, String IKLname)
	{
		
		if (! createIKLFile(IKLname))
			return new RECONstatus(RECONstatus.FAILED, 0, 0);
		
		RECONstatus s = loadAxioms(source, IKLfile);
		if (IKLfile != null) IKLfile.close();
		return s;

	}
	

	/** loadAxioms
	 * This entry point reads a file of axioms (and possibly additional vocabulary elements)
	 * and generates the IKL form of them in a specified output stream
	 * It differs from its predecessor only in the way in which the IKL output file is provided
	 * It assumes that the caller opens and closes the IKL stream
	 * 
	 * @param source = a previously created Reader for the axiom source file
	 * @param IKLout = a previously created Writer for the IKL axiom output, or null
	 */
	public RECONstatus loadAxioms(NamedReader source, PrintWriter IKLout)
	{
		IKLfile = IKLout;

		errorlog.println();
		errorlog.println("-- RECON processing Axiom set " + source.getFilename());
		
		/* load and process the axiom set */
		voc = new VocLoad(source, source.getFilename(), IKLfile, VocLoad.AXIOM_MODE);

		errorlog.println("-- RECON completed processing Axiom set " + source.getFilename());
		
		return new RECONstatus(RECONstatus.ALLOK, 0, 0);
		
	}

	/** printVocabulary
	 *  pretty prints the vocabulary structure to the log file
	 */
	public void printVocabulary()
	{
		/* print the vocabulary to the log file */
		errorlog.println();
		VocPrint.printVocabulary(theVocabulary, errorlog);
	}

	/** makeUML
	 *  makes a UML version of the Vocabulary and exports it to an XMI file
	 * @param UMLfile = the name of the UML export file
	 */
	public void makeUML(String umlfile)
	{
		/* extract the model name from the UML filename */
		// TODO: don't include folder prefixes in the model name 
		String modelname;
		int suffix = umlfile.indexOf('.');
		if (suffix < 0) {
			modelname = umlfile;
			umlfile = umlfile + ".uml";
		} else {
			modelname = umlfile.substring(0, suffix);
		}

		/* make the UML model */
		Object theModel = UMLMaker.convertVocabulary(theVocabulary, modelname);
		
		/* now make the UML XMI file */
		UMLout.createUMLfile(umlfile, theModel);
	}

	/**
	 * routine to create a/the IKL file
	 * @param IKLname = the given file name
	 * @return true if it succeeds or no filename, false if it fails
	 */
	private boolean createIKLFile(String IKLname) 
	{
		FileWriter IKLf;
		
		if (IKLname != null) {
		    /* create the IKL file */
		    try {
		    	IKLf = new FileWriter(IKLname);
		    } catch (IOException ex) {
		    	errorlog.println("*** Could not open " + IKLname);
		    	IKLf = null;
		    	return false;
		    }
	    	IKLfile = new PrintWriter(IKLf);
		}
		return true;

	}
}
