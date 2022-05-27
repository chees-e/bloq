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
		EQUAL=10, GREATER=11, GREATEREQ=12, LESS=13, LESSRQ=14, NOTEQ=15, PLUS=16, 
		MINUS=17, MULTIPLY=18, DIVIDE=19, MODULO=20, NUMBER=21, TEXT=22, COLON=23, 
		SEMICOLON=24, COMMA=25, OPENCURLY=26, CLOSECURLY=27, OPENBRACKET=28, CLOSEBRACKET=29, 
		NEWLINE=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", "CALL", 
			"EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "MODULO", "NUMBER", "TEXT", "COLON", "SEMICOLON", 
			"COMMA", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", "CLOSEBRACKET", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'canvas'", "'block'", "'start'", "'for'", "'shape'", "'if'", "'to'", 
			"'define'", "'call'", "'=='", "'>'", "'>='", "'<'", "'<='", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", null, null, "':'", "';'", "','", "'{'", "'}'", 
			"'('", "')'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CANVAS", "BLOCK", "START", "FOR", "SHAPE", "IF", "TO", "DEFINE", 
			"CALL", "EQUAL", "GREATER", "GREATEREQ", "LESS", "LESSRQ", "NOTEQ", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "NUMBER", "TEXT", "COLON", "SEMICOLON", 
			"COMMA", "OPENCURLY", "CLOSECURLY", "OPENBRACKET", "CLOSEBRACKET", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\u001f\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003"+
		"\u0014\u008a\b\u0014\u0001\u0014\u0004\u0014\u008d\b\u0014\u000b\u0014"+
		"\f\u0014\u008e\u0001\u0015\u0004\u0015\u0092\b\u0015\u000b\u0015\f\u0015"+
		"\u0093\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0004"+
		"\u001e\u00a7\b\u001e\u000b\u001e\f\u001e\u00a8\u0001\u001e\u0001\u001e"+
		"\u0000\u0000\u001f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"\u0001\u0000\u0003\u0001\u000009\u0003\u000009AZaz\u0002\u0000\r\r  \u00af"+
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
		"\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003F\u0001\u0000"+
		"\u0000\u0000\u0005L\u0001\u0000\u0000\u0000\u0007R\u0001\u0000\u0000\u0000"+
		"\tV\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000\u0000\u0000\r_\u0001\u0000"+
		"\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000"+
		"\u0013n\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017s"+
		"\u0001\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000"+
		"\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f~\u0001\u0000\u0000\u0000"+
		"!\u0080\u0001\u0000\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u0084"+
		"\u0001\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000)\u0089\u0001"+
		"\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-\u0095\u0001\u0000\u0000"+
		"\u0000/\u0097\u0001\u0000\u0000\u00001\u0099\u0001\u0000\u0000\u00003"+
		"\u009b\u0001\u0000\u0000\u00005\u009d\u0001\u0000\u0000\u00007\u009f\u0001"+
		"\u0000\u0000\u00009\u00a1\u0001\u0000\u0000\u0000;\u00a3\u0001\u0000\u0000"+
		"\u0000=\u00a6\u0001\u0000\u0000\u0000?@\u0005c\u0000\u0000@A\u0005a\u0000"+
		"\u0000AB\u0005n\u0000\u0000BC\u0005v\u0000\u0000CD\u0005a\u0000\u0000"+
		"DE\u0005s\u0000\u0000E\u0002\u0001\u0000\u0000\u0000FG\u0005b\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005o\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005"+
		"k\u0000\u0000K\u0004\u0001\u0000\u0000\u0000LM\u0005s\u0000\u0000MN\u0005"+
		"t\u0000\u0000NO\u0005a\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005t\u0000"+
		"\u0000Q\u0006\u0001\u0000\u0000\u0000RS\u0005f\u0000\u0000ST\u0005o\u0000"+
		"\u0000TU\u0005r\u0000\u0000U\b\u0001\u0000\u0000\u0000VW\u0005s\u0000"+
		"\u0000WX\u0005h\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005p\u0000\u0000"+
		"Z[\u0005e\u0000\u0000[\n\u0001\u0000\u0000\u0000\\]\u0005i\u0000\u0000"+
		"]^\u0005f\u0000\u0000^\f\u0001\u0000\u0000\u0000_`\u0005t\u0000\u0000"+
		"`a\u0005o\u0000\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0005d\u0000\u0000"+
		"cd\u0005e\u0000\u0000de\u0005f\u0000\u0000ef\u0005i\u0000\u0000fg\u0005"+
		"n\u0000\u0000gh\u0005e\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005"+
		"c\u0000\u0000jk\u0005a\u0000\u0000kl\u0005l\u0000\u0000lm\u0005l\u0000"+
		"\u0000m\u0012\u0001\u0000\u0000\u0000no\u0005=\u0000\u0000op\u0005=\u0000"+
		"\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0005>\u0000\u0000r\u0016\u0001"+
		"\u0000\u0000\u0000st\u0005>\u0000\u0000tu\u0005=\u0000\u0000u\u0018\u0001"+
		"\u0000\u0000\u0000vw\u0005<\u0000\u0000w\u001a\u0001\u0000\u0000\u0000"+
		"xy\u0005<\u0000\u0000yz\u0005=\u0000\u0000z\u001c\u0001\u0000\u0000\u0000"+
		"{|\u0005!\u0000\u0000|}\u0005=\u0000\u0000}\u001e\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005+\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005-\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"*\u0000\u0000\u0083$\u0001\u0000\u0000\u0000\u0084\u0085\u0005/\u0000"+
		"\u0000\u0085&\u0001\u0000\u0000\u0000\u0086\u0087\u0005%\u0000\u0000\u0087"+
		"(\u0001\u0000\u0000\u0000\u0088\u008a\u0005-\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0007\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f*\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0007\u0001\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094,\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005:\u0000\u0000\u0096.\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005;\u0000\u0000\u00980\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		",\u0000\u0000\u009a2\u0001\u0000\u0000\u0000\u009b\u009c\u0005{\u0000"+
		"\u0000\u009c4\u0001\u0000\u0000\u0000\u009d\u009e\u0005}\u0000\u0000\u009e"+
		"6\u0001\u0000\u0000\u0000\u009f\u00a0\u0005(\u0000\u0000\u00a08\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005)\u0000\u0000\u00a2:\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\n\u0000\u0000\u00a4<\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0007\u0002\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0006\u001e\u0000\u0000\u00ab>\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u0089\u008e\u0093\u00a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}