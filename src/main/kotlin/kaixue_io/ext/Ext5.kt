package kaixue_io.ext


fun String.method1(param: Int) {
    println(param)
}

val a: String.(Int) -> Unit = String::method1

fun main() {
    "123".a(1)
    Ext5().b("1", 2)
}

class Ext5 {
    /**
     * 可以对比 [Ext4.test] 理解
     */
    val b: (String, Int) -> Unit = String::method1

    fun test() {
        b("1", 2)
    }
}