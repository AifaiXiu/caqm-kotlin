@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "findings")
data class Finding(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "audit_name")
    var auditName: String? = null,
    @Column(name = "status")
    var status: Int? = null,
    @Column(name = "process_name")
    var processName: String? = null,
    @Column(name = "airport_name")
    var airportName: String? = null,
    @Column(name = "user_name")
    var userName: String? = null,
    @Column(name = "target_close_time")
    var targetCloseTime: LocalDateTime? = null,
    @Column(name = "closer")
    var closer: String? = null,
    @Column(name = "detp_name")
    var detpName: String? = null,
    @Column(name = "finding_type_name")
    var findingTypeName: String? = null,
    @Column(name = "evaluate_result")
    var evaluateResult: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
