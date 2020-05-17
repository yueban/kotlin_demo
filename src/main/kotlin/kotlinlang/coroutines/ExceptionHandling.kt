package kotlinlang.coroutines

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main(args: Array<String>) = runBlocking<Unit> {
    /********** demo 1 **********/
//    val job = GlobalScope.launch {
//        println("throw exception from global launch")
//        throw IndexOutOfBoundsException()
//    }
//    job.join()
//    println("after join")
//    val deferred = GlobalScope.async {
//        println("throw exception from global async")
//        throw ArithmeticException()
//    }
//    try {
//        deferred.await()
//        println("after deferred await")
//    } catch (e: Exception) {
//        println("exception caught: ${e.javaClass}")
//    }


    /********** demo 2 **********/
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught: $exception")
//    }
//    val job = GlobalScope.launch(handler) {
//        throw AssertionError()
//    }
//    val deferred = GlobalScope.async(handler) {
//        throw ArithmeticException() // won't catch or print, cause await() not called
//    }
//    joinAll(job, deferred)


    /********** demo 3 **********/
//    val job = launch {
//        val child = launch {
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                println("child is cancelled")
//            }
//        }
//        yield()
//        println("Cancelling child")
//        child.cancel()
//        child.join()
//        yield()
//        println("Parent not cancelled")
//    }
//    job.join()


    /********** demo 4 **********/
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught: $exception")
//    }
//    val job = GlobalScope.launch(handler) {
//        launch {
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                withContext(NonCancellable) {
//                    println("Children are cancelled, but exception is not handled until all children terminate")
//                    delay(100)
//                    println("The first child finished its non cancellable block")
//                }
//            }
//        }
//        launch {
//            delay(10)
//            println("Second child throws an exception")
//            throw ArithmeticException()
//        }
//    }
//    job.join()


    /********** demo 5 **********/
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught: $exception with suppressed ${exception.suppressed?.contentToString()}")
//    }
//    val job = GlobalScope.launch(handler) {
//        launch {
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                throw ArithmeticException()
//            }
//        }
//        launch {
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                throw AssertionError()
//            }
//        }
//        launch {
//            delay(100)
//            throw IOException()
//        }
//        delay(Long.MAX_VALUE)
//    }
//    job.join()


    /********** demo 6 **********/
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught original $exception")
//    }
//    val job = GlobalScope.launch(handler) {
//        val inner = launch {
//            launch {
//                launch {
//                    throw IOException()
//                }
//            }
//        }
//        try {
//            inner.join()
//        } catch (e: CancellationException) {
//            println("Rethrowing CancellationException with original cause")
//            throw e
//        }
//    }
//    job.join()


    /********** demo 7 **********/
//    val supervisor = SupervisorJob()
//    with(CoroutineScope(coroutineContext + supervisor)) {
//        val child1 = launch(CoroutineExceptionHandler { _, _ -> }) {
//            println("child1 is failing")
//            throw AssertionError("child 1 is cancelled")
//        }
//        val child2 = launch {
//            println("child1 join in child2 launch")
//            child1.join()
//            try {
//                delay(Long.MAX_VALUE)
//            } finally {
//                println("child2 is cancelled")
//            }
//        }
//        child1.join()
//        println("cancelling supervisor")
//        supervisor.cancel()
//        child2.join()
//    }


    /********** demo 8 **********/
//    try {
//        supervisorScope {
//            val child = launch {
//                try {
//                    println("child is sleeping")
//                    delay(Long.MAX_VALUE)
//                } finally {
//                    println("child is cancelled")
//                }
//            }
//            yield()
//            println("throwing an exception from scope")
//            throw AssertionError()
//        }
//    } catch (e: Throwable) {
//        println("Caught: $e")
//    }


    /********** demo 9 **********/
//    val handler = CoroutineExceptionHandler { _, exception ->
//        println("Caught: $exception")
//    }
//    supervisorScope {
//        val child = launch(handler) {
//            println("throwing an exception in child")
//            throw AssertionError()
//        }
//        println("supervisorScope is completing")
//    }
//    println("at the end of kotlinlang.main()")
}