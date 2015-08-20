/* UmlClass.java
 *  represents a UML Class
 *  it has generalizations, attributes (properties), and operations
 *  its sister link is to the next class in the same package
 */

package uml;

import java.util.ArrayList;

public class UmlClass extends UmlElement implements UMLType {
	
	public ArrayList<UmlClass> generals;
	public UmlProperty firstAttr;
	public UmlOperation firstOpn;
	public UmlClass sister;
	public boolean isAbstract;
	public UmlAssoc asAssoc;	// association class alter ego as association
	
	public UmlClass(String name, String uri)
	{
		super(UmlElement.CLASS, name, uri);
		firstAttr = null;
		firstOpn = null;
		isAbstract = false;
		asAssoc = null;
	}

	/* accessors */
	
	/* get sister link (always a class) */
	public UMLType getSister() {
		return sister;
	}

	/* set sister link, must be a class */
	public void setSister(UMLType s) {
		sister = (UmlClass)s;
	}
	
	public void addGeneralization(UmlClass gen) {
		if (generals == null) generals = new ArrayList<UmlClass>(4);
		generals.add(gen);
	}
}
