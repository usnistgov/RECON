/* xmltest.java - test routine for xmlp */
package xmlParse;

import java.util.LinkedList;

public class XmlTest {

	private static final String indent = "                ";
	private static final int MAX_TEXT = 60;
	private static final int MAX_ATTV = 48;
	
	private static LinkedList<XmlObject> stack;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		XmlObject obj;
		int depth;
		boolean isElt;

		if (args.length < 1) {
			System.err.println("Usage: xmltest testfile.xml");
			return;
		}

		XmlDocument doc = new XmlDocument(args[0]);
		if (! doc.open()) return;

		obj = doc.xml_object();
		if (obj.type != XmlType.XML_INSTRUCTION || ! obj.name.equals("xml")) {
			System.err.println("First object is not an XML instruction!");
			return;
		}

		depth = 0;
		stack = new LinkedList<XmlObject>();
		while (doc.xml_document.state != XmlState.XML_COMPLETE) {
			obj = doc.xml_object();
			if (obj == null) {
				System.err.println("Exiting on Null return");
				return;
			}
			isElt = (obj.type == XmlType.XML_ELEMENT);
			if (isElt && obj.state == XmlState.XML_COMPLETE) {
				if (stack.getLast() == obj) {
					/* if this is the last open element, close it */
					stack.removeLast();
					--depth;
					System.out.println(get_indent(depth) + "End: " + obj.name);
				} else {
					/* it is a simple element, ending in /> */
					print_element(obj, depth);
				}
			} else if (isElt) {
				print_element(obj, depth);
				if (obj.state == XmlState.XML_OPEN) {
					++depth;
					stack.add(obj);
				}
			} else {
				System.out.print(get_indent(depth) + obj.type.type_name() + " ");
				if (obj.type == XmlType.XML_INSTRUCTION) {
					System.out.println(obj.name);
				} else if (obj.type == XmlType.XML_TEXT || obj.type == XmlType.XML_COMMENT) {
					if (obj.content.length() < MAX_TEXT) {
						System.out.println(obj.content);
					} else {
						System.out.println(obj.content.substring(0, MAX_TEXT));
					}
				} else {
					System.out.println();
				}
			}
		}

		doc.close();
		return;
	}
	
	static void print_element(XmlObject obj, int depth)
	{
		XmlAttribute att;
		
		System.out.println(get_indent(depth) + obj.type.type_name() + " " + obj.name);
		if (obj.attrs != null) {
			for (att = obj.attrs; att != null; att = att.next) {
				System.out.print(get_indent(depth+2) + "Att: " + att.name);
				if (att.value != null) {
					if (att.value.length() < MAX_ATTV) System.out.println(" " + att.value);
					else System.out.println(" " + att.value.substring(0,MAX_ATTV));
				}
			}
		}
		
	}
	
	static String get_indent(int depth)
	{
		if (depth > indent.length()) return indent;
		return indent.substring(0, depth);
	}

}
