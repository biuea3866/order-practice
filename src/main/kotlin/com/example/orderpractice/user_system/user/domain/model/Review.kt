package com.example.orderpractice.user_system.user.domain.model

import com.example.orderpractice.user_system.user.domain.model.constants.ScoreStatus
import java.time.ZonedDateTime

data class Review(
    val id: Long,
    val title: String?,
    val score: ScoreStatus,
    val userId: Long,
    val storeId: Long,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val deletedAt: ZonedDateTime?,
    val updatedBy: Long,
    val createdBy: Long
) {
}