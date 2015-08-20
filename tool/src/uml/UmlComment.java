/* UmlComment.java
 *  represents a comment, attached to UML element
 *  its only property is its body 
 *  its sister link is to the next comment attached to the same element
 */

package uml;

public class UmlComment extends UmlElement {

	public UmlComment sister;
	
	public UmlComment(String body)
	{
		super(UmlElement.COMMENT, body, null);
		sister = null;
	}

}
