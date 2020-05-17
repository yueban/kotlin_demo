package kaixue_io.basic

fun main() {
    /*val arr1 = arrayOfNulls<CharSequence>(1)
    println(arr1.contentToString())
    fill(arr1, "123123")
    println(arr1.contentToString())*/


    val arr2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arr3 = arrayOfNulls<Number>(5)
    println(arr3.contentToString())
    copy(arr2, arr3)
    println(arr3.contentToString())
}

fun <T> fill(arr: Array<in T>, t: T) {
    arr[0] = t
}

fun <T> copy(source: Array<out T>, dest: Array<in T>) {
    for (item in source.withIndex()) {
        dest[item.index] = item.value
    }
}