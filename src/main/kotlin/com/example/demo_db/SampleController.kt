package com.example.demo_db

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class SampleController {
    @GetMapping("/")
    fun index () :String {
        return "hello!"
    }
}