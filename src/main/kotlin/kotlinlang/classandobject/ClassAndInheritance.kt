package kotlinlang.classandobject

fun main(args: Array<String>) {
//    Class1("yueban")
//    Class2()
//    Class3("yueban", 11)
//    Class4("yueban")

//    SubClass2_1().f()
//    SubClass3_1().printX()
//
//    SubClass4_1().printX()
//    SubClass4_2().printX()

//    SubClass5_1("yueban", "alice")

//    SubClass6_1().f()

//    C().f()

//    SubClass8_2().f()
}

/**
 * Primary constructor & init block
 */
class Class1(name: String) {
    init {
        println("init_hahaha")
    }

    init {
        println("name: $name")
    }
}

/**
 * if use 'modifier' or 'annotation', 'constructor' must be declare
 */
class Class2 public constructor()

/**
 * Secondary constructor
 */
class Class3(name: String) {
    constructor(name: String, age: Int) : this(name) {
        println("name: $name, age: $age")
    }
}

/**
 * Secondary constructor with init block
 */
class Class4 {
    init {
        println("init block")
    }

    constructor(name: String) {
        println("name: $name")
    }
}

/**
 * constructor with default value (check the java code)
 */
class Class5(val name: String = "yueban", val age: Int = 25)


/********** inherit **********/

/********** demo 1 **********/
open class OpenClass1(name: String)

class SubClass1_1(name: String, grade: Int) : OpenClass1(name)

class SubClass1_2 : OpenClass1 {
    constructor(name: String, grade: Int) : super(name)
}

/********** demo 2 **********/
open class OpenClass2 {
    open fun f() {
        println("function f")
    }

    fun nv() {
        println("function nf")
    }
}

class SubClass2_1() : OpenClass2() {
    // can't be override by its subclass
    final override fun f() {
        println("function f override")
    }

////    can't be override
//    override fun f() {
//        super.f()
//    }
}

class NotOpenClass {
    //    'open' has no effect in a final class
    open fun f() {

    }
}

/********** demo 3 **********/
open class OpenClass3 {
    open val x = "x"

    init {
        // non-final property is null in init block
        println(x)
    }

    fun printX() {
        println(x)
    }
}

class SubClass3_1 : OpenClass3() {
    override val x: String = "x override"
}

/********** demo 4 **********/
open class OpenClass4 {
    open val x: String = "x"

    fun printX() {
        println(x)
    }
}

class SubClass4_1 : OpenClass4() {
    override var x: String = "x override as var"
}

class SubClass4_2(override val x: String = "x override by constructor") : OpenClass4()

/********** demo 5 **********/
open class OpenClass5(val name: String) {
    open val size: Int = name.length.also { println("parent: init val size: $it") }

    init {
        println("parent: init block")
    }
}

class SubClass5_1(name: String, lastName: String) : OpenClass5(name.capitalize().also {
    println("sub: primary constructor for parent: $it")
}) {
    init {
        println("sub: init block")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("sub: init override val size: $it")
    }
}

/********** demo 6 **********/
open class OpenClass6 {
    open fun f() {
        println("parent func f")
    }
}

class SubClass6_1 : OpenClass6() {
    override fun f() {
        super.f()
        println("sub func f")
        InnerClass().g()
    }

    inner class InnerClass {
        fun g() {
            println("inner func g")
            super@SubClass6_1.f()
        }
    }
}

/********** demo 7 **********/
open class A {
    open fun f() {
        println("A")
    }
}

interface B {
    // interface members are 'open' by default
    fun f() {
        println("B")
    }
}

class C : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

/********** demo 8 **********/
open class OpenClass8 {
    open fun f() {

    }
}

abstract class SubClass8_1 : OpenClass8() {
    abstract override fun f()
}

class SubClass8_2 : SubClass8_1() {
    override fun f() {
        println("func f")
    }

}