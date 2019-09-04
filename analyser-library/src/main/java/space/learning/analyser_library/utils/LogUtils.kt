package space.learning.analyser_library.utils

import android.util.Log

class LogUtils {

    companion object {
        val TAG = "AnalyisManager >>>>>> "

        fun i(msg: String) {
            Log.i(TAG, msg)
        }

        fun d(msg: String) {
            Log.d(TAG, msg)
        }

        fun e(msg: String) {
            Log.e(TAG, msg)
        }
    }
}