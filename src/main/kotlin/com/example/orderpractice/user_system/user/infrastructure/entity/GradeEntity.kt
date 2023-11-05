package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.user.domain.model.constants.GradeStatus
import java.time.ZonedDateTime
import javax.persistence.*

// 테스트를 위한 주석
@Entity
@Table(name = "Grade")
class GradeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "grade")
    val grade: GradeStatus,

    @Column(name = "grade_point")
    val gradePoint: Int,

    @Column(name = "user_id")
    val userId: Long,
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