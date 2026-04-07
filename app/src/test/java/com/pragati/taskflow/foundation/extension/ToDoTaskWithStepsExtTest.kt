package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.taskWithStepsToTask
import com.pragati.taskflow.foundation.datasource.local.model.ToDoTaskDb
import com.pragati.taskflow.foundation.datasource.local.model.ToDoTaskWithSteps
import com.pragati.taskflow.model.ToDoRepeat
import com.pragati.taskflow.model.ToDoStatus
import com.pragati.taskflow.model.ToDoTask
import org.junit.Assert
import org.junit.Test

class ToDoTaskWithStepsExtTest {

    @Test
    fun toTask() {
        Assert.assertEquals(
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
            ),
            listOf(
                ToDoTaskWithSteps(
                    task = ToDoTaskDb(
                        id = "id",
                        name = "name",
                        status = ToDoStatus.IN_PROGRESS,
                        dueDate = null,
                        repeat = ToDoRepeat.NEVER,
                        listId = "listId",
                        createdAt = DateFactory.constantDate,
                        updatedAt = DateFactory.constantDate,
                    ),
                    steps = listOf()
                )
            ).taskWithStepsToTask()
        )
    }
}
