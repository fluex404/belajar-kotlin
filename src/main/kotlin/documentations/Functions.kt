package documentations

fun main() {
    println(sum(7, 2))
    println(substract(7, 2))
    printSum(7, 2)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
fun substract(a: Int, b: Int): Int = a - b
fun printSum(a: Int, b: Int): Unit = println("sum of ${a} and ${b} is ${a+b}")