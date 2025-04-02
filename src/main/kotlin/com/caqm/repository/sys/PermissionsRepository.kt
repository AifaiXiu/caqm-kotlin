package com.caqm.repository.sys

import com.caqm.entity.sys.Permissions
import org.springframework.data.jpa.repository.JpaRepository

interface PermissionsRepository : JpaRepository<Permissions, Long>
