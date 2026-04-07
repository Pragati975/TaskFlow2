package com.pragati.taskflow.features.dashboard.data

import com.pragati.taskflow.model.ToDoTaskDiff
import com.pragati.taskflow.model.User
import kotlinx.coroutines.flow.Flow

interface IDashboardEnvironment {
    fun getUser(): Flow<User>
    fun listenToDoTaskDiff(): Flow<ToDoTaskDiff>
}
