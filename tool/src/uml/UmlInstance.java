/* UmlInstance.java
 *  represents a UML Instance, a named object
 *  it has a type, and attribute slots with values
 *  its sister link is to the next instance in the same package
 */

package uml;

public class UmlInstance extends UmlElement {
	
	public UmlClass type;
	public UmlSlot firstSlot;
	public UmlInstance sister;
	
	public UmlInstance(String name, UmlClass type, String uri)
	{
		super(UmlElement.INSTANCE, name, uri);
		this.type = type;
		this.firstSlot = null;
	}

}
