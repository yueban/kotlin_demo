package classandobject

/********** package level (top-level) **********/
private fun f() {} // visible only inside VisibilityModifier.kt

// by default, top-level members has the "public" visibility modifier
// which means visible everywhere
public var str: String = "5"
    // get always has the same visibility with the property
    get() {
        return field + ""
    }
    // only access in VisibilityModifier.kt
    private set(value) {
        field = value + ""
    }

internal val str2 = "" // visible in same module

//protected val a = 1 // top-level members can't use protected


/********** inside Class and interface **********/
open class VisibilityModifier {
    val a = 1 // public by default
    protected open val b = 2 // visible in class and subclass
    private val c = 3 // visible in class
    internal val d = 4 // like public, but only visible in module

    protected class Nested {
        public val e: Int = 5
    }
}

class SubVisibilityModifier : VisibilityModifier() {
    override val b = 10

    fun f() {
        println(a)
        println(b)
//        println(c) // can't access
        println(d)
        println(Nested().e)
    }
}

class DelegateVisibilityModifier(val o: VisibilityModifier) {
    fun f() {
        println(o.a)
//        println(o.b) // can't access
//        println(o.c) // can't access
        println(o.d)
//        println(VisibilityModifier.Nested) // can't access
    }
}


/********** constructor **********/
class ClassConstrucor1 private constructor() // visible only in VisibilityModifier.kt

class ClassConstrucor2 protected constructor() // same as private

class ClassConstrucor3 internal constructor() // visible in module