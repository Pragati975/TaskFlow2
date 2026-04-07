package com.pragati.taskflow.features.todo.scheduled.ui

import androidx.compose.runtime.Immutable
import com.pragati.taskflow.model.TaskWithList
import com.pragati.taskflow.model.ToDoList
import com.pragati.taskflow.model.ToDoStatus
import com.pragati.taskflow.model.ToDoTask
import java.time.LocalDate

@Immutable
data class ScheduledState(
    val tasks: List<TaskWithList> = listOf(),
    val hideCompleteTask: Boolean = true,
    val isScheduled: Boolean = true
) {
    private val tasksFiltered = if (hideCompleteTask && isScheduled) {
        tasks.filter { (_, task) ->
            task.status != ToDoStatus.COMPLETE
        }
    } else {
        tasks
    }

    val items: List<ItemScheduledState> = tasksFiltered.toItemScheduledState(isScheduled)
}

sealed class ItemScheduledState {
    data class Header(val date: LocalDate) : ItemScheduledState()

    sealed class Task(
        open val task: ToDoTask,
        open val list: ToDoList
    ) : ItemScheduledState() {
        data class Complete(
            override val task: ToDoTask,
            override val list: ToDoList
        ) : Task(task, list)

        data class InProgress(
            override val task: ToDoTask,
            override val list: ToDoList
        ) : Task(task, list)
    }
}
