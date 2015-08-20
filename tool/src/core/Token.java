/* Token stream structure
 * The stream itself is the 0th Token, representing a queue
 * Each token in the stream has next and prev(ious) links
 * a type/kind, and the Word that is the actual token
 * 
 * @author Ed Barkmeyer, NIST, Nov 2010
 */
package core;

import NBVR.Vocabulary.Word;
import NBVR.Vocabulary.KeywordKind;

public class Token {

	/* the links */
	protected Token next;
	protected Token prev;
	
	/* the content */
	public Word word;		/* the Word that is the token */
	public TokenKind kind;	/* the nature of the Word */

	/* the first/next TermToken for a recognized Term that begins with this Word */
	public TermToken altTerm; 

	/**
	 * the constructor
	 */
	public Token ()
	{
		next = null;
		prev = null;
		word = null;
		kind = TokenKind.NONE;
		altTerm = null;
	}
	
	/** stream
	 * create the base token for the stream
	 * the next link from the Stream is the first Token in the queue
	 * the prev link from the Stream is the last Token in the queue
	 * @return the new stream token
	 */
	static public Token createStream()
	{
		Token stream = new Token();
		stream.kind = TokenKind.STREAM;
		return stream;
	}
	
	/** add
	 * the constructor that adds to the queue
	 */
	public Token add()
	{
		Token newtoken = new Token();
	
		/* is this the base token for the stream? */ 
		if (this.kind == TokenKind.STREAM) {
			/* yes, add the new token at the end, i.e., before it */
			if (this.prev != null) { /* the stream is not empty */
				this.prev.next = newtoken;
			} else { 				/* the stream is empty */
				this.next = newtoken;
			}
			newtoken.prev = this.prev;
			newtoken.next = null;
			this.prev = newtoken;
		} else {
			/* no, add the new token after this */
			if (this.next != null) this.next.prev = newtoken;
			newtoken.next = this.next;
			this.next = newtoken;
			newtoken.prev = this;
		}
		return newtoken;
	}
	
	/** addTerm
	 * add a Term Token to the list of alternates for this Word
	 * @param tt the TermToken to be added
	 */
	public void addTerm(TermToken tt)
	{
		tt.altTerm = this.altTerm;
		this.altTerm = tt;
		tt.base = this;		/* the base of this Term is this Word Token */
		tt.prev = this.prev;/* its previous Token is the one that precedes this */
	}

	/** hasNext
	 * @return true if there is a next Token, else false
	 */
	public boolean hasNext()
	{
		return (next != null);
	}

	/** next
	 * @return the next Token in the list, or null if none
	 */
	public Token next()
	{
		return next;
	}

	/** hasPrev
	 * @return true if there is a previous Token, else false
	 */
	public boolean hasPrev()
	{
		return (prev != null);
	}

	/** prev
	 * @return the previous Token in the list, or null if none
	 */
	public Token prev()
	{
		return prev;
	}

	/** getWord
	 * @return the Word at this point in the list
	 */
	public Word getWord()
	{
		return word;
	}

	/** setWord
	 * sets the content of the Token to the Word provided
	 * @param w = the content Word
	 */
	public void setWord(Word w)
	{
		word = w;
	}

	/** isKeyword (kind)
	 * safe test for the Word of the token matching the keyword
	 * @param k = the keyword kind to be tested for
	 * @return true if the Token is the given Keyword, else false
	 */
	public boolean isKeyword(KeywordKind k)
	{
		if (word == null) return false;
		return word.isKeyword(k);
	}

	/** isAnyKeyword ()
	 * safe test for the Word of the token being a keyword
	 * @return true if the Token is a Keyword, else false
	 */
	public boolean isAnyKeyword()
	{
		if (word == null) return false;
		return word.isKeyword();
	}

	/** isArticle
	 * safe test for the Word of the token being an article
	 * @return true if the Token is an article, else false
	 */
	public boolean isArticle()
	{
		if (word == null) return false;
		return word.isArticle();
	}

	/** getKind
	 * @return the TokenKind of this Token
	 */
	public TokenKind getKind()
	{
		return kind;
	}
	
	/** setKind
	 * sets the kind of the Token to the TokenKind provided
	 * @param k = the TokenKind of this token
	 */
	public void setKind(TokenKind k)
	{
		kind = k;
	}
	
	/** hasAlt()
	 * @return true if the Token has a (next) alternate Term, else false
	 */
	public boolean hasAlt()
	{
		return (altTerm != null);
	}

	/** getAlt()
	 * @return the first/next alternate Term, or null
	 */
	public TermToken getAlt()
	{
		return altTerm;
	}
	
	/** isSymbol(symbol)
	 * @param symbol is the character to be matched
	 * @return true if the current token is a Symbol matching the given character
	 */
	public boolean isSymbol(char s)
	{
		if (kind != TokenKind.SYMBOL) return false;
		return (word.getBase().getText().charAt(0) == s);
	}
	
	/** getValue
	 * returns the value of a number token as an integer
	 */
	public int getValue()
	{
		int result = 0;
		int d;

		if (word == null) return -1;
		String digits = word.getBase().getText();
		for (d = 0; d < digits.length(); ++d) {
			if (! Character.isDigit(digits.charAt(d))) return -1;
			result = 10 * result + (digits.charAt(d) - '0');
		}
		return result;
	}
	
	/** toString()
	 * convert the Token to a String for messages
	 * @return the string that is the base of the Token word
	 */
	public String toString()
	{
		if (word == null) return "";
		return word.getBase().getText();
	}
}
