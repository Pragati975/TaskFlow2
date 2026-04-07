package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.model.Credential

fun Credential.isLoggedIn() = token.isNotBlank()
