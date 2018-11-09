package classandobject

fun main(args: Array<String>) {
//    val a = ClassImplA()
//    a.f()
//    a.g()


//    ClassImplB().f()


//    val s = Stuff("ban", "yue", "Android Developer")
//    println(s)


    val c = ClassImplC()
    c.f()
    c.g()
}

interface InterfaceA {
    fun f()
    fun g() {
        println("func g")
    }
}

class ClassImplA : InterfaceA {
    override fun f() {
        println("override func f")
    }
}

interface InterfaceB {
    val prop: Int
    val propWithImpl: String
        get() = "prop with impl"

    fun f() {
        println("prop: $prop")
        println("propWithImpl: $propWithImpl")
    }
}

class ClassImplB : InterfaceB {
    override val prop: Int
        get() = 12
}

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String
        get() = "$firstName $lastName"
}

data class Stuff(override val firstName: String, override val lastName: String, val title: String) : Person

interface InterfaceC {
    fun f() {
        println("InterfaceC: fun f")
    }

    fun g()
}

interface InterfaceD {
    fun f() {
        println("InterfaceD: fun f")
    }

    fun g() {
        println("InterfaceD: fun g")
    }
}

class ClassImplC : InterfaceC, InterfaceD {
    override fun f() {
        super<InterfaceC>.f()
        super<InterfaceD>.f()
    }

    override fun g() {
        // can't be access
//        super<InterfaceC>.g()
        super<InterfaceD>.g()
    }
}