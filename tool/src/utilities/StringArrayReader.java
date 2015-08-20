/* StringArrayReader.java 
 *   routine to use an array of strings (without embedded new lines)
 *   as a file consisting of one line per string
 *   
 *   @author Ed Barkmeyer, NIST, Nov, 2011
 */
package utilities;

import java.io.IOException;
import java.io.Reader;

public class StringArrayReader extends Reader {
	
	/* retained string array positions */
	protected String[] strings;
	protected int stringno;	// the current string in the array
	protected int position;	// the current character position in the string
	protected int remchars;	// number of characters left in the current string
	protected boolean eos;	// true if end of stream has been reported

	/** constructor
	 *  creates a pseudo-file of lines from an array of strings
	 * @param source = the array of strings
	 */
	public StringArrayReader (String[] source) {
		strings = source;
		stringno = 0;
		position = 0;
		remchars = strings[0].length();
		eos = false;
	}

	/** newStrings(source)
	 * add a new string list to the reader source
	 * usually adds one string at a time
	 * reinitializes the reader, should be called only on EOF
	 * 
	 * @param source = the strings to be added to the stream
	 */
	public void newStrings(String[] source) {
		strings = source;
		stringno = 0;
		position = 0;
		remchars = strings[0].length();
		eos = false;
	}
	
	/** read(buf, offset, count)
	 * copies count characters from the current input position
	 *   into buf, beginning with buf[offset]
	 * returns the number of characters actually copied, or -1 on end of stream
	 */
	@Override
	public int read(char[] buf, int offset, int count) throws IOException {

		/* if end of stream has been found, fail outright */
		if (eos) return -1;

		/* if the pseudo-file has been closed, go away mad */
		if (strings == null) throw new IOException("String array was closed");

		/* if the buffer is too small for the count,
		 * stop at end of buffer */
		if (offset + count > buf.length) count = buf.length - offset;

		/* if the request is for more characters than are left in the current string,
		 * this read will be short, and include a newline */
		boolean eol = (count > remchars);
		if (eol) count = remchars;
		
		/* now copy characters to the buffer */
		for (int c = 0; c < count; ++c) {
			buf[offset++] = strings[stringno].charAt(position++);
			--remchars;
		};

		/* if we finished the current string */
		if (eol) {
			/* add a newline to the buffer */
			buf[offset] = '\n';
			++count;
			
			/* move on to the next string */
			++stringno;
			if (stringno < strings.length) {
				position = 0;
				remchars = strings[stringno].length();
			} else {
				/* no more strings -- end of file */
				eos = true;
			}
		}
		return count;	// characters actually copied
	}

	/** close()
	 * nothing to do, except stop processing the array
	 */
	@Override
	public void close() throws IOException {
		/* forget the source */
		strings = null;
	}

}
