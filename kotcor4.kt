import kotlinx.coroutines.*
import kotlin.coroutines.cancellation.CancellationException

fun main() = runBlocking {      // Create a blocking corountines that executes in current thread
    println("Main program start ${Thread.currentThread().name}")  //main thread

    val job: Job = launch(Dispatchers.Default) {  // Thread T1: create a non blocking corountine
       try {
        for (i in 1..500) {

            print("$i.")
           delay(5)

        }
    } catch (ex: CancellationException){
    println("\n caught safely exception")
    }finally {
        println("\n close resources in finally ")
    }
    }
    delay(10)  // Lets print a few values before we cancel
    job.cancelAndJoin()
    println("\n Main program end: ${Thread.currentThread().name}") // main thread
}