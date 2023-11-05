package com.example.orderpractice.user_system.user.domain.model

import java.time.ZonedDateTime

data class Address(
    val id: Long,
    val userId: Long,
    val address: String,
    val detailAddress: String?,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val deletedAt: ZonedDateTime?,
    val updatedBy: Long,
    val createdBy: Long
) {
}