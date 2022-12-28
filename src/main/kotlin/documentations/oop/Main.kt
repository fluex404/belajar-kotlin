package documentations.oop

fun main() {
    var s = Student("Isa", 21)
    s.print()
    var b = Box(7.0, 10.0)
    b.printArea()

    var animal = Cat()
    animal.sound()

    var customer = Customer("isa", "isa@gmail.com")
    println(customer.toString())
    val c = customer.copy("test", "test@gmail.com")
    println(c)
}