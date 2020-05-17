package kotlinlang.other

fun main(args: Array<String>) {
}

class CThis {
    fun pritnlnSelf() {
        println(this) // call from inner
    }

    inner class A {
        fun Int.foo() {
            val a = this@CThis
            val b = this@A
            val c = this
            val c1 = this@foo

            val funLit = fun String.() {
                val d = this
            }

            val funLit2 = { s: String ->
                val d1 = this
            }
        }
    }
}