package com.example.orderpractice.payment_system.point.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "Point")
class PointEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "point")
    val point: Long,

    @Column(name = "log")
    val log: String,

    @Column(
        name = "user_id",
        updatable = false
    )
    val userId: Long
): BaseEntity() {
}