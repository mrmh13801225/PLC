// Generated from e:/PLC/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, FUNCTION=3, END_OF_SCOPE=4, LAMDA=5, MAIN=6, RETURN=7, 
		IF=8, ELSEIF=9, ELSE=10, CHOP=11, CHOMP=12, PUSH=13, PUTS=14, METHOD=15, 
		LENGTH=16, PATTERN=17, MATCH=18, NEXT=19, BREAK=20, LOOP=21, DO=22, FOR=23, 
		IN=24, FLOAT_VAL=25, INT_VAL=26, TRUE=27, FALSE=28, STRING_VAL=29, LPAR=30, 
		RPAR=31, LBRACKET=32, RBRACKET=33, PLUS=34, MINUS=35, MULT=36, DIV=37, 
		MOD=38, GEQ=39, LEQ=40, GTR=41, LES=42, EQL=43, NEQ=44, AND=45, OR=46, 
		NOT=47, ASSIGN=48, PLUS_ASSIGN=49, MINUS_ASSIGN=50, MULT_ASSIGN=51, DIV_ASSIGN=52, 
		MOD_ASSIGN=53, UNARY_INCREMENT=54, UNARY_DECREMENT=55, APPEND=56, LBRACE=57, 
		RBRACE=58, COMMA=59, SEMICOLON=60, CASE=61, DOT=62, IDENTIFIER=63, SINGLE_LINE_COMMENT=64, 
		MULTY_LINE_COMMENT=65, WS=66;
	public static final int
		RULE_program = 0, RULE_comment = 1, RULE_pattern = 2, RULE_patternDeclaration = 3, 
		RULE_declerationArgs = 4, RULE_normalArgs = 5, RULE_declerationArg = 6, 
		RULE_defaultArg = 7, RULE_defaultArgPlural = 8, RULE_intVal = 9, RULE_floatVal = 10, 
		RULE_booleanVal = 11, RULE_compare = 12, RULE_directValue = 13, RULE_functionCall = 14, 
		RULE_inputArgs = 15, RULE_expression = 16, RULE_operator = 17, RULE_logicalOperator = 18, 
		RULE_arithmaticOperator = 19, RULE_relationalOperator = 20, RULE_returnStatement = 21, 
		RULE_lambdaFuncDecleration = 22, RULE_function = 23, RULE_body = 24, RULE_statement = 25, 
		RULE_ifStatement = 26, RULE_condition = 27, RULE_ifBlock = 28, RULE_elseifBlock = 29, 
		RULE_elseBlock = 30, RULE_loopDo = 31, RULE_forLoop = 32, RULE_range = 33, 
		RULE_builtIn = 34, RULE_chop = 35, RULE_chomp = 36, RULE_len = 37, RULE_list = 38, 
		RULE_puts = 39, RULE_push = 40, RULE_append = 41, RULE_declaration = 42, 
		RULE_assignment = 43, RULE_main = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comment", "pattern", "patternDeclaration", "declerationArgs", 
			"normalArgs", "declerationArg", "defaultArg", "defaultArgPlural", "intVal", 
			"floatVal", "booleanVal", "compare", "directValue", "functionCall", "inputArgs", 
			"expression", "operator", "logicalOperator", "arithmaticOperator", "relationalOperator", 
			"returnStatement", "lambdaFuncDecleration", "function", "body", "statement", 
			"ifStatement", "condition", "ifBlock", "elseifBlock", "elseBlock", "loopDo", 
			"forLoop", "range", "builtIn", "chop", "chomp", "len", "list", "puts", 
			"push", "append", "declaration", "assignment", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'\\r'", "'def'", "'end'", "'->'", "'main'", "'return'", 
			"'if'", "'elseif'", "'else'", "'chop'", "'chomp'", "'push'", "'puts'", 
			"'method'", "'len'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", 
			"'do'", "'for'", "'in'", null, null, "'true'", "'false'", null, "'('", 
			"')'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>='", "'<='", 
			"'>'", "'<'", "'=='", "'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'<<'", "'{'", "'}'", "','", 
			"';'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FUNCTION", "END_OF_SCOPE", "LAMDA", "MAIN", "RETURN", 
			"IF", "ELSEIF", "ELSE", "CHOP", "CHOMP", "PUSH", "PUTS", "METHOD", "LENGTH", 
			"PATTERN", "MATCH", "NEXT", "BREAK", "LOOP", "DO", "FOR", "IN", "FLOAT_VAL", 
			"INT_VAL", "TRUE", "FALSE", "STRING_VAL", "LPAR", "RPAR", "LBRACKET", 
			"RBRACKET", "PLUS", "MINUS", "MULT", "DIV", "MOD", "GEQ", "LEQ", "GTR", 
			"LES", "EQL", "NEQ", "AND", "OR", "NOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "UNARY_INCREMENT", "UNARY_DECREMENT", 
			"APPEND", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "CASE", "DOT", "IDENTIFIER", 
			"SINGLE_LINE_COMMENT", "MULTY_LINE_COMMENT", "WS"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(93);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUNCTION:
						{
						setState(90);
						function();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTY_LINE_COMMENT:
						{
						setState(91);
						comment();
						}
						break;
					case PATTERN:
						{
						setState(92);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(98);
			main();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTY_LINE_COMMENT) {
				{
				{
				setState(99);
				comment();
				}
				}
				setState(104);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(FunctionCraftParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTY_LINE_COMMENT() { return getToken(FunctionCraftParser.MULTY_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternDeclarationContext patternDeclaration() {
			return getRuleContext(PatternDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> CASE() { return getTokens(FunctionCraftParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(FunctionCraftParser.CASE, i);
		}
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
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			patternDeclaration();
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				match(CASE);
				setState(110);
				condition();
				setState(111);
				match(ASSIGN);
				setState(112);
				expression();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
			setState(118);
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
	public static class PatternDeclarationContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public PatternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternDeclaration; }
	}

	public final PatternDeclarationContext patternDeclaration() throws RecognitionException {
		PatternDeclarationContext _localctx = new PatternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_patternDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PATTERN);
			setState(121);
			match(IDENTIFIER);
			setState(122);
			match(LPAR);
			{
			setState(123);
			declerationArgs();
			}
			setState(124);
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
	public static class DeclerationArgsContext extends ParserRuleContext {
		public NormalArgsContext normalArgs() {
			return getRuleContext(NormalArgsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public DefaultArgPluralContext defaultArgPlural() {
			return getRuleContext(DefaultArgPluralContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public DeclerationArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declerationArgs; }
	}

	public final DeclerationArgsContext declerationArgs() throws RecognitionException {
		DeclerationArgsContext _localctx = new DeclerationArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declerationArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			normalArgs();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(127);
				match(LBRACKET);
				setState(128);
				defaultArgPlural();
				setState(129);
				match(RBRACKET);
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
	}

	public final NormalArgsContext normalArgs() throws RecognitionException {
		NormalArgsContext _localctx = new NormalArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normalArgs);
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						declerationArg();
						setState(134);
						match(COMMA);
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(141);
				declerationArg();
				}
				}
				break;
			case RPAR:
			case LBRACKET:
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
	public static class DeclerationArgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DeclerationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declerationArg; }
	}

	public final DeclerationArgContext declerationArg() throws RecognitionException {
		DeclerationArgContext _localctx = new DeclerationArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declerationArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public DefaultArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArg; }
	}

	public final DefaultArgContext defaultArg() throws RecognitionException {
		DefaultArgContext _localctx = new DefaultArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defaultArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			declerationArg();
			setState(148);
			match(ASSIGN);
			setState(149);
			directValue();
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
	public static class DefaultArgPluralContext extends ParserRuleContext {
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
		public DefaultArgPluralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArgPlural; }
	}

	public final DefaultArgPluralContext defaultArgPlural() throws RecognitionException {
		DefaultArgPluralContext _localctx = new DefaultArgPluralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultArgPlural);
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						defaultArg();
						setState(152);
						match(COMMA);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(159);
				defaultArg();
				}
				}
				break;
			case RBRACKET:
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
	public static class IntValContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public IntValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVal; }
	}

	public final IntValContext intVal() throws RecognitionException {
		IntValContext _localctx = new IntValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(163);
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

			setState(166);
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
	}

	public final FloatValContext floatVal() throws RecognitionException {
		FloatValContext _localctx = new FloatValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(168);
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

			setState(171);
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
	}

	public final BooleanValContext booleanVal() throws RecognitionException {
		BooleanValContext _localctx = new BooleanValContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
	public static class CompareContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expression();
			setState(176);
			relationalOperator();
			setState(177);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DirectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directValue; }
	}

	public final DirectValueContext directValue() throws RecognitionException {
		DirectValueContext _localctx = new DirectValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_directValue);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				intVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(STRING_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				floatVal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				booleanVal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				list();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public InputArgsContext inputArgs() {
			return getRuleContext(InputArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IDENTIFIER);
			setState(187);
			match(LPAR);
			setState(188);
			inputArgs();
			setState(189);
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
	}

	public final InputArgsContext inputArgs() throws RecognitionException {
		InputArgsContext _localctx = new InputArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inputArgs);
		try {
			int _alt;
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_VAL:
			case INT_VAL:
			case TRUE:
			case FALSE:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						expression();
						setState(192);
						match(COMMA);
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(199);
				expression();
				}
				}
				break;
			case RPAR:
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				directValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(LPAR);
				setState(207);
				expression();
				setState(208);
				match(RPAR);
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
	public static class OperatorContext extends ParserRuleContext {
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ArithmaticOperatorContext arithmaticOperator() {
			return getRuleContext(ArithmaticOperatorContext.class,0);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operator);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				logicalOperator();
				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				arithmaticOperator();
				}
				break;
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				relationalOperator();
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
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
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
	public static class ArithmaticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public ArithmaticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmaticOperator; }
	}

	public final ArithmaticOperatorContext arithmaticOperator() throws RecognitionException {
		ArithmaticOperatorContext _localctx = new ArithmaticOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arithmaticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575944704L) != 0)) ) {
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
	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LAMDA() { return getToken(FunctionCraftParser.LAMDA, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(RETURN);
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_VAL:
			case INT_VAL:
			case TRUE:
			case FALSE:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case IDENTIFIER:
				{
				setState(224);
				expression();
				}
				break;
			case LAMDA:
				{
				setState(225);
				match(LAMDA);
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(228);
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
	public static class LambdaFuncDeclerationContext extends ParserRuleContext {
		public TerminalNode LAMDA() { return getToken(FunctionCraftParser.LAMDA, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public LambdaFuncDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFuncDecleration; }
	}

	public final LambdaFuncDeclerationContext lambdaFuncDecleration() throws RecognitionException {
		LambdaFuncDeclerationContext _localctx = new LambdaFuncDeclerationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lambdaFuncDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LAMDA);
			setState(231);
			match(LPAR);
			{
			setState(232);
			declerationArgs();
			}
			setState(233);
			match(RPAR);
			setState(234);
			match(LBRACE);
			setState(235);
			body();
			setState(236);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FunctionCraftParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public DeclerationArgsContext declerationArgs() {
			return getRuleContext(DeclerationArgsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FUNCTION);
			setState(239);
			match(IDENTIFIER);
			setState(240);
			match(LPAR);
			{
			setState(241);
			declerationArgs();
			}
			setState(242);
			match(RPAR);
			setState(243);
			body();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(244);
				returnStatement();
				}
			}

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
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 2017612634873203657L) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LAMDA:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
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
				case IDENTIFIER:
					{
					setState(249);
					statement();
					}
					break;
				case SINGLE_LINE_COMMENT:
				case MULTY_LINE_COMMENT:
					{
					setState(250);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
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
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopDoContext loopDo() {
			return getRuleContext(LoopDoContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BuiltInContext builtIn() {
			return getRuleContext(BuiltInContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LambdaFuncDeclerationContext lambdaFuncDecleration() {
			return getRuleContext(LambdaFuncDeclerationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				loopDo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				forLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				builtIn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				lambdaFuncDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				expression();
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			ifBlock();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(266);
				elseifBlock();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(272);
				elseBlock();
				}
				break;
			case END_OF_SCOPE:
				{
				setState(273);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(FunctionCraftParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(FunctionCraftParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(FunctionCraftParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(FunctionCraftParser.RPAR, i);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition);
		try {
			int _alt;
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						match(LPAR);
						setState(278);
						expression();
						setState(279);
						match(RPAR);
						setState(280);
						logicalOperator();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(287);
				match(LPAR);
				setState(288);
				expression();
				setState(289);
				match(RPAR);
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
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(IF);
			setState(294);
			condition();
			setState(295);
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
	}

	public final ElseifBlockContext elseifBlock() throws RecognitionException {
		ElseifBlockContext _localctx = new ElseifBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ELSEIF);
			setState(298);
			condition();
			setState(299);
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
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ELSE);
			setState(302);
			body();
			setState(303);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public LoopDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDo; }
	}

	public final LoopDoContext loopDo() throws RecognitionException {
		LoopDoContext _localctx = new LoopDoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loopDo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LOOP);
			setState(306);
			match(DO);
			setState(307);
			body();
			setState(308);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FOR);
			setState(311);
			match(IDENTIFIER);
			setState(312);
			match(IN);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(313);
				match(IDENTIFIER);
				}
				break;
			case LPAR:
				{
				setState(314);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			body();
			setState(318);
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
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LPAR);
			setState(321);
			intVal();
			setState(322);
			match(DOT);
			setState(323);
			match(DOT);
			setState(324);
			match(INT_VAL);
			setState(325);
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
	}

	public final BuiltInContext builtIn() throws RecognitionException {
		BuiltInContext _localctx = new BuiltInContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_builtIn);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				chop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				chomp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				len();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				puts();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				push();
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
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_chop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(334);
				match(IDENTIFIER);
				setState(335);
				match(ASSIGN);
				}
			}

			setState(338);
			match(CHOP);
			setState(339);
			match(LPAR);
			setState(340);
			_la = _input.LA(1);
			if ( !(_la==STRING_VAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(341);
			match(RPAR);
			setState(342);
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
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(344);
				match(IDENTIFIER);
				setState(345);
				match(ASSIGN);
				}
			}

			setState(348);
			match(CHOMP);
			setState(349);
			match(LPAR);
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==STRING_VAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			match(RPAR);
			setState(352);
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
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(FunctionCraftParser.LENGTH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(354);
				match(IDENTIFIER);
				setState(355);
				match(ASSIGN);
				}
			}

			setState(358);
			match(LENGTH);
			setState(359);
			match(LPAR);
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(360);
				match(IDENTIFIER);
				}
				break;
			case STRING_VAL:
				{
				setState(361);
				match(STRING_VAL);
				}
				break;
			case LBRACKET:
				{
				setState(362);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(365);
			match(RPAR);
			setState(366);
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LBRACKET);
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACKET:
				{
				}
				break;
			case FLOAT_VAL:
			case INT_VAL:
			case TRUE:
			case FALSE:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case IDENTIFIER:
				{
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						expression();
						setState(371);
						match(COMMA);
						}
						} 
					}
					setState(377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(378);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(381);
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
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(PUTS);
			setState(384);
			match(LPAR);
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(385);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(386);
				expression();
				}
				break;
			}
			setState(389);
			match(RPAR);
			setState(390);
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
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(PUSH);
			setState(393);
			match(LPAR);
			setState(394);
			match(IDENTIFIER);
			setState(395);
			match(COMMA);
			setState(396);
			expression();
			setState(397);
			match(RPAR);
			setState(398);
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
	public static class AppendContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public List<TerminalNode> APPEND() { return getTokens(FunctionCraftParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(FunctionCraftParser.APPEND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(400);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				{
				setState(401);
				list();
				}
				break;
			case STRING_VAL:
				{
				setState(402);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				match(APPEND);
				setState(406);
				expression();
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APPEND );
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(IDENTIFIER);
			setState(412);
			assignment();
			setState(413);
			expression();
			setState(414);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FunctionCraftParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FunctionCraftParser.FUNCTION, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END_OF_SCOPE() { return getToken(FunctionCraftParser.END_OF_SCOPE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(FUNCTION);
			setState(419);
			match(MAIN);
			setState(420);
			match(LPAR);
			setState(421);
			match(RPAR);
			System.out.println("MAIN BODY");
			setState(423);
			body();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(424);
				returnStatement();
				}
			}

			setState(427);
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

	public static final String _serializedATN =
		"\u0004\u0001B\u01ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000e\b\u0000\n\u0000\f\u0000h\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002s\b\u0002\u000b"+
		"\u0002\f\u0002t\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0089\b\u0005\n\u0005\f\u0005\u008c\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0090\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001\b\u0001\b\u0003\b\u00a2\b"+
		"\b\u0001\t\u0003\t\u00a5\b\t\u0001\t\u0001\t\u0001\n\u0003\n\u00aa\b\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00c3\b\u000f\n\u000f\f\u000f\u00c6\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d3"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d8\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e3\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00f6\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00fc\b\u0018"+
		"\n\u0018\f\u0018\u00ff\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0108\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u010c\b\u001a\n\u001a\f\u001a\u010f\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0113\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u011b\b\u001b"+
		"\n\u001b\f\u001b\u011e\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0124\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u013c\b "+
		"\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u014d\b\"\u0001#\u0001"+
		"#\u0003#\u0151\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u015b\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0003%\u0165\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u016c\b%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0176\b&\n&"+
		"\f&\u0179\t&\u0001&\u0003&\u017c\b&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0184\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0003)\u0194"+
		"\b)\u0001)\u0001)\u0004)\u0198\b)\u000b)\f)\u0199\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u01aa\b,\u0001,\u0001,\u0001,\u0000\u0000-\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\t\u0001\u0000@A\u0001\u0000\u0001"+
		"\u0002\u0001\u0000\"#\u0001\u0000\u001b\u001c\u0001\u0000-/\u0001\u0000"+
		"\"&\u0001\u0000\',\u0002\u0000\u001d\u001d??\u0001\u000005\u01b7\u0000"+
		"_\u0001\u0000\u0000\u0000\u0002i\u0001\u0000\u0000\u0000\u0004k\u0001"+
		"\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000"+
		"\u0000\n\u008f\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000"+
		"\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000"+
		"\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000\u0000"+
		"\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000\u0000\u0000"+
		"\u001a\u00b8\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000\u0000\u0000"+
		"\u001e\u00c9\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000\u0000\u0000\""+
		"\u00d7\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000\u0000\u0000&\u00db\u0001"+
		"\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000\u0000*\u00df\u0001\u0000\u0000"+
		"\u0000,\u00e6\u0001\u0000\u0000\u0000.\u00ee\u0001\u0000\u0000\u00000"+
		"\u00fd\u0001\u0000\u0000\u00002\u0107\u0001\u0000\u0000\u00004\u0109\u0001"+
		"\u0000\u0000\u00006\u0123\u0001\u0000\u0000\u00008\u0125\u0001\u0000\u0000"+
		"\u0000:\u0129\u0001\u0000\u0000\u0000<\u012d\u0001\u0000\u0000\u0000>"+
		"\u0131\u0001\u0000\u0000\u0000@\u0136\u0001\u0000\u0000\u0000B\u0140\u0001"+
		"\u0000\u0000\u0000D\u014c\u0001\u0000\u0000\u0000F\u0150\u0001\u0000\u0000"+
		"\u0000H\u015a\u0001\u0000\u0000\u0000J\u0164\u0001\u0000\u0000\u0000L"+
		"\u0170\u0001\u0000\u0000\u0000N\u017f\u0001\u0000\u0000\u0000P\u0188\u0001"+
		"\u0000\u0000\u0000R\u0193\u0001\u0000\u0000\u0000T\u019b\u0001\u0000\u0000"+
		"\u0000V\u01a0\u0001\u0000\u0000\u0000X\u01a2\u0001\u0000\u0000\u0000Z"+
		"^\u0003.\u0017\u0000[^\u0003\u0002\u0001\u0000\\^\u0003\u0004\u0002\u0000"+
		"]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0003"+
		"X,\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0001"+
		"\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000"+
		"\u0000j\u0003\u0001\u0000\u0000\u0000kr\u0003\u0006\u0003\u0000lm\u0007"+
		"\u0001\u0000\u0000mn\u0005=\u0000\u0000no\u00036\u001b\u0000op\u00050"+
		"\u0000\u0000pq\u0003 \u0010\u0000qs\u0001\u0000\u0000\u0000rl\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005<\u0000\u0000w\u0005"+
		"\u0001\u0000\u0000\u0000xy\u0005\u0011\u0000\u0000yz\u0005?\u0000\u0000"+
		"z{\u0005\u001e\u0000\u0000{|\u0003\b\u0004\u0000|}\u0005\u001f\u0000\u0000"+
		"}\u0007\u0001\u0000\u0000\u0000~\u0083\u0003\n\u0005\u0000\u007f\u0080"+
		"\u0005 \u0000\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082\u0005"+
		"!\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\t\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087\u0005;\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0003\f\u0006\u0000\u008e"+
		"\u0090\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u000b\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005?\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0003\f\u0006\u0000\u0094\u0095\u00050\u0000\u0000\u0095\u0096\u0003"+
		"\u001a\r\u0000\u0096\u000f\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u000e"+
		"\u0007\u0000\u0098\u0099\u0005;\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0003\u000e\u0007\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0002\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001a\u0000"+
		"\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00aa\u0007\u0002\u0000"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0019\u0000"+
		"\u0000\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0003\u0000"+
		"\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af\u00b0\u0003 \u0010\u0000"+
		"\u00b0\u00b1\u0003(\u0014\u0000\u00b1\u00b2\u0003 \u0010\u0000\u00b2\u0019"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b9\u0003\u0012\t\u0000\u00b4\u00b9\u0005"+
		"\u001d\u0000\u0000\u00b5\u00b9\u0003\u0014\n\u0000\u00b6\u00b9\u0003\u0016"+
		"\u000b\u0000\u00b7\u00b9\u0003L&\u0000\u00b8\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u001b\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005?\u0000\u0000\u00bb"+
		"\u00bc\u0005\u001e\u0000\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd"+
		"\u00be\u0005\u001f\u0000\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0003 \u0010\u0000\u00c0\u00c1\u0005;\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ca\u0003 \u0010\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u001f\u0001\u0000\u0000\u0000\u00cb\u00d3\u0005?\u0000"+
		"\u0000\u00cc\u00d3\u0003\u001a\r\u0000\u00cd\u00d3\u0003\u001c\u000e\u0000"+
		"\u00ce\u00cf\u0005\u001e\u0000\u0000\u00cf\u00d0\u0003 \u0010\u0000\u00d0"+
		"\u00d1\u0005\u001f\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3"+
		"!\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003$\u0012\u0000\u00d5\u00d8\u0003"+
		"&\u0013\u0000\u00d6\u00d8\u0003(\u0014\u0000\u00d7\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9\u00da\u0007\u0004\u0000\u0000"+
		"\u00da%\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0005\u0000\u0000\u00dc"+
		"\'\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u0006\u0000\u0000\u00de)"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0005\u0007\u0000\u0000\u00e0\u00e3"+
		"\u0003 \u0010\u0000\u00e1\u00e3\u0005\u0005\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"<\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0005\u0000"+
		"\u0000\u00e7\u00e8\u0005\u001e\u0000\u0000\u00e8\u00e9\u0003\b\u0004\u0000"+
		"\u00e9\u00ea\u0005\u001f\u0000\u0000\u00ea\u00eb\u00059\u0000\u0000\u00eb"+
		"\u00ec\u00030\u0018\u0000\u00ec\u00ed\u0005:\u0000\u0000\u00ed-\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0005\u0003\u0000\u0000\u00ef\u00f0\u0005"+
		"?\u0000\u0000\u00f0\u00f1\u0005\u001e\u0000\u0000\u00f1\u00f2\u0003\b"+
		"\u0004\u0000\u00f2\u00f3\u0005\u001f\u0000\u0000\u00f3\u00f5\u00030\u0018"+
		"\u0000\u00f4\u00f6\u0003*\u0015\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8/\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u00032\u0019\u0000\u00fa\u00fc\u0003\u0002\u0001\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe1\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0108\u00034\u001a\u0000\u0101\u0108\u0003>\u001f"+
		"\u0000\u0102\u0108\u0003@ \u0000\u0103\u0108\u0003D\"\u0000\u0104\u0108"+
		"\u0003T*\u0000\u0105\u0108\u0003,\u0016\u0000\u0106\u0108\u0003 \u0010"+
		"\u0000\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000"+
		"\u0000\u0107\u0102\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000"+
		"\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u01083\u0001\u0000\u0000\u0000"+
		"\u0109\u010d\u00038\u001c\u0000\u010a\u010c\u0003:\u001d\u0000\u010b\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0112"+
		"\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0113"+
		"\u0003<\u001e\u0000\u0111\u0113\u0005\u0004\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u01135\u0001\u0000"+
		"\u0000\u0000\u0114\u0124\u0003 \u0010\u0000\u0115\u0116\u0005\u001e\u0000"+
		"\u0000\u0116\u0117\u0003 \u0010\u0000\u0117\u0118\u0005\u001f\u0000\u0000"+
		"\u0118\u0119\u0003$\u0012\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a"+
		"\u0115\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u001e\u0000\u0000\u0120\u0121\u0003 \u0010\u0000\u0121\u0122"+
		"\u0005\u001f\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0114"+
		"\u0001\u0000\u0000\u0000\u0123\u011c\u0001\u0000\u0000\u0000\u01247\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005\b\u0000\u0000\u0126\u0127\u00036"+
		"\u001b\u0000\u0127\u0128\u00030\u0018\u0000\u01289\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005\t\u0000\u0000\u012a\u012b\u00036\u001b\u0000\u012b"+
		"\u012c\u00030\u0018\u0000\u012c;\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"\n\u0000\u0000\u012e\u012f\u00030\u0018\u0000\u012f\u0130\u0005\u0004"+
		"\u0000\u0000\u0130=\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0015\u0000"+
		"\u0000\u0132\u0133\u0005\u0016\u0000\u0000\u0133\u0134\u00030\u0018\u0000"+
		"\u0134\u0135\u0005\u0004\u0000\u0000\u0135?\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005\u0017\u0000\u0000\u0137\u0138\u0005?\u0000\u0000\u0138\u013b"+
		"\u0005\u0018\u0000\u0000\u0139\u013c\u0005?\u0000\u0000\u013a\u013c\u0003"+
		"B!\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u00030\u0018\u0000"+
		"\u013e\u013f\u0005\u0004\u0000\u0000\u013fA\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005\u001e\u0000\u0000\u0141\u0142\u0003\u0012\t\u0000\u0142\u0143"+
		"\u0005>\u0000\u0000\u0143\u0144\u0005>\u0000\u0000\u0144\u0145\u0005\u001a"+
		"\u0000\u0000\u0145\u0146\u0005\u001f\u0000\u0000\u0146C\u0001\u0000\u0000"+
		"\u0000\u0147\u014d\u0003F#\u0000\u0148\u014d\u0003H$\u0000\u0149\u014d"+
		"\u0003J%\u0000\u014a\u014d\u0003N\'\u0000\u014b\u014d\u0003P(\u0000\u014c"+
		"\u0147\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014c"+
		"\u0149\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014b\u0001\u0000\u0000\u0000\u014dE\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005?\u0000\u0000\u014f\u0151\u00050\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0005\u000b\u0000\u0000\u0153\u0154\u0005\u001e"+
		"\u0000\u0000\u0154\u0155\u0007\u0007\u0000\u0000\u0155\u0156\u0005\u001f"+
		"\u0000\u0000\u0156\u0157\u0005<\u0000\u0000\u0157G\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0005?\u0000\u0000\u0159\u015b\u00050\u0000\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0005\f\u0000\u0000\u015d\u015e\u0005"+
		"\u001e\u0000\u0000\u015e\u015f\u0007\u0007\u0000\u0000\u015f\u0160\u0005"+
		"\u001f\u0000\u0000\u0160\u0161\u0005<\u0000\u0000\u0161I\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005?\u0000\u0000\u0163\u0165\u00050\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0010\u0000\u0000\u0167"+
		"\u016b\u0005\u001e\u0000\u0000\u0168\u016c\u0005?\u0000\u0000\u0169\u016c"+
		"\u0005\u001d\u0000\u0000\u016a\u016c\u0003L&\u0000\u016b\u0168\u0001\u0000"+
		"\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u001f"+
		"\u0000\u0000\u016e\u016f\u0005<\u0000\u0000\u016fK\u0001\u0000\u0000\u0000"+
		"\u0170\u017b\u0005 \u0000\u0000\u0171\u017c\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0003 \u0010\u0000\u0173\u0174\u0005;\u0000\u0000\u0174\u0176\u0001"+
		"\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0003 \u0010\u0000\u017b\u0171\u0001\u0000"+
		"\u0000\u0000\u017b\u0177\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005!\u0000\u0000\u017eM\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u000e\u0000\u0000\u0180\u0183\u0005\u001e\u0000\u0000"+
		"\u0181\u0184\u0005?\u0000\u0000\u0182\u0184\u0003 \u0010\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u001f\u0000\u0000\u0186\u0187"+
		"\u0005<\u0000\u0000\u0187O\u0001\u0000\u0000\u0000\u0188\u0189\u0005\r"+
		"\u0000\u0000\u0189\u018a\u0005\u001e\u0000\u0000\u018a\u018b\u0005?\u0000"+
		"\u0000\u018b\u018c\u0005;\u0000\u0000\u018c\u018d\u0003 \u0010\u0000\u018d"+
		"\u018e\u0005\u001f\u0000\u0000\u018e\u018f\u0005<\u0000\u0000\u018fQ\u0001"+
		"\u0000\u0000\u0000\u0190\u0194\u0005?\u0000\u0000\u0191\u0194\u0003L&"+
		"\u0000\u0192\u0194\u0005\u001d\u0000\u0000\u0193\u0190\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0196\u00058\u0000\u0000"+
		"\u0196\u0198\u0003 \u0010\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019aS\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0005?\u0000\u0000\u019c\u019d\u0003V+\u0000\u019d\u019e\u0003 \u0010"+
		"\u0000\u019e\u019f\u0005<\u0000\u0000\u019fU\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0007\b\u0000\u0000\u01a1W\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0003\u0000\u0000\u01a3\u01a4\u0005\u0006\u0000\u0000\u01a4\u01a5"+
		"\u0005\u001e\u0000\u0000\u01a5\u01a6\u0005\u001f\u0000\u0000\u01a6\u01a7"+
		"\u0006,\uffff\uffff\u0000\u01a7\u01a9\u00030\u0018\u0000\u01a8\u01aa\u0003"+
		"*\u0015\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0004"+
		"\u0000\u0000\u01acY\u0001\u0000\u0000\u0000%]_ft\u0083\u008a\u008f\u009c"+
		"\u00a1\u00a4\u00a9\u00b8\u00c4\u00c9\u00d2\u00d7\u00e2\u00f5\u00fb\u00fd"+
		"\u0107\u010d\u0112\u011c\u0123\u013b\u014c\u0150\u015a\u0164\u016b\u0177"+
		"\u017b\u0183\u0193\u0199\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}