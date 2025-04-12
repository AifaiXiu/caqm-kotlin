package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Airport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface AirportRepo : JpaRepository<Airport, Long>
