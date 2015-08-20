/* UMLElt.java 
 * the interface exhibited by all UmlElements
 */

package uml;

public interface UMLElt {
	
	int getKind();	/* returns UmlElement.kind */
	
	String getName();	/* returns UmlElement.name */
	
	String getId();	/* returns UmlElement.id */
	
	String getURI();	/* returns UmlElement.uri */
	
	UmlRule getRules();	/* returns UmlElement.firstRule */	

}
