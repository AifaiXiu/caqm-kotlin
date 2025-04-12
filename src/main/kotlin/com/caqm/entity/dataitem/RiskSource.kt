@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.dataitem

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "risk_sourc")
data class RiskSource(
    val name: String,
    @ManyToOne
    @JoinColumn(name = "parent_id")
    val parent: RiskSource? = null,
) : BaseEntity()
