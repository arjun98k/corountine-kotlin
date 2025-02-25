//
//import kotlinx.coroutines.*
//
//// note main thread wait for to finish all background thread work
//fun main() = runBlocking { // Execute main thread
//    println("Main program start ${Thread.currentThread().name}") // main threas
//
////    thread {
////        println("fake work started ${Thread.currentThread().name}")
////        Thread.sleep(1000) //pretend do some work.. may be file upload
////        println("Main work finished: ${Thread.currentThread().name} ")
////        // runnung parallel and do not block main thread program
////    }
//
// val job: Job =   launch  { // running on main thread T1
//        println("fake work started ${Thread.currentThread().name}")  // run main thread
//        delay(2000) // Corountine is supported but thread: T1 is free (not block)
//        println("Main work finished: ${Thread.currentThread().name} ") //Either T1 or some other thread
//        // runnung parallel and do not block main thread program
//    }
//    // blocks the current main thread & wait for coroutine to finish
//    // (practically not right way to wait)
////    Thread.sleep(3000)
////    practically useless for real project
//
//
////        delay(3000) // wait for corountine to finish (practically not a right to wait)
//  job.join()
//    println("Main program End ${Thread.currentThread().name}")
//
//
//}
//
////suspend fun  mySusfun(time: Long)
////{
////    // code
////    delay(time)
////}
//
