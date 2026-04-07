package com.pragati.foundation.libanalyticsmanager

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsManager @Inject constructor() {
    fun trackEvent(eventName: String, params: Map<String, Any> = emptyMap()) {}
}
