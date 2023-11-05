package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "LikeBasketStoreRelation")
class LikeBasketStoreRelationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "like_basket_id")
    val likeBasketId: Long,

    @Column(name = "store_id")
    val storeId: Long,
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