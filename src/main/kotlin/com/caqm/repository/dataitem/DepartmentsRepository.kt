package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Departments
import org.springframework.data.jpa.repository.JpaRepository

interface DepartmentsRepository : JpaRepository<Departments, Long>
