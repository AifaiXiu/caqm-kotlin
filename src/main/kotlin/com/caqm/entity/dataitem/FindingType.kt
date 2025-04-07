@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.finding

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "finding_type")
data class FindingType(
    val name: String,
) : BaseEntity()
