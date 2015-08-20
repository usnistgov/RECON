/* TermToken.java
 * special case Tokens for recognized Vocabulary Terms
 * these contain links to Terms and to alternatives
 */
package core;

import NBVR.Vocabulary.Term;

public class TermToken extends Token {
	
	/* Every TermToken has TokenKind Term */
	public Term term;		/* the term this Token matches (in lieu of 1..* Word tokens) */
	public int termkind;	/* the kind of thing the referent of the Term is */
	public Object referent;	/* the thing the Term refers to */
	public Token base;		/* the first Word Token of the matched term */
	public Token endtoken;	/* the last Word Token of the matched term */
	public Object parse;	/* the thing that is the interpretation of the Token */
	
	/* values of termkind */
	public static final int NOUN = 1;
	public static final int VERB = 2;
	public static final int PROPERTY = 3;
	public static final int ROLE = 4;
	public static final int PARTICLE = 5;
	public static final int ELEMENT = 6;
	public static final int ADJECTIVE = 7;
	public static final int PROPERNAME = 8;

	
	/* Note: 
	 *  the .next pointer leads to the first Word after the recognized term
	 *  the .altTerm pointer leads to the next TermToken beginning with that Word
	 */

	 /** constructor
	  * 
	  * @param term = the recognized term
	  * @param tkind = the nature of the referent of the term
	  * @param referent = the thing the term refers to (item, role, form element)
	  * @param base = the Token for the Word that begins the term
	  * @param next = the next Word Token after the term
	  */
	public TermToken(Term term, int tkind, Object referent, Token base, Token last)
	{
		super();
		altTerm = null;
		this.base = base;
		this.term = term;
		this.kind = TokenKind.TERM;
		this.termkind = tkind;
		this.referent = referent;
		this.endtoken = last;
		this.parse = null;
		this.next = last.next;
	}
	
	/** termsize()
	 * @return the number of words in the matched term
	 */
	public int termsize()
	{
		if (term == null) return 0;
		return term.getWords().size();
	}
	
	/** toString()
	 * convert the Term to a String for messages, overrides Token.toString()
	 * @return the string that is the base of the Token word
	 */
	public String toString()
	{
		return term.toString();
	}

}
