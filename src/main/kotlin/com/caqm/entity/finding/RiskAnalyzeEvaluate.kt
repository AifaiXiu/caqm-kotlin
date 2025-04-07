@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import com.caqm.entity.BaseEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "risk_analyze_evaluate")
data class RiskAnalyzeEvaluate(
    val findingName: String? = null,
    val rootName: String? = null,
    val riskRelatedDeptName: String? = null,
    val dutyMan: String? = null,
    val possibility: Int? = null,
    val severity: Int? = null,
    val riskValue: Int? = null,
    val isSecure: Int? = null,
    val eventDiscribe: String? = null,
    val excuteDate: LocalDateTime? = null,
) : BaseEntity()
