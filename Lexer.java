/* The following code was generated by JFlex 1.7.0 */

import java.util.*;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>ScannerLexico.lex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner, sym {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int DATA = 2;
  public static final int CODE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\3\1\4\1\4\1\3\22\0\1\5\1\0\1\1"+
    "\1\2\10\0\1\20\1\17\1\21\1\0\12\16\1\26\6\0\32\25"+
    "\6\24\1\6\1\25\1\10\1\15\1\23\3\25\1\11\1\27\1\25"+
    "\1\30\1\33\1\25\1\13\2\25\1\14\1\7\1\22\1\31\1\25"+
    "\1\12\1\32\1\34\1\25\12\0\1\4\u1fa2\0\1\4\1\4\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\2\1\3\2\3\3\1\4\1\1\1\5\2\1"+
    "\2\2\4\6\1\4\1\1\1\5\1\1\3\6\2\0"+
    "\1\7\1\0\1\2\4\3\2\0\1\6\1\10\1\11"+
    "\1\6\1\12\1\6\1\0\3\6\2\0\1\2\2\3"+
    "\2\0\1\11\1\6\1\12\1\6\2\0\1\2\1\3"+
    "\1\13\2\0\1\6\2\0\1\2\1\3\1\14\1\6"+
    "\3\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
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
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\u013f\0\u013f\0\127\0\u015c\0\0"+
    "\0\u0179\0\u0196\0\u01b3\0\u01d0\0\u01ed\0\u020a\0\u0227\0\u0227"+
    "\0\0\0\u0244\0\u0261\0\u027e\0\u029b\0\u02b8\0\u02d5\0\0"+
    "\0\u02f2\0\u030f\0\u032c\0\u0349\0\u0366\0\u0383\0\u03a0\0\u03bd"+
    "\0\u03da\0\0\0\u01ed\0\u03f7\0\u0414\0\u0431\0\u0244\0\u044e"+
    "\0\u046b\0\u0488\0\u04a5\0\u04c2\0\u04df\0\u04fc\0\u0519\0\u0536"+
    "\0\u0553\0\u0570\0\u058d\0\u01ed\0\u05aa\0\u05c7\0\u05e4\0\u0601"+
    "\0\u061e\0\u0349\0\u063b\0\u0658\0\u0675\0\u0692\0\u06af\0\u06cc"+
    "\0\u06e9\0\0\0\u0706\0\0\0\u02d5\0\u0179";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
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
    "\35\0\1\4\1\5\1\6\1\7\1\0\1\10\4\11"+
    "\1\12\2\11\1\13\1\14\1\15\1\16\1\17\2\11"+
    "\1\4\1\11\1\4\6\11\2\20\1\21\1\7\1\0"+
    "\1\22\1\23\1\24\4\25\1\26\1\25\1\27\1\30"+
    "\1\31\1\20\2\25\1\32\1\25\1\20\1\33\1\34"+
    "\2\25\1\35\1\25\6\0\1\36\26\0\1\37\1\40"+
    "\4\37\1\41\26\37\3\21\2\0\1\21\1\42\26\21"+
    "\3\0\1\7\36\0\1\22\1\36\34\0\1\43\10\44"+
    "\3\0\2\44\1\0\1\44\1\0\6\44\6\0\1\43"+
    "\4\44\1\45\3\44\3\0\2\44\1\0\1\44\1\0"+
    "\6\44\6\0\1\43\3\44\1\46\4\44\3\0\2\44"+
    "\1\0\1\44\1\0\6\44\6\0\1\36\7\0\1\27"+
    "\24\0\1\36\1\0\1\47\4\0\1\50\17\0\3\21"+
    "\2\0\30\21\5\0\1\22\35\0\7\25\1\51\1\25"+
    "\3\0\2\25\1\0\1\25\1\52\6\25\6\0\4\25"+
    "\1\53\4\25\3\0\2\25\1\0\1\25\1\52\5\25"+
    "\1\54\6\0\11\25\3\0\2\25\1\0\1\25\1\52"+
    "\6\25\6\0\10\25\1\55\3\0\1\25\1\56\1\0"+
    "\1\25\1\52\6\25\16\0\1\27\24\0\11\57\3\0"+
    "\2\57\1\0\1\57\1\52\6\57\6\0\11\25\3\0"+
    "\2\25\1\0\1\25\1\52\1\25\1\60\4\25\6\0"+
    "\11\25\3\0\2\25\1\0\1\25\1\52\2\25\1\61"+
    "\3\25\6\0\11\25\3\0\2\25\1\0\1\25\1\52"+
    "\2\25\1\62\3\25\7\0\1\63\25\0\1\37\1\40"+
    "\34\37\1\40\5\37\1\64\25\37\3\21\2\0\2\21"+
    "\1\65\25\21\6\0\1\44\1\66\7\44\3\0\2\44"+
    "\1\0\1\44\1\0\6\44\6\0\11\44\3\0\2\44"+
    "\1\0\1\44\1\0\6\44\6\0\6\44\1\67\2\44"+
    "\3\0\2\44\1\0\1\44\1\0\6\44\6\0\5\44"+
    "\1\45\3\44\3\0\2\44\1\0\1\44\1\0\6\44"+
    "\13\0\1\70\27\0\1\71\34\0\7\25\1\72\1\25"+
    "\3\0\2\25\1\0\1\25\1\52\6\25\6\0\1\25"+
    "\1\73\7\25\3\0\2\25\1\0\1\25\1\52\6\25"+
    "\6\0\10\25\1\74\3\0\2\25\1\0\1\25\1\52"+
    "\6\25\6\0\11\25\3\0\1\53\1\25\1\0\1\25"+
    "\1\52\6\25\6\0\1\25\1\53\7\25\3\0\1\25"+
    "\1\75\1\0\1\25\1\52\6\25\6\0\11\25\3\0"+
    "\2\25\1\0\1\25\1\52\3\25\1\53\2\25\6\0"+
    "\11\25\3\0\2\25\1\0\1\25\1\52\1\25\1\53"+
    "\4\25\10\0\1\76\24\0\1\37\1\40\6\37\1\77"+
    "\24\37\3\21\2\0\3\21\1\100\24\21\6\0\2\44"+
    "\1\101\6\44\3\0\2\44\1\0\1\44\1\0\6\44"+
    "\6\0\7\44\1\102\1\44\3\0\2\44\1\0\1\44"+
    "\1\0\6\44\15\0\1\103\41\0\1\104\20\0\3\25"+
    "\1\53\5\25\3\0\2\25\1\0\1\25\1\52\6\25"+
    "\6\0\2\25\1\105\6\25\3\0\2\25\1\0\1\25"+
    "\1\52\6\25\6\0\11\25\3\0\2\25\1\0\1\25"+
    "\1\52\2\25\1\53\3\25\11\0\1\106\23\0\1\37"+
    "\1\40\7\37\1\107\23\37\3\21\2\0\4\21\1\110"+
    "\23\21\6\0\3\44\1\111\5\44\3\0\2\44\1\0"+
    "\1\44\1\0\6\44\23\0\1\112\17\0\1\112\34\0"+
    "\1\113\10\25\3\0\2\25\1\0\1\25\1\52\6\25"+
    "\11\0\1\114\23\0\1\37\1\40\7\37\1\115\23\37"+
    "\3\21\2\0\4\21\1\116\23\21\6\0\3\44\1\102"+
    "\5\44\3\0\2\44\1\0\1\44\1\0\6\44\6\0"+
    "\11\25\3\0\2\25\1\0\1\25\1\52\1\25\1\62"+
    "\4\25";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1827];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\10\2\0\14\1\1\11\10\1\1\11\4\1\2\0"+
    "\1\11\1\0\5\1\2\0\1\1\1\11\4\1\1\0"+
    "\3\1\2\0\3\1\2\0\4\1\2\0\3\1\2\0"+
    "\1\1\2\0\2\1\1\11\1\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	public Lexer(java.io.Reader in, ComplexSymbolFactory sf){
		this(in);
		symbolFactory = sf;
	}
	
	
	  ComplexSymbolFactory symbolFactory;
	  
	  private Symbol symbol(int type) {
		  //System.out.println("column: " + yycolumn);
		  //System.out.println("line: " + yyline);
		return symbolFactory.newSymbol("",type,yytext());
	  }
	  
	  private Symbol symbol(int type, Object value) {
		return symbolFactory.newSymbol("",type);
	  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
  	yybegin( DATA );
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {   return symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Input no reconocido: " + yytext());
            } 
            // fall through
          case 13: break;
          case 2: 
            { /*Ignores*/
            } 
            // fall through
          case 14: break;
          case 3: 
            { System.out.println("Variable detectada: " + yytext());return symbol(sym.variable);
            } 
            // fall through
          case 15: break;
          case 4: 
            { System.out.println("Inmediato Detectado: " + yytext());return symbol(sym.immediate);
            } 
            // fall through
          case 16: break;
          case 5: 
            { System.out.println("Separador Detectado: " + yytext());return symbol(sym.separator);
            } 
            // fall through
          case 17: break;
          case 6: 
            { System.out.println("Variable detectada: " + yytext());return symbol(sym.tag);
            } 
            // fall through
          case 18: break;
          case 7: 
            { System.out.println("String Detectado: " + yytext());return symbol(sym.string);
            } 
            // fall through
          case 19: break;
          case 8: 
            { System.out.println("Etiqueta Detectada: " + yytext());return symbol(sym.label);
            } 
            // fall through
          case 20: break;
          case 9: 
            { System.out.println("Instruccion Detectada: " + yytext()); return symbol(sym.operation);
            } 
            // fall through
          case 21: break;
          case 10: 
            { System.out.println("Registro Detectado: " + yytext());return symbol(sym.register);
            } 
            // fall through
          case 22: break;
          case 11: 
            { System.out.println("Tipo Detectado: " + yytext());return symbol(sym.types);
            } 
            // fall through
          case 23: break;
          case 12: 
            { System.out.println("Segmento Detectado: " + yytext());
				if(yytext().equals(".code"))
					yybegin( CODE );
				return symbol(sym.segment);
            } 
            // fall through
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
