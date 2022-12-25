package exception

fun main() {
    try {
        val data = 20/0
    } catch(e: Exception){
        println("you got erro: ${e.message}")
    }

}