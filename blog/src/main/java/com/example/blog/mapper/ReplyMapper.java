package com.example.blog.mapper;

import java.util.Date;

public interface ReplyMapper {

    Integer insertReply(Integer articleId, String content, Integer userId, Date createTimer);

}
