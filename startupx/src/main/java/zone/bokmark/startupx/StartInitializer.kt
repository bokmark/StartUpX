package zone.bokmark.startupx

import android.content.Context

/**
 * 主逻辑处理
 */
class StartInitializer private constructor() {
    /**
     * 从 StartUp的组件中调用过来
     */
    fun create(context: Context) {
        INFO(TAG, "call from wrapper")
    }

    /**
     * 单例 kotlin 写法
     */
    companion object {
        const val TAG = "StartInitializer"
        val instance: StartInitializer by lazy {
            StartInitializer()
        }
    }
}
