package documentations.idioms

import documentations.oop.Customer
import java.io.File
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    println("=>Create DTOs (POJOs/POCOs)")
    var c = Customer("Isa", "isa@gmail.com")
    println(c.toString())

    println("=>Default values for function parameters")
    foo(9)

    println("=>Filter a list")
    listOf<Int>(20, 12 , 30, 23, -234, -23, -23)
        .filter { it > 0 }
        .forEach{ print(it.toString().plus(",")) }

    println("=>Check the presence of an element in a collection")
    val emails = listOf<String>("abc@gmail.com", "kuda@gmail.com")
    if("abc@gmail.com" in emails)
        println("\nthere is abc@gmail.com in a list")
    if("isa@gmail.com" in emails)
        println("\nthere is isa@gmail.com in a list")

    println("=> String interpolation\uFEFF")
    val name = "Isa"
    println("Name ${name.uppercase()}")

    println("=> Instance checks\uFEFF")
    var x = "kuda"
    when(x) {
        is String -> println("x is String")
        else -> println("Instance not found")
    }

    println("Read-only list\uFEFF")
    val list = listOf("a", "b", "c")

    println("Read-only map")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    println("Access a map entry\uFEFF")
    var mutableMap = mutableMapOf("a" to 20, "b" to 32)
    mutableMap.put("c", 100)
    println(mutableMap.get("c"))

    println("Traverse a map or a list of pairs\uFEFF")
    for (m in mutableMap) { // for ((k, v) in map) {
        println("${m.key} -> ${m.value}")
    }

    println("Iterate over a range\uFEFF")
//    for (i in 1..100) { ... }  // closed range: includes 100
//    for (i in 1 until 100) { ... } // half-open range: does not include 100
//    for (x in 2..10 step 2) { ... }
//    for (x in 10 downTo 1) { ... }
//    (1..10).forEach { ... }

    println("=> Extension functions\uFEFF")
    println("Convert this to camelcase".upperCaseTest())

    println("=> Create a singleton\uFEFF")
    println(Resource.name)
    Resource.print()

    println("=> Instantiate an abstract class\uFEFF")
    val myObject = object : MyAbstractClass(){
        override fun calculate(a:Int, b:Int):Int {
            return a + b
        }
        override fun print(str:String) {
            println(str)
        }
    }
    val myObjectResult = myObject.calculate(10, 7)
    myObject.print(myObjectResult.toString())

    println("=> If-not-null shorthand")
    var files = File("Test").listFiles()
    println(files?.size) // size is printed if files is not null

    println("=> If-not-null-else shorthand")
    val files2 = File("Test").listFiles()
    println(files2?.size ?: "empty file") // if files is null, this prints "empty"

    println("=> Execute a statement if null\uFEFF")
//    val values = mapOf<String, String>("emailt" to "isa@gmail.com")
//    val email2 = values["email"] ?: throw IllegalStateException("Email is missing!!!")
//    println(email2)

    println("=> Get first item of a possibly empty collection\uFEFF")
    val emails3 = listOf<String>()
    val mainEmail = emails3.firstOrNull() ?: "email kosong"
    println(mainEmail)

    println("=> Execute if not null\uFEFF")
    val value = "kuda"
    value?.let{
        println("value is any ${value}")
    }

    println("=> Map nullable value if not null\uFEFF")
    val value2 = "kuda"
    value2?.let{ println("value is any") } ?: println("value is empty")

    println("Return on when statement\uFEFF")
    println(transform("Blue"))

    // try-catch expression﻿
    // fun test() {
    //    val result = try {
    //        count()
    //    } catch (e: ArithmeticException) {
    //        throw IllegalStateException(e)
    //    }
    //
    //    // Working with result
    //}

    println("=> if expression\uFEFF")
    val value3 = 5
    val y = if(value3 == 1) "One"
            else if(value3 == 2) "Two"
            else "Other"
    println(y)

    println("=> Builder-style usage of methods that return Unit")
    arrayOfMinusOnes(3)
        .forEach { println(it) }

    println("=> Single-expression functions\uFEFF")
    fun theAnswer() = 42 // This is equivalent to fun theAnswer(): Int {return 42 }
    println(theAnswer())

    println("=> Call multiple methods on an object instance (with)")
    class Turtle {
        fun penDown() = println("penDown")
        fun penUp() = println("penUp")
        fun turn(degress: Double) = println("degress : ${degress}")
        fun forward(pixels: Double) = println("Pixels : ${pixels}")
    }
    val myTurtle = Turtle()
    with(myTurtle) { // draw a 100 pix square
        penDown()
        for(i in 1..4){
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    println("=> Java 7's try-with-resouces")
    val stream = Files.newInputStream(Paths.get("file.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }

    println("=> Generic function that requires the generic type information")
//    inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromjSON(Json, T::class.java)

    println("=> Nullable Boolean")
    val b: Boolean? = null
    if(b == true) //
    else // // `b` is false or null

    println("=> Swap two variables")
    var a = 1
    var b2 = 2
    a = b2.also { b2 = a }

//    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")



}
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
fun transform(color: String): Int{
    return when(color){
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}
abstract class MyAbstractClass{
    abstract fun calculate(a: Int, b: Int): Int
    abstract fun print(str:String)
}
object Resource {
    val name = "Name of Resource"
    fun print(){
        println(name)
    }
}
fun String.upperCaseTest(): String {
    return this.plus(",")
}
fun foo(a: Int = 0, b: String = "kosong"){
    println("a = ${a}, b = ${b}")
}