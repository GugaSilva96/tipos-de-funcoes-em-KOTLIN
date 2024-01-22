import kotlinx.coroutines.*

fun main() = runBlocking {
    helloWorld()
}

suspend fun helloWorld() = coroutineScope {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello ")
}
