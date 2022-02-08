package algorithms

class BubbleSorter {
    fun sort(arr: IntArray): IntArray {
        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1){
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr.clone()
    }
}