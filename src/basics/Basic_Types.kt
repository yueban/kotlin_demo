package basics

fun main(args: Array<String>) {
//    println(123.javaClass.name)
//    println(123L.javaClass.name)
//    println(1.23.javaClass.name)
//    println(1.23f.javaClass.name)
//    println(0b11)
//    println(0x11)
//    println(0b1111_1111) // with underscores


//    val a = 10000
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//    println(a === a)
//    println(a === boxedA)
//    println(boxedA === anotherBoxedA)
//    println(boxedA == anotherBoxedA)


//    val a = 1
////    val b = a
//    val b = a.toLong()
//    println(b == a)


//    val l = 1L + 3
//    println(l.javaClass.name)


//    var b = 0b1100 and 0b1111
//    println(Integer.toBinaryString(b))
//    b = 0b1100 or 0b1111
//    println(Integer.toBinaryString(b))
//    b = 0b1100 xor 0b1111
////    b = 0b1100.xor(0b1111)
//    println(Integer.toBinaryString(b))
//    b = 0b1100.inv()
//    println(Integer.toBinaryString(b))
//    b = 0b1100.shl(1)
//    println(Integer.toBinaryString(b))
//    b = 0b1100.shr(1)
//    println(Integer.toBinaryString(b))
//    b = 0b1100.ushr(1)
//    println(Integer.toBinaryString(b))


//    val a = 'a'
////    println(a == 1)
//    println(a == '1')


//    println(basics.decimalDigitValue('1'))


//    println(true || false)
//    println(true && false)
//    println(!true)


//    val a1 = arrayOf(1, 2, 3)
//    println(Arrays.toString(a1))
//    val a2 = arrayOfNulls<String>(5)
//    println(Arrays.toString(a2))
//    val a3 = Array(5, { i -> (i * i).toString() })
//    println(Arrays.toString(a3))
//    val a4: BooleanArray = booleanArrayOf(true, false, true)
//    println(Arrays.toString(a4))
//    val a5: IntArray = intArrayOf(1, 3, 4)
//    println(Arrays.toString(a5))


//    val str = "abcde"
//    println(str[0].javaClass.name)
//    for (c in str) {
//        print("$c ")
//    }

//    println("a" + 1)
////    println(1 + "a")


    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
    println(text)
    println(text.trimMargin())
    println(text.trimMargin(">"))
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out of range")
    }
    return c.toInt() - '0'.toInt()
}