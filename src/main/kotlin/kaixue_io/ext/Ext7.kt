package kaixue_io.ext

fun method3(s: String, i: Int) {
}

val f: String.(Int) -> Unit = ::method3

fun main() {
//    "123".method3() // wrong
    "123".f(1)
}