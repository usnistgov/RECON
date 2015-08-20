package sbvr;

import NBVR.Vocabulary.*;
import xmlParse.*;
import java.io.*;

import core.Interpreter;
import core.ParseManager;
import core.RECONManager;
import core.TokenIn;
import core.VocKey;
import core.VocLoad;

public class SBVRxml {

	/* the inevitable Factory */
	protected static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;

	/* XML tags for SBVR concepts we (may) use
	 * there are several others that are all about vocabularies and namespaces
	 */
	public static final String[] sbvrtags = {
		"sbvr:text", 			// a string value
		"sbvr:positiveInteger", // an integer value
		"sbvr:term", 			// the text term for an 'object type'
		"sbvr:name", 			// the text term for an 'individual concept', a proper name
		"sbvr:verbSymbol",		// the text term for a verb form, with ... for roles
		"sbvr:placeholder",		// the text term for a verb role
		"sbvr:generalConcept",	// a type concept
		"sbvr:individualNounConcept", // a thing
		"sbvr:verbConcept",		// a verb concept
		"sbvr:verbConceptRole", 	// a verb role
		"sbvr:sententialForm", 	// a syntax form for a verb concept with plain text placeholders
		"sbvr:verbConceptRoleIsInVerbConcept", 	// role to verb link
		"sbvr:roleRangesOverGeneralConcept", // role to type link
		"sbvr:placeholderUsesDesignation", 	// ???
		"sbvr:placeholderIsInVerbConceptWording", 	// placeholder to syntax form link
		"sbvr:verbConceptWordingDemonstratesDesignation", //syntax form to factSymbol link
		"sbvr:intensionalDefinition", 		//formal formulation of fact type, object type
		"sbvr:extensionalDefinition", 		// formulation as class or class ...
		"sbvr:definiteDescription",			// formal formulation of individual concept
		"sbvr:description",					// the text for an informal definition
		"sbvr:descriptionPortraysMeaning", 	// description to concept link
		"sbvr:concept1SpecializesConcept2", // subtype relationship
		"sbvr:necessity",			// axiom
		"sbvr:possibility",			// axiom of possibility
		"sbvr:note"					// 'note', but some are axioms
	};
	
	/* internal names for the tags in the above table */
	public static final int SBVR_JUNK = 0;
	public static final int SBVR_TEXT = 1;
	public static final int SBVR_INT =  2;
	public static final int SBVR_TERM = 3;
	public static final int SBVR_NAME = 4;
	public static final int SBVR_FSYM = 5;
	public static final int SBVR_PH =   6;
	public static final int SBVR_TYPE = 7;
	public static final int SBVR_THING = 8;
	public static final int SBVR_VERB = 9;
	public static final int SBVR_ROLE = 10;
	public static final int SBVR_FORM = 11;
	public static final int SBVR_ROLE_VERB = 12;
	public static final int SBVR_ROLE_TYPE = 13;
	public static final int SBVR_PH_TERM = 14;
	public static final int SBVR_FORM_PH = 15;
	public static final int SBVR_FORM_FSYM = 16;
	public static final int SBVR_IDEF = 17;
	public static final int SBVR_EDEF = 18;
	public static final int SBVR_DEFD = 19;
	public static final int SBVR_DESC = 20;
	public static final int SBVR_DESC_MEAN = 21;
	public static final int SBVR_SUBTYPE = 22;
	public static final int SBVR_NEC = 23;
	public static final int SBVR_POSS = 24;
	public static final int SBVR_NOTE = 25;

	/* buffer for converting SBVR text */
	private static final StringBuffer editbuf = new StringBuffer(VocLoad.VOC_MAXLINE);

	private static final StringBuffer termbuf = new StringBuffer(128);
	private static PrintStream errlog;
	private static Terminology theVoc;
	private static Dictionary theDic;

	/* the list of XML elements that are factSymbols */
	private static XmlObject symlist;
	/* the list of XML elements that are axioms */
	private static XmlObject axlist;
	/* the list of XML elements that are definitions */
	private static XmlObject deflist;
	
	/* main process */
	public static void loadSBVR(Terminology voc, String filename, PrintWriter IKLfile, PrintStream log)
	{
		XmlObject obj;
		XmlIdEntry xid;
		VocabularyItem item;
		Formulation def;
		SyntaxForm sform;
		String id;
		String s;
		int tag;
		
		/* initialize referents */
		theVoc = voc;
		theDic = RECONManager.theDictionary;
		errlog = log;

		/* create and load the XML document object */
		XmlDocument doc = new XmlDocument(filename);
		XmlObject root = doc.parse();
		
		if (root == null) {
			errlog.println("*** File: " + filename + " is not a valid XML file");
			return;
		}

		/* skip processing instructions, comments, etc. */
		while (root.type != XmlType.XML_ELEMENT) {
			root = root.next;
			if (root == null) {
				errlog.println("*** File: "  + filename + " has no content");
				return;
			}
		}

		/* look for an XMI file */
		if (! root.name.equals("xmi:XMI")) {
			errlog.println("*** File: " + filename + " is not an XMI file");
			return;
		}

		// process the SBVR elements
		// none of them have a content, they only have attributes
		
		// first pass: find the identified objects
		// only link the ones that can be referred to
		XmlIdEntry.initialize();
		
		/* create the process list for axioms and definitions */
		axlist = null;
		
		/* now process the XML objects */
		for (obj = root.fchild; obj != null; obj = obj.next) {
			id = find_XMI_id(obj);
			tag = (id == null ? SBVR_JUNK : lookup_tag(obj.name));
			switch (tag) {
			case SBVR_JUNK:	/* unidentified, or not something we recognize */
				break;
			case SBVR_TEXT:
			case SBVR_INT:  
				/* create an Id entry that points directly to the String value */
				xid = XmlIdEntry.find_entry(id);
				xid.type = tag;
				xid.item = obj.find_attribute("value").value;
				break;
			case SBVR_TERM:
			case SBVR_NAME:
			case SBVR_FSYM:
			case SBVR_PH:
				/* create an entry that refers back to the XML object */
				xid = XmlIdEntry.find_entry(id);
				xid.type = 0;	// this is a pointer to an incomplete element
				xid.item = obj;
				break;
			case SBVR_TYPE:
				/* an 'objectType' is an NDVR VocNoun, the entry points to the VocNoun */
				xid = XmlIdEntry.find_entry(id);
				xid.type = SBVR_TYPE;
				xid.item = theVocFactory.createVocNoun();
				theVoc.addItem((VocNoun)xid.item);
				break;
			case SBVR_THING: 
				/* an 'individual concept' is an NDVR VocName, the entry points to the VocName */
				xid = XmlIdEntry.find_entry(id);
				xid.type = SBVR_THING;
				xid.item = theVocFactory.createVocName();
				theVoc.addItem((VocName)xid.item);
				break;
			case SBVR_VERB:
				/* a 'fact type' is an NDVR VocVerb, the entry points to the VocVerb */
				xid = XmlIdEntry.find_entry(id);
				xid.type = SBVR_VERB;
				xid.item = theVocFactory.createVocVerb();
				theVoc.addItem((VocVerb)xid.item);
				break;
			case SBVR_ROLE:
				/* a 'fact type role' is an NDVR VerbRole, the entry points to the VerbRole */
				xid = XmlIdEntry.find_entry(id);
				xid.type = SBVR_ROLE;
				xid.item = theVocFactory.createVerbRole();
				break;
			case SBVR_FORM:
				/* create an entry that refers back to the XML object */
				xid = XmlIdEntry.find_entry(id);
				xid.type = 0;	// incomplete element
				xid.item = obj;
				break;
			case SBVR_DEFD:
				/* a definite description binds a Formulation to an individual concept (VocName) */
			case SBVR_EDEF: 
				/* an extensional definition binds an 'x or y' Formulation to a concept (VocItem) */
			case SBVR_IDEF: 
				/* an intensional definition binds a Formulation to a concept (VocItem) */
				/* just put it on the definition list, process it when the rest is in place */
				obj.lchild = deflist;
				deflist = obj;
				break;
			case SBVR_DESC: 
				/* Description is a label for a text 
				 * we construct an indirect pointer to the text (which may not exist yet) */
				xid = XmlIdEntry.find_entry(id);
				xid.type = SBVR_DESC;
				xid.item = XmlIdEntry.find_entry(obj.find_attribute("expression").value);
				break;
			case SBVR_NEC: 
			case SBVR_POSS:
				/* Necessity and Possibility are labels for an axiom text 
				 * just put the XML element on the list of axioms */
				obj.lchild = axlist;
				axlist = obj;
				break;
			default:
				/* not something we are ready to work on */
				break;
			}
		}
		
		// second pass: process the links between objects
		// the IdEntries now point to vocabulary objects and text strings
		/* initialize the list of 3rd pass entries */
		symlist = null;
		for (obj = root.fchild; obj != null; obj = obj.next) {
			switch (lookup_tag(obj.name)) {
			case SBVR_JUNK:	/* not something we recognize */
			case SBVR_TEXT:	/* already done -- the string is n the Id Entry */
			case SBVR_INT:
				break;
			case SBVR_TERM:
				/* a term binds an expression (signifier) to a general concept,
				 * i.e., a Term to a VocNoun */
			case SBVR_NAME:
				/* a 'name' binds an expression (signifier) to an individual concept,
				 * i.e., a Term to a VocName */
				xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value);
				item = (VocabularyItem)xid.item;
				xid = XmlIdEntry.find_entry(obj.find_attribute("signifier").value);
				item.addTerm(make_term((String)xid.item));
				break;
			case SBVR_FSYM: 
				/* a 'fact symbol' binds a verb to a term for it */
				// in the Chapin file, the 'term' is a syntax skeleton
				/* process this element if it hasn't been processed */
				xid = XmlIdEntry.find_entry(find_XMI_id(obj));
				if (xid.type == 0) 	process_factSymbol(obj);
				break;
			case SBVR_PH:
				/* a 'placeholder' binds a verb role to a local text string 
				 * in v1.2, the placeholder has a 'position', but it is meaningless */
				xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value);
				VerbRole vrole = (VerbRole)xid.item;
				if (vrole.getTerm() == null) {
					/* this is the first/only use of the placeholder term */
					xid = XmlIdEntry.find_entry(obj.find_attribute("expression").value);
					vrole.setTerm(make_term((String)xid.item));
					vrole.getTerm().setRole(vrole);
					/* set the role term context to the verb, if we now know both */
					if (vrole.getVerb() != null) vrole.getTerm().setContext(vrole.getVerb());
				}
				break;
			case SBVR_FORM: 
				/* a 'fact type form' (sentential form) is an NDVR SyntaxForm
				 * the fact type form links a text expression of the SyntaxForm to the VocVerb */
				/* all we have at this point is the syntax String, which we can't process until we 
				 * have processed the fact symbol and the placeholders, and the form-symbol link
				 * So, we process the entry when we see the link
				 */
				/* we would make a SyntaxForm here and stash the syntax String in it, 
				 * but in the Chapin file, the fact symbol does that */
				break;
			case SBVR_ROLE_VERB:
				/* factTypeRoleIsInFactType binds a VerbRole to a VocVerb */
				xid = XmlIdEntry.find_entry(obj.find_attribute("verbConceptRole").value);
				vrole = (VerbRole)xid.item;
				xid = XmlIdEntry.find_entry(obj.find_attribute("verbConcept").value);
				((VocVerb)xid.item).getRoles().add(vrole);
				/* set the role term context to the verb, if we now know both */
				if (vrole.getTerm() != null) vrole.getTerm().setContext(vrole.getVerb());
				break;
			case SBVR_ROLE_TYPE:
				/* roleRangesOverType binds a VerbRole to its range VocNoun type */
				xid = XmlIdEntry.find_entry(obj.find_attribute("role").value);
				vrole = (VerbRole)xid.item;
				xid = XmlIdEntry.find_entry(obj.find_attribute("generalConcept").value);
				if (((VocabularyItem)xid.item).getKind() == VocItemKind.NOUN_CONCEPT)
					vrole.setRange((VocNoun)xid.item);
				else
					errlog.println("*** Role '" + vrole.getTerm().getText() + "' ranges over '" 
							+ ((VocabularyItem)xid.item).getTerms().get(0).getText() 
							+ "' -- Not a general concept" );
				break;
			case SBVR_PH_TERM: 
				/* placeholder uses designation is a broken model of role ranges over type */
				break;
			case SBVR_FORM_PH:
				/* factTypeFormHasPlaceholder links the RoleElement (placeholder) to the SyntaxForm

				xid = XmlIdEntry.find_entry(obj.find_attribute("factTypeForm").value);
				sform = (SyntaxForm)xid.item;
				xid = XmlIdEntry.find_entry(obj.find_attribute("placeholder").value); //the VocVerb
				sform.addElement((RoleElement)xid.item);
				*/
				break;
			case SBVR_FORM_FSYM:
				/* factTypeFormDemonstratesDesignation is the ItemElement in the SyntaxForm */
				/* first, process the FactSymbol entry -- it generates a skeleton SyntaxForm
				 * and places it in the IdEntry
				 */
				xid = XmlIdEntry.find_entry(obj.find_attribute("designation").value);
				if (xid.type == 0) process_factSymbol((XmlObject)xid.item);
				sform = (SyntaxForm)xid.item;
				/* get the syntax string via the sententialForm element */
				xid = XmlIdEntry.find_entry(obj.find_attribute("verbConceptWording").value);
				xid = XmlIdEntry.find_entry(((XmlObject)xid.item).find_attribute("expression").value);
				sform.setText((String)xid.item);
				break;
			case SBVR_DEFD:
				/* do nothing, wait for deflist processing */
				break;
			case SBVR_EDEF: 
				/* 'extensional' definition: prefix expression with "either " */
				xid = XmlIdEntry.find_entry(obj.find_attribute("expression").value);
				xid.item = convert_extensional_def((String)xid.item);
				break;
			case SBVR_IDEF: 
				/* do nothing, wait for deflist processing */
				break;
			case SBVR_DESC:
				/* pass 1 created an entry with an indirect pointer */
				break;
			case SBVR_DESC_MEAN: 
				/* description portrays meaning links a Description (which is a role of Expression)
				 * to a concept.  This is VocItem has informal definition */
				/* the item for the description object is the Expression IdEntry */
				xid = XmlIdEntry.find_entry(obj.find_attribute("description").value);
				xid = (XmlIdEntry)xid.item;  // the expression entry
				def = theVocFactory.createFormulation("English", (String)xid.item, null);
				xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value);
				def.setConcept((VocabularyItem)xid.item);
				break;
			case SBVR_SUBTYPE: 
				/* concept specializes concept is VocItem subtypes base */
				xid = XmlIdEntry.find_entry(obj.find_attribute("concept1").value);
				item = (VocabularyItem)xid.item;
				xid = XmlIdEntry.find_entry(obj.find_attribute("concept2").value);
				item.getBase().add((VocabularyItem)xid.item);
				break;
			case SBVR_NEC: 
			case SBVR_POSS: 
				/* do nothing, and wait for axlist processing */
				break;
				
			default:
				/* not something we care about (and there are many) */
				break;
			}
		}
		
		// now the 3rd pass: decode the sentential forms of verbs:
		// link RoleElements to VerbRoles by placeholder string
		for (obj = symlist; obj != null; obj = obj.lchild) {
			xid = XmlIdEntry.find_entry(find_XMI_id(obj));
			sform = (SyntaxForm)xid.item;
			if (process_syntax_text(sform)) {
				/* create the passive form, if any */
				create_passive_form(sform);
				/* test for property ('has') verbs */
				process_property_verb(sform);
			} else {
				/* broken syntax form */
				// TODO: disable the syntax form
				// via the EMF ownership stuff, this should delete it from verb.forms
				((SyntaxForm)xid.item).setVerb(null);
			}
		}
		
		// finally, process the definitions and axioms

		// first, create the tokenizer for the axiom strings
		TokenIn axfile = new TokenIn();
		char[] axstring = new char[VocLoad.VOC_MAXLINE];
		
		// process the axiom list
		for (obj = axlist; obj != null; obj = obj.lchild){
			xid = XmlIdEntry.find_entry(obj.find_attribute("expression").value);
			s = (String)xid.item;
			s.getChars(0, s.length(), axstring, 0);
			axstring[s.length()] = '\n';	// the parser wants a terminal eol
			axfile.setLine(axstring, s.length() + 1);
			def = ParseManager.parseSentence(axfile, null);
			if (def != null && RECONManager.genlogic) {
				Interpreter.makeProposition(def, IKLfile);
			}
		}

		// process the definition list
		for (obj = deflist; obj != null; obj = obj.lchild){
			// use the expression as the content of the 'axiom file'
			xid = XmlIdEntry.find_entry(obj.find_attribute("expression").value);
			s = (String)xid.item;
			s.getChars(0, s.length(), axstring, 0);
			axstring[s.length()] = '\n';	// the parser wants a terminal eol
			axfile.setLine(axstring, s.length() + 1);
			// get the concept and parse the corresponding definition form
			xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value);
			item = (VocabularyItem)xid.item;
			if (item.getKind() == VocItemKind.NOUN_CONCEPT 
					|| item.getKind() == VocItemKind.PROPER_NAME) {
				def = ParseManager.parseNounPhrase(axfile, item);
			} else {
				def = ParseManager.parseSentence(axfile, (VocVerb)item);
			}
			if (def != null) {
				def.setLanguage("SBVR");
				def.setConcept(item);
				item.getFormulations().add(def);
				if (RECONManager.genlogic) {
					if (item.getKind() == VocItemKind.NOUN_CONCEPT)
						def = Interpreter.makeNounFormulation(def, IKLfile);
					else if (item.getKind() == VocItemKind.PROPER_NAME)
						def = Interpreter.makeNameFormulation(def, IKLfile);
					else 
						def = Interpreter.makeVerbFormulation((VocVerb)item, def, IKLfile);
					if (def != null) item.getFormulations().add(def);
				}
			}
		}
	}

	/**
	 * out-of-band processing for the factSymbol element
	 * create the skeleton SyntaxForm from the weird form of the FactSymbol
	 * and link the IdEntry to the SyntaxForm
	 * @param obj = the factSymbol element
	 */
	private static void process_factSymbol(XmlObject obj)
	{
		/* a 'fact symbol' binds a verb to a term for it, 
		 * but the exchange form of the fact symbol is a skeleton of the syntax form */
		XmlIdEntry xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value);
		VocVerb verb = (VocVerb)xid.item;
		xid = XmlIdEntry.find_entry(obj.find_attribute("signifier").value);
		SyntaxForm form = make_skeleton(verb, (String)xid.item);
		verb.getForm().add(form);
		/* now find the IdEntry for the factSymbol, and put the SyntaxForm in the item */
		xid = XmlIdEntry.find_entry(find_XMI_id(obj));
		xid.item = form;
		xid.type = SBVR_FSYM;
		/* finally, put the factSymbol XML object on the pass3 queue
		 * using the otherwise useless lchild link on the factSymbol object */
		obj.lchild = symlist;
		symlist = obj;
	}

	/**
	 * create a RECON SyntaxForm structure from an SBVR fact symbol string
	 * that has ... in place of the role symbols
	 * the verb designation is extracted and linked to the VocVerb
	 * and to the ItemElement in the structure.
	 * all the RoleElements in the structure have no associated VerbRoles
	 * (we need the full form and the placeholders to do that)
	 * 
	 * @param verb = the VocVerb that has the structure
	 * @param symbol = the fact symbol string
	 * @return the derived SyntaxForm 
	 */
	private static SyntaxForm make_skeleton(VocVerb verb, String symbol)
	{
		Term term;
		RoleElement role;
		Particle part;
		if (symbol == null) return null;
		
		SyntaxForm form = theVocFactory.createSyntaxForm(verb);
		int arity = 0;
		
		/* find the role slots and the fixed parts */
		int c;
		int start = 0;
		for (c = 0; c < symbol.length(); ++c) {
			if (symbol.charAt(c) == '.') {
				if (symbol.length() - c >= 2 && symbol.charAt(c+1) == '.' && symbol.charAt(c+2) == '.') {
					/* ... is role symbol, make a role */
					role = theVocFactory.createRoleElement();
					role.setSlot(c);	/* starting character position in the wrong form */
					++arity;
					/* we don't know which VerbRole it refers to */
					if (c == 0) {
						/* subject, just add it to the form */
						role.setKind(FormElementKind.SUBJECT_ROLE);
						form.addElement(role);
					} else if (c > start) {
						/* there is a term between start and c */
						term = make_term(symbol.substring(start, c));
						if (start == 3) {
							/* this is the verb designation */
							verb.addTerm(term);
							/* make an ItemElement for the SyntaxForm */
							ItemElement item = theVocFactory.createItemElement();
							item.setTerm(term);
							item.setKind(FormElementKind.ITEM_ELEMENT);
							form.addElement(item);
							/* now add the (object) role to the form */
							role.setKind(FormElementKind.OBJECT_ROLE);
							form.addElement(role);
						} else {
							/* this is a particle term */
							part = theVocFactory.createParticle();
							part.setTerm(term);
							part.setKind(FormElementKind.PARTICLE_ELEMENT);
							role.setKind(FormElementKind.PARTICLE_ROLE);
							part.setRole(role);
							form.addElement(part);
						}
					} else { /* two consecutive roles? */
						role.setKind(FormElementKind.PARTICLE_ROLE);
						form.addElement(role);
					}
					c += 2;	/* skip the role symbol */
					start = c + 1;
				} else {
					/* the . is just part of the term, do nothing */
				}
			} else {
				/* no dot, do nothing */
			}
		} // end for

		/* check for unary verbs and empty particles */
		if (start < c) {
			term = make_term(symbol.substring(start, c));
			if (start == 3) {
				/* unary verb */
				/* this is the verb designation */
				verb.addTerm(term);
				/* make an ItemElement for the SyntaxForm */
				ItemElement item = theVocFactory.createItemElement();
				item.setTerm(term);
				item.setKind(FormElementKind.ITEM_ELEMENT);
				form.addElement(item);
			} else {
				/* final particle */
				part = theVocFactory.createParticle();
				part.setTerm(term);
				part.setRole(null);
				form.addElement(part);
			}
		}
		verb.setArity(arity);
		return form;
	}
	
	/**
	 * out-of-band processing for the sententialForm element
	 * @param obj = the sententialForm element
	 */
	private static void process_factForm(XmlObject obj)
	{
		/* a 'fact type form' (sentential form) is an NDVR SyntaxForm
		 * the fact type form links a text expression of the SyntaxForm to the VocVerb */
		// first, create a SyntaxForm and attach it to the Verb
		SyntaxForm sf = theVocFactory.createSyntaxForm();
		XmlIdEntry xid = XmlIdEntry.find_entry(obj.find_attribute("meaning").value); //the VocVerb
		sf.setVerb((VocVerb)xid.item);
		// now attach the text of the SyntaxForm to the form
		// to decode it, we need to know all about the placeholders
		xid = XmlIdEntry.find_entry(obj.find_attribute("expression").value); //the Form
		sf.setText((String)xid.item);
		// finally, substitute the SyntaxForm for the XML object in the IdEntry
		xid = XmlIdEntry.find_entry(find_XMI_id(obj));
		xid.item = sf;
	}
	
	/**
	 * fix_verb
	 * routine to repair the skeleton SyntaxForm generated from the Business Semantics fact symbols
	 * because some of them have an extra role indication (...)
	 * @param synform
	 */
	private static void fix_verb(SyntaxForm synform)
	{		
		// look for an excess role in the syntax form
		// the form has one element per role, plus one for the verb term
		int elts = synform.getElements().size() - 1;
		if (elts <= synform.getVerb().getArity()) return;
		
		/* there are more elements than there should be
		 * but it is possible that the last particle has no role */
		FormElement part = synform.getElements().get(elts);
		boolean ok = (part.getKind() == FormElementKind.PARTICLE_ELEMENT);
		if (ok) {
			// there should be no role attached to the extra particle
			ok =(((Particle)part).getRole() != null);
			((Particle)part).setRole(null);
		} else {
			// not OK, there was a gratis ... on the end of the (unary) 'fact symbol'
			synform.getElements().remove(elts);
		}		
		if (! ok) {
			errlog.println("*** fact symbol for verb '" + synform.getText() +
						"' has more roles than the fact type form");
		}
	}
		
	/**
	 * process_syntax_text( form)
	 *  this version is upside down, prompted by the Business Semantics failure to export 
	 *  'fact type form has placeholder' entries
	 *  it finds the placeholders in the fact type form,
	 *   using the screwball fact symbol as a pattern
	 *  and uses them to associate verb roles with the RoleElements in the form
	 * @param synform = the syntax form being processed (which links to the verb)
	 * @return true if the placeholder matchup succeeds, false if not
	 */
	private static boolean process_syntax_text(SyntaxForm synform)
	{
		// set the verb arity to match the number of verb roles
		VocVerb verb = synform.getVerb();
		verb.setArity(verb.getRoles().size());

		// fixup the skeletal syntax form for the broken fact symbols (bug 2) in the Business Semantics file
		fix_verb(synform);
		
		// get the text string version of the form
		String text = synform.getText();
		
		/* get the ItemElement and thus the verb term */
		ItemElement velt = (ItemElement)synform.getElements().get(1);
		String vterm = velt.getTerm().getText();
		
		/* find the verb term in the text, it cannot match the first character */
		int vstart = find_match(text, 1, vterm);
		if (vstart < 0) {
			// did not find the verb term
			errlog.println("*** Verb symbol '" + vterm + "' not found in wording '" + text + "'");
			return false;
		}
		
		/* found the verb term, 
		 * now extract the subject role placeholder and find the corresponding VerbRole */
		String rterm = text.substring(0, vstart - 1);
		VerbRole role = synform.getVerb().find_named_role(rterm);
		if (role == null) {
			/* something is wrong here */
			errlog.println("*** No placeholder for role '" + rterm + "' in verb '" + text + "'");
			print_role_names(synform.getVerb());
			return false;
		}
		RoleElement felt = (RoleElement)synform.getElements().get(0);
		felt.setRole(role);
		felt.setSlot(0);

		// if the verb is unary, we're done
		if (verb.getArity() < 2) return true;
		
		/* process the remaining roles, there are 1 to perhaps 4 */
		Particle part = null;
		String partterm;
		int pstart;
		// eltcount is the number of role elements in the form
		int eltcount = synform.getElements().size() - 1;
		// start with the object role element
		felt = (RoleElement)synform.getElements().get(2);
		/* move to beginning of object role */
		vstart += vterm.length() + 1;
		for (int pelt = 2; pelt <= eltcount; ++pelt) {
			// if there is no RoleElement (the end is an empty particle), just return
			if (felt == null) return true;
			if (pelt == eltcount) {
				// this is the last element
				pstart = text.length() + 1; // allow for the space that is not there
				part = null;
				partterm = "";
			} else {
				// there is a particle after this element
				part = (Particle)synform.getElements().get(pelt + 1); 
				partterm = part.getTerm().getText();
				pstart = find_match(text, vstart, partterm);
				if (pstart < 0) {
					errlog.println("Cannot find particle '" + partterm + "' in verb form '" + text + "'");
					return false;
				}
			}
			rterm = text.substring(vstart, pstart - 1);
			role = synform.getVerb().find_named_role(rterm);
			if (role == null) {
				/* something is wrong here */
				errlog.println("*** No placeholder for role '" + rterm + "' in verb form '" + text + "'");
				print_role_names(synform.getVerb());
				return false;
			}
			// record the VerbRole for the current RoleElement
			felt.setRole(role);
			felt.setSlot(vstart);
			
			// now move to the next slot, if any
			if (part != null) {
				felt = part.getRole();
				vstart = pstart + partterm.length() + 1;
			}
		}
		return true;
	}

	/** process_property_verb(form)
	 * process an SBVR property verb (has-verb) into a RECON property object
	 * 
	 * @param synform = the SyntaxForm for the has-verb
	 */
	private static void process_property_verb(SyntaxForm synform)
	{
		/* don't process verbs that have multiple parts */
		if (synform.getElements().size() > 3) return;
		
		/* get the verb term via the ItemElement in the form */
		ItemElement velt = (ItemElement)synform.getElements().get(1);
		String vterm = velt.getTerm().getText();
		/* we only process SBVR 'has' verbs */
		if (! vterm.equals("has")) return;

		/* for the 'has' verb, make the reverse SyntaxForm:  B is the B of A */
		SyntaxForm newform = theVocFactory.createSyntaxForm(synform.getVerb());
		
		/* subject of newform is the object of the has verb */
		RoleElement relt = theVocFactory.createRoleElement();
		relt.setKind(FormElementKind.SUBJECT_ROLE);
		relt.setRole(((RoleElement)synform.getElements().get(2)).getRole());
		newform.addElement(relt);
		
		/* the verb element is 'is the B' */
		velt = theVocFactory.createItemElement();
		velt.setKind(FormElementKind.ITEM_ELEMENT);
		Term newterm = theVocFactory.createTerm();
		newterm.addWord(VocKey.isVerb);
		newterm.addWord(VocKey.theWord);
		copy_words(relt.getRole().getTerm(), newterm);
		newterm.setText("is the " + relt.getRole().getTerm().getText() + " of");
		VocKey.isVerb.addUsage(newterm);
		newterm.setConcept(synform.getVerb());
		synform.getVerb().addTerm(newterm);
		velt.setTerm(newterm);
		newform.addElement(velt);
		
		/* the link Particle is 'of' for all SBVR properties */
		Particle part = theVocFactory.createParticle();
		part.setKind(FormElementKind.PARTICLE_ELEMENT);
		newterm = theVocFactory.createTerm();
		newterm.addWord(VocKey.ofWord);
		newterm.setText("of");
		VocKey.ofWord.addUsage(newterm);
		part.setTerm(newterm);
		newterm.setParticle(part);
		newform.addElement(part);
		
		/* add the owner role as the particle object */
		relt = theVocFactory.createRoleElement();
		relt.setKind(FormElementKind.PARTICLE_ROLE);
		relt.setRole(((RoleElement)synform.getElements().get(0)).getRole());
		newform.addElement(relt);
		part.setRole(relt);

		/* now disable the original 'has' form */
		synform.getVerb().getTerms().get(0).setConcept(null);
		synform.setVerb(null);
		
		/* now make the property object from the revised verb form */
		VocProperty property = VocLoad.makeProperty(newform, null, errlog);
		theVoc.addItem(property);
	}

	/** create_passive_form
	 * creates the passive form of a simple (one word) active verb
	 * that is: for (A) verbs (B), it creates (B) is verbed () by (A)
	 * @param synform = the primary syntax form for the verb
	 */
	private static void create_passive_form(SyntaxForm synform)
	{
		/* the form must have exactly three elements:  subject verb object */
		if (synform.getElements().size() != 3) return;
		/* check for a direct object */
		if (synform.getElements().get(2).getKind() != FormElementKind.OBJECT_ROLE) return;
		
		/* get the verb term via the ItemElement in the form */
		ItemElement velt = (ItemElement)synform.getElements().get(1);
		/* don't process verb terms with multiple words */
		if (velt.getTerm().getWords().size() > 1) return;
		/* don't process 'has' verbs or 'is' verbs */
		if (velt.getTerm().getText().equals("has")) return;
		Word vword = velt.getTerm().getWords().get(0);
		if (vword == VocKey.isVerb)return; 
		/* don't try to create a passive form for a word that is not a verb */
		if (! vword.isVerb()) return;

		/* make the passive SyntaxForm:  B is <verb>ed () by A */
		SyntaxForm newform = theVocFactory.createSyntaxForm(synform.getVerb());
		
		/* subject of newform is the object of the base verb */
		RoleElement relt = theVocFactory.createRoleElement();
		relt.setKind(FormElementKind.SUBJECT_ROLE);
		relt.setRole(((RoleElement)synform.getElements().get(2)).getRole());
		newform.addElement(relt);
		
		/* the verb element is 'is verbed by' */
		velt = theVocFactory.createItemElement();
		velt.setKind(FormElementKind.ITEM_ELEMENT);
		Term newterm = theVocFactory.createTerm();
		newterm.addWord(VocKey.isVerb);
		newterm.addWord(vword);
		newterm.setText("is " + ((Verb)vword).getPerfective().getText() + " by");
		VocKey.isVerb.addUsage(newterm);
		newterm.setConcept(synform.getVerb());
		synform.getVerb().addTerm(newterm);
		velt.setTerm(newterm);
		newform.addElement(velt);
		
		/* create the Particle 'by' */
		Particle part = theVocFactory.createParticle();
		part.setKind(FormElementKind.PARTICLE_ELEMENT);
		newterm = theVocFactory.createTerm();
		newterm.addWord(VocKey.byWord);
		newterm.setText("by");
		VocKey.byWord.addUsage(newterm);
		part.setTerm(newterm);
		newterm.setParticle(part);
		newform.addElement(part);
		
		/* add the original subject role as the particle object */
		relt = theVocFactory.createRoleElement();
		relt.setKind(FormElementKind.PARTICLE_ROLE);
		relt.setRole(((RoleElement)synform.getElements().get(0)).getRole());
		newform.addElement(relt);
		part.setRole(relt);
		
		/* make this a form of the verb */
		synform.getVerb().getForm().add(newform);
	}
	
	/**
	 * convert extensional definition string by prefixing "either "
	 * @param edef = the definition text out of SBVR, e.g. 'snark or boojum'
	 * @return the RECON equivalent definition, e.g. 'either snark or boojum'
	 */
	private static String convert_extensional_def(String edef)
	{
		editbuf.setLength(0);
		editbuf.append("either ");
		editbuf.append(edef);
		return editbuf.toString();
	}
	
	/**
	 * find the XML tag in the list of expected tags, and return the index
	 * (which has a name)
	 * @param tag = the XML tag string
	 * @return the corresponding magic number, or zero if not found
	 */
	private static int lookup_tag(String tag)
	{
		int st;
		for (st = 0; st < sbvrtags.length; ++st) {
			if (tag.equals(sbvrtags[st])) return st + 1;
		}
		return 0;
	}

	/**
	 * find the XML ID value for the XMI element, if any
	 * @param obj = the element in question
	 * @return the ID value or null
	 */
	private static String find_XMI_id(XmlObject obj)
	{
		XmlAttribute att = obj.find_attribute("xmi:id");
		if (att != null) return att.value;
		/* it may have other names */
		att = obj.find_attribute("xmi.id");
		if (att != null) return att.value;
		att = obj.find_attribute("XMI:id");
		if (att != null) return att.value;
		/* not there under any name */
		return null;
	
	}

	/**
	 * copy_words just copies all the words from an existing term into a new term
	 * @param oldterm = the existing term (source of words)
	 * @param newterm = the new term (destination of words)
	 */
	private static void copy_words(Term oldterm, Term newterm)
	{
		for (int w = 0; w < oldterm.getWords().size(); ++w) {
			newterm.addWord(oldterm.getWords().get(w));
		}
	}
	
	/**
	 * routine to make a RECON Term from an SBVR 'signifier'
	 * @param s = the signifier text string
	 * @return the corresponding RECON Term object
	 */
	private static Term make_term(String s)
	{
		int c;
		
		if (s == null) return null;
		termbuf.setLength(0);

		/* create the Term object */
		Term term = theVocFactory.createTerm();
		term.setText(s);
		
		/* now, add some words to it */
		for (c = 0; c < s.length(); ++c) {
			if (Character.isLetter(s.charAt(c)) || Character.isDigit(s.charAt(c))) {
				termbuf.append(s.charAt(c));
			} else {
				if (termbuf.length() > 0) {
					/* if we collected something, we need to make a word */
					term.addWord(make_word(termbuf.toString()));
					termbuf.setLength(0);	// empty the buffer
				}
				if (Character.isWhitespace(s.charAt(c))) {
					/* ignore whitespace */
				} else { /* some kind of symbol */
					/* make a Word from it */
					term.addWord(make_word(Character.toString(s.charAt(c))));
				}
			}
		}

		/* don't forget the last word of the term */
		if (termbuf.length() > 0) {
			term.addWord(make_word(termbuf.toString()));
		}
		
		/* mark the first word as beginning the term */
		term.getWords().get(0).addUsage(term);

		return term;
	}

	/** 
	 * find a match for string target in string base
	 * return the base index of the first find at or after the given offset
	 * @param base = the string to be searched
	 * @param start = the position in 'base' at which to start the search
	 * @param target = the target string
	 * @return the index of the target string (first char) in base, or -1 if no find
	 */
	private static int find_match(String base, int start, String target)
	{
		int bc;
		/* the stopping point in the base string, 
		 * where there are not enough chars to match the target */
		int stop = base.length() - target.length();
		
		for (bc = start; bc <= stop; ++bc) {
			if (base.charAt(bc) == target.charAt(0)) {
				if (match_at_position(base, bc, target)) return bc;
			}
		}
		return -1;
	}

	/**
	 * compare the substring at a given location in a base string with a given target string
	 * @param base = the base string
	 * @param position = the beginning of the substring to be compared
	 * @param target = the target string to be matched
	 * @return true if the substring matches, else false
	 */
	private static boolean match_at_position(String base, int position, String target)
	{
		int tc;
		for (tc = 0; tc < target.length(); ++tc) {
			if (base.charAt(position + tc) != target.charAt(tc)) return false;
		}
		
		/* don't match partial words
		 * if we are at the end of the base string, it is a match */
		if (base.length() <= position + tc) return true;
		/* otherwise the next character must be a space */
		return (base.charAt(position + tc) == ' ');
	}

	/** 
	 * utility to find/create a Dictionary word
	 * TODO: make make_word a Dictionary method
	 * 
	 * @param s = the string that is (to be) a word form
	 * @return the corresponding Dictionary Word
	 */
	private static Word make_word(String s)
	{
		WordForm wf = theVocFactory.makeWordForm(s);
		
		/* if it is in the dictionary, return the Word */
		if (wf.getWord() != null) return wf.getWord();
		
		/* the word text doesn't match a dictionary Word */
		errlog.println("*** Word '" + s + "' is not in the Dictionary.");

		/* create a dictionary word for the text */
		char first = s.charAt(0);
		Word w;
		if (Character.isLetter(first)) {
			w = theVocFactory.createName(wf);
		} else if (Character.isDigit(first)) {
			w = theVocFactory.createNumberWord(wf);
		} else if (first == '\'' || first == '"') {
			w = theVocFactory.createStringWord(wf);
		} else {
			w =theVocFactory.createAdjunct(wf);
		}
		wf.setWord(w);
		theDic.addWord(w);

		return w;
	}

	/** print_role_names
	 * routine to print out the list of role names (placeholders) for the given verb
	 * @param verb
	 */
	private static void print_role_names(VocVerb verb)
	{
		errlog.print("  placeholder terms: ");
		for (int r = 0; r < verb.getRoles().size(); ++r) {
			errlog.print("'" + verb.getRoles().get(r).getTerm().getText() + "' ");
		}
		errlog.println();
	}
}
