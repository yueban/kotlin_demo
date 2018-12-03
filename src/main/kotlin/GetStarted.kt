/**
 * Created by yueban on 2018/11/1.
 */

var top_level_var = "mutable"
val top_level_val = "immutable"


fun main(args: Array<String>) {
//    println("Hello, Kotlin!")
//    println(sum(1, 2))
//    println(multiply(2, 3))
//    println(printSum(3, 4))

//    var x = 2
//    println(x.javaClass)
//    println(x.javaClass.kotlin.qualifiedName)
//    val PI = 3.14
//    println(PI.javaClass)
//    println(PI.javaClass.kotlin.qualifiedName)
//    printTopLevelValue()

//    var a = 1
//    val s1 = "a is $a"
//    a = 2
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    println(s2)

//    println(maxOf(5, 6))

//    printProduct("2", "asf")

//    val len = getStringLength("123")
//    println(len)


//    val names = listOf("alice", "emma", "ranran")
//    for (name in names) {
//        println(name)
//    }
//
//    for (index in names.indices) {
//        println(index)
//    }
//
//    var index = 0
//    while (index < names.size) {
//        println("name at $index is ${names[index]}")
//        index++
//    }


//    println(describe(1))
//    println(describe(2))
//    println(describe("Hello"))
//    println(describe(2L))
//    println(describe("heiheihei"))


//    val x = 10
//    val y = 9
//    // y+1 = 闭集合 [1,10]
//    if (x in 1..y + 1) {
//        println("fits in range")
//    }


//    val list = listOf("a", "b", "c")
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }
//    // 两个都是 0..2
//    println(1.1 in 0..list.lastIndex)
//    println(1.1 in list.indices)
//    println(0..list.lastIndex)
//    println(list.indices)


//    // 循环时 1..5 仅输出 1~5 int 值
//    for (x in 1..5) {
//        println(x)
//    }


//    for (x in 1..10 step 2) {
//        print("$x ")
//    }
//    println()
//    for (x in 9 downTo 0 step 2) {
//        print("$x ")
//    }


//    val names = listOf("alice", "emma", "ranran", "yueban")
//    names
//            .filter { !it.startsWith("y") }
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }


//    val p = Person("alice", 4)
////    val (name, age) = p // error
//    val model = Model("apple", 10)
//    val (title, count) = model
//    println("(title: $title, age: $count)")


//    val map = HashMap<String, Int>()
//    map["alice"] = 4
//    map["ranran"] = 5
//    map["emma"] = 3
//    for ((k, v) in map) {
//        println("($k, $v)")
//    }


//    for (i in 1..5) {
//        print("$i ")
//    }
//    println()
//    for (i in 1 until 5) {
//        print("$i ")
//    }


//    // read-only list
//    val list = listOf("a", "b", "c")
//    println(list[0])
//    list[0] = "b"


//    // read-only map
//    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//    println(map["a"])
//    map["a"] = 2


//    // Lazy property
//    val p: String by lazy {
//        val s = "abc"
//        val b = 111
//        s + b
//    }
//    println(p)


//    // extension function
//    fun String.getFirstChar(): Char {
//        return toCharArray()[0]
//    }
//
//    val c = "abc".getFirstChar()
//    println(c)


//    val files = File("test").listFiles()
////    println(files.size)
//    println(files?.size)
//    println(files?.size ?: "empty")


//    val list = emptyList<String>()
////    val list = listOf("file_A", "file_B")
//    val first = list.firstOrNull() ?: "empty"
//    println(first)


//    val map = mapOf("a" to 1)
//    val b = map["b"] ?: throw IllegalStateException("b is missing")


//    // execute if not null
//    val files = File("test").listFiles()
////    val files = listOf("file_A", "file_B")
//    files?.let {
//        println(it.size)
//    }


////    val s: String? = null
//    val s: String? = "1"
//    val i = s?.let { it.toInt() } ?: 0
//    println(i)


//    tryCatchExpression()


//    ifExpression(3)


//    builderStyleUsage(3)


//    singleExpression()


//    val shape = Shape("rectangle", Color.RED.rgb)
//    with(shape) {
//        val s = toString()
//        val code = hashCode()
//        println(s)
//        println(code)
//    }


//    val stream = Files.newInputStream(Paths.get("src/GetStarted.kt"))
//    stream.buffered().reader().use { it -> println(it.readText()) }


//    inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)


//    val b: Boolean? = null
//    val result = if (b == true) {
//        "true"
//    } else {
//        "false or null"
//    }
//    println(result)
}

data class Shape(val shape: String, val color: Int)

fun singleExpression() = println("single expression")

fun builderStyleUsage(size: Int) {
    val a = IntArray(size).apply { fill(-1) }
    for (i in a) {
        print("$i ")
    }
}

fun ifExpression(i: Int) {
    val result = if (i == 0) {
        "zero"
    } else if (i == 1) {
        "one"
    } else {
        "other"
    }
    println(result)
}

fun tryCatchExpression() {
    val result = try {
        2 / 0
    } catch (e: ArithmeticException) {
        0
//        throw IllegalStateException(e)
    }
    println(result)
}

// Singleton class
object Resource {
    val name = "Name"
}

class Person(val name: String, val age: Int)

data class Model(val title: String, val count: Int)

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not a string"
            else -> "Unknown"
        }


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

fun printTopLevelValue() {
    println("top_level_var: $top_level_var")
    println("top_level_val: $top_level_val")
}

fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun multiply(a: Int, b: Int) = a * b

fun sum(a: Int, b: Int): Int {
    return a + b
}