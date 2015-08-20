/* UmlParameter.java
 *  represents a UML Parameter (of an Operation)
 *  it has a type, a multiplicity, and a direction (in, out, inout, result)
 *  its sister link is to the next parameter for the same Operation
 */

package uml;

public class UmlParameter extends UmlElement {
	
	public UMLType type;
	public int upperBound;
	public int lowerBound;
	public int direction;	/* an integer value for in, out, result */
	public UmlParameter sister;
	
	public static final int IN = 0;
	public static final int RESULT = 1;
	public static final int OUT = 2;
	public static final int INOUT = 3;
	
	public UmlParameter(String name, UMLType type, int dir)
	{
		super(UmlElement.PARAM, name, null);
		upperBound = 1;
		lowerBound = 1;
		this.type = type;
		this.direction = dir;
	}

	public static final String[] directions = {
		"in", "result", "out", "inout"
	};
	
	public static String name_direction(int direction)
	{
		return directions[direction];
	}
}
