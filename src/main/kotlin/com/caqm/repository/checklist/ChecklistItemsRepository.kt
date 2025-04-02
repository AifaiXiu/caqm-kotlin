package com.caqm.repository.checklist

import com.caqm.entity.checklist.ChecklistItems
import org.springframework.data.jpa.repository.JpaRepository

interface ChecklistItemsRepository : JpaRepository<ChecklistItems, Long>
