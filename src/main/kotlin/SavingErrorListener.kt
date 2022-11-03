import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer

class SavingErrorListener : BaseErrorListener() {
    var savedError : String? = null

    override fun syntaxError(
        recognizer: Recognizer<*, *>?,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,

        msg: String,
        e: RecognitionException?
    ) {
        savedError = "char $charPositionInLine $msg"
    }
}