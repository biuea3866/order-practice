package com.example.orderpractice.user_system.user.infrastructure.entity.mapper

import com.example.orderpractice.user_system.user.domain.model.Review
import com.example.orderpractice.user_system.user.infrastructure.entity.ReviewEntity

fun Review.toEntity(): ReviewEntity = ReviewEntity(
    id = this.id,
    title = this.title,
    score = this.score,
    userId = this.userId,
    storeId = this.storeId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun ReviewEntity.toDomain(): Review = Review(
    id = this.id,
    title = this.title,
    score = this.score,
    userId = this.userId,
    storeId = this.storeId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)