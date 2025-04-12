@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.dataitem

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "department")
data class Department(
    val name: String,
    @ManyToOne
    @JoinColumn(name = "parent_id")
    val parent: Department? = null,
) : BaseEntity()
