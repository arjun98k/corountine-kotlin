import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}") // main thread

    val jobDeferred: Deferred<Int> = async { // Thread: main
        println("Fake work starts: ${Thread.currentThread().name}") // Thread main
        delay(1000) //Corountine is suspended but Thread: main is free (not blocked)
        println("Fake work finished ${Thread.currentThread().name}")// Either main thread or some other thread
        15
    }
    val num:Int =  jobDeferred.await()
    println("Main program ends: ${Thread.currentThread().name}") // main thread

}