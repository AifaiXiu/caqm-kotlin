package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface DepartmentRepo : JpaRepository<Department, Long>
