package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.user.domain.model.constants.ScoreStatus
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "Review")
class ReviewEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "title")
    val title: String?,

    @Column(name = "score")
    @Enumerated(EnumType.STRING)
    val score: ScoreStatus,

    @Column(name = "user_id")
    val userId: Long,

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