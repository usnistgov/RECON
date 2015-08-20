/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package NBVR.Vocabulary.impl;

import NBVR.Vocabulary.VocabularyPackage;
import NBVR.Vocabulary.Word;
import NBVR.Vocabulary.WordForm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link NBVR.Vocabulary.impl.WordFormImpl#getText <em>Text</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.WordFormImpl#getNext <em>Next</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.WordFormImpl#getWord <em>Word</em>}</li>
 *   <li>{@link NBVR.Vocabulary.impl.WordFormImpl#getAltWord <em>Alt Word</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WordFormImpl extends EObjectImpl implements WordForm {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	
	/*  -- static info structures -- */
	
	/** the hash bucket count
	 * @generated not
	 */
	private static final int HASHBUCKETS = 4096;
	
	/** the maximum hash character count
	 * @generated not
	 */	
	private static final int HASHCHARS = 32;
	
	/** the hash buckets
	 * @generated not
	 */
	private static WordFormImpl[] bucket = new WordFormImpl[HASHBUCKETS];

	/* the hash value for each 8-bit character */
	private static final int[] hashtab = {
		  660, 957, 756, 942, 1812, 1688, 797, 1960, 1187, 1267, 1802, 405,
		  123, 1709, 1608, 1304, 910, 1248, 1974, 576, 1735, 2045, 683, 1485,
		  1741, 1787, 1038, 114, 122, 921, 1814, 444, 1874, 12, 1278, 772,
		  962, 1961, 1588, 239, 1530, 242, 86, 1892, 1323, 659, 1408, 952,
		  7, 661, 759, 1850, 752, 1222, 1227, 1744, 740, 1491, 1650, 1649,
		  1781, 1872, 1413, 1998, 
		  /* 'A' to 'Z' */
		  717, 1192, 1572, 1201, 1877, 1859, 4, 1791,
		  694, 250, 1681, 621, 1859, 844, 1813, 592, 769, 1968, 1907, 300,
		  355, 864, 492, 1943, 1328, 1532, 1398, 503, 881, 1787, 1735, 1349,
		  /* 'a' to 'z' */
		  479, 250, 2010, 545, 419, 1289, 29, 265, 769, 1005, 1317, 1921,
		  1783, 1633, 1877, 1795, 657, 861, 1590, 1504, 565, 1857, 1194, 753,
		  1097, 652, 
		  1952, 1589, 712, 1941, 393, 971, 1765, 1117, 1506, 1064, 
		  465, 668, 871, 1281, 391, 1995, 281, 146, 1898, 1027, 889, 1416,
		  1314, 1305, 1273, 1535, 1525, 1725, 584, 1212, 1520, 839, 1133, 855,
		  1960, 537, 1180, 945, 
		  /* Latin-1 marked characters */
		  1936, 123, 1534, 1272, 1944, 780, 1756, 1414,
		  410, 833, 1186, 452, 1759, 668, 605, 805, 675, 1158, 1143, 396,
		  1128, 1275, 1700, 2040, 907, 1346, 1751, 1005, 205, 1793, 136, 1021,
		  153, 1981, 175, 501, 1803, 683, 615, 1314, 1421, 564, 1696, 1994,
		  969, 309, 757, 595, 205, 208, 179, 112, 1709, 889, 1055, 1218,
		  1637, 1697, 1269, 1653, 284, 1450, 1517, 1658, 89, 1573, 1076, 1096,
		  1793, 1436, 76, 1178, 874, 1341, 777, 1584, 226, 904, 1609, 19,
		  166, 881, 177, 449, 1352, 1871, 715, 1885, 1952, 369, 1854, 1671,
		  813, 425, 755, 70
	};


	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *  text of this word form
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * next word form in the same hash bucket
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected WordForm next;

	/**
	 * The cached value of the '{@link #getWord() <em>Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * the Word of which this WordForm is a form
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected Word word;

	/**
	 * The cached value of the '{@link #getAltWord() <em>Alt Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltWord()
	 * @generated
	 * @ordered
	 */
	protected Word altWord;

	/**
	 * <!-- begin-user-doc -->
	 * generated constructor 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * standard constructor for processed vocabulary entries
	 * Note: this constructor does not prevent duplication
	 * if necessary, the caller should use find first
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected WordFormImpl(char[] intext, int size) 
	{
		super();
	
		/* compute hash */
		int hash = calchash(intext, size);
		
		setNext(bucket[hash]);
		bucket[hash] = this;
		setText(new String(intext, 0, size));
		word = null;
	}
	
	/** 
	 * special constructor for internally generated words
	 *   (keywords, and preloaded verbs)
	 * @generated not
	 */
	protected WordFormImpl(String intext)
	{
		super();
		int hash = calchash(intext);
		
		setNext(bucket[hash]);
		bucket[hash] = this;
		setText(intext);
		word = null;
	}

	/** match
	 *   returns true if the word form text matches the passed char array
	 *   false otherwise
	 * @generated not
	 */
	public boolean match(char[] intext, int size)
	{
		int c;
		
		if (size != text.length()) return false;

		for (c = 0; c < size; ++c) {
			if (intext[c] != text.charAt(c)) return false;
		}
		return true;		
	}	

	/** match
	 *   returns true if the word form text matches the passed StringBuffer content
	 *   false otherwise
	 * @generated not
	 */
	public boolean match(StringBuffer intext)
	{
		int c;
		
		if (intext.length() != text.length()) return false;

		for (c = 0; c < intext.length(); ++c) {
			if (intext.charAt(c) != text.charAt(c)) return false;
		}
		return true;		
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VocabularyPackage.Literals.WORD_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.WORD_FORM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (WordForm)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.WORD_FORM__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordForm basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(WordForm newNext) {
		WordForm oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.WORD_FORM__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Word getWord() {
		if (word != null && word.eIsProxy()) {
			InternalEObject oldWord = (InternalEObject)word;
			word = (Word)eResolveProxy(oldWord);
			if (word != oldWord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.WORD_FORM__WORD, oldWord, word));
			}
		}
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Word basicGetWord() {
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * set the Word associated with the WordForm if it has not already been set
	 * complain if the would-be new value is different from the old value
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setWord(Word newWord) {
		Word oldWord = word;
		word = newWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, 
					VocabularyPackage.WORD_FORM__WORD, oldWord, word));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Word getAltWord() {
		if (altWord != null && altWord.eIsProxy()) {
			InternalEObject oldAltWord = (InternalEObject)altWord;
			altWord = (Word)eResolveProxy(oldAltWord);
			if (altWord != oldAltWord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VocabularyPackage.WORD_FORM__ALT_WORD, oldAltWord, altWord));
			}
		}
		return altWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Word basicGetAltWord() {
		return altWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltWord(Word newAltWord) {
		Word oldAltWord = altWord;
		altWord = newAltWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VocabularyPackage.WORD_FORM__ALT_WORD, oldAltWord, altWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VocabularyPackage.WORD_FORM__TEXT:
				return getText();
			case VocabularyPackage.WORD_FORM__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case VocabularyPackage.WORD_FORM__WORD:
				if (resolve) return getWord();
				return basicGetWord();
			case VocabularyPackage.WORD_FORM__ALT_WORD:
				if (resolve) return getAltWord();
				return basicGetAltWord();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VocabularyPackage.WORD_FORM__TEXT:
				setText((String)newValue);
				return;
			case VocabularyPackage.WORD_FORM__NEXT:
				setNext((WordForm)newValue);
				return;
			case VocabularyPackage.WORD_FORM__WORD:
				setWord((Word)newValue);
				return;
			case VocabularyPackage.WORD_FORM__ALT_WORD:
				setAltWord((Word)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VocabularyPackage.WORD_FORM__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case VocabularyPackage.WORD_FORM__NEXT:
				setNext((WordForm)null);
				return;
			case VocabularyPackage.WORD_FORM__WORD:
				setWord((Word)null);
				return;
			case VocabularyPackage.WORD_FORM__ALT_WORD:
				setAltWord((Word)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VocabularyPackage.WORD_FORM__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case VocabularyPackage.WORD_FORM__NEXT:
				return next != null;
			case VocabularyPackage.WORD_FORM__WORD:
				return word != null;
			case VocabularyPackage.WORD_FORM__ALT_WORD:
				return altWord != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}
	
	/* ------------ static methods ------------------ */
	
	/** initialize
	 *  create and initialize the hash bucket list
	 *  @generated not
	 */
	public static void initialize() 
	{
		int hash;
		
		bucket = new WordFormImpl[HASHBUCKETS];
		for (hash = 0; hash < HASHBUCKETS; ++hash) bucket[hash] = null;
	}
	
	/** calchash 
	 *  routine to calculate the hash of a word as array of character
	 *  @generated not
	 */
	private static int calchash(char[] s, int nchars)
	{
	  int hash, calcsize;

	  if (nchars > HASHCHARS)
	    calcsize = HASHCHARS;
	  else
	    calcsize = nchars;

	  hash = nchars;
	  while (calcsize > 0) {
		  --calcsize;
		  hash += hashtab[s[calcsize] & 0xff];
	  }
	  hash &= (HASHBUCKETS - 1);
	  return (hash);
	}
	
	/** calchash alternate for string
	 *  routine to calculate the hash of a word provided as a string
	 *  @generated not
	 */
	private static int calchash(String s)
	{
	  int hash, calcsize;
	  int nchars = s.length();

	  if (nchars > HASHCHARS)
	    calcsize = HASHCHARS;
	  else
	    calcsize = nchars;

	  hash = nchars;
	  while (calcsize > 0) {
		  --calcsize;
		  hash += hashtab[s.charAt(calcsize) & 0xff];
	  }
	  hash &= (HASHBUCKETS - 1);
	  return (hash);
	}
	
	/** calchash for StringBuffer
	 *  routine to calculate the hash of a word as the content of a StringBuffer
	 *  @generated not
	 */
	private static int calchash(StringBuffer s)
	{
	  int hash, calcsize;

	  if (s.length() > HASHCHARS)
	    calcsize = HASHCHARS;
	  else
	    calcsize = s.length();

	  hash = s.length();
	  while (calcsize > 0) {
		  --calcsize;
		  hash += hashtab[s.charAt(calcsize) & 0xff];
	  }
	  hash &= (HASHBUCKETS - 1);
	  return (hash);
	}
	
	/** find
	 * utility routine to find a word (as char array) among the stored word forms
	 * and return the WordForm
	 *  @generated not
	 */
	public static WordForm find(char[] intext, int size)
	{
	  WordFormImpl entry;
	  int hash;

	  /* check for null string */
	  if (intext == null || size == 0) return null;

	  /* compute hash */
	  hash = calchash(intext, size);

	  /* look for a match in the bucket */
	  for (entry = bucket[hash]; entry != null; entry = (WordFormImpl)entry.getNext()) {
	    /* if bucket entry matches, return it */
	    if (entry.match(intext, size)) return entry;
	  }
	  
	  /* no match */
	  return null;
	}
	
	/** find
	 * utility routine to find a word (as char array) among the stored word forms
	 * and return the WordForm
	 *  @generated not
	 */
	public static WordForm find(String intext)
	{
	  WordFormImpl entry;
	  int hash;

	  /* check for null string */
	  if (intext == null) return null;

	  /* compute hash */
	  hash = calchash(intext);

	  /* look for a match in the bucket */
	  for (entry = bucket[hash]; entry != null; entry = (WordFormImpl)entry.getNext()) {
	    /* if bucket entry matches, return it */
	    if (entry.getText().equals(intext)) return entry;
	  }
	  
	  /* no match */
	  return null;
	}
	
	/** find
	 * utility routine to find a word (as string buffer content) among the stored word forms
	 * and return the WordForm
	 *  @generated not
	 */
	public static WordForm find(StringBuffer intext)
	{
	  WordFormImpl entry;
	  int hash;

	  /* check for null string */
	  if (intext == null || intext.length() == 0) return null;

	  /* compute hash */
	  hash = calchash(intext);

	  /* look for a match in the bucket */
	  for (entry = bucket[hash]; entry != null; entry = (WordFormImpl)entry.getNext()) {
	    /* if bucket entry matches, return it */
	    if (entry.match(intext)) return entry;
	  }
	  
	  /* no match */
	  return null;
	}


} //WordFormImpl
