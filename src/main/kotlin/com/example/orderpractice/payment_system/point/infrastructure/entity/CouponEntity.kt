package com.example.orderpractice.payment_system.point.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.payment_system.point.infrastructure.constants.CouponStatus
import javax.persistence.*

@Entity
@Table(name = "Coupon")
class CouponEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "name")
    val name: Long,

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    val status: CouponStatus,

    @Column(name = "log")
    val log: String,

    @Column(
        name = "user_id",
        updatable = false
    )
    val userId: Long,
): BaseEntity(
) {
}