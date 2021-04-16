package com.rds_project_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @RequestMapping("/")
    public String index(){
        return "Hello";
    }

}
