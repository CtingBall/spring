package com.eeee.test;

import com.eeee.pojo.Bean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = applicationContext.getBean("Bean1",Bean1.class);
        System.out.println(bean1);
        Bean1 bean1_1 = applicationContext.getBean("Bean1",Bean1.class);
        System.out.println(bean1_1);
    }
}
