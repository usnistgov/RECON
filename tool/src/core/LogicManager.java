/* LogicManager.java
 *  routines to manage the IKL logic files and presets
 *  
 * @author Ed Barkmeyer, NIST, June 2011
 */

package core;

import java.io.*;

/** LogicManager
 *  LogicManager initializes the IKL output files
 *  and predefines certain predicates.
 *  
 *  The class has no instances.  It is merely a collector for static methods.
 */
public class LogicManager {
	
	public static String IKLfilename;	// the name of the IKL file
	public static PrintWriter IKLfile;	// the object we "print" to
	protected static OutputStream IKLstream;	// the object that we actually write to

	/** createIKLfile(filename)
	 *  creates a new IKL output file and returns the PrintWriter object
	 *  that the toIKL routines should write/print to
	 *  
	 * @param filename = the full name of the output file to be created
	 * @return the PrintWriter attached to the file
	 */
	public static PrintWriter createIKLfile(String filename)
	{
	    /* open the file */
	    IKLfilename = filename;
	    try {
	    	IKLstream = new FileOutputStream(filename);
	    } catch (IOException ex) {
	    	RECONManager.errorlog.println("*** Could not open " + filename);
	    	IKLstream = null;
	    	return null;
	    }
	    
	    IKLfile = new PrintWriter(IKLstream, false);
	    return IKLfile;
		
	}

	/** initLogic()
	 *  Initialize the built-in logic elements
	 */
	public static void initLogic()
	{
		/* make special predicates for quantity relations */
		Interpreter.setup();
	}

}
