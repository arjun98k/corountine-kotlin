
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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
        Thread.sleep(1000) //pretend do some work.. may be file upload
        println("Main work finished: ${Thread.currentThread().name} ")
        // runnung parallel and do not block main thread program
    }
    Thread.sleep(1500)
    println("Main program End ${Thread.currentThread().name}")
}

