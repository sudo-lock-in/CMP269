fun main() {
    var studentName: String = "A."
    var middleName: String? = null
    val displayMN = middleName ?: "No Middle Name"
    println("Welcome, $studentName $displayMN!")
}