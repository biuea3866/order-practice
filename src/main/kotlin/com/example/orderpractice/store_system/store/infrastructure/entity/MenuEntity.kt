package com.example.orderpractice.store_system.store.infrastructure.entity

import javax.persistence.*

@Entity
@Table(name = "Menu")
class MenuEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,

    val price: Int,

    val detail: String,

    val recommendMenu: Boolean,
) {
}