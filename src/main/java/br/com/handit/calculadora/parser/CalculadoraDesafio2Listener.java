// Generated from CalculadoraDesafio2.g4 by ANTLR 4.2
package br.com.handit.calculadora.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraDesafio2Parser}.
 */
public interface CalculadoraDesafio2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculadoraDesafio2Parser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculadoraDesafio2Parser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CalculadoraDesafio2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CalculadoraDesafio2Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewLine(@NotNull CalculadoraDesafio2Parser.ExpressionNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#expressionNewLine}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewLine(@NotNull CalculadoraDesafio2Parser.ExpressionNewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(@NotNull CalculadoraDesafio2Parser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(@NotNull CalculadoraDesafio2Parser.NewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#pot}.
	 * @param ctx the parse tree
	 */
	void enterPot(@NotNull CalculadoraDesafio2Parser.PotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#pot}.
	 * @param ctx the parse tree
	 */
	void exitPot(@NotNull CalculadoraDesafio2Parser.PotContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull CalculadoraDesafio2Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull CalculadoraDesafio2Parser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CalculadoraDesafio2Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CalculadoraDesafio2Parser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull CalculadoraDesafio2Parser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull CalculadoraDesafio2Parser.CalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull CalculadoraDesafio2Parser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull CalculadoraDesafio2Parser.FloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#assignNewLine}.
	 * @param ctx the parse tree
	 */
	void enterAssignNewLine(@NotNull CalculadoraDesafio2Parser.AssignNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#assignNewLine}.
	 * @param ctx the parse tree
	 */
	void exitAssignNewLine(@NotNull CalculadoraDesafio2Parser.AssignNewLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull CalculadoraDesafio2Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull CalculadoraDesafio2Parser.MulDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafio2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalculadoraDesafio2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafio2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalculadoraDesafio2Parser.AssignContext ctx);
}