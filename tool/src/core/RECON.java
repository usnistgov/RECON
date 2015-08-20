/* RECON.java
 *  advertised interface to the RECON app
 */
package core;

import utilities.NamedReader;
import java.io.*;

public interface RECON {
	
	/** setDictionary(uri)
	 * this entry point initializes the RECON plug-in
	 */
	void setDictionary(String uri);
	
	/** loadVocabulary
	 * This entry point reads a vocabulary file and adds its content to the 
	 * sole active Vocabulary (Terminology) object
	 */
	RECONstatus loadVocabulary(NamedReader source, String IKLfile);
	
	/** loadSBVR
	 * This entry point reads an SBVR vocabulary file and adds its content to the 
	 * sole active Vocabulary (Terminology) object
	 */
	RECONstatus loadSBVR(String SBVRfile, String IKLfile);
	
	/** loadAxioms
	 * This entry point reads a file of axioms (and possibly additional vocabulary elements)
	 * and generates the IKL form of them in a file with the given file name
	 */
	RECONstatus loadAxioms(NamedReader source, String IKLfile);

	/** loadAxioms
	 * This entry point reads a file of axioms (and possibly additional vocabulary elements)
	 * and generates the IKL form of them in a specified stream
	 */
	RECONstatus loadAxioms(NamedReader source, PrintWriter IKLout);
	
	/** setOptions(parse, logic)
	 * this entry point sets the processing and display options for RECON
	 */ 
	void setOptions(boolean printParse, boolean genLogic);
	
	/** printVocabulary
	 *  pretty prints the vocabulary structure to the log file
	 */
	void printVocabulary();
	
	/** makeUML
	 *  makes a UML version of the Vocabulary and exports it to an XMI file
	 * @param UMLfile = the name of the UML export file
	 */
	void makeUML(String UMLfile);

}
