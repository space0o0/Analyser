package space.learning.analyser_library.utils

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

    companion object {

        fun getTime(): String {
            var time: String
            var date = Date()
            var dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            time = dateFormat.format(date)

            return time
        }
    }
}