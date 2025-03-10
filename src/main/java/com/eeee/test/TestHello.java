package com.eeee.test;

import com.eeee.pojo.HelloSpring;
import com.eeee.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
//        HelloSpring helloSpring = new HelloSpring();
//        helloSpring.setUserName("李四");
//        helloSpring.show();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring eeee = (HelloSpring) applicationContext.getBean("eeee");
//        eeee.show();

//        User user = (User) applicationContext.getBean("user");
//        System.out.println(user.toString());
        User user = (User) applicationContext.getBean("user2");
        System.out.println(user);
    }
}
