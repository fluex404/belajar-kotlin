package nullsafety

fun main() {
    /* Nullable Types */
    var str1: String? = "Hello"
    str1 = null // ok
    println(str1)

    /* Non Nullable Types */
//    var str: String = null // compailer error
//    str = "kuda"
}