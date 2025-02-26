import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

fun main()= runBlocking {   // Creates a blocking coroutine that executes in current thread (main)
    println("Main program starts: ${Thread.currentThread().name}")
    val time = measureTime {
  val  msgOne = getMsgone()
  val msgTwo = getMsgTwo()

  println("the entire name of $msgOne + $msgTwo")
    }
println("complete in $time ms")
    println("Main prgram ends: ${Thread.currentThread().name}")
}

suspend fun getMsgone(): String {
    delay(1000)
    return  "Arjun"
}

suspend fun getMsgTwo(): String {
    delay(1000)
    return "kandekar"
}