package subtask2

class TimeConverter {

    val hoursLine: Array<String> = arrayOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty"
    )

    private fun correctLine(minute: Int, hour: Int, string: String) =
        if (minute > 20)
            "${hoursLine.last()} ${hoursLine[minute.minus(20)]} minutes $string ${hoursLine[hour]}"
        else
            "${hoursLine[minute]} minutes $string ${hoursLine[hour]}"

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {

        val halfPast = "half past"
        val clock = "o' clock"
        val quarterTo = "quarter to"
        val quarterPast = "quarter past"

        return when {

            minute == "00" -> {
                "${hoursLine[hour.toInt()]} $clock"
            }

            minute == "15" -> {
                "$quarterPast ${hoursLine[hour.toInt()]}"
            }

            minute == "30" -> {
                "$halfPast ${hoursLine[hour.toInt()]}"
            }

            minute == "45" -> {
                "$quarterTo ${hoursLine[hour.toInt().plus(1)]}"
            }

            minute.toInt() in 1..29 -> {
                correctLine(minute.toInt(), hour.toInt(), "past")
            }

            minute.toInt() in 31..59 -> {
                correctLine(60.minus(minute.toInt()), hour.toInt().plus(1), "to")
            }

            else -> {
                ""
            }
        }
    }
}
