package nullsafety

fun main() {

//    var string: String? = "Hello!"
//    print(string.length) // Compile error

    var str: String? = "Hello"
    if(str != null)// smart cast
        println(str.length) // It works now!

    /* Use of is for smart cast */
    val obj: Any= "Kuda"
    if(obj !is String){
        // No Explicit Casting needed.
        println("String length is ${obj}")
    }
}