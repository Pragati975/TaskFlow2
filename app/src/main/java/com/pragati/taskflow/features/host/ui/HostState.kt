package com.pragati.taskflow.features.host.ui

import com.pragati.taskflow.model.Theme
import javax.annotation.concurrent.Immutable

@Immutable
data class HostState(val theme: Theme = Theme.SYSTEM)
