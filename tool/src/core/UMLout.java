/* UMLout.java
 * This module produces an XMI file from a UML model, as a structure of UmlElements
 * 
 * Author:  Ed Barkmeyer, NIST, June 2013
 */

package core;

import uml.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class UMLout {
	
	public static PrintWriter UMLfile;	// the object we "print" to
	
	/* XMI Document label lines */
	private static final String xmidoctype[] = {
		"<?xml version='1.0' encoding='UTF-8'?>",
		"<xmi:XMI xmi:version='2.1'",
		"  xmlns:uml='http://www.omg.org/spec/UML/20110701'",
		"  xmlns:xmi='http://www.omg.org/spec/XMI/20110701'>"
	};
	private static final String xmitrailer = "</xmi:XMI>";


	/** createUMLfile(filename, model)
	 *  creates a UML/XMI file from the passed UML model
	 *  (the UML model is declared "Object" externally, 
	 *  so that the caller doesn't need to understand the UML model structures
	 *  
	 * @param filename = the full name of the output file to be created
	 * @param model = the UML model, an instance of UmlPackage
	 */
	public static void createUMLfile(String filename, Object model)
	{
		createXMI(filename, (UmlPackage)model);
	}

	/** createUMLfile(filename)
	 *  creates a new UML output file and returns the PrintWriter object
	 *  that the toUML routines should write/print to
	 *  
	 * @param filename = the full name of the output file to be created
	 * @return the PrintWriter attached to the file
	 */
	private static void createXMI(String filename, UmlPackage model)
	{

	    /* open the UML output file */
		OutputStream UMLstream;	// the object that we actually write to
	    try {
	    	UMLstream = new FileOutputStream(filename);
	    } catch (IOException ex) {
	    	RECONManager.errorlog.println("*** UML output: Could not open " + filename);
	    	UMLstream = null;
	    	return;
	    }
	    UMLfile = new PrintWriter(UMLstream, false);  //the 'print' interface to the file

	    /* produce standard xmi document header */
	    for (int h = 0; h < xmidoctype.length; ++h)
	      UMLfile.println(xmidoctype[h]);

	    /* produce tool-specific XMI Header */
	    UMLfile.println("<xmi:Documentation exporter='RECON' exporterVersion='"
	    		+ RECONversion.major + "." + RECONversion.minor + "'/>");

	    /* output model content */
	    output_package(model, true);

	    /* output xmi trailer */
	    UMLfile.println(xmitrailer);

	    UMLfile.close();
	    		
	}

	/* output Packages (and Models) 
	 *  pkg is the Package or Model description object
	 *  isModel is true if this is the Model, false if it is a Package
	 */
	private static void output_package(UmlPackage pkg, boolean isModel)
	{
	  String tag;
	  UmlElement me;

	  /* output model header */
	  if (isModel)  tag = "uml:Package";
	  else			tag = "packagedElement";

	  UMLfile.println("<" + tag + " xmi:id='" + pkg.id 
			  + "' xmi:type='uml:Package' name='" + pkg.name + "'>");

	  /* output model/package definition */
	  output_definition(pkg);

	  /* output other properties */
	  output_properties(pkg);

	  /* output packaged elements */

	  /*
	  for (me = pkg.profiles; m != null; me = me.sister)
		  output_profile((UmlProfile)me);

	  for (me = pkg.stereos; m != null; me = me.sister)
		output_stereotype(pkg.me);
	   */

	  for (me = pkg.firstEnum; me != null; me = ((UmlEnum)me).sister) 
	    output_enumeration((UmlEnum)me);


	  for (me = pkg.firstClass; me != null; me = ((UmlClass)me).sister) 
	    output_class((UmlClass)me, "Class");

	  /*
	  for (me = pkg.firstAssoClass; me != null; me = ((UmlAssoClass)me).sister) 
	    output_assoclass((UmlAssoClass)me);
	   */

	  for (me = pkg.firstAssoc; me != null; me = ((UmlAssoc)me).sister) 
		  output_association((UmlAssoc)me);

	  for (me = pkg.firstInstance; me != null; me = ((UmlInstance)me).sister) 
		  output_instance((UmlInstance)me);

	  /* output (sub)package contents */
	  for (me = pkg.firstPackage; me != null; me = ((UmlPackage)me).sister) 
		    output_package((UmlPackage)me, false);

	  UMLfile.println("</" + tag + ">");
	  
	}

	/* output Class 
	 *    cl   is the UML classifier
	 *    type is the name of the type of classifier: Class, DataType, etc.
	 */
	static void output_class(UmlClass cl, String type)
	{
	  UmlElement me;

	  /* output class header */
	  UMLfile.print("<packagedElement xmi:type='uml:" + type
			  + "' xmi:id='" + cl.id + "' name='" + xml_string(cl.name) + "'");

	  /* output boolean properties */
	  if (cl.isAbstract) UMLfile.print(" isAbstract='true'");
	  if (cl.kind == UmlElement.ASSOCLASS) {
		  UmlAssoc pass = cl.asAssoc;
		  if (pass.isDerived)  UMLfile.print(" isDerived='true'");
	  }

	  /* output visibility, always public = default */
	  UMLfile.println(" >");

	  /* output class definition */
	  output_definition(cl);

	  /* output Supertype Generalizations */
	  if (cl.generals != null) {
		  for (int s = 0; s < cl.generals.size(); ++s) {
		    output_owned_generalization(cl.generals.get(s));
		  }
	  }
	  
	  /* output Attribute definitions */
	  if (cl.firstAttr != null) {
		for (me = cl.firstAttr; me != null; me = ((UmlProperty)me).sister) 
			output_attribute((UmlProperty)me, false);
	  }

	  /* output Operation definitions */
	  if (cl.firstOpn != null) {
		  for (me = cl.firstOpn; me != null; me = ((UmlOperation)me).sister) 
			output_operation((UmlOperation)me);
	  }

	  /* output other properties of the Class */
	  output_properties(cl);

	  /* now check for Association Class additions */
	  if (cl.kind == UmlElement.ASSOCLASS) return;

	  UMLfile.println("</packagedElement>");
	}

	/* output Data type */
	static void output_dtype(UmlClass dtype)
	{
		if (dtype.kind == UmlElement.PTYPE)
			output_class(dtype, "PrimitiveType");
		else /* dtype.kind == UmlElement.DTYPE */
			output_class(dtype, "DataType");
	}

	/* output Enumeration per XMI 2.1 */
	static void output_enumeration(UmlEnum dtype)
	{
		UmlValue v;

		UMLfile.println(
			"<packagedElement xmi:type='uml:Enumeration' xmi:id='" + dtype.id
			+ "' name='" + xml_string(dtype.name) + "' >");

		output_definition(dtype);
		
		/* now output the values */
		for (v = dtype.firstValue; v != null; v = v.sister) {
			UMLfile.println(
				"<ownedLiteral xmi:type='uml:EnumerationLiteral' xmi:id='" + v.id
				+ "' name='" + v.name + "' visibility='public'>");
			output_definition(v);
			UMLfile.println("</ownedLiteral>");
		}

		/* now output any other properties of the type */
		output_properties(dtype);

		UMLfile.println("</packagedElement>\n"); 
	}

	/* output Association */
	static void output_association(UmlAssoc assn)
	{
	  UmlProperty me;
	
	  /* output Association header */
	  UMLfile.println(
		  "<packagedElement xmi:type='uml:Association' xmi:id='" + assn.id
				+ "' name='" + xml_string(assn.name) + "'");
	
	  /* produce Association properties */
	  if (assn.isAbstract) UMLfile.print(" isAbstract='true'");
	  if (assn.isDerived)  UMLfile.print(" isDerived='true'");
	
	  /* output visibility */
	  UMLfile.println(" >");
	
	  /* output Association definition */
	  output_definition(assn);
	
	  /* output owned Generalizations */
	  if (assn.generals != null) {
	    for (int item = 0; item < assn.generals.size(); ++item) {
	      output_owned_generalization(assn.generals.get(item));
	    }
	  }
	
	  /* output other properties */
	  output_properties(assn);
	
	  /* describe owned association ends */
	  for (me = assn.firstEnd; me != null; me = me.sister) 
	    output_attribute(me, true);
	
	  /* now output all ends */
	  for (int item = 0; item < assn.roles.size(); ++item) {
		  me = assn.roles.get(item);
		  UMLfile.println("<memberEnd xmi:idref='" + me.id + "'/>");
	  }
	
	  UMLfile.println("</packagedElement>\n");
	}
	
	/* output Association Class */
	static void output_assoclass(UmlClass acl)
	{
	  UmlProperty me;
	  UmlAssoc assn = acl.asAssoc;

	  output_class(acl, "AssociationClass");

	  /* describe owned association ends */
	  for (me = assn.firstEnd; me != null; me = me.sister) 
		  output_attribute(me, true);
	  
	  /* now output all ends */
	  for (int item = 0; item < assn.roles.size(); ++item) {
		  me = assn.roles.get(item);
		  UMLfile.println("<memberEnd xmi:idref='" + me.id + "'/>");
	  }

	  UMLfile.println("</packagedElement>\n");
	}
	
	/* output owned generalizations
	 * Note: CMOF only supports Classifier:general, that is, it does
	 * not support generalization of Associations.  
	 * It does support multiple supertypes, and subtypes of DataType.
	 */
	static void output_owned_generalization(UmlElement me)
	{
		UMLfile.print("<general xmi:type='uml:" +
			UmlElement.name_type(me.kind) + "'");
		
		if (me.uri == null)
			UMLfile.println(" xmi:idref='" + me.id + "'/>");
		else
			UMLfile.println(" href='" + me.uri + "'/>");	
	}

	/* output Attribute
	 *   att     is the Attribute/End object
	 *   forAssn is false if called from Class, true if from Assoc
	 */
	static void output_attribute(UmlProperty att, boolean forAssn)
	{
	  String tag;
	  int item;
	
	  if (forAssn) tag = "ownedEnd";
	  else         tag = "ownedAttribute";
	
	  UMLfile.print("<" + tag + " xmi:type='uml:Property' xmi:id='" + att.id
			  + "' name='" + xml_string(att.name) + "'");
	
	  /* output local data type (external is below) */
	  if (att.type.getURI() == null)
		  UMLfile.print(" type='" + att.type.getId() + "'");
	
	  /* if this is an association end, output the association link */
	  if (att.assn != null)
		  UMLfile.print(" association='" + att.assn.id + "'");
	
	  /* output simple properties */
	  if (att.isDerived)   UMLfile.print(" isDerived='true'");
	  if (att.isAbstract)  UMLfile.print(" isAbstract='true'");
	  if (att.isComposite) UMLfile.print(" aggregation='composite'");
	  if (att.isAggregate) UMLfile.print(" aggregation='aggregate'");
	  if (att.isOrdered)   UMLfile.print(" isOrdered='true'");
	
	  /* default visibility for properties is "private" */
	  UMLfile.print(" visibility='public'");
	
	  UMLfile.println(">");
	  
	  /* output multiplicity */
	  /* rules for the canonical form: if the lower bound is 1, don't output lowerValue
	   * if you output lowerValue, the default value is 0
	   */
	  if (att.lowerBound != 1) {
		  UMLfile.print("<lowerValue xmi:type='uml:LiteralInteger' xmi:id='" +
				  UmlElement.getNewId("lower") + "'");
		  if (att.lowerBound > 0) UMLfile.print(" value='"+ att.lowerBound + "'");
		  UMLfile.println("/>");
	  }
	  if (att.upperBound != 1) {
		  UMLfile.print("<upperValue xmi:type='uml:LiteralUnlimitedNatural' xmi:id='" + 
				  UmlElement.getNewId("upper") + "'");
		  if (att.upperBound >= 0) // -1 means unbounded
			  UMLfile.println(" value='" + att.upperBound + "'/>");
		  else
			  UMLfile.println(" value='*'/>");
	  }

	  /* output external data type */
	  if (att.type.getURI() != null) {
		  UMLfile.println("<type xmi:type='uml:" + UmlElement.name_type(att.type.getKind())
				  + "' href='" + att.type.getURI() + "'/>");
	  }

	  /* output Attribute definition */
	  output_definition(att);

	  // output redefined properties 
	  if (att.redefines != null) {
		  for (item = 0; item < att.redefines.size(); ++item)
			  UMLfile.println("<redefinedProperty xmi:idref='" + att.redefines.get(item).id + "' />");
	  }

	  // output subsetted properties 
	  if (att.subsets != null) {
		  for (item = 0; item < att.subsets.size(); ++item)
			  UMLfile.println("<subsettedProperty xmi:idref='" + att.subsets.get(item).id + "' />");
	  }
	  
	  /* now print any other properties */
	  output_properties(att);

	  UMLfile.println("</" + tag + ">");
	}

	/* output Operations */
	static void output_operation(UmlOperation opn)
	{
	  UmlParameter me;

	  /* output operation header */
	  UMLfile.println(
		  "<ownedOperation xmi:type='uml:Operation' xmi:id='" + opn.id 
		  + "' name='" + xml_string(opn.name) + "' visibility='public'");

	  /* output operation definition */
	  output_definition(opn);

	  /* output parameters */
	  if (opn.firstParam != null) {
	    for (me = opn.firstParam; me != null; me = me.sister) {
	      output_parameter(me);
	    }
	  }

	  /* now print any other properties */
	  output_properties(opn);

	  UMLfile.println("</ownedOperation>");
	}

	/* output parameter specification */
	static void output_parameter(UmlParameter param)
	{
	    UMLfile.print("<ownedParameter xmi:id='" + param.id + "' name='" + param.name + "'");
	    UMLfile.print(" kind='" + UmlParameter.name_direction(param.direction) + "'");
		UMLfile.println(" type='" + param.type.getId() + "' >");

		output_definition(param);
		output_properties(param);

		UMLfile.println("</ownedParameter>");
	}

	/* output Instances (Objects) */
	static void output_instance(UmlInstance obj)
	{
	  /* output instance header */
	  UMLfile.print("<packagedElement type='uml:InstanceSpecification' xmi:id='" + obj.id 
			  + "' name='" + xml_string(obj.name) + "'");

	  UMLfile.println(" classifier='" + obj.type.id + "'>");

	  /* output instance definition */
	  output_definition(obj);

	  /* now print any other properties */
	  output_properties(obj);

	  //TODO: output instance slots and owned links

	  UMLfile.println("</packagedElement>");
	}
	
	/* output other properties common to model elements */
	static void output_properties(UmlElement me)
	{
		/* output the constraints on the model element */
		UmlRule rule;
		for (rule = me.firstRule; rule != null; rule = rule.sister)
			output_constraint(rule);
	}

	/* output Constraints/Rules */
	static void output_constraint(UmlRule rule)
	{

	  /* output the Rule element */
	  UMLfile.println(
		  "<ownedRule xmi:type='uml:Constraint' xmi:id='" + rule.id 
		  + "' name='" + xml_string(rule.name) + "'>");

	  /* output the affected classes and associations
	   * this is the most general form */
	  if (rule.affects == null) {
		  // TODO: complain about rules that affect nothing
	  } else {
		  for (int entry = 0; entry < rule.affects.size(); ++entry) {
			  UMLfile.println("<constrainedElement xmi:idref='" + rule.affects.get(entry).id + "'/>"); 
		  }
	  }

	  /* output the rule body
	   * was 'expression', now 'specification'
	   */
	  UMLfile.println(
		  "<specification xmi:type='uml:OpaqueExpression' xmi:id='" + rule.id
		  + "' language='" + rule.language 
		  + "' body='" + xml_string(rule.body) + "'/>");

	  /* if it has a text form, output that as well */
	  output_definition(rule);

	  UMLfile.println("</ownedRule>");
	}
	
	/* output the definition of a model element per XMI 2.1 
	 */
	static void output_definition(UmlElement me)
	{
		UmlComment def;
		for (def = me.firstComment; def != null; def = def.sister) {
			UMLfile.println("<ownedComment xmi:type='uml:Comment' xmi:id='" + def.id
					+ "' body='" + xml_string(def.name) + "'>");
			UMLfile.println("<annotatedElement xmi:idref='" + me.id + "'/>");
			UMLfile.println("</ownedComment>");
		}
	}

	/** xml_string(String)
	 *  convert the input string to a valid XML string, by escaping special XML characters
	 *  @param raw = the "raw" input string
	 *  @return the raw string, or the revised string with escaped XML characters
	 */
	private static int xmlbufsize = 1024;
	private static StringBuffer xmlbuf = new StringBuffer(xmlbufsize);
	private static String xml_string(String raw)
	{
		int size = raw.length();
		int rpos;
		
		/* scan the raw string for sentinel characters */
		int hits = 0;
		for (rpos = 0; rpos < size; ++rpos) {
			if (raw.charAt(rpos) == '<' || raw.charAt(rpos) == '>' || raw.charAt(rpos) =='&'
				|| raw.charAt(rpos) == '\'' || raw.charAt(rpos) == '"') ++hits;
		}

		/* if none, return as is */
		if (hits == 0) return raw;

		/* substitutions needed */
		
		/* create space for the replacement string, 
		 * allowing 6 characters for each replacement */
		hits = 5 * hits + size;
		if (hits > xmlbufsize) {
			while (hits > xmlbufsize) xmlbufsize += 1024;
			xmlbuf = new StringBuffer(xmlbufsize);
		}
		xmlbuf.setLength(0);
		
		/* copy the raw string, replacing the sentinel characters */
		for (rpos = 0; rpos < size; ++rpos) {
			if (raw.charAt(rpos) == '<') {
				xmlbuf.append("&lt;");
			} else if (raw.charAt(rpos) == '>') {
				xmlbuf.append("&gt;");
			} else if (raw.charAt(rpos) == '&') {
				xmlbuf.append("&amp;");
			} else if (raw.charAt(rpos) == '\'') {
				xmlbuf.append("&apos;");
			} else if (raw.charAt(rpos) == '"') {
				xmlbuf.append("&quot;");
			} else {
				xmlbuf.append(raw.charAt(rpos));
			}
		}

		/* return the replacement */
		return xmlbuf.toString();
	}

}
