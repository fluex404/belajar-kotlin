package string

fun main() {
//    val ch = charArrayOf('h', 'e', 'l', 'l', 'o')
//    val st = String(ch)
//
//    println(st)

    val str1 = "Hello, Isa";
    val str2 = """Welcome To Kotlin"""
    println(str1)
    println(str2)
    println(str2.length)
    println(str2.indices)
    for(s in str2.indices){
        print(s.toString().plus(","))
    }
    println()
    println(str1.get(str1.lastIndex))
    println("kuda".compareTo("kuda"))
    println("kuda".plus(" lumping"))
    println(str1.subSequence(0, 3))
    println(str1.contains("Is"))
    println(str1.count())
    println(str1.drop(2))
    println("kudanil adalah \nhewan besar bergigi tajam")
}