package com.eeee.itheima.Service.impl;

import com.eeee.itheima.Dao.UserDao;
import com.eeee.itheima.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
