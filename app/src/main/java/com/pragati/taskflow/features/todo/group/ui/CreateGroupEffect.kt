package com.pragati.taskflow.features.todo.group.ui

sealed class CreateGroupEffect {
    object HideScreen : CreateGroupEffect()
    data class ShowUpdateGroupListScreen(val groupId: String) : CreateGroupEffect()
}
