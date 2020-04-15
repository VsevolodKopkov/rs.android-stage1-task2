package subtask1

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {

    // TODO: Complete the following function

//        val c = Calendar.getInstance()
//
//        c.set(year.toInt(), month.toInt()-1, day.toInt())
//        return SimpleDateFormat("dd MMMM, EEEE", Locale("RU")).format(Date(c.timeInMillis))
    fun toTextDay(day: String, month: String, year: String): String {

        val calendar = Calendar.getInstance(Locale("RU")).apply {
            set(Calendar.YEAR, year.toInt())
            set(Calendar.MONTH, month.toInt().minus(1))
            set(Calendar.DAY_OF_MONTH, day.toInt())
        }

        val isCorrectDate = calendar.get(Calendar.DAY_OF_MONTH) == day.toInt() &&
                calendar.get(Calendar.MONTH).plus(1) == month.toInt()

        return if (isCorrectDate)
            SimpleDateFormat("d MMMM, EEEE", Locale("RU")).format(Date(calendar.timeInMillis))
        else "Такого дня не существует"
    }
}

