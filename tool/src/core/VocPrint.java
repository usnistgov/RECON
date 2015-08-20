/* VocPrint.java
 *  static class that contains only the methods for printing out the
 *  active Dictionary and Terminology 
 *  
 *  @author Ed Barkmeyer, NIST, November, 2011, v0.18 cleaning up vocabulary processing
 *  	(extracted from VocMain, vintage June 2010)
 */
package core;

import java.util.Iterator;
import java.io.*;

import NBVR.Vocabulary.*;

public class VocPrint {
	
	private static Dictionary theDictionary;
	private static Terminology theVocabulary;
	private static PrintStream errorlog;
	
	public static void printDictionary(Dictionary dic, PrintStream log)
	{
		theDictionary = dic;
		errorlog = log;

		errorlog.println();
		errorlog.println("-- Active Dictionary --");
		dumpWords();
	}
	
	public static void printVocabulary(Terminology voc, PrintStream log)
	{
		theVocabulary = voc;
		errorlog = log;
		
		errorlog.println();
		errorlog.println("-- Active Terminology --");
		dumpItems();
	}

	/** dumpWords
	 *  simple routine to dump the word list
	 */
	private static void dumpWords()
	{
		Word w;
		String wtext;
		int wleng;
		String pad = "                    ";
		
		errorlog.println("Type Word              Forms");
		for (w = theDictionary.getFirstWord(); w != null; w = w.getNext()) {
			wtext = w.getBase().getText();
			wleng = wtext.length();
			if (wleng > pad.length()) {
				errorlog.println("BIG "+ wtext);
			} else if (w.eClass() == VocabularyPackage.Literals.NOUN) {
				errorlog.print(" N   " + wtext + pad.substring(wleng) + wtext);
				errorlog.print(", " + ((Noun)w).getPlural().getText());
				if (((Noun)w).getAltPlural() != null)
					errorlog.print(", " + ((Noun)w).getAltPlural().getText());
				errorlog.println();
			} else if (w.eClass() == VocabularyPackage.Literals.VERB) {
				errorlog.print(" V   " + wtext + pad.substring(wleng) + wtext);
				errorlog.print(", " + ((Verb)w).getSingular().getText());
				errorlog.print(", " + ((Verb)w).getPlural().getText());
				errorlog.print(", " + ((Verb)w).getPast().getText());
				errorlog.print(", " + ((Verb)w).getProgressive().getText());
				errorlog.print(", " + ((Verb)w).getPerfective().getText());
				if (((Verb)w).getAltPast() != null)
					errorlog.print(", " + ((Verb)w).getAltPast().getText());
				errorlog.println();

			} else if (w.eClass() ==  VocabularyPackage.Literals.ADJECTIVE) {
				errorlog.println(" A   " + wtext + pad.substring(wleng) + wtext);
			} else if (w.eClass() ==  VocabularyPackage.Literals.ADJUNCT) {
				errorlog.println(" W   " + wtext + pad.substring(wleng) + wtext);
			} else if (w.eClass() ==  VocabularyPackage.Literals.KEYWORD) {
				errorlog.println(" K   " + wtext + pad.substring(wleng) + wtext);
			} else if (w.eClass() ==  VocabularyPackage.Literals.NAME) {
				errorlog.println(" NM  " + wtext + pad.substring(wleng) + wtext);
			} else {
				errorlog.println(" ??? " + wtext);
			}
		}
	}

	/**
	 * save the Dictionary to the named file in RECON Dic/Voc Loader form
	 * @param dic  = the dictionary to be saved
	 * @param dicf = the file to save it to
	 */
	public static void saveDictionary(Dictionary dic, String dictname)
	{
		Word w;
		PrintStream dicf;		

		/* create the log file */
		if (dictname == null) return;
		try {
			dicf = new PrintStream(dictname);
		} catch (IOException ex) {
			System.err.println("*** Could not open dictionary save file: " + dictname);
			return;
		}
		
		dicf.println("// Dictionary " + dictname);
		dicf.println("$V");
		for (w = dic.getFirstWord(); w != null; w = w.getNext()) {
			if (w.eClass() == VocabularyPackage.Literals.NOUN) {
				dicf.print("WN " + w.getBase().getText());
				dicf.print(" " + ((Noun)w).getPlural().getText());
				if (((Noun)w).getAltPlural() != null)
					dicf.print(", " + ((Noun)w).getAltPlural().getText());
				dicf.println();
			} else if (w.eClass() == VocabularyPackage.Literals.VERB) {
				if (! w.isIs()) { /* don't save 'be' */
					dicf.print("WV " + w.getBase().getText());
					dicf.print(" " + ((Verb)w).getSingular().getText());
					dicf.print(" " + ((Verb)w).getPast().getText());
					dicf.print(" " + ((Verb)w).getProgressive().getText());
					dicf.print(" " + ((Verb)w).getPerfective().getText());
					if (((Verb)w).getAltPast() != null)
						dicf.print(", " + ((Verb)w).getAltPast().getText());
					dicf.println();
				}
			} else if (w.eClass() ==  VocabularyPackage.Literals.ADJECTIVE) {
				dicf.println("WA " + w.getBase().getText());
			} else if (w.eClass() ==  VocabularyPackage.Literals.ADJUNCT) {
				dicf.println("W " + w.getBase().getText());
			} else if (w.eClass() ==  VocabularyPackage.Literals.KEYWORD) {
				/* don't save keywords */
			} else if (w.eClass() ==  VocabularyPackage.Literals.NAME) {
				dicf.println("W " + w.getBase().getText());
			} else {
				System.err.println("Unexpected Dictionary item " + w.getBase().getText());
			}
		}
		
		/* close the dictionary file */
		dicf.close();
	}

	/** dumpItems
	 * routine to dump a form of the Vocabulary to errorlog
	 * 
	 */
	private static void dumpItems()
	{
		VocabularyItem item;
		Iterator<Term> termit;
		Iterator<Formulation> formit;
		Iterator<SyntaxForm> ftfit;
		Formulation f;
		VocNoun domain;
		VerbRole role;
		int roleno;

		for (item = theVocabulary.getFirstItem(); item != null; item = item.getNext()) {
			errorlog.print("Item: ");
			/* print the item type */
			switch (item.getKind().getValue()) {
			case VocItemKind.NOUN_CONCEPT_VALUE:
				errorlog.print("Noun ");
				break;
			case VocItemKind.VERB_CONCEPT_VALUE:
				errorlog.print("Verb ");
				break;
			case VocItemKind.PROPERTY_CONCEPT_VALUE:
				errorlog.print("Prop ");
				break;
			case VocItemKind.ADJECTIVE_CONCEPT_VALUE:
				errorlog.print("Adj  ");
				break;
			case VocItemKind.PROPER_NAME_VALUE:
				errorlog.print("Name ");
				break;
			default:
				errorlog.print("???  ");	
			}
			/* print the primary term */
			termit = item.getTerms().iterator();
			if (termit.hasNext()) {
				printTerm(termit.next());
			} else {
				errorlog.print("(no terms)");
			}
			errorlog.println();
			/* print other terms */
			while (termit.hasNext()) {
				errorlog.print("  Synonym: ");
				printTerm(termit.next());
				errorlog.println();
			}
			
			/* print the formulations */
			formit = item.getFormulations().iterator();
			while (formit.hasNext()) {
				f = formit.next();
				errorlog.print("  Formulation (" + f.getLanguage() + "): ");
				if (f.getText() == null) 
					errorlog.println("[structure display unimplemented]");
				else
					errorlog.println(f.getText());
			}
			
			/* print the details */
			switch (item.getKind().getValue()) {
			case VocItemKind.NOUN_CONCEPT_VALUE:
				/* nothing else to do */
				break;
				
			case VocItemKind.VERB_CONCEPT_VALUE:
				/* print roles */
				for (roleno = 0; roleno < ((VocVerb)item).getRoles().size(); ++ roleno) {
					role = ((VocVerb)item).getRoles().get(roleno);
					errorlog.print("  Role: ");
					printTerm(role.getTerm());
					errorlog.print(": ");
					domain = role.getRange();
					if (domain == null) errorlog.print("(unspecified)");
					else printTerm(domain.getTerms().get(0));
					errorlog.println();
				}
				/* print forms */
				ftfit = ((VocVerb)item).getForm().iterator();
				while (ftfit.hasNext()) {
					printSyntaxForm(ftfit.next());
				}
				break;
				
			case VocItemKind.PROPERTY_CONCEPT_VALUE:
				/* print associated verb */
				errorlog.print("  Associated Verb: ");
				printItemName(((VocProperty)item).getVerb());
				errorlog.println();

				/* print domain and range */
				errorlog.print("  Domain: ");
				printItemName(((VocProperty)item).getDomain());
				errorlog.println();

				errorlog.print("  Range:  ");
				printItemName(((VocProperty)item).getRange());
				errorlog.println();
				
				/* print the PropertyForms */
				ftfit = ((VocProperty)item).getPropertyForm().iterator();
				while (ftfit.hasNext()) {
					printSyntaxForm(ftfit.next());
				}

				break;
				
			case VocItemKind.ADJECTIVE_CONCEPT_VALUE:
				/* print associated verb */
				errorlog.print("  Associated Verb: ");
				printItemName(((VocAdjective)item).getVerb());
				errorlog.println();

				/* print domain */
				errorlog.print("  Domain: ");
				printItemName(((VocAdjective)item).getDomain());
				errorlog.println();

				break;
			}
			
		}
	}
	
	/** printSyntaxForm
	 * print the given syntax form to errorlog
	 * @param item = the item that owns the form
	 * @param form = the form object
	 */
	static void printSyntaxForm(SyntaxForm form)
	{
		FormElement elt;
		RoleElement role;
		Iterator<FormElement> eltit = form.getElements().iterator();
		
		/* print "is form" indicator */
		if (form.isAuxForm()) errorlog.print("  Form (IsForm):");
		else errorlog.print("  Form:");
		
		/* now print the form elements */
		while (eltit.hasNext()) {
			elt = eltit.next();
			errorlog.print(" ");
			switch (elt.getKind().getValue()) {
			case FormElementKind.ITEM_ELEMENT_VALUE:
				printTerm(((ItemElement)elt).getTerm());
				break;
				
			case FormElementKind.SUBJECT_ROLE_VALUE:
			case FormElementKind.OBJECT_ROLE_VALUE:
				errorlog.print("(");
				printTerm(((RoleElement)elt).getRole().getTerm());
				errorlog.print(")");
				break;
				
			case FormElementKind.PARTICLE_ELEMENT_VALUE:
				/* print the Particle term */
				printTerm(((Particle)elt).getTerm());
				errorlog.print(" (");
				role = ((Particle)elt).getRole();
				if (role != null)
					if (role.getRole() == null) errorlog.print("(unspecified)");
					else printTerm(role.getRole().getTerm());
				errorlog.print(")");
				break;
			}
		}
		
		errorlog.println();
		
	}
	
	/** printItemName 
	 * safely prints the name of the given item
	 * @param item = the item whose name (first term) is to be printed
	 */
	static void printItemName(VocabularyItem item)
	{
		Term term;
		
		if (item == null) {
			errorlog.println("(unspecified)");
		} else {
			term = item.getTerms().get(0);
			printTerm(term);
		}
	}
	
	/** printTerm
	 * print the provided term to errorlog
	 * @param term
	 */
	static void printTerm(Term term)
	{
		if (term == null) {
			errorlog.print("(anonymous)");
			return;
		}
		
		Iterator<Word> it = term.getWords().iterator();
		if (!it.hasNext()) errorlog.print("(anonymous)");
		while (it.hasNext()) {
			errorlog.print(it.next().getBase().getText());
			if (it.hasNext()) errorlog.print(" ");
		}
	}

}
