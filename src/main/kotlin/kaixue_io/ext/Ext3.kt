package kaixue_io.ext

fun Float.testExt(param: String) {
    println(param)
}

fun main() {
    1.toFloat()
    (Int::toFloat)(1) // 等价于 1.toFloat()
    Int::toFloat.invoke(1) // 等价于 1.toFloat()
//    1.toFloat.invoke() // 报错

    1f.testExt("1")
    Float::testExt.invoke(1f, "2")
    (Float::testExt)(1f, "3")
}