package xmlParse;

public enum XmlType {
	  XML_DUMMY,		/* type not set */ 
	  XML_ELEMENT, 		// XML Element
	  XML_TEXT, 		// Character data object
	  XML_COMMENT, 		// XML Comment object	-- <!--
	  XML_INSTRUCTION;	// XML Instruction object -- <!

	  protected static final int DUMMY = 0;
	  protected static final int ELEMENT = 1;
	  protected static final int TEXT = 2;
	  protected static final int COMMENT = 3;
	  protected static final int INSTRUCTION = 4;
	  protected static final int NTYPES = 5;
	  
	  protected static final String xmltypenames[] = {
		"Dummy", "Element", "Text", "Comment", "Instruction"
	  };

	public String type_name() 
	{
		switch(this) {
		case XML_DUMMY:	return "?";
		case XML_ELEMENT:	return "Element";
		case XML_TEXT:		return "Text";
		case XML_COMMENT:	return "Comment";
		case XML_INSTRUCTION:	return "Instruction";
		}
		return null;
	}
}
