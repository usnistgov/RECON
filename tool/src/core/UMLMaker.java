/* UMLMaker.java
 * This module converts the Vocabulary to a UML model -- a structure of UML Model Elements (UMLElement)
 * 
 * Author:  Ed Barkmeyer, NIST, June 2013
 */

package core;

import NBVR.Vocabulary.*;
import uml.*;

/** UMLMaker
 *  UMLMaker initializes the UML output files
 *  predefines certain the UML Primitive Types
 *  and then processes the Vocabulary to produce the UML model
 *  
 *  The class has no instances.  It is merely a collector for static methods.
 */
public class UMLMaker {
	
	public static final VocabularyFactory theVocFactory = VocabularyFactory.eINSTANCE;

	public static final String UML_URI = "http://www.omg.org/spec/UML/20110701";

	// UML PrimitiveTypes
	public static final String UML_PrimitivePrefix = UML_URI + "/PrimitiveTypes.xmi";
	public static UmlPackage UMLPrimitiveTypes;
	public static final UmlPrimitive UmlBoolean = 
			new UmlPrimitive("Boolean", UML_PrimitivePrefix + "#Boolean");
	public static final UmlPrimitive UmlInteger = 
			new UmlPrimitive("Integer", UML_PrimitivePrefix + "#Integer");
	public static final UmlPrimitive UmlString = 
			new UmlPrimitive("String", UML_PrimitivePrefix + "#String");
	public static final UmlPrimitive UmlReal = 
			new UmlPrimitive("Real", UML_PrimitivePrefix + "#Real");
	
	public static UmlPackage theModel;	// the constructed UML model
	public static UmlClass umlThing;	// the uml class for 'thing'
		

	/** convertVocabulary()
	 *  Initialize the built-in logic elements
	 */
	public static UmlPackage convertVocabulary(Terminology theVoc, String modelname)
	{
		/* make the package for the UML Primitive Types */
		UMLPrimitiveTypes = new UmlPackage("PrimitiveTypes", UML_PrimitivePrefix);
		UMLPrimitiveTypes.firstPType = UmlBoolean;
		UmlBoolean.setSister(UmlInteger);
		UmlInteger.setSister(UmlString);
		UmlString.setSister(UmlReal);
		
		/* initialize the UML Model */
		theModel = new UmlPackage(modelname, null);
		
		/* create the Thing class */
		umlThing = new UmlClass("thing", null);
		
		/* process the Vocabulary items */
		VocabularyItem item;
		for (item = theVoc.getFirstItem(); item != null; item = item.getNext()) {
			convertItem(item);
		}
		
		return theModel;
	}

	/** convertItem (voc item)
	 * converts one vocabulary item to a UML model element
	 *  type and mass nouns convert to Classes
	 *    if the definition is formally defined, the base noun of the definition is taken to be
	 *    a generalization of the class
	 *  adjectives convert to Boolean attributes of the subject class
	 *  properties convert to directed Associations that have one End owned by the domain Class
	 *  verbs convert to Associations that own all their Ends
	 *    for each verb form, create an operation on the subject class that returns Boolean
	 *  proper names convert to Instances
	 *    if there is a definition, the base noun of the definition is taken to be the type
	 *    otherwise the type is 'thing', exception: units have type 'unit of measure'
	 *  formal definitions are converted to Rules (should be OCL)
	 *  informal definitions are converted to Comments
	 *  synonyms are converted to Comments
	 *    
	 * @param item = the vocabulary item to be converted
	 */
	private static void convertItem(VocabularyItem item) 
	{
		switch (item.getKind().getValue()) {
		case VocItemKind.NOUN_CONCEPT_VALUE:
			convertNoun((VocNoun)item);
			return;
		case VocItemKind.ADJECTIVE_CONCEPT_VALUE:
			convertAdjective((VocAdjective)item);
			return;
		case VocItemKind.PROPERTY_CONCEPT_VALUE:
			convertProperty((VocProperty)item);
			return;
		case VocItemKind.VERB_CONCEPT_VALUE:
			convertVerb((VocVerb)item);
			return;
		case VocItemKind.PROPER_NAME_VALUE:
			convertName((VocName)item);
			return;
		}
	}

	/** convertNoun
	 *  makes a UmlClass object that corresponds to the passed VocNoun
	 * @param noun = the VocNoun to be converted
	 */
	private static UmlClass convertNoun(VocNoun noun) 
	{
		
		Formulation form = noun.findFormulationIn("UML");
		if (form != null) return (UmlClass)form.getForm();

		/* create a UML class */
		Term term = noun.getTerms().get(0);
		UmlClass uclass = new UmlClass(term.getText(), null);

		/* add it to the model */
		uclass.sister = theModel.firstClass;
		theModel.firstClass = uclass;
		
		/* make it a Formulation for the noun */
		form = theVocFactory.createFormulation("UML", term.getText(), uclass);
		noun.getFormulations().add(form);
		
		/* make comments for synonyms and definitions */
		addSynonyms(uclass, noun);
		addDefinitions(uclass, noun);

		/* finally look for supertypes */
		for (int b = 0; b < noun.getBase().size(); ++b) {
			uclass.addGeneralization(findUmlClassFor((VocNoun)noun.getBase().get(b)));
		}
		
		return uclass;
	}

	/** findUmlClassFor(VocNoun)
	 *  looks for a UML formulation of the VocNoun, which must be the UML Class
	 *  if not found, it calls convertNoun to make one
	 * @param noun = the VocNoun for which the Class is sought
	 * @return the corresponding UmlClass
	 */
	private static UmlClass findUmlClassFor (VocNoun noun)
	{
		Formulation f = noun.findFormulationIn("UML");
		if (f == null) {
			return convertNoun(noun);
		} else {
			return ((UmlClass)f.getForm());
		}
	}

	/** convertName
	 *  makes a UmlInstance object that corresponds to the passed VocName
	 * @param pname = the VocName to be converted
	 */
	private static void convertName(VocName pname) 
	{
		/* don't do it twice */
		Formulation form = pname.findFormulationIn("UML");
		if (form != null) return;

		/* Get the kind of thing the ProperName refers to */
		UmlClass type = umlThing;
		if (! pname.getBase().isEmpty()) {
			type = findUmlClassFor((VocNoun)pname.getBase().get(0));
		}
		
		/* now create the UML Instance */
		Term term = pname.getTerms().get(0);
		UmlInstance uobj = new UmlInstance(term.getText(), type, null);

		/* add it to the model */
		uobj.sister = theModel.firstInstance;
		theModel.firstInstance = uobj;
		
		/* make it a Formulation for the noun */
		form = theVocFactory.createFormulation("UML", term.getText(), uobj);
		pname.getFormulations().add(form);
		
		/* make comments for synonyms and definitions */
		addSynonyms(uobj, pname);
		addDefinitions(uobj, pname);
	
	}
	
	/** convertAdjective
	 *  makes a UmlProperty object that corresponds to the passed VocAdjective
	 * @param adj = the VocAdjective to be converted
	 */
	private static void convertAdjective(VocAdjective adj) 
	{
		/* do nothing -- the unary verb form will generate a Boolean property */
	}
	
	/** convertProperty
	 *  makes a UmlProperty object that corresponds to the passed VocProperty
	 *  Note:  The vocabulary constructors build the verb item first
	 *  and derive the property item(s) from it, 
	 *  so the order of encounter will be: first verb, then property
	 *  
	 * @param ppty = the VocProperty to be converted
	 */
	private static void convertProperty(VocProperty ppty) 
	{
		if (ppty.findFormulationIn("UML") != null) return;

		/* The UML Property for the range of the RECON property
		 * was created for subject role of the property verb */
		UmlAssoc uassoc = (UmlAssoc)findUmlAssocFor(ppty.getVerb());
		UmlProperty uprop = uassoc.firstEnd;
		
		/* The property is not owned by the association,
		 * but rather by the domain class */
		uassoc.firstEnd = uprop.sister;
		uprop.isNavigable = true;
		
		/* find the domain noun = the class that has the Attribute */
		UmlClass uclass = findUmlClassFor(ppty.getDomain());
		uprop.sister = uclass.firstAttr;
		uclass.firstAttr = uprop;
		
		/* the property name is different from the role name */
		Term term = ppty.getTerms().get(0);
		uprop.name = term.getText();
		
		/* make it a Formulation for the property */
		Formulation form = theVocFactory.createFormulation("UML", term.getText(), uprop);
		ppty.getFormulations().add(form);
			
		/* make comments for synonyms and definitions */
		addSynonyms(uprop, ppty);
		addDefinitions(uprop, ppty);

	}
	
	/** convertVerb
	 *  makes a UmlAssoc object that corresponds to the passed VocVerb
	 * @param verb = the VocVerb to be converted
	 * @return the UmlAssoc or the UmlProperty (for a unary verb)
	 */
	private static UmlElement convertVerb(VocVerb verb) 
	{
		/* if the conversion has already been done, return the result */
		Formulation form = verb.findFormulationIn("UML");
		if (form != null) return (UmlElement)form.getForm();
		
		/* the mapping of verbs depends on the arity
		 * arity = 1 is mapped to a binary association to Boolean
		 * arity = 2 is mapped to a binary association
		 * arity >2 is mapped to a n-ary association
		 */
		if (verb.getArity() == 1) {
			return convertUnaryVerb(verb);
		}

		/* create a UML association */
		Term term = verb.getTerms().get(0);
		UmlAssoc assoc = new UmlAssoc(term.getText(), null, verb.getArity());

		/* add it to the model */
		assoc.sister = theModel.firstAssoc;
		theModel.firstAssoc = assoc;
		
		/* make it a Formulation for the Verb */
		form = theVocFactory.createFormulation("UML", term.getText(), assoc);
		verb.getFormulations().add(form);
		
		/* now make the Association Ends */
		UmlProperty uend;
		UmlProperty lastend = null;
		for (int r = 0; r < verb.getArity(); ++r) {
			VerbRole role = verb.getRoles().get(r);
			/* create an association end for the role */
			uend = new UmlProperty(role.getTerm().getText(), findUmlClassFor(role.getRange()));
			/* add the role to the association ends list */
			uend.assn = assoc;
			assoc.addRole(uend);

			/* assume the association owns all ends */
			uend.isNavigable = false;
			if (lastend == null) {
				assoc.firstEnd = uend;
			} else {
				lastend.sister = uend;
			}
			lastend = uend;

			/* always assume association roles are 0..* */
			uend.lowerBound = 0;
			uend.upperBound = -1;
		}
		
		// TODO: create the operation for assoc that is not a property
		
		/* make comments for synonyms and definitions */
		// TODO: Alternate Forms for Verbs, not synonyms
		addSynonyms(assoc, verb);
		addDefinitions(assoc, verb);
		
		return assoc;
	}
	
	/** convertUnaryVerb
	 *  makes a UmlProperty of type Boolean that corresponds to the unary verb
	 *  this also converts VocAdjectives, which have an associated unary verb form
	 * @param verb = the VocVerb to be converted
	 */
	private static UmlProperty convertUnaryVerb(VocVerb verb) 
	{
		/* find the subject noun = the class that has the Attribute */
		VocNoun subject = verb.getRoles().get(0).getRange();
		UmlClass uclass = findUmlClassFor(subject);

		/* create a UML attribute */
		Term term = verb.getTerms().get(0);
		UmlProperty uprop = new UmlProperty(term.getText(), UmlBoolean);

		/* add it to the model */
		uprop.sister = uclass.firstAttr;
		uclass.firstAttr = uprop;
		
		/* make it a Formulation for the verb */
		Formulation form = theVocFactory.createFormulation("UML", term.getText(), uprop);
		verb.getFormulations().add(form);
		
		/* make comments for synonyms and definitions */
		addSynonyms(uprop, verb);
		addDefinitions(uprop, verb);
		
		return uprop;
	}

	/** findUmlAssocFor(VocVerb)
	 *  looks for a UML formulation of the VocVerb, which must be the UML Assoc
	 *  if not found, it calls convertVerb to make one
	 *  
	 * @param verb = the VocVerb for which the Association is sought
	 * @return the corresponding UmlAssoc or UmlProperty, if the formulation is a Boolean attribute
	 */
	private static UmlElement findUmlAssocFor (VocVerb verb)
	{
		if (verb.getArity() == 1) return null;
		Formulation f = verb.findFormulationIn("UML");
		if (f == null) {
			return convertVerb(verb);
		} else {
			return ((UmlElement)f.getForm());
		}
	}

	/** addSynonyms(UmlElement, VocItem)
	 *  for each synonym for the VocItem, add a UML Comment that contains the synonym
	 *  to the corresponding UML Model Element
	 * @param uelt = the UML model element
	 * @param item = the Vocabulary item
	 */
	private static void addSynonyms(UmlElement uelt, VocabularyItem item)
	{
		/* look for synonyms */
		for (int t = 1; t < item.getTerms().size(); ++t) {
			Term term = item.getTerms().get(t);
			uelt.addComment(new UmlComment("Synonym: " + term.getText()));
		}
	}

	/** addDefinitions(UmlElement, VocItem)
	 *  for each definition for the VocItem, add a UML Comment that contains the definition
	 *  to the corresponding UML Model Element
	 *  //TODO: RECON definitions could be converted to OCL
	 *  
	 * @param uelt = the UML model element
	 * @param item = the Vocabulary item
	 */
	private static void addDefinitions(UmlElement uelt, VocabularyItem item)
	{
		/* look for definitions */
		for (int f = 0; f < item.getFormulations().size(); ++f) {
			Formulation def = item.getFormulations().get(f);
			/* any unstructured formulation is a definition
			 * as is the text of a RECON formulation */
			if (! def.isStructured()|| def.getLanguage().equals("RECON")) 
				uelt.addComment(new UmlComment("Definition: " + def.getText()));
		}
	}


}
