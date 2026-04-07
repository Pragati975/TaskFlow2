package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toToDoList
import com.pragati.taskflow.foundation.datasource.local.model.ToDoListDb
import com.pragati.taskflow.model.ToDoColor
import com.pragati.taskflow.model.ToDoList
import org.junit.Assert
import org.junit.Test

class ToDoListDbExtTest {

    @Test
    fun toList() {
        Assert.assertEquals(
            listOf(
                ToDoList(
                    id = "id",
                    name = "name",
                    color = ToDoColor.RED,
                    tasks = listOf(),
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoListDb(
                    id = "id",
                    name = "name",
                    color = ToDoColor.RED,
                    groupId = "groupId",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ).toToDoList()
        )
    }

}
