package com.pragati.taskflow.features.todo.main.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.model.ToDoGroup
import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoTaskOverallCount
import kotlinx.coroutines.flow.Flow

interface ITaskMainEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getGroup(): Flow<List<ToDoGroup>>
    fun getOverallCount(): Flow<ToDoTaskOverallCount>
    suspend fun deleteList(list: ToDoList)
}
