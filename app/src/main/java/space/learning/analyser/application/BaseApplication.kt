package space.learning.analyser.application

import android.app.Application

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks()
    }
}
