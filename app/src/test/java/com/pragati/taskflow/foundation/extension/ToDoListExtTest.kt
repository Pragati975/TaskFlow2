package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toToDoListDb
import com.pragati.taskflow.foundation.datasource.local.model.ToDoListDb
import com.pragati.taskflow.model.ToDoColor
import com.pragati.taskflow.model.ToDoList
import org.junit.Assert
import org.junit.Test

class ToDoListExtTest {

    @Test
    fun toListDb() {
        Assert.assertEquals(
            listOf(
                ToDoListDb(
                    id = "id",
                    name = "name",
                    color = ToDoColor.PURPLE,
                    groupId = "groupId",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoList(
                    id = "id",
                    name = "name",
                    color = ToDoColor.PURPLE,
                    tasks = listOf(),
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ).toToDoListDb("groupId")
        )
    }

}
