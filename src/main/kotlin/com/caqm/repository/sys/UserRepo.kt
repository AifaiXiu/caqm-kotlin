package com.caqm.repository.sys

import com.caqm.entity.sys.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface UserRepo : JpaRepository<User, Long>
