package com.pragati.taskflow.features.todo.main.di

import com.pragati.taskflow.features.todo.main.data.ITaskMainEnvironment
import com.pragati.taskflow.features.todo.main.data.TaskMainEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class TaskMainModule {

    @Binds
    abstract fun provideEnvironment(
        environment: TaskMainEnvironment
    ): ITaskMainEnvironment

}
