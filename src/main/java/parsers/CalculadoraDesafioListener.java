// Generated from parsers\CalculadoraDesafio.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraDesafioParser}.
 */
public interface CalculadoraDesafioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull CalculadoraDesafioParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull CalculadoraDesafioParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull CalculadoraDesafioParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull CalculadoraDesafioParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull CalculadoraDesafioParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull CalculadoraDesafioParser.MinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculadoraDesafioParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculadoraDesafioParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull CalculadoraDesafioParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull CalculadoraDesafioParser.MultContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull CalculadoraDesafioParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull CalculadoraDesafioParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(@NotNull CalculadoraDesafioParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(@NotNull CalculadoraDesafioParser.PowContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(@NotNull CalculadoraDesafioParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(@NotNull CalculadoraDesafioParser.CalcContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull CalculadoraDesafioParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull CalculadoraDesafioParser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculadoraDesafioParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalculadoraDesafioParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraDesafioParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalculadoraDesafioParser.AssignContext ctx);
}