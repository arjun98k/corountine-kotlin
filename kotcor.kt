
import kotlin.concurrent.thread

fun main() {
    println("Main program start ${Thread.currentThread().name}")
    println("Main program End ${Thread.currentThread().name}")
    thread {
        println("fake work started ${Thread.currentThread().name}")
        Thread.sleep(1000) //pretend do some work.. may be file upload
        println("Main work finished: ${Thread.currentThread().name} ")
    }
}

