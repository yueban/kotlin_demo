package kotlinlang.classandobject


fun main(args: Array<String>) {
//    powerNum = 2
//    println(powerNum)

//    val a = PropertyAndField()
//    a.setterVisibility = "1"

//    lateinit var a: String
//    a.toInt()
}

var powerNum: Int = 1
    get() {
        return field + 0
    }
    set(value) {
        field = value * value
    }

val valPowerNum: Int = 1
    get() {
        return field + 0
    }
//    // setter not allowed for a val
//    set(value) {
//        field = value * value
//    }

class PropertyAndField {
    var setterVisibility: String = "abc"
        private set
}

//const val constStr = "constStr"
//    get() = {
//        return field
//    }


