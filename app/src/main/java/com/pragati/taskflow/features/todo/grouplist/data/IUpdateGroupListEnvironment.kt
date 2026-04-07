package com.pragati.taskflow.features.todo.grouplist.data

import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.model.GroupIdWithList
import kotlinx.coroutines.flow.Flow

interface IUpdateGroupListEnvironment {
    val dateTimeProvider: DateTimeProvider
    fun getListWithUnGroupList(groupId: String): Flow<List<GroupIdWithList>>
    suspend fun updateList(data: List<GroupIdWithList>)
}
