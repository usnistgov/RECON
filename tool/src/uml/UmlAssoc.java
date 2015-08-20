/* UmlAssoc.java
 *  represents a UML Association
 *  it has generalizations, roles/ends (UmlProperty), and possibly "ownedEnds"
 *  its sister link is to the next association in the same package
 */
package uml;

import java.util.ArrayList;

public class UmlAssoc extends UmlElement {
	
	public ArrayList<UmlProperty> roles;
	public ArrayList<UmlAssoc> generals;
	public UmlProperty firstEnd;
	public boolean isDerived;
	public boolean isAbstract;
	public UmlAssoc sister;
	
	protected static final int MAX_ROLES = 4;	// default role array size
	
	public UmlAssoc(String name, String uri, int arity)
	{
		super(UmlElement.ASSOC, name, uri);
		if (arity == 0) arity = MAX_ROLES;
		roles = new ArrayList<UmlProperty>(arity);
		generals = null;	// generalizations are rare
		firstEnd = null;
		isDerived = false;
		isAbstract = false;
		sister = null;
	}
	
	public void addRole(UmlProperty role) {
		roles.add(role);
	}
	
	public void addGeneralization(UmlAssoc gen) {
		if (generals == null) generals = new ArrayList<UmlAssoc>(4);
		generals.add(gen);
	}

}
