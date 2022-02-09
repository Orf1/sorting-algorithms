import algorithms.BubbleSorter
import algorithms.QuickSorter
import algorithms.SelectionSorter

fun main() {
    val bubbleSorter = BubbleSorter()
    val selectionSorter = SelectionSorter()
    val quickSorter = QuickSorter()
    val unsorted = (1..100000).map { (0..1000).random() }.toIntArray()
    val metrics = Metrics()

    println("Sorting using SelectionSort")
    metrics.start()
    val selectionSorted = selectionSorter.sort(unsorted)
    metrics.stop()
    println("Sorting complete.")
    //println(selectionSorted.contentToString())
    metrics.print()

    println("Sorting using BubbleSort")
    metrics.start()
    val bubbleSorted = bubbleSorter.sort(unsorted)
    metrics.stop()
    println("Sorting complete.")
    //println(bubbleSorted.contentToString())
    metrics.print()

    println("Sorting using QuickSort")
    metrics.start()
    val quickSorted = quickSorter.sort(unsorted)
    metrics.stop()
    println("Sorting complete.")
    //println(quickSorted.contentToString())
    metrics.print()

    println("Sorting using KotlinSort")
    metrics.start()
    val kotlinSorted = unsorted.clone().sorted()
    metrics.stop()
    println("Sorting complete.")
    //println(quickSorted.contentToString())
    metrics.print()
}
