/* UmlPackage.java
 *  represents a UML Package or Model
 *  it contains classes, associations, enumeration types, instances, and links
 *  it may contain subordinate packages
 *  its sister link is to the next package in the same parent package
 */

package uml;

public class UmlPackage extends UmlElement {

	public UmlClass firstClass;
	public UmlEnum firstEnum;
	public UmlPrimitive firstPType;
	public UmlAssoc firstAssoc;
	public UmlInstance firstInstance;
	public UmlLink firstLink;
	public UmlPackage firstPackage;
	
	public UmlPackage sister;
	
	public UmlPackage(String name, String uri)
	{
		super(UmlElement.PACKAGE, name, uri);
		firstClass = null;
		firstAssoc = null;
		firstInstance = null;
		firstLink = null;
		firstEnum = null;
		firstPType = null;
		firstPackage = null;
		sister = null;
	}

}
