package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "LikeBasketStoreRelation")
class LikeBasketStoreRelationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_id")
    val userId: Long,

    @Column(name = "store_id")
    val storeId: Long
): BaseEntity() {
}