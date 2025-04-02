@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "risk_analyze_evaluates")
data class RiskAnalyzeEvaluates(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "finding_name")
    var findingName: String? = null,
    @Column(name = "root_name")
    var rootName: String? = null,
    @Column(name = "risk_related_dept_name")
    var riskRelatedDeptName: String? = null,
    @Column(name = "duty_man")
    var dutyMan: String? = null,
    @Column(name = "possibility")
    var possibility: Int? = null,
    @Column(name = "severity")
    var severity: Int? = null,
    @Column(name = "risk_value")
    var riskValue: Int? = null,
    @Column(name = "is_secure")
    var isSecure: Int? = null,
    @Column(name = "event_discribe")
    var eventDiscribe: String? = null,
    @Column(name = "excute_date")
    var excuteDate: LocalDateTime? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
