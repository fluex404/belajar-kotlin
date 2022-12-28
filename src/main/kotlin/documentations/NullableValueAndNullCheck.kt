package documentations

fun main() {
    val items: List<String>? = null
    items?.forEach { println(it) }

    println(parseInt("")?.times(2) ?: 0 )
    println(parseInt("8")!! * 2)
    println(parseInt("1")?.times(2) ?: 0)
    println(parseInt("18")?.times(2) ?: 0)
}

fun parseInt(str: String): Int?{
    str.ifEmpty { return null }
    return str.toInt()
}