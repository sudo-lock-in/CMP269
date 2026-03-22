package Exercise2

data class WebResponse(val statusCode: Int, val statusMessage: String, val body: String?)

fun main() {
    //exercise 1
    val success = WebResponse(200, "success", null)
    val notFound = WebResponse(404, "not-found", null)
    println(notFound)
    println(success)
    println()

    //exercise 2
    println(describeStatus(success.statusCode))
    println(describeStatus(notFound.statusCode))
    println()

    //exercise 3
    println(routeRequest("/home", "Alice"))
    println(routeRequest("/grades", "Bob"))
    println(routeRequest("/unknown", null))
    println(routeRequest("/grades", null))

}

// exercise 2
fun describeStatus(code: Int): String {
    return when (code) {
        in 200..299 -> "Success: The request was fulfilled."
        in 400..499 -> "Client Error: Check your URL or parameters."
        in 500..599 -> "Server Error: The Lehman Server is having trouble."
        else -> "Unknown status code."
    }
}

//exercise 3
fun routeRequest(path: String, user: String?): String {
    return when (path) {
        in "/home" -> "Welcome to the Lehman Homepage, ${user ?: "Guest"}!"
        in "/grades" -> {
            val userExist = user ?: return "Error: Unauthorized access to grades."
            "Loading grades for $userExist..."
        }
        else -> "404: Path $path not found."
    }
}
