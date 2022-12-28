package documentations.idioms

fun main() {
    listOf<Int>(10, 20, 2, -23, -2 , -23)
        .filter { it > 0 }
        .forEach { println(it) }
}