package kotlinlang_org.other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    var a: String? = "str"
//    a = null
//
////    a.length // not allowed
//
//    // method 1
//    val l1 = if (a != null) a.length else -1
//    println(l1)
////
//    // method 2
//    val l2 = a?.length
//    println(l2)


    /********** demo 2 **********/
//    fun testLet(x: Any?) {
//        x?.let {
//            println("$x is not null")
//        }
//    }
//    testLet(null)
//    testLet("a")


    /********** demo 3 **********/
//    fun getLengthOrNull(x: String?): Int? {
//        return x?.length ?: return null
//    }
//
//    fun getLengthOrException(x: String?): Int? {
//        return x?.length ?: throw IllegalArgumentException("x is null")
//    }


    /********** demo 4 **********/
//    val a: String? = null
////    a!! // throw exception
//    a!!.length // throw exception


    /********** demo 5 **********/
//    val a = "abc"
//    val aInt: Int? = a as? Int
//    println(aInt)


    /********** demo 6 **********/
//    var l = listOf(1, 2, 3, null, 5)
//    l = l.filterNotNull()
//    println(l)
}