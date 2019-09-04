package space.learning.analyser_library

import android.app.Application
import space.learning.analyser_library.analyisActivity.ActManager

/**
 * 分析主入口
 */
class AnalyisManager {

    lateinit var app: Application

    companion object {
        @JvmStatic
        fun getInstance() = Holder.instance
    }

    object Holder {
        val instance = AnalyisManager()
    }

    /**
     * 初始化方法
     */
    fun init(app: Application) {
        this.app = app

        recordActivity()
    }

    /**
     * 开始记录activity的启动
     */
    private fun recordActivity() {
        ActManager.getInstance().recordAct()
    }



}