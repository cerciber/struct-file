// Generated from C:/Users/acer/Google Drive/CESAR/6. PORTAFOLIO/StructFile/StructFile/src/Languaje/Grammar\StructFileGrammar.g4 by ANTLR 4.7.2
package Languaje.Grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructFileGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ONELINECOMMENT=1, MULTILINECOMMENT=2, SPACES=3, TK_NUMBER=4, TK_TEXT=5, 
		TK_BOOLEAN=6, TK_FILE=7, TK_LIST=8, TK_TREE=9, TK_GROUP=10, TK_IF=11, 
		TK_ELSE=12, TK_SWITCH=13, TK_BREAK=14, TK_CONTINUE=15, TK_WHILE=16, TK_DO=17, 
		TK_FOR=18, TK_RETURN=19, TK_DOUBLE_QUOTES=20, TK_SIMPLE_QUOTE=21, TK_DOT=22, 
		TK_COLON=23, TK_SEMICOLON=24, TK_COMMA=25, TK_OPEN_BRACKED=26, TK_CLOSE_BRACKED=27, 
		TK_OPEN_BRACES=28, TK_CLOSE_BRACES=29, TK_OPEN_SQUARE_BRACKED=30, TK_CLOSE_SQUARE_BRACKED=31, 
		TK_AND=32, TK_OR=33, TK_NOT=34, TK_GREAT_THAN=35, TK_GREAT_EQUAL_THAN=36, 
		TK_LESS_THAN=37, TK_LESS_EQUAL_THAN=38, TK_EQUAL=39, TK_NOT_EQUAL=40, 
		TK_SUM=41, TK_HIPHEN=42, TK_MULT=43, TK_DIVR=44, TK_MOD=45, TK_EXP=46, 
		TK_DIVI=47, TK_ASIGN=48, TK_DOLLAR=49, TK_DOUBLE_DOLLAR=50, TRUE_VAL=51, 
		FALSE_VAL=52, NUMBER_VAL=53, TEXT_VAL=54, FILE_VAL=55, ID=56, ID_DIR=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONELINECOMMENT", "MULTILINECOMMENT", "SPACES", "TK_NUMBER", "TK_TEXT", 
			"TK_BOOLEAN", "TK_FILE", "TK_LIST", "TK_TREE", "TK_GROUP", "TK_IF", "TK_ELSE", 
			"TK_SWITCH", "TK_BREAK", "TK_CONTINUE", "TK_WHILE", "TK_DO", "TK_FOR", 
			"TK_RETURN", "TK_DOUBLE_QUOTES", "TK_SIMPLE_QUOTE", "TK_DOT", "TK_COLON", 
			"TK_SEMICOLON", "TK_COMMA", "TK_OPEN_BRACKED", "TK_CLOSE_BRACKED", "TK_OPEN_BRACES", 
			"TK_CLOSE_BRACES", "TK_OPEN_SQUARE_BRACKED", "TK_CLOSE_SQUARE_BRACKED", 
			"TK_AND", "TK_OR", "TK_NOT", "TK_GREAT_THAN", "TK_GREAT_EQUAL_THAN", 
			"TK_LESS_THAN", "TK_LESS_EQUAL_THAN", "TK_EQUAL", "TK_NOT_EQUAL", "TK_SUM", 
			"TK_HIPHEN", "TK_MULT", "TK_DIVR", "TK_MOD", "TK_EXP", "TK_DIVI", "TK_ASIGN", 
			"TK_DOLLAR", "TK_DOUBLE_DOLLAR", "TRUE_VAL", "FALSE_VAL", "NUMBER_VAL", 
			"TEXT_VAL", "FILE_VAL", "ID", "ID_DIR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'num'", "'tex'", "'bol'", "'fil'", "'lis'", 
			"'dir'", "'gro'", "'if'", "'else'", "'switch'", "'break'", "'continue'", 
			"'while'", "'do'", "'for'", "'return'", "'\"'", "'''", "'.'", "':'", 
			"';'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'and'", "'or'", 
			"'not'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'/_'", "'='", "'$'", "'$$'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ONELINECOMMENT", "MULTILINECOMMENT", "SPACES", "TK_NUMBER", "TK_TEXT", 
			"TK_BOOLEAN", "TK_FILE", "TK_LIST", "TK_TREE", "TK_GROUP", "TK_IF", "TK_ELSE", 
			"TK_SWITCH", "TK_BREAK", "TK_CONTINUE", "TK_WHILE", "TK_DO", "TK_FOR", 
			"TK_RETURN", "TK_DOUBLE_QUOTES", "TK_SIMPLE_QUOTE", "TK_DOT", "TK_COLON", 
			"TK_SEMICOLON", "TK_COMMA", "TK_OPEN_BRACKED", "TK_CLOSE_BRACKED", "TK_OPEN_BRACES", 
			"TK_CLOSE_BRACES", "TK_OPEN_SQUARE_BRACKED", "TK_CLOSE_SQUARE_BRACKED", 
			"TK_AND", "TK_OR", "TK_NOT", "TK_GREAT_THAN", "TK_GREAT_EQUAL_THAN", 
			"TK_LESS_THAN", "TK_LESS_EQUAL_THAN", "TK_EQUAL", "TK_NOT_EQUAL", "TK_SUM", 
			"TK_HIPHEN", "TK_MULT", "TK_DIVR", "TK_MOD", "TK_EXP", "TK_DIVI", "TK_ASIGN", 
			"TK_DOLLAR", "TK_DOUBLE_DOLLAR", "TRUE_VAL", "FALSE_VAL", "NUMBER_VAL", 
			"TEXT_VAL", "FILE_VAL", "ID", "ID_DIR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StructFileGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StructFileGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0185\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\5\2y\n"+
		"\2\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0087\n"+
		"\3\f\3\16\3\u008a\13\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\u0092\n\4\r\4\16\4"+
		"\u0093\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\5\66\u013b\n\66\3\66\3\66\3\66\7\66\u0140\n"+
		"\66\f\66\16\66\u0143\13\66\3\66\6\66\u0146\n\66\r\66\16\66\u0147\3\66"+
		"\3\66\6\66\u014c\n\66\r\66\16\66\u014d\5\66\u0150\n\66\3\67\3\67\3\67"+
		"\3\67\7\67\u0156\n\67\f\67\16\67\u0159\13\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\7\67\u0161\n\67\f\67\16\67\u0164\13\67\3\67\3\67\5\67\u0168\n\67"+
		"\38\38\38\38\38\38\58\u0170\n8\58\u0172\n8\39\39\79\u0176\n9\f9\169\u0179"+
		"\139\3:\3:\6:\u017d\n:\r:\16:\u017e\3:\3:\3:\5:\u0184\n:\3\u0088\2;\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;\3\2\16\3\2\f\f\5\2\13\f\17\17\"\"\3\2\62\62\3\2\63;\3\2\62;\3\2\60"+
		"\60\3\2$$\b\2$$ddhhppttvv\3\2))\b\2))ddhhppttvv\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3x\3\2\2\2\5\u0082\3\2"+
		"\2\2\7\u0091\3\2\2\2\t\u0097\3\2\2\2\13\u009b\3\2\2\2\r\u009f\3\2\2\2"+
		"\17\u00a3\3\2\2\2\21\u00a7\3\2\2\2\23\u00ab\3\2\2\2\25\u00af\3\2\2\2\27"+
		"\u00b3\3\2\2\2\31\u00b6\3\2\2\2\33\u00bb\3\2\2\2\35\u00c2\3\2\2\2\37\u00c8"+
		"\3\2\2\2!\u00d1\3\2\2\2#\u00d7\3\2\2\2%\u00da\3\2\2\2\'\u00de\3\2\2\2"+
		")\u00e5\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed"+
		"\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2"+
		"\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fd\3\2\2\2C\u0101"+
		"\3\2\2\2E\u0104\3\2\2\2G\u0108\3\2\2\2I\u010a\3\2\2\2K\u010d\3\2\2\2M"+
		"\u010f\3\2\2\2O\u0112\3\2\2\2Q\u0115\3\2\2\2S\u0118\3\2\2\2U\u011a\3\2"+
		"\2\2W\u011c\3\2\2\2Y\u011e\3\2\2\2[\u0120\3\2\2\2]\u0122\3\2\2\2_\u0124"+
		"\3\2\2\2a\u0127\3\2\2\2c\u0129\3\2\2\2e\u012b\3\2\2\2g\u012e\3\2\2\2i"+
		"\u0133\3\2\2\2k\u014f\3\2\2\2m\u0167\3\2\2\2o\u0169\3\2\2\2q\u0173\3\2"+
		"\2\2s\u0183\3\2\2\2uy\7%\2\2vw\7\61\2\2wy\7\61\2\2xu\3\2\2\2xv\3\2\2\2"+
		"y}\3\2\2\2z|\n\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\2\2\2\u0081\4\3\2\2\2\u0082\u0083"+
		"\7\61\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\3\2\2\u008f\6\3\2\2"+
		"\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\4\2\2\u0096"+
		"\b\3\2\2\2\u0097\u0098\7p\2\2\u0098\u0099\7w\2\2\u0099\u009a\7o\2\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u009e\7z\2\2\u009e"+
		"\f\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\16\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\20\3\2\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\22\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\24\3\2\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2"+
		"\26\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5\30\3\2\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\32\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7"+
		"k\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7j\2\2\u00c1\34"+
		"\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7m\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0 \3\2\2"+
		"\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9$\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd&\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"(\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7)\2\2\u00e8,"+
		"\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec"+
		"\60\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0"+
		"\64\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4"+
		"8\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8"+
		"<\3\2\2\2\u00f9\u00fa\7]\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7_\2\2\u00fc@"+
		"\3\2\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100"+
		"B\3\2\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103D\3\2\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7q\2\2\u0106\u0107\7v\2\2\u0107F\3\2\2\2\u0108\u0109"+
		"\7@\2\2\u0109H\3\2\2\2\u010a\u010b\7@\2\2\u010b\u010c\7?\2\2\u010cJ\3"+
		"\2\2\2\u010d\u010e\7>\2\2\u010eL\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111"+
		"\7?\2\2\u0111N\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114P\3"+
		"\2\2\2\u0115\u0116\7#\2\2\u0116\u0117\7?\2\2\u0117R\3\2\2\2\u0118\u0119"+
		"\7-\2\2\u0119T\3\2\2\2\u011a\u011b\7/\2\2\u011bV\3\2\2\2\u011c\u011d\7"+
		",\2\2\u011dX\3\2\2\2\u011e\u011f\7\61\2\2\u011fZ\3\2\2\2\u0120\u0121\7"+
		"\'\2\2\u0121\\\3\2\2\2\u0122\u0123\7`\2\2\u0123^\3\2\2\2\u0124\u0125\7"+
		"\61\2\2\u0125\u0126\7a\2\2\u0126`\3\2\2\2\u0127\u0128\7?\2\2\u0128b\3"+
		"\2\2\2\u0129\u012a\7&\2\2\u012ad\3\2\2\2\u012b\u012c\7&\2\2\u012c\u012d"+
		"\7&\2\2\u012df\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131"+
		"\7w\2\2\u0131\u0132\7g\2\2\u0132h\3\2\2\2\u0133\u0134\7h\2\2\u0134\u0135"+
		"\7c\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2\u0138"+
		"j\3\2\2\2\u0139\u013b\5U+\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u0150\t\4\2\2\u013d\u0141\t\5\2\2\u013e\u0140\t\6"+
		"\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0150\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\t\6"+
		"\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\t\7\2\2\u014a\u014c\t\6"+
		"\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u013a\3\2\2\2\u014f\u013d\3\2"+
		"\2\2\u014f\u0145\3\2\2\2\u0150l\3\2\2\2\u0151\u0157\5)\25\2\u0152\u0156"+
		"\n\b\2\2\u0153\u0154\7^\2\2\u0154\u0156\t\t\2\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5)\25\2\u015b"+
		"\u0168\3\2\2\2\u015c\u0162\5+\26\2\u015d\u0161\n\n\2\2\u015e\u015f\7^"+
		"\2\2\u015f\u0161\t\13\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5+\26\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0151\3\2\2\2\u0167\u015c\3\2\2\2\u0168n\3\2\2\2\u0169\u016a\5-\27\2"+
		"\u016a\u0171\5s:\2\u016b\u016f\5s:\2\u016c\u016d\5-\27\2\u016d\u016e\5"+
		"m\67\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u0172\3\2\2\2\u0172p\3\2\2\2"+
		"\u0173\u0177\t\f\2\2\u0174\u0176\t\r\2\2\u0175\u0174\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178r\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017c\5-\27\2\u017b\u017d\t\r\2\2\u017c\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0184\3\2\2\2\u0180\u0181\5-\27\2\u0181\u0182\5m\67\2\u0182\u0184\3\2"+
		"\2\2\u0183\u017a\3\2\2\2\u0183\u0180\3\2\2\2\u0184t\3\2\2\2\26\2x}\u0088"+
		"\u0093\u013a\u0141\u0147\u014d\u014f\u0155\u0157\u0160\u0162\u0167\u016f"+
		"\u0171\u0177\u017e\u0183\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}