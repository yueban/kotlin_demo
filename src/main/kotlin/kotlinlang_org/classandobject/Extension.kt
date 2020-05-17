package kotlinlang_org.classandobject

fun main(args: Array<String>) {
//    val l1 = mutableListOf(1, 2, 3)
//    println(l1)
//    l1.swap(1, 2)
//    println(l1)
//
//    val l2 = mutableListOf("a", "b", 1)
//    println(l2)
//    l2.swap(1, 2)
//    println(l2)


//    printClassExt1(SubClassExt1())


//    ClassExt2().f()
//    ClassExt2().f("overload func f")


//    println(listOf(1, 2, 3).lastIndex)


//    ClassExt4().caller(ClassExt3())


    ClassExt6()
        .caller(ClassExt5())
    SubClassExt6()
        .caller(ClassExt5())
    ClassExt6()
        .caller(SubClassExt5())
}

/********** demo 1 **********/
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1]
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

/********** demo 2 **********/
open class ClassExt1

class SubClassExt1 : ClassExt1()

fun ClassExt1.f() = "ClassExt1 f"
fun SubClassExt1.f() = "SubClassExt1 f"

fun printClassExt1(o: ClassExt1) {
    println(o.f())
}

/********** demo 3 **********/
class ClassExt2 {
    fun f() {
        println("ClassExt2 member f")
    }
}

fun ClassExt2.f() {
    println("ClassExt2 extension f")
}

fun ClassExt2.f(s: String) {
    println("ClassExt2 extension f: $s")
}

/********** demo 4 **********/
fun Any?.toString(): String {
    return this?.toString() ?: "null"
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

//val <T> List<T>.lastIndex2 = 1 // not allowed

/********** demo 5 **********/
class ClassCompanionExt {
    companion object
}

fun ClassCompanionExt.f() = "ClassCompanionExt f"

/********** demo 6 **********/

class ClassExt3 {
    fun f() {
        println("ClassExt3 f")
    }
}

class ClassExt4 {
    fun f() {
        println("ClassExt4 f")
    }

    fun g() {
        println("ClassExt4 g")
    }

    fun ClassExt3.h() {
        f() // call ClassExt3.f()
        this@ClassExt4.f() // call ClassExt4.f()
        g()
    }

    fun caller(o: ClassExt3) {
        o.h()
    }
}

/********** demo 7 **********/
open class ClassExt5

class SubClassExt5 : ClassExt5()

open class ClassExt6 {
    open fun ClassExt5.f() {
        println("5.f in 6")
    }

    open fun SubClassExt5.f() {
        println("Sub5.f in 6")
    }

    /**
     * 因为 caller 传入对象为 ClassExt5,
     * 所以不论实际传入对象是 ClassExt5 还是 SubClassExt5,
     * 都会调用 ClassExt5.f()
     *
     * 区别在于:
     * 通过 ClassExt6 调用，起作用的是 ClassExt6.ClassExt5.f()
     * 通过 SubClassExt6 调用，起作用的是 SubClassExt6.ClassExt5.f()
     */
    fun caller(o: ClassExt5) {
        o.f()
    }
}

class SubClassExt6 : ClassExt6() {
    override fun ClassExt5.f() {
        println("5.f in Sub6")
    }

    override fun SubClassExt5.f() {
        println("Sub5.f in Sub6")
    }
}