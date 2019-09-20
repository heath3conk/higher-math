package com.conk.highermath

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @Autowired
    lateinit var calculationService: CalculationService
//
//    @GetMapping("/log")

}