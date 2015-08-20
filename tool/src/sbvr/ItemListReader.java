/* ItemListReader.java
 * A fake Reader that returns the content of an SBVR item list as a Stream of characters
 */
package sbvr;

import java.io.IOException;

import java.io.Reader;

import xmlParse.*;

public class ItemListReader extends Reader {
	
	protected XmlObject list;
	protected String itemstring;
	protected int position;	// the current character position in the Item string
	protected int remchars;	// number of characters left in the current string
	protected boolean eos;	// true if end of stream has been reported

	/** constructor
	 *  creates a pseudo-file of lines from an array of strings
	 * @param source = the array of strings
	 */
	public ItemListReader (XmlObject itemlist) 
	{
		list = itemlist;
		itemstring = getItemString(list);
		position = 0;
		remchars = itemstring.length();
		eos = false;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

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
		if (list == null) throw new IOException("Item List was closed");

		/* if the buffer is too small for the count,
		 * stop at end of buffer */
		if (offset + count > buf.length) count = buf.length - offset;

		/* if the request is for more characters than are left in the current string,
		 * this read will be short, and include a newline */
		boolean eol = (count > remchars);
		if (eol) count = remchars;
		
		/* now copy characters to the buffer */
		for (int c = 0; c < count; ++c) {
			buf[offset++] = itemstring.charAt(position++);
			--remchars;
		};

		/* if we finished the current item string */
		if (eol) {
			/* add a newline to the buffer */
			buf[offset] = '\n';
			++count;
			
			/* move on to the next item */
			list = list.lchild;
			if (list == null) {
				/* no more items -- end of file */
				eos = true;
			} else {
				itemstring = getItemString(list);
				position = 0;
				remchars = itemstring.length();
			}
		}
		return count;	// characters actually copied
	}
	
	protected String getItemString(XmlObject item)
	{
		XmlIdEntry xid = XmlIdEntry.find_entry(item.find_attribute("expression").value);
		return (String)xid.item;
	}

}
