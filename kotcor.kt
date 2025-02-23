
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// note main thread wait for to finish all background thread work
fun main() {
    println("Main program start ${Thread.currentThread().name}")

//    thread {
//        println("fake work started ${Thread.currentThread().name}")
//        Thread.sleep(1000) //pretend do some work.. may be file upload
//        println("Main work finished: ${Thread.currentThread().name} ")
//        // runnung parallel and do not block main thread program
//    }

   GlobalScope.launch  {
        println("fake work started ${Thread.currentThread().name}")
        delay(2000) // Corountine is supported but thread: T1 is free (not block)
        println("Main work finished: ${Thread.currentThread().name} ") //Either T1 or some other thread
        // runnung parallel and do not block main thread program
    }
    // blocks the current main thread & wait for coroutine to finish
    // (practically not right way to wait)
//    Thread.sleep(3000)
//    practically useless for real project

    runBlocking {
        delay(3000) // wait for corountine to finish (practically not a right to wait)
    }
    println("Main program End ${Thread.currentThread().name}")
}

