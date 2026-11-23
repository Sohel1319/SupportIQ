

package com.supportiq.controller;

import com.supportiq.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private HealthService healthService;

    public  HealthController (HealthService healthService){
        this.healthService=healthService;
    }

    @GetMapping("/api/health")
    public String health(){
        return healthService.getStatus();
    }
}
