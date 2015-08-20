/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see NBVR.Grammar.GrammarPackage#getQualifier()
 * @model abstract="true"
 * @generated
 */
public interface Qualifier extends ParseElement {

	/**
	 * returns true if the Qualifier is a SimpleQualifier, else false
	 * @generated
	 */
	boolean isSimple();
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	void print(int offset, java.io.PrintStream log);

} // Qualifier
