package coroutines

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main(args: Array<String>) = runBlocking<Unit> {
    /********** demo 1 **********/
//    launch { println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("main runBlocking")) }
//    launch(Dispatchers.Unconfined) { println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("Unconfined")) }
//    launch(Dispatchers.Default) { println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("Default")) }
//    launch(Dispatchers.IO) { println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("IO")) }
//    launch(newSingleThreadContext("MyThread")) { println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("newSingleThreadContext")) }


    /********** demo 2 **********/
//    launch(Dispatchers.Unconfined) {
//        // not confined -- will work with main thread
//        println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("Unconfined"))
//        delay(500)
//        println("%-25s: After delay in thread ${Thread.currentThread().name}".format("Unconfined"))
//    }
//    launch {
//        // context of the parent, main runBlocking coroutine
//        println("%-25s: I'm working in thread ${Thread.currentThread().name}".format("main runBlocking"))
//        delay(1000)
//        println("%-25s: After delay in thread ${Thread.currentThread().name}".format("main runBlocking"))
//    }


    /********** demo 3 **********/
//    // run with jvmOption: -Dkotlinx.coroutines.debug
//    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//    val a = async {
//        log("get a")
//        6
//    }
//    val b = async {
//        log("get b")
//        2
//    }
//    log("The answer is ${a.await() * b.await()}")


    /********** demo 4 **********/
//    // run with jvmOption: -Dkotlinx.coroutines.debug
//    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//    newSingleThreadContext("Ctx1").use { ctx1 ->
//        newSingleThreadContext("Ctx2").use { ctx2 ->
//            runBlocking(ctx1) {
//                log("Started in ctx1")
//                withContext(ctx2) {
//                    log("Working in ctx2")
//                }
//                log("Back to ctx1")
//            }
//        }
//    }


    /********** demo 5 **********/
//    println("My job is ${coroutineContext[Job]}")


    /********** demo 6 **********/
//    var request = launch {
//        GlobalScope.launch {
//            println("GlobalScope launch")
//            delay(1000)
//            println("GlobalScope launch after delay")
//        }
//
//        launch {
//            delay(100)
//            println("launch")
//            delay(1000)
//            println("launch after delay")
//        }
//    }
//    delay(500)
//    request.cancel()
//    delay(1000)
//    println("at the end")


    /********** demo 7 **********/
//    val request = launch {
//        repeat(3) { i ->
//            // launch a few children jobs
//            launch {
//                delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
//                println("Coroutine $i is done")
//            }
//        }
//        println("at the end of request")
//    }
//    request.join() // wait for completion of the request, including all its children
//    println("at the end")


    /********** demo 8 **********/
//    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//
//    val v1 = async(CoroutineName("v1 coroutine")) {
//        delay(500)
//        log("v1")
//        1
//    }
//    val v2 = async(CoroutineName("v2 coroutine")) {
//        delay(1000)
//        log("v2")
//        2
//    }
//    log("v1 + v2 = ${v1.await() + v2.await()}}")


    /********** demo 9 **********/
//    launch(Dispatchers.Default + CoroutineName("test")) {
//        println("working in thread ${Thread.currentThread().name}")
//    }


    /********** demo 10 **********/
//    val activity = Activity()
//    activity.create()
//    activity.doSomething()
//    println("doSomething")
//    delay(1000)
//    println("Destroying")
//    activity.destroy()
//    delay(1000)


    /********** demo 11 **********/
//    threadLocal.set("main")
//    println("Pre-main, thread: ${Thread.currentThread()}, threadLocal value: ${threadLocal.get()}")
//    val job = launch(Dispatchers.Default + threadLocal.asContextElement("launch")) {
//        println("Launch start, thread: ${Thread.currentThread()}, threadLocal value: ${threadLocal.get()}")
//        yield()
//        println("After yield 1, thread: ${Thread.currentThread()}, threadLocal value: ${threadLocal.get()}")
//        yield()
//        println("After yield 2, thread: ${Thread.currentThread()}, threadLocal value: ${threadLocal.get()}")
//    }
//    job.join()
//    println("Post-main, thread: ${Thread.currentThread()}, threadLocal value: ${threadLocal.get()}\")")
}

/********** demo 10 **********/
class Activity : CoroutineScope {
    lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Default + job

    fun create() {
        job = Job()
    }

    fun destroy() {
        job.cancel()
    }

    fun doSomething() {
        repeat(10) {
            launch {
                delay((it + 1) * 200L)
                println("coroutine $it is done")
            }
        }
    }
}


/********** demo 11 **********/
val threadLocal = ThreadLocal<String?>()