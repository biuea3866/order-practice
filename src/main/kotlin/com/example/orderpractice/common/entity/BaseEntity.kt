package com.example.orderpractice.common.entity

import java.time.ZonedDateTime
import javax.persistence.*

@MappedSuperclass // 엔티티 클래스끼리 상속받기 위한 어노테이션
open class BaseEntity(
    @Column(
        name = "created_at",
        updatable = false
    )
    var createdAt: ZonedDateTime,

    @Column(name = "updated_at")
    var updatedAt: ZonedDateTime,

    @Column(name = "deleted_at")
    val deletedAt: ZonedDateTime?,

    @Column(name = "updated_by")
    val updatedBy: Long,

    @Column(name = "created_by")
    val createdBy: Long
) {
    // 영속화 시에 동작
    @PrePersist
    fun prePersist() {
        this.createdAt = ZonedDateTime.now()
        this.updatedAt = ZonedDateTime.now()
    }

    // 변경 감지 시에 동작
    @PreUpdate
    fun preUpdate() {
        this.updatedAt = ZonedDateTime.now()
    }
}