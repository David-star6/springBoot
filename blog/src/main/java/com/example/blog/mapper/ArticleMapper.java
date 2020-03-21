package com.example.blog.mapper;

import com.example.blog.entity.Article;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public interface ArticleMapper {
    Integer saveArticle(String title, String content, String htmlContent, String markDownContent, Date updateTimer);

    List getAllArticle();

    void deleteById(String id);

    Article updateById(String title, String content, String htmlContent, String markDownContent, Date updateTimer, String id);

}
