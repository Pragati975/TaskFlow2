package com.pragati.taskflow.features.todo.all.ui

import com.pragati.taskflow.model.ToDoTask

sealed class AllAction {
    sealed class TaskAction : AllAction() {
        data class Delete(val task: ToDoTask) : TaskAction()
        data class OnToggleStatus(val task: ToDoTask) : TaskAction()
    }

    object ToggleCompleteTaskVisibility : AllAction()
}
