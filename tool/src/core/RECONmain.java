/* RECONmain.java
 *  The main program for a "console version" of the RECON app
 *  The real main control point for RECON is RECONManager
 *  RECON Manager supports the RECON interface.
 *  RECONmain just processes the command line and uses the interface.
 *  
 *  @author Ed Barkmeyer, NIST, October, 2010 (as part of VocMain)
 *  22 July 2011, extracted from VocMain, which became RECONManager.
 *  
 *  Revisions:
 *   18 May 2012 v0.20, revised to handle default naming of IKL file
 * 
 */
package core;

import utilities.ArgList;
import utilities.NamedReader;
import java.io.*;

public class RECONmain {

	public static final String prototype =
		"recon -gpw -d<words> -v<terms> -l<log> -s<sbvr> -u<uml> axioms [ iklfile ]";
	
	private static final PrintStream SysErr = System.err;

	private static boolean printvoc;	/* switch to print the vocabulary */
	private static boolean printparse;	/* switch to print the parse tree */
	private static boolean genlogic;	/* switch to generate IKL */
	
	private static String dicuri;	/* the dictionary URI */
	private static String vocname;	/* the vocabulary file name */
	private static String axname;	/* the axiom file name */
	private static String iklname;	/* the IKL file name */
	private static String logname;	/* the Error log file name */
	private static String umlname;	/* the XMI input filename */
	private static String sbvrname;	/* the SBVR input filename */
	
	private static NamedReader source;	/* the current source file */
	
	/** main program
	 * 
	 * call is:
	 *   recon -gpw -d<words> -v<terms> -l<log> -s<sbvr> -u<uml> axioms [ iklfile ]
	 * where
	 *   words	is the filename of the word dictionary (otherwise RECON.dic)
	 *   terms	is the filename of the vocabulary/ontology
	 *   axioms	is the filename of a ruleset
	 *   uml	is the filename for vocabulary XMI export
	 *   log	is the filename for the run/error log (otherwise system.err)
	 *   
	 *   -g means don't generate the IKL output
	 *   -p means print the axiom parses to the log file
	 *   -w means print the dictionary file after processing
	 *   
	 * 
	 * @param args = the command line arguments
	 */
	public static void main(String[] args)
	{
		int f;

		/* set defaults */
		printvoc = false;
		printparse = false;
		genlogic = true;
		
		logname = null;
		umlname = null;
				
		ArgList call = new ArgList(args, "d*gl*ps*v*wu*");
		for (f = 1; f != 0; ) {
			f = call.getOption();
			switch(f) {
			case 'd':	/* set dictionary */
				dicuri = call.getValue();
				break;
			case'g':	/* turn logic generation off */
				genlogic = false;
				break;
			case 'l':	/* set log file */
		    	logname = call.getValue();
		    	if (logname.indexOf('.') < 0) logname = createOutputName(logname, "log");
		    	break;
			case 'p':	/* print definition and axiom parse */
				printparse = true;
				break;
			case 's':	/* import SBVR vocabulary */
				sbvrname = call.getValue();
				break;
			case 'u':	/* export UML */
		    	umlname = call.getValue();
		    	break;
			case 'v':	/* import RECON vocabulary */
				vocname = call.getValue();
				break;
			case 'w':	/* export vocabulary */
				printvoc = true;
				break;
			case 0:	/* end of list */
				break;
			default:
		    	SysErr.println("*** Warning: invalid option '" + 
		    			call.getLetter() + "' -- ignored.");
			}
		}
		
		/* get the ruleset argument, which may include the vocabulary */
		axname = call.getArgument();
		if (axname == null && vocname == null && sbvrname == null) {
			SysErr.println("*** no source files");
			SysErr.println("Usage: " + prototype);
			return;
		}

		/* get the IKL file argument */
		if (genlogic) {
			iklname = call.getArgument();
			if (iklname == null) {
				if (axname != null) 
					iklname = createOutputName(axname, "ikl");
				else if (vocname != null)
					iklname = createOutputName(vocname, "ikl");
				else
					iklname = createOutputName(sbvrname, "ikl");
			}
		} else {
			iklname = null;
		}

		/* create the app */
		RECON app = new RECONManager(logname);
		app.setDictionary(dicuri);
		app.setOptions(printparse, genlogic);

		/* if there is a vocabulary file, load it 
		 * Note: the app expects a stream input, that only might be a file */
		if (vocname != null) {
		    try {
		    	source = new NamedReader(vocname);
		    } catch (IOException ex) {
		    	RECONManager.errorlog.println("*** Could not open " + vocname);
		    	source = null;
		    }
		    if (source != null)
		    	app.loadVocabulary(source, iklname);
		}
		
		/* if there is an SBVR vocabulary file, load it */
		if (sbvrname != null)
			app.loadSBVR(sbvrname, iklname);

		/* now process the axiom file 
		 * Note: the app expects a stream input, that only might be a file */
		if (axname != null) {
		    try {
		    	source = new NamedReader(axname);
		    } catch (IOException ex) {
		    	RECONManager.errorlog.println("*** Could not open " + axname);
		    	source = null;
		    }
		    if (source != null)
		    	app.loadAxioms(source, iklname);
		}

		/* if the vocabulary print is requested, print the vocabulary */
		if (printvoc) {
			app.printVocabulary();
		}

		/* if UML conversion is requested, convert the vocabulary to UML */
		if (umlname != null) {
			app.makeUML(umlname);
		}
	}

	/** createOutputName
	 *  create an output filename from an input file name, by replacing the extension
	 * @param ifile = the input filename string
	 * @param suffix = the new extension
	 * @return the output filename string
	 */
	private static String createOutputName(String ifile, String extension)
	{
		int suffix = ifile.indexOf('.');
		if (suffix < 0) suffix = ifile.length();
		return ifile.substring(0, suffix) + "." + extension;
	}

}
