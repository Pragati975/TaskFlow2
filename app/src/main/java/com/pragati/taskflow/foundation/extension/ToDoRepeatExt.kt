package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.R
import com.pragati.taskflow.model.ToDoRepeat

fun ToDoRepeat.displayable(): Int {
    return when (this) {
        ToDoRepeat.NEVER -> R.string.todo_repeat_never
        ToDoRepeat.DAILY -> R.string.todo_repeat_daily
        ToDoRepeat.WEEKDAYS -> R.string.todo_repeat_weekdays
        ToDoRepeat.WEEKLY -> R.string.todo_repeat_weekly
        ToDoRepeat.MONTHLY -> R.string.todo_repeat_monthly
        ToDoRepeat.YEARLY -> R.string.todo_repeat_yearly
    }
}
