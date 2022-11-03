import antlrGeneratedSource.SimpleCalculatorLexer
import antlrGeneratedSource.SimpleCalculatorParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import com.github.michaelbull.result.*

class SimpleCalculator {
    private val visitor = CalculationVisitor()

    fun calculate(statement: String) : Result<Int, String> {
        val inputStream: CharStream = CharStreams.fromString(statement)

        val lexer = SimpleCalculatorLexer(inputStream)
        val commonTokenStream = CommonTokenStream(lexer)
        val parser = SimpleCalculatorParser(commonTokenStream)

        val listener = SavingErrorListener()
        parser.removeErrorListeners()
        parser.addErrorListener(listener)
        parser.calculation()
        val savedError = listener.savedError
        if (savedError != null)
            return Err(savedError)

        parser.reset()

        return visitor.visitCalculation(parser.calculation())
    }
}