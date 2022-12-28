package documentations

fun main() {
    foo(9)
}
fun foo(a: Int = 0, b: String = "kosong"){
    println("a = ${a}, b = ${b}")
}