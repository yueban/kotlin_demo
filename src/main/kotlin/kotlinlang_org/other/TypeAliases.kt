package kotlinlang_org.other

import java.io.File


fun main(args: Array<String>) {
    /********** demo 1 **********/
//    StringSet()
//    val t: FileTable<String>


    /********** demo 2 **********/
//    val a: MyHandler = { i, s, any -> print("$i $s $any") }
//    val b: Predicate<String> = { it.startsWith("a") }
}

/********** demo 1 **********/
typealias StringSet = HashSet<String>

typealias FileTable<K> = MutableMap<K, MutableList<File>>


/********** demo 2 **********/
typealias MyHandler = (Int, String, Any) -> Unit

typealias Predicate<T> = (T) -> Boolean


/********** demo 3 **********/
class CAliasA {
    inner class Inner
}

class CAliasB {
    inner class Inner
}

typealias AInner = CAliasA.Inner
typealias BInner = CAliasB.Inner