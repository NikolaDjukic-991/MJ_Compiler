/* The following code was generated by JFlex 1.4.3 on 9/20/16 6:24 PM */

package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/20/16 6:24 PM from the specification file
 * <tt>spec/mjlexer.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRINGLITERAL = 6;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int CHARLITERAL = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\2\1\2\1\4\1\0\1\2\1\3\22\0\1\1\1\40"+
    "\1\64\1\65\1\65\1\36\1\53\1\60\1\51\1\52\1\34\1\32"+
    "\1\43\1\33\1\55\1\35\1\62\10\57\1\63\1\65\1\44\1\42"+
    "\1\37\1\41\1\65\1\65\32\61\1\47\1\66\1\50\1\65\1\67"+
    "\1\0\1\11\1\30\1\20\1\24\1\16\1\25\1\10\1\27\1\13"+
    "\1\61\1\31\1\22\1\12\1\14\1\7\1\5\1\61\1\6\1\21"+
    "\1\15\1\17\1\56\1\26\1\23\2\61\1\45\1\54\1\46\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\1\13\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\1\1\24"+
    "\1\3\1\25\1\26\1\27\2\30\5\31\1\32\2\33"+
    "\1\34\1\32\2\3\1\35\11\3\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\3\1\46\1\47"+
    "\1\50\11\0\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\4\3\1\61\11\3\1\0\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\70\1\71\2\3\1\72"+
    "\1\3\1\73\1\74\5\3\1\75\1\3\1\76\2\3"+
    "\1\77\1\100\1\101\1\102\1\3\1\103\1\3\1\104"+
    "\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\340\0\u0118\0\u0150"+
    "\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310"+
    "\0\u0348\0\u0380\0\u03b8\0\u03f0\0\340\0\u0428\0\340\0\u0460"+
    "\0\u0498\0\u04d0\0\u0508\0\340\0\340\0\340\0\340\0\340"+
    "\0\340\0\340\0\340\0\u0540\0\u0578\0\340\0\u05b0\0\u05e8"+
    "\0\340\0\340\0\340\0\u0620\0\340\0\u0658\0\u0690\0\u06c8"+
    "\0\u0700\0\340\0\u0738\0\340\0\340\0\u0770\0\u07a8\0\u07e0"+
    "\0\u01c0\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930\0\u0968"+
    "\0\u09a0\0\u09d8\0\340\0\340\0\340\0\340\0\340\0\340"+
    "\0\340\0\340\0\u0a10\0\340\0\340\0\340\0\u0a48\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\340"+
    "\0\340\0\340\0\340\0\340\0\340\0\340\0\340\0\u0c40"+
    "\0\u0c78\0\u0cb0\0\u0ce8\0\u01c0\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0690\0\340\0\340"+
    "\0\340\0\340\0\340\0\340\0\340\0\340\0\u0f18\0\u0f50"+
    "\0\u01c0\0\u0f88\0\u01c0\0\u01c0\0\u0fc0\0\u0ff8\0\u1030\0\u1068"+
    "\0\u10a0\0\u01c0\0\u10d8\0\u01c0\0\u1110\0\u1148\0\u01c0\0\u01c0"+
    "\0\u01c0\0\u01c0\0\u1180\0\u01c0\0\u11b8\0\u01c0\0\u01c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\2\6\1\7\1\0\1\10\1\11\4\12\1\13"+
    "\1\14\1\15\1\16\1\12\1\17\4\12\1\20\1\21"+
    "\1\12\1\22\1\12\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\12\2\50\1\52\3\5\3\53\1\54"+
    "\1\0\63\53\1\55\1\56\2\55\1\0\52\57\2\55"+
    "\1\57\1\60\1\55\2\57\1\61\1\55\3\62\1\63"+
    "\1\64\57\62\1\65\1\62\1\66\1\62\74\0\1\6"+
    "\70\0\1\12\1\67\23\12\22\0\1\12\1\0\2\12"+
    "\1\0\3\12\3\0\1\12\5\0\11\12\1\70\13\12"+
    "\22\0\1\12\1\0\2\12\1\0\3\12\3\0\1\12"+
    "\5\0\25\12\22\0\1\12\1\0\2\12\1\0\3\12"+
    "\3\0\1\12\5\0\20\12\1\71\4\12\22\0\1\12"+
    "\1\0\2\12\1\0\3\12\3\0\1\12\5\0\11\12"+
    "\1\72\13\12\22\0\1\12\1\0\2\12\1\0\3\12"+
    "\3\0\1\12\5\0\1\12\1\73\23\12\22\0\1\12"+
    "\1\0\2\12\1\0\3\12\3\0\1\12\5\0\15\12"+
    "\1\74\1\75\6\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\2\12\1\76\12\12\1\77"+
    "\7\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\4\12\1\100\20\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\22\12\1\101"+
    "\2\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\1\12\1\102\23\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\32\0\1\103\70\0"+
    "\1\104\71\0\1\53\71\0\1\105\67\0\1\106\67\0"+
    "\1\107\67\0\1\110\103\0\1\111\70\0\1\112\20\0"+
    "\2\12\1\113\22\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\57\0\1\50\2\0\2\50\10\0"+
    "\1\114\143\0\1\115\67\0\1\116\42\0\1\117\42\0"+
    "\1\120\5\0\1\121\1\122\7\0\1\123\2\0\1\124"+
    "\27\0\1\125\3\0\1\126\1\0\1\127\5\0\1\64"+
    "\71\0\1\130\5\0\1\131\1\132\7\0\1\133\2\0"+
    "\1\134\27\0\1\135\3\0\1\136\1\0\1\137\6\0"+
    "\2\12\1\140\3\12\1\141\16\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\4\12\1\142"+
    "\3\12\1\143\14\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\21\12\1\144\3\12\22\0"+
    "\1\12\1\0\2\12\1\0\3\12\3\0\1\12\5\0"+
    "\12\12\1\145\12\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\14\12\1\146\10\12\22\0"+
    "\1\12\1\0\2\12\1\0\3\12\3\0\1\12\5\0"+
    "\10\12\1\147\14\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\7\12\1\150\15\12\22\0"+
    "\1\12\1\0\2\12\1\0\3\12\3\0\1\12\5\0"+
    "\4\12\1\151\20\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\15\12\1\152\7\12\22\0"+
    "\1\12\1\0\2\12\1\0\3\12\3\0\1\12\5\0"+
    "\6\12\1\153\16\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\5\0\11\12\1\154\13\12\22\0"+
    "\1\12\1\0\2\12\1\0\3\12\3\0\1\12\5\0"+
    "\6\12\1\155\16\12\22\0\1\12\1\0\2\12\1\0"+
    "\3\12\3\0\1\12\63\0\1\156\64\0\1\157\67\0"+
    "\1\160\67\0\1\161\67\0\1\162\67\0\1\163\67\0"+
    "\1\164\67\0\1\165\67\0\1\166\14\0\3\12\1\167"+
    "\21\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\7\12\1\170\15\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\17\12\1\171"+
    "\5\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\12\12\1\172\12\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\11\12\1\173"+
    "\13\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\11\12\1\174\13\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\11\12\1\175"+
    "\13\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\14\12\1\176\10\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\14\12\1\177"+
    "\10\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\14\12\1\145\10\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\15\12\1\200"+
    "\7\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\4\12\1\201\20\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\17\12\1\202"+
    "\5\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\1\12\1\203\23\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\10\12\1\204"+
    "\14\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\1\12\1\205\23\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\7\12\1\206"+
    "\15\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\10\12\1\207\14\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\14\12\1\210"+
    "\10\12\22\0\1\12\1\0\2\12\1\0\3\12\3\0"+
    "\1\12\5\0\11\12\1\211\13\12\22\0\1\12\1\0"+
    "\2\12\1\0\3\12\3\0\1\12\5\0\24\12\1\212"+
    "\22\0\1\12\1\0\2\12\1\0\3\12\3\0\1\12"+
    "\5\0\4\12\1\213\20\12\22\0\1\12\1\0\2\12"+
    "\1\0\3\12\3\0\1\12\5\0\7\12\1\214\15\12"+
    "\22\0\1\12\1\0\2\12\1\0\3\12\3\0\1\12"+
    "\5\0\17\12\1\215\5\12\22\0\1\12\1\0\2\12"+
    "\1\0\3\12\3\0\1\12\5\0\5\12\1\216\17\12"+
    "\22\0\1\12\1\0\2\12\1\0\3\12\3\0\1\12"+
    "\5\0\14\12\1\217\10\12\22\0\1\12\1\0\2\12"+
    "\1\0\3\12\3\0\1\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4592];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\11\16\1\1\11\1\1\1\11\4\1\10\11"+
    "\2\1\1\11\2\1\3\11\1\1\1\11\4\1\1\11"+
    "\1\1\2\11\15\1\10\11\1\1\3\11\11\0\10\11"+
    "\16\1\1\0\10\11\31\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	StringBuilder string = new StringBuilder();

	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { return new_symbol(sym.ASSIGNMENT, yytext());
          }
        case 70: break;
        case 52: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\t');
          }
        case 71: break;
        case 12: 
          { return new_symbol(sym.COMMA, yytext());
          }
        case 72: break;
        case 23: 
          { yybegin(STRINGLITERAL);
          }
        case 73: break;
        case 45: 
          { string.append( "\b" );
          }
        case 74: break;
        case 69: 
          { return new_symbol(sym.EXTENDS, yytext());
          }
        case 75: break;
        case 49: 
          { return new_symbol(sym.NEW, yytext());
          }
        case 76: break;
        case 4: 
          { return new_symbol(sym.ADD, yytext());
          }
        case 77: break;
        case 5: 
          { return new_symbol(sym.SUB, yytext());
          }
        case 78: break;
        case 43: 
          { string.append( "\t" );
          }
        case 79: break;
        case 34: 
          { return new_symbol(sym.GTE, yytext());
          }
        case 80: break;
        case 60: 
          { return new_symbol(sym.ELSE, yytext());
          }
        case 81: break;
        case 29: 
          { return new_symbol(sym.IF, yytext());
          }
        case 82: break;
        case 57: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\\');
          }
        case 83: break;
        case 20: 
          { return new_symbol(sym.DOT, yytext());
          }
        case 84: break;
        case 28: 
          { yybegin(YYINITIAL); String s = new String(string.toString()); string.setLength(0); return new_symbol(sym.STRING, s);
          }
        case 85: break;
        case 7: 
          { return new_symbol(sym.DIV, yytext());
          }
        case 86: break;
        case 50: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\r');
          }
        case 87: break;
        case 46: 
          { string.append( "\'" );
          }
        case 88: break;
        case 19: 
          { return new_symbol(sym.RIGHT_BRACKET, yytext());
          }
        case 89: break;
        case 27: 
          { System.err.println("Unterminated character literal at end of line ("+yytext()+") at line: "+(yyline+1));
          }
        case 90: break;
        case 30: 
          { return new_symbol(sym.PP, yytext());
          }
        case 91: break;
        case 53: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\f');
          }
        case 92: break;
        case 61: 
          { return new_symbol(sym.VOID, yytext());
          }
        case 93: break;
        case 38: 
          { yybegin(YYINITIAL);
          }
        case 94: break;
        case 14: 
          { return new_symbol(sym.LEFT_CBRACKET, yytext());
          }
        case 95: break;
        case 63: 
          { return new_symbol(sym.CONST, yytext());
          }
        case 96: break;
        case 3: 
          { return new_symbol(sym.IDENT, yytext());
          }
        case 97: break;
        case 56: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\"');
          }
        case 98: break;
        case 36: 
          { return new_symbol(sym.AND, yytext());
          }
        case 99: break;
        case 55: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\'');
          }
        case 100: break;
        case 24: 
          { yybegin(COMMENT);
          }
        case 101: break;
        case 8: 
          { return new_symbol(sym.MOD, yytext());
          }
        case 102: break;
        case 6: 
          { return new_symbol(sym.MUL, yytext());
          }
        case 103: break;
        case 21: 
          { return new_symbol(sym.NUM, new Integer (yytext()));
          }
        case 104: break;
        case 59: 
          { return new_symbol(sym.BOOL, new Boolean(yytext()));
          }
        case 105: break;
        case 66: 
          { return new_symbol(sym.BREAK, yytext());
          }
        case 106: break;
        case 13: 
          { return new_symbol(sym.SEMIC, yytext());
          }
        case 107: break;
        case 10: 
          { return new_symbol(sym.GT, yytext());
          }
        case 108: break;
        case 40: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, yytext().charAt(0));
          }
        case 109: break;
        case 58: 
          { return new_symbol(sym.READ, yytext());
          }
        case 110: break;
        case 51: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\n');
          }
        case 111: break;
        case 16: 
          { return new_symbol(sym.LEFT_SBRACKET, yytext());
          }
        case 112: break;
        case 47: 
          { string.append( "\"" );
          }
        case 113: break;
        case 15: 
          { return new_symbol(sym.RIGHT_CBRACKET, yytext());
          }
        case 114: break;
        case 11: 
          { return new_symbol(sym.LE, yytext());
          }
        case 115: break;
        case 54: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\b');
          }
        case 116: break;
        case 26: 
          { yybegin(STRINGLITERAL); string.append(yytext());
          }
        case 117: break;
        case 35: 
          { return new_symbol(sym.LEQ, yytext());
          }
        case 118: break;
        case 41: 
          { string.append( "\r" );
          }
        case 119: break;
        case 1: 
          { System.err.println("Error: Incorrect token("+yytext()+") in line: "+(yyline+1));
          }
        case 120: break;
        case 65: 
          { return new_symbol(sym.WHILE, yytext());
          }
        case 121: break;
        case 48: 
          { string.append( "\\" );
          }
        case 122: break;
        case 18: 
          { return new_symbol(sym.LEFT_BRACKET, yytext());
          }
        case 123: break;
        case 62: 
          { return new_symbol(sym.PRINT, yytext());
          }
        case 124: break;
        case 42: 
          { string.append( "\n" );
          }
        case 125: break;
        case 64: 
          { return new_symbol(sym.CLASS, yytext());
          }
        case 126: break;
        case 25: 
          { System.err.println("Error: Incorrect character token("+yytext()+") in line: "+(yyline+1));
          }
        case 127: break;
        case 17: 
          { return new_symbol(sym.RIGHT_SBRACKET, yytext());
          }
        case 128: break;
        case 68: 
          { return new_symbol(sym.PROGRAM, yytext());
          }
        case 129: break;
        case 33: 
          { return new_symbol(sym.NEQ, yytext());
          }
        case 130: break;
        case 67: 
          { return new_symbol(sym.RETURN, yytext());
          }
        case 131: break;
        case 37: 
          { return new_symbol(sym.OR, yytext());
          }
        case 132: break;
        case 32: 
          { return new_symbol(sym.EQU, yytext());
          }
        case 133: break;
        case 39: 
          { yybegin(YYINITIAL); return new_symbol(sym.CHAR, ' ');
          }
        case 134: break;
        case 44: 
          { string.append( "\f" );
          }
        case 135: break;
        case 31: 
          { return new_symbol(sym.MM, yytext());
          }
        case 136: break;
        case 2: 
          { 
          }
        case 137: break;
        case 22: 
          { yybegin(CHARLITERAL);
          }
        case 138: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return new_symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}