data class Laptop(val brand: String, val ramGB: Int)

fun Int.toLehmanGigabytes(round: Boolean = false): String {
    if (this == 16) {
        return "$this GB (Lehman Standrd)"
    } else {
        return "$this GB (Not Lehman Standrd)"
    }
}

fun main() {
    val laptop1 = Laptop("Lenovo", 32)
    val laptop2 = Laptop("HP", 16)
    println(laptop1.ramGB.toLehmanGigabytes())
    println(laptop2.ramGB.toLehmanGigabytes())

}