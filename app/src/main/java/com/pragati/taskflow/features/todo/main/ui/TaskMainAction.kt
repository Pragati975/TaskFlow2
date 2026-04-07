package com.pragati.taskflow.features.todo.main.ui

import android.os.Bundle

sealed class TaskMainAction {
    data class DeleteList(val itemListType: ItemMainState.ItemListType) : TaskMainAction()
    data class NavBackStackEntryChanged(
        val route: String?,
        val arguments: Bundle?
    ) : TaskMainAction()
}
