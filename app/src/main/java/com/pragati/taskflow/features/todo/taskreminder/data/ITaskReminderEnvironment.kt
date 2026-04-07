package com.pragati.taskflow.features.todo.taskreminder.data

import com.pragati.taskflow.model.TaskWithList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface ITaskReminderEnvironment {
    fun notifyNotification(taskId: String): Flow<TaskWithList>
    fun snoozeReminder(taskId: String): Flow<TaskWithList>
    suspend fun completeReminder(taskId: String): Flow<TaskWithList>
    fun restartAllReminder(): Flow<List<ToDoTask>>
}
