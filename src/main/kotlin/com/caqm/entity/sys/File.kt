@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.sys

import com.caqm.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "file")
data class File(
    val name: String,
    val status: Int,
    @ManyToOne
    @JoinColumn
    val parent: File? = null,
    val filePath: String,
) : BaseEntity()
