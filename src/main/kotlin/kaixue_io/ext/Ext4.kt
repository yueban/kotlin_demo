package kaixue_io.ext

class Ext4 {
    private fun Float.test(param: String) {
        println(param)
    }

    fun test() {
        // 函数同时是成员和拓展函数，则不允许通过引用的方式调用
//        Float::test.invoke(1f, "2")
    }
}