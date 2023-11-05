package com.example.orderpractice.user_system.user.infrastructure.entity.mapper

import com.example.orderpractice.user_system.user.domain.model.User
import com.example.orderpractice.user_system.user.infrastructure.entity.UserEntity
import java.time.ZonedDateTime

fun UserEntity.toModel(): User = User(
    id = id,
    name = name,
    email = email,
    nickname = nickname,
    password = password,
    status = status,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)

fun User.toEntity(): UserEntity = UserEntity(
    id = id,
    name = name,
    email = email,
    nickname = nickname,
    password = password,
    status = status,
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
)