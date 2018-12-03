package coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    /********** demo 1 **********/
//    val time = measureTimeMillis {
//        val one = doSomethingUsefulOne()
//        val two = doSomethingUsefulTwo()
//        println("The answer is ${one + two}")
//    }
//    println("Completed in $time ms")


    /********** demo 2 **********/
//    val time = measureTimeMillis {
//        val one = async { doSomethingUsefulOne() }
//        val two = async { doSomethingUsefulTwo() }
//        println("The answer is ${one.await() + two.await()}")
//    }
//    println("Completed in $time ms")


    /********** demo 3 **********/
//    val time = measureTimeMillis {
//        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
//        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
//        one.start()
//        two.start()
//        println("The answer is ${one.await() + two.await()}")
//    }
//    println("Completed in $time ms")


    /********** demo 5 **********/
//    val time = measureTimeMillis {
//        println("The answer is ${concurrentSum()}")
//    }
//    println("Completed in $time ms")


    /********** demo 6 **********/
    try {
        failedConcurrentSum()
    } catch (e: java.lang.ArithmeticException) {
        println("Computation failed with ArithmeticException")
    }
}

fun main2(args: Array<String>) {
    /********** demo 4 **********/
//    // this way is not recommended in kotlin
//    // cause if error occurs between one and one.await(), the one is still running in background.
//    // even the code starting one is aborted
//    // use demo 5 instead
//    val time = measureTimeMillis {
//        val one = somethingUsefulOneAsync()
//        val two = somethingUsefulTwoAsync()
//        runBlocking {
//            println("The answer is ${one.await() + two.await()}")
//        }
//    }
//    println("Completed in $time ms")
}


/********** demo 1,2,3 **********/
suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}


/********** demo 4 **********/
fun somethingUsefulOneAsync() = GlobalScope.async { doSomethingUsefulOne() }

fun somethingUsefulTwoAsync() = GlobalScope.async { doSomethingUsefulTwo() }


/********** demo 5 **********/
suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}


/********** demo 6 **********/
suspend fun failedConcurrentSum(): Int = coroutineScope {
    val one = async<Int> {
        try {
            delay(Long.MAX_VALUE)
            42
        } finally {
            println("First async child is cancelled")
        }
    }
    val two = async<Int> {
        println("Second async child throw an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}