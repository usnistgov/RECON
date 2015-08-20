/* UmlSlot.java
 *  represents a UML Slot (Attribute of an Instance)
 *  it instantiates a property and has a value, and possibly a parent link
 *  its sister link is to the next slot owned by the same Instance
 */

package uml;

public class UmlSlot extends UmlElement {
	
	public UmlProperty property;
	public UmlInstanceValue firstValue;
	public UmlLink link;
	public UmlSlot sister;
	
	public UmlSlot(UmlProperty property, UmlInstanceValue value)
	{
		super(UmlElement.SLOT, property.name, null);
		this.property = property;
		firstValue = value;
		link = null;
		sister = null;
	}

}
