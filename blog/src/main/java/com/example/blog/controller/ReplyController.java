package com.example.blog.controller;


import com.example.blog.constant.BaseConstant;
import com.example.blog.entity.Article;
import com.example.blog.entity.User;
import com.example.blog.mapper.ArticleMapper;
import com.example.blog.mapper.ReplyMapper;
import com.example.blog.mapper.UserMapper;
import com.example.blog.utils.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class ReplyController {

    @Autowired
    ReplyMapper replyMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    ArticleMapper articleMapper;

    @PostMapping("/insert")
    public WebResponse insertReply(@RequestParam("id") Integer id ,
                            @RequestParam("articleId") Integer articleId,
                            @RequestParam("content") String content) throws Exception {

        User user = userMapper.getUserById(id);
        Article article = articleMapper.getArticleById(articleId);
        if (user == null) {
            return new WebResponse(BaseConstant.FAILURE, "用户异常", null);
        }
        if (article == null) {
            return new WebResponse(BaseConstant.FAILURE, "文章异常", null);
        }

        Date timer = new Date(System.currentTimeMillis());
        replyMapper.insertReply(articleId, content, id, timer);
        return new WebResponse(BaseConstant.SUCCESS, "评论成功", null);

    }

}
