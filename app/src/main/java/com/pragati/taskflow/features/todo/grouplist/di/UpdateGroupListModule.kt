package com.pragati.taskflow.features.todo.grouplist.di

import com.pragati.taskflow.features.todo.grouplist.data.IUpdateGroupListEnvironment
import com.pragati.taskflow.features.todo.grouplist.data.UpdateGroupListEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class UpdateGroupListModule {

    @Binds
    abstract fun provideEnvironment(
        environment: UpdateGroupListEnvironment
    ): IUpdateGroupListEnvironment

}
