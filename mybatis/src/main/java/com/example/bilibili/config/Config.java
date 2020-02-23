package com.example.bilibili.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 指明当前类是一个配置类，就是来替代之前spring配置文件
* 在配置文件中用<bean></bean>标签添加组件
* */
@Configuration
public class Config {

    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public String helloService(){
        System.out.print("给配置中添加组件类");
        return "HelloServercie";
    }
}
