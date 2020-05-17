package kotlinlang.basics

fun main(args: Array<String>) {
//    println(max(2, 3))


//    println(testWhen(1))
//    println(testWhen(3))
//    println(testWhen(4))
//    println(testWhen(5))
//    println(testWhen(11))
//    println(testWhen("10"))


//    println(hasPrefix("prefix_1"))
//    println(hasPrefix("1"))


//    val x = 6
//    when {
//        x > 5 -> println("x is larger than 5")
//        x < 5 -> println("x is smaller than 5")
//        else -> println("x is 5")
//    }


//    when (val value = getIntOrString()) {
//        is Int -> println("get an Int")
//        is String -> println("get a String")
//    }


//    val a = arrayOf("a", "b", "c", "d", "e")
//    for (i in a.indices) {
//        print("${a[i]} ")
//    }
//    println()
//    for ((index, value) in a.withIndex()) {
//        println("$index : $value")
//    }


    do {
        val y = getIntOrString()
        println("try to getInt")
    } while (y is Int)
}

fun getIntOrString(): Any {
    return if (System.currentTimeMillis() % 2 == 0L) 1 else "1"
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun testWhen(x: Any): String {
    return when (x) {
        1 -> "one"
        2 -> "two"
        is Boolean, 3 -> "boolean or 3"
        "4".toInt() -> "four"
        in 1..10 -> "in 1~10"
        is Int -> x.toString()
        else -> "Unknown"
    }
}

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}