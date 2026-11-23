package com.supportiq.service;


import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public  String getStatus(){
        return "SupportIQ backend is running!";
    }
}
