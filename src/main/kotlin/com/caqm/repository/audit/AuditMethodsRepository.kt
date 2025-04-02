package com.caqm.repository.audit

import com.caqm.entity.audit.AuditMethods
import org.springframework.data.jpa.repository.JpaRepository

interface AuditMethodsRepository : JpaRepository<AuditMethods, Long>
