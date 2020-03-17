package com.example.blog.controller;

import com.example.blog.entity.User;
import com.example.blog.mapper.ArticleMapper;
import com.example.blog.mapper.UserMapper;
import com.example.blog.utils.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    DataFormat dataFormat;

    @GetMapping("/save")
    public HashMap save(@RequestParam("title") String account,@RequestParam("content") String content,@RequestParam("htmlContent") String htmlContent, @RequestParam("markdonwContent") String markdonwContent){
        Date timer = new Date(System.currentTimeMillis());
        HashMap map = new HashMap();
        Integer uid = articleMapper.saveArticle(account,content,htmlContent,markdonwContent,timer);
        if(uid != null){ map.put("id",uid);};
        return uid != null ? dataFormat.success(map): dataFormat.error(null) ;
    }

    @GetMapping("/list")
    public HashMap list(){
        List list  = articleMapper.getAllArticle();
        return list.size() > 0 ?  dataFormat.success(list): dataFormat.error("没有数据") ;
    }
}
