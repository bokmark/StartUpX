package zone.bokmark.startupx

import android.content.Context
import androidx.startup.Initializer

class WrapInitializer : Initializer<Unit> {
    companion object {
        const val TAG = "WrapInitializer"
    }

    override fun create(context: Context) {
        INFO(TAG, "invoke from startup")
        StartInitializer.instance.create(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}