import algorithms.SelectionSorter
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class SelectionSorterTest {
    @Test
    fun test() {
        val unsorted = intArrayOf(9, 12, 16, 27, 93, 42)
        val sorted = SelectionSorter().sort(unsorted)
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