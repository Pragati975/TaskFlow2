package com.pragati.taskflow.features.todo.scheduled.data

import com.pragati.taskflow.foundation.datasource.local.provider.ToDoTaskProvider
import com.pragati.taskflow.foundation.extension.toggleStatusHandler
import com.pragati.taskflow.foundation.wrapper.DateTimeProvider
import com.pragati.taskflow.foundation.wrapper.IdProvider
import com.pragati.taskflow.model.TaskWithList
import com.pragati.taskflow.model.ToDoTask
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import java.time.LocalDateTime
import javax.inject.Inject

class ScheduledEnvironment @Inject constructor(
    private val toDoTaskProvider: ToDoTaskProvider,
    override val idProvider: IdProvider,
    override val dateTimeProvider: DateTimeProvider,
) : IScheduledEnvironment {

    override fun getToDoTaskWithStepsOrderByDueDateWithList(maxDate: LocalDateTime?): Flow<List<TaskWithList>> {
        val operation = if (maxDate != null) {
            toDoTaskProvider.getTaskWithListOrderByDueDateToday(maxDate)
        } else {
            toDoTaskProvider.getTaskWithListOrderByDueDate()
        }

        return operation
            .distinctUntilChanged()
    }

    override suspend fun toggleTaskStatus(toDoTask: ToDoTask) {
        val currentDate = dateTimeProvider.now()
        toDoTask.toggleStatusHandler(
            currentDate,
            { completedAt, newStatus ->
                toDoTaskProvider.updateTaskStatus(toDoTask.id, newStatus, completedAt, currentDate)
            },
            { nextDueDate ->
                toDoTaskProvider.updateTaskDueDate(toDoTask.id, nextDueDate, toDoTask.isDueDateTimeSet, currentDate)
            }
        )
    }

    override suspend fun deleteTask(task: ToDoTask) {
        toDoTaskProvider.deleteTaskById(task.id)
    }

}
