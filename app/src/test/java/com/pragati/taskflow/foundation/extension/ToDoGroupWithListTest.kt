package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.groupWithListToGroup
import com.pragati.taskflow.foundation.datasource.local.model.ToDoGroupDb
import com.pragati.taskflow.foundation.datasource.local.model.ToDoGroupWithList
import com.pragati.taskflow.model.ToDoGroup
import org.junit.Assert
import org.junit.Test

class ToDoGroupWithListTest {

    @Test
    fun toDoGroupWithListToGroup() {
        Assert.assertEquals(
            listOf(
                ToDoGroup(
                    id = "id",
                    name = "name",
                    lists = listOf(),
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoGroupWithList(
                    group = ToDoGroupDb(
                        id = "id",
                        name = "name",
                        createdAt = DateFactory.constantDate,
                        updatedAt = DateFactory.constantDate,
                    ),
                    listWithTasks = listOf()
                )
            ).groupWithListToGroup()
        )
    }

}
