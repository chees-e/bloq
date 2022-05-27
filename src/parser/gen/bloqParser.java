// Generated from bloqParser.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bloqParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_canvas_statement = 2, RULE_simple_assignment_statement = 3, 
		RULE_shape_assignment_statement = 4, RULE_call_statement = 5, RULE_define_statement = 6, 
		RULE_block_statement = 7, RULE_block_start_statement = 8, RULE_block_shape_statement = 9, 
		RULE_block_extra_statement = 10, RULE_loop_statement = 11, RULE_if_statement = 12, 
		RULE_condition = 13, RULE_expression = 14, RULE_args = 15, RULE_shape_row = 16, 
		RULE_variable = 17, RULE_value = 18, RULE_comparator = 19, RULE_operator = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "canvas_statement", "simple_assignment_statement", 
			"shape_assignment_statement", "call_statement", "define_statement", "block_statement", 
			"block_start_statement", "block_shape_statement", "block_extra_statement", 
			"loop_statement", "if_statement", "condition", "expression", "args", 
			"shape_row", "variable", "value", "comparator", "operator"
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

	@Override
	public String getGrammarFileName() { return "bloqParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bloqParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CANVAS) | (1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << DEFINE) | (1L << CALL) | (1L << TEXT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Canvas_statementContext canvas_statement() {
			return getRuleContext(Canvas_statementContext.class,0);
		}
		public Simple_assignment_statementContext simple_assignment_statement() {
			return getRuleContext(Simple_assignment_statementContext.class,0);
		}
		public Shape_assignment_statementContext shape_assignment_statement() {
			return getRuleContext(Shape_assignment_statementContext.class,0);
		}
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Call_statementContext call_statement() {
			return getRuleContext(Call_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(47);
				canvas_statement();
				}
				break;
			case 2:
				{
				setState(48);
				simple_assignment_statement();
				}
				break;
			case 3:
				{
				setState(49);
				shape_assignment_statement();
				}
				break;
			case 4:
				{
				setState(50);
				define_statement();
				}
				break;
			case 5:
				{
				setState(51);
				call_statement();
				}
				break;
			case 6:
				{
				setState(52);
				block_statement();
				}
				break;
			case 7:
				{
				setState(53);
				loop_statement();
				}
				break;
			case 8:
				{
				setState(54);
				if_statement();
				}
				break;
			}
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(NEWLINE);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Canvas_statementContext extends ParserRuleContext {
		public TerminalNode CANVAS() { return getToken(bloqParser.CANVAS, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(bloqParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(bloqParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(bloqParser.COMMA, 0); }
		public Canvas_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCanvas_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCanvas_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCanvas_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Canvas_statementContext canvas_statement() throws RecognitionException {
		Canvas_statementContext _localctx = new Canvas_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_canvas_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CANVAS);
			setState(63);
			match(COLON);
			setState(64);
			match(NUMBER);
			setState(65);
			match(COMMA);
			setState(66);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_assignment_statementContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(bloqParser.NUMBER, 0); }
		public Simple_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterSimple_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitSimple_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitSimple_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_assignment_statementContext simple_assignment_statement() throws RecognitionException {
		Simple_assignment_statementContext _localctx = new Simple_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			variable();
			setState(69);
			match(COLON);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(70);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(71);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shape_assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public List<Shape_rowContext> shape_row() {
			return getRuleContexts(Shape_rowContext.class);
		}
		public Shape_rowContext shape_row(int i) {
			return getRuleContext(Shape_rowContext.class,i);
		}
		public Shape_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterShape_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitShape_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitShape_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_assignment_statementContext shape_assignment_statement() throws RecognitionException {
		Shape_assignment_statementContext _localctx = new Shape_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shape_assignment_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			variable();
			setState(75);
			match(COLON);
			setState(76);
			match(NEWLINE);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					shape_row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_statementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(bloqParser.CALL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public Call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_statementContext call_statement() throws RecognitionException {
		Call_statementContext _localctx = new Call_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CALL);
			setState(83);
			variable();
			setState(84);
			match(OPENBRACKET);
			setState(85);
			args();
			setState(86);
			match(CLOSEBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_statementContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(bloqParser.DEFINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public List<Loop_statementContext> loop_statement() {
			return getRuleContexts(Loop_statementContext.class);
		}
		public Loop_statementContext loop_statement(int i) {
			return getRuleContext(Loop_statementContext.class,i);
		}
		public List<Call_statementContext> call_statement() {
			return getRuleContexts(Call_statementContext.class);
		}
		public Call_statementContext call_statement(int i) {
			return getRuleContext(Call_statementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public Define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterDefine_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitDefine_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitDefine_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_statementContext define_statement() throws RecognitionException {
		Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DEFINE);
			setState(89);
			variable();
			setState(90);
			match(OPENBRACKET);
			setState(91);
			args();
			setState(92);
			match(CLOSEBRACKET);
			setState(93);
			match(OPENCURLY);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK:
					{
					setState(100);
					block_statement();
					}
					break;
				case FOR:
					{
					setState(101);
					loop_statement();
					}
					break;
				case CALL:
					{
					setState(102);
					call_statement();
					}
					break;
				case IF:
					{
					setState(103);
					if_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					match(NEWLINE);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL))) != 0) );
			setState(115);
			match(CLOSECURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(bloqParser.BLOCK, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<Block_start_statementContext> block_start_statement() {
			return getRuleContexts(Block_start_statementContext.class);
		}
		public Block_start_statementContext block_start_statement(int i) {
			return getRuleContext(Block_start_statementContext.class,i);
		}
		public List<Block_shape_statementContext> block_shape_statement() {
			return getRuleContexts(Block_shape_statementContext.class);
		}
		public Block_shape_statementContext block_shape_statement(int i) {
			return getRuleContext(Block_shape_statementContext.class,i);
		}
		public List<Block_extra_statementContext> block_extra_statement() {
			return getRuleContexts(Block_extra_statementContext.class);
		}
		public Block_extra_statementContext block_extra_statement(int i) {
			return getRuleContext(Block_extra_statementContext.class,i);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(BLOCK);
			setState(118);
			match(COLON);
			setState(119);
			variable();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(NEWLINE);
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case START:
						{
						setState(121);
						block_start_statement();
						}
						break;
					case SHAPE:
						{
						setState(122);
						block_shape_statement();
						}
						break;
					case BLOCK:
						{
						setState(123);
						block_extra_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_start_statementContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(bloqParser.START, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(bloqParser.COMMA, 0); }
		public Block_start_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_start_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_start_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_start_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_start_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_start_statementContext block_start_statement() throws RecognitionException {
		Block_start_statementContext _localctx = new Block_start_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_start_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(START);
			setState(132);
			match(COLON);
			setState(133);
			value();
			setState(134);
			match(COMMA);
			setState(135);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_shape_statementContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(bloqParser.SHAPE, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public List<Shape_rowContext> shape_row() {
			return getRuleContexts(Shape_rowContext.class);
		}
		public Shape_rowContext shape_row(int i) {
			return getRuleContext(Shape_rowContext.class,i);
		}
		public Block_shape_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_shape_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_shape_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_shape_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_shape_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_shape_statementContext block_shape_statement() throws RecognitionException {
		Block_shape_statementContext _localctx = new Block_shape_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block_shape_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(SHAPE);
			setState(138);
			match(COLON);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(139);
				match(NEWLINE);
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case NEWLINE:
				{
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						shape_row();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXT:
				{
				setState(147);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_extra_statementContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(bloqParser.BLOCK, 0); }
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Block_extra_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_extra_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterBlock_extra_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitBlock_extra_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitBlock_extra_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_extra_statementContext block_extra_statement() throws RecognitionException {
		Block_extra_statementContext _localctx = new Block_extra_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_extra_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(BLOCK);
			setState(151);
			match(COLON);
			setState(152);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(bloqParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode TO() { return getToken(bloqParser.TO, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<Simple_assignment_statementContext> simple_assignment_statement() {
			return getRuleContexts(Simple_assignment_statementContext.class);
		}
		public Simple_assignment_statementContext simple_assignment_statement(int i) {
			return getRuleContext(Simple_assignment_statementContext.class,i);
		}
		public List<Shape_assignment_statementContext> shape_assignment_statement() {
			return getRuleContexts(Shape_assignment_statementContext.class);
		}
		public Shape_assignment_statementContext shape_assignment_statement(int i) {
			return getRuleContext(Shape_assignment_statementContext.class,i);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<Call_statementContext> call_statement() {
			return getRuleContexts(Call_statementContext.class);
		}
		public Call_statementContext call_statement(int i) {
			return getRuleContext(Call_statementContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FOR);
			setState(155);
			variable();
			setState(156);
			match(COLON);
			setState(157);
			value();
			setState(158);
			match(TO);
			setState(159);
			value();
			setState(160);
			match(OPENCURLY);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(161);
				match(NEWLINE);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(167);
					simple_assignment_statement();
					}
					break;
				case 2:
					{
					setState(168);
					shape_assignment_statement();
					}
					break;
				case 3:
					{
					setState(169);
					block_statement();
					}
					break;
				case 4:
					{
					setState(170);
					if_statement();
					}
					break;
				case 5:
					{
					setState(171);
					call_statement();
					}
					break;
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					match(NEWLINE);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(183);
			match(CLOSECURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(bloqParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(bloqParser.OPENBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(bloqParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENCURLY() { return getToken(bloqParser.OPENCURLY, 0); }
		public TerminalNode CLOSECURLY() { return getToken(bloqParser.CLOSECURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(bloqParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bloqParser.NEWLINE, i);
		}
		public List<Simple_assignment_statementContext> simple_assignment_statement() {
			return getRuleContexts(Simple_assignment_statementContext.class);
		}
		public Simple_assignment_statementContext simple_assignment_statement(int i) {
			return getRuleContext(Simple_assignment_statementContext.class,i);
		}
		public List<Shape_assignment_statementContext> shape_assignment_statement() {
			return getRuleContexts(Shape_assignment_statementContext.class);
		}
		public Shape_assignment_statementContext shape_assignment_statement(int i) {
			return getRuleContext(Shape_assignment_statementContext.class,i);
		}
		public List<Block_statementContext> block_statement() {
			return getRuleContexts(Block_statementContext.class);
		}
		public Block_statementContext block_statement(int i) {
			return getRuleContext(Block_statementContext.class,i);
		}
		public List<Call_statementContext> call_statement() {
			return getRuleContexts(Call_statementContext.class);
		}
		public Call_statementContext call_statement(int i) {
			return getRuleContext(Call_statementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			match(OPENBRACKET);
			setState(187);
			condition();
			setState(188);
			match(CLOSEBRACKET);
			setState(189);
			match(OPENCURLY);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(190);
				match(NEWLINE);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(196);
					simple_assignment_statement();
					}
					break;
				case 2:
					{
					setState(197);
					shape_assignment_statement();
					}
					break;
				case 3:
					{
					setState(198);
					block_statement();
					}
					break;
				case 4:
					{
					setState(199);
					call_statement();
					}
					break;
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(NEWLINE);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(211);
			match(CLOSECURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression();
			setState(214);
			comparator();
			setState(215);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			value();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				{
				setState(218);
				operator();
				setState(219);
				value();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(bloqParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(bloqParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			value();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				value();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shape_rowContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bloqParser.NUMBER, 0); }
		public TerminalNode SEMICOLON() { return getToken(bloqParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(bloqParser.NEWLINE, 0); }
		public Shape_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterShape_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitShape_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitShape_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_rowContext shape_row() throws RecognitionException {
		Shape_rowContext _localctx = new Shape_rowContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shape_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(234);
				match(NEWLINE);
				}
			}

			setState(237);
			match(NUMBER);
			setState(238);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(bloqParser.TEXT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bloqParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(bloqParser.TEXT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(bloqParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(bloqParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(bloqParser.GREATEREQ, 0); }
		public TerminalNode LESS() { return getToken(bloqParser.LESS, 0); }
		public TerminalNode LESSRQ() { return getToken(bloqParser.LESSRQ, 0); }
		public TerminalNode NOTEQ() { return getToken(bloqParser.NOTEQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << GREATEREQ) | (1L << LESS) | (1L << LESSRQ) | (1L << NOTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(bloqParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(bloqParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(bloqParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(bloqParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(bloqParser.MODULO, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bloqParserListener ) ((bloqParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bloqParserVisitor ) return ((bloqParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004O\b\u0004\u000b"+
		"\u0004\f\u0004P\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006i\b"+
		"\u0006\u0001\u0006\u0004\u0006l\b\u0006\u000b\u0006\f\u0006m\u0004\u0006"+
		"p\b\u0006\u000b\u0006\f\u0006q\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007}\b\u0007\u0005\u0007\u007f\b\u0007\n\u0007\f\u0007\u0082\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u008d\b\t\u0001\t\u0004\t\u0090\b\t\u000b\t\f\t\u0091\u0001"+
		"\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a3\b\u000b\n\u000b\f\u000b\u00a6\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ad\b\u000b"+
		"\u0001\u000b\u0004\u000b\u00b0\b\u000b\u000b\u000b\f\u000b\u00b1\u0004"+
		"\u000b\u00b4\b\u000b\u000b\u000b\f\u000b\u00b5\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c0\b\f\n\f"+
		"\f\f\u00c3\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001"+
		"\f\u0004\f\u00cc\b\f\u000b\f\f\f\u00cd\u0004\f\u00d0\b\f\u000b\f\f\f\u00d1"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00de\b\u000e\n\u000e\f\u000e\u00e1"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e6\b\u000f"+
		"\n\u000f\f\u000f\u00e9\t\u000f\u0001\u0010\u0003\u0010\u00ec\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000"+
		"\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(\u0000\u0003\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\n\u000f\u0001\u0000\u0010\u0014\u010a\u0000+\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"D\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014"+
		"\u0096\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00b9\u0001\u0000\u0000\u0000\u001a\u00d5\u0001\u0000\u0000\u0000\u001c"+
		"\u00d9\u0001\u0000\u0000\u0000\u001e\u00e2\u0001\u0000\u0000\u0000 \u00eb"+
		"\u0001\u0000\u0000\u0000\"\u00f0\u0001\u0000\u0000\u0000$\u00f2\u0001"+
		"\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000(\u00f6\u0001\u0000\u0000"+
		"\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0001"+
		"\u0001\u0000\u0000\u0000/8\u0003\u0004\u0002\u000008\u0003\u0006\u0003"+
		"\u000018\u0003\b\u0004\u000028\u0003\f\u0006\u000038\u0003\n\u0005\u0000"+
		"48\u0003\u000e\u0007\u000058\u0003\u0016\u000b\u000068\u0003\u0018\f\u0000"+
		"7/\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u000071\u0001\u0000\u0000"+
		"\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u00009;\u0005\u001e\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u0001\u0000\u0000?@\u0005"+
		"\u0017\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0005\u0019\u0000\u0000"+
		"BC\u0005\u0015\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0003\"\u0011"+
		"\u0000EH\u0005\u0017\u0000\u0000FI\u0003\"\u0011\u0000GI\u0005\u0015\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0007\u0001"+
		"\u0000\u0000\u0000JK\u0003\"\u0011\u0000KL\u0005\u0017\u0000\u0000LN\u0005"+
		"\u001e\u0000\u0000MO\u0003 \u0010\u0000NM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\t\u0001\u0000\u0000\u0000RS\u0005\t\u0000\u0000ST\u0003\"\u0011\u0000"+
		"TU\u0005\u001c\u0000\u0000UV\u0003\u001e\u000f\u0000VW\u0005\u001d\u0000"+
		"\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000YZ\u0003\""+
		"\u0011\u0000Z[\u0005\u001c\u0000\u0000[\\\u0003\u001e\u000f\u0000\\]\u0005"+
		"\u001d\u0000\u0000]a\u0005\u001a\u0000\u0000^`\u0005\u001e\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bo\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000di\u0003\u000e\u0007\u0000ei\u0003\u0016\u000b\u0000fi\u0003"+
		"\n\u0005\u0000gi\u0003\u0018\f\u0000hd\u0001\u0000\u0000\u0000he\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000jl\u0005\u001e\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0005\u001b\u0000\u0000t\r\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0002\u0000\u0000vw\u0005\u0017\u0000\u0000w\u0080\u0003"+
		"\"\u0011\u0000x|\u0005\u001e\u0000\u0000y}\u0003\u0010\b\u0000z}\u0003"+
		"\u0012\t\u0000{}\u0003\u0014\n\u0000|y\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~x\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u000f"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u0003\u0000\u0000\u0084\u0085\u0005\u0017\u0000\u0000\u0085\u0086"+
		"\u0003$\u0012\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0088\u0003"+
		"$\u0012\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0005"+
		"\u0000\u0000\u008a\u008c\u0005\u0017\u0000\u0000\u008b\u008d\u0005\u001e"+
		"\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0094\u0001\u0000\u0000\u0000\u008e\u0090\u0003 \u0010"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0095\u0003\"\u0011\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000"+
		"\u0097\u0098\u0005\u0017\u0000\u0000\u0098\u0099\u0003\"\u0011\u0000\u0099"+
		"\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0004\u0000\u0000\u009b"+
		"\u009c\u0003\"\u0011\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u009e"+
		"\u0003$\u0012\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a0\u0003"+
		"$\u0012\u0000\u00a0\u00a4\u0005\u001a\u0000\u0000\u00a1\u00a3\u0005\u001e"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00ad\u0003\u0006\u0003\u0000\u00a8\u00ad\u0003\b\u0004"+
		"\u0000\u00a9\u00ad\u0003\u000e\u0007\u0000\u00aa\u00ad\u0003\u0018\f\u0000"+
		"\u00ab\u00ad\u0003\n\u0005\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u001e\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00ac\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u001b\u0000\u0000\u00b8\u0017\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb\u0005\u001c\u0000\u0000\u00bb"+
		"\u00bc\u0003\u001a\r\u0000\u00bc\u00bd\u0005\u001d\u0000\u0000\u00bd\u00c1"+
		"\u0005\u001a\u0000\u0000\u00be\u00c0\u0005\u001e\u0000\u0000\u00bf\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c9"+
		"\u0003\u0006\u0003\u0000\u00c5\u00c9\u0003\b\u0004\u0000\u00c6\u00c9\u0003"+
		"\u000e\u0007\u0000\u00c7\u00c9\u0003\n\u0005\u0000\u00c8\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0005\u001e\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001b"+
		"\u0000\u0000\u00d4\u0019\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u001c"+
		"\u000e\u0000\u00d6\u00d7\u0003&\u0013\u0000\u00d7\u00d8\u0003\u001c\u000e"+
		"\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\u00d9\u00df\u0003$\u0012\u0000"+
		"\u00da\u00db\u0003(\u0014\u0000\u00db\u00dc\u0003$\u0012\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003$\u0012\u0000\u00e3\u00e4\u0005"+
		"\u0019\u0000\u0000\u00e4\u00e6\u0003$\u0012\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u001f\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005\u001e"+
		"\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0015"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0018\u0000\u0000\u00ef!\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000\u00f1#\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3%\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0007\u0001\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0007\u0002\u0000\u0000\u00f7)\u0001\u0000\u0000\u0000\u0019-7<HPahm"+
		"q|\u0080\u008c\u0091\u0094\u00a4\u00ac\u00b1\u00b5\u00c1\u00c8\u00cd\u00d1"+
		"\u00df\u00e7\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}