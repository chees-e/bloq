// Generated from bloqLexer.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bloqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CANVAS=1, BLOCK=2, START=3, FOR=4, SHAPE=5, IF=6, TO=7, DEFINE=8, CALL=9, 
		ELSE=10, EQUAL=11, GREATER=12, GREATEREQ=13, LESS=14, LESSRQ=15, NOTEQ=16, 
		AND=17, OR=18, NOT=19, PLUS=20, MINUS=21, MULTIPLY=22, DIVIDE=23, MODULO=24, 
		NUMBER=25, TEXT=26, COLON=27, SEMICOLON=28, COMMA=29, OPENCURLY=30, CLOSECURLY=31, 
		OPENBRACKET=32, CLOSEBRACKET=33, NEWLINE=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", "CALL", 
			"ELSE", "EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", "AND", 
			"OR", "NOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER", 
			"TEXT", "COLON", "SEMICOLON", "COMMA", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", 
			"CLOSEBRACKET", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'canvas'", "'block'", "'start'", "'for'", "'shape'", "'if'", "'to'", 
			"'define'", "'call'", "'else'", "'=='", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			null, "':'", "';'", "','", "'{'", "'}'", "'('", "')'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", 
			"CALL", "ELSE", "EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", 
			"AND", "OR", "NOT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
			"NUMBER", "TEXT", "COLON", "SEMICOLON", "COMMA", "OPENCURLY", "CLOSECURLY", 
			"OPENBRACKET", "CLOSEBRACKET", "NEWLINE", "WS"
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


	public bloqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bloqLexer.g4"; }

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
		"\u0004\u0000#\u00c1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u009f"+
		"\b\u0018\u0001\u0018\u0004\u0018\u00a2\b\u0018\u000b\u0018\f\u0018\u00a3"+
		"\u0001\u0019\u0004\u0019\u00a7\b\u0019\u000b\u0019\f\u0019\u00a8\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0004\"\u00bc\b\"\u000b\"\f\"\u00bd\u0001"+
		"\"\u0001\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#\u0001\u0000\u0003\u0001\u000009\u0003\u000009"+
		"AZaz\u0003\u0000\t\t\r\r  \u00c4\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000\u0000\u0003N"+
		"\u0001\u0000\u0000\u0000\u0005T\u0001\u0000\u0000\u0000\u0007Z\u0001\u0000"+
		"\u0000\u0000\t^\u0001\u0000\u0000\u0000\u000bd\u0001\u0000\u0000\u0000"+
		"\rg\u0001\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011q\u0001"+
		"\u0000\u0000\u0000\u0013v\u0001\u0000\u0000\u0000\u0015{\u0001\u0000\u0000"+
		"\u0000\u0017~\u0001\u0000\u0000\u0000\u0019\u0080\u0001\u0000\u0000\u0000"+
		"\u001b\u0083\u0001\u0000\u0000\u0000\u001d\u0085\u0001\u0000\u0000\u0000"+
		"\u001f\u0088\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000#\u008e"+
		"\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0093\u0001"+
		"\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u0097\u0001\u0000\u0000"+
		"\u0000-\u0099\u0001\u0000\u0000\u0000/\u009b\u0001\u0000\u0000\u00001"+
		"\u009e\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u00005\u00aa\u0001"+
		"\u0000\u0000\u00007\u00ac\u0001\u0000\u0000\u00009\u00ae\u0001\u0000\u0000"+
		"\u0000;\u00b0\u0001\u0000\u0000\u0000=\u00b2\u0001\u0000\u0000\u0000?"+
		"\u00b4\u0001\u0000\u0000\u0000A\u00b6\u0001\u0000\u0000\u0000C\u00b8\u0001"+
		"\u0000\u0000\u0000E\u00bb\u0001\u0000\u0000\u0000GH\u0005c\u0000\u0000"+
		"HI\u0005a\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005v\u0000\u0000KL\u0005"+
		"a\u0000\u0000LM\u0005s\u0000\u0000M\u0002\u0001\u0000\u0000\u0000NO\u0005"+
		"b\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005c\u0000"+
		"\u0000RS\u0005k\u0000\u0000S\u0004\u0001\u0000\u0000\u0000TU\u0005s\u0000"+
		"\u0000UV\u0005t\u0000\u0000VW\u0005a\u0000\u0000WX\u0005r\u0000\u0000"+
		"XY\u0005t\u0000\u0000Y\u0006\u0001\u0000\u0000\u0000Z[\u0005f\u0000\u0000"+
		"[\\\u0005o\u0000\u0000\\]\u0005r\u0000\u0000]\b\u0001\u0000\u0000\u0000"+
		"^_\u0005s\u0000\u0000_`\u0005h\u0000\u0000`a\u0005a\u0000\u0000ab\u0005"+
		"p\u0000\u0000bc\u0005e\u0000\u0000c\n\u0001\u0000\u0000\u0000de\u0005"+
		"i\u0000\u0000ef\u0005f\u0000\u0000f\f\u0001\u0000\u0000\u0000gh\u0005"+
		"t\u0000\u0000hi\u0005o\u0000\u0000i\u000e\u0001\u0000\u0000\u0000jk\u0005"+
		"d\u0000\u0000kl\u0005e\u0000\u0000lm\u0005f\u0000\u0000mn\u0005i\u0000"+
		"\u0000no\u0005n\u0000\u0000op\u0005e\u0000\u0000p\u0010\u0001\u0000\u0000"+
		"\u0000qr\u0005c\u0000\u0000rs\u0005a\u0000\u0000st\u0005l\u0000\u0000"+
		"tu\u0005l\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vw\u0005e\u0000\u0000"+
		"wx\u0005l\u0000\u0000xy\u0005s\u0000\u0000yz\u0005e\u0000\u0000z\u0014"+
		"\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|}\u0005=\u0000\u0000}\u0016"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005>\u0000\u0000\u007f\u0018\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005>\u0000\u0000\u0081\u0082\u0005=\u0000\u0000"+
		"\u0082\u001a\u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000\u0000\u0084"+
		"\u001c\u0001\u0000\u0000\u0000\u0085\u0086\u0005<\u0000\u0000\u0086\u0087"+
		"\u0005=\u0000\u0000\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"!\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a \u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005&\u0000\u0000\u008c\u008d\u0005&\u0000\u0000\u008d"+
		"\"\u0001\u0000\u0000\u0000\u008e\u008f\u0005|\u0000\u0000\u008f\u0090"+
		"\u0005|\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0092\u0005!"+
		"\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093\u0094\u0005+\u0000\u0000"+
		"\u0094(\u0001\u0000\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096*"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098,\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a.\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005%\u0000\u0000\u009c0\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0005-\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0007"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a42\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007\u0001"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a94\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005:\u0000\u0000"+
		"\u00ab6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005;\u0000\u0000\u00ad8"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005,\u0000\u0000\u00af:\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005{\u0000\u0000\u00b1<\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005}\u0000\u0000\u00b3>\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005(\u0000\u0000\u00b5@\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005)"+
		"\u0000\u0000\u00b7B\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\n\u0000"+
		"\u0000\u00b9D\u0001\u0000\u0000\u0000\u00ba\u00bc\u0007\u0002\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006\"\u0000\u0000\u00c0"+
		"F\u0001\u0000\u0000\u0000\u0005\u0000\u009e\u00a3\u00a8\u00bd\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}