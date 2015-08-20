/* dummy NamedReader.java
 * 
 */
package utilities;

import java.io.*;

public class NamedReader extends FileReader 
{
	public String filename;
	
	public NamedReader(String filename)
		throws java.io.FileNotFoundException
	{
		super(filename);
		this.filename = filename;
		
	}
	
	public String getFilename()
	{
		return filename;
	}

}
