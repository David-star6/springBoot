package com.example.blog.mapper;

import com.example.blog.entity.Article;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public interface ArticleMapper {
    public Integer saveArticle(String title, String content, String htmlContent, String markDownContent, Date updateTimer);
    public List getAllArticle();
}
