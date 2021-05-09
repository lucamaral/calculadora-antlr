// Generated from CalculadoraDesafio1.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraDesafio1Parser}.
 */
public interface CalculadoraDesafio1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculadoraDesafio1Parser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CalculadoraDesafio1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CalculadoraDesafio1Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewLine(@NotNull CalculadoraDesafio1Parser.ExpressionNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewLine(@NotNull CalculadoraDesafio1Parser.ExpressionNewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(@NotNull CalculadoraDesafio1Parser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(@NotNull CalculadoraDesafio1Parser.NewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#pot}.
	 * @param ctx the parse tree
	 */
	void enterPot(@NotNull CalculadoraDesafio1Parser.PotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#pot}.
	 * @param ctx the parse tree
	 */
	void exitPot(@NotNull CalculadoraDesafio1Parser.PotContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CalculadoraDesafio1Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CalculadoraDesafio1Parser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull CalculadoraDesafio1Parser.CalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull CalculadoraDesafio1Parser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull CalculadoraDesafio1Parser.FloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio1Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull CalculadoraDesafio1Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio1Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull CalculadoraDesafio1Parser.MulDivContext ctx);
}