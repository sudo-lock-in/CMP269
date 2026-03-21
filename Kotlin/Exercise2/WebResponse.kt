package Exercise2

data class WebResponse(val statusCode: Int, val statusMessage: String, val body: String?)

fun main() {
    //exercise 1
    val success = WebResponse(200, "success", null)
    val notFound = WebResponse(404, "not-found", null)
    println(notFound)
    println(success)

    describeStatus(success.statusCode) //exercise 2
    describeStatus(notFound.statusCode)
}

// exercise 2
fun describeStatus(code: Int) {
    when (code) {
        in 200..299 -> println("Success: The request was fulfilled.")
        in 400..499 -> println("Client Error: Check your URL or parameters.")
        in 500..599 -> println("Server Error: The Lehman Server is having trouble.")
        else -> println("Unknown status code.")
    }
}

