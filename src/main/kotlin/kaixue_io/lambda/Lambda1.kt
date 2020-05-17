package kaixue_io.lambda

fun b(param: Int): String {
    return param.toString()
}

fun main() {
    val s = (::b)(1)
    val s2 = (::b).invoke(2)
    println("s: $s")
    println("s2: $s2")

// 错误: val d = ::b
// d 是对象，b 是函数，必须通过 ::b 得到一个对象赋值给 d
    val d = ::b
// 错误: val e = ::d
// 因为 d 已经是对象，即 ::b，所以不再需要加冒号为 ::d
    val e = d

    println(d)
}
