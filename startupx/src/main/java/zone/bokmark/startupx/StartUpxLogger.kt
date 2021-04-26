package zone.bokmark.startupx

import android.util.Log


inline fun <reified T> T.log(tag: String = "startupx") {
    INFO(tag, this.toString())
}

inline fun <reified T> T.error(tag: String = "startupx", msg: String, throwable: Throwable) {
    ERROR(tag, msg, throwable = throwable)
}

fun INFO(tag: String, msg: String) {
    Log.i(tag, msg)
}

fun ERROR(tag: String, msg: String, throwable: Throwable) {
    Log.e(tag, msg, throwable)
}