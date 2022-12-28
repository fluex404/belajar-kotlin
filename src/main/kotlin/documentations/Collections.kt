package documentations

fun main() {
    val list = listOf("orange", "banana")
    when{
        "orange" in list -> println("there is orange")
        "apple" in list -> println("there is apple")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }.reversed()
        .map { it.uppercase() }
        .forEach { println(it) }
}