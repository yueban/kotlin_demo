package functionandlambda

import java.io.File
import kotlin.math.pow

fun main(args: Array<String>) {
//    val b = Array(5) {
//        it.toByte()
//    }
//    b[0] = 1
//    b[1] = 2
//    b[2] = 3
//    b[3] = 4
//    b[4] = 1
//    read(b, off = 1, len = 2)


//    var value = 1
//    funF {
//        value = 1 * 2
//    }
//    funF {
//        println(value)
//    }


//    funF(1, 2, 3)
//    funF(1, c = -2)
////    funG(b = -2, 2) // not allowed


//    funF(strings = *arrayOf("a", "b", "C"))


//    println(pow(2.0, 3))


//    println(asList(1, 2, 3))
//    val a = arrayOf("a", "b")
//    println(asList("c", a, "1", "d"))
//    println(asList("c", *a, "1", "d"))


//    funF("1", "a", "b", "d", "2", 1) // not allowed
//    funF("1", "a", "b", "d", "2", offset = 2)


//    val a = 2 pow 3
//    println(a)
//    val b = 3.pow(2)
//    println(b)

//    // 优先级说明
//    // ex1
//    1 shl (2 + 3)
//    1 shl 2 + 3
//    // ex2
//    0 until 1 * 2
//    0 until (1 * 2)
//    // ex3
//    val setA = setOf(1, 2)
//    val setB = setOf(2, 3)
//    setA union setB as Set<*>
//    setA union (setB as Set<*>)
//    // ex4
//    val a = true
//    val b = true
//    val c = false
//    a && b xor c
//    a && (b xor c)
//    // ex5
//    val d = arrayOf(true, false)
//    a xor b in d
//    (a xor b) in d


//    val files = listAllFiles(File("./src"))
//    for (path in files) println(path)


//    println(findFixPoint())
}

/********** demo 1 **********/
fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {
    for (i in off until len + off) {
        println("$i: ${b[i]}")
    }
}

/********** demo 2 **********/
open class CFuncA {
    open fun f(i: Int = 10) {}
}

class CFuncB : CFuncA() {
    // not default value allowed for i
//    override fun f(i: Int = 20) {
//        super.f(i)
//    }
}

/********** demo 3 **********/
fun funF(a: Int = 0, b: Int = 1, func: () -> Unit) {
    func()
}

/********** demo 4 **********/
fun funF(a: Int = 1, b: Int = 2, c: Int = 3) {
}

/********** demo 5 **********/
fun funF(vararg strings: String) {
}

/********** demo 6 **********/
fun funF(): Unit {
//    return
    return Unit
}

/********** demo 7 **********/
fun pow(x: Double, y: Int) = x.pow(y)

/********** demo 8 **********/
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

/********** demo 9 **********/
fun funF(vararg strings: String, offset: Int) {
    for (i in offset until strings.size) {
        print("${strings[i]} ")
    }
}

/********** demo 10 **********/
infix fun Int.pow(x: Int) = toDouble().pow(x).toInt()

/********** demo 11 **********/
class CInfix {
    infix fun add(s: String) {}
    fun print() {
        this add "a"
        add("a")
//        add "a" // not allowed
    }
}

/********** demo 12 **********/
fun listAllFiles(file: File): List<String> {
    val files = ArrayList<String>()

    fun listAllFiles(file: File) {
        if (!file.isDirectory) {
            files.add(file.absolutePath)
        } else {
            for (subFile in file.listFiles()) {
                listAllFiles(subFile)
            }
        }
    }

    listAllFiles(file)

    return files
}


/********** demo 13 **********/
val eps = 1E-10

// will cause StackOverflow exception without tailrec keyword
tailrec fun findFixPoint(x: Double = 1.0): Double = if (Math.abs(x - Math.sin(x)) < eps) x else findFixPoint(Math.sin(x))