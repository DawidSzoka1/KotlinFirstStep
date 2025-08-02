sealed class SealedClass(val message: String) {

    fun showMessage() = println("result: $message")
    class Success(message: String) : SealedClass(message) {
        fun suc() = println("success: $message")
    }
    sealed class Error(message: String) : SealedClass(message) {

        fun error() = println("error: $message")
        class RecoverableError(message: String): Error(message)

        class NonRecoverableError(message: String): Error(message)
    }
}

fun main() {
    val success = SealedClass.Success("Success")
    success.suc()
    val error = SealedClass.Error.RecoverableError("erra")
    error.error()

    getData(success)
}

fun getData(result: SealedClass) {
    when (result) {
        is SealedClass.Success -> result.showMessage()
        is SealedClass.Error.NonRecoverableError -> result.showMessage()
        is SealedClass.Error.RecoverableError -> result.showMessage()
    }
}

