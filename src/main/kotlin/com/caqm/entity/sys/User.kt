@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.sys

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "username")
    var username: String? = null,
    @Column(name = "dept_name")
    var deptName: String? = null,
    @Column(name = "email")
    var email: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "passwd")
    var passwd: String? = null,
    @Column(name = "role_name")
    var roleName: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
