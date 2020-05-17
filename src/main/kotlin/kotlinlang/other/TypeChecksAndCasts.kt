package kotlinlang.other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    fun printStrLength(obj: Any) {
//        when (obj) {
//            is String -> println(obj.length)
//            !is String -> println("Not a String")
//        }
//    }
//
//    printStrLength(123)
//    printStrLength(true)
//    printStrLength("123")


    /********** demo 2 **********/
//    fun printStrLength1(obj: Any) {
//        when (obj) {
//            !is String -> println("Not a String")
//            else -> println(obj.length) // obj is automatically cast to String
//        }
//    }
//
//    fun printStrLength2(obj: Any) {
//        if (obj !is String || obj.length == 0) { // obj is automatically cast to String
//            return
//        }
//        println(obj.length) // obj is automatically cast to String
//    }


    /********** demo 3 **********/
//    fun testCast1(x: Any) {
//        val y = x as String
//    }
//    testCast1("1")
////    testCast1(1) // exception
//
//    fun testCast2(x: Any?) {
//        val y = x as String
//    }
//    testCast2("1")
////    testCast2(null) // exception
//
//    fun testCast3(x: Any?) {
//        val y = x as String?
//    }
//    testCast3("1")
//    testCast3(null) // ok


    /********** demo 4 **********/
//    fun printList(obj: Any) {
//        if (obj is List<*>) {
//            obj.forEach { println(it) }
//        }
//    }
//    printList(listOf(1, 2, 3))
//    printList(1)


    /********** demo 5 **********/
//    fun handleStrings(list: List<String>) {
//        if (list is ArrayList) {
//            // do sth.
//        }
//    }


    /********** demo 6 **********/
//    val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)
//    println(somePair.asPairOf<String, Any>())
//    println(somePair.asPairOf<String, Int>())
//    println(somePair.asPairOf<String, List<*>>())
//    println(somePair.asPairOf<String, List<String>>())
//    println(somePair.asPairOf<String, List<String>>()?.second?.get(0))
}

/********** demo 6 **********/
inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) {
        return null
    }
    return first as A to second as B
}


/********** demo 7 **********/
@Suppress("UNCHECKED_CAST")
inline fun <reified T> List<*>.asListOfType(): List<T>? =
        if (all { it is T }) this as List<T> else null