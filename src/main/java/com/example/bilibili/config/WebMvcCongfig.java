package com.example.bilibili.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//使用WebMvcConfigurerAdapter可以扩展
@Configuration
public class WebMvcCongfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/text").setViewName("success");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }

//    @Bean //将组件注册在容器
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
//        WebMvcConfigurerAdapter adpater = new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/text").setViewName("success");
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index").setViewName("index");
//            }
//        };
//        return adpater;
//    }

    @Bean
    public LocaleResolver localeResolver(){
        return new com.example.bilibili.component.LocaleResolver();
    }

}
