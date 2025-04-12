package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.RiskSource
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface RiskSourceRepo : JpaRepository<RiskSource, Long>
