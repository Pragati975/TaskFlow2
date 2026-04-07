package com.pragati.taskflow.features.todo.detail.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.foundation.wrapper.IdProvider
import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface IListDetailEnvironment {
    val idProvider: IdProvider
    val dateTimeProvider: DateTimeProvider
    fun getListWithTasksById(listId: String): Flow<ToDoList>
    suspend fun createList(list: ToDoList): Flow<ToDoList>
    suspend fun updateList(list: ToDoList): Flow<Any>
    suspend fun createTask(taskName: String, listId: String)
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)

    fun trackSaveListButtonClicked()
}
