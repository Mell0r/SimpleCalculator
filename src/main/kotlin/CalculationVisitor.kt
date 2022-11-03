import antlrGeneratedSource.SimpleCalculatorBaseVisitor
import antlrGeneratedSource.SimpleCalculatorParser
import org.antlr.v4.runtime.tree.ErrorNode
import com.github.michaelbull.result.*

class CalculationVisitor : SimpleCalculatorBaseVisitor<Result<Int, String>>() {
    private val variables = mutableMapOf<String, Int>()

    override fun visitErrorNode(node: ErrorNode?): Result<Int, String> {
        return Err("Incorrect calculation")
    }

    override fun visitCalculation(ctx: SimpleCalculatorParser.CalculationContext): Result<Int, String> {
        if (ctx.assign() != null)
            return visitAssign(ctx.assign())

        if (ctx.statement() != null)
            return visitStatement(ctx.statement())

        return Err("Wrong grammar rule for 'calculation'!")
    }

    override fun visitAssign(ctx: SimpleCalculatorParser.AssignContext): Result<Int, String> {
        if (ctx.statement() == null || ctx.ID() == null)
            return Err("Wrong grammar rule for 'assign'!")
        val value = visitStatement(ctx.statement())
        value.onSuccess { variables[ctx.ID().text] = it }
        return value
    }

    override fun visitStatement(ctx: SimpleCalculatorParser.StatementContext): Result<Int, String> {
        if (ctx.ID() != null) {
            val value = variables[ctx.ID().text]
            return value.toResultOr { "Using uninitialized variable!" }
        }

        if (ctx.INT() != null) {
            val value = ctx.INT().text.toIntOrNull()
            return value.toResultOr { "Regular statement for numbers is wrong!" }
        }

        if (ctx.statement().size == 1)
            return visitStatement(ctx.statement()[0])

        if (ctx.statement().size == 2) {
            if (ctx.children.size != 3)
                return Err("Wrong grammar rule for 'statement'!")
            val resL = visitStatement(ctx.statement()[0]).getOrElse { err -> return@visitStatement Err(err) }
            val resR = visitStatement(ctx.statement()[1]).getOrElse { err -> return@visitStatement Err(err) }

            return when (ctx.children[1].text) {
                "+" -> Ok(resL + resR)
                "*" -> Ok(resL * resR)
                else -> Err("Operation '${ctx.children[1].text}' is not supported!")
            }
        }

        return Err("Wrong grammar rule for 'statement'!")
    }
}