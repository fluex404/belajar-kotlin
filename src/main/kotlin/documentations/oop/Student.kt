package documentations.oop

class Student {
    var name=""
    var age= 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    fun print(){
        println("Your Data is")
        println("Nama: ${name}")
        println("Age: ${age}")
    }
}