package com.caqm.repository.dataitem

import com.caqm.entity.finding.FindingTypes
import org.springframework.data.jpa.repository.JpaRepository

interface FindingTypesRepository : JpaRepository<FindingTypes, Long>
