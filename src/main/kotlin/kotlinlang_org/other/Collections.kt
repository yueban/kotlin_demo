package kotlinlang_org.other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
//    val readOnlyViews: List<Int> = numbers
//    println(numbers)
//    numbers.add(4)
//    println(readOnlyViews)
////    readOnlyViews.add(4) // not allowed
////    readOnlyViews.clear() // not allowed
//    numbers.clear()
//
//    val strings = hashSetOf("a", "c", "b", "c")
//    assert(strings.size == 3)


    /********** demo 2 **********/
//    val items = listOf(1, 2, 3) // full immutable list


    /********** demo 3 **********/
//    val imRects: List<Rectangle> = listOf()
//    val imShapes: List<kotlinlang.Shape> = imRects
//
//    val rects: MutableList<Rectangle> = mutableListOf()
//    val shapes: MutableList<kotlinlang.Shape> = rects // not allowed


    /********** demo 4 **********/
//    val _items = mutableListOf<String>()
//    val items = _items.toList() // get a immutable snapshot


    /********** demo 5 **********/
//    val items = listOf(1, 2, 3, 4)
//    println(items.first() == 1)
//    println(items.last() == 4)
//    println(items.filter { it % 2 == 0 })
//
//    val rwList = mutableListOf(1, 2, 3)
//    rwList.requireNoNulls()
//    if (rwList.none { it > 6 }) {
//        println("No items larger than 6")
//    }
//    val item = rwList.firstOrNull()


    /********** demo 6 **********/
//    val readWriteMap = hashMapOf("ranran" to 5, "alice" to 4)
//    println(readWriteMap["ranran"])
//    val snapShop: Map<String, Int> = HashMap(readWriteMap)
}