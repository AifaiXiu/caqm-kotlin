@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.dataitem

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "root_analyze")
data class RootAnalyze(
    val name: String,
    @ManyToOne
    @JoinColumn
    val parent: RootAnalyze? = null,
) : BaseEntity()
