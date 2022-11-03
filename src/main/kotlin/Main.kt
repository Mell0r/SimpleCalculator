import com.github.michaelbull.result.mapBoth
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main(args: Array<String>) {
    val calculator = SimpleCalculator()
    File(args[0]).forEachLine { line ->
        calculator.calculate(line).mapBoth(
            { res ->
                if (line.contains('='))
                    print(line.split('=')[0].trim() + " = $res;")
                else
                    print(line.dropLast(1) + " = $res;")
            },
            { err -> print(err) }
        )
    }
}