@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.sys

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "files")
data class Files(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "name")
    var name: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "parent_name")
    var parentName: String? = null,
    @Column(name = "file_path")
    var filePath: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
