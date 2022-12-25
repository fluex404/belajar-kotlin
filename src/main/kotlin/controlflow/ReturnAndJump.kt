package controlflow

/**
 * break
 * continue
 * return
 *
 * */

fun main() {
//    for(i in 1..5){
//        if(i == 3){
//            break
//        }
//        println(i)
//    }
    /* Kotlin Labeled break Expression */
    kuda@ for(i in 1..5){

        if (i == 3)
        break@kuda
        println("i = $i")
    }
}