package other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    val a = String::class
//    println(a)
//    println(a.java)
//
//    val b = CRef1::class
//    println(b)
//    println(b.java)


    /********** demo 2 **********/
//    val a: CharSequence = "123"
//    println(a::class)


    /********** demo 3 **********/
//    fun isOdd(x: Int) = x % 2 != 0
//
//    var numbers = listOf(1, 2, 3)
//    numbers = numbers.filter(::isOdd)
//    println(numbers)
//
//    fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"
//    numbers.filter(::isOdd) // refers to isOdd(x: Int)
//    val predicate: (String) -> Boolean = ::isOdd // refers to isOdd(s: String)


    /********** demo 4 **********/
//    val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty
//    println(isEmptyStringList)


    /********** demo 5 **********/
//    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
//        return { x -> f(g(x)) }
//    }
//
//    fun isOdd(x: Int) = x % 2 != 0
//    fun length(s: String) = s.length
//    val oddLength = compose(::isOdd, ::length)
//    val strings = listOf("a", "ab", "abc")
//    println(strings.filter(oddLength))


    /********** demo 6 **********/
//    println(::x.get())
//    println(::x.name)
//    println(::y.set(1))
//    println(y)


    /********** demo 7 **********/
//    val strs = listOf("a", "ab", "abc")
//    println(strs.map(String::length))


    /********** demo 8 **********/
//    class A(val p: Int)
//
//    val prop = A::p
//    println(prop.get(A(1)))


    /********** demo 9 **********/
//    println(String::lastChar.get("abc"))


    /********** demo 10 **********/
//    class A(val p: Int)
//
//    println(A::p.javaGetter)
//    println(A::p.javaField)
//    println(A::p.javaClass)
//    println(A::p.javaClass.kotlin)


    /********** demo 11 **********/
//    class Foo
//
//    fun function(factory: () -> Foo) {
//        val x: Foo = factory()
//    }
//
//    function(::Foo)


    /********** demo 12 **********/
//    val numberRegex = "\\d+".toRegex()
//    println(numberRegex.matches("29"))
//
//    val isNumber = numberRegex::matches
//    println(isNumber("29"))
//
//    val strs = listOf("123", "abc")
//    println(strs.filter(isNumber))


    /********** demo 13 **********/
//    val prop = "abc"::length
//    println(prop.get())


    /********** demo 14 **********/
//    class Outer {
//        inner class Inner
//    }
//
//    val o = Outer()
//    val innerConstructor = o::Inner
//    println(innerConstructor())
}

/********** demo 1 **********/
class CRef1


/********** demo 6 **********/
val x = 1
var y = 2


/********** demo 9 **********/
val String.lastChar: Char
    get() = this[length - 1]