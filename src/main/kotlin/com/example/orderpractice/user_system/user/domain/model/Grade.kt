package com.example.orderpractice.user_system.user.domain.model

import com.example.orderpractice.user_system.user.domain.model.constants.GradeStatus
import java.time.ZonedDateTime

data class Grade(
    val id: Long,
    val grade: GradeStatus,
    val gradePoint: Int,
    val userId: Long,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val deletedAt: ZonedDateTime?,
    val updatedBy: Long?,
    val createdBy: Long?
) {
}