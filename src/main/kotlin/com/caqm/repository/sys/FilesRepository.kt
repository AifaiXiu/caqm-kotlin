package com.caqm.repository.sys

import com.caqm.entity.sys.Files
import org.springframework.data.jpa.repository.JpaRepository

interface FilesRepository : JpaRepository<Files, Long>
