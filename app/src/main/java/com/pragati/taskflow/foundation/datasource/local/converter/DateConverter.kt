package com.pragati.taskflow.foundation.datasource.local.converter

import androidx.room.TypeConverter
import com.pragati.foundation.coredatetime.toLocalDateTime
import com.pragati.foundation.coredatetime.toMillis
import java.time.LocalDateTime

class DateConverter {

    @TypeConverter
    fun toDate(date: Long?): LocalDateTime? {
        if (date == null) return null

        return date.toLocalDateTime()
    }

    @TypeConverter
    fun toDateLong(date: LocalDateTime?): Long? {
        if (date == null) return null

        return date.toMillis()
    }

}
