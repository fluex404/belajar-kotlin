package array

fun main() {
    /* Kotlin array declaration - using arrayOf() function */
//    var myArray1 = arrayOf(10, 20, 30, 40 , 50)
//    var myArray2 = arrayOf(11, 22, 33, 44 , 55)
//    var myArray3 = arrayOf<String>("Alex", "Oman", "Petruk", "John")
//    var myArray4 = arrayOf<String>(1, 2, 3, "ABC", "bcd", "CD")

    /* Kotlin array declaration - using intArrayOf() function */
//    var myArray5 = intArrayOf(5, 10, 12, 31, 18)

    /* Modify and access elements of array */
    val array1 = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf<Long>(11, 12, 13, 14)
    array1.set(0, 5)
    array1[2] = 6

    array2.set(2, 10)
    array2[3] = 8

//    array1.set(array1.size-1, 9)

    for (element in array1) {
        println(element)
    }
    println("----")
    for (element in array2) {
        println(element)
    }
}