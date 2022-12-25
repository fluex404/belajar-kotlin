package function

fun myFun(org: String, portal: String, fn: (String, String) -> String): Unit {
    val result = fn(org, portal)
    println(result)
}

fun main() {
    val fn: (String, String) -> String = {org, portal -> "$org develop $portal"}
    myFun("Kuda", "Android", fn)
}