package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Airports
import org.springframework.data.jpa.repository.JpaRepository

interface AirportsRepository : JpaRepository<Airports, Long>
