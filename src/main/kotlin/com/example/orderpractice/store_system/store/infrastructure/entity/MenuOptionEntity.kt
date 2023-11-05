package com.example.orderpractice.store_system.store.infrastructure.entity

import javax.persistence.*

@Entity
@Table(name = "MenuOption")
class MenuOptionEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val menuId: Long
) {
}