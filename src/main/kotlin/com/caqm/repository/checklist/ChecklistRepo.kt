package com.caqm.repository.checklist

import com.caqm.entity.checklist.Checklist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface ChecklistRepo : JpaRepository<Checklist, Long>
