package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Companies
import org.springframework.data.jpa.repository.JpaRepository

interface CompaniesRepository : JpaRepository<Companies, Long>
