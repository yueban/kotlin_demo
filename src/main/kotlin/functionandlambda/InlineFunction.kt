package functionandlambda

import java.util.*
import javax.swing.tree.TreeNode

/**
 * 这一节需要对比 bytecode 反编译的 java 代码
 */
fun main(args: Array<String>) {
    /********** demo 1 **********/
//    nonInlined {
//        println("do something here")
//    }
//    inlined {
//        println("do something here")
//    }


    /********** demo 2 **********/
//    funcInline2({
//        println("inlined")
//    }) {
//        println("nonInlined")
//    }


    /********** demo 4 **********/
//    funInline4 { return } // ok
////    funNonInline4 { return } // not allowed
//    funNonInline4 { return@funNonInline4 } // ok


    /********** demo 5 **********/
//    funInline5 {
//        return // not allowed cause para lambda has marked as crossinline
//    }


    /********** demo 6 **********/
//    val node = MyTreeNode()
//    node.findParentOfType(MyTreeNode::class.java)
//    node.findParentOfType<MyTreeNode>()


    /********** demo 7 **********/
//    val s = membersOf<StringBuilder>().joinToString("\n")
//    println(s)


    /********** demo 8 **********/
//    println(1.0.strValue)
//    println(1.0.TAG)
}

/********** demo 1 **********/
fun nonInlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}

inline fun inlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}


/********** demo 2 **********/
inline fun funcInline2(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    inlined()
    notInlined()
}


/********** demo 3 **********/
@Suppress("NOTHING_TO_INLINE")
inline fun funcInline3(noinline notInlined: () -> Unit) {
    notInlined()
}


/********** demo 4 **********/
inline fun funInline4(inlined: () -> Unit) {
    inlined()
}

fun funNonInline4(nonInlined: () -> Unit) {
    nonInlined()
}


/********** demo 5 **********/
// not allowed
//inline fun funInline5(body: () -> Unit) {
//    val f = Runnable { body() }
//    f.run()
//}

// ok
inline fun funInline5(crossinline body: () -> Unit) {
    val f = Runnable { body() }
    f.run()
}


/********** demo 6 **********/
fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

// use inline with reified
inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}

class MyTreeNode : TreeNode {
    override fun children(): Enumeration<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isLeaf(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getParent(): TreeNode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildAt(childIndex: Int): TreeNode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getIndex(node: TreeNode?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllowsChildren(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


/********** demo 7 **********/
inline fun <reified T> membersOf() = T::class.members


/********** demo 8 **********/
val <reified T> T.strValue: String
    inline get() = this.toString()

inline val <reified T> T.TAG: String
    get() = T::class.java.simpleName