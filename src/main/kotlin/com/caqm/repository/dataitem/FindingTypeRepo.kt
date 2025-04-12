package com.caqm.repository.dataitem

import com.caqm.entity.finding.FindingType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface FindingTypeRepo : JpaRepository<FindingType, Long>
