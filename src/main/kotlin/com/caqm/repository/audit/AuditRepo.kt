package com.caqm.repository.audit

import com.caqm.entity.audit.Audit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface AuditRepo : JpaRepository<Audit, Long>
