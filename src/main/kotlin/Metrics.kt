class Metrics {
    private var start: Long = 0
    private var stop: Long = 0

    fun start() {
        println("Started metrics.")
        start = System.currentTimeMillis()
    }

    fun stop() {
        stop = System.currentTimeMillis()
        println("Stopped metrics.")
    }

    fun print() {
        println("Metrics complete.")
        println("Operation took: ${stop-start} ms.")
    }
}