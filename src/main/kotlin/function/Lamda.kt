package function

fun main() {
    val myLambda: (Int) -> Unit = {s: Int -> println(s)}
    addNumber(5, 10, myLambda)
}

fun addNumber(a: Int, b: Int, myLambda: (Int) -> Unit){
    val add = a + b
    myLambda(add)
}