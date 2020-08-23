package com.example.cache.mapper;

import com.example.cache.model.Employ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployMapper {

    @Select("SELECT * FROM employ Where id = #{id}")
    public Employ getEmployId(Integer id);
}
