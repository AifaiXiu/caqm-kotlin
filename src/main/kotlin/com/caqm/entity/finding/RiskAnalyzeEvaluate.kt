@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import com.caqm.entity.BaseEntity
import com.caqm.entity.dataitem.Department
import com.caqm.entity.dataitem.RootAnalyze
import com.caqm.entity.sys.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "risk_analyze_evaluate")
data class RiskAnalyzeEvaluate(
    @ManyToOne
    @JoinColumn
    val rootAnalyze: RootAnalyze? = null,
    @ManyToOne
    @JoinColumn
    val relatedDept: Department? = null,
    @ManyToOne
    @JoinColumn
    val dutyMan: User? = null,
    /*
     * 0:高
     * 1:中
     * 2:低*/
    val possibility: Int,
    /*
     * 0:高
     * 1:中
     * 2:低*/
    val severity: Int,
    /*
     * 0:高
     * 1:中
     * 2:低*/
    val riskValue: Int,
    /*
     * 1:是
     * 0:否*/
    val isSecure: Int,
    val eventDiscribe: String,
    val excuteDate: LocalDateTime,
) : BaseEntity()
