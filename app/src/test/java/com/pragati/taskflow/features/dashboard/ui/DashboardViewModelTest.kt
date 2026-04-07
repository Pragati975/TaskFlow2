package com.pragati.taskflow.features.dashboard.ui

import app.cash.turbine.test
import com.pragati.taskflow.BaseViewModelTest
import com.pragati.taskflow.features.dashboard.data.IDashboardEnvironment
import com.pragati.taskflow.model.ToDoTaskDiff
import com.pragati.taskflow.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Test
import kotlin.time.ExperimentalTime

@ExperimentalTime
@ExperimentalCoroutinesApi
class DashboardViewModelTest : BaseViewModelTest() {

    @Test
    fun init() = runTest {
        val fakeDashboardEnvironment = buildFakeDashboardEnvironment(User("pragati@dev.id"))
        val dashboardViewModel = DashboardViewModel(fakeDashboardEnvironment)

        dashboardViewModel.state.test {
            Assert.assertEquals(User("pragati@dev.id"), awaitItem().user)

            cancelAndConsumeRemainingEvents()
        }
    }

    private fun buildFakeDashboardEnvironment(user: User) = object : IDashboardEnvironment {
        override fun getUser(): Flow<User> {
            return flow { emit(user) }
        }

        override fun listenToDoTaskDiff(): Flow<ToDoTaskDiff> {
            return flow { emit(ToDoTaskDiff(mapOf(), mapOf(), mapOf())) }
        }
    }
}
