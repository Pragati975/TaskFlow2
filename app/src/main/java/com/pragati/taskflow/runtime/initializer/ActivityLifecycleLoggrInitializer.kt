package com.pragati.taskflow.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.pragati.foundation.liblifecycleloggr.ActivityLifecycleLoggr
import com.pragati.taskflow.runtime.TaskFlowApp

class ActivityLifecycleLoggrInitializer : Initializer<ActivityLifecycleLoggr> {
    override fun create(context: Context): ActivityLifecycleLoggr {
        return ActivityLifecycleLoggr().also {
            (context.applicationContext as TaskFlowApp)
                .registerActivityLifecycleCallbacks(it)
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = listOf(LoggrInitializer::class.java)
}
