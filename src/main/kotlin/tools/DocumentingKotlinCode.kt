package tools

fun main(args: Array<String>) {
}

/********** demo 1 **********/
/**
 * A group of *members*.
 *
 * This class  has no useful logic; it's just a documentation example.
 *
 * @param T the type of a member in this group.
 * @property name the name of this group.
 * @constructor Creates an empty group.
 */
class Group<T>(val name: String) {
    /**
     * Adds a [member] to this group.
     *
     * @param member the member to add
     * @return the new size of group.
     */
    fun add(member: T): Int {
        return 1
    }
}


/********** demo 2 **********/
class CDoc {
    /**
     * @Deprecated function f, use [another method][g] instead, as it shown, you can use `Markdown` to document
     */
    fun f() {}

    /**
     * @Deprecated function g, use [CDoc.h] instead
     *
     */
    fun g() {}

    fun h() {}
}