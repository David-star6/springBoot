package com.example.bilibili.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/emps")
    public String list(){
        return "emp/Page_1";
    }

}
