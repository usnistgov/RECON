package uml;

import NBVR.Vocabulary.impl.FormulationFormImpl;

public class UmlElement extends FormulationFormImpl implements UMLElt {

	/* instance properties */
	public int kind;	/* Element kind -- one of the values below */
	public String id;	/* the XMI id for the Element */
	public String name;	/* the UML name for the Element */
	public String uri;	/* the URI for the Element, if any */
	public UmlRule firstRule;	/* the list of Constraints on the Element, if any */
	public UmlComment firstComment;	/* the comments attached to the element */

	public static final int COMMENT = 0;
	public static final int CLASS = 1;
	public static final int DTYPE = 2;
	public static final int PTYPE = 3;
	public static final int ENUM  = 4;
	public static final int VALUE = 5;
	public static final int ASSOC = 6;
	public static final int PROPERTY = 7;
	public static final int OPERATION = 8;
	public static final int PARAM = 9;
	public static final int INSTANCE = 10;
	public static final int LINK = 11;
	public static final int SLOT = 12;
	public static final int IVALUE = 13;
	public static final int RULE = 14;
	public static final int PACKAGE = 15;
	public static final int ASSOCLASS = 16;

	/* static buffer for name mangling */
	private static final int MAXUMLNAME = 256;
	private static StringBuffer idbuf = new StringBuffer(MAXUMLNAME);
	/* static unique element number */
	private static int eltno = 0; 
	
	public UmlElement(int kind, String name, String uri)
	{
		++eltno;			/* create a new number for this element */
		this.kind = kind;
		this.name = name;
		this.uri = uri;
		this.id = generate_id();
		if (name == null) this.name = this.id;
		firstRule = null;
		firstComment = null;
	}

	/** generate_id
	 * generate the XMI id value = type code, element number, element name
	 * @return the generated id string
	 */
	private String generate_id()
	{

		/* if the element has an external id, make it the xmi_id */
		if (this.uri != null) return this.uri;

		/* otherwise, generate an id derived from the name */
		/* first, generate an element type prefix */
		char id;
		switch (kind) {
		case COMMENT:
			id = 'x';
			break;
		case CLASS:
			id = 'c'; /* "Class" */
			break;
		case DTYPE:
			id = 't'; /* "Data Type" */
			break;
		case ENUM:
			id = 't'; /* "Enumeration type" */
			break;
		case PTYPE:
			id = 't'; /*  "Primitive type" */
			break;
		case VALUE:
			id = 'v'; /* "(Enumeration) Value" */
			break;
		case ASSOC:
			id = 'a'; /* "Association" */
			break;
		case PROPERTY:
			id = 'p'; /* "Property" */
			break;
		case OPERATION:
			id = 'f'; /*  "Operation" */
			break;
		case PARAM:
			id = 'e'; /*  "Parameter" */
			break;
		case INSTANCE:
			id = 'i'; /*  "Object" */
			break;
		case LINK:
			id = 'k'; /*  "Link" */
			break;
		case SLOT:
			id = 'e'; /* "Slot" */
			break;
		case IVALUE:
			id = 'e'; /* "Instance Value" */
			break;
		case PACKAGE:
			id = 'm'; /* "Package" */
			break;
		case RULE:
			id = 'r';
			break;
		default:
			id = 'x'; /*  "Element" */
		}

		idbuf.setLength(0);
		idbuf.append(id);
		idbuf.append(eltno);
		if (kind != COMMENT) {
			idbuf.append('_');
			/* replace invalid id characters and spaces */
			make_id_from_name(idbuf, name);	
		}
		return idbuf.toString();
	}

	/* make_id_from_name
	 * copy a name to the provided string buffer, 
	 * replace invalid characters for XML ids
	 * notably, change all spaces to underscores
	 */
	public static void make_id_from_name(StringBuffer buf, String name)
	{
		for (int c = 0; c < name.length(); ++c){
			if (name.charAt(c) == ' ') {
				buf.append('_');
			} else if (name.charAt(c) == '<') {
				buf.append("._lt.");
			} else if (name.charAt(c) == '>') {
				buf.append("._gt.");
			} else if (name.charAt(c) == '&') {
				buf.append("._amp.");
			} else if (name.charAt(c) >= 0x20) {
				buf.append(name.charAt(c));
			}
		}
	}

	/* accessors */
	
	/** isStructured()
	 * inherited from FormulationForm, overrides default
	 * 
	 * @return true: all UML formulations are "structured"
	 */
	@Override
	public boolean isStructured() {
		return true;
	}
	
	/* returns UmlElement.kind */
	public int getKind() {
		return kind;
	}

	/* returns UmlElement.name */
	public String getName() {
		return name;
	}

	/* returns UmlElement.id */	
	public String getId() {
		return id;
	}
	
	/* returns UmlElement.uri */
	public String getURI() {
		return uri;
	}
	/* returns UmlElement.firstRule */	
	public UmlRule getRules() {
		return firstRule;
	}

	/** addComment
	 * adds a Comment to the element
	 * @param cmt = the UmlComment object to be attached
	 */
	public void addComment(UmlComment cmt) {
		if (firstComment != null) firstComment.sister = cmt;
		firstComment = cmt;
	}

	/* return the term/name that goes with the element type code */
	public static final String[] typenames = {
		"Comment", "Class", "DataType", "PrimitiveType", "Enumeration", "Value", 
		"Association", "Property", "Operation", "Parameter", 
		"InstanceSpecification", "Link", "Slot", "InstanceValue", 
		"Constraint", "Package", "AssociationClass"
	};
	public static String name_type(int type) 
	{
		return typenames[type];
	}

	/** getNewId(name)
	 *  generate a new unique identifier for an XMI element that is not a UmlElement
	 * @param name = the name to make up the last half of the id (possibly null)
	 * @return an XMI id in the same form as those generated by generate_id
	 */
	public static String getNewId(String name)
	{
		++eltno;
		idbuf.setLength(0);
		idbuf.append('x');
		idbuf.append(eltno);
		if (name != null) idbuf.append(name);
		return idbuf.toString();
	}

} /* UMLElement */

