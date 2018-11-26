package other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    fun funcEqual1(a: Any?, b: Any?): Boolean {
//        return a == b // equals to [a?.equals(b) ?: (b === null)]
//    }


    /********** demo 2 **********/
//    fun funcEqual2(a: Any?, b: Any?): Boolean {
//        return a === b // compare reference
//    }
//
//    fun funcEqual3(x: Any?): Boolean {
//        return x == null // equals to [x === null]
//    }


    /********** demo 3 **********/
//    println(1.0F == 1.0F)
//    println(-0.0F == 0.0F)
//    println((-0.0F).equals(0.0F))


    /********** demo 4 **********/
    // "===" for basic type will be considered as "=="
    val i1 = 10
    val i2 = 10
    println(i1 === i2)
    val i3 = 10000F
    val i4 = 10000F
    println(i3 === i4)
}