package javainterop

import java.util.*

fun main(args: Array<String>) {
    /********** demo 1 **********/
    fun demo(source: List<Int>) {
        val list = ArrayList<Int>()
        // 'for'-loops work for Java collections:
        for (item in source) {
            list.add(item)
        }
        // Operator conventions work as well:
        for (i in 0..source.size - 1) {
            list[i] = source[i] // get and set are called
        }
    }


    /********** demo 2 **********/
    fun calendarDemo() {
        val calendar = Calendar.getInstance()
        if (calendar.firstDayOfWeek == Calendar.SUNDAY) {
            calendar.firstDayOfWeek = Calendar.MONDAY
        }
        if (!calendar.isLenient) {
            calendar.isLenient = true
        }
    }


    /********** demo 3 **********/
//    val a = CallJavaFromKotlinDemo()
//    val result = a.`is`()
//    println(result)


    /********** demo 4 **********/
    val list = ArrayList<String>()
    list.add("Item")
    val size = list.size // kotlin Int
    val item = list[0] // java String
    item.substring(1) // may throw NPE when item == null


    /********** demo 5 **********/
    // java code:
    // @NotNull
    // Set<@NotNull String> toSet(@NotNull Collection<@NotNull String> elements) { …… }
    // ---
    // kotlin code:
    // fun toSet(elements: (Mutable)Collection<String>) : (Mutable)Set<String> { …… }

    // java code:
    // Set<String> toSet(Collection<String> elements) { …… }
    // ---
    // kotlin code:
    // fun toSet(elements: (Mutable)Collection<String!>) : (Mutable)Set<String!> { …… }


    /********** demo 6 **********/
//    CallJavaFromKotlinDemo().a // Foo<out Bar!>!
//    CallJavaFromKotlinDemo().b // Foo<in Bar!>!
//    CallJavaFromKotlinDemo().c // List<*>! (as well as List<out Any?>!)


    /********** demo 7 **********/
//    val a = CallJavaFromKotlinDemo()
//    a.removeIndices(IntArray(1))
//    a.removeIndices(intArrayOf(1, 2, 3))


    /********** demo 8 **********/
//    val a = CallJavaFromKotlinDemo()
//    a.removeIndicesVarArg(*intArrayOf(1, 2, 3))
//    a.removeIndicesVarArg(*IntArray(1))


    /********** demo 9 **********/
//    fun render(list: List<*>, to: Appendable) {
//        for (item in list) {
//            to.append(item.toString()) // Java will warning an IOException to catch
//        }
//    }


    /********** demo 10 **********/
//    if (Character.isLetter('1')) {
//    }
//
//    java.lang.Integer.bitCount(1)
}