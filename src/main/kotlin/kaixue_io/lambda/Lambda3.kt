package kaixue_io.lambda


lateinit var mOnClick: (Int) -> Unit

fun setOnClickListener(onClick: (Int) -> Unit) {
    mOnClick = onClick
}

fun main() {
    setOnClickListener(fun(view: Int): Unit {
        view.toString()
    })

    setOnClickListener(fun(view: Int) {
        view.toString()
    })

    setOnClickListener { view -> view.toString() }

    setOnClickListener { it.toString() }
}

