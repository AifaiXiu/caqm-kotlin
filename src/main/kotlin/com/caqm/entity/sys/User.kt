@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.sys
import com.caqm.entity.BaseEntity
import com.caqm.entity.dataitem.Department
import jakarta.persistence.*

@Entity
@Table(name = "user")
// @ApiModel("用户实体类")
data class User(
    val username: String,
    @OneToOne
    @JoinColumn
    val department: Department? = null,
    val email: String,
    var status: Int,
    val passwd: String,
    val roleName: String,
) : BaseEntity()
