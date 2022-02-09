package algorithms

class SelectionSorter {
    fun sort(arr: IntArray): IntArray {
        for (i in arr.indices) {
            var minIndex = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j
                }
            }
            swap(arr, minIndex, i)
        }
        return arr.clone()
    }

    private fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}