package com.caqm.repository.audit

import com.caqm.entity.audit.AuditEvaluates
import org.springframework.data.jpa.repository.JpaRepository

interface AuditEvaluatesRepository : JpaRepository<AuditEvaluates, Long>
