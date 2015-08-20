/* UmlOperation.java
 *  represents a UML Operation
 *  it has zero or more Parameters
 *  its sister link is to the next operation for the same Class
 */

package uml;

public class UmlOperation extends UmlElement {
	
	public UmlParameter firstParam;
	private UmlParameter lastParam;
	public UmlOperation sister;
	
	public UmlOperation(String name, String uri)
	{
		super(UmlElement.OPERATION, name, uri);
		firstParam = null;
		lastParam = null;
		sister = null;
	}

	/** addParameter
	 * adds one parameter to the ordered parameter list
	 * @param p = the parameter to be added
	 */
	public void addParameter(UmlParameter p) {
		if (firstParam == null) {
			firstParam = p;
			lastParam = p;
		} else {
			lastParam.sister = p;
			lastParam = p;
		}
	}

}
