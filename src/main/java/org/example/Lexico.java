// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/main/jflex/reglas.flex

package org.example;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexico {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\1\2\2\1\22\0\1\1\1\3\1\4"+
    "\3\0\1\5\1\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\10\20\1\21\1\22"+
    "\1\23\1\24\1\25\2\0\1\26\1\27\2\30\1\31"+
    "\1\32\1\33\1\30\1\34\2\30\1\35\1\30\1\36"+
    "\1\37\2\30\1\40\1\41\1\42\6\30\1\43\1\0"+
    "\1\44\1\0\1\45\1\0\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\2\30\1\57\1\60"+
    "\1\61\1\62\1\63\1\30\1\64\1\65\1\66\1\67"+
    "\1\30\1\70\3\30\1\71\1\72\1\73\7\0\1\2"+
    "\32\0\1\2\u01df\0\1\2\177\0\13\2\35\0\2\2"+
    "\5\0\1\2\57\0\1\2\240\0\1\2\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\2\2\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\2\14\1\2\1\15"+
    "\1\16\1\2\1\17\5\1\1\20\1\21\1\22\7\1"+
    "\1\23\1\2\1\24\1\25\1\0\1\26\1\27\1\30"+
    "\3\0\1\31\1\32\1\33\1\34\11\1\1\35\4\1"+
    "\1\36\1\0\1\37\1\40\2\1\1\41\12\1\2\0"+
    "\4\1\1\42\4\1\1\43\2\1\2\0\1\1\1\44"+
    "\6\1\1\45\1\46\1\3\1\0\1\1\1\47\3\1"+
    "\1\50\1\1\6\0\1\51\4\1\3\0\1\3\1\0"+
    "\2\1\2\0\1\3\1\0\2\1\4\0\2\1\6\0"+
    "\1\3\14\0\1\52\2\0\1\53\4\0\1\54\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
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
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\74\0\74"+
    "\0\74\0\74\0\74\0\74\0\u0168\0\u01a4\0\u01e0\0\u021c"+
    "\0\u0258\0\74\0\u0294\0\u02d0\0\u030c\0\u0348\0\u0384\0\u03c0"+
    "\0\u03fc\0\u0438\0\74\0\74\0\74\0\u0474\0\u04b0\0\u04ec"+
    "\0\u0528\0\u0564\0\u05a0\0\u05dc\0\74\0\u0618\0\74\0\74"+
    "\0\360\0\74\0\74\0\u0168\0\u0654\0\u0690\0\u06cc\0\74"+
    "\0\74\0\74\0\74\0\u0708\0\u0744\0\u0780\0\u07bc\0\u07f8"+
    "\0\u0834\0\u0870\0\u08ac\0\u08e8\0\u0348\0\u0924\0\u0960\0\u099c"+
    "\0\u09d8\0\74\0\u0a14\0\u0690\0\74\0\u0a50\0\u0a8c\0\u0348"+
    "\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c"+
    "\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10\0\u0e4c"+
    "\0\u0348\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c\0\u0348\0\u0f78\0\u0fb4"+
    "\0\u0ff0\0\u102c\0\u1068\0\u0348\0\u10a4\0\u10e0\0\u111c\0\u1158"+
    "\0\u1194\0\u11d0\0\u0348\0\u0348\0\u120c\0\u1248\0\u1284\0\u0348"+
    "\0\u12c0\0\u12fc\0\u1338\0\u0348\0\u1374\0\u13b0\0\u13ec\0\u120c"+
    "\0\u1428\0\u1464\0\u14a0\0\u0348\0\u14dc\0\u1518\0\u1554\0\u1590"+
    "\0\u15cc\0\u1608\0\u1644\0\u13ec\0\u1680\0\u16bc\0\u16f8\0\u1734"+
    "\0\u1770\0\u17ac\0\u17e8\0\u1824\0\u1860\0\u189c\0\u17ac\0\u18d8"+
    "\0\u1914\0\u1950\0\u198c\0\u19c8\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8"+
    "\0\u1af4\0\74\0\u1b30\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\u1c5c"+
    "\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88\0\u1dc4\0\74\0\u1e00"+
    "\0\u1e3c\0\74\0\u1e78\0\u1eb4\0\u1ef0\0\u1f2c\0\74\0\74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
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
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\26"+
    "\1\30\1\26\1\31\4\26\1\32\1\26\1\33\1\34"+
    "\1\35\3\26\1\36\1\37\1\40\2\26\1\41\4\26"+
    "\1\42\2\26\1\43\1\26\1\44\1\45\1\46\1\47"+
    "\75\0\1\3\116\0\1\50\50\0\2\51\1\0\1\52"+
    "\11\0\3\51\5\0\15\51\3\0\23\51\10\0\1\53"+
    "\104\0\3\54\70\0\1\55\72\0\1\54\1\0\3\20"+
    "\26\0\1\56\40\0\1\54\1\0\3\20\74\0\1\57"+
    "\2\0\1\60\73\0\1\61\73\0\1\62\73\0\1\63"+
    "\65\0\3\26\5\0\15\26\2\0\24\26\21\0\3\26"+
    "\5\0\11\26\1\64\3\26\2\0\24\26\21\0\3\26"+
    "\5\0\7\26\1\65\5\26\2\0\24\26\21\0\3\26"+
    "\5\0\10\26\1\66\4\26\2\0\24\26\21\0\3\26"+
    "\5\0\14\26\1\67\2\0\24\26\21\0\3\26\5\0"+
    "\15\26\2\0\5\26\1\70\16\26\21\0\3\26\5\0"+
    "\15\26\2\0\12\26\1\71\1\26\1\72\7\26\21\0"+
    "\3\26\5\0\15\26\2\0\1\26\1\73\7\26\1\74"+
    "\12\26\21\0\3\26\5\0\15\26\2\0\6\26\1\75"+
    "\15\26\21\0\3\26\5\0\15\26\2\0\17\26\1\76"+
    "\4\26\21\0\3\26\5\0\15\26\2\0\17\26\1\77"+
    "\4\26\21\0\3\26\5\0\15\26\2\0\10\26\1\100"+
    "\6\26\1\101\4\26\75\0\1\102\11\0\1\103\101\0"+
    "\2\104\100\0\1\105\65\0\3\26\5\0\11\26\1\106"+
    "\3\26\2\0\24\26\21\0\3\26\5\0\11\26\1\107"+
    "\3\26\2\0\24\26\21\0\3\26\5\0\14\26\1\110"+
    "\2\0\24\26\21\0\3\26\5\0\12\26\1\111\2\26"+
    "\2\0\24\26\21\0\3\26\5\0\15\26\2\0\3\26"+
    "\1\112\20\26\21\0\3\26\5\0\15\26\2\0\20\26"+
    "\1\113\3\26\21\0\3\26\5\0\15\26\2\0\4\26"+
    "\1\114\17\26\21\0\3\26\5\0\15\26\2\0\12\26"+
    "\1\115\11\26\21\0\3\26\5\0\15\26\2\0\12\26"+
    "\1\116\11\26\21\0\3\26\5\0\15\26\2\0\15\26"+
    "\1\117\6\26\21\0\3\26\5\0\15\26\2\0\22\26"+
    "\1\120\1\26\21\0\3\26\5\0\15\26\2\0\11\26"+
    "\1\121\12\26\21\0\3\26\5\0\15\26\2\0\11\26"+
    "\1\122\12\26\3\0\10\103\1\123\4\103\1\124\56\103"+
    "\16\0\3\26\5\0\7\26\1\125\5\26\2\0\24\26"+
    "\21\0\3\26\5\0\1\126\14\26\2\0\24\26\21\0"+
    "\3\26\5\0\6\26\1\127\6\26\2\0\24\26\21\0"+
    "\3\26\5\0\15\26\2\0\12\26\1\130\11\26\21\0"+
    "\3\26\5\0\15\26\2\0\5\26\1\131\16\26\21\0"+
    "\3\26\5\0\15\26\2\0\4\26\1\132\11\26\1\133"+
    "\5\26\21\0\3\26\5\0\15\26\2\0\20\26\1\120"+
    "\3\26\21\0\3\26\5\0\15\26\2\0\21\26\1\134"+
    "\2\26\21\0\3\26\5\0\15\26\2\0\7\26\1\135"+
    "\14\26\21\0\3\26\5\0\15\26\2\0\5\26\1\136"+
    "\16\26\21\0\3\26\5\0\15\26\2\0\12\26\1\137"+
    "\11\26\21\0\3\26\5\0\15\26\2\0\21\26\1\140"+
    "\2\26\3\0\10\103\1\123\4\103\1\141\66\103\1\123"+
    "\4\103\1\142\56\103\16\0\3\26\5\0\3\26\1\143"+
    "\11\26\2\0\24\26\21\0\3\26\5\0\14\26\1\144"+
    "\2\0\24\26\21\0\3\26\5\0\10\26\1\145\4\26"+
    "\2\0\24\26\21\0\3\26\5\0\15\26\2\0\1\26"+
    "\1\146\22\26\21\0\3\26\5\0\15\26\2\0\5\26"+
    "\1\147\16\26\21\0\3\26\5\0\15\26\2\0\17\26"+
    "\1\150\4\26\21\0\3\26\5\0\15\26\2\0\5\26"+
    "\1\151\16\26\21\0\3\26\5\0\15\26\2\0\17\26"+
    "\1\152\4\26\21\0\3\26\5\0\15\26\2\0\5\26"+
    "\1\153\16\26\21\0\3\26\5\0\15\26\2\0\5\26"+
    "\1\154\16\26\3\0\10\103\1\123\4\103\1\155\66\103"+
    "\1\156\4\103\1\142\56\103\16\0\3\26\5\0\1\157"+
    "\14\26\2\0\24\26\21\0\3\26\5\0\5\26\1\160"+
    "\7\26\2\0\24\26\21\0\3\26\5\0\15\26\2\0"+
    "\17\26\1\161\4\26\21\0\3\26\5\0\15\26\2\0"+
    "\3\26\1\162\20\26\21\0\3\26\5\0\15\26\2\0"+
    "\15\26\1\163\6\26\21\0\3\26\5\0\15\26\2\0"+
    "\17\26\1\164\4\26\21\0\3\26\5\0\15\26\2\0"+
    "\1\26\1\165\22\26\3\0\10\166\1\167\4\166\1\170"+
    "\56\166\10\171\1\172\4\171\1\173\56\171\16\0\3\26"+
    "\5\0\10\26\1\174\4\26\2\0\24\26\21\0\3\26"+
    "\5\0\15\26\2\0\5\26\1\175\16\26\21\0\3\26"+
    "\5\0\15\26\2\0\12\26\1\176\11\26\21\0\3\26"+
    "\5\0\15\26\2\0\7\26\1\177\14\26\21\0\3\26"+
    "\5\0\15\26\2\0\13\26\1\200\10\26\3\0\15\166"+
    "\1\201\56\166\10\167\1\202\63\167\10\171\1\172\73\171"+
    "\1\172\4\171\1\203\66\171\1\172\4\171\1\204\56\171"+
    "\14\0\1\205\1\0\3\26\5\0\15\26\2\0\24\26"+
    "\21\0\3\26\5\0\15\26\2\0\1\26\1\206\22\26"+
    "\21\0\3\26\5\0\15\26\2\0\17\26\1\207\4\26"+
    "\17\0\1\210\1\0\3\26\5\0\15\26\2\0\24\26"+
    "\3\0\15\166\1\170\56\166\10\167\1\202\4\167\1\211"+
    "\56\167\10\171\1\172\4\171\1\212\56\171\65\0\1\213"+
    "\24\0\3\26\5\0\15\26\2\0\17\26\1\214\4\26"+
    "\21\0\3\26\5\0\15\26\2\0\1\26\1\215\22\26"+
    "\70\0\1\216\6\0\10\167\1\202\4\167\1\217\56\167"+
    "\10\217\1\220\63\217\52\0\1\221\37\0\3\26\5\0"+
    "\15\26\2\0\5\26\1\222\16\26\21\0\3\26\5\0"+
    "\15\26\2\0\13\26\1\223\10\26\55\0\1\224\21\0"+
    "\10\217\1\220\4\217\1\225\56\217\50\0\1\226\37\0"+
    "\1\227\1\0\3\26\5\0\15\26\2\0\24\26\17\0"+
    "\1\230\1\0\3\26\5\0\15\26\2\0\24\26\53\0"+
    "\1\231\23\0\10\217\1\220\4\217\1\232\56\217\66\0"+
    "\1\233\72\0\1\234\73\0\1\235\74\0\1\236\63\0"+
    "\1\237\67\0\1\240\73\0\1\241\77\0\1\242\77\0"+
    "\1\243\61\0\1\244\73\0\1\245\105\0\1\246\72\0"+
    "\1\247\100\0\1\250\73\0\1\251\66\0\1\252\70\0"+
    "\1\253\73\0\1\254\77\0\1\255\73\0\1\256\72\0"+
    "\1\257\73\0\1\260\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8040];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\6\11\5\1\1\11\10\1\3\11"+
    "\7\1\1\11\1\1\2\11\1\0\2\11\1\1\3\0"+
    "\4\11\16\1\1\11\1\0\1\1\1\11\15\1\2\0"+
    "\14\1\2\0\13\1\1\0\7\1\6\0\5\1\3\0"+
    "\1\1\1\0\2\1\2\0\1\1\1\0\2\1\4\0"+
    "\2\1\6\0\1\11\14\0\1\11\2\0\1\11\4\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Simbolo rangoEnteroAceptable(String value){
        int i = Integer.parseInt(value);

        if (i >= -32768 && i <= 32767){
            return new Simbolo(Token.CTE_E, "_"+value, null, value, null, true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante entera fuera de rango [-32768, 32767]: " + value);
    }

    private Simbolo rangoFloatAceptable(String value){
        double f = Double.parseDouble(value);

        if (f >= -2147483648.0D && f <= 2147483647.0D){
            return new Simbolo(Token.CTE_F, "_"+value, null, value, null, true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante float fuera de rango [-2147483648, 2147483647]: " + value);
    }

    private Simbolo largoCadenaAceptable(String value){
        if (value.length() <= 30){
            String name = "_"+value.replace("\"", "");

            return new Simbolo(Token.CTE_STR, name, null, value, value.length(), true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante string '" + value + "'" + " muy larga. Max 30 caracteres");
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Simbolo yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
          {     return new Simbolo(Token.EOF, null, null, null, null, false);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Simbolo(Token.ID, yytext(), null, yytext(), null, true);
            }
            // fall through
          case 46: break;
          case 2:
            { throw new Error("["+ yyline + ":" + yycolumn + "] - No se encontro un token para el lexema: " + yytext());
            }
            // fall through
          case 47: break;
          case 3:
            { /* Se ignoran */
            }
            // fall through
          case 48: break;
          case 4:
            { return new Simbolo(Token.OPL_NOT, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 49: break;
          case 5:
            { return new Simbolo(Token.A_PARENT, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 50: break;
          case 6:
            { return new Simbolo(Token.C_PARENT, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 51: break;
          case 7:
            { return new Simbolo(Token.OP_MULTIPLICACION, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 52: break;
          case 8:
            { return new Simbolo(Token.OP_SUMA, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 53: break;
          case 9:
            { return new Simbolo(Token.COMA, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 54: break;
          case 10:
            { return new Simbolo(Token.OP_RESTA, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 55: break;
          case 11:
            { return new Simbolo(Token.OP_DIVISION, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 56: break;
          case 12:
            { return rangoEnteroAceptable(yytext());
            }
            // fall through
          case 57: break;
          case 13:
            { return new Simbolo(Token.P_Y_C, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 58: break;
          case 14:
            { return new Simbolo(Token.OP_MENOR, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 59: break;
          case 15:
            { return new Simbolo(Token.OP_MAYOR, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 60: break;
          case 16:
            { return new Simbolo(Token.A_CORCHETE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 61: break;
          case 17:
            { return new Simbolo(Token.C_CORCHETE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 62: break;
          case 18:
            { return new Simbolo(Token.GUION_BAJO, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 63: break;
          case 19:
            { return new Simbolo(Token.A_LLAVE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 64: break;
          case 20:
            { return new Simbolo(Token.C_LLAVE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 65: break;
          case 21:
            { return new Simbolo(Token.OP_DIST, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 66: break;
          case 22:
            { return largoCadenaAceptable(yytext());
            }
            // fall through
          case 67: break;
          case 23:
            { return new Simbolo(Token.OPL_AND, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 68: break;
          case 24:
            { return rangoFloatAceptable(yytext());
            }
            // fall through
          case 69: break;
          case 25:
            { return new Simbolo(Token.OP_DECLARACION, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 70: break;
          case 26:
            { return new Simbolo(Token.OP_MENOR_IG, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 71: break;
          case 27:
            { return new Simbolo(Token.OP_IGUAL, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 72: break;
          case 28:
            { return new Simbolo(Token.OP_MAYOR_IG, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 73: break;
          case 29:
            { return new Simbolo(Token.IF, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 74: break;
          case 30:
            { return new Simbolo(Token.OPL_OR, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 75: break;
          case 31:
            { String binValue = String.valueOf(yytext()).substring(2);
                        Integer decValue = Integer.parseInt(binValue, 2);
                        String decValueStr = String.valueOf(decValue);

                        return new Simbolo(Token.CTE_B, yytext(), null, decValueStr, null, true);
            }
            // fall through
          case 76: break;
          case 32:
            { return new Simbolo(Token.OP_ASIGNACION, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 77: break;
          case 33:
            { return new Simbolo(Token.TYPE_INT, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 78: break;
          case 34:
            { return new Simbolo(Token.ELSE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 79: break;
          case 35:
            { return new Simbolo(Token.CTE_BOOL, yytext(), null, yytext(), null, true);
            }
            // fall through
          case 80: break;
          case 36:
            { return new Simbolo(Token.TYPE_FLOAT, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 81: break;
          case 37:
            { return new Simbolo(Token.WHILE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 82: break;
          case 38:
            { return new Simbolo(Token.WRITE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 83: break;
          case 39:
            { return new Simbolo(Token.TYPE_STRING, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 84: break;
          case 40:
            { return new Simbolo(Token.FILTER, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 85: break;
          case 41:
            { return new Simbolo(Token.TYPE_BOOL, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 86: break;
          case 42:
            { return new Simbolo(Token.INI_DECLARE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 87: break;
          case 43:
            { return new Simbolo(Token.INI_PROGRAM, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 88: break;
          case 44:
            { return new Simbolo(Token.END_DECLARE, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 89: break;
          case 45:
            { return new Simbolo(Token.END_PROGRAM, yytext(), null, yytext(), null, false);
            }
            // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
