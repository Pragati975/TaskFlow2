package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.DateFactory
import com.pragati.taskflow.foundation.datasource.local.mapper.toGroup
import com.pragati.taskflow.foundation.datasource.local.model.ToDoGroupDb
import com.pragati.taskflow.model.ToDoGroup
import org.junit.Assert
import org.junit.Test

class ToDoGroupDbExtTest {

    @Test
    fun groupDbToGroup() {
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
                ToDoGroupDb(
                    id = "id",
                    name = "name",
                    createdAt = DateFactory.constantDate,
                    updatedAt = DateFactory.constantDate,
                )
            ).toGroup()
        )
    }

}
