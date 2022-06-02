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
		EQUAL=10, GREATER=11, GREATEREQ=12, LESS=13, LESSRQ=14, NOTEQ=15, AND=16, 
		OR=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, MODULO=22, NUMBER=23, 
		TEXT=24, COLON=25, SEMICOLON=26, COMMA=27, OPENCURLY=28, CLOSECURLY=29, 
		OPENBRACKET=30, CLOSEBRACKET=31, NEWLINE=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", "CALL", 
			"EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", "AND", "OR", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER", "TEXT", "COLON", 
			"SEMICOLON", "COMMA", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", "CLOSEBRACKET", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'canvas'", "'block'", "'start'", "'for'", "'shape'", "'if'", "'to'", 
			"'define'", "'call'", "'=='", "'>'", "'>='", "'<'", "'<='", "'!='", "'&&'", 
			"'||'", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, "':'", "';'", 
			"','", "'{'", "'}'", "'('", "')'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", 
			"CALL", "EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", "AND", 
			"OR", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER", "TEXT", 
			"COLON", "SEMICOLON", "COMMA", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", 
			"CLOSEBRACKET", "NEWLINE", "WS"
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
		"\u0004\u0000!\u00b6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0003\u0016\u0094\b\u0016\u0001\u0016\u0004\u0016"+
		"\u0097\b\u0016\u000b\u0016\f\u0016\u0098\u0001\u0017\u0004\u0017\u009c"+
		"\b\u0017\u000b\u0017\f\u0017\u009d\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0004 \u00b1\b \u000b \f \u00b2\u0001 \u0001 \u0000"+
		"\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!\u0001"+
		"\u0000\u0003\u0001\u000009\u0003\u000009AZaz\u0003\u0000\t\t\r\r  \u00b9"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003J\u0001\u0000\u0000\u0000"+
		"\u0005P\u0001\u0000\u0000\u0000\u0007V\u0001\u0000\u0000\u0000\tZ\u0001"+
		"\u0000\u0000\u0000\u000b`\u0001\u0000\u0000\u0000\rc\u0001\u0000\u0000"+
		"\u0000\u000ff\u0001\u0000\u0000\u0000\u0011m\u0001\u0000\u0000\u0000\u0013"+
		"r\u0001\u0000\u0000\u0000\u0015u\u0001\u0000\u0000\u0000\u0017w\u0001"+
		"\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b|\u0001\u0000\u0000"+
		"\u0000\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000"+
		"\u0000!\u0085\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%"+
		"\u008a\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000)\u008e"+
		"\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0093\u0001\u0000"+
		"\u0000\u0000/\u009b\u0001\u0000\u0000\u00001\u009f\u0001\u0000\u0000\u0000"+
		"3\u00a1\u0001\u0000\u0000\u00005\u00a3\u0001\u0000\u0000\u00007\u00a5"+
		"\u0001\u0000\u0000\u00009\u00a7\u0001\u0000\u0000\u0000;\u00a9\u0001\u0000"+
		"\u0000\u0000=\u00ab\u0001\u0000\u0000\u0000?\u00ad\u0001\u0000\u0000\u0000"+
		"A\u00b0\u0001\u0000\u0000\u0000CD\u0005c\u0000\u0000DE\u0005a\u0000\u0000"+
		"EF\u0005n\u0000\u0000FG\u0005v\u0000\u0000GH\u0005a\u0000\u0000HI\u0005"+
		"s\u0000\u0000I\u0002\u0001\u0000\u0000\u0000JK\u0005b\u0000\u0000KL\u0005"+
		"l\u0000\u0000LM\u0005o\u0000\u0000MN\u0005c\u0000\u0000NO\u0005k\u0000"+
		"\u0000O\u0004\u0001\u0000\u0000\u0000PQ\u0005s\u0000\u0000QR\u0005t\u0000"+
		"\u0000RS\u0005a\u0000\u0000ST\u0005r\u0000\u0000TU\u0005t\u0000\u0000"+
		"U\u0006\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005o\u0000\u0000"+
		"XY\u0005r\u0000\u0000Y\b\u0001\u0000\u0000\u0000Z[\u0005s\u0000\u0000"+
		"[\\\u0005h\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005p\u0000\u0000^_\u0005"+
		"e\u0000\u0000_\n\u0001\u0000\u0000\u0000`a\u0005i\u0000\u0000ab\u0005"+
		"f\u0000\u0000b\f\u0001\u0000\u0000\u0000cd\u0005t\u0000\u0000de\u0005"+
		"o\u0000\u0000e\u000e\u0001\u0000\u0000\u0000fg\u0005d\u0000\u0000gh\u0005"+
		"e\u0000\u0000hi\u0005f\u0000\u0000ij\u0005i\u0000\u0000jk\u0005n\u0000"+
		"\u0000kl\u0005e\u0000\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0005c\u0000"+
		"\u0000no\u0005a\u0000\u0000op\u0005l\u0000\u0000pq\u0005l\u0000\u0000"+
		"q\u0012\u0001\u0000\u0000\u0000rs\u0005=\u0000\u0000st\u0005=\u0000\u0000"+
		"t\u0014\u0001\u0000\u0000\u0000uv\u0005>\u0000\u0000v\u0016\u0001\u0000"+
		"\u0000\u0000wx\u0005>\u0000\u0000xy\u0005=\u0000\u0000y\u0018\u0001\u0000"+
		"\u0000\u0000z{\u0005<\u0000\u0000{\u001a\u0001\u0000\u0000\u0000|}\u0005"+
		"<\u0000\u0000}~\u0005=\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005!\u0000\u0000\u0080\u0081\u0005=\u0000\u0000\u0081\u001e\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005&\u0000\u0000\u0083\u0084\u0005&\u0000"+
		"\u0000\u0084 \u0001\u0000\u0000\u0000\u0085\u0086\u0005|\u0000\u0000\u0086"+
		"\u0087\u0005|\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005+\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\u008a\u008b\u0005-"+
		"\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005*\u0000\u0000"+
		"\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0005/\u0000\u0000\u008f*"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005%\u0000\u0000\u0091,\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0005-\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0007\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099.\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0007\u0001\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e0\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005:\u0000\u0000\u00a02\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		";\u0000\u0000\u00a24\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005,\u0000"+
		"\u0000\u00a46\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005{\u0000\u0000\u00a6"+
		"8\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005}\u0000\u0000\u00a8:\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005(\u0000\u0000\u00aa<\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005)\u0000\u0000\u00ac>\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\n\u0000\u0000\u00ae@\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u0007\u0002\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0006 \u0000\u0000\u00b5B\u0001\u0000\u0000\u0000\u0005\u0000\u0093\u0098"+
		"\u009d\u00b2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}