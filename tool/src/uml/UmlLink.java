/* UmlLink.java
 *  represents a UML Link (instance of an Association)
 *  it instantiates an association and has Slots for each role,
 *  but only owns the Slots that correspond to ownedEnds of the Association
 *  its sister link is to the next Link in the same Package
 */

package uml;

import java.util.ArrayList;

public class UmlLink extends UmlElement {

	public UmlAssoc assn;
	public ArrayList<UmlSlot> roles;
	public UmlSlot firstSlot;
	public UmlLink sister;
	
	public UmlLink(String name, String uri, UmlAssoc assn)
	{
		super(UmlElement.LINK, name, uri);
		this.assn = assn;
		firstSlot = null;
		roles = new ArrayList<UmlSlot>(assn.roles.size());
		sister = null;
	}

}
