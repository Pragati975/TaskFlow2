package com.pragati.taskflow.features.todo.all.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface IAllEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getList(): Flow<List<ToDoList>>
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)
}
