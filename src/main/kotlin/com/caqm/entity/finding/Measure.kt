@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import com.caqm.entity.BaseEntity
import com.caqm.entity.sys.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "measure")
data class Measure(
    @ManyToOne
    @JoinColumn
    val dutyMan: User? = null,
    @ManyToOne
    @JoinColumn
    val finisher: User? = null,
    val targetDate: LocalDateTime,
    val finishDate: LocalDateTime,
    val details: String,
    /*
     * 0:跟进措施
     * 1：纠正措施*/
    val type: Int,
) : BaseEntity()
