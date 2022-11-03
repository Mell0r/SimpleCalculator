import com.github.michaelbull.result.expect
import com.github.michaelbull.result.expectError
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculationVisitorTest {
    private fun checkCorrectStatement(calculator: SimpleCalculator, statement: String, expected: Int, testName: String) {
        assertEquals(
            expected,
            calculator.calculate(statement).expect{ "$testName returned Error: " }
        )
    }

    private fun checkIncorrectStatement(calculator: SimpleCalculator, statement: String, testName: String) {
        calculator.calculate(statement).expectError{ "$testName returned Ok: " }
    }

    @Test
    fun simpleAssign() {
        val calculator = SimpleCalculator()
        checkCorrectStatement(calculator, "_Aqwe13 = (1 + 2) * 5 + 10 * 2;", 35, "simpleAssign")
    }

    @Test
    fun simpleStatement() {
        val calculator = SimpleCalculator()
        checkCorrectStatement(calculator, "(1 * 2 * 3 * 4 * 5 + 1 * 2) * 8;", 976, "simpleStatement")
    }

    @Test
    fun aCoupleAssigns() {
        val calculator = SimpleCalculator()
        checkCorrectStatement(calculator, "_a = 1;", 1, "aCoupleAssigns")
        checkCorrectStatement(calculator, "A = 2;", 2,"aCoupleAssigns")
        checkCorrectStatement(calculator, "a = 3;", 3,"aCoupleAssigns")
        checkCorrectStatement(calculator, "_A = _a + A * a;", 7,"aCoupleAssigns")
        checkCorrectStatement(calculator, "_a = _A;", 7,"aCoupleAssigns")
    }

    @Test
    fun aCoupleAssignsWithStatements() {
        val calculator = SimpleCalculator()
        checkCorrectStatement(calculator, "a = 2;", 2, "aCoupleAssignsWithStatements")
        checkCorrectStatement(calculator, "b = 5;", 5,"aCoupleAssignsWithStatements")
        checkCorrectStatement(
            calculator,
            "c = (a + 2 * 3) * b + 2 * a * b;",
            60,
            "aCoupleAssignsWithStatements"
        )
    }

    @Test
    fun wrongAssign() {
        val calculator = SimpleCalculator()
        checkIncorrectStatement(
            calculator,
            "a = a = 1",
            "wrongAssign"
        )
        checkIncorrectStatement(
            calculator,
            "a = 2 = 1",
            "wrongAssign"
        )
        checkIncorrectStatement(
            calculator,
            "a = b",
            "wrongAssign"
        )
    }

    @Test
    fun wrongStatement() {
        val calculator = SimpleCalculator()
        checkIncorrectStatement(
            calculator,
            "((());",
            "wrongStatement"
        )
        checkIncorrectStatement(
            calculator,
            "(1 + 2)",
            "wrongStatement"
        )
        checkIncorrectStatement(
            calculator,
            "2 * 3 *;",
            "wrongStatement"
        )
        checkIncorrectStatement(
            calculator,
            "1 - 2;",
            "wrongStatement"
        )
    }
}