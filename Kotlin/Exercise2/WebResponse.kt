package Exercise2

data class WebResponse(val statusCode: Int, val statusMessage: String, val body: String?)

fun main() {
    val success = WebResponse(200, "success", null)
    val notFound = WebResponse(404, "not-found", null)
    println(notFound)
    println(success)
}

fun describeStatus(code: Int): String {
    when (code) {
        in 200..299 -> "Success: The request was fulfilled."

    }
}