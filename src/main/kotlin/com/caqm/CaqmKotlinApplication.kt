package com.caqm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = arrayOf("com.caqm.repository"))
@EntityScan(basePackages = arrayOf("com.caqm.entity"))
class CaqmKotlinApplication

fun main(args: Array<String>) {
    runApplication<CaqmKotlinApplication>(*args)
}
