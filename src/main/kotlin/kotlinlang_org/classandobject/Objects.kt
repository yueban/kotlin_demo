package kotlinlang_org.classandobject

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.util.*
import javax.swing.JComponent
import kotlin.collections.ArrayList


fun main(args: Array<String>) {
//    Window().setMouseListener(object : MouseListener {
//        override fun mouseClicked() {
//            println("mouse clicked")
//        }
//
//        override fun mouseMoved() {
//            println("mouse moved")
//        }
//    })


//    val a = object : ClassObj1(1), InterfaceObj {
//        override fun f() {
//        }
//    }
//    println(a.javaClass.superclass.name)


    /********** demo 3 **********/
//    val o = object {
//        var x: Int = 1
//        var y: Int = 2
//    }
//    println("${o.x}, ${o.y}")


//    ClassObj2().test()


//    ObjectClass.registerObserver(object : Observer {
//        override fun update(o: Observable?, arg: Any?) {
//        }
//    })
//    println(ObjectClass.allObservers.size)

//    SubObjectClass.mouseClicked()


//    val a1 = ClassCompanion1.Factory.create()
//    val a2 = ClassCompanion1.create()
//    val b1 = ClassCompanion2.Companion.create()
//    val b2 = ClassCompanion2.create()


    val a = ClassCompanion3.create()
}

/********** demo 1 **********/
interface MouseListener {
    fun mouseClicked()
    fun mouseMoved()
}

class Window {
    private var listener: MouseListener? = null

    fun setMouseListener(listener: MouseListener) {
        this.listener = listener
    }
}

/********** demo 2 **********/
interface InterfaceObj {
    fun f()
}

open class ClassObj1(x: Int) {
    open val y: Int = x
}

/********** demo 4 **********/
class ClassObj2 {
    private fun f() = object {
        val x: String = "2"
    }

    fun g() = object {
        val x: Int = 1
    }

    fun test() {
        val f = f()
        val g = g()
        println(f.javaClass.name)
        println(g.javaClass.name)
        f.x // can access, cause private fun return object-type is anonymous-class-type
//        g.x // cannot access, cause public fun return object-type is Any
    }
}

/********** demo 5 **********/
/**
 * different from java.
 * anonymous-class-object can access local variable.
 * not only the final variable.
 *
 * 实现思路：
 * 将 clickCount 封装为一个 final Refer<Int>(clickCount)，
 * 以在匿名类内部通过 Refer<Int>.get() 访问 clickCount
 *
 * 具体细节可以查看 kotlin 字节码反编译的 java 代码
 */
fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseEntered(e: MouseEvent?) {
            enterCount++
        }

        override fun mouseClicked(e: MouseEvent?) {
            clickCount++
        }
    })
}

/********** demo 6 **********/
object ObjectClass {
    fun registerObserver(observer: Observer) {
        allObservers.add(observer)
    }

    val allObservers: ArrayList<Observer> = ArrayList()
}

object SubObjectClass : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }
}

/********** demo 7 **********/
class ClassCompanion1 {
    companion object Factory {
        fun create(): ClassCompanion1 =
            ClassCompanion1()
    }
}

class ClassCompanion2 {
    companion object {
        fun create(): ClassCompanion2 =
            ClassCompanion2()
    }
}

/********** demo 8 **********/
interface InterfaceFactory<T> {
    fun create(): T
}

class ClassCompanion3 {
    companion object :
        InterfaceFactory<ClassCompanion3> {
        override fun create(): ClassCompanion3 =
            ClassCompanion3()
    }
}

/********** demo 9 **********/
/**
 * object expression 和 object declaration 的区别：
 * - object expression 是表达式，在执行时就初始化
 * - object declaration 是声明，在第一次被调用（引用）时初始化，类似 java 的 static
 */
