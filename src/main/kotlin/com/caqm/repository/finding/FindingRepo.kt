package com.caqm.repository.finding

import com.caqm.entity.finding.Finding
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin
// 定义一个接口 FindingRepo，该接口继承自 JpaRepository 接口
// JpaRepository 是 Spring Data JPA 提供的一个接口，用于简化 JPA (Java Persistence API) 的操作
// 该接口的第一个泛型参数 Finding 表示该仓库接口操作的实体类是 Finding
// 第二个泛型参数 Long 表示 Finding 实体类的主键类型是 Long

@CrossOrigin
interface FindingRepo : JpaRepository<Finding, Long>
