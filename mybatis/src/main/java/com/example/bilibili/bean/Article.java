package com.example.bilibili.bean;

import java.util.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date updateTimer;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUpdateTimer(Date updateTimer) {
        this.updateTimer = updateTimer;
    }

    public String getContent() {
        return content;
    }

    public Date getUpdateTimer() {
        return updateTimer;
    }
}
