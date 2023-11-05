package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "ShoppingBasket")
class ShoppingBasketEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_id")
    val userId: Long,
    createdAt: ZonedDateTime,
    updatedAt: ZonedDateTime,
    deletedAt: ZonedDateTime?,
    updatedBy: Long,
    createdBy: Long
): BaseEntity(
    createdAt = createdAt,
    updatedAt = updatedAt,
    deletedAt = deletedAt,
    updatedBy = updatedBy,
    createdBy = createdBy,
) {
}