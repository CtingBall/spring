package com.eeee.pojo;

public class User {
    private String id;//ID
    private String username;//用户名
    private String password;//密码

    public User() {
    }

    // 构造方法注入
    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 验证方法
    public boolean validate(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // toString 方法

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
