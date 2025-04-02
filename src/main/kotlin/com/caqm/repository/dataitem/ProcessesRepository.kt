package com.caqm.repository.dataitem

import com.caqm.entity.dataitem.Processes
import org.springframework.data.jpa.repository.JpaRepository

interface ProcessesRepository : JpaRepository<Processes, Long>
