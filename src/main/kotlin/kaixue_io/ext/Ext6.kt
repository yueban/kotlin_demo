package kaixue_io.ext

val b: (String, Int) -> Unit = String::method1
val c: String.(Int) -> Unit = b
val d: (String, Int) -> Unit = a