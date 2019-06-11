// Generated from CalculadoraOperacoesComuns.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraOperacoesComuns extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, NEWLINE=2, WS=3, POT=4, MUL=5, DIV=6, ADD=7, SUB=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"FLOAT", "NEWLINE", "WS", "'^'", "'*'", "'/'", "'+'", "'-'"
	};
	public static final String[] ruleNames = {
		"FLOAT", "NEWLINE", "WS", "POT", "MUL", "DIV", "ADD", "SUB", "DIGIT"
	};


	public CalculadoraOperacoesComuns(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculadoraOperacoesComuns.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\6\2$\n\2"+
		"\r\2\16\2%\3\2\6\2)\n\2\r\2\16\2*\5\2-\n\2\3\3\5\3\60\n\3\3\3\3\3\3\4"+
		"\6\4\65\n\4\r\4\16\4\66\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\3\2\4\4\2\13"+
		"\13\"\"\3\2\62;L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3,\3\2\2\2\5/\3\2\2\2\7"+
		"\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2"+
		"\23D\3\2\2\2\25\27\5\23\n\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2"+
		"\30\31\3\2\2\2\31\32\3\2\2\2\32\36\7\60\2\2\33\35\5\23\n\2\34\33\3\2\2"+
		"\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37-\3\2\2\2 \36\3\2\2\2!#\7"+
		"\60\2\2\"$\5\23\n\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&-\3\2\2\2"+
		"\')\5\23\n\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\26\3"+
		"\2\2\2,!\3\2\2\2,(\3\2\2\2-\4\3\2\2\2.\60\7\17\2\2/.\3\2\2\2/\60\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\7\f\2\2\62\6\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\4\2\29\b"+
		"\3\2\2\2:;\7`\2\2;\n\3\2\2\2<=\7,\2\2=\f\3\2\2\2>?\7\61\2\2?\16\3\2\2"+
		"\2@A\7-\2\2A\20\3\2\2\2BC\7/\2\2C\22\3\2\2\2DE\t\3\2\2E\24\3\2\2\2\n\2"+
		"\30\36%*,/\66\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}