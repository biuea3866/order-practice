package com.example.orderpractice.user_system.user.infrastructure.entity

import com.example.orderpractice.common.entity.BaseEntity
import com.example.orderpractice.user_system.user.infrastructure.constants.UserStatus
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "User")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String,

    @Column(name = "nickname")
    val nickname: String,

    @Column(name = "password")
    val password: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    val status: UserStatus,
): BaseEntity() {
}