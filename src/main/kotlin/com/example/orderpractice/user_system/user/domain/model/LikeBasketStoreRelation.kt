package com.example.orderpractice.user_system.user.domain.model

import java.time.ZonedDateTime

class LikeBasketStoreRelation(
    val id: Long,
    val likeBasketId: Long,
    val storeId: Long,
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
    val deletedAt: ZonedDateTime?,
    val updatedBy: Long,
    val createdBy: Long
) {
}