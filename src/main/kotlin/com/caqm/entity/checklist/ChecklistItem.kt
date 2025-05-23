@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.checklist

import com.caqm.entity.BaseEntity
import com.caqm.entity.finding.Finding
import com.caqm.entity.sys.File
import com.caqm.entity.sys.User
import jakarta.persistence.*

@Entity
@Table(name = "checklist_item")
data class ChecklistItem(
    // 这是检查项的基本内容
    val name: String,
    val details: String,
    @ManyToMany
    @JoinTable(
        name = "checklist_item_file",
        joinColumns = [JoinColumn(name = "checklist_item_id")],
        inverseJoinColumns = [JoinColumn(name = "file_id")],
    )
    val files: MutableList<File>? = mutableListOf(),
    val remark: String,
    val guidance: String,
    val actions: String,
    // 下面是审计的核心内容
    @ManyToOne
    @JoinColumn
    val auditor: User? = null,
    @OneToOne
    @JoinColumn
    val finding: Finding? = null,
    /*
     * 0:符合
     * 1：文文不符
     * 2：文实不符
     * 3：不适用*/
    val status: Int,
    val summary: String,
    @ManyToMany
    @JoinTable(
        name = "checklist_item_evaluated_file",
        joinColumns = [JoinColumn(name = "checklist_item_id")],
        inverseJoinColumns = [JoinColumn(name = "file_id")],
    )
    val evaluatedFiles: MutableList<File>? = mutableListOf(),
) : BaseEntity()
