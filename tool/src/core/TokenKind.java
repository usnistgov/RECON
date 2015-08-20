/* TokenKind.java
 * 
 */
package core;

/** TokenKind
 *  an enumerated type whose value denote the kind of lexical
 *  object most recently collected
 *  
 * @author Ed Barkmeyer, January 2008
 */
public enum TokenKind {
	NONE,		/* rest of string was whitespace */
	NAME,		/* name, beginning with a letter */
	SYMBOL,		/* symbol, any other single character */
	NUMBER,		/* number, beginning with a digit */
	DECIMAL,	/* number, containing one decimal point */
	DATETIME,	/* date or time form, numbers with embedded periods, slashes, colons */
	STRING,		/* quote-delimited character string */
	ANY,		/* collected an arbitrary string */
	
	STREAM,		/* token used as the base of the token stream */
	TERM,		/* Token is a TermToken */
	END,		/* Token is the end marker */
	USER;		/* meaning is defined by user */


	protected static TokenKind tokenKind[] = {
		NONE, NAME, SYMBOL, NUMBER, DECIMAL, DATETIME, STRING, ANY, 
		STREAM, TERM, END, USER
	};
	
	/** toInt() -- return corresponding integer value */
	public int toInt()
	{
		switch(this) {
		case NONE: 		return 0;
		case NAME:		return 1;
		case SYMBOL:	return 2;
		case NUMBER:	return 3;
		case DECIMAL:	return 4;
		case DATETIME:	return 5;
		case STRING:	return 6;
		case ANY:		return 7;
		case STREAM:	return 8;
		case TERM:		return 9;
		case END:		return 10;
		case USER:		return 11;
		}
		return -1;
	}
	
	/** toString() -- return corresponding string representation */
	public String toString()
	{
		switch(this) {
		case NONE: 		return "NIL";
		case NAME:		return "NAME";
		case SYMBOL:	return "SYMBOL";
		case NUMBER:	return "NUMBER";
		case DECIMAL:	return "DECIMAL";
		case DATETIME:	return "DATETIME";
		case STRING:	return "STRING";
		case ANY:		return "ANY";
		case STREAM:	return "STREAM";
		case TERM:		return "TERM";
		case END:		return "END";
		case USER:		return "USER";
		}
		return "?";
	}
	
	/** toTokenKind
	 * converts integer to TokenKind value
	 * @param n = the integer value to be converted
	 * @return the corresponding instance of "Token Kind"
	 */
	public static TokenKind toTokenKind(int n) 
	{
		if (n < 0 || n > USER.toInt()) return NONE;
		return tokenKind[n];
	}
	
}//TokenKind
