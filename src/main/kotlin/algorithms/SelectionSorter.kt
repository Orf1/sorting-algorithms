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
            val temp = arr[minIndex]
            arr[minIndex] = arr[i]
            arr[i] = temp
        }
        return arr.clone()
    }
}