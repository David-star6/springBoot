package com.example.blog.mapper;

import com.example.blog.entity.User;


public interface UserMapper {
    public User getUserByAccount(String account);

    public User getUserByAccountPassword(String account, String password);

    public User getUserById(Integer id);

}
