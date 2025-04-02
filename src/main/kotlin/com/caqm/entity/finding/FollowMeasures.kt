@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "follow_measures")
data class FollowMeasures(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "finding_name")
    var findingName: String? = null,
    @Column(name = "duty_man")
    var dutyMan: String? = null,
    @Column(name = "finisher")
    var finisher: String? = null,
    @Column(name = "target_date")
    var targetDate: LocalDateTime? = null,
    @Column(name = "finish_date")
    var finishDate: LocalDateTime? = null,
    @Column(name = "details")
    var details: String? = null,
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
