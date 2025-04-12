package com.caqm.repository.finding

import com.caqm.entity.finding.RiskAnalyzeEvaluate
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface RiskAnalyzeEvaluateRepo : JpaRepository<RiskAnalyzeEvaluate, Long>
