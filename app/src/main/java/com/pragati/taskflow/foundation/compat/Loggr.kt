package com.pragati.foundation.coreloggr

import android.util.Log

object Loggr {
    fun initialize(loggings: List<Any>) {}

    fun debug(tag: String = "TaskFlow", message: () -> String) {
        Log.d(tag, message())
    }

    fun error(tag: String = "TaskFlow", message: () -> String) {
        Log.e(tag, message())
    }
}
