import antlrGeneratedSource.SimpleCalculatorLexer
import antlrGeneratedSource.SimpleCalculatorParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import com.github.michaelbull.result.*

class SimpleCalculator {
    private val visitor = CalculationVisitor()

    fun calculate(line: String) : Result<Int, String> {
        val inputStream: CharStream = CharStreams.fromString(line)

        val lexer = SimpleCalculatorLexer(inputStream)
        val commonTokenStream = CommonTokenStream(lexer)
        val parser = SimpleCalculatorParser(commonTokenStream)
        return visitor.visitCalculation(parser.calculation())
    }
}