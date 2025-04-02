package com.caqm.repository.finding

import com.caqm.entity.finding.FindingTypes
import org.springframework.data.jpa.repository.JpaRepository

interface FindingsRepository : JpaRepository<FindingTypes, Long>
