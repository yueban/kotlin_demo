package kotlinlang.classandobject

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(
        expr.e2
    )
    // 因为密封类的子类是确定的，所以用在 when 语句时，只要所有子类都考虑到了，最后可以不加 else
    // 类比枚举 (enum)
    is NotANumber -> Double.NaN
}

// 密封类本身是抽象类，其主要用于限制继承：
// 即密封类的子类只能在密封类所在 .kt 文件声明，不能在其他文件中声明，如此一来就限制了密封类被外部类继承
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()