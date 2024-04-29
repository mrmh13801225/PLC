// Generated from E:/PLC/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FUNCTION=5, END_OF_SCOPE=6, LAMBDA=7, 
		MAIN=8, RETURN=9, IF=10, ELSEIF=11, ELSE=12, CHOP=13, CHOMP=14, PUSH=15, 
		PUTS=16, METHOD=17, LENGTH=18, PATTERN=19, MATCH=20, NEXT=21, BREAK=22, 
		LOOP=23, DO=24, FOR=25, IN=26, FLOAT_VAL=27, INT_VAL=28, TRUE=29, FALSE=30, 
		STRING_VAL=31, LPAR=32, RPAR=33, LBRACKET=34, RBRACKET=35, PLUS=36, MINUS=37, 
		MULT=38, DIV=39, MOD=40, PLUS_PLUS=41, MINUS_MINUS=42, GEQ=43, LEQ=44, 
		GTR=45, LES=46, EQL=47, NEQ=48, AND=49, OR=50, NOT=51, ASSIGN=52, PLUS_ASSIGN=53, 
		MINUS_ASSIGN=54, MULT_ASSIGN=55, DIV_ASSIGN=56, MOD_ASSIGN=57, APPEND=58, 
		LBRACE=59, RBRACE=60, COMMA=61, SEMICOLON=62, DOT=63, COLON=64, IDENTIFIER=65, 
		SINGLE_LINE_COMMENT=66, MULTY_LINE_COMMENT=67, WS=68;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_main = 2, RULE_declerationArg = 3, 
		RULE_defaultArg = 4, RULE_normalArgs = 5, RULE_defaultArgs = 6, RULE_declerationArgs = 7, 
		RULE_patternDeclaration = 8, RULE_pattern = 9, RULE_functionDecleration = 10, 
		RULE_function = 11, RULE_lambdaFunctionDecleration = 12, RULE_lambdaFunction = 13, 
		RULE_inputArgs = 14, RULE_assignmentOperators = 15, RULE_logicalOperator = 16, 
		RULE_directValue = 17, RULE_intVal = 18, RULE_floatVal = 19, RULE_booleanVal = 20, 
		RULE_list = 21, RULE_listAccess = 22, RULE_condition = 23, RULE_functionCall = 24, 
		RULE_patternCall = 25, RULE_lamdaCall = 26, RULE_functionPointer = 27, 
		RULE_builtIn = 28, RULE_chop = 29, RULE_chomp = 30, RULE_len = 31, RULE_puts = 32, 
		RULE_push = 33, RULE_expression = 34, RULE_exprAppend = 35, RULE_exprAppend_ = 36, 
		RULE_exprOr = 37, RULE_exprOr_ = 38, RULE_exprAnd = 39, RULE_exprAnd_ = 40, 
		RULE_exprEq = 41, RULE_exprEq_ = 42, RULE_exprCmp = 43, RULE_exprCmp_ = 44, 
		RULE_exprAddSub = 45, RULE_exprAddSub_ = 46, RULE_exprMultDiv = 47, RULE_exprMultDiv_ = 48, 
		RULE_exprUnary = 49, RULE_exprUnaryPostfix = 50, RULE_exprValues = 51, 
		RULE_statement = 52, RULE_returnStatement = 53, RULE_assignmentStatement = 54, 
		RULE_ifStatement = 55, RULE_ifBlock = 56, RULE_elseifBlock = 57, RULE_elseBlock = 58, 
		RULE_loopDo = 59, RULE_forLoop = 60, RULE_range = 61, RULE_loopBody = 62, 
		RULE_ifLoopStatement = 63, RULE_ifLoopBlock = 64, RULE_elseifLoopBlock = 65, 
		RULE_elseLoopBlock = 66, RULE_next = 67, RULE_nextif = 68, RULE_break = 69, 
		RULE_breakif = 70, RULE_comment = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "main", "declerationArg", "defaultArg", "normalArgs", 
			"defaultArgs", "declerationArgs", "patternDeclaration", "pattern", "functionDecleration", 
			"function", "lambdaFunctionDecleration", "lambdaFunction", "inputArgs", 
			"assignmentOperators", "logicalOperator", "directValue", "intVal", "floatVal", 
			"booleanVal", "list", "listAccess", "condition", "functionCall", "patternCall", 
			"lamdaCall", "functionPointer", "builtIn", "chop", "chomp", "len", "puts", 
			"push", "expression", "exprAppend", "exprAppend_", "exprOr", "exprOr_", 
			"exprAnd", "exprAnd_", "exprEq", "exprEq_", "exprCmp", "exprCmp_", "exprAddSub", 
			"exprAddSub_", "exprMultDiv", "exprMultDiv_", "exprUnary", "exprUnaryPostfix", 
			"exprValues", "statement", "returnStatement", "assignmentStatement", 
			"ifStatement", "ifBlock", "elseifBlock", "elseBlock", "loopDo", "forLoop", 
			"range", "loopBody", "ifLoopStatement", "ifLoopBlock", "elseifLoopBlock", 
			"elseLoopBlock", "next", "nextif", "break", "breakif", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r\\n    |'", "'\\r\\n\\t|'", "'\\n    |'", "'\\n\\t|'", "'def'", 
			"'end'", "'->'", "'main'", "'return'", "'if'", "'elseif'", "'else'", 
			"'chop'", "'chomp'", "'push'", "'puts'", "'method'", "'len'", "'pattern'", 
			"'match'", "'next'", "'break'", "'loop'", "'do'", "'for'", "'in'", null, 
			null, "'true'", "'false'", null, "'('", "')'", "'['", "']'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'++'", "'--'", "'>='", "'<='", "'>'", "'<'", "'=='", 
			"'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'<<'", "'{'", "'}'", "','", "';'", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FUNCTION", "END_OF_SCOPE", "LAMBDA", "MAIN", 
			"RETURN", "IF", "ELSEIF", "ELSE", "CHOP", "CHOMP", "PUSH", "PUTS", "METHOD", 
			"LENGTH", "PATTERN", "MATCH", "NEXT", "BREAK", "LOOP", "DO", "FOR", "IN", 
			"FLOAT_VAL", "INT_VAL", "TRUE", "FALSE", "STRING_VAL", "LPAR", "RPAR", 
			"LBRACKET", "RBRACKET", "PLUS", "MINUS", "MULT", "DIV", "MOD", "PLUS_PLUS", 
			"MINUS_MINUS", "GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "AND", "OR", 
			"NOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "APPEND", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOT", 
			"COLON", "IDENTIFIER", "SINGLE_LINE_COMMENT", "MULTY_LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(147);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNCTION:
						{
						setState(144);
						function();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTY_LINE_COMMENT:
						{
						setState(145);
						comment();
						}
						break;
					case PATTERN:
						{
						setState(146);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(152);
			main();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTY_LINE_COMMENT) {
				{
				{
				setState(153);
				comment();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 2017630227059249097L) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LAMBDA:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LENGTH:
				case LOOP:
				case FOR:
				case FLOAT_VAL:
				case INT_VAL:
				case TRUE:
				case FALSE:
				case STRING_VAL:
				case LPAR:
				case LBRACKET:
				case PLUS:
				case MINUS:
				case NOT:
				case IDENTIFIER:
					{
					setState(159);
					statement();
					}
					break;
				case SINGLE_LINE_COMMENT:
				case MULTY_LINE_COMMENT:
					{
					setState(160);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(166);
				returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FunctionCraftParser.FUNCTION, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(FUNCTION);
			setState(170);
			match(MAIN);
			setState(171);
			match(LPAR);
			setState(172);
			match(RPAR);
			System.out.println("MAIN");
			setState(174);
			body();
			setState(175);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclerationArgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DeclerationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declerationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDeclerationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDeclerationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDeclerationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclerationArgContext declerationArg() throws RecognitionException {
		DeclerationArgContext _localctx = new DeclerationArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declerationArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultArgContext extends ParserRuleContext {
		public DeclerationArgContext declerationArg() {
			return getRuleContext(DeclerationArgContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDefaultArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDefaultArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDefaultArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultArgContext defaultArg() throws RecognitionException {
		DefaultArgContext _localctx = new DefaultArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defaultArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			declerationArg();
			setState(180);
			match(ASSIGN);
			setState(181);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalArgsContext extends ParserRuleContext {
		public List<DeclerationArgContext> declerationArg() {
			return getRuleContexts(DeclerationArgContext.class);
		}
		public DeclerationArgContext declerationArg(int i) {
			return getRuleContext(DeclerationArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public NormalArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNormalArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNormalArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNormalArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalArgsContext normalArgs() throws RecognitionException {
		NormalArgsContext _localctx = new NormalArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normalArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					declerationArg();
					setState(184);
					match(COMMA);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(191);
			declerationArg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultArgsContext extends ParserRuleContext {
		public List<DefaultArgContext> defaultArg() {
			return getRuleContexts(DefaultArgContext.class);
		}
		public DefaultArgContext defaultArg(int i) {
			return getRuleContext(DefaultArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public DefaultArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDefaultArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDefaultArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDefaultArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultArgsContext defaultArgs() throws RecognitionException {
		DefaultArgsContext _localctx = new DefaultArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defaultArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						defaultArg();
						setState(194);
						match(COMMA);
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(201);
				defaultArg();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclerationArgsContext extends ParserRuleContext {
		public NormalArgsContext normalArgs() {
			return getRuleContext(NormalArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public DefaultArgsContext defaultArgs() {
			return getRuleContext(DefaultArgsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public DeclerationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declerationArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDeclerationArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDeclerationArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDeclerationArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclerationArgsContext declerationArgs() throws RecognitionException {
		DeclerationArgsContext _localctx = new DeclerationArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declerationArgs);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(204);
				normalArgs();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(205);
					match(COMMA);
					setState(206);
					match(LBRACKET);
					setState(207);
					defaultArgs();
					setState(208);
					match(RBRACKET);
					}
				}

				}
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(LBRACKET);
				setState(213);
				defaultArgs();
				setState(214);
				match(RBRACKET);
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternDeclarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public PatternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPatternDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPatternDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPatternDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternDeclarationContext patternDeclaration() throws RecognitionException {
		PatternDeclarationContext _localctx = new PatternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_patternDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(PATTERN);
			setState(220);
			((PatternDeclarationContext)_localctx).name = match(IDENTIFIER);
			System.out.println("PatternDec: "+(((PatternDeclarationContext)_localctx).name!=null?((PatternDeclarationContext)_localctx).name.getText():null));
			setState(222);
			match(LPAR);
			{
			setState(223);
			declerationArgs();
			}
			setState(224);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternDeclarationContext patternDeclaration() {
			return getRuleContext(PatternDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			patternDeclaration();
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				condition();
				setState(229);
				match(ASSIGN);
				setState(230);
				expression();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) );
			setState(236);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclerationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode FUNCTION() { return getToken(FunctionCraftParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public FunctionDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclerationContext functionDecleration() throws RecognitionException {
		FunctionDeclerationContext _localctx = new FunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FUNCTION);
			setState(239);
			((FunctionDeclerationContext)_localctx).name = match(IDENTIFIER);
			System.out.println("FuncDec: "+(((FunctionDeclerationContext)_localctx).name!=null?((FunctionDeclerationContext)_localctx).name.getText():null));
			setState(241);
			match(LPAR);
			{
			setState(242);
			declerationArgs();
			}
			setState(243);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclerationContext functionDecleration() {
			return getRuleContext(FunctionDeclerationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			functionDecleration();
			setState(246);
			body();
			setState(247);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionDeclerationContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(FunctionCraftParser.LAMBDA, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public LambdaFunctionDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambdaFunctionDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambdaFunctionDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambdaFunctionDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionDeclerationContext lambdaFunctionDecleration() throws RecognitionException {
		LambdaFunctionDeclerationContext _localctx = new LambdaFunctionDeclerationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lambdaFunctionDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LAMBDA);
			System.out.println("Structure: LAMBDA");
			setState(251);
			match(LPAR);
			{
			setState(252);
			declerationArgs();
			}
			setState(253);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionContext extends ParserRuleContext {
		public LambdaFunctionDeclerationContext lambdaFunctionDecleration() {
			return getRuleContext(LambdaFunctionDeclerationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			lambdaFunctionDecleration();
			setState(256);
			match(LBRACE);
			setState(257);
			body();
			setState(258);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public InputArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterInputArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitInputArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitInputArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgsContext inputArgs() throws RecognitionException {
		InputArgsContext _localctx = new InputArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 288247970148650945L) != 0)) {
				{
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						expression();
						setState(261);
						match(COMMA);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(268);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FunctionCraftParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public AssignmentOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignmentOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignmentOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignmentOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorsContext assignmentOperators() throws RecognitionException {
		AssignmentOperatorsContext _localctx = new AssignmentOperatorsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 283726776524341248L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectValueContext extends ParserRuleContext {
		public IntValContext intVal() {
			return getRuleContext(IntValContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public FloatValContext floatVal() {
			return getRuleContext(FloatValContext.class,0);
		}
		public BooleanValContext booleanVal() {
			return getRuleContext(BooleanValContext.class,0);
		}
		public DirectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterDirectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitDirectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitDirectValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectValueContext directValue() throws RecognitionException {
		DirectValueContext _localctx = new DirectValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_directValue);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				intVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				floatVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				booleanVal();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntValContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public IntValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValContext intVal() throws RecognitionException {
		IntValContext _localctx = new IntValContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(284);
			match(INT_VAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatValContext extends ParserRuleContext {
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public FloatValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFloatVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFloatVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatValContext floatVal() throws RecognitionException {
		FloatValContext _localctx = new FloatValContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_floatVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(289);
			match(FLOAT_VAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public BooleanValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBooleanVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBooleanVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBooleanVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValContext booleanVal() throws RecognitionException {
		BooleanValContext _localctx = new BooleanValContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LBRACKET);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACKET:
				{
				}
				break;
			case LAMBDA:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LENGTH:
			case FLOAT_VAL:
			case INT_VAL:
			case TRUE:
			case FALSE:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case NOT:
			case IDENTIFIER:
				{
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295);
						expression();
						setState(296);
						match(COMMA);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(303);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitListAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitListAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAccessContext listAccess() throws RecognitionException {
		ListAccessContext _localctx = new ListAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IDENTIFIER);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				match(LBRACKET);
				{
				setState(310);
				expression();
				}
				setState(311);
				match(RBRACKET);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LPAR);
			setState(318);
			expression();
			setState(319);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public InputArgsContext inputArgs() {
			return getRuleContext(InputArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BuiltInContext builtIn() {
			return getRuleContext(BuiltInContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(321);
				match(IDENTIFIER);
				System.out.println("FunctionCall");
				setState(323);
				match(LPAR);
				setState(324);
				inputArgs();
				setState(325);
				match(RPAR);
				}
				}
				break;
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				builtIn();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public InputArgsContext inputArgs() {
			return getRuleContext(InputArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PatternCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPatternCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPatternCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPatternCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternCallContext patternCall() throws RecognitionException {
		PatternCallContext _localctx = new PatternCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_patternCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IDENTIFIER);
			setState(331);
			match(DOT);
			setState(332);
			match(MATCH);
			setState(333);
			match(LPAR);
			setState(334);
			inputArgs();
			setState(335);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LamdaCallContext extends ParserRuleContext {
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public InputArgsContext inputArgs() {
			return getRuleContext(InputArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public LamdaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lamdaCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLamdaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLamdaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLamdaCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LamdaCallContext lamdaCall() throws RecognitionException {
		LamdaCallContext _localctx = new LamdaCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lamdaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			lambdaFunction();
			setState(338);
			match(LPAR);
			setState(339);
			inputArgs();
			setState(340);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPointerContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public FunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPointerContext functionPointer() throws RecognitionException {
		FunctionPointerContext _localctx = new FunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionPointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(METHOD);
			setState(343);
			match(LPAR);
			setState(344);
			match(COLON);
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInContext extends ParserRuleContext {
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public BuiltInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuiltIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuiltIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuiltIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInContext builtIn() throws RecognitionException {
		BuiltInContext _localctx = new BuiltInContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_builtIn);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOP:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(348);
				chop();
				}
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(349);
				chomp();
				}
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(350);
				len();
				}
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(351);
				puts();
				}
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(352);
				push();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(CHOP);
			System.out.println("Built-In: CHOP");
			setState(357);
			match(LPAR);
			setState(358);
			expression();
			setState(359);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(CHOMP);
			System.out.println("Built-In: CHOMP");
			setState(363);
			match(LPAR);
			setState(364);
			expression();
			setState(365);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(FunctionCraftParser.LENGTH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LENGTH);
			System.out.println("Built-In: LEN");
			setState(369);
			match(LPAR);
			setState(370);
			expression();
			setState(371);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(PUTS);
			System.out.println("Built-In: PUTS");
			setState(375);
			match(LPAR);
			setState(376);
			expression();
			setState(377);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PUSH);
			System.out.println("Built-In: PUSH");
			setState(381);
			match(LPAR);
			setState(382);
			expression();
			setState(383);
			match(COMMA);
			setState(384);
			expression();
			setState(385);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExprAppendContext exprAppend() {
			return getRuleContext(ExprAppendContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			exprAppend();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAppendContext extends ParserRuleContext {
		public ExprOrContext exprOr() {
			return getRuleContext(ExprOrContext.class,0);
		}
		public ExprAppend_Context exprAppend_() {
			return getRuleContext(ExprAppend_Context.class,0);
		}
		public ExprAppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAppend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAppendContext exprAppend() throws RecognitionException {
		ExprAppendContext _localctx = new ExprAppendContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprAppend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			exprOr();
			setState(390);
			exprAppend_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAppend_Context extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public ExprOrContext exprOr() {
			return getRuleContext(ExprOrContext.class,0);
		}
		public ExprAppend_Context exprAppend_() {
			return getRuleContext(ExprAppend_Context.class,0);
		}
		public ExprAppend_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAppend_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAppend_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAppend_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAppend_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAppend_Context exprAppend_() throws RecognitionException {
		ExprAppend_Context _localctx = new ExprAppend_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprAppend_);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(APPEND);
				setState(393);
				exprOr();
				System.out.println("Operator: <<");
				setState(395);
				exprAppend_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprOr_Context exprOr_() {
			return getRuleContext(ExprOr_Context.class,0);
		}
		public ExprAndContext exprAnd() {
			return getRuleContext(ExprAndContext.class,0);
		}
		public ExprOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOrContext exprOr() throws RecognitionException {
		ExprOrContext _localctx = new ExprOrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exprOr);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(LPAR);
				setState(401);
				expression();
				setState(402);
				match(RPAR);
				setState(403);
				exprOr_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				exprAnd();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOr_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprOr_Context exprOr_() {
			return getRuleContext(ExprOr_Context.class,0);
		}
		public ExprOr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOr_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprOr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprOr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprOr_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOr_Context exprOr_() throws RecognitionException {
		ExprOr_Context _localctx = new ExprOr_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprOr_);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(OR);
				System.out.println("Operator: ||");
				setState(410);
				match(LPAR);
				setState(411);
				expression();
				setState(412);
				match(RPAR);
				setState(413);
				exprOr_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprAnd_Context exprAnd_() {
			return getRuleContext(ExprAnd_Context.class,0);
		}
		public ExprEqContext exprEq() {
			return getRuleContext(ExprEqContext.class,0);
		}
		public ExprAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAndContext exprAnd() throws RecognitionException {
		ExprAndContext _localctx = new ExprAndContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprAnd);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(LPAR);
				setState(419);
				expression();
				setState(420);
				match(RPAR);
				setState(421);
				exprAnd_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				exprEq();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAnd_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExprAnd_Context exprAnd_() {
			return getRuleContext(ExprAnd_Context.class,0);
		}
		public ExprAnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAnd_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAnd_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAnd_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAnd_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAnd_Context exprAnd_() throws RecognitionException {
		ExprAnd_Context _localctx = new ExprAnd_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprAnd_);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(AND);
				System.out.println("Operator: &&");
				setState(428);
				match(LPAR);
				setState(429);
				expression();
				setState(430);
				match(RPAR);
				setState(431);
				exprAnd_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqContext extends ParserRuleContext {
		public ExprCmpContext exprCmp() {
			return getRuleContext(ExprCmpContext.class,0);
		}
		public ExprEq_Context exprEq_() {
			return getRuleContext(ExprEq_Context.class,0);
		}
		public ExprEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEqContext exprEq() throws RecognitionException {
		ExprEqContext _localctx = new ExprEqContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			exprCmp();
			setState(437);
			exprEq_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprEq_Context extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public ExprCmpContext exprCmp() {
			return getRuleContext(ExprCmpContext.class,0);
		}
		public ExprEq_Context exprEq_() {
			return getRuleContext(ExprEq_Context.class,0);
		}
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public ExprEq_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEq_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprEq_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprEq_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprEq_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEq_Context exprEq_() throws RecognitionException {
		ExprEq_Context _localctx = new ExprEq_Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_exprEq_);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(EQL);
				System.out.println("Operator: ==");
				setState(441);
				exprCmp();
				setState(442);
				exprEq_();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(NEQ);
				System.out.println("Operator: !=");
				setState(446);
				exprCmp();
				setState(447);
				exprEq_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCmpContext extends ParserRuleContext {
		public ExprAddSubContext exprAddSub() {
			return getRuleContext(ExprAddSubContext.class,0);
		}
		public ExprCmp_Context exprCmp_() {
			return getRuleContext(ExprCmp_Context.class,0);
		}
		public ExprCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCmpContext exprCmp() throws RecognitionException {
		ExprCmpContext _localctx = new ExprCmpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exprCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			exprAddSub();
			setState(453);
			exprCmp_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCmp_Context extends ParserRuleContext {
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public ExprAddSubContext exprAddSub() {
			return getRuleContext(ExprAddSubContext.class,0);
		}
		public ExprCmp_Context exprCmp_() {
			return getRuleContext(ExprCmp_Context.class,0);
		}
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public ExprCmp_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCmp_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprCmp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprCmp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprCmp_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCmp_Context exprCmp_() throws RecognitionException {
		ExprCmp_Context _localctx = new ExprCmp_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprCmp_);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(GTR);
				System.out.println("Operator: >");
				setState(457);
				exprAddSub();
				setState(458);
				exprCmp_();
				}
				break;
			case LES:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(LES);
				System.out.println("Operator: <");
				setState(462);
				exprAddSub();
				setState(463);
				exprCmp_();
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(GEQ);
				System.out.println("Operator: >=");
				setState(467);
				exprAddSub();
				setState(468);
				exprCmp_();
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(LEQ);
				System.out.println("Operator: <=");
				setState(472);
				exprAddSub();
				setState(473);
				exprCmp_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case EQL:
			case NEQ:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ParserRuleContext {
		public ExprMultDivContext exprMultDiv() {
			return getRuleContext(ExprMultDivContext.class,0);
		}
		public ExprAddSub_Context exprAddSub_() {
			return getRuleContext(ExprAddSub_Context.class,0);
		}
		public ExprAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAddSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAddSubContext exprAddSub() throws RecognitionException {
		ExprAddSubContext _localctx = new ExprAddSubContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exprAddSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			exprMultDiv();
			setState(479);
			exprAddSub_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSub_Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public ExprMultDivContext exprMultDiv() {
			return getRuleContext(ExprMultDivContext.class,0);
		}
		public ExprAddSub_Context exprAddSub_() {
			return getRuleContext(ExprAddSub_Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public ExprAddSub_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAddSub_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprAddSub_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprAddSub_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprAddSub_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAddSub_Context exprAddSub_() throws RecognitionException {
		ExprAddSub_Context _localctx = new ExprAddSub_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exprAddSub_);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(PLUS);
				setState(482);
				exprMultDiv();
				System.out.println("Operator: +");
				setState(484);
				exprAddSub_();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(MINUS);
				setState(487);
				exprMultDiv();
				System.out.println("Operator: -");
				setState(489);
				exprAddSub_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ParserRuleContext {
		public ExprUnaryContext exprUnary() {
			return getRuleContext(ExprUnaryContext.class,0);
		}
		public ExprMultDiv_Context exprMultDiv_() {
			return getRuleContext(ExprMultDiv_Context.class,0);
		}
		public ExprMultDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMultDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultDivContext exprMultDiv() throws RecognitionException {
		ExprMultDivContext _localctx = new ExprMultDivContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exprMultDiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			exprUnary();
			setState(495);
			exprMultDiv_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDiv_Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public ExprUnaryContext exprUnary() {
			return getRuleContext(ExprUnaryContext.class,0);
		}
		public ExprMultDiv_Context exprMultDiv_() {
			return getRuleContext(ExprMultDiv_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public ExprMultDiv_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMultDiv_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprMultDiv_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprMultDiv_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprMultDiv_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultDiv_Context exprMultDiv_() throws RecognitionException {
		ExprMultDiv_Context _localctx = new ExprMultDiv_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_exprMultDiv_);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(MULT);
				setState(498);
				exprUnary();
				System.out.println("Operator: *");
				setState(500);
				exprMultDiv_();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(DIV);
				setState(503);
				exprUnary();
				System.out.println("Operator: /");
				setState(505);
				exprMultDiv_();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(MOD);
				setState(508);
				exprUnary();
				System.out.println("Operator: %");
				setState(510);
				exprMultDiv_();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case RPAR:
			case RBRACKET:
			case PLUS:
			case MINUS:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case APPEND:
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public ExprUnaryPostfixContext exprUnaryPostfix() {
			return getRuleContext(ExprUnaryPostfixContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public ExprUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprUnaryContext exprUnary() throws RecognitionException {
		ExprUnaryContext _localctx = new ExprUnaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_exprUnary);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(NOT);
				System.out.println("Operator: !");
				setState(517);
				exprUnaryPostfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(MINUS);
				System.out.println("Operator: -");
				setState(520);
				exprUnaryPostfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				exprUnaryPostfix();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryPostfixContext extends ParserRuleContext {
		public ExprValuesContext exprValues() {
			return getRuleContext(ExprValuesContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(FunctionCraftParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(FunctionCraftParser.MINUS_MINUS, 0); }
		public ExprUnaryPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprUnaryPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprUnaryPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprUnaryPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprUnaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprUnaryPostfixContext exprUnaryPostfix() throws RecognitionException {
		ExprUnaryPostfixContext _localctx = new ExprUnaryPostfixContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exprUnaryPostfix);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				exprValues();
				setState(525);
				match(PLUS_PLUS);
				System.out.println("Operator: ++");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				exprValues();
				setState(529);
				match(MINUS_MINUS);
				System.out.println("Operator: --");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				exprValues();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprValuesContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ListAccessContext listAccess() {
			return getRuleContext(ListAccessContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(FunctionCraftParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(FunctionCraftParser.MINUS_MINUS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionPointerContext functionPointer() {
			return getRuleContext(FunctionPointerContext.class,0);
		}
		public LamdaCallContext lamdaCall() {
			return getRuleContext(LamdaCallContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public PatternCallContext patternCall() {
			return getRuleContext(PatternCallContext.class,0);
		}
		public ExprValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExprValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExprValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExprValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprValuesContext exprValues() throws RecognitionException {
		ExprValuesContext _localctx = new ExprValuesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exprValues);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(LPAR);
				setState(536);
				expression();
				setState(537);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				directValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(541);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(542);
					listAccess();
					}
					break;
				}
				setState(546);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(545);
					_la = _input.LA(1);
					if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(548);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
				functionPointer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(550);
				lamdaCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(551);
				lambdaFunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
				patternCall();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopDoContext loopDo() {
			return getRuleContext(LoopDoContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statement);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAMBDA:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LENGTH:
			case FLOAT_VAL:
			case INT_VAL:
			case TRUE:
			case FALSE:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case NOT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(555);
					assignmentStatement();
					}
					break;
				case 2:
					{
					setState(556);
					expression();
					}
					break;
				}
				setState(559);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				ifStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				loopDo();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				forLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(RETURN);
			System.out.println("RETURN");
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 288247970148650945L) != 0)) {
				{
				setState(568);
				expression();
				}
			}

			setState(571);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public Token name;
		public AssignmentOperatorsContext assignmentOperators() {
			return getRuleContext(AssignmentOperatorsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			((AssignmentStatementContext)_localctx).name = match(IDENTIFIER);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(574);
					match(LBRACKET);
					{
					setState(575);
					expression();
					}
					setState(576);
					match(RBRACKET);
					}
					}
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				}
			}

			System.out.println("Assignment: "+(((AssignmentStatementContext)_localctx).name!=null?((AssignmentStatementContext)_localctx).name.getText():null));
			setState(585);
			assignmentOperators();
			setState(586);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public List<ElseifBlockContext> elseifBlock() {
			return getRuleContexts(ElseifBlockContext.class);
		}
		public ElseifBlockContext elseifBlock(int i) {
			return getRuleContext(ElseifBlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			ifBlock();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(589);
				elseifBlock();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(595);
				elseBlock();
				}
				break;
			case END_OF_SCOPE:
				{
				setState(596);
				match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(IF);
			System.out.println("Decision: IF");
			setState(601);
			condition();
			setState(602);
			body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifBlockContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifBlockContext elseifBlock() throws RecognitionException {
		ElseifBlockContext _localctx = new ElseifBlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elseifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ELSEIF);
			System.out.println("Decision: ELSE IF");
			setState(606);
			condition();
			setState(607);
			body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(ELSE);
			System.out.println("Decision: ELSE");
			setState(611);
			body();
			setState(612);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopDoContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public LoopDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDoContext loopDo() throws RecognitionException {
		LoopDoContext _localctx = new LoopDoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_loopDo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LOOP);
			setState(615);
			match(DO);
			System.out.println("Loop: DO");
			setState(617);
			loopBody();
			setState(618);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(FOR);
			System.out.println("Loop: FOR");
			setState(622);
			match(IDENTIFIER);
			setState(623);
			match(IN);
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(624);
				match(IDENTIFIER);
				}
				break;
			case LPAR:
				{
				setState(625);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(628);
			loopBody();
			setState(629);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public IntValContext intVal() {
			return getRuleContext(IntValContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(LPAR);
			setState(632);
			intVal();
			setState(633);
			match(DOT);
			setState(634);
			match(DOT);
			setState(635);
			match(INT_VAL);
			setState(636);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<IfLoopStatementContext> ifLoopStatement() {
			return getRuleContexts(IfLoopStatementContext.class);
		}
		public IfLoopStatementContext ifLoopStatement(int i) {
			return getRuleContext(IfLoopStatementContext.class,i);
		}
		public List<BreakContext> break_() {
			return getRuleContexts(BreakContext.class);
		}
		public BreakContext break_(int i) {
			return getRuleContext(BreakContext.class,i);
		}
		public List<NextContext> next() {
			return getRuleContexts(NextContext.class);
		}
		public NextContext next(int i) {
			return getRuleContext(NextContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 2017630227059298249L) != 0)) {
				{
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(638);
					statement();
					}
					break;
				case 2:
					{
					setState(639);
					comment();
					}
					break;
				case 3:
					{
					setState(640);
					ifLoopStatement();
					}
					break;
				case 4:
					{
					setState(641);
					break_();
					}
					break;
				case 5:
					{
					setState(642);
					next();
					}
					break;
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(648);
				returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfLoopStatementContext extends ParserRuleContext {
		public IfLoopBlockContext ifLoopBlock() {
			return getRuleContext(IfLoopBlockContext.class,0);
		}
		public ElseLoopBlockContext elseLoopBlock() {
			return getRuleContext(ElseLoopBlockContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public List<ElseifLoopBlockContext> elseifLoopBlock() {
			return getRuleContexts(ElseifLoopBlockContext.class);
		}
		public ElseifLoopBlockContext elseifLoopBlock(int i) {
			return getRuleContext(ElseifLoopBlockContext.class,i);
		}
		public IfLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLoopStatementContext ifLoopStatement() throws RecognitionException {
		IfLoopStatementContext _localctx = new IfLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ifLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			ifLoopBlock();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(652);
				elseifLoopBlock();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(658);
				elseLoopBlock();
				}
				break;
			case END_OF_SCOPE:
				{
				setState(659);
				match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfLoopBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public IfLoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLoopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLoopBlockContext ifLoopBlock() throws RecognitionException {
		IfLoopBlockContext _localctx = new IfLoopBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ifLoopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(IF);
			System.out.println("Decision: IF");
			setState(664);
			condition();
			setState(665);
			loopBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifLoopBlockContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public ElseifLoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifLoopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseifLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseifLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseifLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifLoopBlockContext elseifLoopBlock() throws RecognitionException {
		ElseifLoopBlockContext _localctx = new ElseifLoopBlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elseifLoopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(ELSEIF);
			System.out.println("Decision: ELSE IF");
			setState(669);
			condition();
			setState(670);
			loopBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseLoopBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public ElseLoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseLoopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseLoopBlockContext elseLoopBlock() throws RecognitionException {
		ElseLoopBlockContext _localctx = new ElseLoopBlockContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elseLoopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(ELSE);
			System.out.println("Decision: ELSE");
			setState(674);
			loopBody();
			setState(675);
			match(END_OF_SCOPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public NextifContext nextif() {
			return getRuleContext(NextifContext.class,0);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_next);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(677);
				match(NEXT);
				setState(678);
				match(SEMICOLON);
				System.out.println("Control: NEXT");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				nextif();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextifContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public NextifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNextif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNextif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNextif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextifContext nextif() throws RecognitionException {
		NextifContext _localctx = new NextifContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nextif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(NEXT);
			setState(684);
			match(IF);
			System.out.println("Control: NEXT");
			setState(686);
			condition();
			setState(687);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public BreakifContext breakif() {
			return getRuleContext(BreakifContext.class,0);
		}
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_break);
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(689);
				match(BREAK);
				setState(690);
				match(SEMICOLON);
				System.out.println("Control: BREAK");
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				breakif();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakifContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public BreakifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreakif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreakif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreakif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakifContext breakif() throws RecognitionException {
		BreakifContext _localctx = new BreakifContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_breakif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(BREAK);
			setState(696);
			match(IF);
			System.out.println("Control: BREAK");
			setState(698);
			condition();
			setState(699);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(FunctionCraftParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTY_LINE_COMMENT() { return getToken(FunctionCraftParser.MULTY_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTY_LINE_COMMENT) ) {
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
		"\u0004\u0001D\u02c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0094\b\u0000\n\u0000\f\u0000\u0097\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u009b\b\u0000\n\u0000\f\u0000\u009e\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u00a2\b\u0001\n\u0001\f\u0001\u00a5\t\u0001\u0001\u0001\u0003"+
		"\u0001\u00a8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c5\b\u0006"+
		"\n\u0006\f\u0006\u00c8\t\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d3\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00da\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00e9\b\t\u000b\t\f\t\u00ea\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0108\b\u000e\n\u000e\f\u000e\u010b\t\u000e\u0001\u000e\u0003\u000e\u010e"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0118\b\u0011\u0001\u0012\u0003"+
		"\u0012\u011b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0120"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012b\b\u0015\n"+
		"\u0015\f\u0015\u012e\t\u0015\u0001\u0015\u0003\u0015\u0131\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0004\u0016\u013a\b\u0016\u000b\u0016\f\u0016\u013b\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0149\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0162\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u018f\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0197\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u01a1\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u01a9\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u01b3\b(\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01c3\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01dd\b,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u01ed\b.\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u0202\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u020b\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u0216\b2\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u0220\b3\u00013\u00033\u0223\b3\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u022a\b3\u00014\u00014\u00034\u022e\b4\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0235\b4\u00015\u00015\u00015\u0003"+
		"5\u023a\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00046\u0243"+
		"\b6\u000b6\f6\u0244\u00036\u0247\b6\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00057\u024f\b7\n7\f7\u0252\t7\u00017\u00017\u00037\u0256\b7"+
		"\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0273\b<\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0005>\u0284\b>\n>\f>\u0287\t>\u0001>\u0003"+
		">\u028a\b>\u0001?\u0001?\u0005?\u028e\b?\n?\f?\u0291\t?\u0001?\u0001?"+
		"\u0003?\u0295\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u02aa\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u02b6\bE\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0000\u0000H\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0000\u0007\u0001\u0000\u0001\u0004\u0001\u000049\u0001\u0000"+
		"13\u0001\u0000$%\u0001\u0000\u001d\u001e\u0001\u0000)*\u0001\u0000BC\u02c6"+
		"\u0000\u0095\u0001\u0000\u0000\u0000\u0002\u00a3\u0001\u0000\u0000\u0000"+
		"\u0004\u00a9\u0001\u0000\u0000\u0000\u0006\u00b1\u0001\u0000\u0000\u0000"+
		"\b\u00b3\u0001\u0000\u0000\u0000\n\u00bc\u0001\u0000\u0000\u0000\f\u00ca"+
		"\u0001\u0000\u0000\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u00db"+
		"\u0001\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000\u0000\u0014\u00ee"+
		"\u0001\u0000\u0000\u0000\u0016\u00f5\u0001\u0000\u0000\u0000\u0018\u00f9"+
		"\u0001\u0000\u0000\u0000\u001a\u00ff\u0001\u0000\u0000\u0000\u001c\u010d"+
		"\u0001\u0000\u0000\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u0111\u0001"+
		"\u0000\u0000\u0000\"\u0117\u0001\u0000\u0000\u0000$\u011a\u0001\u0000"+
		"\u0000\u0000&\u011f\u0001\u0000\u0000\u0000(\u0123\u0001\u0000\u0000\u0000"+
		"*\u0125\u0001\u0000\u0000\u0000,\u0134\u0001\u0000\u0000\u0000.\u013d"+
		"\u0001\u0000\u0000\u00000\u0148\u0001\u0000\u0000\u00002\u014a\u0001\u0000"+
		"\u0000\u00004\u0151\u0001\u0000\u0000\u00006\u0156\u0001\u0000\u0000\u0000"+
		"8\u0161\u0001\u0000\u0000\u0000:\u0163\u0001\u0000\u0000\u0000<\u0169"+
		"\u0001\u0000\u0000\u0000>\u016f\u0001\u0000\u0000\u0000@\u0175\u0001\u0000"+
		"\u0000\u0000B\u017b\u0001\u0000\u0000\u0000D\u0183\u0001\u0000\u0000\u0000"+
		"F\u0185\u0001\u0000\u0000\u0000H\u018e\u0001\u0000\u0000\u0000J\u0196"+
		"\u0001\u0000\u0000\u0000L\u01a0\u0001\u0000\u0000\u0000N\u01a8\u0001\u0000"+
		"\u0000\u0000P\u01b2\u0001\u0000\u0000\u0000R\u01b4\u0001\u0000\u0000\u0000"+
		"T\u01c2\u0001\u0000\u0000\u0000V\u01c4\u0001\u0000\u0000\u0000X\u01dc"+
		"\u0001\u0000\u0000\u0000Z\u01de\u0001\u0000\u0000\u0000\\\u01ec\u0001"+
		"\u0000\u0000\u0000^\u01ee\u0001\u0000\u0000\u0000`\u0201\u0001\u0000\u0000"+
		"\u0000b\u020a\u0001\u0000\u0000\u0000d\u0215\u0001\u0000\u0000\u0000f"+
		"\u0229\u0001\u0000\u0000\u0000h\u0234\u0001\u0000\u0000\u0000j\u0236\u0001"+
		"\u0000\u0000\u0000l\u023d\u0001\u0000\u0000\u0000n\u024c\u0001\u0000\u0000"+
		"\u0000p\u0257\u0001\u0000\u0000\u0000r\u025c\u0001\u0000\u0000\u0000t"+
		"\u0261\u0001\u0000\u0000\u0000v\u0266\u0001\u0000\u0000\u0000x\u026c\u0001"+
		"\u0000\u0000\u0000z\u0277\u0001\u0000\u0000\u0000|\u0285\u0001\u0000\u0000"+
		"\u0000~\u028b\u0001\u0000\u0000\u0000\u0080\u0296\u0001\u0000\u0000\u0000"+
		"\u0082\u029b\u0001\u0000\u0000\u0000\u0084\u02a0\u0001\u0000\u0000\u0000"+
		"\u0086\u02a9\u0001\u0000\u0000\u0000\u0088\u02ab\u0001\u0000\u0000\u0000"+
		"\u008a\u02b5\u0001\u0000\u0000\u0000\u008c\u02b7\u0001\u0000\u0000\u0000"+
		"\u008e\u02bd\u0001\u0000\u0000\u0000\u0090\u0094\u0003\u0016\u000b\u0000"+
		"\u0091\u0094\u0003\u008eG\u0000\u0092\u0094\u0003\u0012\t\u0000\u0093"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009c\u0003\u0004\u0002\u0000\u0099\u009b\u0003\u008eG\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0001"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0003h4\u0000\u00a0\u00a2\u0003\u008eG\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0003j5\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0003\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab"+
		"\u00ac\u0005 \u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae\u0006"+
		"\u0002\uffff\uffff\u0000\u00ae\u00af\u0003\u0002\u0001\u0000\u00af\u00b0"+
		"\u0005\u0006\u0000\u0000\u00b0\u0005\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005A\u0000\u0000\u00b2\u0007\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003"+
		"\u0006\u0003\u0000\u00b4\u00b5\u00054\u0000\u0000\u00b5\u00b6\u0003D\""+
		"\u0000\u00b6\t\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0006\u0003\u0000"+
		"\u00b8\u00b9\u0005=\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0003\u0006\u0003\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003\b\u0004\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\b\u0004\u0000\u00ca\u00c6\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\r\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d2\u0003\n\u0005\u0000\u00cd\u00ce\u0005=\u0000"+
		"\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0003\f\u0006\u0000"+
		"\u00d0\u00d1\u0005#\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00da\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\"\u0000\u0000\u00d5\u00d6"+
		"\u0003\f\u0006\u0000\u00d6\u00d7\u0005#\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0013\u0000\u0000\u00dc\u00dd\u0005A\u0000\u0000\u00dd\u00de\u0006\b"+
		"\uffff\uffff\u0000\u00de\u00df\u0005 \u0000\u0000\u00df\u00e0\u0003\u000e"+
		"\u0007\u0000\u00e0\u00e1\u0005!\u0000\u0000\u00e1\u0011\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e8\u0003\u0010\b\u0000\u00e3\u00e4\u0007\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0003.\u0017\u0000\u00e5\u00e6\u00054\u0000\u0000\u00e6\u00e7"+
		"\u0003D\"\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005>\u0000\u0000\u00ed\u0013\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f0\u0005A\u0000"+
		"\u0000\u00f0\u00f1\u0006\n\uffff\uffff\u0000\u00f1\u00f2\u0005 \u0000"+
		"\u0000\u00f2\u00f3\u0003\u000e\u0007\u0000\u00f3\u00f4\u0005!\u0000\u0000"+
		"\u00f4\u0015\u0001\u0000\u0000\u0000\u00f5\u00f6\u0003\u0014\n\u0000\u00f6"+
		"\u00f7\u0003\u0002\u0001\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8"+
		"\u0017\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0007\u0000\u0000\u00fa"+
		"\u00fb\u0006\f\uffff\uffff\u0000\u00fb\u00fc\u0005 \u0000\u0000\u00fc"+
		"\u00fd\u0003\u000e\u0007\u0000\u00fd\u00fe\u0005!\u0000\u0000\u00fe\u0019"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u0018\f\u0000\u0100\u0101\u0005"+
		";\u0000\u0000\u0101\u0102\u0003\u0002\u0001\u0000\u0102\u0103\u0005<\u0000"+
		"\u0000\u0103\u001b\u0001\u0000\u0000\u0000\u0104\u0105\u0003D\"\u0000"+
		"\u0105\u0106\u0005=\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0104\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0003D\"\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u001d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0007\u0001\u0000\u0000\u0110\u001f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0007\u0002\u0000\u0000\u0112!\u0001\u0000\u0000\u0000\u0113\u0118\u0003"+
		"$\u0012\u0000\u0114\u0118\u0005\u001f\u0000\u0000\u0115\u0118\u0003&\u0013"+
		"\u0000\u0116\u0118\u0003(\u0014\u0000\u0117\u0113\u0001\u0000\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119"+
		"\u011b\u0007\u0003\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001c\u0000\u0000\u011d%\u0001\u0000\u0000\u0000\u011e\u0120"+
		"\u0007\u0003\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u001b\u0000\u0000\u0122\'\u0001\u0000\u0000\u0000\u0123\u0124\u0007"+
		"\u0004\u0000\u0000\u0124)\u0001\u0000\u0000\u0000\u0125\u0130\u0005\""+
		"\u0000\u0000\u0126\u0131\u0001\u0000\u0000\u0000\u0127\u0128\u0003D\""+
		"\u0000\u0128\u0129\u0005=\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000"+
		"\u012a\u0127\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0003D\"\u0000\u0130\u0126\u0001\u0000\u0000\u0000\u0130"+
		"\u012c\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005#\u0000\u0000\u0133+\u0001\u0000\u0000\u0000\u0134\u0139\u0005"+
		"A\u0000\u0000\u0135\u0136\u0005\"\u0000\u0000\u0136\u0137\u0003D\"\u0000"+
		"\u0137\u0138\u0005#\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139"+
		"\u0135\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"-\u0001\u0000\u0000\u0000\u013d\u013e\u0005 \u0000\u0000\u013e\u013f\u0003"+
		"D\"\u0000\u013f\u0140\u0005!\u0000\u0000\u0140/\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0005A\u0000\u0000\u0142\u0143\u0006\u0018\uffff\uffff\u0000"+
		"\u0143\u0144\u0005 \u0000\u0000\u0144\u0145\u0003\u001c\u000e\u0000\u0145"+
		"\u0146\u0005!\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u00038\u001c\u0000\u0148\u0141\u0001\u0000\u0000\u0000\u0148\u0147\u0001"+
		"\u0000\u0000\u0000\u01491\u0001\u0000\u0000\u0000\u014a\u014b\u0005A\u0000"+
		"\u0000\u014b\u014c\u0005?\u0000\u0000\u014c\u014d\u0005\u0014\u0000\u0000"+
		"\u014d\u014e\u0005 \u0000\u0000\u014e\u014f\u0003\u001c\u000e\u0000\u014f"+
		"\u0150\u0005!\u0000\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u0152\u0003"+
		"\u001a\r\u0000\u0152\u0153\u0005 \u0000\u0000\u0153\u0154\u0003\u001c"+
		"\u000e\u0000\u0154\u0155\u0005!\u0000\u0000\u01555\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0005\u0011\u0000\u0000\u0157\u0158\u0005 \u0000\u0000\u0158"+
		"\u0159\u0005@\u0000\u0000\u0159\u015a\u0005A\u0000\u0000\u015a\u015b\u0005"+
		"!\u0000\u0000\u015b7\u0001\u0000\u0000\u0000\u015c\u0162\u0003:\u001d"+
		"\u0000\u015d\u0162\u0003<\u001e\u0000\u015e\u0162\u0003>\u001f\u0000\u015f"+
		"\u0162\u0003@ \u0000\u0160\u0162\u0003B!\u0000\u0161\u015c\u0001\u0000"+
		"\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000"+
		"\u0000\u0000\u01629\u0001\u0000\u0000\u0000\u0163\u0164\u0005\r\u0000"+
		"\u0000\u0164\u0165\u0006\u001d\uffff\uffff\u0000\u0165\u0166\u0005 \u0000"+
		"\u0000\u0166\u0167\u0003D\"\u0000\u0167\u0168\u0005!\u0000\u0000\u0168"+
		";\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u000e\u0000\u0000\u016a\u016b"+
		"\u0006\u001e\uffff\uffff\u0000\u016b\u016c\u0005 \u0000\u0000\u016c\u016d"+
		"\u0003D\"\u0000\u016d\u016e\u0005!\u0000\u0000\u016e=\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005\u0012\u0000\u0000\u0170\u0171\u0006\u001f\uffff"+
		"\uffff\u0000\u0171\u0172\u0005 \u0000\u0000\u0172\u0173\u0003D\"\u0000"+
		"\u0173\u0174\u0005!\u0000\u0000\u0174?\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005\u0010\u0000\u0000\u0176\u0177\u0006 \uffff\uffff\u0000\u0177\u0178"+
		"\u0005 \u0000\u0000\u0178\u0179\u0003D\"\u0000\u0179\u017a\u0005!\u0000"+
		"\u0000\u017aA\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u000f\u0000\u0000"+
		"\u017c\u017d\u0006!\uffff\uffff\u0000\u017d\u017e\u0005 \u0000\u0000\u017e"+
		"\u017f\u0003D\"\u0000\u017f\u0180\u0005=\u0000\u0000\u0180\u0181\u0003"+
		"D\"\u0000\u0181\u0182\u0005!\u0000\u0000\u0182C\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0003F#\u0000\u0184E\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0003J%\u0000\u0186\u0187\u0003H$\u0000\u0187G\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0005:\u0000\u0000\u0189\u018a\u0003J%\u0000\u018a\u018b"+
		"\u0006$\uffff\uffff\u0000\u018b\u018c\u0003H$\u0000\u018c\u018f\u0001"+
		"\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0188\u0001"+
		"\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018fI\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0005 \u0000\u0000\u0191\u0192\u0003D\"\u0000"+
		"\u0192\u0193\u0005!\u0000\u0000\u0193\u0194\u0003L&\u0000\u0194\u0197"+
		"\u0001\u0000\u0000\u0000\u0195\u0197\u0003N\'\u0000\u0196\u0190\u0001"+
		"\u0000\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197K\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u00052\u0000\u0000\u0199\u019a\u0006&\uffff\uffff"+
		"\u0000\u019a\u019b\u0005 \u0000\u0000\u019b\u019c\u0003D\"\u0000\u019c"+
		"\u019d\u0005!\u0000\u0000\u019d\u019e\u0003L&\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u0198\u0001"+
		"\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1M\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005 \u0000\u0000\u01a3\u01a4\u0003D\"\u0000"+
		"\u01a4\u01a5\u0005!\u0000\u0000\u01a5\u01a6\u0003P(\u0000\u01a6\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003R)\u0000\u01a8\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9O\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u00051\u0000\u0000\u01ab\u01ac\u0006(\uffff\uffff\u0000"+
		"\u01ac\u01ad\u0005 \u0000\u0000\u01ad\u01ae\u0003D\"\u0000\u01ae\u01af"+
		"\u0005!\u0000\u0000\u01af\u01b0\u0003P(\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01aa\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3Q\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0003V+\u0000\u01b5\u01b6\u0003T*\u0000\u01b6S\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0005/\u0000\u0000\u01b8\u01b9\u0006*\uffff"+
		"\uffff\u0000\u01b9\u01ba\u0003V+\u0000\u01ba\u01bb\u0003T*\u0000\u01bb"+
		"\u01c3\u0001\u0000\u0000\u0000\u01bc\u01bd\u00050\u0000\u0000\u01bd\u01be"+
		"\u0006*\uffff\uffff\u0000\u01be\u01bf\u0003V+\u0000\u01bf\u01c0\u0003"+
		"T*\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c2\u01b7\u0001\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3U\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0003Z-\u0000\u01c5\u01c6\u0003X,\u0000\u01c6W\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0005-\u0000\u0000\u01c8\u01c9\u0006,\uffff\uffff"+
		"\u0000\u01c9\u01ca\u0003Z-\u0000\u01ca\u01cb\u0003X,\u0000\u01cb\u01dd"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005.\u0000\u0000\u01cd\u01ce\u0006"+
		",\uffff\uffff\u0000\u01ce\u01cf\u0003Z-\u0000\u01cf\u01d0\u0003X,\u0000"+
		"\u01d0\u01dd\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005+\u0000\u0000\u01d2"+
		"\u01d3\u0006,\uffff\uffff\u0000\u01d3\u01d4\u0003Z-\u0000\u01d4\u01d5"+
		"\u0003X,\u0000\u01d5\u01dd\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005,"+
		"\u0000\u0000\u01d7\u01d8\u0006,\uffff\uffff\u0000\u01d8\u01d9\u0003Z-"+
		"\u0000\u01d9\u01da\u0003X,\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dc\u01c7\u0001\u0000\u0000\u0000\u01dc"+
		"\u01cc\u0001\u0000\u0000\u0000\u01dc\u01d1\u0001\u0000\u0000\u0000\u01dc"+
		"\u01d6\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd"+
		"Y\u0001\u0000\u0000\u0000\u01de\u01df\u0003^/\u0000\u01df\u01e0\u0003"+
		"\\.\u0000\u01e0[\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005$\u0000\u0000"+
		"\u01e2\u01e3\u0003^/\u0000\u01e3\u01e4\u0006.\uffff\uffff\u0000\u01e4"+
		"\u01e5\u0003\\.\u0000\u01e5\u01ed\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005%\u0000\u0000\u01e7\u01e8\u0003^/\u0000\u01e8\u01e9\u0006.\uffff"+
		"\uffff\u0000\u01e9\u01ea\u0003\\.\u0000\u01ea\u01ed\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e1\u0001\u0000\u0000"+
		"\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed]\u0001\u0000\u0000\u0000\u01ee\u01ef\u0003b1\u0000\u01ef"+
		"\u01f0\u0003`0\u0000\u01f0_\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005"+
		"&\u0000\u0000\u01f2\u01f3\u0003b1\u0000\u01f3\u01f4\u00060\uffff\uffff"+
		"\u0000\u01f4\u01f5\u0003`0\u0000\u01f5\u0202\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0005\'\u0000\u0000\u01f7\u01f8\u0003b1\u0000\u01f8\u01f9\u0006"+
		"0\uffff\uffff\u0000\u01f9\u01fa\u0003`0\u0000\u01fa\u0202\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005(\u0000\u0000\u01fc\u01fd\u0003b1\u0000"+
		"\u01fd\u01fe\u00060\uffff\uffff\u0000\u01fe\u01ff\u0003`0\u0000\u01ff"+
		"\u0202\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201"+
		"\u01f1\u0001\u0000\u0000\u0000\u0201\u01f6\u0001\u0000\u0000\u0000\u0201"+
		"\u01fb\u0001\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202"+
		"a\u0001\u0000\u0000\u0000\u0203\u0204\u00053\u0000\u0000\u0204\u0205\u0006"+
		"1\uffff\uffff\u0000\u0205\u020b\u0003d2\u0000\u0206\u0207\u0005%\u0000"+
		"\u0000\u0207\u0208\u00061\uffff\uffff\u0000\u0208\u020b\u0003d2\u0000"+
		"\u0209\u020b\u0003d2\u0000\u020a\u0203\u0001\u0000\u0000\u0000\u020a\u0206"+
		"\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020bc\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0003f3\u0000\u020d\u020e\u0005)\u0000"+
		"\u0000\u020e\u020f\u00062\uffff\uffff\u0000\u020f\u0216\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0003f3\u0000\u0211\u0212\u0005*\u0000\u0000\u0212"+
		"\u0213\u00062\uffff\uffff\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214"+
		"\u0216\u0003f3\u0000\u0215\u020c\u0001\u0000\u0000\u0000\u0215\u0210\u0001"+
		"\u0000\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216e\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0005 \u0000\u0000\u0218\u0219\u0003D\"\u0000"+
		"\u0219\u021a\u0005!\u0000\u0000\u021a\u022a\u0001\u0000\u0000\u0000\u021b"+
		"\u022a\u0003*\u0015\u0000\u021c\u022a\u0003\"\u0011\u0000\u021d\u0220"+
		"\u0005A\u0000\u0000\u021e\u0220\u0003,\u0016\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000"+
		"\u0000\u0000\u0221\u0223\u0007\u0005\u0000\u0000\u0222\u0221\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u022a\u0001\u0000"+
		"\u0000\u0000\u0224\u022a\u00030\u0018\u0000\u0225\u022a\u00036\u001b\u0000"+
		"\u0226\u022a\u00034\u001a\u0000\u0227\u022a\u0003\u001a\r\u0000\u0228"+
		"\u022a\u00032\u0019\u0000\u0229\u0217\u0001\u0000\u0000\u0000\u0229\u021b"+
		"\u0001\u0000\u0000\u0000\u0229\u021c\u0001\u0000\u0000\u0000\u0229\u021f"+
		"\u0001\u0000\u0000\u0000\u0229\u0224\u0001\u0000\u0000\u0000\u0229\u0225"+
		"\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0227"+
		"\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022ag\u0001"+
		"\u0000\u0000\u0000\u022b\u022e\u0003l6\u0000\u022c\u022e\u0003D\"\u0000"+
		"\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0005>\u0000\u0000\u0230"+
		"\u0235\u0001\u0000\u0000\u0000\u0231\u0235\u0003n7\u0000\u0232\u0235\u0003"+
		"v;\u0000\u0233\u0235\u0003x<\u0000\u0234\u022d\u0001\u0000\u0000\u0000"+
		"\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000"+
		"\u0234\u0233\u0001\u0000\u0000\u0000\u0235i\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0005\t\u0000\u0000\u0237\u0239\u00065\uffff\uffff\u0000\u0238"+
		"\u023a\u0003D\"\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005>\u0000\u0000\u023ck\u0001\u0000\u0000\u0000\u023d\u0246\u0005A"+
		"\u0000\u0000\u023e\u023f\u0005\"\u0000\u0000\u023f\u0240\u0003D\"\u0000"+
		"\u0240\u0241\u0005#\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242"+
		"\u023e\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0001\u0000\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u00066\uffff\uffff\u0000\u0249\u024a\u0003\u001e\u000f\u0000\u024a"+
		"\u024b\u0003D\"\u0000\u024bm\u0001\u0000\u0000\u0000\u024c\u0250\u0003"+
		"p8\u0000\u024d\u024f\u0003r9\u0000\u024e\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0255\u0001\u0000\u0000\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0256\u0003t:\u0000\u0254\u0256"+
		"\u0005\u0006\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254"+
		"\u0001\u0000\u0000\u0000\u0256o\u0001\u0000\u0000\u0000\u0257\u0258\u0005"+
		"\n\u0000\u0000\u0258\u0259\u00068\uffff\uffff\u0000\u0259\u025a\u0003"+
		".\u0017\u0000\u025a\u025b\u0003\u0002\u0001\u0000\u025bq\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0005\u000b\u0000\u0000\u025d\u025e\u00069\uffff\uffff"+
		"\u0000\u025e\u025f\u0003.\u0017\u0000\u025f\u0260\u0003\u0002\u0001\u0000"+
		"\u0260s\u0001\u0000\u0000\u0000\u0261\u0262\u0005\f\u0000\u0000\u0262"+
		"\u0263\u0006:\uffff\uffff\u0000\u0263\u0264\u0003\u0002\u0001\u0000\u0264"+
		"\u0265\u0005\u0006\u0000\u0000\u0265u\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005\u0017\u0000\u0000\u0267\u0268\u0005\u0018\u0000\u0000\u0268\u0269"+
		"\u0006;\uffff\uffff\u0000\u0269\u026a\u0003|>\u0000\u026a\u026b\u0005"+
		"\u0006\u0000\u0000\u026bw\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u0019"+
		"\u0000\u0000\u026d\u026e\u0006<\uffff\uffff\u0000\u026e\u026f\u0005A\u0000"+
		"\u0000\u026f\u0272\u0005\u001a\u0000\u0000\u0270\u0273\u0005A\u0000\u0000"+
		"\u0271\u0273\u0003z=\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271"+
		"\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0003|>\u0000\u0275\u0276\u0005\u0006\u0000\u0000\u0276y\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0005 \u0000\u0000\u0278\u0279\u0003$\u0012\u0000"+
		"\u0279\u027a\u0005?\u0000\u0000\u027a\u027b\u0005?\u0000\u0000\u027b\u027c"+
		"\u0005\u001c\u0000\u0000\u027c\u027d\u0005!\u0000\u0000\u027d{\u0001\u0000"+
		"\u0000\u0000\u027e\u0284\u0003h4\u0000\u027f\u0284\u0003\u008eG\u0000"+
		"\u0280\u0284\u0003~?\u0000\u0281\u0284\u0003\u008aE\u0000\u0282\u0284"+
		"\u0003\u0086C\u0000\u0283\u027e\u0001\u0000\u0000\u0000\u0283\u027f\u0001"+
		"\u0000\u0000\u0000\u0283\u0280\u0001\u0000\u0000\u0000\u0283\u0281\u0001"+
		"\u0000\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284\u0287\u0001"+
		"\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001"+
		"\u0000\u0000\u0000\u0288\u028a\u0003j5\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a}\u0001\u0000\u0000\u0000"+
		"\u028b\u028f\u0003\u0080@\u0000\u028c\u028e\u0003\u0082A\u0000\u028d\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0294"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0295"+
		"\u0003\u0084B\u0000\u0293\u0295\u0005\u0006\u0000\u0000\u0294\u0292\u0001"+
		"\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u007f\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0005\n\u0000\u0000\u0297\u0298\u0006@"+
		"\uffff\uffff\u0000\u0298\u0299\u0003.\u0017\u0000\u0299\u029a\u0003|>"+
		"\u0000\u029a\u0081\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u000b\u0000"+
		"\u0000\u029c\u029d\u0006A\uffff\uffff\u0000\u029d\u029e\u0003.\u0017\u0000"+
		"\u029e\u029f\u0003|>\u0000\u029f\u0083\u0001\u0000\u0000\u0000\u02a0\u02a1"+
		"\u0005\f\u0000\u0000\u02a1\u02a2\u0006B\uffff\uffff\u0000\u02a2\u02a3"+
		"\u0003|>\u0000\u02a3\u02a4\u0005\u0006\u0000\u0000\u02a4\u0085\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0005\u0015\u0000\u0000\u02a6\u02a7\u0005>\u0000"+
		"\u0000\u02a7\u02aa\u0006C\uffff\uffff\u0000\u02a8\u02aa\u0003\u0088D\u0000"+
		"\u02a9\u02a5\u0001\u0000\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000"+
		"\u02aa\u0087\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005\u0015\u0000\u0000"+
		"\u02ac\u02ad\u0005\n\u0000\u0000\u02ad\u02ae\u0006D\uffff\uffff\u0000"+
		"\u02ae\u02af\u0003.\u0017\u0000\u02af\u02b0\u0005>\u0000\u0000\u02b0\u0089"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005\u0016\u0000\u0000\u02b2\u02b3"+
		"\u0005>\u0000\u0000\u02b3\u02b6\u0006E\uffff\uffff\u0000\u02b4\u02b6\u0003"+
		"\u008cF\u0000\u02b5\u02b1\u0001\u0000\u0000\u0000\u02b5\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u008b\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u0016"+
		"\u0000\u0000\u02b8\u02b9\u0005\n\u0000\u0000\u02b9\u02ba\u0006F\uffff"+
		"\uffff\u0000\u02ba\u02bb\u0003.\u0017\u0000\u02bb\u02bc\u0005>\u0000\u0000"+
		"\u02bc\u008d\u0001\u0000\u0000\u0000\u02bd\u02be\u0007\u0006\u0000\u0000"+
		"\u02be\u008f\u0001\u0000\u0000\u00003\u0093\u0095\u009c\u00a1\u00a3\u00a7"+
		"\u00bc\u00c6\u00ca\u00d2\u00d9\u00ea\u0109\u010d\u0117\u011a\u011f\u012c"+
		"\u0130\u013b\u0148\u0161\u018e\u0196\u01a0\u01a8\u01b2\u01c2\u01dc\u01ec"+
		"\u0201\u020a\u0215\u021f\u0222\u0229\u022d\u0234\u0239\u0244\u0246\u0250"+
		"\u0255\u0272\u0283\u0285\u0289\u028f\u0294\u02a9\u02b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}