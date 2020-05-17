package kaixue_io.ext

class Ext2 {
    fun String.test(i: Int) {
    }

    fun testExt() {
        "123".test(1)
    }

}

fun main() {
    // 不能调用
//    "123".test(1)
}