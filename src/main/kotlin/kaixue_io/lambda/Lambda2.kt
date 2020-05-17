package kaixue_io.lambda

fun a(funParam: (Int) -> String): String {
    return funParam(1)
}

fun main() {
    val a = a(fun(param: Int): String {
        return param.toString()
    })

    println("a: $a")

    val d = fun(param: Int): String {
        return param.toString()
    }

    val a1 = a(d)
    println("a1: $a1")


    val a2 = a({ param -> param.toString() })
    val a3 = a { param -> param.toString() }
    println("a2: $a2")
    println("a3: $a3")
}
