package kotlinlang_org.functionandlambda

import java.awt.Button

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    val items = listOf(1, 2, 3, 4, 5)
//    items.fold(0) { acc, i ->
//        println("acc: $acc, i: $i")
//        val result = acc + i
//        println("result: $result")
//        result
//    }
//
//    val joinedToString = items.fold("Elements:") { acc, i ->
//        "$acc $i"
//    }
//    println(joinedToString)
//
//    val product = items.fold(1, Int::times)
//    println(product)


    /********** demo 3 **********/
//    setClickHandler { button, clickEvent ->
//        println("$button, $clickEvent")
//    }


    /********** demo 4 **********/
//    // create by lambda
//    funLambda5 { i -> println(i) }
//    // create by anonymous function
//    funLambda5(fun(i: Int) {
//        println(i)
//    })


    /********** demo 5 **********/
//    val intPlus: Int.(Int) -> Int = Int::plus
//    val items = listOf(1, 2, 3, 4, 5)
////    val product = items.fold(1, { acc, i ->
////        acc.times(i)
////    })
//    // equals to above
//    val product = items.fold(1, Int::times)


    /********** demo 8 **********/
//    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
//    val twoParameters: (String, Int) -> String = repeatFun // works
//
//    fun runTransformation(f: (String, Int) -> String): String {
//        return f("hello", 3)
//    }
//
//    val result = runTransformation(repeatFun) // works
//    println(result)


    /********** demo 9 **********/
//    val stringPlus: (String, String) -> String = String::plus
//    val intPlus: Int.(Int) -> Int = Int::plus
//
//    println(stringPlus.invoke("1", "2"))
//    println(stringPlus("1", "2"))
////    println("1".stringPlus("2")) // not allowed
//
//    println(intPlus.invoke(1, 2))
//    println(intPlus(1, 2))
//    println(1.intPlus(2))


    /********** demo 10 **********/
//    val kotlinlang.sum: (Int, Int) -> Int = { x, y -> x + y }
//    val lambda1: (Int) -> String = { x -> x.toString() }
//    val lambda2: (Int) -> String = { x ->
//        x.toString() + "2"
//        "1" // last expression treated as the return value
//    }


    /********** demo 11 **********/
//    fun funLambda(f: (Int) -> Unit) {
//    }
//    funLambda(fun(i: Int) {
//        println(i)
//    })
//    funLambda() { i -> println(i) }
//    funLambda { i -> println(i) }
//    funLambda { println(it) }


    /********** demo 12 **********/
//    "abc".filter { it == 'a' }
//    "abc".filter { return@filter it == 'a' }


    /********** demo 13 **********/
//    val map = HashMap<Int, String>()
//    map.forEach { _, _ -> println() }


    /********** demo 14 **********/
//    "abc".filter(fun(it: Char): Boolean {
//        return it == 'c'
//    })
//    "abc".filter(fun(it: Char) = it == 'c')


    /********** demo 15 **********/
//    var kotlinlang.sum = 0
//    listOf(1, 2, 3).forEach {
//        kotlinlang.sum += it
//    }
//    println(kotlinlang.sum)


    /********** demo 16 **********/
//    val sum1: Int.(Int) -> Int = { other -> this.plus(other) }
//    val sum2: Int.(Int) -> Int = { other -> plus(other) }
//    val sum3 = fun Int.(other: Int): Int = this + other


    /********** demo 17 **********/
//    val a = html { body() }
//    println(a)
}

/********** demo 2 **********/
fun funLambda1(): (Int, Int) -> Int {
    return { _, _ -> 1 }
}

fun funLambda2(): (() -> Int)? {
    return null
}

fun funLambda3(): (Int) -> (Int) -> String {
    return { { "string" } }
}

// equals to funLambda3
fun funLambda4(): (Int) -> ((Int) -> String) {
    return { { "string" } }
}


/********** demo 3 **********/
class ClickEvent

typealias ClickHandler = (Button, ClickEvent) -> Unit

fun setClickHandler(handler: ClickHandler) {
    println("$handler")
}


/********** demo 4 **********/
fun funLambda5(f: (Int) -> Unit) {
}


/********** demo 6 **********/
class IntTransformer : (Int) -> Int {
    override fun invoke(p1: Int): Int = TODO("not implemented")
}

val initFunction: (Int) -> Int = IntTransformer()


/********** demo 7 **********/
val a = { i: Int -> i + 1 }


/********** demo 17 **********/
class HTML {
    fun body() {
        println("html body")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}