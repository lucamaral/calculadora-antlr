// Generated from parsers\CalculadoraDesafio.g4 by ANTLR 4.2
package parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraDesafioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraDesafioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CalculadoraDesafioParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull CalculadoraDesafioParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalculadoraDesafioParser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculadoraDesafioParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull CalculadoraDesafioParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull CalculadoraDesafioParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(@NotNull CalculadoraDesafioParser.PowContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(@NotNull CalculadoraDesafioParser.CalcContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalculadoraDesafioParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculadoraDesafioParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull CalculadoraDesafioParser.AssignContext ctx);
}