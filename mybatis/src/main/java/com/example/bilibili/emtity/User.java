package com.example.bilibili.emtity;


import javax.persistence.*;

@Entity //告诉jpa这是一个实体类
@Table() //指定和那个数据表对应；如果省略，则默认类名
public class User {

    @Id //主健
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主健
    private Integer id;

    @Column(name = "name") //对应，默认省略是属性名
    private String name;

    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
