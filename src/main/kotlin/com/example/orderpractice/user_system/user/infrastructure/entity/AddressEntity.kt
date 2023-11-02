package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "Address")
class AddressEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_id")
    val userId: Long,

    @Column(name = "address")
    val address: String,

    @Column(name = "detail_address")
    val detailAddress: String?
): BaseEntity() {
}