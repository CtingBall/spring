package com.eeee.pojo;

public class UserSetter {
    private String id;
    private String username;
    private String paw;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    @Override
    public String toString() {
        return "UserSetter{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", paw='" + paw + '\'' +
                '}';
    }
}
