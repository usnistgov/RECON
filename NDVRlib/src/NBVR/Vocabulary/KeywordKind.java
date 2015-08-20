/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Keyword Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see NBVR.Vocabulary.VocabularyPackage#getKeywordKind()
 * @model
 * @generated
 */
public enum KeywordKind implements Enumerator {
	/**
	 * The '<em><b>Adjunct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUNCT_VALUE
	 * @generated
	 * @ordered
	 */
	ADJUNCT(0, "Adjunct", "Adjunct"), /**
	 * The '<em><b>KAn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAN_VALUE
	 * @generated
	 * @ordered
	 */
	KAN(1, "K_An", "K_An"), /**
	 * The '<em><b>KThe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHE_VALUE
	 * @generated
	 * @ordered
	 */
	KTHE(2, "K_The", "K_The"), /**
	 * The '<em><b>KAll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KALL_VALUE
	 * @generated
	 * @ordered
	 */
	KALL(3, "K_All", "K_All"), /**
	 * The '<em><b>KNone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNONE_VALUE
	 * @generated
	 * @ordered
	 */
	KNONE(4, "K_None", "K_None"), /**
	 * The '<em><b>KNo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNO_VALUE
	 * @generated
	 * @ordered
	 */
	KNO(5, "K_No", "K_No"), /**
	 * The '<em><b>KAny</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KANY_VALUE
	 * @generated
	 * @ordered
	 */
	KANY(6, "K_Any", "K_Any"), /**
	 * The '<em><b>KOne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KONE_VALUE
	 * @generated
	 * @ordered
	 */
	KONE(7, "K_One", "K_One"), /**
	 * The '<em><b>KAt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAT_VALUE
	 * @generated
	 * @ordered
	 */
	KAT(8, "K_At", "K_At"), /**
	 * The '<em><b>KLeast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLEAST_VALUE
	 * @generated
	 * @ordered
	 */
	KLEAST(9, "K_Least", "K_Least"), /**
	 * The '<em><b>KLess</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLESS_VALUE
	 * @generated
	 * @ordered
	 */
	KLESS(10, "K_Less", "K_Less"), /**
	 * The '<em><b>KMost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMOST_VALUE
	 * @generated
	 * @ordered
	 */
	KMOST(11, "K_Most", "K_Most"), /**
	 * The '<em><b>KMore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMORE_VALUE
	 * @generated
	 * @ordered
	 */
	KMORE(12, "K_More", "K_More"), /**
	 * The '<em><b>KThan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	KTHAN(13, "K_Than", "K_Than"), /**
	 * The '<em><b>KExactly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEXACTLY_VALUE
	 * @generated
	 * @ordered
	 */
	KEXACTLY(14, "K_Exactly", "K_Exactly"), /**
	 * The '<em><b>KMany</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMANY_VALUE
	 * @generated
	 * @ordered
	 */
	KMANY(15, "K_Many", "K_Many"), /**
	 * The '<em><b>KNot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOT_VALUE
	 * @generated
	 * @ordered
	 */
	KNOT(16, "K_Not", "K_Not"), /**
	 * The '<em><b>KAnd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAND_VALUE
	 * @generated
	 * @ordered
	 */
	KAND(17, "K_And", "K_And"), /**
	 * The '<em><b>KOr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOR_VALUE
	 * @generated
	 * @ordered
	 */
	KOR(18, "K_Or", "K_Or"), /**
	 * The '<em><b>KIf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIF_VALUE
	 * @generated
	 * @ordered
	 */
	KIF(19, "K_If", "K_If"), /**
	 * The '<em><b>KThen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHEN_VALUE
	 * @generated
	 * @ordered
	 */
	KTHEN(20, "K_Then", "K_Then"), /**
	 * The '<em><b>KElse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KELSE_VALUE
	 * @generated
	 * @ordered
	 */
	KELSE(21, "K_Else", "K_Else"), /**
	 * The '<em><b>KOnly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KONLY_VALUE
	 * @generated
	 * @ordered
	 */
	KONLY(22, "K_Only", "K_Only"), /**
	 * The '<em><b>KUnless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUNLESS_VALUE
	 * @generated
	 * @ordered
	 */
	KUNLESS(23, "K_Unless", "K_Unless"), /**
	 * The '<em><b>KSame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KSAME_VALUE
	 * @generated
	 * @ordered
	 */
	KSAME(24, "K_Same", "K_Same"), /**
	 * The '<em><b>KDifferent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KDIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	KDIFFERENT(25, "K_Different", "K_Different"), /**
	 * The '<em><b>KOther</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOTHER_VALUE
	 * @generated
	 * @ordered
	 */
	KOTHER(26, "K_Other", "K_Other"), /**
	 * The '<em><b>KAnother</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KANOTHER_VALUE
	 * @generated
	 * @ordered
	 */
	KANOTHER(27, "K_Another", "K_Another"), /**
	 * The '<em><b>KMust</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMUST_VALUE
	 * @generated
	 * @ordered
	 */
	KMUST(28, "K_Must", "K_Must"), /**
	 * The '<em><b>KMay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMAY_VALUE
	 * @generated
	 * @ordered
	 */
	KMAY(29, "K_May", "K_May"), /**
	 * The '<em><b>KAlways</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	KALWAYS(30, "K_Always", "K_Always"), /**
	 * The '<em><b>KThat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHAT_VALUE
	 * @generated
	 * @ordered
	 */
	KTHAT(31, "K_That", "K_That"), /**
	 * The '<em><b>KWhose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHOSE_VALUE
	 * @generated
	 * @ordered
	 */
	KWHOSE(32, "K_Whose", "K_Whose"), /**
	 * The '<em><b>Anaphor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANAPHOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANAPHOR(33, "Anaphor", "Anaphor"), /**
	 * The '<em><b>Pronoun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRONOUN_VALUE
	 * @generated
	 * @ordered
	 */
	PRONOUN(34, "Pronoun", "Pronoun"), /**
	 * The '<em><b>Genitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	GENITIVE(35, "Genitive", "Genitive"), /**
	 * The '<em><b>KSelf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KSELF_VALUE
	 * @generated
	 * @ordered
	 */
	KSELF(36, "K_Self", "K_Self"), /**
	 * The '<em><b>KEverything</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEVERYTHING_VALUE
	 * @generated
	 * @ordered
	 */
	KEVERYTHING(37, "K_Everything", "K_Everything"), /**
	 * The '<em><b>KSomething</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KSOMETHING_VALUE
	 * @generated
	 * @ordered
	 */
	KSOMETHING(38, "K_Something", "K_Something"), /**
	 * The '<em><b>KAnything</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KANYTHING_VALUE
	 * @generated
	 * @ordered
	 */
	KANYTHING(39, "K_Anything", "K_Anything"), /**
	 * The '<em><b>KNothing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOTHING_VALUE
	 * @generated
	 * @ordered
	 */
	KNOTHING(40, "K_Nothing", "K_Nothing"), /**
	 * The '<em><b>KWhether</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHETHER_VALUE
	 * @generated
	 * @ordered
	 */
	KWHETHER(41, "K_Whether", "K_Whether"), /**
	 * The '<em><b>KWhat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHAT_VALUE
	 * @generated
	 * @ordered
	 */
	KWHAT(42, "K_What", "K_What"), /**
	 * The '<em><b>KWhich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHICH_VALUE
	 * @generated
	 * @ordered
	 */
	KWHICH(43, "K_Which", "K_Which"), /**
	 * The '<em><b>KWhere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHERE_VALUE
	 * @generated
	 * @ordered
	 */
	KWHERE(44, "K_Where", "K_Where"), /**
	 * The '<em><b>KWhen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHEN_VALUE
	 * @generated
	 * @ordered
	 */
	KWHEN(45, "K_When", "K_When"), /**
	 * The '<em><b>KWhy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KWHY_VALUE
	 * @generated
	 * @ordered
	 */
	KWHY(46, "K_Why", "K_Why"), /**
	 * The '<em><b>KHow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KHOW_VALUE
	 * @generated
	 * @ordered
	 */
	KHOW(47, "K_How", "K_How"), /**
	 * The '<em><b>KThis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHIS_VALUE
	 * @generated
	 * @ordered
	 */
	KTHIS(48, "K_This", "K_This"), /**
	 * The '<em><b>KBoth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBOTH_VALUE
	 * @generated
	 * @ordered
	 */
	KBOTH(49, "K_Both", "K_Both"), /**
	 * The '<em><b>KEither</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEITHER_VALUE
	 * @generated
	 * @ordered
	 */
	KEITHER(50, "K_Either", "K_Either"), /**
	 * The '<em><b>KNeither</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNEITHER_VALUE
	 * @generated
	 * @ordered
	 */
	KNEITHER(51, "K_Neither", "K_Neither"), /**
	 * The '<em><b>KNor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOR_VALUE
	 * @generated
	 * @ordered
	 */
	KNOR(52, "K_Nor", "K_Nor"), /**
	 * The '<em><b>KTogether</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTOGETHER_VALUE
	 * @generated
	 * @ordered
	 */
	KTOGETHER(53, "K_Together", "K_Together"), /**
	 * The '<em><b>KBut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBUT_VALUE
	 * @generated
	 * @ordered
	 */
	KBUT(54, "K_But", "K_But"), /**
	 * The '<em><b>KInstead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINSTEAD_VALUE
	 * @generated
	 * @ordered
	 */
	KINSTEAD(55, "K_Instead", "K_Instead"), /**
	 * The '<em><b>KThere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KTHERE_VALUE
	 * @generated
	 * @ordered
	 */
	KTHERE(56, "K_There", "K_There"), /**
	 * The '<em><b>KFor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KFOR_VALUE
	 * @generated
	 * @ordered
	 */
	KFOR(57, "K_For", "K_For"), /**
	 * The '<em><b>KAs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAS_VALUE
	 * @generated
	 * @ordered
	 */
	KAS(58, "K_As", "K_As"), /**
	 * The '<em><b>KOf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOF_VALUE
	 * @generated
	 * @ordered
	 */
	KOF(59, "K_Of", "K_Of"), /**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(60, "Function", "Function");

	/**
	 * The '<em><b>Adjunct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At, By, Neither, Either
	 * <!-- end-model-doc -->
	 * @see #ADJUNCT
	 * @model name="Adjunct"
	 * @generated
	 * @ordered
	 */
	public static final int ADJUNCT_VALUE = 0;

	/**
	 * The '<em><b>KAn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A, An, Any, Some
	 * <!-- end-model-doc -->
	 * @see #KAN
	 * @model name="K_An"
	 * @generated
	 * @ordered
	 */
	public static final int KAN_VALUE = 1;

	/**
	 * The '<em><b>KThe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KThe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTHE
	 * @model name="K_The"
	 * @generated
	 * @ordered
	 */
	public static final int KTHE_VALUE = 2;

	/**
	 * The '<em><b>KAll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All, Each, Every
	 * <!-- end-model-doc -->
	 * @see #KALL
	 * @model name="K_All"
	 * @generated
	 * @ordered
	 */
	public static final int KALL_VALUE = 3;

	/**
	 * The '<em><b>KNone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNONE
	 * @model name="K_None"
	 * @generated
	 * @ordered
	 */
	public static final int KNONE_VALUE = 4;

	/**
	 * The '<em><b>KNo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNO
	 * @model name="K_No"
	 * @generated
	 * @ordered
	 */
	public static final int KNO_VALUE = 5;

	/**
	 * The '<em><b>KAny</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAny</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KANY
	 * @model name="K_Any"
	 * @generated
	 * @ordered
	 */
	public static final int KANY_VALUE = 6;

	/**
	 * The '<em><b>KOne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (exactly) One
	 * <!-- end-model-doc -->
	 * @see #KONE
	 * @model name="K_One"
	 * @generated
	 * @ordered
	 */
	public static final int KONE_VALUE = 7;

	/**
	 * The '<em><b>KAt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAT
	 * @model name="K_At"
	 * @generated
	 * @ordered
	 */
	public static final int KAT_VALUE = 8;

	/**
	 * The '<em><b>KLeast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (at) Least
	 * <!-- end-model-doc -->
	 * @see #KLEAST
	 * @model name="K_Least"
	 * @generated
	 * @ordered
	 */
	public static final int KLEAST_VALUE = 9;

	/**
	 * The '<em><b>KLess</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KLess</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KLESS
	 * @model name="K_Less"
	 * @generated
	 * @ordered
	 */
	public static final int KLESS_VALUE = 10;

	/**
	 * The '<em><b>KMost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (at) Most
	 * <!-- end-model-doc -->
	 * @see #KMOST
	 * @model name="K_Most"
	 * @generated
	 * @ordered
	 */
	public static final int KMOST_VALUE = 11;

	/**
	 * The '<em><b>KMore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMORE
	 * @model name="K_More"
	 * @generated
	 * @ordered
	 */
	public static final int KMORE_VALUE = 12;

	/**
	 * The '<em><b>KThan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KThan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTHAN
	 * @model name="K_Than"
	 * @generated
	 * @ordered
	 */
	public static final int KTHAN_VALUE = 13;

	/**
	 * The '<em><b>KExactly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KExactly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEXACTLY
	 * @model name="K_Exactly"
	 * @generated
	 * @ordered
	 */
	public static final int KEXACTLY_VALUE = 14;

	/**
	 * The '<em><b>KMany</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMany</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMANY
	 * @model name="K_Many"
	 * @generated
	 * @ordered
	 */
	public static final int KMANY_VALUE = 15;

	/**
	 * The '<em><b>KNot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOT
	 * @model name="K_Not"
	 * @generated
	 * @ordered
	 */
	public static final int KNOT_VALUE = 16;

	/**
	 * The '<em><b>KAnd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAnd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAND
	 * @model name="K_And"
	 * @generated
	 * @ordered
	 */
	public static final int KAND_VALUE = 17;

	/**
	 * The '<em><b>KOr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOR
	 * @model name="K_Or"
	 * @generated
	 * @ordered
	 */
	public static final int KOR_VALUE = 18;

	/**
	 * The '<em><b>KIf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KIf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KIF
	 * @model name="K_If"
	 * @generated
	 * @ordered
	 */
	public static final int KIF_VALUE = 19;

	/**
	 * The '<em><b>KThen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KThen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTHEN
	 * @model name="K_Then"
	 * @generated
	 * @ordered
	 */
	public static final int KTHEN_VALUE = 20;

	/**
	 * The '<em><b>KElse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KElse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KELSE
	 * @model name="K_Else"
	 * @generated
	 * @ordered
	 */
	public static final int KELSE_VALUE = 21;

	/**
	 * The '<em><b>KOnly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOnly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KONLY
	 * @model name="K_Only"
	 * @generated
	 * @ordered
	 */
	public static final int KONLY_VALUE = 22;

	/**
	 * The '<em><b>KUnless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KUnless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KUNLESS
	 * @model name="K_Unless"
	 * @generated
	 * @ordered
	 */
	public static final int KUNLESS_VALUE = 23;

	/**
	 * The '<em><b>KSame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KSame</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KSAME
	 * @model name="K_Same"
	 * @generated
	 * @ordered
	 */
	public static final int KSAME_VALUE = 24;

	/**
	 * The '<em><b>KDifferent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KDifferent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KDIFFERENT
	 * @model name="K_Different"
	 * @generated
	 * @ordered
	 */
	public static final int KDIFFERENT_VALUE = 25;

	/**
	 * The '<em><b>KOther</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOther</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOTHER
	 * @model name="K_Other"
	 * @generated
	 * @ordered
	 */
	public static final int KOTHER_VALUE = 26;

	/**
	 * The '<em><b>KAnother</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAnother</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KANOTHER
	 * @model name="K_Another"
	 * @generated
	 * @ordered
	 */
	public static final int KANOTHER_VALUE = 27;

	/**
	 * The '<em><b>KMust</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMust</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMUST
	 * @model name="K_Must"
	 * @generated
	 * @ordered
	 */
	public static final int KMUST_VALUE = 28;

	/**
	 * The '<em><b>KMay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMAY
	 * @model name="K_May"
	 * @generated
	 * @ordered
	 */
	public static final int KMAY_VALUE = 29;

	/**
	 * The '<em><b>KAlways</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAlways</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KALWAYS
	 * @model name="K_Always"
	 * @generated
	 * @ordered
	 */
	public static final int KALWAYS_VALUE = 30;

	/**
	 * The '<em><b>KThat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * That used to introduce a reification
	 * <!-- end-model-doc -->
	 * @see #KTHAT
	 * @model name="K_That"
	 * @generated
	 * @ordered
	 */
	public static final int KTHAT_VALUE = 31;

	/**
	 * The '<em><b>KWhose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhose</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHOSE
	 * @model name="K_Whose"
	 * @generated
	 * @ordered
	 */
	public static final int KWHOSE_VALUE = 32;

	/**
	 * The '<em><b>Anaphor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * that, which, who, where, when
	 * <!-- end-model-doc -->
	 * @see #ANAPHOR
	 * @model name="Anaphor"
	 * @generated
	 * @ordered
	 */
	public static final int ANAPHOR_VALUE = 33;

	/**
	 * The '<em><b>Pronoun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pronoun</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRONOUN
	 * @model name="Pronoun"
	 * @generated
	 * @ordered
	 */
	public static final int PRONOUN_VALUE = 34;

	/**
	 * The '<em><b>Genitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Genitive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENITIVE
	 * @model name="Genitive"
	 * @generated
	 * @ordered
	 */
	public static final int GENITIVE_VALUE = 35;

	/**
	 * The '<em><b>KSelf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KSelf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KSELF
	 * @model name="K_Self"
	 * @generated
	 * @ordered
	 */
	public static final int KSELF_VALUE = 36;

	/**
	 * The '<em><b>KEverything</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEverything</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEVERYTHING
	 * @model name="K_Everything"
	 * @generated
	 * @ordered
	 */
	public static final int KEVERYTHING_VALUE = 37;

	/**
	 * The '<em><b>KSomething</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KSomething</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KSOMETHING
	 * @model name="K_Something"
	 * @generated
	 * @ordered
	 */
	public static final int KSOMETHING_VALUE = 38;

	/**
	 * The '<em><b>KAnything</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAnything</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KANYTHING
	 * @model name="K_Anything"
	 * @generated
	 * @ordered
	 */
	public static final int KANYTHING_VALUE = 39;

	/**
	 * The '<em><b>KNothing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNothing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOTHING
	 * @model name="K_Nothing"
	 * @generated
	 * @ordered
	 */
	public static final int KNOTHING_VALUE = 40;

	/**
	 * The '<em><b>KWhether</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhether</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHETHER
	 * @model name="K_Whether"
	 * @generated
	 * @ordered
	 */
	public static final int KWHETHER_VALUE = 41;

	/**
	 * The '<em><b>KWhat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHAT
	 * @model name="K_What"
	 * @generated
	 * @ordered
	 */
	public static final int KWHAT_VALUE = 42;

	/**
	 * The '<em><b>KWhich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHICH
	 * @model name="K_Which"
	 * @generated
	 * @ordered
	 */
	public static final int KWHICH_VALUE = 43;

	/**
	 * The '<em><b>KWhere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhere</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHERE
	 * @model name="K_Where"
	 * @generated
	 * @ordered
	 */
	public static final int KWHERE_VALUE = 44;

	/**
	 * The '<em><b>KWhen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHEN
	 * @model name="K_When"
	 * @generated
	 * @ordered
	 */
	public static final int KWHEN_VALUE = 45;

	/**
	 * The '<em><b>KWhy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KWhy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KWHY
	 * @model name="K_Why"
	 * @generated
	 * @ordered
	 */
	public static final int KWHY_VALUE = 46;

	/**
	 * The '<em><b>KHow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KHow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KHOW
	 * @model name="K_How"
	 * @generated
	 * @ordered
	 */
	public static final int KHOW_VALUE = 47;

	/**
	 * The '<em><b>KThis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KThis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTHIS
	 * @model name="K_This"
	 * @generated
	 * @ordered
	 */
	public static final int KTHIS_VALUE = 48;

	/**
	 * The '<em><b>KBoth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KBoth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KBOTH
	 * @model name="K_Both"
	 * @generated
	 * @ordered
	 */
	public static final int KBOTH_VALUE = 49;

	/**
	 * The '<em><b>KEither</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEither</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEITHER
	 * @model name="K_Either"
	 * @generated
	 * @ordered
	 */
	public static final int KEITHER_VALUE = 50;

	/**
	 * The '<em><b>KNeither</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNeither</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNEITHER
	 * @model name="K_Neither"
	 * @generated
	 * @ordered
	 */
	public static final int KNEITHER_VALUE = 51;

	/**
	 * The '<em><b>KNor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOR
	 * @model name="K_Nor"
	 * @generated
	 * @ordered
	 */
	public static final int KNOR_VALUE = 52;

	/**
	 * The '<em><b>KTogether</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KTogether</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTOGETHER
	 * @model name="K_Together"
	 * @generated
	 * @ordered
	 */
	public static final int KTOGETHER_VALUE = 53;

	/**
	 * The '<em><b>KBut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KBut</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KBUT
	 * @model name="K_But"
	 * @generated
	 * @ordered
	 */
	public static final int KBUT_VALUE = 54;

	/**
	 * The '<em><b>KInstead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KInstead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KINSTEAD
	 * @model name="K_Instead"
	 * @generated
	 * @ordered
	 */
	public static final int KINSTEAD_VALUE = 55;

	/**
	 * The '<em><b>KThere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KThere</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KTHERE
	 * @model name="K_There"
	 * @generated
	 * @ordered
	 */
	public static final int KTHERE_VALUE = 56;

	/**
	 * The '<em><b>KFor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KFor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KFOR
	 * @model name="K_For"
	 * @generated
	 * @ordered
	 */
	public static final int KFOR_VALUE = 57;

	/**
	 * The '<em><b>KAs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAS
	 * @model name="K_As"
	 * @generated
	 * @ordered
	 */
	public static final int KAS_VALUE = 58;

	/**
	 * The '<em><b>KOf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOF
	 * @model name="K_Of"
	 * @generated
	 * @ordered
	 */
	public static final int KOF_VALUE = 59;

	/**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Of, For
	 * <!-- end-model-doc -->
	 * @see #FUNCTION
	 * @model name="Function"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 60;

	/**
	 * An array of all the '<em><b>Keyword Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KeywordKind[] VALUES_ARRAY =
		new KeywordKind[] {
			ADJUNCT,
			KAN,
			KTHE,
			KALL,
			KNONE,
			KNO,
			KANY,
			KONE,
			KAT,
			KLEAST,
			KLESS,
			KMOST,
			KMORE,
			KTHAN,
			KEXACTLY,
			KMANY,
			KNOT,
			KAND,
			KOR,
			KIF,
			KTHEN,
			KELSE,
			KONLY,
			KUNLESS,
			KSAME,
			KDIFFERENT,
			KOTHER,
			KANOTHER,
			KMUST,
			KMAY,
			KALWAYS,
			KTHAT,
			KWHOSE,
			ANAPHOR,
			PRONOUN,
			GENITIVE,
			KSELF,
			KEVERYTHING,
			KSOMETHING,
			KANYTHING,
			KNOTHING,
			KWHETHER,
			KWHAT,
			KWHICH,
			KWHERE,
			KWHEN,
			KWHY,
			KHOW,
			KTHIS,
			KBOTH,
			KEITHER,
			KNEITHER,
			KNOR,
			KTOGETHER,
			KBUT,
			KINSTEAD,
			KTHERE,
			KFOR,
			KAS,
			KOF,
			FUNCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Keyword Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KeywordKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Keyword Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeywordKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeywordKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Keyword Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeywordKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KeywordKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Keyword Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeywordKind get(int value) {
		switch (value) {
			case ADJUNCT_VALUE: return ADJUNCT;
			case KAN_VALUE: return KAN;
			case KTHE_VALUE: return KTHE;
			case KALL_VALUE: return KALL;
			case KNONE_VALUE: return KNONE;
			case KNO_VALUE: return KNO;
			case KANY_VALUE: return KANY;
			case KONE_VALUE: return KONE;
			case KAT_VALUE: return KAT;
			case KLEAST_VALUE: return KLEAST;
			case KLESS_VALUE: return KLESS;
			case KMOST_VALUE: return KMOST;
			case KMORE_VALUE: return KMORE;
			case KTHAN_VALUE: return KTHAN;
			case KEXACTLY_VALUE: return KEXACTLY;
			case KMANY_VALUE: return KMANY;
			case KNOT_VALUE: return KNOT;
			case KAND_VALUE: return KAND;
			case KOR_VALUE: return KOR;
			case KIF_VALUE: return KIF;
			case KTHEN_VALUE: return KTHEN;
			case KELSE_VALUE: return KELSE;
			case KONLY_VALUE: return KONLY;
			case KUNLESS_VALUE: return KUNLESS;
			case KSAME_VALUE: return KSAME;
			case KDIFFERENT_VALUE: return KDIFFERENT;
			case KOTHER_VALUE: return KOTHER;
			case KANOTHER_VALUE: return KANOTHER;
			case KMUST_VALUE: return KMUST;
			case KMAY_VALUE: return KMAY;
			case KALWAYS_VALUE: return KALWAYS;
			case KTHAT_VALUE: return KTHAT;
			case KWHOSE_VALUE: return KWHOSE;
			case ANAPHOR_VALUE: return ANAPHOR;
			case PRONOUN_VALUE: return PRONOUN;
			case GENITIVE_VALUE: return GENITIVE;
			case KSELF_VALUE: return KSELF;
			case KEVERYTHING_VALUE: return KEVERYTHING;
			case KSOMETHING_VALUE: return KSOMETHING;
			case KANYTHING_VALUE: return KANYTHING;
			case KNOTHING_VALUE: return KNOTHING;
			case KWHETHER_VALUE: return KWHETHER;
			case KWHAT_VALUE: return KWHAT;
			case KWHICH_VALUE: return KWHICH;
			case KWHERE_VALUE: return KWHERE;
			case KWHEN_VALUE: return KWHEN;
			case KWHY_VALUE: return KWHY;
			case KHOW_VALUE: return KHOW;
			case KTHIS_VALUE: return KTHIS;
			case KBOTH_VALUE: return KBOTH;
			case KEITHER_VALUE: return KEITHER;
			case KNEITHER_VALUE: return KNEITHER;
			case KNOR_VALUE: return KNOR;
			case KTOGETHER_VALUE: return KTOGETHER;
			case KBUT_VALUE: return KBUT;
			case KINSTEAD_VALUE: return KINSTEAD;
			case KTHERE_VALUE: return KTHERE;
			case KFOR_VALUE: return KFOR;
			case KAS_VALUE: return KAS;
			case KOF_VALUE: return KOF;
			case FUNCTION_VALUE: return FUNCTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private KeywordKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //KeywordKind
