package com.example.blog.entity;

public class User {
    private Integer id;
    private String role;
    private Integer roleType;
    private String userName;
    private String account;

    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
