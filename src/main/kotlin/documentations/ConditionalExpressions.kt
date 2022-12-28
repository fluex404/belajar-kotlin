package documentations

fun main() {
    println(maxOf(3, 7))
    println(maxOf(10, 7))
}
fun maxOf(a: Int, b: Int) = if (a > b) a else b