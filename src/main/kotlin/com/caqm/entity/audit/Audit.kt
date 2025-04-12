@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.audit

import com.caqm.entity.BaseEntity
import com.caqm.entity.checklist.Checklist
import com.caqm.entity.dataitem.Airport
import com.caqm.entity.dataitem.AuditMethod
import com.caqm.entity.dataitem.Department
import com.caqm.entity.dataitem.Process
import com.caqm.entity.finding.Finding
import com.caqm.entity.sys.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "audit")
data class Audit(
    val name: String,
    @ManyToOne
    @JoinColumn
    val department: Department,
    val plannedStartDate: LocalDateTime,
    val plannedEndDate: LocalDateTime,
    val realStartDate: LocalDateTime,
    val realEndDate: LocalDateTime,
    @ManyToOne
    @JoinColumn
    val airport: Airport,
    @ManyToOne
    @JoinColumn
    val process: Process,
    @ManyToOne
    @JoinColumn
    val mainAuditor: User,
    @ManyToMany
    @JoinTable(
        name = "audit_other_auditor",
        joinColumns = [JoinColumn(name = "audit_id")],
        inverseJoinColumns = [JoinColumn(name = "user_id")],
    )
    val otherAuditors: MutableList<User>,
    @ManyToOne
    @JoinColumn
    val auditMethod: AuditMethod,
    /*
     * o：计划
     * 1：执行
     * 2：取消
     * 3：待关闭
     * 4：已关闭*/
    val status: Int,
    @ManyToOne
    @JoinColumn
    val closeUser: User,
    val remark: String,
    @ManyToMany
    @JoinTable(
        name = "audit_checklist",
        joinColumns = [JoinColumn(name = "audit_id")],
        inverseJoinColumns = [JoinColumn(name = "checklist_id")],
    )
    val checklists: MutableList<Checklist>? = mutableListOf(),
    @ManyToMany
    @JoinTable(
        name = "audit_finding",
        joinColumns = [JoinColumn(name = "audit_id")],
        inverseJoinColumns = [JoinColumn(name = "finding_id")],
    )
    val findings: MutableList<Finding>? = mutableListOf(),
    val summary: String,
) : BaseEntity()
