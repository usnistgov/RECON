/* UMLType.java 
 * the interface exhibited by UmlClass and UmlEnum and UmlPrimitiveType
 * which can be the type of Properties
 */

package uml;

public interface UMLType extends UMLElt {
	
	UMLType getSister();		/* returns the Sister link */
	
	void setSister(UMLType t);	/* sets the Sister link */

}
