package kotlinlang.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main1(args: Array<String>) {
    /********** demo 1 **********/
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    Thread.sleep(2000L)


    /********** demo 2 **********/
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    runBlocking {
//        delay(2000L)
//    }


    /********** demo 4 **********/
//    class MyTest {
//        @TestOnly
//        fun testMySuspendingFunction() = runBlocking<Unit> {
//            // here we can use suspending functions using any assertion style that we like
//        }
//    }
}


// declare Type <Unit> because a well-formed kotlinlang.main function in kotlin should return <Unit>
fun main() = runBlocking<Unit> {
    /********** demo 3 **********/
//    GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    delay(2000L)


    /********** demo 5 **********/
//    val job = GlobalScope.launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//    job.join()


    /********** demo 6 **********/
//    launch {
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")


    /********** demo 7 **********/
//    launch {
//        delay(200L)
//        println("launch in runBlocking")
//    }
//
//    coroutineScope {
//        launch {
//            delay(500L)
//            println("launch in coroutineScope in runBlocking")
//        }
//        delay(100L)
//        println("coroutineScope in runBlocking")
//    }
//
//    println("in runBlocking")


    /********** demo 8 **********/
//    launch {
//        doWorld()
//    }
//    println("Hello,")


    /********** demo 9 **********/
//    repeat(100000) {
//        launch {
//            delay(1000L)
//            print(".")
//        }
//    }


    /********** demo 10 **********/
//    GlobalScope.launch {
//        repeat(1000) {
//            println("I'm sleeping $it ...")
//            delay(500L)
//        }
//    }
//    delay(1300L)
}

/********** demo 8 **********/
private suspend fun doWorld() {
    delay(1000L)
    println("World!")
}