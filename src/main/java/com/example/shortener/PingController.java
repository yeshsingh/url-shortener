package com.example.shortener;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this class handles web requests and whatever its methods return is the response body
public class PingController{
    @GetMapping("/ping") 
    public String ping(){
        return "pong";
    } 
}