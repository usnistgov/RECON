/* UmlPrimitive.java
 *  represents a UML PrimitiveType
 *  it has no internal properties
 *  its sister link is to the next primitive type in the same package
 *  the important ones all have URIs
 */
package uml;

public class UmlPrimitive extends UmlElement implements UMLType {
	
	public UmlPrimitive sister;

	public UmlPrimitive(String name, String uri)
	{
		super(UmlElement.PTYPE, name, uri);
		sister = null;
	}

	public UMLType getSister() {
		return sister;
	}

	public void setSister(UMLType t) {
		sister = (UmlPrimitive)t;
	}

}
