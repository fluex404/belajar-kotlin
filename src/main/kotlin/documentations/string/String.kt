package documentations.string

fun main() {
    println("=> Concatenate strings\uFEFF")
    val name = "Isa"
    println("Hello, $name")
    println("Your name is ${name.length} characters long")

    println("=> Build a string")
    val countDown = buildString {
        for(i in 5 downTo 1){
            append(i)
            appendLine()
        }
    }
    println(countDown)

    println("=> Create a string from collection items")
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val invertedOddNumbers = numbers
        .filter { it % 2 != 0 }
//        .joinToString(separator = ";"){ "${it}" }
        .joinToString(",")
    println(invertedOddNumbers)

    println("=> Set default value if the string is blank")
    println("kuda".ifBlank { "Kuda" })

    println("=> Replace characters at the beginning and end of a string")
    val input = "##place##holder##"
    val result = input.removeSurrounding("##")
    println(result)

    println("=> Replace occurrences")
    val regex = Regex("""\w*\d+\w*""") // raw string
    val input2 = "login: Pokemon5, password: 1q2w3e4r5t"
    val replacementResult = regex.replace(input2, "xxx")
    println("Initial input : ${input2}")
    println("Anonymized input : ${replacementResult}")

    println("=> Split a string\uFEFF")
    println("Sometimes.text.should.be.split".split("."))

    println("=> Take a substring\uFEFF")
    val input3 = "What is the answer to the Ultimate Question of Life, the Universe, and Everything? 42"
    val answer = input3.substringAfter("?")
    println(answer)

    val input4 = "To be, or not to be, that is the question."
    val question = input4.substringAfterLast(",")
    println(question)

    println("=> Use multiline strings\uFEFF")
    val result2 = """
        Kotlin
           Java 
    """.trimIndent()
    println(result2)

    val result3 = """
       #  Kotlin
       #  Java
   """.trimMargin("#")
    println(result3)
}