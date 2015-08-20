/* UmlProperty.java
 *  represents a UML Property (Attribute or AssociationEnd)
 *  it has a type, and a multiplicity, and a parent association
 *  its sister link is to the next property owned by the same Class or Association
 */

package uml;

import java.util.ArrayList;

public class UmlProperty extends UmlElement {

	public UmlAssoc assn;
	public UMLType type;
	public int upperBound;
	public int lowerBound;
	public UmlProperty sister;
	public boolean isAbstract;
	public boolean isDerived;
	public boolean isComposite;
	public boolean isAggregate;
	public boolean isOrdered;
	public boolean isNavigable;
	public ArrayList<UmlProperty> redefines;
	public ArrayList<UmlProperty> subsets;
	
	public UmlProperty(String name, UMLType type)
	{
		super(UmlElement.PROPERTY, name, null);
		upperBound = 1;
		lowerBound = 1;
		this.type = type;

		isAbstract= false;
		isDerived= false;
		isComposite= false;
		isAggregate= false;
		isOrdered= false;
		isNavigable= true;
		redefines= null;
		subsets= null;
		
		sister = null;
	}
	
	public void addRedefines(UmlProperty p) {
		if (redefines == null) redefines = new ArrayList<UmlProperty>(4);
		redefines.add(p);
	}
	
	public void addSubsets(UmlProperty p) {
		if (subsets == null) subsets = new ArrayList<UmlProperty>(4);
		subsets.add(p);
	}
}
