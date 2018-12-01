package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main(args: Array<String>) = runBlocking<Unit> {
    /********** demo 1 **********/
//    val job = launch {
//        repeat(1000) {
//            println("I'm sleeping $it ...")
//            delay(500L)
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
////    job.cancel()
////    job.join()
//    job.cancelAndJoin()
//    println("main: Now I can quit.")


    /********** demo 2 **********/
//    val startTime = System.currentTimeMillis()
//    val job = launch(Dispatchers.Default) {
//        var nextPrintTime = startTime
//        var i = 0
//        while (i < 5) { // computation always wastes CPU, so the coroutines can not check cancellation
//            if (System.currentTimeMillis() >= nextPrintTime) {
//                println("I'm sleeping ${i++} ...")
//                nextPrintTime += 500L
//            }
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main: Now I can quit.")


    /********** demo 3 **********/
//    val startTime = System.currentTimeMillis()
//    val job = launch(Dispatchers.Default) {
//        var nextPrintTime = startTime
//        var i = 0
//        while (isActive) { // not computation, so the coroutines can check the cancellation
//            if (System.currentTimeMillis() >= nextPrintTime) {
//                println("I'm sleeping ${i++} ...")
//                nextPrintTime += 500L
//            }
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main: Now I can quit.")


    /********** demo 4 **********/
//    val job = launch {
//        try {
//            repeat(1000) {
//                println("I'm sleeping $it ...")
//                delay(500L)
//            }
//        } catch (e: Exception) {
//            println("I'm running catch")
//            e.printStackTrace()
//        } finally {
//            println("I'm running finally")
//        }
//    }
//    delay(1300L) // delay a bit
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin() // cancels the job and waits for its completion
//    println("main: Now I can quit.")


    /********** demo 5 **********/
//    val job = launch {
//        try {
//            repeat(1000) {
//                println("I'm sleeping $it ...")
//                delay(500L)
//            }
//        } finally {
//            withContext(NonCancellable) {
//                println("I'm running finally")
//                delay(1000L)
//                println("And I've just delayed for 1 sec because I'm non-cancellable")
//            }
//        }
//    }
//    delay(1300L) // delay a bit
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin() // cancels the job and waits for its completion
//    println("main: Now I can quit.")


    /********** demo 6 **********/
//    withTimeout(1300L) {
//        repeat(1000) {
//            println("I'm sleeping $it ...")
//            delay(500L)
//        }
//    }


    /********** demo 7 **********/
    // dead with TimeoutCancellationException
    // method 1.
//    try {
//        withTimeout(1300L) {
//            repeat(1000) {
//                println("I'm sleeping $it ...")
//                delay(500L)
//            }
//        }
//    } catch (e: TimeoutCancellationException) {
//        println("ignore TimeoutCancellationException")
//    }

    // method 2.
//    val result = withTimeoutOrNull(1300L) {
//        repeat(1000) {
//            println("I'm sleeping $it ...")
//            delay(500L)
//        }
//    }
//    println("Result is $result")
}