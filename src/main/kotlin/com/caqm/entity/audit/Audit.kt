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
    @OneToOne
    @JoinColumn
    val department: Department,
    val plannedStartDate: LocalDateTime,
    val plannedEndDate: LocalDateTime,
    val realStartDate: LocalDateTime,
    val realEndDate: LocalDateTime,
    @OneToOne
    @JoinColumn
    val airport: Airport,
    @OneToOne
    @JoinColumn
    val process: Process,
    @OneToOne
    @JoinColumn
    val mainAuditor: User,
    @OneToMany
    @JoinColumn
    val otherAuditors: MutableList<User>,
    @OneToOne
    @JoinColumn
    val auditMethod: AuditMethod,
    /*
     * o：计划
     * 1：执行
     * 2：取消
     * 3：待关闭
     * 4：已关闭*/
    val status: Int,
    @OneToOne
    @JoinColumn
    val closeUser: User,
    val remark: String,
    @OneToMany
    @JoinColumn
    val checklists: MutableList<Checklist>? = mutableListOf(),
    @OneToMany
    @JoinColumn
    val findings: MutableList<Finding>? = mutableListOf(),
    val summary: String,
) : BaseEntity()
