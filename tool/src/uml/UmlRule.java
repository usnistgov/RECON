/* UmlRule.java
 *  represents a UML Constraint or Rule
 *  it has a language and a body
 *  its sister link is to the next rule for the same parent model element
 */
package uml;

import java.util.ArrayList;

public class UmlRule extends UmlElement {

	public String body;
	public String language;
	public ArrayList<UmlElement> affects;
	public UmlRule sister;
	
	public UmlRule(String name, String body, String lang)
	{
		super(UmlElement.RULE, name, null);
		this.body = body;
		this.language = lang;
		this.sister = null;
		this.affects = new ArrayList<UmlElement>(4);
	}
	
	public void addAffects(UmlElement elt)
	{
		affects.add(elt);
	}

}
