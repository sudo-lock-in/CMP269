fun main() {
    val studentName: String = "A. Thompson"
    val middleName: String? = null
    val displayMN = middleName ?: "No Middle Name"
    println("Welcome, $studentName $displayMN!")
}