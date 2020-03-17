package com.example.blog.controller;

import com.example.blog.entity.User;
import com.example.blog.mapper.UserMapper;
import com.example.blog.utils.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    DataFormat dataFormat;

    @PostMapping("/login")
    public HashMap hello(@RequestParam("account") String account, @RequestParam("password") String password){
        if(userMapper.getUserByAccount(account) == null ){
          return  dataFormat.error( "没有注册");
        }else {
            User user = userMapper.getUserByAccountPassword(account,password);
            return user == null ? dataFormat.error( "密码不正确") :dataFormat.success(user);
        }
    }

}
