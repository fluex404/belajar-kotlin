package controlflow

fun main() {

    /* Using when as an Expression */
//    var number = 4
//    var numberProvided = when(number){
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        5 -> "Five"
//        else -> "Invalid number"
//    }
//    println(numberProvided)

    /* Using when Without Expression */

//    var number = 1
//    when(number){
//        1 -> {
//            println("Monday")
//            println("First day of the week")
//        }
//        7 -> println("Sunday")
//        else -> println("Other Days")
//    }

    /* Multiple Statement of when Using Braces */
//    var number = 8
//    when(number){
//        3, 4, 5, 6 -> println("it is summer seasson")
//        7, 8, 9 -> println("it is rainy season")
//        10, 11 -> println("It is autumn season")
//        12, 1, 2 -> println("It is winter season")
//        else -> println("Invalid input")
//    }

    /* Using when in the range */
    var number = 7
    when(number){
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}