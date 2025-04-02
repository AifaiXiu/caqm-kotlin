package com.caqm.repository.sys

import com.caqm.entity.sys.RolePermissions
import org.springframework.data.jpa.repository.JpaRepository

interface RolePermissionsRepository : JpaRepository<RolePermissions, Long>
