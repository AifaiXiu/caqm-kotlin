package com.caqm.controller.dataitem

import com.caqm.repository.dataitem.AirportsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// @Api(description = "机场接口")
@RestController
class AirportsController {
    @Autowired
    lateinit var airportsRepository: AirportsRepository

//    @ApiOperation("测试用的")
    @GetMapping("/test")
    fun testAirports(): String {
        val byId = airportsRepository.getById(1)
        println("打印输出了结果")
        return byId.toString()
    }
}
