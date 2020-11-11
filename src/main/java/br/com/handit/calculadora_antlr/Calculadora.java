package br.com.handit.calculadora_antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parsers.CalculadoraDesafioLexer;
import parsers.CalculadoraDesafioParser;

public class Calculadora {

	public static Double resolverExpressao(final String expressao) {
		return solve(expressao);
	}

	public static Double resolverExpressaoComVariaveis(final String expressao) {
		return solve(expressao);
	}

	private static Double solve(final String expressao) {
		final CalculadoraDesafioLexer lexer = new CalculadoraDesafioLexer(CharStreams.fromString(expressao));
		final CalculadoraDesafioParser parser = new CalculadoraDesafioParser(new CommonTokenStream(lexer));
		return new CalculadoraDesafioVisitor().visitCalc(parser.calc());
	}

}
