package documentations

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    items.forEach{
        println(it)
    }

    for(x in 1..10 step 2)
        println(x)
}