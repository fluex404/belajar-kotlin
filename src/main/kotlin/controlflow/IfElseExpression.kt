package controlflow

fun main() {
    val num1 = 10
    val num2 = 20

    val result = if(num1 > num2){
        "$num1 is grater than $num2"
    } else {
        "$num2 is grater than $num1"
    }
    println(result)
}