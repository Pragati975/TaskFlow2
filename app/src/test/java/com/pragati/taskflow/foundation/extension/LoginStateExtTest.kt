package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.features.login.ui.LoginState
import com.pragati.taskflow.features.login.ui.canLogin
import com.pragati.taskflow.features.login.ui.isValidEmail
import org.junit.Assert
import org.junit.Test

class LoginStateExtTest {

    @Test
    fun canLogin() {
        val state = LoginState(
            email = "qwe",
            password = "123"
        )

        Assert.assertTrue(state.canLogin())
    }

    @Test
    fun canNotLogin() {
        val state = LoginState(
            email = " ",
            password = " "
        )

        Assert.assertFalse(state.canLogin())
    }

    @Test
    fun validEmail() {
        val state = LoginState(
            email = "pragati@gmail.com",
            password = " "
        )

        Assert.assertTrue(state.isValidEmail())
    }

    @Test
    fun inValidEmail() {
        val state = LoginState(
            email = "pragatigmail.com",
            password = " "
        )

        Assert.assertFalse(state.isValidEmail())
    }

}
