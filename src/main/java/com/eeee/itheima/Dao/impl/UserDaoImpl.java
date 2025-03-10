package com.eeee.itheima.Dao.impl;

import com.eeee.itheima.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("邱均航") && password.equals("123456")){
            return true;
        }
        return false;
    }
}
