package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.user.infrastructure.constants.GradeStatus
import javax.persistence.*

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
): BaseEntity() {
}