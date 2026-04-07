package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.model.Credential
import org.junit.Assert
import org.junit.Test

class CredentialExtTest {

    @Test
    fun isLoggedIn() {
        val credential = Credential("token-123")

        Assert.assertTrue(credential.isLoggedIn())
    }

    @Test
    fun isNotLoggedIn() {
        val credential = Credential("")

        Assert.assertFalse(credential.isLoggedIn())
    }

}
