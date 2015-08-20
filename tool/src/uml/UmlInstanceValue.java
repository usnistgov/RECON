/* UmlInstanceValue.java
 *  represents the thing that plays the role represented by a Slot,
 *  an Instance, a Value of an Enum, or a value of a PrimitiveType
 *  
 *  its sister link is to the next InstanceValue in the same Slot, if any (a multi-valued slot)
 */

package uml;

public class UmlInstanceValue extends UmlElement {
	
	public UMLType type;
	public UmlInstance referent;
	public String value;
	public UmlInstanceValue sister;
	
	/** constructor
	 *  creates the InstanceValue object
	 * @param type = the type of the value: a Class, an Enum type, a PrimitiveType
	 * @param value = the actual value (string) if it is a PrimitiveType
	 * @param elt = the Instance or Value, if it is a defined type
	 */
	public UmlInstanceValue(UMLType type, String value, UmlInstance elt)
	{
		super(UmlElement.IVALUE, null, null);
		this.type = type;
		this.referent = elt;
		this.value = value;
		sister = null;
	}

}
