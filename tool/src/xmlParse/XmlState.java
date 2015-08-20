package xmlParse;

public enum XmlState {
	  XML_ERROR, XML_EMPTY, XML_OPEN, XML_COMPLETE, XML_PARTIAL;

	static final String xmlstatenames[] = {
	  "Error", "Empty", "Open", "Complete", "Partial"
	};
	
	public String state_name() {
		switch (this) {
		case XML_ERROR: return "Error"; 
		case XML_EMPTY: return "Empty"; 
		case XML_OPEN: return "Open"; 
		case XML_COMPLETE: return "Complete"; 
		case XML_PARTIAL: return "Partial";
		}
		return null;
	}
}
