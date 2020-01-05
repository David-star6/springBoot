package com.example.bilibili.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    //    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username)) {
           //登陆成功为了防止表单冲突提交，可以重定向到主页
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        }
        map.put("msg","error");
        return "index";
    }

}
