package classandobject


fun main(args: Array<String>) {
    Outer1.Nested().f()


    Outer2().Inner().f()
}

/********** demo 1 **********/
class Outer1 {
    private val a: Int = 1

    class Nested {
        fun f() = 2
        fun g() {
//            return a // cannot access
        }
    }
}

/********** demo 2 **********/
class Outer2 {
    private val a = 1

    inner class Inner {
        fun f() = 2
    }
}

/********** demo 3 **********/
interface ActionListener {
    public fun f()
}

val listener = object : ActionListener {
    override fun f() {
    }
}