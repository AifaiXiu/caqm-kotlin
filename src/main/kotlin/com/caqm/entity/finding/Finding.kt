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
    @OneToOne
    @JoinColumn
    val audit: Audit,
    /*
     * 1:开启
     * 0:关闭*/
    val status: Int,
    @OneToOne
    @JoinColumn
    val process: Process,
    @OneToOne
    @JoinColumn
    val airport: Airport,
    @OneToOne
    @JoinColumn
    val user: User,
    val targetCloseTime: LocalDateTime,
    @OneToOne
    @JoinColumn
    val closer: User,
    @OneToOne
    @JoinColumn
    val detpt: Department,
    @OneToOne
    @JoinColumn
    val findingType: FindingType,
    val evaluateResult: String,
    @OneToOne
    @JoinColumn
    val measure: Measure,
    @OneToOne
    @JoinColumn
    val riskAnalyzeEvaluate: RiskAnalyzeEvaluate,
) : BaseEntity()
