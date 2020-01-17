package com.example.bilibili.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EmployeeController {

    @GetMapping("/emps")
    public String emps(){
        return "emp/Page_1";
    }

    @GetMapping("/list")
    public String list(Map<String, Object> map){
        Map user = new HashMap();
        user.put("name","lius");
        user.put("birthday", new Date());
        user.put("price","300");
        ArrayList list = new ArrayList();
        list.add(user);
        map.put("userList",list);
        return "emp/List";
    }



}
