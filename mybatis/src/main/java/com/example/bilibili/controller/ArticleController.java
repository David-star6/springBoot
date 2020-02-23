package com.example.bilibili.controller;

import com.example.bilibili.bean.Article;
import com.example.bilibili.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("/art/{id}")
    public Article getArticle(@PathVariable("id") Integer id){
        return articleMapper.getArticleById(id);
    }

    @GetMapping("/art")
    public Article insertArt(@RequestParam(value = "title") String title, @RequestParam(value = "content") String content){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        articleMapper.insertArticle(article);
        return article;
    }

    @GetMapping("/art/delete/{id}")
    public int deleteArticle(@PathVariable("id") Integer id){
        return articleMapper.deleteArticleById(id);
    }

    @GetMapping("/art/title/{title}")
    public Article getArticleWithTitle(@PathVariable("title") String title){
        return articleMapper.getArticleByTitle(title);
    }


}
