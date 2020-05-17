package kotlinlang_org.other

fun main(args: Array<String>) {
    /********** demo 1 **********/
//    val p1 = CPerson("ranran", 5, 3, "zz")
//    val (a, b) = p1
//    println("$a, $b")
//
//    val p2 = CPerson("alice", 4, 2, "au")
//    val p3 = CPerson("emma", 3, 1, "au")
//    val coll = listOf(p1, p2, p3)
//    for ((a, b, c) in coll) {
//        println("$a, $b, $c")
//    }


    /********** demo 2 **********/
//    val (name, _, _, address) = getCPerson()
//    println("name: $name, address: $address")


    /********** demo 3 **********/
//    val map = HashMap<Int, String>()
//    map[1] = "ranran"
//    map[2] = "yueban"
//    for ((k, v) in map) {
//        println("k: $k, v: $v")
//    }


    /********** demo 4 **********/
//    val map = HashMap<Int, String>()
//    map[1] = "ranran"
//    map[2] = "yueban"
//    map.mapValues { entry -> println(entry.value) }
//    map.mapValues { (_, v) -> println(v) }
//
//    val p1 = CPerson("ranran", 5, 3, "zz")
//    val p2 = CPerson("alice", 4, 2, "au")
//    val coll = listOf(p1, p2)
//    coll.forEach { person -> println("name: ${person.name}, address: ${person.address}") }
//    coll.forEach { (name, _, _, address) -> println("name: $name, address: $address") }
}

/********** demo 1 **********/
data class CPerson(val name: String, val age: Int, val grade: Int, val address: String)


/********** demo 2 **********/
fun getCPerson(): CPerson {
    return CPerson("ranran", 5, 3, "zz")
}