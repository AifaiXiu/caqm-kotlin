@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import com.caqm.entity.BaseEntity
import com.caqm.entity.audit.Audit
import com.caqm.entity.dataitem.Airport
import com.caqm.entity.dataitem.Department
import com.caqm.entity.dataitem.Process
import com.caqm.entity.sys.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "finding")
data class Finding(
    @ManyToOne
    @JoinColumn
    val audit: Audit,
    /*
     * 1:开启
     * 0:关闭*/
    val status: Int,
    @ManyToOne
    @JoinColumn
    val process: Process,
    @ManyToOne
    @JoinColumn
    val airport: Airport,
    @ManyToOne
    @JoinColumn
    val user: User,
    val targetCloseTime: LocalDateTime,
    @ManyToOne
    @JoinColumn
    val closer: User,
    @ManyToOne
    @JoinColumn
    val dept: Department,
    @ManyToOne
    @JoinColumn
    val findingType: FindingType,
    val evaluateResult: String,
    @OneToMany
    @JoinColumn(name = "finding_id")
    val measure: MutableList<Measure>? = mutableListOf(),
    @ManyToOne
    @JoinColumn
    val riskAnalyzeEvaluate: RiskAnalyzeEvaluate,
) : BaseEntity()
