package com.example.orderpractice.user_system.user.infrastructure.entity.mapper

import com.example.orderpractice.user_system.user.domain.model.ShoppingBasket
import com.example.orderpractice.user_system.user.infrastructure.entity.ShoppingBasketEntity

fun ShoppingBasketEntity.toDomain(): ShoppingBasket = ShoppingBasket(
    id = this.id,
    userId = this.userId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun ShoppingBasket.toEntity(): ShoppingBasketEntity = ShoppingBasketEntity(
    id = this.id,
    userId = this.userId,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)