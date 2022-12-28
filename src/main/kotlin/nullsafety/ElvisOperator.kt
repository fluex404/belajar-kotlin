package nullsafety

fun main() {
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1: Int = str ?.length ?: 0
    var len2:  Int = str2 ?.length ?:  -1

    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}