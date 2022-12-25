package function

import kotlin.coroutines.coroutineContext

fun main() {
//    inlineFunction ({ println("calling inline functions")})

    /* Non local control flow */
//    inlineFunction({ println("fun1")}, { println("fun2")})

    /* crossinline annotation */
//    inlineFunction({ println("fun1"); return // error compiler}, { println("fun2"); return})

    /* noinline modifier */
    inlineFunction({ println("fun1")}, { println("fun2")})
}
//inline fun inlineFunction(myFun: () -> Unit){
//    myFun()
//    println("code inside inline function")
//}
//inline fun inlineFunction(myFun: () -> Unit, nxFun: () -> Unit) {
//    myFun()
//    nxFun()
//
//    println("code inside inline function")
//}
//inline fun inlineFunction(crossinline fun1: () -> Unit, fun2: () -> Unit){
//    fun1()
//    fun2()
//    println("code inside inline function")
//}
inline fun inlineFunction(fun1: () -> Unit, noinline fun2: () -> Unit){
    fun1()
    fun2()
    println("code inside inline function")
}