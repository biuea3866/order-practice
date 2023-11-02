package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "LikeBasket")
class LikeBasketEntity(
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_id")
    val userId: Long,
): BaseEntity() {
}