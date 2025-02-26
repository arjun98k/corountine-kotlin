import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main()= runBlocking { // create a blocking corountine that exexcutes in current Thread (main)

    println("Main program start ${Thread.currentThread().name}")

    withTimeout(1300) {
        try {
            for (i in 0..1000) {
                println("$i.")
                delay(500)
            }
        }catch (ex: TimeoutCancellationException){
            // code
        }finally {
            // code
        }

    }
    println("\n Main program ends: ${Thread.currentThread().name}") // main Thread
}