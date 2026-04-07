package com.pragati.taskflow.features.todo.group.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.foundation.wrapper.IdProvider
import com.pragati.taskflow.model.ToDoGroup
import kotlinx.coroutines.flow.Flow

interface ICreateGroupEnvironment {
    val idProvider: IdProvider
    val dateTimeProvider: DateTimeProvider
    suspend fun getGroup(groupId: String): Flow<ToDoGroup>
    suspend fun createGroup(name: String): Flow<String>
    suspend fun renameGroup(groupId: String, name: String): Flow<Any>
}
