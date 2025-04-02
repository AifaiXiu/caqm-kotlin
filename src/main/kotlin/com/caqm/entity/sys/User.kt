@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.caqm.entity.sys
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "user")
// @ApiModel("用户实体类")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ApiModelProperty("用户id")
    @Column(name = "id")
    var id: Long? = null,
//    @ApiModelProperty("用户名")
    @Column(name = "username")
    var username: String? = null,
//    @ApiModelProperty("部门名称")
    @Column(name = "dept_name")
    var deptName: String? = null,
//    @ApiModelProperty("邮箱")
    @Column(name = "email")
    var email: String? = null,
//    @ApiModelProperty("状态")
    @Column(name = "status")
    var status: Int? = null,
//    @ApiModelProperty("密码")
    @Column(name = "passwd")
    var passwd: String? = null,
//    @ApiModelProperty("角色名称")
    @Column(name = "role_name")
    var roleName: String? = null,
    //    @ApiModelProperty("创建时间")
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,
    //    @ApiModelProperty("更新时间")
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
)
