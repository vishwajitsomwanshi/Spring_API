package com.jsipders.securityapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    @GetMapping("/")
    public String display(){
        return "<h1> welcome to spring security</h1>";
    }
    @GetMapping("/student")
    public String show(){
        return "<h1> welcome to Student Application</h1>";
    }
    public String info(){
        return "<h1> welcome to Admin Application</h1>";
    }
}
