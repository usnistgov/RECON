/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Grammar.impl;

import NBVR.Grammar.GrammarPackage;
import NBVR.Grammar.InstanceKind;
import NBVR.Grammar.Statement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends NominalizationImpl implements Statement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/** getKind()
	 * @return the kind of Instance this is
	 * For Statement, return STATEMENT
	 * @generated not
	 */
	public InstanceKind getKind()
	{
		return InstanceKind.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.STATEMENT;
	}
	
	/** print()
	 *   print the node in an output of the tree
	 * @param offset the number of spaces to indent
	 * @generated not
	 */
	public void print(int offset, java.io.PrintStream log)
	{
		if (sentence == null) {
			log.print("(Statement ___");
		} else {
			String sp = GrammarFactoryImpl.spaces(offset);
			log.println(sp + "(Statement");
			sentence.print(offset + 2, log);
			log.println(sp + ")");
		}
	}

} //StatementImpl
