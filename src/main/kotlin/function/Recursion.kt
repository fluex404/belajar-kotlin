package function

fun main() {
    val number = 4
    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}
fun factorial(n: Int, run: Int=1):Long{
    return if (n == 1){
        run.toLong()
    } else {
        factorial(n-1, run*n)
    }
}