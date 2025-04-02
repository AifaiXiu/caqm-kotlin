package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Airports
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface AirportsRepository :
    JpaRepository<Airports, Long>,
    JpaSpecificationExecutor<Airports>
