/* FileIn.java
 * basic file input and lexical scan services
 * abstract class, must be tailored to actual lexical rules
 * for a particular file type
 */

package utilities;

import java.io.*;

/** class FileIn
 * represents a stream file
 * supports a constructor that opens the file, given the file name
 * .close() to close the file
 * .isOpen() returns true if file is open, else false
 * .getFilename() returns the name of the file
 * .thisC() to get the current character (what the last collector stopped on)
 * .nextC() to get the next character (or EOF at end of file)
 * .atEOF() returns true if the next character is EOF
 * .isEOF(char) returns true if the character is the EOF marker
 * .backup() to backup one character, so that it is reread
 * .gotoEndOfLine() to skip to the next LF character
 * .getLine(char[] buffer, int buffersize) to get the next line
 * .printBuffer() to print the lines of the file in the vicinity of an error
 */
public abstract class FileIn
{
	/* parameters */
	protected static final int EOF = -1;
	protected static final int BUFSIZE = 128;
  
	/* the ctlchars table identifies each UTF8 control code as
	 * true if it is always ignored, and false if it may be significant */
	protected static final boolean ctlchars[] = {
	/* NUL   SOH   STX   ETX   EOT   ENQ   ACK   BEL */
	   true, true, true, true, true, true, true, true, 
	/* BS    HT     LF     VT    FF    CR     SI     SO */
	   true, false, false, true, true, false, false, false,
	/* DLE   DC1   DC2   DC3   DC4   NAK   SYN   ETB */
	   true, true, true, true, true, true, true, true, 
	/* CAN   EOM   SUB   ESC    FS    RS    GS    US */
	   true, true, true, false, true, true, true, true };
	/* HT, LF/NL and CR are explicitly whitespace characters in XML
	 * ESC, SI and SO are used in UTF8 character encodings */
	
	/* the BEL character, for alert purposes */
	protected static final int ALERT = 0x07;

	protected String filename;		/* name of the file, for messages */
	protected FileInputStream fd;	/* actual file */
	protected int thisc;	/* current character from EDI stream */
	private int holdc;	/* look ahead character from stream, if any */
	private int lastc;	/* previous character from stream */

	/* buffers for diagnostic prints */
	protected byte[][] buffer;
	protected int currentbuf;	/* current buffer */
	protected int bufpos;	/* current buffer position */
	protected int prvsize;	/* size of previous buffer */
	protected int cursize;	/* size of current line */

	/** FileIn constructor
	 * opens the file and initializes the buffer
	 * if it cannot open the file, the FileIn object is created,
	 * but it is not "open", i.e., isOpen will return false,
	 * and any attempt to read from the file will return EOF
	 */
	public FileIn(String filename)
	{
		/* initialize character slots */
	    thisc = 0;	/* current */
	    holdc = 0;	/* next, if look ahead */
	    lastc = 0;	/* previous */

	    /* initialize scan buffers */
	    buffer = new byte[2][BUFSIZE];
	    currentbuf = 0;
	    bufpos = 0;
	    prvsize = 0;
	    cursize = 0;

	    /* open the file */
	    this.filename = filename;
	    try {
	    	fd = new FileInputStream(filename);
	    } catch (IOException ex) {
	    	System.err.println("*** Could not open " + filename);
	    	fd = null;
	    	thisc = EOF;
	    	holdc = EOF;
	    }
	}
	
	/** getC()
	 * safe read next character
	 */
	private int getC()
	{
		int c;
		
		c = EOF;	/* default return */
	    if (thisc != EOF) try {
	    	c = fd.read();
	    } catch (EOFException ex) {
	    	/* do nothing and return the EOF */
	    } catch (IOException ex) {
	    	/* complain and return the EOF */
	    	System.err.println("*** I/O Error reading file " + 
	    			filename + ": " + ex);
	    }
	    return c;
	}
	
	/**
     * routine to close the document file
	 */
	public void close()
	{
	    if (isOpen()) try {
	    	fd.close();
	    } catch (IOException ex) {
	    	/* do nothing */
	    } finally {
		    thisc = EOF;
		    holdc = EOF;
		    fd = null;
	    }
	}
	
	/** isOpen()
	 *  routine to determine whether the file is open
	 */
	public boolean isOpen()
	{
	    return (fd != null);
	}
	
	/** getFilename()
	 * method that returns the name of the file in being read
	 */
	public String getFilename()
	{
		return filename;
	}
	
	/** thisC
	 * routine to return the current character in the document
	 */
	public int thisC()
	{
	    return thisc;
	}
	
	/** atEOF
	 *  returns true if the End of File has been encountered
	 */
	public boolean atEOF()
	{
		return (thisc == EOF);
	}
	
	/** isEOF
	 *  returns true if the argument is the End-of-File indicator
	 */
	public static boolean isEOF(int c)
	{
		return (c == EOF);
	}
	
	/** nextC
	 * routine to get the next character in the document
	 * character is returned directly, and also in thisc
	 */
	public int nextC()
	{
		lastc = thisc;	/* save current character, in case of backup */
		
		/* check for character waiting */
		if (holdc == 0) {
			/* no character waiting, get next from file,
             * ignore most control characters */
			do {
				thisc = getC();
				if (thisc == EOF) return EOF;
            } while (thisc < 0x20 && ctlchars[thisc]);

		} else {
			/* we looked ahead, so use the saved character */
			thisc = holdc;
			holdc = 0;
			if (thisc == EOF) return EOF;
		}
	
		/* special rule for carriage return characters:
		 * if CR is followed by LF, return just the LF
		 * else replace the CR with a LF
		 * but then we have to hold the character that isn't a LF,
		 * unless it is an ignored character */
		if (thisc == '\r') {
		    holdc = getC();
	        if (holdc < 0x20) {
	            if (holdc == '\n' || ctlchars[holdc]) holdc = 0;
	        }
		    thisc = '\n';
		}
		
		/* capture the character in a buffer, for diagnostics */
		if (lastc == '\n' || bufpos >= BUFSIZE) {
			prvsize = bufpos;
			bufpos = 0;
			currentbuf = 1 - currentbuf;
		}
		buffer[currentbuf][bufpos++] = (byte)thisc;
	
		return thisc;
	}
	
	/** backup() -- routine to backup and "reread" the last character
	 */
	public void backup() 
	{
		if (lastc != ALERT) {
			holdc = thisc;
			thisc = lastc;
			lastc = ALERT;
		}
	}
	
	/** gotoEndOfLine()
	 * routine to skip to end of line
	 */
	public void gotoEndOfLine()
	{
		while (thisc != '\n') {
			if (thisc == EOF) return;
			nextC();
		}
	}
	
	/** getLine()
	 * routine to return characters to a designated buffer
	 * until the next end-of-line or EOF
	 * the buffering stops on any of the following:
	 *  - a new line (LF) character is copied to the buffer
	 *  - the buffer is full, according to the size provided
	 *  - the End Of File is encountered
	 *  In all cases, getLine returns the number of characters copied to the buffer
	 */
	public int getLine(char[] user, int usersize) 
	{
		for (cursize = 0; cursize < usersize; nextC()) {
			if (thisc == EOF) return cursize;
			user[cursize++] = (char)thisc;
			if (thisc == '\n') {
				nextC();
				return cursize;
			}
		}
		return cursize;
	}
	
	/** printBuffer
	 * routine to print the most recently processed characters in the stream
	 */
	public void printBuffer(PrintStream syserr)
	{
		int stop;
		
		if (prvsize > 0) {
			stop = (buffer[1-currentbuf][prvsize-1] == '\n' ? prvsize-1 : prvsize);
			if (stop != 0) 
				syserr.println(new String(buffer[1-currentbuf], 0, stop));
			else
				syserr.println("(blank line)");
		}
		if (bufpos > 0) {
			stop = (buffer[currentbuf][bufpos-1] == '\n' ? bufpos-1 : bufpos);
			if (stop != 0) 
				syserr.println(new String(buffer[currentbuf], 0, stop));
			else
				syserr.println("(blank line)");
		}
	}

} //FileIn

