package basics

fun main(args: Array<String>) {
//    printIfNotNull(1)
//    printIfNotNull(null)


//    loop@ for (i in 1..5) {
//        for (j in 1..3) {
//            if (i % 2 == 0) {
////                break@loop
//                continue@loop
//            }
//            println("i:$i j:$j")
//        }
//    }


    foo()
}

fun foo() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            print("$it ")
        }
    }
    println("end of foo()")
}

//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach(
//            fun(value: Int) {
//                if (value == 3) return
//                print("$value ")
//            }
//    )
//    println("end of foo()")
//}

//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return@forEach
//        print("$it ")
//    }
//    println("end of foo()")
//}

//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach lit@{
//        if (it == 3) return@lit
//        print("$it ")
//    }
//    println("end of foo()")
//}

//fun foo() {
//    listOf(1, 2, 3, 4, 5).forEach {
//        if (it == 3) return
//        print("$it ")
//    }
//    println("end of foo()")
//}

fun printIfNotNull(x: Any?) {
    val i = x ?: return
    println(i)
}