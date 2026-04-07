package com.pragati.taskflow.foundation.extension

import androidx.compose.ui.graphics.Color
import com.pragati.taskflow.features.todo.detail.ui.ColorItem
import com.pragati.taskflow.foundation.theme.ListBlue
import com.pragati.taskflow.foundation.theme.ListBrown
import com.pragati.taskflow.foundation.theme.ListGreen
import com.pragati.taskflow.foundation.theme.ListOrange
import com.pragati.taskflow.foundation.theme.ListPurple
import com.pragati.taskflow.foundation.theme.ListRed
import com.pragati.taskflow.foundation.theme.ListYellow
import com.pragati.taskflow.model.ToDoColor

fun ToDoColor.toColor() = when (this) {
    ToDoColor.BLUE -> ListBlue
    ToDoColor.RED -> ListRed
    ToDoColor.GREEN -> ListGreen
    ToDoColor.YELLOW -> ListYellow
    ToDoColor.ORANGE -> ListOrange
    ToDoColor.PURPLE -> ListPurple
    ToDoColor.BROWN -> ListBrown
}

fun Color.toToDoColor() = when (this) {
    ListRed -> ToDoColor.RED
    ListGreen -> ToDoColor.GREEN
    ListYellow -> ToDoColor.YELLOW
    ListOrange -> ToDoColor.ORANGE
    ListPurple -> ToDoColor.PURPLE
    ListBrown -> ToDoColor.BROWN
    else -> ToDoColor.BLUE
}

