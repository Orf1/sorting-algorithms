package algorithms

class BubbleSorter {
    fun sort(arr: IntArray): IntArray {
        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1){
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1)
                }
            }
        }
        return arr.clone()
    }

    private fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}