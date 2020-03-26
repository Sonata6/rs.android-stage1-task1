package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var largestElement = input[0]
        var lowestElement = input[0]

        for (i in input){
            if(largestElement < i)
                largestElement = i
        }

        for (i in input) {
            if (lowestElement > i)
                lowestElement = i
        }
        return intArrayOf (input.sum()-largestElement, input.sum()-lowestElement)

    }
}
