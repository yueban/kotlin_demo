package kotlinlang_org.classandobject

fun main(args: Array<String>) {
//    val d1 = ClassData1("yueban")
//    println(d1.copy())
//    println(d1.toString())
//
//    val d2 = ClassData1("yueban")
//    d1.age = 10
//    d2.age = 20
//    println(d1 == d2)


//    val d = ClassData2("yueban", 25, 5)
//    println(d.copy(age = 2))

//    val (n, a, g) = d
//    println("n: $n, a:$a, g: $g")
}

/**
 * only "name" will be used in toString(), equals(), hasCode(), copy()
 */
data class ClassData1(val name: String) {
    var age: Int = 0
}


data class ClassData2(val name: String, val age: Int, val grade: Int)