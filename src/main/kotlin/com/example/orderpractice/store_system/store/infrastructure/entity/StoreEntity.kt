package com.example.orderpractice.store_system.store.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.store_system.store.infrastructure.constants.StoreCategory
import com.example.orderpractice.store_system.store.infrastructure.constants.StoreStatus
import javax.persistence.*

@Entity
@Table(name = "Store")
class StoreEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,
    val detail: String,
    val address: String,
    val detailAddress: String,
    val storeNumber: String,
    val status: StoreStatus,
    val category: StoreCategory,
    val minimumPrice: Int,
    val ownerId: Long
): BaseEntity() {
}