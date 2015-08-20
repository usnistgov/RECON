/* TermUse.java
 * a data structure to capture references to terms
 * instances of TermUse are attached to VocabularyItems
 * 
 * VocabularyItem only supports getLastUse() and setLastUse(TermUse)
 * the actual list management is done by static methods on this class
 * 
 * It is controlled by TermUse.create(), which manages a free list
 * the constructor itself is not accessible
 * 
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.VocabularyItem;

public class TermUse {
	
	/* the free list of TermUse objects, allocated by TermUse.create() */
	private static TermUse freelist = null;
	
	/* the list of active VocabularyItems that have TermUses */
	private static TermUse termlist = null;

	/* the data elements of the TermUse object */
	protected TermUse prevUse;	// previous use of the same Term
	protected TermUse nextTerm;	// first use for the next Term
	protected VocabularyItem thisTerm;	// the Vocabulary Item that is the term
	protected Object thisUse;	// the thing that actually uses the term

	/** the (empty) constructor
	 * The constructor itself is not accessible
	 * construction is controlled by TermUse.create() and release()
	 */
	private TermUse()
	{
	}

	/** create()
	 * returns a new TermUse object or recycles an old one that has been released
	 * 
	 * it puts the TermUse on the list for the VocabularyItem (lastUse)
	 * and puts the VocabularyItem on the local list of active items (termlist)
	 * 
	 * @return a clean TermUse object
	 */
	public static TermUse create(VocabularyItem term, Object usage)
	{
		TermUse tuse;
		
		if (freelist != null) {
			tuse = freelist;
			freelist = freelist.prevUse;
		} else {
			tuse = new TermUse();
		}
		tuse.thisTerm = term;
		tuse.thisUse = usage;
		
		/* add the first usage for a term to the term list */
		if (term.getLastUse() == null) {
			tuse.nextTerm = termlist;
			termlist = tuse;
		} else {
			tuse.nextTerm = null;
		}
		
		/* add the TermUse to the vocabulary item */
		tuse.prevUse = term.getLastUse();
		term.setLastUse(tuse);
		
		return tuse;		
	}

	/** releaseAll()
	 * recycle every TermUse object that is on the term list
	 * and all of the additional uses of each such term
	 */
	public static void releaseAll()
	{
		TermUse next, use, previous;
		
		while (termlist != null) {
			next = termlist.nextTerm;
			/* now release the uses for the term */
			use = termlist.thisTerm.getLastUse();
			termlist.thisTerm.setLastUse(null);
			while (use != null) {
				previous = use.prevUse;
				use.prevUse = freelist;
				freelist = use;
				use = previous;
			}
			termlist = next;
		}
	}

	/** findUse(term, use)
	 * finds the TermUse of the given term whose actual use object is use
	 * @param term = the VocabularyItem whose uses are to be searched
	 * @param use = the target 'use' 
	 * @return the TermUse whose thisUse object is 'use', or null
	 */
	public static TermUse findUse(VocabularyItem term, Object use)
	{
		TermUse tuse = term.getLastUse();
		while (tuse != null) {
			if (tuse.thisUse == use) return tuse;
			tuse = tuse.prevUse;
		}
		return null;
	}

	/* get/set accessors */
	
	public TermUse getPreviousUse()
	{
		return prevUse;
	}
	
	public void setPreviousUse(TermUse tuse)
	{
		prevUse = tuse;
	}
	
	public TermUse getNextTerm()
	{
		return nextTerm;
	}

	public void setUsage(Object usage)
	{
		thisUse = usage;
	}
	
	public Object getUsage()
	{
		return thisUse;
	}

}
