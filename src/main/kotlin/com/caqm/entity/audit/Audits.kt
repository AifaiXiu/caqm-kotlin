@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.audit

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "audits")
data class Audits(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "name")
    var name: String? = null,
    @Column(name = "dept_name")
    var deptName: String? = null,
    @Column(name = "planned_start_date")
    var plannedStartDate: LocalDateTime? = null,
    @Column(name = "planned_end_date")
    var plannedEndDate: LocalDateTime? = null,
    @Column(name = "real_start_date")
    var realStartDate: LocalDateTime? = null,
    @Column(name = "real_end_date")
    var realEndDate: LocalDateTime? = null,
    @Column(name = "aiport_name")
    var aiportName: String? = null,
    @Column(name = "process_name")
    var processName: String? = null,
    @Column(name = "main_auditor")
    var mainAuditor: String? = null,
    @Column(name = "other_auditors")
    var otherAuditors: String? = null,
    @Column(name = "method_name")
    var methodName: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "close_user")
    var closeUser: String? = null,
    @Column(name = "remark")
    var remark: String? = null,
    @Column(name = "checklist_names")
    var checklistNames: String? = null,
    @Column(name = "finding_names")
    var findingNames: String? = null,
    @Column(name = "summary")
    var summary: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
