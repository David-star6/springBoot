package com.example.blog.controller;

import com.example.blog.constant.BaseConstant;
import com.example.blog.mapper.ArticleMapper;
import com.example.blog.utils.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("/save")
    public WebResponse save(@RequestParam("title") String account,
                            @RequestParam("content") String content,
                            @RequestParam("htmlContent") String htmlContent,
                            @RequestParam("markdonwContent") String markdonwContent) throws Exception {
        Date timer = new Date(System.currentTimeMillis());
        HashMap map = new HashMap();
        Integer uid = articleMapper.saveArticle(account, content, htmlContent, markdonwContent, timer);
        if (uid != null) {
            map.put("id", uid);
        }
        ;
        return new WebResponse(BaseConstant.SUCCESS, "操作成功", map);
    }

    @GetMapping("/list")
    public WebResponse list() {
        List list = articleMapper.getAllArticle();
        return list.size() > 0 ? new WebResponse(BaseConstant.SUCCESS, "操作成功", list) : new WebResponse(BaseConstant.SUCCESS, "没有数据", list);
    }

    @GetMapping("/delete")
    public WebResponse delete(@RequestParam("id") String id) throws Exception {
        articleMapper.deleteById(id);
        return new WebResponse(BaseConstant.SUCCESS, "操作成功", null);

    }

    @GetMapping("/update")
    public WebResponse update(@RequestParam("id") String id,
                              @RequestParam("title") String account,
                              @RequestParam("content") String content,
                              @RequestParam("htmlContent") String htmlContent,
                              @RequestParam("markdonwContent") String markdonwContent) throws Exception {
        Date timer = new Date(System.currentTimeMillis());
        articleMapper.updateById(account, content, htmlContent, markdonwContent, timer, id);
        return new WebResponse(BaseConstant.SUCCESS, "操作成功", null);
    }

}
