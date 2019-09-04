package space.learning.analyser_library.analyisActivity

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.os.Bundle
import space.learning.analyser_library.AnalyisManager
import space.learning.analyser_library.utils.DateUtils
import space.learning.analyser_library.utils.LogUtils

class ActManager {

    companion object {
        @JvmStatic
        fun getInstance() = Holder.instance
    }

    object Holder {
        val instance = ActManager()
    }

    @SuppressLint("NewApi")
    fun recordAct() {

        AnalyisManager.getInstance().app.registerActivityLifecycleCallbacks(object :
            Application.ActivityLifecycleCallbacks {

            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
                LogUtils.i("${p0.javaClass.simpleName} is create at ${DateUtils.getTime()}")
            }

            override fun onActivityStarted(p0: Activity) {
            }

            override fun onActivityResumed(p0: Activity) {
            }

            override fun onActivityPaused(p0: Activity) {
            }

            override fun onActivityStopped(p0: Activity) {
                LogUtils.i("${p0.javaClass.simpleName} is stop at ${DateUtils.getTime()}")
            }

            override fun onActivityDestroyed(p0: Activity) {
            }

            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
            }
        })

    }
}