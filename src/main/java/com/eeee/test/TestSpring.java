package com.eeee.test;

import com.eeee.itheima.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // 创建Spring应用上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取UserService Bean
        UserService userService = context.getBean("userService", UserService.class);

        // 测试登录功能
        boolean loginResult = userService.login("邱均航", "123456");

        // 输出结果
        if (loginResult) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}