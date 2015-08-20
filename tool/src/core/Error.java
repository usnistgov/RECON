/* Error.java
 * Manages error objects for RECON
 * 
 * Because there are multiple tentative lexical term streams,
 * errors for any given term stream are queued, rather than printed,
 * in the hope that an alternative term stream will be parseable.
 * If some parse succeeds, it releases all the queued errors silently,
 * via releaseErrors.
 * When all stream alternatives have failed, printErrors is called
 * to dump all of the queued errors to the Errorlog stream. 
 * 
 * Because Error objects are used only once, the class has a freelist 
 * and recycles released Error objects (even though the strings survive)
 * 
 * @author Ed Barkmeyer, NIST, Jan 2011 (from an earlier C program)
 * 	revised Sep 2011 v0.27, to attach the term stream context to each Error
 * 							and provide external access to the queue
 */
package core;

import java.io.*;

/** Error (class)
 * utility to manage a queue of error messages
 * and print them if wanted
 * 
 * @author Ed Barkmeyer, NIST, October, 2010
 *
 */
public class Error {
	
	/* static members */
	private static Error qhead;
	private static Error qtail;
	private static Error freelist = null;
	
	/* members */
	public Error next;	/* next message in the queue */
	public String text;	/* text of this message */
	public Object context;	/* other information */
	
	/** constructor
	 * records the error message
	 * @param text = the text of the error message
	 */
	private Error(String text)
	{
		text = null;
		next = null;
	}

	/** init()
	 * queue initializer
	 */
	public static void init()
	{
		qhead = null;
		qtail = null;
	}

	/** queue(text)
	 * Add a parsing error message to the list of messages
	 * These will print only if all parse attempts fail
	 * @param text = the insertion text of the error message
	 */
	public static void queue(String text)
	{
		Error error;

		/* get an error object */
		if (freelist == null) {
			error = new Error(text);
		} else {
			error = freelist;
			freelist = freelist.next;
		}

		/* insert the text and context information */
		error.text = text;
		error.context = ParseManager.getTokenList();
		
		/* put it on the tail of the queue */
		error.next = null;
		if (qhead == null)	qhead = error;
		else				qtail.next = error;
		qtail = error;
	}

	/** getFirst()
	 * @return the first element in the queue
	 */
	public static Error getFirst()
	{
		return qhead;
	}
	
	/** releaseErrors()
	 * Release all the errors in the queue
	 * (put the objects back on the freelist)
	 */
	public static void releaseErrors()
	{
		if (qhead == null) return;
		for (Error error = qhead; error != null; error = error.next) {
			error.text = null;
			error.context = null;
		}
		qtail.next = freelist;
		freelist = qhead;
	}

	/** printErrors (file)
	 * print all errors that have been queued
	 */
	public static void printErrors(PrintStream err)
	{
		Error error;
		Token[] tokenlist = null;
		
		/* print the line ? */

		/* print the queued errors */
		for (error = qhead; error != null; error = error.next) {
			if (error.context != tokenlist) {
				tokenlist = (Token[])error.context;
				printContext(tokenlist, err);
			}
			err.println("*** " + error.text);
		}
		/* now release them all */
		releaseErrors();
	}

	/** printContext(token list, print stream)
	 * print the given token stream as a sequence of marked strings
	 * @param list = the token stream as an array of tokens 
	 */
	private static final char[] termkindletter = 
		{ '?', 'T', 'V', 'P', 'R', 'p', 'E', 'A', 'N' };
	public static void printContext(Token[] list, PrintStream err) 
	{
		int t;
		TermToken tt;

		// print an asterisk for the STREAM token, and skip it */
		err.print("*");	
		for (t = 1; t < list.length; ++t) {
			if (list[t].kind == TokenKind.TERM){
				/* this is a Term token, print the Voc Item Kind */
				tt = (TermToken)list[t];
				err.print(termkindletter[tt.termkind] + "(" 
						+ tt.term.getText() + ")" );
			} else if (list[t].kind == TokenKind.END) {
				err.print(".");
			} else if (list[t].word == null) {
				err.print("?");
			} else {
				/* this is a Word token, print K for keyword, W for other */
				err.print((list[t].word.isKeyword() ? "K(" : "W(")
						+ list[t].word.external() + ")" );
			}
		}
		err.println();
	}

}
