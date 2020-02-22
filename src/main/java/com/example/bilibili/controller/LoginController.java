package com.example.bilibili.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    JdbcTemplate jdbcTemplate;

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

    @ResponseBody
    @GetMapping("/article")
    public Map<String, Object> map(){
      List<Map<String,Object>> list = jdbcTemplate.queryForList("select * FROM article");
      return list.get(0);
    }




}
