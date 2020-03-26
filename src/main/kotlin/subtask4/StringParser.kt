package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var arr = arrayOf<String>()
        var ms = arrayOf<Int>()
        var i: Int = 0
        var j: Int = 0
        var kr1: Int =0
        var kv1: Int =0
        var tr1: Int=0
        var i1: Int
        var i2: Int
        while(i<inputString.length)
        {
            if(inputString[i]=='<') {
                j = i+1
                i1 = i + 1
                tr1++
                while(tr1!=0){
                while (inputString[j] != '>') {
                    j++
                    if(inputString[j]=='<')
                        tr1++

                }
                    tr1--
                    j++
                }
                i2 = j-1
                arr += inputString.substring(i1, i2)
                tr1=0
            }
                if(inputString[i]=='(') {
                    j = i+1
                    i1 = i + 1
                    kr1++
                    while( kr1!=0){
                        while (inputString[j] != ')') {
                            j++
                            if(inputString[j]=='(')
                                kr1++

                        }
                        kr1--
                        j++
                    }
                    i2 = j-1
                    arr += inputString.substring(i1, i2)
                    kr1=0
                }
                    if(inputString[i]=='[')
                    {
                        j = i+1
                        i1 = i + 1
                        kv1++
                        while(kv1!=0){
                            while (inputString[j] != ']') {
                                j++
                                if(inputString[j]=='[')
                                    kv1++

                            }
                            kv1--
                            j++
                        }
                        i2 = j-1
                        arr += inputString.substring(i1, i2)
                        kv1=0
                    }
            i++
        }
            return arr
    }
}
