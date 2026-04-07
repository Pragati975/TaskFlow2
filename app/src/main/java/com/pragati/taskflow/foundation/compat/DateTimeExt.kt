package com.pragati.foundation.coredatetime

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun Long.toLocalDateTime(zoneId: ZoneId = ZoneId.systemDefault()): LocalDateTime =
    LocalDateTime.ofInstant(Instant.ofEpochMilli(this), zoneId)

fun LocalDateTime.toMillis(zoneId: ZoneId = ZoneId.systemDefault()): Long =
    this.atZone(zoneId).toInstant().toEpochMilli()

fun LocalDateTime.formatDateTime(): String =
    this.format(DateTimeFormatter.ofPattern("MMM d, yyyy"))

fun LocalDateTime.isSameDay(other: LocalDateTime): Boolean =
    this.toLocalDate() == other.toLocalDate()

fun LocalDateTime.isSameHour(other: LocalDateTime): Boolean =
    isSameDay(other) && this.hour == other.hour

fun LocalDateTime.isSameMinute(other: LocalDateTime): Boolean =
    isSameHour(other) && this.minute == other.minute

fun LocalDateTime.isTomorrow(current: LocalDateTime): Boolean =
    this.toLocalDate() == current.toLocalDate().plusDays(1)

fun LocalDateTime.isYesterday(current: LocalDateTime): Boolean =
    this.toLocalDate() == current.toLocalDate().minusDays(1)

fun LocalDateTime.isFriday(): Boolean =
    this.dayOfWeek == java.time.DayOfWeek.FRIDAY
