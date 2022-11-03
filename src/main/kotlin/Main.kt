import com.github.michaelbull.result.mapBoth
import java.io.File

fun main(args: Array<String>) {
    val calculator = SimpleCalculator()
    File(args[0]).forEachLine { line ->
        calculator.calculate(line).mapBoth(
            { res ->
                if (line.contains('='))
                    println(line.split('=')[0].trim() + " = $res;")
                else
                    println(line.dropLast(1) + " = $res;")
            },
            { err -> println(err) }
        )
    }
}