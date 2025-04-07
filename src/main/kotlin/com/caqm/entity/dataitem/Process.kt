@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.dataitem

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "process")
data class Process(
    val name: String,
    @ManyToOne
    @JoinColumn
    val parent: Process? = null,
) : BaseEntity()
