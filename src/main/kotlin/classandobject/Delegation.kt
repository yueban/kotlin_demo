package classandobject

fun main(args: Array<String>) {
//    val a = BaseClassDelegation1(5)
//    ClassDelegation1(a).println()
//    ClassDelegation1(a).print()


    val a = BaseClassDelegation2()
    val o = ClassDelegation2(a)
    o.printMsg()
    println(o.msg)
}

/********** demo 1 **********/
interface IDelegation1 {
    fun print()
    fun println()
}

class BaseClassDelegation1(val x: Int) : IDelegation1 {
    override fun print() {
        print(x)
    }

    override fun println() {
        println(x)
    }
}

class ClassDelegation1(o: IDelegation1) : IDelegation1 by o {
    override fun print() {
        print("ClassDelegation1 print")
    }
}

/********** demo 2 **********/
interface IDelegation2 {
    val msg: String
    fun printMsg()
}

class BaseClassDelegation2 : IDelegation2 {
    override val msg: String = "BaseClassDelegation2"
    override fun printMsg() {
        println(msg)
    }
}

class ClassDelegation2(o: BaseClassDelegation2) : IDelegation2 by o {
    override val msg: String = "ClassDelegation2"
}