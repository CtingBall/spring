package com.eeee.test;

import com.eeee.itheima.Service.impl.UserServiceImpl;
import com.eeee.pojo.User3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser3 {
    public static void main(String[] args) {
        // 创建Spring应用上下文，加载applicationContextUser.xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextUser.xml");

        // 获取User3 Bean
        User3 user3 = context.getBean("user3", User3.class);

        // 设置用户信息
        user3.setId(1);
        user3.setName("邱均航");
        user3.setPwd("123456");
        // 模拟登录验证
//        if (login(user3)) {
//            System.out.println("登录成功！");
//        } else {
//            System.out.println("登录失败！");
//        }
//----------------------------------------分界线-----------------------------------------------------
        UserServiceImpl userService = context.getBean("UserService",UserServiceImpl.class);
        if (userService.login("邱均航","123456")){
            System.out.println("通过注解的方式登陆成功");
        }else {
            System.out.println("通过注解的方式登陆失败");
        }

    }
    // 模拟登录验证方法
    public static boolean login(User3 user) {
        // 这里假设正确的用户名和密码是 "邱均航" 和 "123456"
        return "邱均航".equals(user.getName()) && "123456".equals(user.getPwd());
    }
}