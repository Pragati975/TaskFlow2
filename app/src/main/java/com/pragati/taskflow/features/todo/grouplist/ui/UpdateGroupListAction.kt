package com.pragati.taskflow.features.todo.grouplist.ui

import com.pragati.taskflow.model.GroupIdWithList

sealed class UpdateGroupListAction {

    data class Change(val item: GroupIdWithList) : UpdateGroupListAction()
    object Submit : UpdateGroupListAction()

}
