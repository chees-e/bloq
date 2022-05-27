// Generated from bloqParser.g4 by ANTLR 4.10.1

package parser.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		RULE_loop_statement = 10, RULE_if_statement = 11, RULE_condition = 12, 
		RULE_expression = 13, RULE_args = 14, RULE_shape_row = 15, RULE_variable = 16, 
		RULE_value = 17, RULE_comparator = 18, RULE_operator = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "canvas_statement", "simple_assignment_statement", 
			"shape_assignment_statement", "call_statement", "define_statement", "block_statement", 
			"block_start_statement", "block_shape_statement", "loop_statement", "if_statement", 
			"condition", "expression", "args", "shape_row", "variable", "value", 
			"comparator", "operator"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(43); 
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(45);
				canvas_statement();
				}
				break;
			case 2:
				{
				setState(46);
				simple_assignment_statement();
				}
				break;
			case 3:
				{
				setState(47);
				shape_assignment_statement();
				}
				break;
			case 4:
				{
				setState(48);
				define_statement();
				}
				break;
			case 5:
				{
				setState(49);
				call_statement();
				}
				break;
			case 6:
				{
				setState(50);
				block_statement();
				}
				break;
			case 7:
				{
				setState(51);
				loop_statement();
				}
				break;
			case 8:
				{
				setState(52);
				if_statement();
				}
				break;
			}
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(NEWLINE);
				}
				}
				setState(58); 
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
			setState(60);
			match(CANVAS);
			setState(61);
			match(COLON);
			setState(62);
			match(NUMBER);
			setState(63);
			match(COMMA);
			setState(64);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(bloqParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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

        public ExpressionContext expression() {
            //TODO: I am unsure about this implementation
            return null;
        }
    }

	public final Simple_assignment_statementContext simple_assignment_statement() throws RecognitionException {
		Simple_assignment_statementContext _localctx = new Simple_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			variable();
			setState(67);
			match(COLON);
			setState(68);
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
			setState(70);
			variable();
			setState(71);
			match(COLON);
			setState(72);
			match(NEWLINE);
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					shape_row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(78);
			match(CALL);
			setState(79);
			variable();
			setState(80);
			match(OPENBRACKET);
			setState(81);
			args();
			setState(82);
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

        public Iterable<? extends Simple_assignment_statementContext> simple_assignment_statement() {
            //TODO: Need to implement
            return null;
        }

        public Iterable<? extends Shape_assignment_statementContext> shape_assignment_statement() {
            //TODO: Need to implement
            return null;
        }
    }

	public final Define_statementContext define_statement() throws RecognitionException {
		Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(DEFINE);
			setState(85);
			variable();
			setState(86);
			match(OPENBRACKET);
			setState(87);
			args();
			setState(88);
			match(CLOSEBRACKET);
			setState(89);
			match(OPENCURLY);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(90);
				match(NEWLINE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(96);
					simple_assignment_statement();
					}
					break;
				case 2:
					{
					setState(97);
					shape_assignment_statement();
					}
					break;
				case 3:
					{
					setState(98);
					block_statement();
					}
					break;
				case 4:
					{
					setState(99);
					loop_statement();
					}
					break;
				case 5:
					{
					setState(100);
					call_statement();
					}
					break;
				case 6:
					{
					setState(101);
					if_statement();
					}
					break;
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					match(NEWLINE);
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(113);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
			setState(115);
			match(BLOCK);
			setState(116);
			match(COLON);
			setState(117);
			args();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					match(NEWLINE);
					setState(121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case START:
						{
						setState(119);
						block_start_statement();
						}
						break;
					case SHAPE:
						{
						setState(120);
						block_shape_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(128);
			match(START);
			setState(129);
			match(COLON);
			setState(130);
			value();
			setState(131);
			match(COMMA);
			setState(132);
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
			setState(134);
			match(SHAPE);
			setState(135);
			match(COLON);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				match(NEWLINE);
				}
				break;
			}
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case NEWLINE:
				{
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						shape_row();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXT:
				{
				setState(144);
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
		enterRule(_localctx, 20, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			variable();
			setState(149);
			match(COLON);
			setState(150);
			value();
			setState(151);
			match(TO);
			setState(152);
			value();
			setState(153);
			match(OPENCURLY);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(154);
				match(NEWLINE);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(160);
					simple_assignment_statement();
					}
					break;
				case 2:
					{
					setState(161);
					shape_assignment_statement();
					}
					break;
				case 3:
					{
					setState(162);
					block_statement();
					}
					break;
				case 4:
					{
					setState(163);
					if_statement();
					}
					break;
				case 5:
					{
					setState(164);
					call_statement();
					}
					break;
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(NEWLINE);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << IF) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(176);
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
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IF);
			setState(179);
			match(OPENBRACKET);
			setState(180);
			condition();
			setState(181);
			match(CLOSEBRACKET);
			setState(182);
			match(OPENCURLY);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(183);
				match(NEWLINE);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(189);
					simple_assignment_statement();
					}
					break;
				case 2:
					{
					setState(190);
					shape_assignment_statement();
					}
					break;
				case 3:
					{
					setState(191);
					block_statement();
					}
					break;
				case 4:
					{
					setState(192);
					call_statement();
					}
					break;
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					match(NEWLINE);
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK) | (1L << CALL) | (1L << TEXT))) != 0) );
			setState(204);
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
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression();
			setState(207);
			comparator();
			setState(208);
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			value();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				{
				setState(211);
				operator();
				setState(212);
				value();
				}
				}
				setState(218);
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
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			value();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				value();
				}
				}
				setState(226);
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
		enterRule(_localctx, 30, RULE_shape_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(227);
				match(NEWLINE);
				}
			}

			setState(230);
			match(NUMBER);
			setState(231);
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
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 36, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 38, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		"\u0004\u0001\u001f\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b"+
		"\u0000\f\u0000+\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001"+
		"\u0001\u0004\u00019\b\u0001\u000b\u0001\f\u0001:\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004K\b\u0004\u000b\u0004\f\u0004L\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\\\b"+
		"\u0006\n\u0006\f\u0006_\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0006\u0004"+
		"\u0006j\b\u0006\u000b\u0006\f\u0006k\u0004\u0006n\b\u0006\u000b\u0006"+
		"\f\u0006o\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0005\u0007"+
		"|\b\u0007\n\u0007\f\u0007\u007f\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\t\u0004"+
		"\t\u008d\b\t\u000b\t\f\t\u008e\u0001\t\u0003\t\u0092\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009c\b\n\n"+
		"\n\f\n\u009f\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a6"+
		"\b\n\u0001\n\u0004\n\u00a9\b\n\u000b\n\f\n\u00aa\u0004\n\u00ad\b\n\u000b"+
		"\n\f\n\u00ae\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b9\b\u000b\n\u000b\f\u000b"+
		"\u00bc\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c2\b\u000b\u0001\u000b\u0004\u000b\u00c5\b\u000b\u000b\u000b\f\u000b"+
		"\u00c6\u0004\u000b\u00c9\b\u000b\u000b\u000b\f\u000b\u00ca\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00d7\b\r\n\r\f\r\u00da\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00df\b\u000e\n\u000e\f\u000e\u00e2\t\u000e\u0001\u000f\u0003"+
		"\u000f\u00e5\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0003\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\n\u000f\u0001\u0000\u0010\u0014\u0104\u0000"+
		")\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004<\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000"+
		"\u0000\nN\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000es\u0001"+
		"\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0086\u0001"+
		"\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00b2\u0001"+
		"\u0000\u0000\u0000\u0018\u00ce\u0001\u0000\u0000\u0000\u001a\u00d2\u0001"+
		"\u0000\u0000\u0000\u001c\u00db\u0001\u0000\u0000\u0000\u001e\u00e4\u0001"+
		"\u0000\u0000\u0000 \u00e9\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000"+
		"\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000"+
		"(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001\u0001"+
		"\u0000\u0000\u0000-6\u0003\u0004\u0002\u0000.6\u0003\u0006\u0003\u0000"+
		"/6\u0003\b\u0004\u000006\u0003\f\u0006\u000016\u0003\n\u0005\u000026\u0003"+
		"\u000e\u0007\u000036\u0003\u0014\n\u000046\u0003\u0016\u000b\u00005-\u0001"+
		"\u0000\u0000\u00005.\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u0000"+
		"50\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000068\u0001\u0000"+
		"\u0000\u000079\u0005\u001e\u0000\u000087\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";\u0003\u0001\u0000\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0005\u0017"+
		"\u0000\u0000>?\u0005\u0015\u0000\u0000?@\u0005\u0019\u0000\u0000@A\u0005"+
		"\u0015\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0003 \u0010\u0000"+
		"CD\u0005\u0017\u0000\u0000DE\u0003\u001a\r\u0000E\u0007\u0001\u0000\u0000"+
		"\u0000FG\u0003 \u0010\u0000GH\u0005\u0017\u0000\u0000HJ\u0005\u001e\u0000"+
		"\u0000IK\u0003\u001e\u000f\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\t\u0001"+
		"\u0000\u0000\u0000NO\u0005\t\u0000\u0000OP\u0003 \u0010\u0000PQ\u0005"+
		"\u001c\u0000\u0000QR\u0003\u001c\u000e\u0000RS\u0005\u001d\u0000\u0000"+
		"S\u000b\u0001\u0000\u0000\u0000TU\u0005\b\u0000\u0000UV\u0003 \u0010\u0000"+
		"VW\u0005\u001c\u0000\u0000WX\u0003\u001c\u000e\u0000XY\u0005\u001d\u0000"+
		"\u0000Y]\u0005\u001a\u0000\u0000Z\\\u0005\u001e\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^m\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`g\u0003\u0006\u0003\u0000ag\u0003\b\u0004\u0000bg\u0003\u000e\u0007\u0000"+
		"cg\u0003\u0014\n\u0000dg\u0003\n\u0005\u0000eg\u0003\u0016\u000b\u0000"+
		"f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000"+
		"\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000gi\u0001\u0000\u0000\u0000hj\u0005\u001e\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u001b\u0000\u0000r\r\u0001"+
		"\u0000\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0005\u0017\u0000\u0000"+
		"u}\u0003\u001c\u000e\u0000vy\u0005\u001e\u0000\u0000wz\u0003\u0010\b\u0000"+
		"xz\u0003\u0012\t\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u000f"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0003\u0000\u0000\u0081\u0082\u0005\u0017\u0000\u0000\u0082\u0083\u0003"+
		"\"\u0011\u0000\u0083\u0084\u0005\u0019\u0000\u0000\u0084\u0085\u0003\""+
		"\u0011\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0005"+
		"\u0000\u0000\u0087\u0089\u0005\u0017\u0000\u0000\u0088\u008a\u0005\u001e"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0091\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u001e"+
		"\u000f\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0003 \u0010"+
		"\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0004\u0000"+
		"\u0000\u0094\u0095\u0003 \u0010\u0000\u0095\u0096\u0005\u0017\u0000\u0000"+
		"\u0096\u0097\u0003\"\u0011\u0000\u0097\u0098\u0005\u0007\u0000\u0000\u0098"+
		"\u0099\u0003\"\u0011\u0000\u0099\u009d\u0005\u001a\u0000\u0000\u009a\u009c"+
		"\u0005\u001e\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00ac\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a6\u0003\u0006\u0003\u0000\u00a1\u00a6"+
		"\u0003\b\u0004\u0000\u00a2\u00a6\u0003\u000e\u0007\u0000\u00a3\u00a6\u0003"+
		"\u0016\u000b\u0000\u00a4\u00a6\u0003\n\u0005\u0000\u00a5\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u001e"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1\u0015\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4\u0005\u001c"+
		"\u0000\u0000\u00b4\u00b5\u0003\u0018\f\u0000\u00b5\u00b6\u0005\u001d\u0000"+
		"\u0000\u00b6\u00ba\u0005\u001a\u0000\u0000\u00b7\u00b9\u0005\u001e\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00c8\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c2\u0003\u0006\u0003\u0000\u00be\u00c2\u0003\b\u0004\u0000"+
		"\u00bf\u00c2\u0003\u000e\u0007\u0000\u00c0\u00c2\u0003\n\u0005\u0000\u00c1"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u001e\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u001b\u0000\u0000\u00cd\u0017\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0003\u001a\r\u0000\u00cf\u00d0\u0003$\u0012\u0000\u00d0\u00d1"+
		"\u0003\u001a\r\u0000\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003"+
		"\"\u0011\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d5\u0003\"\u0011"+
		"\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u001b\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00e0\u0003\"\u0011\u0000"+
		"\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00df\u0003\"\u0011\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u001d\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e5\u0005\u001e\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\u0015\u0000\u0000\u00e7\u00e8\u0005\u0018\u0000\u0000\u00e8"+
		"\u001f\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0016\u0000\u0000\u00ea"+
		"!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0000\u0000\u0000\u00ec#\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0007\u0001\u0000\u0000\u00ee%\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0007\u0002\u0000\u0000\u00f0\'\u0001\u0000\u0000"+
		"\u0000\u0018+5:L]fkoy}\u0089\u008e\u0091\u009d\u00a5\u00aa\u00ae\u00ba"+
		"\u00c1\u00c6\u00ca\u00d8\u00e0\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}