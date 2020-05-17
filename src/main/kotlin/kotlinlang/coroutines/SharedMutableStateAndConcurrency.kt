package kotlinlang.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.sync.Mutex
import kotlin.system.measureTimeMillis

/********** demo 1 **********/
//var counter = 0


/********** demo 2 **********/
//@Volatile
//var counter = 0


/********** demo 3 **********/
//var counter = AtomicInteger(0)


/********** demo 4,5 **********/
//var counter = 0
//val counterContext = newSingleThreadContext("CounterContext")


/********** demo 6 **********/
var counter = 0
val mutex = Mutex()


fun main(args: Array<String>) = runBlocking<Unit> {
    /********** demo 1,2,3 **********/
//    GlobalScope.massiveRun {
//        counter.incrementAndGet()
//    }
//    println("Counter = $counter")


    /********** demo 4 **********/
//    GlobalScope.massiveRun {
//        withContext(counterContext) {
//            counter++
//        }
//    }
//    println("Counter = $counter")


    /********** demo 5 **********/
//    CoroutineScope(counterContext).massiveRun {
//        counter++
//    }
//    println("Counter = $counter")


    /********** demo 6 **********/
//    GlobalScope.massiveRun {
//        mutex.withLock {
//            counter++
//        }
//    }
//    println("Counter = $counter")


    /********** demo 7 **********/
    val counter = counterActor() // create the actor
    GlobalScope.massiveRun {
        counter.send(IncCounter)
    }
    // send a message to get a counter value from an actor
    val response = CompletableDeferred<Int>()
    counter.send(GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close() // shutdown the actor
}


/********** demo 1,2,3,4,5,6,7 **********/
suspend fun CoroutineScope.massiveRun(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            launch {
                repeat(k) {
                    action()
                }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}


/********** demo 7 **********/
// Message types for counterActor
sealed class CounterMsg

object IncCounter : CounterMsg() // one-way message to increment counter
class GetCounter(val response: CompletableDeferred<Int>) : CounterMsg() // a request with reply

// This function launches a new counter actor
fun CoroutineScope.counterActor() = actor<CounterMsg> {
    var counter = 0 // actor state
    for (msg in channel) { // iterate over incoming messages
        when (msg) {
            is IncCounter -> counter++
            is GetCounter -> msg.response.complete(counter)
        }
    }
}