/* UmlValue.java
 *  represents a value of an enumeration type (UmlEnum)
 *  its only property is its name, 
 *  its sister link is to the next value of the same Enum type
 */

package uml;

public class UmlValue extends UmlElement {
	
	public UmlValue sister;
	
	public UmlValue(String name)
	{
		super(UmlElement.VALUE, name, null);
		sister = null;
	}


}
