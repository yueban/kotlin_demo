package kotlinlang.javainterop

import java.io.IOException
import kotlin.reflect.KClass

class CallKotlinFromJavaDemo {
    /********** demo 1 **********/
    var name: String = "name"
    var isTrue: Int = 1

    /********** demo 3 **********/
    @JvmField
    val ID = 1
}


/********** demo 2 **********/
val hahaha = 1

fun callKotlinFunc() {}


/********** demo 4 **********/
class Key(val value: Int) {
    companion object {
        @JvmField
        val COMPARATOR: Comparator<Key> = compareBy { it.value }

        const val VERSION = 9

        @JvmStatic
        fun foo() {
        }

        fun bar() {}
    }
}

object Singleton {
    lateinit var provider: String

    const val CONST = 1

    @JvmStatic
    fun foo() {
    }

    fun bar() {}
}

const val MAX = 239


/********** demo 5 **********/
fun testKClass(clazz: KClass<String>) {
}


/********** demo 6 **********/
fun List<String>.filterValid(): List<String> = this

@JvmName("filterValidInt")
fun List<Int>.filterValid(): List<Int> = this

val x: Int
    @JvmName("getX_prop")
    get() = 15

fun getX() = 10

@get:JvmName("y")
@set:JvmName("changeY")
var y: Int = 23


/********** demo 7 **********/
class CKotlinFromJava @JvmOverloads constructor(x: Int, y: Double = 0.0) {
    @JvmOverloads
    fun f(a: String, b: Int = 0, c: String = "abc") {
    }
}


/********** demo 8 **********/
@Throws(IOException::class)
fun testException() {
    throw IOException()
}


/********** demo 9 **********/
fun testNPE(x: String): Int {
    return x.length
}

/********** demo 10 **********/
class Box<out T>(val value: T)

interface Base
class Derived : Base

// eg1.
//fun boxDerived(value: Derived): Box<Derived> = Box(value)
//
//fun unboxBase(box: Box<Base>): Base = box.value

// eg2.
//fun boxDerived(value: Derived): Box<@JvmWildcard Derived> = Box(value)
//
//fun unboxBase(box: Box<Base>): Base = box.value

// eg3.
fun boxDerived(value: Derived): Box<Derived> =
    Box(value)

fun unboxBase(box: Box<@JvmSuppressWildcards Base>): Base = box.value

/********** demo 11 **********/
fun emptyList(): List<Nothing> = listOf()

fun testNothing(): Nothing {
    throw IOException()
}