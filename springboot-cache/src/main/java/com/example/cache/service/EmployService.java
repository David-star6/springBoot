package com.example.cache.service;

import com.example.cache.mapper.EmployMapper;
import com.example.cache.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

    @Autowired
    EmployMapper employMapper;

    /*
    * condition 指定条件，
    * unless 否定缓存，
    * sync，是否使用异步模式
    * cacheManager 指定缓存管理器
    * */

    @Cacheable(cacheNames = "employ", key = "#id",condition = "#id>0")
    public Employ getEmploy(Integer id) {
        return employMapper.getEmployId(id);
    }
}
