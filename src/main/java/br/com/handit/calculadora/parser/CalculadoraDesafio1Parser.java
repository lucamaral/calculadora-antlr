// Generated from CalculadoraDesafio1.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraDesafio1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, FLOAT=3, NEWLINE=4, WS=5, POT=6, MUL=7, DIV=8, ADD=9, 
		SUB=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "FLOAT", "NEWLINE", "WS", "'^'", "'*'", "'/'", 
		"'+'", "'-'"
	};
	public static final int
		RULE_calc = 0, RULE_stmt = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"calc", "stmt", "expr"
	};

	@Override
	public String getGrammarFileName() { return "CalculadoraDesafio1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculadoraDesafio1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalcContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); stmt();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNewLineContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculadoraDesafio1Parser.NEWLINE, 0); }
		public ExpressionNewLineContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterExpressionNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitExpressionNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitExpressionNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewLineContext extends StmtContext {
		public TerminalNode NEWLINE() { return getToken(CalculadoraDesafio1Parser.NEWLINE, 0); }
		public NewLineContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(16);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11); expr(0);
				}
				break;

			case 2:
				_localctx = new ExpressionNewLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12); expr(0);
				setState(13); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new NewLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15); match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitPot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(CalculadoraDesafio1Parser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio1Listener ) ((CalculadoraDesafio1Listener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio1Visitor ) return ((CalculadoraDesafio1Visitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19); match(FLOAT);
				}
				break;
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20); match(1);
				setState(21); expr(0);
				setState(22); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						((MulDivContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(28); expr(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						((AddSubContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(31); expr(5);
						}
						break;

					case 3:
						{
						_localctx = new PotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33); match(POT);
						setState(34); expr(4);
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);

		case 2: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\5\3\23\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4&\n\4\f\4\16\4)\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\t\n\3\2\13\f.\2\t\3"+
		"\2\2\2\4\22\3\2\2\2\6\32\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2"+
		"\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\23\5\6\4\2\16\17\5\6\4\2\17\20"+
		"\7\6\2\2\20\23\3\2\2\2\21\23\7\6\2\2\22\r\3\2\2\2\22\16\3\2\2\2\22\21"+
		"\3\2\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25\33\7\5\2\2\26\27\7\3\2\2\27\30"+
		"\5\6\4\2\30\31\7\4\2\2\31\33\3\2\2\2\32\24\3\2\2\2\32\26\3\2\2\2\33\'"+
		"\3\2\2\2\34\35\f\7\2\2\35\36\t\2\2\2\36&\5\6\4\b\37 \f\6\2\2 !\t\3\2\2"+
		"!&\5\6\4\7\"#\f\5\2\2#$\7\b\2\2$&\5\6\4\6%\34\3\2\2\2%\37\3\2\2\2%\"\3"+
		"\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2)\'\3\2\2\2\7\13\22\32"+
		"%\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}