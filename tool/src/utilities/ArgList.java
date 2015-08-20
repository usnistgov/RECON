/* ArgList.java
 *  routines to process invocation options and arguments
 */
package utilities;

public class ArgList {
	
	/* caller arguments */
	private String args[];
	private int argno;		/* current argument */
	private int argp;		/* current argument character */
	
	/** caller option list  
	 *  general form: ( <letter> [ "*" ] )*
	 *  each <letter> identifies an option designated by that letter
	 *  when followed by asterisk, the option has an associated value
	 */
	private String options;
	
	/* last option found */
	private int opt;	/* the option letter */
	private String operand; /* the value, if any */
	
	/** constructor
	 *  @param cargs = the argument vector passed to main
	 *  @param coptions = the program option list in the form above
	 */
	public ArgList(String cargs[], String coptions)
	{
		args = cargs;
		options = coptions;
		argno = 0;
		argp = 0;
		opt = 0;
		operand = null;
	}
	
	/** getOption
	 *  returns the next option letter found in the argument list
	 *  -1 if the next option letter is not in the given list
	 *  0 if the next argument does not begin with a minus/hyphen
	 *    that is, no more options
	 * @return option letter
	 */
	public int getOption()
	{
		int optype;
		
		/* no current option (yet) */
		opt = 0;
		operand = null;
		
		/* if no more arguments, fail */
		if (args.length <= argno) return 0;
		
		/* if we are at the end of the current argument,
		 * go on to the next, if there is one, else fail
		 */
		if (args[argno].length() <= argp) {
			if (args.length < ++argno) return 0;
			argp = 0;
		}
		
		/* if we are starting a new argument, check for option */
		if (argp == 0) {
			/* if leading hyphen/minus, skip it
			 * if no leading hyphen/minus, not an option
			 */
			if (args[argno].charAt(0) == '-') 
				++argp;
			else
				return 0;
		}
		
		/* get the option letter */
		opt = args[argno].charAt(argp++);
		optype = findopt(opt);
		if (optype < 0) return -1;		/* no such option */
		if (optype == 0) return opt;	/* simple option */
		
		/* option with value, collect value */
		if (argp < args[argno].length()) {
			/* value is the rest of this argument */
			operand = args[argno].substring(argp);
		} else if (++argno < args.length) {
			/* value is the next argument */
			operand = args[argno];
		} else {
			/* value should be next argument, but there isn't one */
			operand = "";
		}
		/* in any case, move on to the next argument */
		++argno;
		argp = 0;
		return opt;
	}
	
	/** getValue
	 *  return the value of the current option
	 */
	public String getValue()
	{
		/* if there is a current option, return the current operand */
		if (opt != 0) return operand;
		
		/* otherwise, return the next argument, if any */
		if (argno < args.length)
			return args[argno++];
		else
			return null;
	}
	
	/** getArgNumber
	 *  return the index of the current/next argument
	 * @return
	 */
	public int getArgNumber()
	{
		return argno;
	}
	
	/** getArgument
	 *  return the value of the next argument
	 */
	public String getArgument()
	{
		return getValue();
	}
	
	/** argsRemaining
	 *  return the number of arguments not yet examined
	 *  including the argument that is the current (next) position
	 */
	public int argsRemaining()
	{
		return (args.length - argno);
	}
	
	/** getLetter
	 *  returns the last option letter, even if it was invalid
	 */
	public char getLetter()
	{
		return (char)opt;
	}
	
	/** findopt
	 *  routine to find an option in the options list
	 *  returns -1 if not found
	 *          0  if found and not followed by *
	 *          1  if found and followed by *
	 */
	private int findopt(int opt)
	{
		int ol;
		
		for (ol = 0; ol < options.length(); ++ol) {
			if (options.charAt(ol) == opt) {
				++ol;
				if (ol < options.length() && options.charAt(ol) == '*')
					return 1;
				else
					return 0;
			}
		}
		return -1;
	}

}
