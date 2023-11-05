package com.example.orderpractice.user_system.user.domain.model

import com.example.orderpractice.user_system.user.domain.model.constants.UserStatus
import java.time.ZonedDateTime

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val nickname: String,
    val password: String,
    val status: UserStatus,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val deletedAt: ZonedDateTime?,
    val updatedBy: Long,
    val createdBy: Long
) {
}