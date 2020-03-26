package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        var i: Int = 1
        var j: Int = 1
        var b: Boolean
        var happyArray = intArrayOf()
        var k: Int=1
        if(sadArray.size==0)
            return sadArray
        happyArray+=sadArray[0]
        do {
            b=false
            while (i < sadArray.size - 1)
            {
                while (sadArray[i + j] == 0)
                    j++
                while(sadArray[i-k]==0)
                    k++
                if (sadArray[i] > sadArray[i - k] + sadArray[i + j])
                {
                    sadArray[i]=0
                    b = true
                }
                i++
                j = 1
                k=1
            }
            i=1
        }while(b==true)
        while(i<sadArray.size - 1) {
            if(sadArray[i]!=0)
                happyArray+=sadArray[i]
            i++
        }
        happyArray+=sadArray[i]
    return happyArray

    }
}
