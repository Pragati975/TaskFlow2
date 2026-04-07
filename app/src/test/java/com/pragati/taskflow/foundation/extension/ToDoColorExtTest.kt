package com.pragati.taskflow.foundation.extension

import com.pragati.taskflow.foundation.theme.ListBlue
import com.pragati.taskflow.foundation.theme.ListBrown
import com.pragati.taskflow.foundation.theme.ListGreen
import com.pragati.taskflow.foundation.theme.ListOrange
import com.pragati.taskflow.foundation.theme.ListPurple
import com.pragati.taskflow.foundation.theme.ListRed
import com.pragati.taskflow.foundation.theme.ListYellow
import com.pragati.taskflow.model.ToDoColor
import org.junit.Assert
import org.junit.Test

class ToDoColorExtTest {

    @Test
    fun toColor() {
        Assert.assertEquals(ListBlue, ToDoColor.BLUE.toColor())
        Assert.assertEquals(ListRed, ToDoColor.RED.toColor())
        Assert.assertEquals(ListGreen, ToDoColor.GREEN.toColor())
        Assert.assertEquals(ListYellow, ToDoColor.YELLOW.toColor())
        Assert.assertEquals(ListOrange, ToDoColor.ORANGE.toColor())
        Assert.assertEquals(ListPurple, ToDoColor.PURPLE.toColor())
        Assert.assertEquals(ListBrown, ToDoColor.BROWN.toColor())
    }

}
