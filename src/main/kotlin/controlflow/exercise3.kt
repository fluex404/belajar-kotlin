package controlflow

fun main() {
    for(n in 1..100) {
        println(
            when {
                n % 15 == 0 -> "fizzbuzz"
                n % 3 == 0 -> "fizz"
                n % 5 == 0 -> "buzz"
                else -> n.toString()
            }
        )
    }
}
