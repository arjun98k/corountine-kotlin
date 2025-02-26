import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking { // Create a blocking corountine that execute in current Thread
    println("Main program starts : ${Thread.currentThread().name}") // Main Thread
     val result: String? = withTimeoutOrNull(2000){
         for (i in 0..500) {
             println("$i.")
             delay(500)
         }
         "I am done"
     }
    println("result $result")

    println("Main program ends: ${Thread.currentThread().name}") //main thread
}