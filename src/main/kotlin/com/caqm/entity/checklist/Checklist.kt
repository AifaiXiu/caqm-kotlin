@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.checklist

import com.caqm.entity.BaseEntity
import com.caqm.entity.dataitem.Department
import com.caqm.entity.sys.File
import jakarta.persistence.*

@Entity
@Table(name = "checklist")
data class Checklist(
    val name: String,
    @OneToOne
    @JoinColumn
    val department: Department? = null,
    val status: Int,
    val remark: String,
    @OneToMany
    @JoinColumn
    val files: MutableList<File>? = mutableListOf(),
    @OneToMany
    @JoinColumn
    val checklistItems: MutableList<ChecklistItem>? = mutableListOf(),
) : BaseEntity()
