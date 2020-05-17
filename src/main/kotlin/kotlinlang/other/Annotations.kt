//@file:JvmName("annoclass")

package kotlinlang.other

import kotlinlang.other.annotations.Ann
import kotlinlang.other.annotations.AnnWithArrayValue
import kotlinlang.other.annotations.AnnWithValue

fun main(args: Array<String>) {
    println(1)
}

/********** demo 1 **********/
@Target(
        AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.FIELD,
        AnnotationTarget.CONSTRUCTOR,
        AnnotationTarget.PROPERTY,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@MustBeDocumented
annotation class Anno1(val why: String = "some reason")

@Anno1("this is class")
class CAnno1 @Anno1("this is constructor") constructor(@Anno1 val x: Int) {
    @Anno1
    val a = 1
        @Anno1("this is getter") get() = field + 1

    @Anno1
    fun f() {
    }
}


/********** demo 2 **********/
annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
        val message: String,
        val replaceWith: ReplaceWith = ReplaceWith(
            ""
        )
)

class CAno2 {
    @Deprecated("this function is deprecated, use g instead",
        ReplaceWith("g")
    )
    fun f() {
    }
}


/********** demo 3 **********/
annotation class Anno2

val f = @Anno2 { println("func f") }


/********** demo 4 **********/
class CAnno2(@field:Anno1 val a: String, @get:Anno1 val b: String, @param:Anno1 val c: String)


/********** demo 5 **********/
class CAnno3 {
    @get:[Anno1 Anno2]
    var a = 1
}


/********** demo 6 **********/
class CAnno4 {
    // compatible with java
    @get:java.lang.Deprecated
    val tempFolder = 1
}


/********** demo 7 **********/
@Ann(intValue = 123, stringValue = "abc")
class CAnno5

@AnnWithValue("abc")
class CAnno6

@AnnWithArrayValue(names = ["a", "b", "c"])
class CAnno7

class CAnno8 {
    fun f(ann: Ann) {
        println(ann.intValue)
    }
}