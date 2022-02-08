import algorithms.BubbleSorter
import algorithms.SelectionSorter

fun main() {
    val bubbleSorter = BubbleSorter()
    val selectionSorter = SelectionSorter()
    val unsorted = intArrayOf(4, 9, 2, 18, 124, 82, 127)

    println(selectionSorter.sort(unsorted.clone()).contentToString())
    println(bubbleSorter.sort(unsorted.clone()).contentToString())
}
