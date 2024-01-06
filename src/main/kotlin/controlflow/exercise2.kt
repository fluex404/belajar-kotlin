package controlflow

fun main() {
    var pizzaSlices = 0
    while(pizzaSlices <= 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
