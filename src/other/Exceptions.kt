package other


fun main(args: Array<String>) {
    /********** demo 1 **********/
//    fun testTry(x: String): Int? {
//        val a: Int? = try {
//            Integer.parseInt(x)
//        } catch (e: NumberFormatException) {
//            println("catch NumberFormatException")
//            null
//        }
//        return a
//    }
//    println(testTry("123"))
//    println(testTry("abc"))


    /********** demo 2 **********/
    // kotlin has no checked-exception (it means all exceptions in kotlin is runtime-exceptions)


    /********** demo 3 **********/
//    fun fail(message: String): Nothing {
//        throw Exception(message)
//    }
//
////    val s = null ?: fail("msg")
////    println(s) // not allowed, cause s could be Nothing
//
//    val x = null // type of x is Nothing?
//    val l = listOf(null) // type of l is List<Nothing?>
}