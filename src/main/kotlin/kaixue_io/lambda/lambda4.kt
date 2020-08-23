package kaixue_io.lambda

class Lambda4 {

    // fun interface only support after 1.4
    fun interface OnClickListener {
        fun onClick()
    }

    private fun setOnClickListener(listener: OnClickListener) {

    }

    fun main() {
        println(::setOnClickListener == ::setOnClickListener)
        setOnClickListener(object : OnClickListener {
            override fun onClick() {
            }
        })

        setOnClickListener(object : OnClickListener {
            override fun onClick() {
                TODO("Not yet implemented")
            }
        })

        // sam with fun interface only support after 1.4
        setOnClickListener {
        }
    }
}

fun main() {
    Lambda4().main()
}