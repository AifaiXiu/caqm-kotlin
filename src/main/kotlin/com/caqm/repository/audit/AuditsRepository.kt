package com.caqm.repository.audit

import com.caqm.entity.audit.Audits
import org.springframework.data.jpa.repository.JpaRepository

interface AuditsRepository : JpaRepository<Audits, Long>
