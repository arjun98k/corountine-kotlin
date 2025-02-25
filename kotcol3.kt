import kotlinx.coroutines.*


fun main() = runBlocking {
    println("Main program start ${Thread.currentThread().name}")

    val job: Job = launch {
        for (i in 1.. 500){
            print("$i.")
            delay(50)
        }
    }
    delay(200)
    job.cancelAndJoin()
    println("\n Main program end: ${Thread.currentThread().name}")
}