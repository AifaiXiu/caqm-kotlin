package com.caqm.repository.sys

import com.caqm.entity.sys.File
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface FileRepo : JpaRepository<File, Long>
