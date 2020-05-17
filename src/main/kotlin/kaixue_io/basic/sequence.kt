package kaixue_io.basic

fun main(args: Array<String>) {
    /*val text = """
    |Hi,
     |My name is yueban.
      |Hello world.
    """

    println(text.trimIndent())
    println()
    println(text.trimMargin())*/


    val sequence = sequenceOf(3, 4, 5, 6)
    val result = sequence
        .map { it * 2 }
        .filter { it % 5 == 0 }
    println(result.first())
}
