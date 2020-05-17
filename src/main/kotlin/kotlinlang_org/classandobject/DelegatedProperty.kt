package kotlinlang_org.classandobject

import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
//    val a = ClassDelegateProp()
//    println(a.x)
//    a.x = "s"


//    println(lazyValue)
//    println(lazyValue)


//    val a = ClassObservableProp()
//    a.valueObservable = "ranran"
//    a.valueObservable = "alice"
//
//    a.valueVetoable = "ranran"
//    a.valueVetoable = "alice"


//    val a = ClassMap1(mapOf(
//            "value1" to "ranran",
//            "value2" to 4
//    ))
//    println(a.value1)
////    a.value1 = "alice" // cannot modified
//    println(a.value2)
//
//    val b = ClassMap2(mutableMapOf(
//            "value1" to "ranran",
//            "value2" to 4
//    ))
//    println(b.value1)
//    println(b.value2)
//    b.value1 = "alice"
//    println(b.value1)


//    lazyLocalFun { 2 }


//    val ui = MyUI()
//    println(ui.text)
//    println(ui.image)



}

/********** demo 1 **********/
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class ClassDelegateProp {
    var x: String by Delegate()
}

/********** demo 2 **********/
val lazyValue: String by lazy {
    println("lazy block")
    "boom!"
}

/********** demo 3 **********/
class ClassObservableProp {
    var valueObservable: String by Delegates.observable("empty") { property, oldValue, newValue ->
        println("property ${property.name} changed from $oldValue to $newValue")
    }

    var valueVetoable: String by Delegates.vetoable("empty") { property, oldValue, newValue ->
        val accepted = newValue.startsWith("ran")
        val str = if (accepted) "accepted" else "refused"
        println("$str: property ${property.name} changed from $oldValue to $newValue")
        accepted
    }
}

/********** demo 4 **********/
class ClassMap1(val map: Map<String, Any?>) {
    val value1: String by map
    val value2: Int by map
}

class ClassMap2(val map: MutableMap<String, Any?>) {
    var value1: String by map
    var value2: Int by map
}

/********** demo 5 **********/
fun lazyLocalFun(computeFoo: () -> Int) {
    val a by lazy(computeFoo)

    // a is not init
    if (System.currentTimeMillis() % 2 == 0L) {
        println("memoizedFoo is $a") // a will be init at here, on the first access
    }
}

/********** demo 6 **********/
class ResourceID<T>(val value: T) {
    companion object {
        val text_id = ResourceID(111)
        val image_id = ResourceID("image_1")
    }
}

class ResourceDelegate<T>(val value: T) : ReadOnlyProperty<MyUI, T> {
    override fun getValue(thisRef: MyUI, property: KProperty<*>): T {
        println("$thisRef -> ${property.name}")
        return value
    }
}

class ResourceLoader<T>(val id: ResourceID<T>) {
    operator fun provideDelegate(
        thisRef: MyUI,
        prop: KProperty<*>
    ): ReadOnlyProperty<MyUI, T> {
        checkProperty(thisRef, prop.name)
        // create delegate
        return ResourceDelegate(id.value)
    }

    private fun checkProperty(thisRef: MyUI, name: String) {
        // check if property is valid
        if (name.startsWith("image")) {
            throw Exception("Image not supported at $thisRef")
        }
    }
}

class MyUI {
    fun <T> bindResource(id: ResourceID<T>): ResourceLoader<T> {
        return ResourceLoader(id)
    }

    val text by bindResource(ResourceID.text_id)
    val image by bindResource(ResourceID.image_id)
}