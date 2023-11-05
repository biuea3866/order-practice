package com.example.orderpractice.user_system.user.infrastructure.entity.mapper

import com.example.orderpractice.user_system.user.domain.model.LikeBasket
import com.example.orderpractice.user_system.user.domain.model.LikeBasketStoreRelation
import com.example.orderpractice.user_system.user.infrastructure.entity.LikeBasketEntity
import com.example.orderpractice.user_system.user.infrastructure.entity.LikeBasketStoreRelationEntity

fun LikeBasket.toEntity(): LikeBasketEntity = LikeBasketEntity(
    id = this.id,
    userId = this.userId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun LikeBasketEntity.toDomain(): LikeBasket = LikeBasket(
    id = this.id,
    userId = this.userId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun LikeBasketStoreRelation.toEntity(): LikeBasketStoreRelationEntity = LikeBasketStoreRelationEntity(
    id = this.id,
    likeBasketId = this.likeBasketId,
    storeId = this.storeId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun LikeBasketStoreRelationEntity.toDomain(): LikeBasketStoreRelation = LikeBasketStoreRelation(
    id = this.id,
    likeBasketId = this.likeBasketId,
    storeId = this.storeId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)