package com.example.blog.controller;


import com.alibaba.fastjson.JSON;
import com.example.blog.constant.BaseConstant;
import com.example.blog.entity.Article;
import com.example.blog.entity.Reply;
import com.example.blog.entity.User;
import com.example.blog.mapper.ArticleMapper;
import com.example.blog.mapper.ReplyMapper;
import com.example.blog.mapper.UserMapper;
import com.example.blog.utils.RedisUtil;
import com.example.blog.utils.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class ReplyController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    ReplyMapper replyMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    ArticleMapper articleMapper;

    @PostMapping("/insert")
    public WebResponse insertReply(@RequestParam("id") Integer userId ,
                            @RequestParam("articleId") Integer articleId,
                            @RequestParam("content") String content) throws Exception {

        User user = userMapper.getUserById(userId);
        Article article = articleMapper.getArticleById(articleId);
        if (user == null) {
            return new WebResponse(BaseConstant.FAILURE, "用户异常", null);
        }
        if (article == null) {
            return new WebResponse(BaseConstant.FAILURE, "文章异常", null);
        }
        Date timer = new Date(System.currentTimeMillis());
        Reply reply = new Reply(articleId,content,timer,userId);
        Integer isSuccess = replyMapper.insertReply(reply);
       this.saveRedis(BaseConstant.RedisArticleReply+articleId,reply);
        return new WebResponse(BaseConstant.SUCCESS, "评论成功", null);
    }

    @PostMapping("/list")
    public WebResponse getArticleList( @RequestParam("articleId") Integer articleId) {
        Object object =  redisUtil.get(BaseConstant.RedisArticleReply+articleId);
        return new WebResponse(BaseConstant.SUCCESS, "获取评论成功", object);
    }

    private void saveRedis(String key, Reply reply){
        String json = JSON.toJSONString(reply);
        redisUtil.set(key,json);
    }
}
