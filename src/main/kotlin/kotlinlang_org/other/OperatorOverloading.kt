package kotlinlang_org.other

import java.awt.Point

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    val p = Point(1, 2)
//    println(-p)


    /********** demo 2 **********/
//    var p1 = Point(1, 2)
//    println(p1++)
//    println(p1)
//
//    var p2 = Point(1, 2)
//    println(++p2)
//    println(p2)


    /********** demo 3 **********/
//    val p1 = Point(1, 2)
//    val p2 = Point(3, 4)
//    println(p1 + p2)
//    println(p1 - p2)
//    println(p1 * p2)
//    println(p1 / p2)
//    println(p1 % p2)
//    println(p1..p2)
//    println(p1 in p2)
//    println(p1[1])
//    println(p1())
//    println(p1 == p2)
//    println(p1 < p2)
}

/********** demo 1 **********/
operator fun Point.unaryMinus() = Point(-x, -y)


/********** demo 2 **********/
operator fun Point.inc() = Point(x + 1, y + 1)


/********** demo 3 **********/
operator fun Point.plus(p: Point) = Point(x + p.x, y + p.y)

operator fun Point.minus(p: Point) = Point(x - p.x, y - p.y)

operator fun Point.times(p: Point) = Point(x * p.x, y * p.y)

operator fun Point.div(p: Point) = Point(x / p.x, y / p.y)

operator fun Point.rem(p: Point) = Point(x % p.x, y % p.y)

operator fun Point.rangeTo(p: Point) = "rangeTo function for Point"

operator fun Point.contains(p: Point) = println("contains function for Point") is Any

operator fun Point.get(inedx: Int) = "get function for Point"

operator fun Point.invoke() = "invoke function for Point"

// not allowed, cause Point already has a plus operator, kotlin will generate a plusAssign function automatically
//operator fun Point.plusAssign(p: Point) = Point(x + p.x, y + p.y)

// not allowed, can't overload
//operator fun Point.equals(p: Point) = (x == p.x) && (y = p.y)

operator fun Point.compareTo(p: Point) =
        (if (println("compareTo function for Point") is Any) 0 else 0) + (x - p.x) + (y - p.y)
