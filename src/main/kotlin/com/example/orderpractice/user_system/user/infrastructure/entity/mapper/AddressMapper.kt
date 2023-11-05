package com.example.orderpractice.user_system.user.infrastructure.entity.mapper

import com.example.orderpractice.user_system.user.domain.model.Address
import com.example.orderpractice.user_system.user.infrastructure.entity.AddressEntity

fun Address.toEntity(): AddressEntity = AddressEntity(
    id = this.id,
    userId = this.userId,
    address = this.address,
    detailAddress = this.detailAddress,
    createdAt = this.createdAt,
    updatedAt = this.updatedAt,
    deletedAt = this.deletedAt,
    updatedBy = this.updatedBy,
    createdBy = this.createdBy,
)

fun AddressEntity.toDomain(): Address = Address(
    id = this.id,
    userId = this.userId,
    address = this.address,
    detailAddress = this.detailAddress,
    createdAt = this.createdAt,
    updatedAt = this.updatedAt,
    deletedAt = this.deletedAt,
    updatedBy = this.updatedBy,
    createdBy = this.createdBy,
)