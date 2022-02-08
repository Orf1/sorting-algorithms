import algorithms.BubbleSorter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class BubbleSorterTest {
    @Test
    fun test() {
        val unsorted = intArrayOf(9, 12, 16, 27, 93, 42)
        val sorted = BubbleSorter().sort(unsorted)
        for (i in sorted.indices) {
            if (i != 0 ) {
                if (sorted[i-1] > sorted[i]) {
                    fail("Array is not sorted")
                }
            }
        }
        assert(true)
    }
}