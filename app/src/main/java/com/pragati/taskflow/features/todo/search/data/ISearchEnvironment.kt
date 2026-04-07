package com.pragati.taskflow.features.todo.search.data

import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow

interface ISearchEnvironment {
    fun searchList(query: String): Flow<List<ToDoList>>
    suspend fun toggleTaskStatus(toDoTask: ToDoTask)
    suspend fun deleteTask(task: ToDoTask)
}
