package com.pragati.taskflow.features.todo.scheduled.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.foundation.wrapper.IdProvider
import com.pragati.taskflow.model.TaskWithList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow
import java.time.LocalDateTime

interface IScheduledEnvironment {
    val idProvider: IdProvider
    val dateTimeProvider: DateTimeProvider
    fun getToDoTaskWithStepsOrderByDueDateWithList(maxDate: LocalDateTime? = null): Flow<List<TaskWithList>>
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)
}
