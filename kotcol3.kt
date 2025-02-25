import kotlinx.coroutines.*
import kotlin.concurrent.thread


//fun main() = runBlocking {      // Create a blocking corountines that executes in current thread
//    println("Main program start ${Thread.currentThread().name}")  //main thread
//
//    val job: Job = launch {  // Thread T1: create a non blocking corountine
//        for (i in 1.. 500){
//            print("$i.")
//            delay(50)
//        }
//    }
//    delay(200)  // Lets print a few values before we cancel
//    job.cancelAndJoin()
//    println("\n Main program end: ${Thread.currentThread().name}") // main thread
//}

//fun main() = runBlocking {      // Create a blocking corountines that executes in current thread
//    println("Main program start ${Thread.currentThread().name}")  //main thread
//
//    val job: Job = launch {  // Thread T1: create a non blocking corountine
//        for (i in 1.. 500){
//
//            print("$i.")
//            yield()  // it is faster delay() and or you can use any other suspending function as per you need
//        }
//    }
//    delay(20)  // Lets print a few values before we cancel
//    job.cancelAndJoin()
//    println("\n Main program end: ${Thread.currentThread().name}") // main thread
//}

fun main() = runBlocking {      // Create a blocking corountines that executes in current thread
    println("Main program start ${Thread.currentThread().name}")  //main thread

    val job: Job = launch(Dispatchers.Default) {  // Thread T1: create a non blocking corountine
        for (i in 1..500) {
         if (!isActive){ return@launch  // or you can use break
                }
            print("$i.")
            Thread.sleep(1)

        }
    }
    delay(10)  // Lets print a few values before we cancel
    job.cancelAndJoin()
    println("\n Main program end: ${Thread.currentThread().name}") // main thread
}