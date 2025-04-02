package com.caqm.repository.sys

import com.caqm.entity.sys.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
