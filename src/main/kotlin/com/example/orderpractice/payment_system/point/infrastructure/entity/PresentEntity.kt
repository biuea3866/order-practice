package com.example.orderpractice.payment_system.point.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.point.infrastructure.constants.PresentStatus
import javax.persistence.*

@Entity
@Table(name = "Present")
class PresentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    val status: PresentStatus,

    @Column(name = "title")
    val title: String,

    @Column(name = "content")
    val content: String,

    @Column(name = "donor_id")
    val donorId: Long,

    @Column(name = "recipient_id")
    val recipientId: Long,
): BaseEntity() {
}