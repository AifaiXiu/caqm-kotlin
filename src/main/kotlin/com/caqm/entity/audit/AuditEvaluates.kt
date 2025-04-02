package com.caqm.entity.audit

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "audit_evaluates")
data class AuditEvaluates(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "audit_name")
    var auditName: String? = null,
    @Column(name = "checklist_name")
    var checklistName: String? = null,
    @Column(name = "checklist_item_name")
    var checklistItemName: String? = null,
    @Column(name = "checklist_content")
    var checklistContent: String? = null,
    @Column(name = "auditor")
    var auditor: String? = null,
    @Column(name = "finding_name")
    var findingName: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "summary")
    var summary: String? = null,
    @Column(name = "file_names")
    var fileNames: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
