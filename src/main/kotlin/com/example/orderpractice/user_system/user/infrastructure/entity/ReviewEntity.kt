package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.user.infrastructure.constants.ScoreStatus
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
): BaseEntity() {
}