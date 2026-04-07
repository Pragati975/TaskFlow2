package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toTaskDb
import com.pragati.taskflow.foundation.datasource.local.model.ToDoTaskDb
import com.pragati.taskflow.model.ToDoRepeat
import com.pragati.taskflow.model.ToDoStatus
import com.pragati.taskflow.model.ToDoTask
import org.junit.Assert
import org.junit.Test

class ToDoTaskExtTest {

    @Test
    fun toTaskDb() {
        Assert.assertEquals(
            listOf(
                ToDoTaskDb(
                    id = "id",
                    name = "name",
                    status = ToDoStatus.IN_PROGRESS,
                    dueDate = null,
                    repeat = ToDoRepeat.NEVER,
                    listId = "listId",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoTask(
                    id = "id",
                    name = "name",
                    status = ToDoStatus.IN_PROGRESS,
                    dueDate = null,
                    repeat = ToDoRepeat.NEVER,
                    steps = listOf(),
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ).toTaskDb("listId")
        )
    }

}
