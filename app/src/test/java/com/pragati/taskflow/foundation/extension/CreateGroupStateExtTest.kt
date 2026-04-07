package com.pragati.taskflow.foundation.extension

import androidx.compose.ui.text.input.TextFieldValue
import com.pragati.taskflow.features.todo.group.ui.CreateGroupState
import com.pragati.taskflow.features.todo.group.ui.isValidGroupName
import org.junit.Assert
import org.junit.Test

class CreateGroupStateExtTest {

    @Test
    fun validGroupName() {
        Assert.assertTrue(CreateGroupState(TextFieldValue("name")).isValidGroupName())
    }

    @Test
    fun invalidGroupName() {
        Assert.assertFalse(CreateGroupState(TextFieldValue("")).isValidGroupName())
    }

}
