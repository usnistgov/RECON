/* XmlObject.java -- XML content data structure 
 * XML content objects can be elements or CDATA or Comments or Directives
 * The type of the object determines which.
 * Only elements have name and attributes.
 * 
 * Note:  XML content objects form a linked list that is threaded through
 * the XmlObject itself, using fchild, lchild, next
 */
package xmlParse;

public class XmlObject {

	  public XmlType type;		/* object type */
	  public XmlState state;	/* content construction state */
	  public String name;		/* for Elements, the tag for the element */
	  public String content;	/* simple CDATA content, if any */
	  public XmlAttribute attrs;/* first attribute, if any (only for Element objects) */
	  public XmlObject parent;	/* object in whose content this object appears */
	  public XmlObject fchild;	/* first content object within this object */
	  public XmlObject lchild;	/* last content object within this object */
	  public XmlObject next;	/* next content object under the same parent */

	  /* simple constructor */
	  public XmlObject(XmlType ntype) {
		  type = ntype;
		  state = XmlState.XML_EMPTY;
		  name = null;
		  content = null;
		  attrs = null;
		  parent = null;
		  fchild = null;
		  lchild = null;
		  next = null;
	  
	  }

	/* find_element -- finds the first element with a given tag 
	 * in the content of the owner element
	 */
	public  XmlObject find_element(String tag)
	{
		  XmlObject elt;

		  for (elt = fchild; elt != null; elt = elt.next) {
		    if (elt.name.equals(tag)) return elt;
		  }
		return null;
		
	}
	
	/* find_attribute -- finds the attribute with a given name
	 * in the content of the owner element
	 */
	public  XmlAttribute find_attribute(String aname)
	{
		  XmlAttribute att;

		  for (att = attrs; att != null; att = att.next) {
		    if (att.name.equals(aname)) return att;
		  }
		return null;
	}


}
