/* XmlIdEntry.java
 * data structure and static routines
 * for managing objects labeled by XML ids
 */
package xmlParse;

public class XmlIdEntry {

	public String id;			/* XML identifier */
	public XmlIdEntry next;	/* next entry in the identifier bucket */
	public Object item;		/* the model entry it refers to */
	public int type;		/* a code for the kind of thing that is identified */
	
	/* the IdEntry class logic never sets 'item' or 'type'
	 * it assumes that the user code manages these
	 */

	/* Static buckets that manage Id lookup
	 * define number of buckets to be a power of 2 */
	private static final int HASH_MASK = 0x1ff;
	private static XmlIdEntry[] idhash;
	
	/* constructor */
	public XmlIdEntry(String myid) {
		id = myid;
		next = null;
		item = null;
		type = 0;
	}

	/* static methods that manage the IdEntry objects */
	
	/* initialization routine */
	public static void initialize()
	{
		int i;
		idhash = new XmlIdEntry[HASH_MASK + 1];
		for (i = 0; i <= HASH_MASK; ++i) idhash[i] = null;
	
	}

	/* find the existing umlElement with the given unique id */
	public static XmlIdEntry find_entry(String id)
	{
		XmlIdEntry entry;
		int hash;
		int c;
		
		/* check for null string */
		if (id == null || id.length() == 0) return null;
		
		/* compute hash */
		hash = 0;
		for (c = 0; c < id.length(); ++c) hash += id.charAt(c);
		hash &= HASH_MASK;
		
		/* look for a match in the bucket */
		for (entry = idhash[hash]; entry != null; entry = entry.next) {
			/* if bucket entry matches, return it */
			if (id.equals(entry.id)) return entry;
		}
		
		/* no match, make a new element */
		entry = new XmlIdEntry(id);
		entry.item = null;
		entry.next = idhash[hash];
		idhash[hash] = entry;
		
		return entry;
	}

}
