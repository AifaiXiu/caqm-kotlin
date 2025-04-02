@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.checklist

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "checklist_items")
data class ChecklistItems(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "name")
    var name: String? = null,
    @Column(name = "details")
    var details: String? = null,
    @Column(name = "file_names")
    var fileNames: String? = null,
    @Column(name = "remark")
    var remark: String? = null,
    @Column(name = "guidance")
    var guidance: String? = null,
    @Column(name = "actions")
    var actions: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
