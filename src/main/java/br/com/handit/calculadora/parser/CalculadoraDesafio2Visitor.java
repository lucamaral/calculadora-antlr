// Generated from CalculadoraDesafio2.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraDesafio2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraDesafio2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculadoraDesafio2Parser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CalculadoraDesafio2Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewLine(@NotNull CalculadoraDesafio2Parser.ExpressionNewLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(@NotNull CalculadoraDesafio2Parser.NewLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#pot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPot(@NotNull CalculadoraDesafio2Parser.PotContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull CalculadoraDesafio2Parser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull CalculadoraDesafio2Parser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull CalculadoraDesafio2Parser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull CalculadoraDesafio2Parser.FloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#assignNewLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignNewLine(@NotNull CalculadoraDesafio2Parser.AssignNewLineContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull CalculadoraDesafio2Parser.MulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafio2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull CalculadoraDesafio2Parser.AssignContext ctx);
}