package com.example.blog.entity;

import java.sql.Date;
import java.util.HashMap;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private String htmlContent;
    private String markdownContent;
    private Date updateTimer;

    public Date getUpdateTimer() {
        return updateTimer;
    }

    public void setUpdateTimer(Date updateTimer) {
        this.updateTimer = updateTimer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getMarkdownContent() {
        return markdownContent;
    }

    public void setMarkdownContent(String markdownContent) {
        this.markdownContent = markdownContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
