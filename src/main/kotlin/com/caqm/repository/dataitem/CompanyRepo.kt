package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface CompanyRepo : JpaRepository<Company, Long>
