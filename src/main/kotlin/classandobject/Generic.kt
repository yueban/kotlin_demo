package classandobject

fun main(args: Array<String>) {
//    var a = GClass<Int>(1)


//    val l = singletonList(1)
//    print(l.toStringNewLine())


    sort(listOf(1, 2, 3))
    val l = listOf(1, 2, 3, 4, 5)
    val filteredL = filterNumber(l, 3)
    println(filteredL)
}

/********** demo 1 **********/
class GClass<T>(t: T) {
    var value = t
}

/********** demo 2 **********/
// <out T> 相当于 <? extends T>
interface GInterface1<out T> {
    fun next(): T
//    fun call(t: T)
}

fun testGInterface1(x: GInterface1<Double>) {
    val numbers: GInterface1<Number> = x
}

/********** demo 3 **********/
// <in T> 相当于 <? super T>
interface GInterface2<in T> {
    //    fun next(): T
    fun call(other: T): Int
}

fun testGInterface2_1(x: GInterface2<Number>) {
    x.call(1.0)
}

//fun testGInterface2_2(x: GInterface2<Double>) {
//    val numbers: GInterface2<Number> = x
//}

/********** demo 4 **********/
// 这里使用 in 关键字的特性，确保 from 中的数据仅被读取，防止被修改
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices) {
        to[i] = from[i]
//        from[i] = to[i] // not allowed
    }
}

// 这里使用 out 关键字的特性，说明 dest 只会被写入，可以接收 String 的超集，比如 Array<Object>
fun fill(dest: Array<in String>, value: String) {
    dest.fill(value)
}

fun testFill(x: Array<CharSequence>) {
    fill(x, "1")
}

/********** demo 5 **********/
fun <T> singletonList(item: T): List<T> {
    return listOf(item)
}

fun <T> T.toStringNewLine(): String {
    return "\n" + this.toString() + "\n"
}

/********** demo 6 **********/
fun <T : Comparable<T>> sort(list: List<T>) {
}

fun <T> filterNumber(list: List<T>, threshold: T): List<T>
        where T : Comparable<T>,
              T : Number {
    return list.filter { it > threshold }
}