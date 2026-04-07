package com.pragati.taskflow.features.todo.main.data

import com.pragati.taskflow.foundation.datasource.local.provider.ToDoGroupProvider
import com.pragati.taskflow.foundation.datasource.local.provider.ToDoListProvider
import com.pragati.taskflow.foundation.datasource.local.provider.ToDoTaskProvider
import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.model.ToDoGroup
import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoTaskOverallCount
import kotlinx.coroutines.flow.Flow
import java.time.LocalDateTime
import java.time.LocalTime
import javax.inject.Inject

class TaskMainEnvironment @Inject constructor(
    override val dateTimeProvider: DateTimeProvider,
    private val toDoGroupProvider: ToDoGroupProvider,
    private val toDoListProvider: ToDoListProvider,
    private val toDoTaskProvider: ToDoTaskProvider,
) : ITaskMainEnvironment {

    override fun getGroup(): Flow<List<ToDoGroup>> {
        return toDoGroupProvider.getGroupWithList()
    }

    override fun getOverallCount(): Flow<ToDoTaskOverallCount> {
        val tomorrow = LocalDateTime.of(dateTimeProvider.now().toLocalDate().plusDays(1), LocalTime.MIN)
        return toDoTaskProvider.getOverallCount(tomorrow)
    }

    override suspend fun deleteList(list: ToDoList) {
        toDoListProvider.deleteListById(list.id)
    }

}
