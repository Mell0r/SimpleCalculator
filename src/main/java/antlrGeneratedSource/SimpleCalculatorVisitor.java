package antlrGeneratedSource;// Generated from C:/Users/JazzM/IdeaProjects/Parser_generator_HW/src/main/resources\SimpleCalculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#calculation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculation(SimpleCalculatorParser.CalculationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SimpleCalculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleCalculatorParser.StatementContext ctx);
}