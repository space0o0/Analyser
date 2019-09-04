package space.learning.analyser.application

import android.app.Application
import space.learning.analyser_library.AnalyisManager

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        AnalyisManager.getInstance().init(this)

    }
}
