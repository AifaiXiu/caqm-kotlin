@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.checklist

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "checklists")
data class Checklists(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "name")
    var name: String? = null,
    @Column(name = "dept_name")
    var deptName: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "remark")
    var remark: String? = null,
    @Column(name = "file_names")
    var fileNames: String? = null,
    @Column(name = "checklist_item_names")
    var checklistItemNames: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
