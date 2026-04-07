package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toDoListWithTasksToToDoList
import com.pragati.taskflow.foundation.datasource.local.mapper.toToDoList
import com.pragati.taskflow.foundation.datasource.local.model.ToDoListDb
import com.pragati.taskflow.foundation.datasource.local.model.ToDoListWithTasks
import com.pragati.taskflow.model.ToDoColor
import com.pragati.taskflow.model.ToDoList
import org.junit.Assert
import org.junit.Test

class ToDoListWithTasksExtTest {

    @Test
    fun toDoListWithTasksToLists() {
        Assert.assertEquals(
            listOf(
                ToDoList(
                    id = "id",
                    name = "name",
                    color = ToDoColor.PURPLE,
                    tasks = listOf(),
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoListWithTasks(
                    list = ToDoListDb(
                        id = "id",
                        name = "name",
                        color = ToDoColor.PURPLE,
                        groupId = "groupId",
                        createdAt = DateFactory.constantDate,
                        updatedAt = DateFactory.constantDate,
                    ),
                    taskWithSteps = listOf()
                )
            ).toDoListWithTasksToToDoList()
        )
    }

    @Test
    fun toDoListWithTasksToList() {
        Assert.assertEquals(
            ToDoList(
                id = "id",
                name = "name",
                color = ToDoColor.PURPLE,
                tasks = listOf(),
                createdAt = DateFactory.constantDate,
                updatedAt = DateFactory.constantDate,

                ),
            ToDoListWithTasks(
                list = ToDoListDb(
                    id = "id",
                    name = "name",
                    color = ToDoColor.PURPLE,
                    groupId = "groupId",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                ),
                taskWithSteps = listOf()
            ).toToDoList()
        )
    }
}
