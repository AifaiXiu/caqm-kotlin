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
    @ManyToOne
    @JoinColumn
    val department: Department? = null,
    val status: Int,
    val remark: String,
    @ManyToMany
    @JoinTable(
        name = "checklist_file",
        joinColumns = [JoinColumn(name = "checklist_id")],
        inverseJoinColumns = [JoinColumn(name = "file_id")],
    )
    val files: MutableList<File>? = mutableListOf(),
    // 这里是将外键字段交给了checklistItem进行维护
    @OneToMany
    @JoinColumn(name = "checklist_id")
    val checklistItems: MutableList<ChecklistItem>? = mutableListOf(),
) : BaseEntity()
