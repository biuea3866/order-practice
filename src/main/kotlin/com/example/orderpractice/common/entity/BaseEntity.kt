package com.example.orderpractice.common.entity

import java.time.ZonedDateTime
import javax.persistence.*

@MappedSuperclass // 엔티티 클래스끼리 상속받기 위한 어노테이션
abstract class BaseEntity {
    @Column(
        name = "created_at",
        updatable = false
    )
    lateinit var createdAt: ZonedDateTime

    @Column(name = "updated_at")
    lateinit var updatedAt: ZonedDateTime

    @Column(name = "deleted_at")
    var deletedAt: ZonedDateTime? = null

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