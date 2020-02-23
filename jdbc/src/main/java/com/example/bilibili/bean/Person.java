package com.example.bilibili.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ConfigurationProperties: 告诉springBoot将本类中的所有属性和配置文件中的属性进行绑定；
 * @ConfigurationProperties 必须要成为sprongBoot的组件才可以生效 @Component
 * */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private List<Object> lists;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
