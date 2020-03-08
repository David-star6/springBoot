package com.example.blog.controller;

import com.example.blog.entity.User;
import com.example.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public HashMap hello(@RequestParam("account") String account, @RequestParam("password") String password){
        HashMap map = new HashMap();
        if(userMapper.getUserByAccount(account) == null ){
            map.put("data","没有注册");
        }else {
            User user = userMapper.getUserByAccountPassword(account,password);
            map.put("data",user == null ? "密码不正确" : user);
        }
        return map;
    }

}
