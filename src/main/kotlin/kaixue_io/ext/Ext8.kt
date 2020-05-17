package kaixue_io.ext

fun String.method4(i: Int) {
}

val g: (String, Int) -> Unit = String::method1

fun main() {
    "123".method4(1)
//    "123".g(1) // wrong
}