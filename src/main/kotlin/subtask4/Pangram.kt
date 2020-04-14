package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        //throw NotImplementedError("Not implemented")
        var pangramFlag = true
        var firstList: List<String> = inputString.split(' ')
        var secondList = firstList.toMutableList()
        var customString = StringBuilder()
        var copyString = StringBuilder()
        var resultString: String = ""
        var count = 0
        var count1 = 0

        while (count1 < secondList.size)
        {
            if (count1 > secondList.size - 1)
            {
                break
            }

            if (secondList[count1].equals("") || secondList[count1].equals("\n"))
            {
                secondList.removeAt(count1)
                count1--
            }
            count1++
        }

        for (ch in 'a'..'z')
        {
            if (!inputString.contains(ch,true))
            {
                pangramFlag = false
            }
        }

        if (pangramFlag == true)
        {
            for (i in 0 until secondList.size)
            {
                customString.append(secondList[i])

                for (j in 0 until customString.length)
                {
                    if (customString[j].toLowerCase() == 'a' || customString[j].toLowerCase() == 'e' || customString[j].toLowerCase() == 'i' || customString[j].toLowerCase() == 'o' || customString[j].toLowerCase() == 'u' || customString[j].toLowerCase() == 'y')
                    {
                        customString[j] = customString[j].toUpperCase()
                        count++
                    }
                }
                copyString.append(customString)
                customString.clear()
                customString.append("${count.toString()}$copyString")
                count = 0
                secondList.set(i,customString.toString())
                customString.clear()
                copyString.clear()
            }
            secondList.sortBy { it[0].toInt() }

            for (i in 0 until secondList.size)
            {
                if (i == secondList.size - 1)
                {
                    resultString = "$resultString${secondList[i]}"
                }
                else
                {
                    resultString = "$resultString${secondList[i]} "
                }
            }
        }
        else
        {
            for (i in 0 until secondList.size)
            {
                customString.append(secondList[i])

                for (j in 0 until customString.length)
                {
                    if (customString[j].toLowerCase() in 'b'..'d' || customString[j].toLowerCase() in 'f'..'h' || customString[j].toLowerCase() in 'j'..'n' || customString[j].toLowerCase() in 'p'..'t' || customString[j].toLowerCase() in 'v'..'x' || customString[j].toLowerCase() == 'z')
                    {
                        customString[j] = customString[j].toUpperCase()
                        count++
                    }
                }
                copyString.append(customString)
                customString.clear()
                customString.append("${count.toString()}$copyString")
                count = 0
                secondList.set(i,customString.toString())
                customString.clear()
                copyString.clear()
            }
            secondList.sortBy { it[0].toInt() }

            for (i in 0 until secondList.size)
            {
                if (i == secondList.size - 1)
                {
                    resultString = "$resultString${secondList[i]}"
                }
                else
                {
                    resultString = "$resultString${secondList[i]} "
                }
            }
        }

        return resultString
    }
}
