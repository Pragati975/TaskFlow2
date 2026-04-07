package com.pragati.taskflow.model

data class TaskWithList(
    val list: ToDoList,
    val task: ToDoTask
)
