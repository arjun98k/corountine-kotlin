import kotlinx.coroutines.*


fun main() = runBlocking {      // Create a blocking corountines that executes in current thread
    println("Main program start ${Thread.currentThread().name}")  //main thread

    val job: Job = launch {  // Thread T1: create a non blocking corountine
        for (i in 1.. 500){
            print("$i.")
            delay(50)
        }
    }
    delay(200)  // Lets print a few values before we cancel
    job.cancelAndJoin()
    println("\n Main program end: ${Thread.currentThread().name}") // main thread
}