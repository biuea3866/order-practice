package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "ShoppingBasketMenuRelation")
class ShoppingBasketMenuRelationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_id")
    val userId: Long,

    @Column(name = "menu_id")
    val menuId: Long
): BaseEntity() {
}