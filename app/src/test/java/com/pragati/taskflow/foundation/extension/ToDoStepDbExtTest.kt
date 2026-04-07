package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toStep
import com.pragati.taskflow.foundation.datasource.local.model.ToDoStepDb
import com.pragati.taskflow.model.ToDoStatus
import com.pragati.taskflow.model.ToDoStep
import org.junit.Assert
import org.junit.Test

class ToDoStepDbExtTest {

    @Test
    fun toStepDb() {
        Assert.assertEquals(
            listOf(
                ToDoStep(
                    id = "id",
                    name = "name",
                    status = ToDoStatus.IN_PROGRESS,
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ),
            listOf(
                ToDoStepDb(
                    id = "id",
                    name = "name",
                    status = ToDoStatus.IN_PROGRESS,
                    taskId = "taskId",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ).toStep()
        )
    }
}
