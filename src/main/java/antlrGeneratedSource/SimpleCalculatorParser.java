package antlrGeneratedSource;// Generated from C:/Users/JazzM/IdeaProjects/Parser_generator_HW/src/main/resources\SimpleCalculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, WS=9;
	public static final int
		RULE_calculation = 0, RULE_assign = 1, RULE_statement = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculation", "assign", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'+'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "SimpleCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculationContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitCalculation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculation);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(6);
				assign();
				setState(7);
				match(T__0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(9);
				statement(0);
				setState(10);
				match(T__0);
				}
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleCalculatorParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(ID);
			setState(15);
			match(T__1);
			setState(16);
			statement(0);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(SimpleCalculatorParser.ID, 0); }
		public TerminalNode INT() { return getToken(SimpleCalculatorParser.INT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleCalculatorVisitor ) return ((SimpleCalculatorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(19);
				match(T__4);
				setState(20);
				statement(0);
				setState(21);
				match(T__5);
				}
				break;
			case ID:
				{
				setState(23);
				match(ID);
				}
				break;
			case INT:
				{
				setState(24);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(27);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(28);
						match(T__2);
						setState(29);
						statement(6);
						}
						break;
					case 2:
						{
						_localctx = new StatementContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(31);
						match(T__3);
						setState(32);
						statement(5);
						}
						break;
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return statement_sempred((StatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b"+
		"\u0002\n\u0002\f\u0002%\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000"+
		"\u0002\u0004\u0000\u0000(\u0000\f\u0001\u0000\u0000\u0000\u0002\u000e"+
		"\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0003\u0002\u0001\u0000\u0007\b\u0005\u0001\u0000\u0000\b\r\u0001\u0000"+
		"\u0000\u0000\t\n\u0003\u0004\u0002\u0000\n\u000b\u0005\u0001\u0000\u0000"+
		"\u000b\r\u0001\u0000\u0000\u0000\f\u0006\u0001\u0000\u0000\u0000\f\t\u0001"+
		"\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0007"+
		"\u0000\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0003\u0004"+
		"\u0002\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013\u0006\u0002"+
		"\uffff\uffff\u0000\u0013\u0014\u0005\u0005\u0000\u0000\u0014\u0015\u0003"+
		"\u0004\u0002\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u001a\u0001"+
		"\u0000\u0000\u0000\u0017\u001a\u0005\u0007\u0000\u0000\u0018\u001a\u0005"+
		"\b\u0000\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a#\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\n\u0005\u0000\u0000\u001c\u001d\u0005\u0003\u0000\u0000"+
		"\u001d\"\u0003\u0004\u0002\u0006\u001e\u001f\n\u0004\u0000\u0000\u001f"+
		" \u0005\u0004\u0000\u0000 \"\u0003\u0004\u0002\u0005!\u001b\u0001\u0000"+
		"\u0000\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0005\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000\u0004\f\u0019!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}