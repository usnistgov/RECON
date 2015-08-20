/* TokenIn.java
 * 	lexical scanner for the Parser
 * 	creates the tokens for a vocabulary source
 *  made from VocFileIn to parse definitions and axioms from stored strings
 */
package core;

import java.io.PrintStream;
import utilities.StreamIn;

public class TokenIn {
	
	/* parameters */
	public static final int VOC_MAXSTRING = 1024;
	
	/* utility null value */
	public static final String nullstring = "";

	/* local routines 
	 *  getToken()	
	 *    -- returns the next whitespace-delimited token as a String
	 *  getRest()
	 *    -- returns the String from current position to end of source line
	 *  getTokenKind()
	 *    -- collects the next lexical object, returns type (name, number, symbol)
	 *  getTokenString()
	 *    -- returns the current token as a string
	 *  getTokenValue()
	 *    -- returns the current token as an integer value
	 *  getTokenSymbol()
	 *    -- returns the first/only character of the current token as a char
	 *  getTokenChar(position)
	 *    -- returns the character in 'position' in the Token
	 *  skipToEnd()
	 *    -- skips to the end of the line
	 *  thisC()
	 *    -- return the current scan character
	 */

	/* whitespace characters */
	private static final String whitechars = " \t";
	
	/* symbols used by RECON */
	private static final String symbols = "\n():.,*/^\"";
	/* note: ' + - are permitted in names, and handled separately */

	/* local buffers */
	public char token[];	/* buffer to hold the collected token */
	public int tokensize;	/* length of current token */
	private TokenKind tkind;/* TokenKind for the current token */
	
	protected int thisc;	/* current character from the line */
	private int charno;	/* current character position in line */
	
	private char[] inline;	/* input line location */
	private int inlinesize;	/* count of characters in the inline buffer */
	private int maxline;
	private StreamIn inStream;	/* the input file, if any */
	
	/** file-based constructor
	 * When the TokenIn is connected to file input, the input source is a Reader
	 * and the caller provides the line buffer and its size.
	 * The Reader is only used directly at the end-of-line:
	 *   TokenIn takes newline followed by whitespace to be whitespace and 
	 *   continues the scan through the next physical line, using the source Reader
	 *   to look ahead past the end-of-line and reload the line buffer if appropriate.
	 * Newline followed by anything else, including a null Reader, ends the scan
	 */
	public TokenIn(StreamIn source, char[] line, int linesize)
	{
	    /* create the token buffer */
	    token = new char[VOC_MAXSTRING];
	    
	    /* set up the input from the source */
	    inStream = source;
	    inline = line;
	    maxline = linesize;
	}
	
	/** non-file constructor
	 * creates the token buffer for a vocabulary source
	 * When the TokenIn is not connected to a file input, source is null
	 * The line buffer is loaded by setLine
	 * Newline ends the scan
	 */
	public TokenIn()
	{
	    /* create the token buffer */
	    token = new char[VOC_MAXSTRING];
	    
	    /* indicate that there is no file, and no line yet */
	    inStream = null;
	    inline = null;
	    inlinesize = 0;
	}

	/** setLine(line, linesize)
	 *  initializes the processing of a new source line
	 * 
	 * @param line = the character array that is the text of the line
	 * @param linesize = the number of characters that are part of the line
	 */
	public void setLine(char[] line, int linesize)
	{
		/* save the line buffer pointer for everyone else */
		inline = line;
		inlinesize = linesize;
		
	    /* initialize lexical scan */
	    charno = 0;
	    nextC(); /* get the first character of the file */
	}
	
	/** nextC
	 * routine to get the next character in the line
	 * character is returned directly, and also in thisc
	 */
	private int nextC()
	{
		if (charno >= inlinesize)
			thisc = '\n';
		else
			thisc = inline[charno];
		++charno;
		return thisc;
	}
	
	/** collectToken()
	 * if param 'dumb' is true
	 *   collects the next whitespace-delimited substring from the base string
	 * else
	 *   collects and types names, numbers and symbols, depending on first
	 *   character, as an array of characters in token
	 *   stops on first inappropriate character for type
	 * 
	 * Sets tokensize to the size of the collected substring,
	 *   the number of characters in the 'token' array.
	 * if it collects nothing, tokensize is set to zero.
	 * @return tokensize = the number of characters in 'token'  
	 */
	private int collectToken(boolean dumb)
	{
		/* initial value of token size is 0 */
		tokensize = 0;

		/* skip the leading whitespace */
		while (thisCisWhite()) nextC();
		
		/* collect a token character sequence */
		if (dumb) {
			/* collect everything up to the next whitespace separator */
			tkind = TokenKind.ANY;
			while (! thisCisWhite() && ! (thisc == '\n')) {
				token[tokensize++] = (char)thisc;
				nextC();
				if (tokensize >= VOC_MAXSTRING) return tokensize;
			}
			
		} else if (Character.isDigit(thisc)) {
			collectNumber();

		} else if (thisc == '"' || thisc == '\'') {
			int quote = thisc;
			tkind = TokenKind.STRING;
			for (nextC(); thisc != quote; nextC()) {
				if (thisc == '\n') return tokensize;
				if (tokensize >= VOC_MAXSTRING) return tokensize;
				token[tokensize++] = (char)thisc;
			}
			nextC(); // eat the closing quote mark

		} else if (thisc == '-' || thisc == '+') {
			collectNumber();
			/* if no digit follows the sign, collectNumber will create a SYMBOL */

		} else if (thisCisSymbol()){
			tkind = TokenKind.SYMBOL;
			token[tokensize++] = (char)thisc;
			nextC();
		} else {
			collectName();
		}
		return tokensize;
	}

	/** collectName
	 *  collects a "name", a word beginning with a letter
	 */
	private void collectName()
	{
		tkind = TokenKind.NAME;
		while (! thisCisWhite() && ! thisCisSymbol()) {
			token[tokensize++] = (char)thisc;
			nextC();
			if (tokensize >= VOC_MAXSTRING) return;
		}
	}

	/** collectNumber()
	 * collects integers, decimal numbers, date and time strings
	 * integers and decimal numbers have the form:
	 *   [sign] digits [period digits] [E [sign] digits]
	 * rational numbers have the form:
	 *   [sign] digits "/" digits
	 * dates have the form:
	 *   digits "/" digits "/" digits or digits "." digits "." digits
	 * times have the form:
	 *   digits ":" digits [ ":" digits [ "." digits ] ]
	 */
	private void collectNumber()
	{
		/* the number may begin with a sign */
		boolean sign = (thisc == '+' || thisc == '-');
		if (sign) {
			token[tokensize++] = (char)thisc;
			nextC();
		}

		/* after the sign, if any, the number must consist of digits */
		if (collectDigits() == 0) {
			/* the token consists only of the sign */
			tkind = TokenKind.SYMBOL;
			return;
		}

		/* a digit string followed by a slash is a date
		 * collectDate will recognize a rational number */
		if (thisc == '/') {
			tkind = collectDateTime('/', sign);
			return;
		}

		/* a digit string followed by a colon is a time */
		if (thisc == ':' && ! sign) {
			tkind = collectDateTime(':', false);
			return;
		}

		/* we have an integer, possibly signed */
		tkind = TokenKind.NUMBER;
		
		/* look for a decimal point and a fraction */
		if (thisc == '.') {
			/* add the decimal point and fraction to the token */
			if (addDelimAndDigits()) {
				/* we have a fraction, it is a Decimal number */
				tkind = TokenKind.DECIMAL;
			} else {
				/* no fraction, return the integer */
				return;
			}
		}

		/* digits.digits.digits is a European date */
		if (thisc == '.' && ! sign) {
			/* try to add the period and a year number to the token
			 * if it works, return a date; otherwise return the decimal number */
			if (addDelimAndDigits()) tkind = TokenKind.DATETIME;
			return;
		}

		/* we have some kind of number, look for a power of 10
		 * if there is no E, return what we have */
		if (thisc != 'E') return;

		/* we have <number>E, look for a sign */
		nextC();
		if (thisc == '+' || thisc == '-') {
			/* there is a sign; we must have a signed exponent, ergo a decimal number */
			tkind = TokenKind.DECIMAL;
			/* add the E to the token and collect the signed exponent */
			token[tokensize++] = 'E';
			if (! addDelimAndDigits()) {
				/* <number>E<sign><no digits> is a syntax error
				 * insert a zero after the E and leave the sign for a separate token */
				token[tokensize++] = '0';
			}
		} else { /* no sign */
			--charno;  /* go back to the 'E' */
			thisc = 'E';
			/* try to add an unsigned exponent, 
			 * if we succeed, we have a decimal number, if not we return what we have */
			if (addDelimAndDigits()) tkind = TokenKind.DECIMAL;
		}
	}

	/** collectDigits()
	 *  collects a string of digits beginning with thisc
	 * @return the number of digits collected
	 */
	private int collectDigits() 
	{
		int start = tokensize;
		while (Character.isDigit(thisc)) {
			token[tokensize++] = (char)thisc;
			if (tokensize >= VOC_MAXSTRING) return tokensize - start;
			nextC();
		}
		return tokensize - start;
	}

	/** addDelimAndDigits()
	 * tries to add the current character and a following digit string to the token
	 * if there is no digit string, it fails and undoes it all
	 * @return true if the delimiter and a digit string are added to the token, false if not
	 */
	private boolean addDelimAndDigits()
	{
		/* add the delimiter to the token string, 
		 * and try to collect a following number */
		token[tokensize++] = (char)thisc;
		nextC();
		if (collectDigits() == 0) {
			/* no following number, the delimiter is not part of the token */
			thisc = token[--tokensize];
			--charno;
			return false;
		} else {
			return true;
		}
	}

	/** collectDateTime(delimiter)
	 *  collect a Date (mm/dd/yyyy) or a Time hh:mm[:ss[.sss]] or a Rational number (num/denom)
	 * @param delim the delimiting character '/' for dates, ':' for times
	 * @param sign is true if there was a leading sign, else false
	 * @return the token kind of the result: DATETIME, DECIMAL (rational), NUMBER
	 */
	private TokenKind collectDateTime(int delim, boolean sign)
	{
		/* on entry, the token buffer is an integer, possibly signed,
		 * and the current character (thisc) is the delimiter */
		
		/* add the delimiter and a following number to the token string */
		if (! addDelimAndDigits()) {
			/* no following number, the delimiter is not part of the token */
			/* all that is left is the number */
			return TokenKind.NUMBER;
		}
		
		/* the delimiter is part of the value, we have number/number or number:number
		 * if there is a sign, this is a rational number */
		if (sign) return TokenKind.DECIMAL;
		
		/* we have: <number><delim><number> */
		/* look for an additional field */
		if (thisc != delim) {
			/* end of value, number:number is hh:mm, number/number is rational */
			if (delim == '/') return TokenKind.DECIMAL;
			else return TokenKind.DATETIME;
		}
		
		/* we have number<delim>number<delim> */
		/* add the delimiter and a following number to the token string */
		if (! addDelimAndDigits()) {
			/* no following number, the delimiter is not part of the token */
			/* number/number is rational, number:number is hh:mm */
			if (delim == '/') return TokenKind.DECIMAL;
			else return TokenKind.DATETIME;
		}
		
		/* we have mo/da/year or hh:mm:ss
		 * a time string can have a fractional seconds part */
		if (thisc == '.' && delim == ':') {
			/* add the decimal point to the token string,
			 * and try to collect the fractional part hh:mm:ss.sss */
			addDelimAndDigits();
		}
		return TokenKind.DATETIME;

	}

	/** thisC()
	 * @return the current scan character
	 */
	public int thisC()
	{
		return thisc;
	}
	
	/** getToken()
	 * returns the next whitespace-delimited token from the base string
	 * if there is no such token, getToken() returns the null string
	 * @return a String that is the next token or the null string
	 */
	public String getToken()
	{
		if (collectToken(true) == 0) return nullstring;
		return new String(token, 0, tokensize);
	}
	
	/** nextToken
	 *  collects the next syntactic token in token[]
	 *  and returns the kind of token: name, number, symbol
	 */
	public TokenKind nextToken()
	{
		collectToken(false);
		return tkind;
	}
	
	/** getTokenKind
	 *  returns the kind of the current token: name, number, symbol
	 */
	public TokenKind getTokenKind()
	{
		return tkind;
	}
	
	/** getRest()
	 * returns the rest of the line as a single token value
	 * @return the rest of the line as the token
	 */
	public String getRest()
	{
		/* defaults */
		tokensize = 0;
		tkind = TokenKind.ANY;

		/* skip the leading whitespace */
		while (thisCisWhite()) nextC();
		
		/* if we are at the end of line, return nothing */
		if (thisc == '\n') return nullstring;

		/* token is everything from here to end of line */
		while (thisc != '\n' && tokensize < VOC_MAXSTRING) {
			token[tokensize++] = (char)thisc;
			nextC();
		}
		return new String(token, 0, tokensize);
	}
	
	/** getTokenString
	 *  returns the current token characters as a String
	 *  unlike getToken, it does not collect the next token value
	 */
	public String getTokenString()
	{
		if (tokensize == 0) return nullstring;
		return new String(token, 0, tokensize);
	}
	
	/** getTokenValue
	 *  returns the current token characters as an integer
	 *  unlike getToken, it does not collect the next token value
	 */
	public int getTokenValue()
	{
		int result = 0;
		int tpos;
		
		for (tpos = 0; tpos < tokensize; ++tpos) {
			result = 10 * result + (token[tpos] - '0');
		}
		return result;
	}
	
	/** getTokenSymbol
	 *  returns the first character of the current token
	 */
	public int getTokenSymbol()
	{
		if (tokensize == 0) return 0;
		return token[0];
	}

	/** getTokenChar(position)
	 *  return the nth character of the Token string
	 * @param position = the index of the character to return, starting with 0
	 * @return the character at that position, if any, or 0
	 */
	public int getTokenChar(int position)
	{
		if (position < tokensize) return token[position];
		return 0;
	}
	
	/** skipToEnd()
	 *  skips to the end of the line
	 *  and returns the end-of-line token
	 * @return the end-of-line token
	 */
	public TokenKind skipToEnd()
	{
		charno = inlinesize - 1;
		thisc = inline[charno];
		++charno;
		return nextToken();
	}

	/** getPosition()
	 * @return the current character position in the source line
	 */
	public int getPosition()
	{
		return charno - 1; // charno is 1 beyond the position of thisC()
	}
	
	/** getLine(int start)
	 * @return the (remaining) text of the line as a string
	 */
	public String getLine(int start)
	{
		return String.valueOf(inline, start, inlinesize - start - 1);
	}
	
	/** printLine()
	 * prints the current inline buffer
	 * @param err = the 'error' output stream to print to
	 */
	public void printLine(PrintStream err)
	{
		err.println(String.valueOf(inline, 0, inlinesize - 1));
	}
	
	/** thisCisWhite
	 * @return true if the current character is a whitespace character, else false
	 */
	private boolean thisCisWhite()
	{
		/* if thisc is not a newline, 
		 *  return true if the character is in the whitespace list, else false
		 */
		if (thisc != '\n') return (whitechars.indexOf(thisc) >= 0);
		
		/* newline character */
		/* if there is no file, and thus no successor character, newline is not whitespace */
		if (inStream == null) return false;
		
		/* if there is a file, a new line is whitespace if the next file character is whitespace
		 * Note: the next file character is the current file character, because the LF was taken */
		/* Note: two consecutive new lines (a blank line) is not whitespace */
		if (whitechars.indexOf(inStream.thisC()) >= 0) {
			/* newline, whitespace: backup to include the whitespace character, 
			 * and add the continuation to the line buffer
			 */
			int addsize = 0;
			if (charno < maxline) {
				/* load the next line over the newline */
				addsize = inStream.getLine(inline,  maxline, --charno);
				inlinesize = charno + addsize;
				thisc = inline[charno];	// the whitespace char in the add-on line
				++charno;	// count that as the current whitespace character
			}
			/* if we didn't add anything, return the newline
			 * if we added something, the newline was replaced by whitespace
			 */
			return (addsize > 0);
		} else {
			/* newline, not whitespace: the newline is end-of-line and end of scan */
			return false;
		}
	}

	/** thisCisSymbol
	 * @return true if the current character is RECON punctuation, else false
	 */
	private boolean thisCisSymbol()
	{
		if (thisCisWhite()) 
			return true;
		else
			return (symbols.indexOf(thisc) >= 0);

	}

}
