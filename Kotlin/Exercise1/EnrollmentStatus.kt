// exercise 3
sealed class EnrollmentStatus {
    data class Success(val courseCode: String) : EnrollmentStatus()
    data class Error(val message: String) : EnrollmentStatus()
    class Loading() : EnrollmentStatus()
}

fun printStatus(status: EnrollmentStatus) {
    when (status) {
        is EnrollmentStatus.Loading -> println("Enrolling...")
        is EnrollmentStatus.Success -> println("Success! Enrolled in ${status.courseCode}.")
        is EnrollmentStatus.Error -> println("Error! ${status.message}")
    }
}

fun main() {
    val success = EnrollmentStatus.Success("CMP269")
    val error = EnrollmentStatus.Error("Failed to enroll. Course is already full.")
    printStatus(success)
    printStatus(error)
}
