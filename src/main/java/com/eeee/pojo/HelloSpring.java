package com.eeee.pojo;

public class HelloSpring {
    private String userName ;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void show(){
        System.out.println(userName + "欢迎来到spring的世界!");
    }
}
