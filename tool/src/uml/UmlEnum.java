/* UmlEnum.java
 *  represents a UML Enumeration datatype
 *  it has values
 *  its sister link is to the next datatype in the same package
 */

package uml;

public class UmlEnum extends UmlElement implements UMLType {
	
	public UmlValue firstValue;
	public UmlEnum sister;
	
	public UmlEnum(String name, String uri)
	{
		super(UmlElement.ENUM, name, uri);
		firstValue = null;
		sister = null;
	}

	/* accessors */
	
	/* get sister link (always a class) */
	public UMLType getSister() {
		return sister;
	}

	/* set sister link, must be a class */
	public void setSister(UMLType s) {
		sister = (UmlEnum)s;
	}

}
