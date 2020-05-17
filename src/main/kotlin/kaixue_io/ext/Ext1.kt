package kaixue_io.ext

//val Float.dp
//    get() = TypedValue.applyDimension(
//        TypedValue.COMPLEX_UNIT_DIP,
//        this,
//        Resources.getSystem().displayMetrics
//    )

val Float.dp: Float
    get() = this * 2.5f

fun main() {
    println(2f.dp)
}