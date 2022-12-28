package documentations

fun main() {
    val a: Int = 1 // immediate assigment
    val b = 2 // `Int` type is inferred
    val c: Int // type required when no initializer is provided
    c = 3 // diferred assignment

    var x = 5 // `Int` type is inferred
    x += 1

    // you can declare variable at the top level
    var z = 19
    fun incrementZ(){
        z += 2
    }
    incrementZ()
    println(z)
}