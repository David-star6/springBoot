package com.example.blog.entity;

import java.util.Date;

public class Reply {
    private Integer id;
    private Integer articleId;
    private String content;
    private Date createTimer;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTimer() {
        return createTimer;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateTimer(Date createTimer) {
        this.createTimer = createTimer;
    }
}
