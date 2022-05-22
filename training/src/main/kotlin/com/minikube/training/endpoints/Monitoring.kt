package com.minikube.training.endpoints

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Monitoring {

    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "ok"
    }
}