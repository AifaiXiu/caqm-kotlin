package com.caqm.repository.finding

import com.caqm.entity.finding.Measure
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface MeasureRepo : JpaRepository<Measure, Long>
