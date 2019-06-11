// Generated from CalculadoraDesafio2.g4 by ANTLR 4.2
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
public class CalculadoraDesafio2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, VAR=4, FLOAT=5, NEWLINE=6, WS=7, POT=8, MUL=9, 
		DIV=10, ADD=11, SUB=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'='", "VAR", "FLOAT", "NEWLINE", "WS", "'^'", 
		"'*'", "'/'", "'+'", "'-'"
	};
	public static final int
		RULE_calc = 0, RULE_stmt = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"calc", "stmt", "expr"
	};

	@Override
	public String getGrammarFileName() { return "CalculadoraDesafio2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculadoraDesafio2Parser(TokenStream input) {
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitCalc(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << VAR) | (1L << FLOAT) | (1L << NEWLINE))) != 0) );
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNewLineContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculadoraDesafio2Parser.NEWLINE, 0); }
		public ExpressionNewLineContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterExpressionNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitExpressionNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitExpressionNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewLineContext extends StmtContext {
		public TerminalNode NEWLINE() { return getToken(CalculadoraDesafio2Parser.NEWLINE, 0); }
		public NewLineContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignNewLineContext extends StmtContext {
		public TerminalNode VAR() { return getToken(CalculadoraDesafio2Parser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculadoraDesafio2Parser.NEWLINE, 0); }
		public AssignNewLineContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterAssignNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitAssignNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitAssignNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StmtContext {
		public TerminalNode VAR() { return getToken(CalculadoraDesafio2Parser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11); expr(0);
				}
				break;

			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12); match(VAR);
				setState(13); match(3);
				setState(14); expr(0);
				}
				break;

			case 3:
				_localctx = new ExpressionNewLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15); expr(0);
				setState(16); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new AssignNewLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(18); match(VAR);
				setState(19); match(3);
				setState(20); expr(0);
				setState(21); match(NEWLINE);
				}
				break;

			case 5:
				_localctx = new NewLineContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(23); match(NEWLINE);
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitParens(this);
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterPot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitPot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitPot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(CalculadoraDesafio2Parser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitVar(this);
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(CalculadoraDesafio2Parser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitFloat(this);
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
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraDesafio2Listener ) ((CalculadoraDesafio2Listener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraDesafio2Visitor ) return ((CalculadoraDesafio2Visitor<? extends T>)visitor).visitMulDiv(this);
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
			setState(33);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27); match(FLOAT);
				}
				break;
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); match(VAR);
				}
				break;
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); match(1);
				setState(30); expr(0);
				setState(31); match(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(35);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(36);
						((MulDivContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(37); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(39);
						((AddSubContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(40); expr(6);
						}
						break;

					case 3:
						{
						_localctx = new PotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(42); match(POT);
						setState(43); expr(5);
						}
						break;
					}
					} 
				}
				setState(48);
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
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 5);

		case 2: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\2\3\6"+
		"\5\2\4\6\2\4\3\2\13\f\3\2\r\16:\2\t\3\2\2\2\4\32\3\2\2\2\6#\3\2\2\2\b"+
		"\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2"+
		"\2\2\r\33\5\6\4\2\16\17\7\6\2\2\17\20\7\5\2\2\20\33\5\6\4\2\21\22\5\6"+
		"\4\2\22\23\7\b\2\2\23\33\3\2\2\2\24\25\7\6\2\2\25\26\7\5\2\2\26\27\5\6"+
		"\4\2\27\30\7\b\2\2\30\33\3\2\2\2\31\33\7\b\2\2\32\r\3\2\2\2\32\16\3\2"+
		"\2\2\32\21\3\2\2\2\32\24\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\b\4"+
		"\1\2\35$\7\7\2\2\36$\7\6\2\2\37 \7\3\2\2 !\5\6\4\2!\"\7\4\2\2\"$\3\2\2"+
		"\2#\34\3\2\2\2#\36\3\2\2\2#\37\3\2\2\2$\60\3\2\2\2%&\f\b\2\2&\'\t\2\2"+
		"\2\'/\5\6\4\t()\f\7\2\2)*\t\3\2\2*/\5\6\4\b+,\f\6\2\2,-\7\n\2\2-/\5\6"+
		"\4\7.%\3\2\2\2.(\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\7\3\2\2\2\62\60\3\2\2\2\7\13\32#.\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}