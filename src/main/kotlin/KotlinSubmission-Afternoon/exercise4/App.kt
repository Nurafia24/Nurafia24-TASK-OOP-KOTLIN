package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    try {
//        Hasil nya adalah Error karena pembagiannya dengan nol
        val numerator = 30
        val denominator = 0
//        Hasilnya pembagiannya ada karena tidak di bagi dengan Nol

//        val numerator = 30
//        val denominator = 10


        val result = divideNumbers(numerator, denominator)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Error: Terjadi pembagian oleh nol. ${e.message}")
    }
}

fun divideNumbers(numerator: Int, denominator: Int): Int {
    return numerator / denominator


}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

