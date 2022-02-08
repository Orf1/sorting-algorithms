import algorithms.BubbleSorter
import algorithms.SelectionSorter

fun main(args: Array<String>) {
    val bubbleSorter = BubbleSorter()
    val selectionSorter = SelectionSorter()

    val unsorted = intArrayOf(4, 9, 2, 18, 124, 82, 127)

    printArray(selectionSorter.sort(unsorted.clone()))
}

fun printArray(array: IntArray) {
    val str = StringBuilder()
    str.append("[")
    for (i in array.indices) {
        if(i == array.size-1) {
            str.append("${array[i]}")
        } else {
            str.append("${array[i]}, ")
        }
    }
    str.append("]")
    println(str)
}
