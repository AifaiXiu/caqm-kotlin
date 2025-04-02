package com.caqm.repository.sys

import com.caqm.entity.sys.Roles
import org.springframework.data.jpa.repository.JpaRepository

interface RolesRepository : JpaRepository<Roles, Long>
