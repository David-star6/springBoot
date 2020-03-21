package com.example.blog.controller;

import com.example.blog.constant.BaseConstant;
import com.example.blog.entity.User;
import com.example.blog.mapper.UserMapper;
import com.example.blog.utils.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public WebResponse hello(@RequestParam("account") String account, @RequestParam("password") String password) {
        if (userMapper.getUserByAccount(account) == null) {
            return new WebResponse(BaseConstant.FAILURE, "没有注册", null);
        } else {
            User user = userMapper.getUserByAccountPassword(account, password);
            return user == null ? new WebResponse(BaseConstant.FAILURE, "密码不正确", null) : new WebResponse(BaseConstant.FAILURE, "登陆成功", user);
        }
    }



}
