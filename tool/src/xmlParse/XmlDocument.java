/* XmlDocument.java -- XML Document/File objects 
 */
package xmlParse;

import java.io.*;

public class XmlDocument {
	//TODO: consider extending FileIn
	
	public static final int XML_MAXSTRING = 8192;
	
	private static final int EOF = -1;

	/* document object stack */
	public XmlObject xml_document;
	public XmlObject xml_current;
	public String filename;

	/* the ctlchars table identifies each UTF8 control code as
	 * 1/true if it is always ignored, and 0/false if it may be significant */
	private static final int ctlchars[] = {
	/* NUL SOH STX ETX EOT ENQ ACK BEL BS HT LF VT FF CR SI SO */
	   1,  1,  1,  1,  1,  1,  1,  1,  1, 0, 0, 1, 1, 0, 0, 0,
	/* DLE DC1 DC2 DC3 DC4 NAK SYN ETB CAN EOM SUB ESC FS RS GS US */
	   1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  1, 1, 1, 1 };
	/* HT, LF/NL and CR are explicitly whitespace characters in XML
	 * ESC, SI and SO are used in UTF8 character encodings */
	
	private static final int CHAR_APOS = 0x27;	/* Apostrophe, single-quote code value */
	private static final int CHAR_QUOT = 0x22;	/* Quotation, double-quote code value */

	private FileReader xmlFd;
	private boolean utf8encoding;

	private StringBuffer Token;/* name and text buffer */
	private int nextc;	/* current character from XML stream */
	private int holdc;	/* look ahead character from stream, if any */
	private int end_state;	/* state of token gathering on last object return, values: */
	private static final int END_NORMAL  = 0;  /* last was > */
	private static final int END_TEXT    = 1;  /* normal, < character holding */
	private static final int END_INTEXT  = 2;  /* end of buffer processing text */
	private static final int END_INCDATA = 3; /* end of buffer processing CDATA */
	private static final int END_CDATA   = 4;  /* processing CDATA, ']]' holding */

	/* buffers for diagnostic prints */
	private static final int LINESIZE = 128;
	private StringBuffer[] xmlbuffer;
	private int xmlbuf;	/* current buffer */

	/* stream constructor */ 
	public XmlDocument(String filename) {
		
		/* record the filename */
		this.filename = filename;
		this.xmlFd = null;
		
		/* initialize document structure */
		xml_current = null;
		xml_current = new XmlObject(XmlType.XML_DUMMY);
		xml_current.state = XmlState.XML_ERROR;
		xml_document = xml_current;
		
		/* allocate the Token buffer for the file */
		Token = new StringBuffer(XML_MAXSTRING);
	}
	
	/* stream manipulators */
	
	/* routine to open the XML document file and initialize the buffer
	 * returns true on success, false on failure
	 */
	public boolean open() {
		/* open the file */
		try {
			xmlFd = new FileReader(filename);
		} catch (IOException ex) {
			System.err.println("*** Could not open XML file " + filename);
			xmlFd = null;
			return false;
		}

		/* initialize diagnostic buffers */
		xmlbuffer = new StringBuffer[2];
		xmlbuffer[0] = new StringBuffer(LINESIZE);
		xmlbuffer[1] = new StringBuffer(LINESIZE);
		xmlbuffer[0].setLength(0);
		xmlbuffer[1].setLength(0);
		xmlbuf = 0;

		/* initialize lexical scan */
		utf8encoding = true;
		holdc = (char)0;
		end_state = END_NORMAL;
		
		return(true);
		
	}
	
	/* routine to close the XML document file */
	public void close() {
		try {
			xmlFd.close();
		} catch (IOException ex) {
			System.err.println("*** Error closing XML file " + filename);
			xmlFd = null;
		}
	}
	
	/* routine to parse an XML document file
	 * returns the document root on success, null on failure
	 */
	public XmlObject parse()
	{
		XmlObject obj;
	
		/* open the file */
		if (!open()) return null;
	
		/* check for XML file */
		obj = xml_object();
		if (obj.type != XmlType.XML_INSTRUCTION || ! obj.name.equals("xml")) {
			System.err.println("*** First object is not an XML instruction!");
			close();
			return null;
		}
	
		/* get all the objects */
		while (xml_document.state != XmlState.XML_COMPLETE) {
			obj = xml_object();
			if (obj == null) {
				System.err.println("*** Document parse aborted!");
				close();
				return null;
			}
		}
	
		/* close the file */
		close();
	
		return xml_document;
	}

	/* routine to parse and return the next XML object */
	public XmlObject xml_object()
	{
		XmlObject obj;
		String endtag;
		
		/* Where did we stop? */
		switch (end_state) {
		case END_NORMAL:	/* stopped on >, advance and collect leading whitespace */
			skip_whitespace(true);
			break;
		
		case END_TEXT:	/* stopped with nextc = < */
			end_state = END_NORMAL; /* return to normal */
			break;
		
		case END_INTEXT:	/* stopped on end of buffer */
			/* always continue collecting text object(s) */
			return xml_text(collect_text());
		
		case END_INCDATA:	/* end of buffer in CDATA */
		case END_CDATA:	/* end of buffer in CDATA after ']]' */ 
			return xml_text(collect_cdata());
		
		default:	/* don't know what happened */
			System.err.println("*** Parser state lost.");
			print_buffer();
			return null;
		}
		
		/* when you come to the end, stop */
		if (nextc == EOF) return null;
		
		/* now look for XML markup */
		if (nextc != '<') {
			/* no markup; this is text */
			return xml_text(collect_text());
		}
		
		/* what kind of markup is it? */
		next_char();
		
		/* check for end of element */
		if (nextc == '/') {
			next_char();
			endtag = collect_name();
			if (endtag == null) return null;
			obj = xml_pop();
			if (endtag.equals(obj.name)) {
				obj.state = XmlState.XML_COMPLETE;
				return obj;
			} else {
				System.err.println("*** End tag " + endtag + " does not match " + obj.name);
				print_buffer();
				return null;
			}
		}
		
		/* check for comments and CDATA */
		if (nextc == '!') {
			if (next_char() == '[') {
				/* this is a CDATA text object */
				return xml_text(collect_cdata());
			} else {
				/* this is a comment object */
				obj = new XmlObject(XmlType.XML_COMMENT);
				obj.state = collect_comment();
				if (obj.state == XmlState.XML_ERROR) return null;
				obj.content = Token.toString();
				return obj;
			}
		}
		
		/* check for instructions */
		if (nextc == '?') {
			obj = new XmlObject(XmlType.XML_INSTRUCTION);
			skip_whitespace(true);
			obj.name = collect_name();
			if (obj.name == null) {
				System.err.println("*** Invalid process target: " + Token);
				print_buffer();
				return null;
			}
			skip_whitespace(false);
			obj.state = collect_instruction();
			if (obj.state == XmlState.XML_ERROR) return null;
			obj.content = Token.toString();
			return obj;
		}
		
		/* none of the above, collect element object */
		 
		/* make a new object and add it to the structure */
		obj = xml_add(XmlType.XML_ELEMENT);
		obj.name = collect_name();
		if (obj.name == null) {
			System.err.println("*** Invalid XML tag value: " + Token);
			print_buffer();
			return null;
		}
		skip_whitespace(false);
		
		/* now look for attributes */
		for (;;) {
			if (nextc == '>') {
			/* end of element head, content is open */
				obj.state = XmlState.XML_OPEN;
				xml_push(obj);
				return obj;
			} else if (nextc == '/') {
				/* end of element head, content is empty */
				if (next_char() == '>') {
					obj.state = XmlState.XML_EMPTY;
					return obj;
				} else {
					System.err.println("*** Element " + obj.name + " ends badly");
					print_buffer();
					return null;
				}
			} else {
				/* must be an attribute */
				if (! collect_attribute(obj)) return null;
				skip_whitespace(true);
			}
		} 
	}
	
	/* routine to collect an XML attribute and its value.
	 * if successful, the attribute is added to the list of 
	 * XML attributes attached to the obj parameter,
	 * and collect_attribute returns true
	 * otherwise, collect_attribute returns false
	 */
	private boolean collect_attribute(XmlObject obj)
	{
		XmlAttribute att = new XmlAttribute();
		
		att.name = collect_name();
		if (att.name == null) return false;
		
		skip_whitespace(false);
		if (nextc != '=') {
			System.err.println("*** Missing equal sign after attribute " + att.name);
			print_buffer();
			return false;
		}
		
		skip_whitespace(true);
		if (nextc != '"' && nextc != CHAR_APOS) {
			System.err.println("*** Value of attribute " + att.name + " missing quotation mark");
			print_buffer();
			return false;
		}
		
		att.value = collect_String();
		if (att.value == null) return false;
		
		/* link attribute to object */
		att.parent = obj;
		att.next = obj.attrs;
		obj.attrs = att;
		return true;
	}

	/* routine to create a text object 
	 * actual parameter invokes a routine to collect the content into Token
	 * which returns the "state" of the collection: complete, partial, error
	 * xml_text_object creates and returns the completed text object or null on error
	 */
	private XmlObject xml_text(XmlState obstate)
	{
		XmlObject obj;
		
		if (obstate == XmlState.XML_ERROR) return null;
		obj = xml_add(XmlType.XML_TEXT);
		obj.state = obstate;
		obj.content = Token.toString();
		return obj;
	}

	/* routine to read an XML comment
	 * on entry, nextc should be the first hyphen character
	 * collect_comment returns the text in Token
	 * and an indicator: complete, partial, error
	 * but if partial, the rest has been discarded.
	 */
	private XmlState collect_comment()
	{
		XmlState s = XmlState.XML_COMPLETE;  /* assume we will get it all */
		
		/* check the prefix */
		if (nextc != '-')  s = XmlState.XML_ERROR;
		if (next_char() != '-') s = XmlState.XML_ERROR;
		if (s == XmlState.XML_ERROR) {
			System.err.println("Expected <!-- in XML comment not found");
			print_buffer();
			return s;
		}
		
		/* now collect the value */
		Token.setLength(0);
		for (;; ) {
			next_char();
			
			/* check for comment end marker */
			if (end_state == END_NORMAL) {
				if (nextc == '-') {
					if (next_char() == '-') {
						end_state = END_TEXT;	/* have two hyphens, looking for > */
						next_char();
					} else {
						Token.append('-');	/* -x, put hyphen in text, x goes out below */
					}
				}
			}
			
			if (end_state == END_TEXT) {
				/* check for end marker */
				if (nextc == '>') {
					end_state = END_NORMAL;
					return s;
				} else if (nextc != '-') {	/* --x */
					Token.append('-');  /* the two hyphens were text */
					Token.append('-');
					end_state = END_NORMAL;	/* back to collecting */
				} /* else 3 hyphens! put one in text (below) and keep looking */
			}
			
			/* check for end of file */
			if (nextc == EOF) {
				System.err.println("End of file encountered in XML comment");
				print_buffer();
				return XmlState.XML_ERROR;
			}
			
			/* if we have space, save character in Token */
			if (s != XmlState.XML_PARTIAL) Token.append((char)nextc);
			
			/* check for buffer full, discard overrun */
			if (Token.length() >= XML_MAXSTRING) {
				s = XmlState.XML_PARTIAL; /* say we didn't keep it all */
			}
		}
	}

	/* routine to collect an XML instruction
	 * on entry, nextc should be the first non-whitespace character
	 * of the instruction text, after the target has been parsed
	 * process_instruction returns the text in Token
	 * and an indicator: complete, partial, error
	 * but if partial, the rest has been discarded.
	 */
	private XmlState collect_instruction()
	{
		
		/* collect the value */
		XmlState s = XmlState.XML_COMPLETE;  /* assume we will get it all */
		Token.setLength(0);
		for (;;) {
			next_char();
			
			/* check for end marker */
			if (nextc == '?') {
				if (next_char() == '>') return s;
				Token.append('?');
			}
			
			/* check for end of file */
			if (nextc == EOF) {
				System.err.println("End of file encountered in processing instruction");
				print_buffer();
				return XmlState.XML_ERROR;
			}
			
			/* save character in Token */
			if (s != XmlState.XML_PARTIAL) Token.append((char)nextc);
			
			/* check for buffer full, discard overrun */
			if (Token.length() >= XML_MAXSTRING) {
				s = XmlState.XML_PARTIAL; /* say we didn't keep it all */
			}
		}
	}

	/* component collectors */
	
	/* routine to collect an XML name
	 * when called, nextc should be the first character of the name
	 */
	private String collect_name()
	{
		/* XML names must begin with a letter or an underscore
		 * or a void namespace prefix */
		if ( !(Character.isLetter(nextc) || nextc == '_' || nextc == ':') ) {
			System.err.println("*** Invalid first character in XML name");
			print_buffer();
			return null;
		}
		
		/* valid name */
		Token.setLength(0);
		do {
			Token.append((char)nextc);
			next_char();
		} while (Character.isLetter(nextc) || Character.isDigit(nextc) || nextc == '_'
				|| nextc == ':' || nextc == '.' || nextc == '-');
		return Token.toString();
	}

	/* routine to collect a String delimited by quotation marks
	 * when called, nextc should be the opening quotation mark
	 */
	private String collect_String()
	{
		int delim = nextc;	// what to look for
		
		Token.setLength(0);
		while (next_char() != delim) {
			if (nextc == '&') nextc = collect_substitute();
			if (nextc == EOF) return null;
			Token.append((char)nextc);
		};
		return Token.toString();
	}
	
	/* routine to collect a text content in Token
	 * when called, nextc is the first non-whitespace character of the text
	 * whitecount leading whitespace characters have been collected in Token
	 * collect_text returns an indicator: complete, partial, error
	 * the complete or partial value is returned through Token
	 */
	private XmlState collect_text()
	{
		if (end_state == END_NORMAL) {	/* starting a new collection */
			/* all initial whitespace is text, first nonwhite character is in nextc */
		} else {		/* resuming a partial collection */
			/* restart buffer, fetch next character */
			Token.setLength(0);
			next_char();
		}
	
		/* collect characters until one of three exit conditions occurs:
		 *  - markup (<) is detected
		 *  - End of File is encountered
		 *  - buffer overflow happens
		 */
		while (nextc != '<') {
			/* if substitution sequence, get equivalent character */
			if (nextc == '&') nextc = collect_substitute();
		
			/* on end of file, stop cold */
			if (nextc == EOF) {
				System.err.println("*** End of file encountered in text content");
				print_buffer();
				return XmlState.XML_ERROR;
			}
		
			/* copy character to buffer */
			Token.append((char)nextc);
		
			/* check for buffer overflow */
			if (Token.length() >= XML_MAXSTRING) {
				end_state = END_INTEXT;
				return XmlState.XML_PARTIAL;
			}
			next_char();
		}
	
		/* end of text, beginning of markup detected, stop */
		end_state = END_TEXT;
		return XmlState.XML_COMPLETE;
	}

	/* routine to collect a CDATA section
	 * when called, nextc is the first [ character
	 * collect_cdata returns an indicator: complete, partial, error
	 * the complete or partial value is returned through Token
	 */
	private XmlState collect_cdata()
	{
		int n;
		String cdata_head = "CDATA[";
	
		if (end_state == END_NORMAL) {
			/* collect the prefix */
			Token.setLength(0);
			for (n = 0; n < 6; ++n) Token.append((char)next_char());
			if (cdata_head.contentEquals(Token)) {
				System.err.println("*** Expected CDATA section after <![ not found.");
				print_buffer();
				return XmlState.XML_ERROR;
			}
			end_state = END_INCDATA; /* now collecting CDATA section */
		}
	
		/* now collect the value into Token, until one of the 3 exit conditions applies */
		Token.setLength(0);
		for (;;) {
			next_char();
		
			if (end_state == END_INCDATA) {
				/* check for CDATA end marker */
				if (nextc == ']') {
					if (next_char() == ']') {
						end_state = END_CDATA;	/* have two brackets, looking for > */
						next_char();
					} else {
						Token.append(']');	/* ]x, put ] in text, x goes out below */
					}
				}
			}
		
			if (end_state == END_CDATA) {
				/* check for end marker */
				if (nextc == '>') {
					end_state = END_NORMAL;
					return XmlState.XML_COMPLETE;
				} else if (nextc != ']') {	/* ]]x */
					Token.append(']');  /* the two brackets were text */
					Token.append(']');
					end_state = END_INCDATA;	/* back to collecting */
				} /* 3 brackets! put one in text (below) and keep looking */
			}
			
			/* check for end of file */
			if (nextc == EOF) {
				System.err.println("*** End of file encountered in CDATA section");
				print_buffer();
				return XmlState.XML_ERROR;
			}
			
			/* save current character in Token */
			Token.append((char)nextc);
		
			/* check for buffer full */
			if (Token.length() >= XML_MAXSTRING) {
				/* interrupt collection, leave end_state */
				return XmlState.XML_PARTIAL;
			}
		}  
	}


	/* routine to collect an XML character substitution sequence
	 * i.e. a sequence of characters beginning with & that denotes
	 * a single character.  When called, nextc is the ampersand.
	 * the referenced character is returned
	 */
	private static final StringBuffer minibuf = new StringBuffer(10);
	private int collect_substitute()
	{
		int b;
		
		/* collect the substitution sequence */
		minibuf.setLength(0);
		for (b = 0; next_char() != ';' && b < 10; b++) {
			if (nextc == EOF) return EOF;
			minibuf.append((char)nextc);
		}
		
		/* now interpret the sequence */
		
		/* check for character references */
		if (minibuf.charAt(0) == '#') {
			if (minibuf.charAt(1) == 'x')
				return htoi(minibuf, 2);
			else
				return Integer.valueOf(minibuf.substring(1));
		}
		
		/* check for special characters */
		String s = minibuf.toString();
		if (s.equals("lt")) {
			return '<';
		} else if (s.equals("gt")) {
			return '>';
		} else if (s.equals("amp")) {
			return '&';
		} else if (s.equals("quot")) {
			return '"';
		} else if (s.equals("apos")) {
			return '"';
		}
		
		/* don't know what it is */
		return '?';
	}

	/* routine to add an object to the current structure */
	private XmlObject xml_add(XmlType type)
	{
	  /* create and initialize the object */
	  XmlObject obj = new XmlObject(type);
	
	  /* make it a child of the current parent */
	  obj.parent = xml_current;
	  if (xml_current.fchild == null) {
	    /* this is the first child */
	    xml_current.fchild = obj;
	    xml_current.lchild = obj;
	  } else {
	    /* link sibling to this child */
	    xml_current.lchild.next = obj;
	    xml_current.lchild = obj;
	  }
	  return obj;
	}

	private void xml_push(XmlObject obj)
	{
	  xml_current = obj;
	  if (xml_document.type == XmlType.XML_DUMMY) xml_document = obj;
	}
	
	private XmlObject xml_pop()
	{
	  XmlObject current;
	
	  current = xml_current;
	  if (current.type != XmlType.XML_DUMMY) xml_current = current.parent;
	  return current;
	}

	/* lexical routines */
	
	/** getC()
	 * safe read next character
	 */
	private int getC()
	{
		int c;
		
		c = EOF;	/* default return */
	    if (nextc != EOF) try {
	    	c = xmlFd.read();
	    } catch (EOFException ex) {
	    	/* do nothing and return the EOF */
	    } catch (IOException ex) {
	    	/* complain and return the EOF */
	    	System.err.println("*** I/O Error reading file " + 
	    			filename + ": " + ex);
	    }
	    return c;
	}
	
	/* routine to get the next XML character in the document
	 * character is returned directly, and also in nextc
	 */
	private int next_char()
	{
		if (holdc == 0) {
			/* get next character from file, ignoring most control chars */
			do {
				nextc = getC();
			} while (nextc < 0x20 && ctlchars[nextc] != 0);
		} else {
			/* we looked ahead, so use the saved character */
			nextc = holdc;
			holdc = 0;
		}
		
		/* special rule for carriage return characters:
		 * if CR is followed by LF, return just the LF
		 * else replace the CR with a LF
		 * but then we have to hold the character that isn't a LF,
		 * unless it is an ignored character */
		if (nextc == '\r') {
			holdc = getC();
			if (holdc < 0x20) {
				if (holdc == '\n' || ctlchars[holdc] != 0) holdc = 0;
			}
			nextc = '\n';
		}
		
		/* capture the character in a buffer, for diagnostics */
		if (xmlbuffer[xmlbuf].length() >= LINESIZE) {
			/* the current buffer is full - switch buffers */
			xmlbuf = 1 - xmlbuf;
			xmlbuffer[xmlbuf].setLength(0);
		}
		xmlbuffer[xmlbuf].append(nextc);
		
		return nextc;
	}
	
	/* routine to skip whitespace characters */
	private void skip_whitespace(boolean advance)
	{
		if (advance) next_char();

		Token.setLength(0);
		while (Character.isWhitespace(nextc)) {
			Token.append((char)nextc);
			next_char();
		};
	}
	  
	/* routine to print the most recently processed characters in the XML stream
	 */
	public void print_buffer()
	{
	  System.err.println(xmlbuffer[1-xmlbuf]);
	  System.err.println(xmlbuffer[xmlbuf]);
	}
	
	/* other stuff */
	
	/* utility routine to convert a hexadecimal string 
	 * to an integer
	 */
	private static int htoi(StringBuffer buf, int start)
	{
		int b;
		int c;
	
		int result = 0;
		for (b = start; b < buf.length(); ++b) {
			c = buf.charAt(b);
			if (Character.isDigit(c)) {
				c = c - '0';
			} else if (Character.isUpperCase(c)) {
				c = c - 'A' + 10;
			} else if (Character.isLowerCase(c)) {
				c = c - 'a' + 10;
			} else {
				c = 0;
			}
			result = (result << 4) + c;
		}
		return result;
	}


}
