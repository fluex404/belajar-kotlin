package documentations.oop

open class Animal {
    var name = ""
    var age = 0
    open fun sound(): Unit{
        println("Sound of Animal")
    }
}