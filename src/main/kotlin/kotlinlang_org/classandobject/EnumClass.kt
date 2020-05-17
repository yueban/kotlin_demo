package kotlinlang_org.classandobject

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main(args: Array<String>) {
//    println(Direction.NORTH)
//    println(Direction.NORTH.javaClass.name)
//    println(Direction.NORTH.name)
//    println(Direction.NORTH.name.javaClass.name)
//    println(Direction.NORTH.ordinal)


//    println(Color.RED.rgb)


//    println(ProtocolState.WAITING)
//    println(ProtocolState.WAITING.signal())
//    println(ProtocolState.WAITING.signal().signal())
//    println(ProtocolState.WAITING.signal().signal().signal())


//    println(IntArithmetics.PLUS.applyAsInt(3, 4))
//    println(IntArithmetics.TIMES.apply(3, 4))


//    printAllValues<RGB>()
}

/********** demo 1 **********/
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

/********** demo 2 **********/
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
}

/********** demo 3 **********/
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING

    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

/********** demo 4 **********/
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

/********** demo 5 **********/
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}