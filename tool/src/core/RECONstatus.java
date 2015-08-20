/* RECONStatus.java
 *   data structure for reporting result of a RECON invocation
 */
package core;

public class RECONstatus {
	
	public int status; // result of the process
	public static final int ALLOK = 0;
	public static final int ERRORS = 1;
	public static final int FAILED = -1;
	
	public int errorCount;
	public int lineCount;
	
	public RECONstatus(int status, int errors, int lines)
	{
		this.status = status;
		this.errorCount = errors;
		this.lineCount = lines;
	}

}
