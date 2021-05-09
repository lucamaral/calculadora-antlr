// Generated from CalculadoraDesafio1.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraDesafio1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraDesafio1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CalculadoraDesafio1Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewLine(@NotNull CalculadoraDesafio1Parser.ExpressionNewLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(@NotNull CalculadoraDesafio1Parser.NewLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#pot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot(@NotNull CalculadoraDesafio1Parser.PotContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull CalculadoraDesafio1Parser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull CalculadoraDesafio1Parser.FloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio1Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull CalculadoraDesafio1Parser.MulDivContext ctx);
}