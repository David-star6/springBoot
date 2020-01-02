package com.example.bilibili.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        Locale msg3 = Locale.getDefault();
        System.out.print(msg3);
//        getMessage(code,args, defaultMessage,locale);
        return "msg3";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        map.put("users", Arrays.asList("li", "li", "liu"));
        return "success";
    }

}
